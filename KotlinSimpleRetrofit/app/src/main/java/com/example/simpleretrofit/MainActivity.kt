package com.example.simpleretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.simpleretrofit.data.BookResult
import com.example.simpleretrofit.network.BooksRetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var btnGetBooks: Button
    private lateinit var tvBooks: TextView

    companion object {
        private val TAG = "MainActivityLog"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
    }

    private fun setupViews() {
        btnGetBooks = findViewById<Button>(R.id.btnGetBooks).apply {
            setOnClickListener { getBooks() }
        }
        tvBooks = findViewById(R.id.tvBooks)
    }

    private fun getBooks() {
        val booksInterface = BooksRetrofitInstance.booksInterface
            .getBooks()
        booksInterface.enqueue(object : Callback<BookResult> {
            override fun onResponse(call: Call<BookResult>, response: Response<BookResult>) {
                Log.d(TAG, "\n\nRESPONSE: ${response}\n\n")

                val result = response.body()
                if (result != null) {
                    tvBooks.text = "${ result.results }"
                }
            }

            override fun onFailure(call: Call<BookResult>, t: Throwable) {
                val message = "FAILURE:\n${t.message}"
                Log.d(TAG, "\n\n${message}\n\n")
                tvBooks.text = message
            }
        })
    }
}
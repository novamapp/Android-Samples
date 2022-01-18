package com.example.simpleretrofit.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BooksRetrofitInstance {
    private val retrofit: Retrofit
    private const val BASE_URL:String  ="https://gutendex.com/"

    val booksInterface: BooksInterface

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        booksInterface = retrofit.create(BooksInterface::class.java)
    }
}
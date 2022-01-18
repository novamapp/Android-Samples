package com.example.simpleretrofit.network

import com.example.simpleretrofit.data.BookResult
import retrofit2.Call
import retrofit2.http.GET

interface BooksInterface {

    @GET("books/")
    fun getBooks() : Call<BookResult>

}
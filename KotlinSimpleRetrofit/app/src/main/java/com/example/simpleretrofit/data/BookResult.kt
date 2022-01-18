package com.example.simpleretrofit.data

data class BookResult(val count: Int,
                      val next: String?,
                      val previous: String?,
                      val results: List<Book>
)
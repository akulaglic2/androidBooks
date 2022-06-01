package com.example.booksapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface BooksService {

    @GET("https://www.googleapis.com/books/v1/volumes")
    fun getBooks(
        @Query("q") q: String,
        @Query("startIndex") page: Int,
        @Query("maxResults") perPage: Int
    ): BooksResponse
}
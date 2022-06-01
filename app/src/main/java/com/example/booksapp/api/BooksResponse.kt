package com.example.booksapp.api

import com.example.booksapp.Book

data class BooksResponse(val items: List<Book> = emptyList())
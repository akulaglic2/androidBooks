package com.example.booksapp

data class Book(val volumeInfo: VolumeInfo) {

    data class VolumeInfo(
        val title: String,
        val authors: List<String>,
        val imageLinks: ImageLinks
    ) {

        data class ImageLinks(val thumbnail: String)
    }

    fun getTitle(): String {
        return volumeInfo.title
    }

    fun getAuthors(): String {
        return volumeInfo.authors.joinToString()
    }

    fun getImageLink(): String {
        return volumeInfo.imageLinks.thumbnail
    }
}
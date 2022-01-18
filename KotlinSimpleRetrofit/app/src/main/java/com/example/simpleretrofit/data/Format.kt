package com.example.simpleretrofit.data

import com.google.gson.annotations.SerializedName

data class Format(
    @SerializedName("text/plain") val text: String?,
    @SerializedName("image/jpeg") val jpeg: String?,
    @SerializedName("text/html") val html: String?
)

/*
*
  "formats": {
    "application/epub+zip": "https://www.gutenberg.org/ebooks/46.epub.images",
    "application/rdf+xml": "https://www.gutenberg.org/ebooks/46.rdf",
    "application/x-mobipocket-ebook": "https://www.gutenberg.org/ebooks/46.kindle.images",
    "text/plain; charset=us-ascii": "https://www.gutenberg.org/files/46/46-0.txt",
    "text/plain": "https://www.gutenberg.org/ebooks/46.txt.utf-8",
    "image/jpeg": "https://www.gutenberg.org/cache/epub/46/pg46.cover.small.jpg",
    "text/html": "https://www.gutenberg.org/files/46/46-h/46-h.htm",
    "application/zip": "https://www.gutenberg.org/files/46/46-0.zip"
  }
* */
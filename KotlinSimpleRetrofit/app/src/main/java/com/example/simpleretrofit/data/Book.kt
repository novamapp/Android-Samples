package com.example.simpleretrofit.data

import com.google.gson.annotations.SerializedName

data class Book(val id: Int,
                val title: String,
                val subjects: List<String>,
                val authors: List<Person>,
                val translators: List<Person>,
                val bookshelves: List<String>,
                val languages: List<String>,
                val copyright: Boolean?,
                @SerializedName("media_type") val mediaType: String,
                val formats: Format,
                @SerializedName("download_count") val downloadCount: Int
) {
    override fun toString(): String {
        var str = "\n"

        str += "\nTitle: ${title}"
        str += "\nSubjects:"
        subjects.forEach{ str+="\n\t\t${it} " }
        str += "\nAuthors:"
        authors.forEach { str+="\n\t\t${it.name} " }
        str += "\nLanguages: "
        languages.forEach { str+="${it} " }
        str += "\nFormats: ${formats.jpeg}"
        str += "\n"

        return str
    }
}

/*
* {
      "id": 46,
      "title": "A Christmas Carol in Prose; Being a Ghost Story of Christmas",
      "authors": [
        {
          "name": "Dickens, Charles",
          "birth_year": 1812,
          "death_year": 1870
        }
      ],
      "translators": [],
      "subjects": [
        "Christmas stories",
        "Ghost stories",
        "London (England) -- Fiction",
        "Misers -- Fiction",
        "Poor families -- Fiction",
        "Scrooge, Ebenezer (Fictitious character) -- Fiction",
        "Sick children -- Fiction"
      ],
      "bookshelves": [
        "Children's Literature",
        "Christmas"
      ],
      "languages": [
        "en"
      ],
      "copyright": false,
      "media_type": "Text",
      "formats": {
        "application/epub+zip": "https://www.gutenberg.org/ebooks/46.epub.images",
        "application/rdf+xml": "https://www.gutenberg.org/ebooks/46.rdf",
        "application/x-mobipocket-ebook": "https://www.gutenberg.org/ebooks/46.kindle.images",
        "text/plain; charset=us-ascii": "https://www.gutenberg.org/files/46/46-0.txt",
        "text/plain": "https://www.gutenberg.org/ebooks/46.txt.utf-8",
        "image/jpeg": "https://www.gutenberg.org/cache/epub/46/pg46.cover.small.jpg",
        "text/html": "https://www.gutenberg.org/files/46/46-h/46-h.htm",
        "application/zip": "https://www.gutenberg.org/files/46/46-0.zip"
      },
      "download_count": 68486
    }
* */
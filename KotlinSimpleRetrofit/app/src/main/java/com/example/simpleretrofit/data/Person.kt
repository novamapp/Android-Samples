package com.example.simpleretrofit.data

import com.google.gson.annotations.SerializedName

data class Person (@SerializedName("birth_year") val birthYear: Int?,
                   @SerializedName("death_year") val deathYear: Int?,
                   val name: String
)

/*
* "authors": [
        {
          "name": "Dickens, Charles",
          "birth_year": 1812,
          "death_year": 1870
        }
      ]
* */
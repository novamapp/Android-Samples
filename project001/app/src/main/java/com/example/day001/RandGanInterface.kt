package com.example.day001

interface RandGenInterface {
    fun getRandomNum() : Int {
        return (0..100).random()
    }
}
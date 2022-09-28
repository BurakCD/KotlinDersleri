package com.ethadien.kotlinlanguage.standart_programlama

fun main() {

    val yas = 18
    val isim = "Kemal"

    if (yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    val gun = 3

    when(gun){
        1 -> println("pazartesi")
        2 -> println("salı")
        3 -> println("çarşamba")
        4 -> println("perşembe")
        5 -> println("cuma")
        6 -> println("cumartesi")
        7 -> println("pazar")
        else -> println("hata")
    }

}
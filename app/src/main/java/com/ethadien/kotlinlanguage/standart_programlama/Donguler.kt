package com.ethadien.kotlinlanguage.standart_programlama

fun main() {

    for (i in 1..3){// for each, swift: 1...3(3 nokta koyuluyor)
        println("döngü 1: $i")
    }

    for (i in 10..20 step 5){
        println("Döngü 2: $i")
    }

    for (i in 20 downTo 10 step 5){
        println("Döngü 3: $i")
    }


    var sayac = 1

    while (sayac < 6){
        println("Döngü 4: $sayac")
        sayac++
    }
    for (i in 1..5){
        if (i == 3){
            break
        }
        println("Döngü 5: $i")
    }

    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Döngü 6: $i")
    }

}
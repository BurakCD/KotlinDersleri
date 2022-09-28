package com.ethadien.kotlinlanguage.nesne_tabanli

fun main() {

    // Nesne oluşturma

    var bmw = Car("white", 0, false)

    val tofas = Car("mavi", 0, false)

    // Okuma işlemi
    /*println("BMW:" +
            "\nRengi: ${bmw.color}," +
            "\nHızı: ${bmw.speed}," +
            "\nÇalışıyor mu: ${bmw.isWorking}\n")

    println("Tofaş:" +
            "\nRengi: ${tofas.color}," +
            "\nhızı: ${tofas.speed}," +
            "\nÇalışıyor mu: ${tofas.isWorking}\n")*/

    bmw.getInfo()
    bmw.run()
    bmw.accelerate()
    bmw.getInfo()

    tofas.getInfo()
    tofas.run()
    tofas.accelerate()
    tofas.getInfo()


}
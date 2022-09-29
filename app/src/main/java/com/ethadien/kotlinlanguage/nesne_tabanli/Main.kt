package com.ethadien.kotlinlanguage.nesne_tabanli

import com.ethadien.kotlinlanguage.KonserveBoyut

fun main() {

    // Nesne oluşturma

    //var bmw = Car("white", 0, false)

    //val tofas = Car("mavi", 0, false)

    // Okuma işlemi
    /*println("BMW:" +
            "\nRengi: ${bmw.color}," +
            "\nHızı: ${bmw.speed}," +
            "\nÇalışıyor mu: ${bmw.isWorking}\n")

    println("Tofaş:" +
            "\nRengi: ${tofas.color}," +
            "\nhızı: ${tofas.speed}," +
            "\nÇalışıyor mu: ${tofas.isWorking}\n")*/

    /*bmw.getInfo()
    bmw.run()
    bmw.accelerate(10)
    bmw.slowDown(8)
    bmw.getInfo()

    tofas.getInfo()
    tofas.run()
    tofas.accelerate(10)
    tofas.slowDown(8)
    tofas.getInfo()*/


    // Fonksiyonlar
    val funcs = Functions()
    funcs.hail1()

    val hi = funcs.hail2()
    println(hi)

    funcs.hail3("Mustafa")

    val result = funcs.sum(100, 6563)
    println(result)

    val result2 = funcs.sum(100, 500,400)
    println(result2)

    funcs.sum(1, 2, "Burak")

    val number = 5 sum 2
    println(number)

    // Static kullanımı

    /*val a = ASinifi() //Tek nesne
    println(a.x)
    a.metod()*/
    //                              ASinifi() : bu sanal bir nesne(virtual object)
    //println(ASinifi().x) //Birinci sanal nesne
    //ASinifi().metod() // ikinci sanal nesne

    //println(ASinifi.x)
    //ASinifi.metod()
    // çok fazla erişim yapılcağı zaman static yapılır

    // Enumeration

    ucretHesapla(10, KonserveBoyut.KUCUK)


}

fun ucretHesapla(adet : Int, boyut:KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Ücret: ${30 * adet} ₺")
        KonserveBoyut.ORTA -> println("Ücret: ${80 * adet} ₺")
        KonserveBoyut.BUYUK -> println("Ücret: ${140 * adet} ₺")
    }
}

/**
 * extension fonksiyonlar |
 * this : bulunduğumuz sınıf  swift: self |
 * infix : fonksiyonun bir kelime gibi araya yazılabilmesine olanak sağlar
 */
infix fun Int.sum(num:Int):Int{
    return this + num
}
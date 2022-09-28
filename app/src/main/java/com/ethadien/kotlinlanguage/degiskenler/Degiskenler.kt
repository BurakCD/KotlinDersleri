package com.ethadien.kotlinlanguage.degiskenler

fun main() {
    println("Wellcome to the Variable World")

    var ogrenciAdi = "Mustafa"
    var ogrenciYas = 23
    var ogrenciBoy = 1.72
    var ogrenciBasHarf = "M"
    var ogrenciDevam = true

    /*println(" Öğrenci Adı: $ogrenciAdi \n Öğrenci yaşı: $ogrenciYas " +
            "\n Öğrenci boyu: $ogrenciBoy \n Öğrenci baş harfi: $ogrenciBasHarf" +
            " \n Öğrenci devam durumu: $ogrenciDevam")*/

    var urun_id : Int = 4175
    var urun_adi : String = "Saat"
    var urun_adet : Int = 300
    var urun_fiyat : Double = 49999.9
    var urun_tedarikci : String = "Hublot"

    /*println(" Ürün adı: $urun_adi \n Ürün tedarikçi: $urun_tedarikci " +
            "\n Ürün ID: $urun_id \n Ürün adedi: $urun_adet \n Ürün fiyatı: $urun_fiyat₺")*/

    var a = 10
    var b = 20

    //println("$a x $b = ${a*b}")

    // Sabitler - Constant - final

    val c = 1000

    // Tür dönüşümleri
    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    //println("sonuc1: $sonuc1 \n sonuc2: $sonuc2")


    // Sayıdan metne dönüş
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    //println("sonuc3: $sonuc3 \n sonuc4: $sonuc4")

    // metinden sayıya dönüş
    val metin = "67.54"
    val metin2 = "23.5."

    val sonuc5 = metin.toDouble()
    val sonuc6 = metin2.toDoubleOrNull()
    println("sonuc5: $sonuc5 \n sonuc6: $sonuc6")

    sonuc6?.let {
        println(sonuc5) }


}
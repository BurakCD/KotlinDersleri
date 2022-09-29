package com.ethadien.kotlinlanguage.nesne_tabanli

fun main() {
    var message = "Achtung"

    // null tanımlama
    var str : String? = null

    str = "Hallo"

    // Yöntem 1 -> ? : str null ise hata oluşmaz, null değilse çalışır
    println("Yöntem 1: ${str?.trim()}")

    // Yöntem 2 -> !! : sorumluluk bizde, emin olduğumuz kodlamada kullanabiliriz, hata ihtimali var
    //println("Yöntem 2: ${str!!.trim()}")

    // Yöntem 3 -> if null control :
    if (str != null) {
        println("Yöntem 3: ${str.trim()}")
    }else{
        println("str null")
    }

    // Yöntem 4 -> let kontrol : if gibidir ancak daha kısadır
    str?.let {
        println("Yöntem 4: ${str.trim()}")
        //println("Yöntem 3: ${it.trim()}")
    }

}
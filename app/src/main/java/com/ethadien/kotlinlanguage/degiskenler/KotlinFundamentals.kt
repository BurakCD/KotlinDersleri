package com.ethadien.kotlinlanguage

import java.util.*
import javax.crypto.KeyAgreementSpi
import kotlin.random.Random


fun main(){

    val itemCount = 2
    var letter ='c'
    var tooShort:Short = 1
    var tooLong = 673898654377547
    val pi = 3.14
    var hail : String? = "Merhaba"
    var bool = true
    var repeatItem = itemCount+2
    val acitRate:Float = 1.6f
    var deepRate : Int ? = null // nullable

    deepRate = 10 // deepRate 10 olabilir
    var hello : String = hail!!


    println(itemCount.javaClass.name)
    println(pi.javaClass.name)
    println(hail.javaClass.name)
    println(bool.javaClass.name)
    println(tooLong.javaClass.name)
    println(letter.javaClass.name)
    println(tooShort.javaClass.name)
    println(acitRate.javaClass.name)
    println(deepRate!!.javaClass.name)


    //replace()
    //var value = powerOf(10,2)
    //println(value)

    //isFitInRange(500,0,100)
    //whileLoops()
    //ifConditions()
    //WhenSwitchCase()
    //KacisYapilari()
    //AtamaOp()
    //TurDonus()
    //KonsolGirdisi()
    //HataAyiklama()

    /*var bmw = vehicle(10.0,4,250.0,2,"White")
    bmw.fireEngine()
    bmw.accelerate()
    bmw.pressBreak()
    bmw.snoozeEngine()
    bmw.shutDownEngine()*/

}

fun powerOf(number:Int, exponent: Int):Int{

    var result =0
    for (i in 0..exponent step 1){
        result = number*number
    }
    return result
}

fun replace(){
    var a = 1
    val s1 = "a is $a"
    println(s1)

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

fun isFitInRange(number:Int, rangeLow:Int, rangeHigh:Int){
    if (number in rangeLow..rangeHigh) println("number fits in range")
    else println("number not fits in range")
}

fun forLoops(){
    for (c in 1..5){

    }
    for (c in 1 until 5){

    }
    for (i in 0..8 step 1){
        //result = number*number
    }
    for (b in 20 downTo 10 step 2){

    }
}

fun whileLoops(){
    var sayac = 0
    var range = 0
    var rangeLow =0
    var rangeHigh = 10

    while (sayac <10){
        sayac ++
        println(sayac)
        //sayac += 1
        //sayac = sayac +1
    }

    while (range in rangeLow until rangeHigh){
        range ++
        println("Döngü 2: $range")
    }
}

fun ifConditions(){
    var i =1
    if (i == 1){

    }

    if (1 in 0..10) println("number fits in range")
    else println("number not fits in range")

    if (i < 10 || i ==1) println("correct")
    else if (i ==4) println("i = 4")
    else print("wrong")

    if (i>10 && i!=1) println("Helele")

}

fun WhenSwitchCase(){
    var value = Random(1000).nextInt()

    val result: String = when{
        value > 100 -> "100 den büyük"
        else -> "100 den küçük"
    }
    println(result)

    when (value){
        1 -> println("hehe")
        2 -> println("haha")
        else -> println("hoho")
    }

}

fun KacisYapilari(){
    var yazi = "Mehmet \"selam\" dedi \n \\sekme\\ \t \n "
    println(yazi)
}

fun AtamaOp(){
    // toplama += çıkarma -= bölme /= çarpma *=
    var v = 12.7
    var v0 = 23.56
    var t = 3.5
    var a = 10.0

    var x1 = ((v+v0)/2)*t
    println(x1)

    var x2 = ((v0*t)+(a*t*t)/2)
    println(x2)
}

fun TurDonus(){

    var x = -1
    var t = 3.5
    var k = "256"
    var h = "4"

    var oo = t.toString()
    var pp = t.toFloat()
    var ll = t.toLong()
    var mm = t.toInt()

    println("oo: $oo \npp: $pp \nll: $ll \nmm: $mm")

    var yy = x.toDouble()
    var nn = x.toShort()
    var ii = x.toChar()
    var qq = x.toFloat()
    var rr = x.toByte()

    println("yy: $yy \nnn: $nn \nii: $ii \nqq: $qq \nrr: $rr")

    var uu = k.toInt()
    var tt = k.toDouble()
    var cc = k.toFloat()
    var gg = k.toBigDecimal()
    var ee = k.toCharArray()
    var xx = h.toByte()

    println("uu: $uu \ntt: $tt \ncc: $cc \ngg: $gg \nee: $ee \nxx: $xx")
}

fun KonsolGirdisi(){
    println("Adınızı girin:")
    val girdi = Scanner(System.`in`)

    val ad = girdi.next()

    println("Adınız: $ad")
    //sadece tek kelime, boşluktan sonrası yazılmaz
}

fun HataAyiklama() {

    println("Yaşınızı giriniz")

    val girdi = Scanner(System.`in`)
    var yas :Int? = 0

    try {
        yas = girdi.next().toInt()
    }catch (e:Exception){
        println("Yaşınızda harf bulunamaz")
    }

    println("Yaşınız: $yas")
}

fun KarsilastirmaOp() {


}

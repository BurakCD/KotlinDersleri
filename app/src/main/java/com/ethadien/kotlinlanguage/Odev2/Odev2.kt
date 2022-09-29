package com.ethadien.kotlinlanguage.Odev2

class Odev2 {

    fun CelciusToFahrenheit(t:Double):Double{
        return (t*1.8)+32
    }

    fun RectanglePerimeter(shortBorder:Int, longBorder:Int){
        if (longBorder < shortBorder){
            println("Uzun kenar ve kısa kenar yanlış girildi!")
        }
        if (longBorder == shortBorder) {
            println("Uzun kenar ve kısa kenar eşit olamaz!")
        }
        if (longBorder == 0 || shortBorder == 0) {
            println("Kenarlar 0 olamaz!")
        }
        println("Dikdörtgenin çevresi: ${(shortBorder + longBorder) * 2}")
    }

    fun Factorial(number:Int):Int{
        if (number == 0){
            return 1;
        }
        return number * Factorial(number-1)
    }

    fun LetterCount(word:String, letter:Char){
        val text = word.lowercase()
        var letterCounter = 0
        for (element in text){
            if (letter == element.toChar()){
                letterCounter++
            }
        }
        println("$word kelimesinin içinde $letterCounter adet $letter harfi vardır.")
    }

    fun InternalAngleSum(cornerCount:Int):Int{
        if (cornerCount <= 1){
            return 0
        }
        return (cornerCount-2)*180
    }

    fun Salary(days:Int):Int {
        val workTime = days * 8
        var salary = 0
        val timelyWorkCost = 10
        val timelyShiftCost = 20

        if (workTime > 160){
            val shiftTime = workTime - 160
            salary = (160 * timelyWorkCost) + (shiftTime * timelyShiftCost)
        }
        if (workTime < 160){
            salary = workTime * 10
        }
        if (workTime <=0){
            return 0
        }
        return salary
    }

    fun Quota(spendedGB:Int):Int{
        var bill = 0
        val exceedCostByGB = 4
        val standartCost = 100

        if (spendedGB > 50){
            val exceedOfQuota = spendedGB-50
            bill = standartCost + (exceedOfQuota * exceedCostByGB)
        }
        if (spendedGB <= 50){
            bill = standartCost
        }
        if (spendedGB == 0){
            return 0
        }
        return bill
    }

}
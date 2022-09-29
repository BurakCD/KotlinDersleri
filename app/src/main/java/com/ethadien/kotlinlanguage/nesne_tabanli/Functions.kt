package com.ethadien.kotlinlanguage.nesne_tabanli

class Functions {
    //void : sadece işlem yapan fonksiyon
    fun hail1(){
        val result = "Hallo Emre"
        println(result)
    }

    //return : fonksiyonun çağrıldığı yere veri atar
    fun hail2() : String{
        val result = "Hallo Kemal"
        return result
    }

    // parameters : parametre alan fonksiyonlar
    fun hail3(name:String){
        val result = "Hallo $name"
        println(result)
    }

    fun sum(num1:Int, num2:Int):Int{
        return num1 + num2
    }

    // Overloading : aşırı yükleme
    fun sum(num1:Int, num2:Int, num3:Int):Int{
        return num1 + num2 + num3
    }

    fun sum(num1:Int, num2:Int, name:String){
        val result = num1 + num2

        for (i in 0 until result){
            println(name)
        }
    }

}
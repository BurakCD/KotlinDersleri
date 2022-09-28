package com.ethadien.kotlinlanguage.nesne_tabanli

class Car(var color:String, var speed:Int, var isWorking:Boolean) {

    fun run(){// side effect denir
        isWorking = true
    }

    fun stop(){
        isWorking = false
    }

    fun accelerate(){
        speed += 5
    }

    fun getInfo(){
        println("Rengi: $color," +
                "\nHızı: $speed," +
                "\nÇalışıyor mu: $isWorking\n")
    }

}
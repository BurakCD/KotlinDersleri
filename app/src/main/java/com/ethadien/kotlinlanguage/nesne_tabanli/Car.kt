package com.ethadien.kotlinlanguage.nesne_tabanli

data class Car(var color:String,
               var speed:Int,
               var isWorking:Boolean) {

    init {
        println("Yeni araba nesnesi oluşturuldu!")
    }

    fun run(){// side effect denir
        isWorking = true
    }

    fun stop(){
        isWorking = false
    }

    fun accelerate(addSpeed:Int){
        speed += addSpeed
    }

    fun slowDown(popSpeed:Int) {
        speed -= popSpeed
    }

    fun getInfo(){
        println("Rengi: $color," +
                "\nHızı: $speed," +
                "\nÇalışıyor mu: $isWorking\n")
    }

}
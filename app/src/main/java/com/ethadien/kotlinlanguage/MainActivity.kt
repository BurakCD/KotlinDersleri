package com.ethadien.kotlinlanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ethadien.kotlinlanguage.nesne_tabanli.Car

class MainActivity : AppCompatActivity() {
    //var str : String? = null
    //lateinit var str1 : String // lateinit var : önce tanımladım sonra değer atıcam demek (val ile kullanılmaz)
    //lateinit var sayi : Int
    // lateinit primitive tiplerle kullanılamaz
    //lateinit var bmw:Car // lateinit ile nesne kullanımı



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
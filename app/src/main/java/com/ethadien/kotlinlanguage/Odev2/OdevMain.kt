package com.ethadien.kotlinlanguage.Odev2

fun main() {
    val funcs = Odev2()

    // Soru 1
    val temperature = funcs.CelciusToFahrenheit(40.0)
    println("Şu anki hava sıcaklığı: $temperature fahrenheit.")

    // Soru 2
    funcs.RectanglePerimeter(4, 6)

    // Soru 3
    val factorial = funcs.Factorial(4)
    println("Faktöriyel hesabınızın sonucu: $factorial")

    // Soru 4
    funcs.LetterCount("Merhaba", 'e')

    // Soru 5
    val sumOfInternalAngles = funcs.InternalAngleSum(6)
    println("Şeklinizin iç açılarının toplamı $sumOfInternalAngles derecedir.")

    // Soru 6
    val salary = funcs.Salary(30)
    println("Maaşınız varsa mesaileriniz de hesaba katıldığında $salary₺'dir.")

    // Soru 7
    val bill = funcs.Quota(52)
    println("Bu ayki harcamalarınıza göre faturanız $bill₺'dir.")
}
package com.example.kotlina

import android.content.Context
import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter

open class Person(val name:String,val age:Int){}
fun method1():Unit{
    if(1==1)
        return@method1
}


fun main(){
    println("Hello Kotlin")
    val value1 = 1
    for (i in 10 downTo 6 step 2 ){
        println(i)
    }

    Thread(object : Runnable{
        override fun run() {
            println("thread is running!")

        }
    }).start()
    Thread(Runnable{
        println("thread is runnnig !")
    }).start()

}
package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @ClassName SunnyWeatherApplication
 * @Description 定义全局的application  提供token以及 context
 * @Author Zhe
 * @Date 2020/6/9 16:54
 */
class SunnyWeatherApplication : Application(){

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context

        const val TOKEN = "whQS58iNuF9O8Yum"//const 相当于 static
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}
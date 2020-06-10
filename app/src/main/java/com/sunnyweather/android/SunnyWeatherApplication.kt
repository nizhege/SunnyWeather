package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @ClassName SunnyWeatherApplication
 * @Description TODO
 * @Author Zhe
 * @Date 2020/6/9 16:54
 */
class SunnyWeatherApplication : Application(){

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context

        const val TOKEN = "whQS58iNuF9O8Yum"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}
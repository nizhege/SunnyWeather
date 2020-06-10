package com.sunnyweather.android.logic.network

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @ClassName ServiceCreator
 * @Description retrofit构建器
 * @Author Zhe
 * @Date 2020/6/9 17:24
 */
object ServiceCreator {
    private val BASE_URL = "https://api.caiyunapp.com/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>) :T = retrofit.create(serviceClass)

    inline fun <reified T> create():T = create(T::class.java)




}
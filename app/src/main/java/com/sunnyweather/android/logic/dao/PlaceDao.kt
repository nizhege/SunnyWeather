package com.sunnyweather.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.PlaceResponse

/**
 * @ClassName PlaceDao
 * @Description TODO
 * @Author Zhe
 * @Date 2020/8/20 15:55
 */
object PlaceDao {

    // 用于将place对象存储到sharedPreferences中  先通过GSON 将Place对象转换成一个JSON字符串 然后将字符串保存
    fun savePlace(place: PlaceResponse.Place) {
        sharedPreferences().edit {
            putString("place",Gson().toJson(place))
        }
    }

    //读取数据 将JSON字符串从sharedPreferences文件中取出来 然后再通过GSON 将JSON字符串解析成Place对象返回
    fun getSavedPlace():PlaceResponse.Place{
        val placeJson = sharedPreferences().getString("place","")
        return Gson().fromJson(placeJson,PlaceResponse.Place::class.java)
    }

    //判断是否有数据已被存储
    fun isPlaceSaved() = sharedPreferences().contains("place")


    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)


}
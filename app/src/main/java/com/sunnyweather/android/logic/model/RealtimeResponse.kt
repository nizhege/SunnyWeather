package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @ClassName RealtimeResponse
 * @Description 实时天气的实体类
 * @Author Zhe
 * @Date 2020/8/18 15:08
 */
data class RealtimeResponse(val status: String, val result: Result){

    data class Result(val realtime: Realtime)

    data class Realtime(
        val temperature: Float, val skycon: String
        , @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: Aqi)

    data class Aqi(val chn: Float)
}




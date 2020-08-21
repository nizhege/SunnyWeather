package com.sunnyweather.android.logic.model

/**
 * @ClassName Weather
 * @Description TODO
 * @Author Zhe
 * @Date 2020/8/18 15:21
 */
data class Weather(val realtime:RealtimeResponse.Realtime ,val daily: DailyResponse.Daily)
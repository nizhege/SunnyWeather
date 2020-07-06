package com.sunnyweather.android.logic

import androidx.lifecycle.liveData
import com.sunnyweather.android.logic.model.PlaceResponse
import com.sunnyweather.android.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

/**
 * @ClassName Repository
 * @Description TODO
 * @Author Zhe
 * @Date 2020/7/6 17:18
 */
object Repository {
    fun searchPlaces(query : String ) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val place = placeResponse.places
                Result.success(place)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }

        } catch (e:Exception){
            Result.failure<List<PlaceResponse.Place>>(e)
        }
        emit(result)
    }
}
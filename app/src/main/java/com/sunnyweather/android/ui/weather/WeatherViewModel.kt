package com.sunnyweather.android.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.PlaceResponse

/**
 * @ClassName WeatherViewModel
 * @Description TODO
 * @Author Zhe
 * @Date 2020/8/18 16:00
 */
class WeatherViewModel:ViewModel() {

    private val locationLiveData = MutableLiveData<PlaceResponse.Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData){location->
        Repository.refreshWeather(location.lng,location.lat)
    }

    fun refreshWeather(lng:String ,lat:String){
        locationLiveData.value = PlaceResponse.Location(lng, lat)
    }


}
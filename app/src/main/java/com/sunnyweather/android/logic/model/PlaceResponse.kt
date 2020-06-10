package com.sunnyweather.android.logic.model

import android.location.Address
import android.location.Location
import com.google.gson.annotations.SerializedName

/**
 * @ClassName PlaceResponse
 * @Description 定义数据模型
 * @Author Zhe
 * @Date 2020/6/9 17:08
 */
class PlaceResponse {

    data class PlaceResponse(val status:String ,val places:List<Place>)


    data class Place(val name:String ,val location:Location,
                    @SerializedName("formatted_address") val address: String)

    data class Location(val lng:String,val lat:String)


}

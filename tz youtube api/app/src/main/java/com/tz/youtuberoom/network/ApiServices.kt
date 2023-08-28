package com.tz.youtuberoom.network

import com.tz.youtuberoom.model.VideoYtModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("search")
    fun getVideo(
        @Query("part") part: String,
        @Query("channelId") channelId: String,
        @Query("order") order: String,
        @Query("pageToken") pageToken: String?,
        @Query("q") query: String?
    ) : Call<VideoYtModel>


}
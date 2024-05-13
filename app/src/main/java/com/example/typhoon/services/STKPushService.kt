//package com.example.typhoon.services
//
//import com.example.typhoon.models.AccessToken
//import com.example.typhoon.models.STKPush
//import retrofit2.Call
//import retrofit2.http.Body
//import retrofit2.http.GET
//import retrofit2.http.POST
//
//interface STKPushService {
//    @POST("mpesa/stkpush/v1/processrequest")
//    fun sendPush(@Body stkPush: Any): Call<STKPush>
//
//    @GET("oauth/v1/generate?grant_type=client_credentials")
//    fun getAccessToken(): Call<AccessToken>
//}

//package com.example.typhoon.interceptor
//
//import okhttp3.Interceptor
//import okhttp3.Request
//import okhttp3.Response
//import java.io.IOException
//
////package com.tdbsoftloanapps.smartloan.interceptor
//
//class AuthInterceptor(private val mAuthToken: String) : Interceptor {
//    @Throws(IOException::class)
//    override fun intercept(chain: Interceptor.Chain): Response {
//        val request: Request = chain.request().newBuilder()
//            .addHeader("Authorization", "Bearer $mAuthToken")
//            .build()
//        return chain.proceed(request)
//    }
//}
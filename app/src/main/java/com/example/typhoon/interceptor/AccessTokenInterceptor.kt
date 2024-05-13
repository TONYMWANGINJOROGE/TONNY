//package com.example.typhoon.interceptor//package com.example.typhoon.interceptor//package com.example.typhoon.interceptor
//
//
////import com.example.typhoon.BuildConfig
////
////import android.support.v4.BuildConfig
//import android.util.Base64
////import com.pnikosis.materialishprogress.BuildConfig
//import okhttp3.Interceptor
//import okhttp3.Request
//import okhttp3.Response
//import java.io.IOException
//
//class AccessTokenInterceptor : Interceptor {
//    @Throws(IOException::class)
//
//    override fun intercept(chain: Interceptor.Chain): Response {
//        val keys: String = BuildConfig.CONSUMER_KEY + ":" + BuildConfig.CONSUMER_SECRET
//
//        val request: Request = chain.request().newBuilder()
//            .addHeader(
//                "Authorization",
//                "Basic " + Base64.encodeToString(keys.toByteArray(), Base64.NO_WRAP)
//            )
//            .build()
//        return chain.proceed(request)
//    }
//
//}
//
//

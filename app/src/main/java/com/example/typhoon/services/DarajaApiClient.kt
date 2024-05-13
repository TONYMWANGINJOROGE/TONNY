//package com.example.typhoon.services
//
//import com.example.typhoon.interceptor.AuthInterceptor
//import com.example.typhoon.interceptor.AccessTokenInterceptor
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import java.util.concurrent.TimeUnit
//
//class DarajaApiClient {
//    companion object {
//        private const val BASE_URL = "https://sandbox.safaricom.co.ke/oauth/v1/generate?grant_type=client_credentials"
//        private const val CONNECT_TIMEOUT = 30L
//        private const val WRITE_TIMEOUT = 30L
//        private const val READ_TIMEOUT = 30L
//    }
//
//    private var retrofit: Retrofit? = null
//    private var isDebug = true
//    private var isGetAccessToken = true
//    private var mAuthToken: String? = null
//    private val httpLoggingInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()
//
//    fun setIsDebug(isDebug: Boolean): DarajaApiClient {
//        this.isDebug = isDebug
//        return this
//    }
//
//    fun setAuthToken(authToken: String?): DarajaApiClient {
//        mAuthToken = authToken
//        return this
//    }
//
//    fun setGetAccessToken(getAccessToken: Boolean): DarajaApiClient {
//        isGetAccessToken = getAccessToken
//        return this
//    }
//
//    private fun okHttpClient(): OkHttpClient.Builder {
//        val okHttpClient: OkHttpClient.Builder = OkHttpClient.Builder()
//        okHttpClient
//            .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
//            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
//            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
//            .addInterceptor(httpLoggingInterceptor)
//
//        return okHttpClient
//    }
//
//    private val restAdapter: Retrofit?
//        get() {
//            val builder: Retrofit.Builder = Retrofit.Builder()
//            builder.baseUrl(BASE_URL)
//            builder.addConverterFactory(GsonConverterFactory.create())
//
//            if (isDebug) {
//                httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
//            }
//
//            val okhttpBuilder: OkHttpClient.Builder = okHttpClient()
//
//            if (isGetAccessToken) {
//                okhttpBuilder.addInterceptor(AccessTokenInterceptor())
//            }
//
//            if (mAuthToken != null && mAuthToken!!.isNotEmpty()) {
//                okhttpBuilder.addInterceptor(AuthInterceptor(mAuthToken!!))
//            }
//
//            builder.client(okhttpBuilder.build())
//
//            retrofit = builder.build()
//
//            return retrofit
//        }
//
//    fun mpesaService(): STKPushService {
//        return restAdapter!!.create(STKPushService::class.java)
//    }
//}

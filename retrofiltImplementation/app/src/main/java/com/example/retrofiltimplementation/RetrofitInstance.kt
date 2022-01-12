package com.example.retrofiltimplementation

import com.google.gson.GsonBuilder
import kotlinx.coroutines.channels.ticker
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitInstance {
    //static object
    companion object{
        val BASE_URL = "http://jsonplaceholder.typicode.com"
        //for login interceptor
        val interceptor:HttpLoggingInterceptor = HttpLoggingInterceptor().apply{
            this.level = HttpLoggingInterceptor.Level.BODY
        }
        val client = OkHttpClient.Builder().apply {
            this.addInterceptor(interceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(20,TimeUnit.SECONDS)
        }.build()

        fun getRetrofitInstance(): Retrofit{
            return Retrofit.Builder().baseUrl(BASE_URL).
            addConverterFactory(GsonConverterFactory.create(GsonBuilder().
            create())).client(client).build()
        }
    }
}
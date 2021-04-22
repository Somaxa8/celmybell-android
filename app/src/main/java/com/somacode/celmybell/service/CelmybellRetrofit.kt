package com.somacode.celmybell.service

import com.google.gson.GsonBuilder
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CelmybellRetrofit {

    val api: CelmybellApi

    init {
        val gson = GsonBuilder().create()
        val gsonConverter = GsonConverterFactory.create(gson)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://web.mobiledigitalsales.org:8090")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(gsonConverter).build()
        api = retrofit.create(CelmybellApi::class.java)
    }

}
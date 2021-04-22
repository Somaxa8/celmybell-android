package com.somacode.celmybell.service

import com.somacode.celmybell.model.response.LoginResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface CelmybellApi {

    @POST("/public/oauth/login")
    @FormUrlEncoded
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Single<LoginResponse>
}
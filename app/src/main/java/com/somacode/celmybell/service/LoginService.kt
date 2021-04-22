package com.somacode.celmybell.service

import android.app.Activity
import android.util.Log
import android.widget.Toast
import com.somacode.celmybell.Main
import com.somacode.celmybell.Session
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlin.math.log

object LoginService {

    fun postLogin(activity: Activity, username: String, password: String) {

        val response = CelmybellRetrofit.api.login(username, password)

        response
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.single())
                .subscribe({
                    println(Main.session.loginResponse)
                    Log.v("response", it.token!!.accessToken!!)
                    Toast.makeText(activity, "Login Successful", Toast.LENGTH_SHORT).show()
        }, {
            it.printStackTrace()
            Toast.makeText(activity, "Login Failure", Toast.LENGTH_SHORT).show()
        })

    }
}
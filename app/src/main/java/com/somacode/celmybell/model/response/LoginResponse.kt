package com.somacode.celmybell.model.response

import com.google.gson.annotations.SerializedName
import com.somacode.celmybell.model.Authority
import com.somacode.celmybell.model.Token
import com.somacode.celmybell.model.User
import java.io.Serializable

class LoginResponse(
    @SerializedName("oauth2AccessToken")
    var token: Token? = null,
    var user: User? = null,
    var authorities: List<Authority>
): Serializable
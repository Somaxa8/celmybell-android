package com.somacode.celmybell.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class User(
    var id: Long? = null,
    var username: String? = null,
    var name: String? = null,
    var lastname: String? = null,
    var email: String? = null,
    var activated: Boolean? = null
): Serializable
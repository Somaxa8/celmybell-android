package com.somacode.celmybell.model

import java.io.Serializable

class Authority(
    var name: Name? = null,
    var description: String? = null
): Serializable {
    enum class Name {
        ROLE_SUPERADMIN, ROLE_ADMIN, ROLE_USER, ROLE_SWAGGER
    }
}
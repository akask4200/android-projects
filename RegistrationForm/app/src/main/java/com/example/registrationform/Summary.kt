package com.example.registrationform

import java.io.Serializable

data class Summary (
    val firstName : String,
    val lastName : String,
    val emailAddress : String,
    val phoneNumber : String,
    val sex : String
        ):Serializable

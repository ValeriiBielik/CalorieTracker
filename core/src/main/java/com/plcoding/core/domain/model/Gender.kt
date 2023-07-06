package com.plcoding.core.domain.model

sealed class Gender(val name: String) {
    object Male : Gender("male")
    object Female : Gender("female")

    companion object {
        fun fromString(name: String): Gender {
            return when (name) {
                "male" -> return Male
                "female" -> return Female
                else -> Female
            }
        }
    }
}

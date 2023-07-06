package com.plcoding.core.domain.model

sealed class ActivityLevel(val name: String) {
    object Low : ActivityLevel("low")
    object Medium : ActivityLevel("medium")
    object High : ActivityLevel("high")

    companion object {
        fun fromString(name: String): ActivityLevel {
            return when (name) {
                "low" -> return Low
                "medium" -> return Medium
                "high" -> return High
                else -> Medium
            }
        }
    }
}

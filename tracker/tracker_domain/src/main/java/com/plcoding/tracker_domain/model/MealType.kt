package com.plcoding.tracker_domain.model

sealed class MealType(val name: String) {
    object Breakfast : MealType("breakfast")
    object Lunch : MealType("lunch")
    object Dinner : MealType("dinner")
    object Snack : MealType("snack")

    companion object {
        fun fromString(meal: String): MealType {
            return when (meal.lowercase()) {
                "breakfast" -> Breakfast
                "lunch" -> Lunch
                "dinner" -> Dinner
                "snack" -> Snack
                else -> Breakfast
            }
        }
    }
}

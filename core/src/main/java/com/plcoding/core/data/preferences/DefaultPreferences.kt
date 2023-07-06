package com.plcoding.core.data.preferences

import android.content.SharedPreferences
import com.plcoding.core.domain.model.ActivityLevel
import com.plcoding.core.domain.model.Gender
import com.plcoding.core.domain.model.GoalType
import com.plcoding.core.domain.model.UserInfo
import com.plcoding.core.domain.preferences.Preferences

class DefaultPreferences(
    private val sharedPref: SharedPreferences
) : Preferences {

    override fun saveGender(gender: Gender) {
        sharedPref.edit().putString(Preferences.KEY_GENDER, gender.name).apply()
    }

    override fun saveAge(age: Int) {
        sharedPref.edit().putInt(Preferences.KEY_AGE, age).apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPref.edit().putFloat(Preferences.KEY_WEIGHT, weight).apply()
    }

    override fun saveHeight(height: Int) {
        sharedPref.edit().putInt(Preferences.KEY_HEIGHT, height).apply()
    }

    override fun saveActivityLevel(level: ActivityLevel) {
        sharedPref.edit().putString(Preferences.KEY_ACTIVITY_LEVEL, level.name).apply()
    }

    override fun saveGoalType(type: GoalType) {
        sharedPref.edit().putString(Preferences.KEY_GOAL_TYPE, type.name).apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        sharedPref.edit().putFloat(Preferences.KEY_CARB_RATIO, ratio).apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        sharedPref.edit().putFloat(Preferences.KEY_PROTEIN_RATIO, ratio).apply()
    }

    override fun saveFatRatio(ratio: Float) {
        sharedPref.edit().putFloat(Preferences.KEY_FAT_RATIO, ratio).apply()
    }

    override fun loadUserInfo(): UserInfo {
        return UserInfo(
            gender = Gender.fromString(sharedPref.getString(Preferences.KEY_GENDER, null) ?: "male"),
            age = sharedPref.getInt(Preferences.KEY_AGE, -1),
            height = sharedPref.getInt(Preferences.KEY_HEIGHT, -1),
            weight = sharedPref.getFloat(Preferences.KEY_WEIGHT, -1f),
            activityLevel = ActivityLevel.fromString(sharedPref.getString(Preferences.KEY_ACTIVITY_LEVEL, null) ?: "medium"),
            goalType = GoalType.fromString(sharedPref.getString(Preferences.KEY_GOAL_TYPE, null) ?: "keep_weight"),
            carbRatio = sharedPref.getFloat(Preferences.KEY_CARB_RATIO, -1f),
            proteinRatio = sharedPref.getFloat(Preferences.KEY_PROTEIN_RATIO, -1f),
            fatRatio = sharedPref.getFloat(Preferences.KEY_FAT_RATIO, -1f),
        )
    }
}
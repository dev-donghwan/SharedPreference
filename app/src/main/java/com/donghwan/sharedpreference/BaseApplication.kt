package com.donghwan.sharedpreference

import android.app.Application
import android.content.SharedPreferences

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        pref = getSharedPreferences(SHARED_PREFERENCE_TAG, MODE_PRIVATE)
    }

    companion object {
        const val SHARED_PREFERENCE_TAG = "SHARED_PREFERENCE_TAG"
        private lateinit var pref: SharedPreferences

        fun getPref(): SharedPreferences {
            return pref
        }
    }
}
package com.donghwan.sharedpreference

import android.app.Application

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        pref = PrefUtilImpl(this, SHARED_PREFERENCE_TAG)
    }

    companion object {
        const val SHARED_PREFERENCE_TAG = "SHARED_PREFERENCE_TAG"
        private lateinit var pref: PrefUtil

        fun getPref(): PrefUtil {
            return pref
        }
    }
}
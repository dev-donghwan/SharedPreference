package com.donghwan.sharedpreference

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class PrefUtilImpl(
    context: Context,
    tag: String
) : PrefUtil {
    private val pref: SharedPreferences by lazy {
        context.getSharedPreferences(tag, MODE_PRIVATE)
    }

    override fun putString(key: String, value: String) {
        pref.edit().putString(key, value).apply()
    }

    override fun getString(key: String): String {
        return pref.getString(key, "") ?: ""
    }

    override fun putInt(key: String, value: Int) {
        pref.edit().putInt(key, value).apply()
    }

    override fun getInt(key: String): Int {
        return pref.getInt(key, 0)
    }

    override fun putLong(key: String, value: Long) {
        pref.edit().putLong(key, value).apply()
    }

    override fun getLong(key: String): Long {
        return pref.getLong(key, 0)
    }

    override fun putFloat(key: String, value: Float) {
        pref.edit().putFloat(key, value).apply()
    }

    override fun getFloat(key: String): Float {
        return pref.getFloat(key, 0f)
    }

    override fun putBoolean(key: String, value: Boolean) {
        pref.edit().putBoolean(key, value).apply()
    }

    override fun getBoolean(key: String): Boolean {
        return pref.getBoolean(key, false)
    }

    override fun clear() {
        pref.edit().clear().apply()
    }

    override fun clear(key: String) {
        pref.edit().remove(key).apply()
    }
}
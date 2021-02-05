package com.donghwan.sharedpreference

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.widget.Toast

object PrefUtilImpl : PrefUtil {
    private var pref: SharedPreferences? = null

    override fun getInstance(
        context: Context,
        tag: String
    ): PrefUtil {
        if (pref == null) {
            pref = context.getSharedPreferences(tag, MODE_PRIVATE)
        } else {
            Toast.makeText(context, "Not Create", Toast.LENGTH_SHORT)
        }
        return this
    }

    override fun putString(key: String, value: String) {
        pref!!.edit().putString(key, value).apply()
    }

    override fun getString(key: String): String {
        return pref!!.getString(key, "") ?: ""
    }

    override fun putInt(key: String, value: Int) {
        pref!!.edit().putInt(key, value).apply()
    }

    override fun getInt(key: String): Int {
        return pref!!.getInt(key, 0)
    }

    override fun putLong(key: String, value: Long) {
        pref!!.edit().putLong(key, value).apply()
    }

    override fun getLong(key: String): Long {
        return pref!!.getLong(key, 0)
    }

    override fun putFloat(key: String, value: Float) {
        pref!!.edit().putFloat(key, value).apply()
    }

    override fun getFloat(key: String): Float {
        return pref!!.getFloat(key, 0f)
    }

    override fun putBoolean(key: String, value: Boolean) {
        pref!!.edit().putBoolean(key, value).apply()
    }

    override fun getBoolean(key: String): Boolean {
        return pref!!.getBoolean(key, false)
    }

    override fun contain(key: String): Boolean {
        return pref!!.contains(key)
    }

    override fun remove(key: String) {
        pref!!.edit().remove(key).apply()
    }

    override fun clear() {
        pref!!.edit().clear().apply()
    }
}
package com.donghwan.sharedpreference

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.donghwan.sharedpreference.BaseApplication.Companion.getPref

class MainActivity : AppCompatActivity() {
    private val inputText: EditText by lazy { findViewById(R.id.edt_result) }
    private val btnSave: Button by lazy { findViewById(R.id.btn_save) }
    private val btnLoad: Button by lazy { findViewById(R.id.btn_load) }
    private val btnClear: Button by lazy { findViewById(R.id.btn_clear) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave.setOnClickListener {
            saveText()
        }

        btnLoad.setOnClickListener {
            loadText()
        }

        btnClear.setOnClickListener {
            clearText()
        }
    }

    private fun saveText() {
        getPref().edit().putString("SAVED_TEXT", inputText.text.toString()).apply()
        inputText.text.clear()
    }

    private fun loadText() {
        inputText.setText(getPref().getString("SAVED_TEXT", ""))
    }

    private fun clearText() {
        inputText.text.clear()
        getPref().edit().clear().apply()
    }
}
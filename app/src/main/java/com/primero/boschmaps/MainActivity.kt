package com.primero.boschmaps

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.io.IOException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    run()
                }

            }
        )


    }

    private val client = OkHttpClient()

    fun run() {
        val edv = findViewById<EditText>(R.id.editTextTextPersonName).text.toString().toInt()
        val password = findViewById<EditText>(R.id.editTextTextPassword).text.toString()

        val formBody = FormBody.Builder()
            .add("EDV", edv.toString())
            .add("Password", password.toString())
            .build()

        val request = Request.Builder()
            .url("http://10.0.2.2:5000")
            .addHeader("Content-Type","application/json")
            .post(formBody)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                println(response.body!!.string())
                println(formBody)
            }

        })
    }
}

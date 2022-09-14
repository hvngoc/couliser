package com.thread.max.count.services

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val services1 = Intent(this, Main1111Service::class.java)
        startService(services1)

        if (!Util.isServicesRunning(this, Main222Service::class.java.name)) {
            Log.w("conheo", "main call 2222")
            val services2 = Intent(this, Main222Service::class.java)
            ContextCompat.startForegroundService(this, services2)
        }

        if (!Util.isServicesRunning(this, Main333Service::class.java.name)) {
            Log.w("conheo", "main call 33333")
            val services3 = Intent(this, Main333Service::class.java)
            ContextCompat.startForegroundService(this, services3)
        }
    }
}
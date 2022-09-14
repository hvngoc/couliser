package com.thread.max.count.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class Main1111Service : Service() {

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("conheo", "start 1111 normal")
        return super.onStartCommand(intent, flags, startId)
    }
}
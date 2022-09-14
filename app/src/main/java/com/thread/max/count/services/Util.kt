package com.thread.max.count.services

import android.app.ActivityManager
import android.content.Context

/**
 * Created by hvngoc on 9/14/22
 */
object Util {
    fun isServicesRunning(c: Context, name: String): Boolean {
        val activityManager: ActivityManager =
            c.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (s in activityManager.getRunningServices(Int.MAX_VALUE)) {
            if (name == s.service.className) {
                return true
            }
        }
        return false
    }
}
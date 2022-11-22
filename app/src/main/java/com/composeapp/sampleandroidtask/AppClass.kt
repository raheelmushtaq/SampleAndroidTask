package com.composeapp.sampleandroidtask

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppClass:Application()
{
  
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
  }
}

package com.example.pokemon

import android.app.Application
import com.example.pokemon.database.DatabaseManager

class MyApplication : Application(){
    override fun onCreate(){
        DatabaseManager.instance.initializableDb(applicationContext)
        super.onCreate()
    }
}
package com.example.myzhbo.ui

import android.app.Application
import com.example.myzhbo.database.ZboDataBase

class MainApp: Application() {
    val database by lazy {
ZboDataBase.getDB(this)
    }
}
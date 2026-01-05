package com.example.myfirebase

import android.app.Application
import com.example.myfirebase.di.AppContainer
import com.example.myfirebase.di.MahasiswaContainer

class MahasiswaApplications : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}
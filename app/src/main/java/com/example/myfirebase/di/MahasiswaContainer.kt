package com.example.myfirebase.di

import com.example.myfirebase.repository.MahasiswaRepository
import com.example.myfirebase.repository.NetworkMahasiswaRepository
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer {
    val mahasiswaRepository: MahasiswaRepository
}

class MahasiswaContainer : AppContainer {
    private val firestore: FirebaseFirestore =
        FirebaseFirestore.getInstance() // get instance untuk mengakses ke firestore
    override val mahasiswaRepository: MahasiswaRepository by lazy {
        NetworkMahasiswaRepository(firestore)
    }
}
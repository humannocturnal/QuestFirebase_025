package com.example.myfirebase.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myfirebase.MahasiswaApplications

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(MhsApplications().container.mahasiswaRepository)
        }
        initializer {
            InsertViewModel(
                MhsApplications().container.mahasiswaRepository
            )
        }
        initializer {
            DetailViewModel(
                MhsApplications().container.mahasiswaRepository
            )
        }
    }
}

fun CreationExtras.MhsApplications(): MahasiswaApplications = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications
        )
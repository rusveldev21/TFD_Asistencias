package com.tfd.tfd_asistencias.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AsistenciaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Asistencia fragment"
    }
    val text: LiveData<String> = _text
}
package com.example.roomsiswa.repositori

import android.content.Context
import com.example.roomsiswa.Data.DatabaseSiswa
import com.example.roomsiswa.Data.SiswaDao

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}
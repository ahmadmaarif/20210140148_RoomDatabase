package com.example.roomsiswa.repositori

import android.content.Context

interface ContainerApp {
    val repositoriSiswa:RepositoriSiswa
}

class ContainerDataApp(private val context: Context):ContainerApp{
    
}
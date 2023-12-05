package com.example.roomsiswa.repositori

import android.content.Context

interface ContainerApp {
    val repositoriSiswa:RepositoriSiswa
}

4rclass ContainerDataApp(private val context: Context):ContainerApp{
    
}
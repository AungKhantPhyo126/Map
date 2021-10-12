package com.aungkhantphyo.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aungkhantphyo.map.dataclass.Place
import com.aungkhantphyo.map.place.PlacesReader
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MarkerOptions
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
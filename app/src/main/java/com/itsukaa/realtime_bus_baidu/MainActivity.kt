package com.itsukaa.realtime_bus_baidu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.itsukaa.realtime_bus_baidu.map.MapActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonWatchMap = findViewById<Button>(R.id.button_watch_map)
        buttonWatchMap.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }
    }
}
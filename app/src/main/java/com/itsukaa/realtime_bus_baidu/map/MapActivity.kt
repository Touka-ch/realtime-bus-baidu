package com.itsukaa.realtime_bus_baidu.map

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import com.baidu.mapapi.map.MapView
import com.itsukaa.realtime_bus_baidu.R

class MapActivity : Activity() {
    var mMapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mMapView = findViewById<MapView>(R.id.bmapView)
    }

    override fun onResume() {
        super.onResume()
        mMapView?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mMapView?.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mMapView?.onDestroy()
    }
}
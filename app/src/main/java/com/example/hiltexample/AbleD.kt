package com.example.hiltexample

import android.util.Log
import javax.inject.Inject


class AbleD @Inject constructor() : StoreInterface{
    override fun open() {
        Log.d(TAG, "AbleD Academy open")
    }

    override fun close() {
        Log.d(TAG, "AbleD Academy close")
    }
}
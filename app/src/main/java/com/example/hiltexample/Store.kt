package com.example.hiltexample

import android.util.Log
import javax.inject.Inject

const val TAG = "STORE"

class Store @Inject constructor(){

    fun open(){
        Log.d(TAG, "OPEN 신장개업 화이팅")
    }

    fun close(){
        Log.d(TAG, "샷따 내려....")
    }
}
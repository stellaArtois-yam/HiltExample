package com.example.hiltexample

import android.util.Log
import javax.inject.Inject


class Starbucks @Inject
    constructor() : StoreInterface{

    override fun open() {
        Log.d(TAG, "Starbucks open")
    }

    override fun close() {
        Log.d(TAG, "Starbucks close")
    }


}
package com.example.hiltexample

import android.util.Log
import javax.inject.Inject


class Welcome @Inject
    constructor(private val members: Members) {
        fun greet() {
            Log.d(TAG, "반갑습니다. ${members.name()} 님")
        }

}
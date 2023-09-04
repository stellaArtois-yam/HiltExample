package com.example.hiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.*
import java.io.IOException
import javax.inject.Inject
import kotlin.math.log

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var store : Store

//    @Inject
//    lateinit var welcome: Welcome

//    @Inject
//    lateinit var ableD: AbleD
//
//    @Inject
//    lateinit var starbucks : Starbucks

//    @Inject
//    lateinit var ableDSecond: StoreInterface

    @BindsModule.AbleDImpl
    @Inject
    lateinit var ableD: StoreInterface
//
    @BindsModule.StarbucksImpl
    @Inject
    lateinit var starbucks: StoreInterface
    
    @Inject
    lateinit var httpClient: OkHttpClient


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        store.open()
//        welcome.greet()
//
//        ableD.open()
//        starbucks.open()

//        ableDSecond.open()
        
        val request = Request.Builder()
            .url("https://www.google.com")
            .header("User-Agent", "Okhttp Example")
            .build()

        httpClient.newCall(request).enqueue(object :Callback{
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure:  ${e.message}")
            }

            override fun onResponse(call: Call, response: Response) {
                Log.d(TAG, "onResponse: ${response.body}")
            }
        })



    }

}

package com.elegantappstore.etssartup


import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val mySong= MediaPlayer.create(applicationContext,R.raw.audio)
        mySong.start()
        Timer().schedule( object : TimerTask(){
            override fun run() {
                val intent = Intent(this@SplashScreen,MainActivity::class.java)
                startActivity(intent)
                finish()
            }

        },2800L)
    }

}


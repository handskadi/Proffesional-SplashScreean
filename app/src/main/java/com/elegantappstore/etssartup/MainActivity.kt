package com.elegantappstore.etssartup

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import com.muddzdev.styleabletoastlibrary.StyleableToast

class MainActivity : AppCompatActivity() {
     // This Code made by www.elegantappstore.com

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = findViewById<TextView>(R.id.txtv)
//        val text = "I want This and This to be colored!"
//
//        val spst = SpannableString(text)
//        val fcGreen = ForegroundColorSpan(Color.GREEN)
//        val fcRed = ForegroundColorSpan(Color.RED)
//        val fcYellow = BackgroundColorSpan(Color.YELLOW)
//
//        spst.setSpan(fcGreen,2,5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE )
//        spst.setSpan(fcRed,17,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE )
//        spst.setSpan(fcYellow,23,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE )
//
//        textView.setText(spst)

    }

    fun clickedon(view:View){
//        StyleableToast.makeText(this,"Welcome!",R.style.toasty).show()

    }
}

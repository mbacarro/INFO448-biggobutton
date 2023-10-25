package edu.uw.ischool.mbacarro.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"
    private lateinit var btnPushMe : Button
    private var pushCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPushMe = findViewById(R.id.btnPushMe)

        btnPushMe.setOnClickListener {
            Log.i(TAG, "button ${btnPushMe.tag} was pushed")
            pushCount++
            if (pushCount == 1) {
                btnPushMe.setText("You have pushed me 1 time!")
            }
            else {
                btnPushMe.setText("You have pushed me ${pushCount} times!")
            }
        }

    }
}
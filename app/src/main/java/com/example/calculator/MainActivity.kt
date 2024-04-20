package com.example.calculator
import android.icu.text.DecimalFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var user_screen: TextView
    lateinit var result_screen: TextView
    lateinit var button_1: Button
    lateinit var button_2: Button
    lateinit var button_3: Button
    lateinit var button_4: Button
    lateinit var button_5: Button
    lateinit var button_6: Button
    lateinit var button_7: Button
    lateinit var button_8: Button
    lateinit var button_9: Button
    lateinit var button_0: Button
    lateinit var button_dot: Button
    lateinit var button_delete: Button
    lateinit var button_ac: Button
    lateinit var button_div: Button
    lateinit var button_mul: Button
    lateinit var button_add: Button
    lateinit var button_sub: Button
    lateinit var button_equal: Button
    var mode =0
    var mode_num =0
    var memory1: Double = "0".toDouble()
    var memory2: Double? = "0".toDouble()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}



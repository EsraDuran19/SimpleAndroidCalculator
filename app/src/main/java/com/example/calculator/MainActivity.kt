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
        user_screen = findViewById(R.id.user_screen1)
        result_screen = findViewById(R.id.result_screen1)
        button_1 = findViewById(R.id.btn_1)
        button_2 = findViewById(R.id.btn_2)
        button_3 = findViewById(R.id.btn_3)
        button_4 = findViewById(R.id.btn_4)
        button_5 = findViewById(R.id.btn_5)
        button_6= findViewById(R.id.btn_6)
        button_7 = findViewById(R.id.btn_7)
        button_8 = findViewById(R.id.btn_8)
        button_9 = findViewById(R.id.btn_9)
        button_0 = findViewById(R.id.btn_0)
        button_dot = findViewById(R.id.dot_btn)
        button_delete=  findViewById(R.id.c_btn)
        button_ac = findViewById(R.id.ac_btn)
        button_div = findViewById(R.id.divide_btn)
        button_mul  = findViewById(R.id.multiply_btn)
        button_add= findViewById(R.id.add_btn)
        button_sub= findViewById(R.id.minus_btn)
        button_equal= findViewById(R.id.equal_btn)
        addListener(button_1,"1")
        addListener(button_2,"2")
        addListener(button_3,"3")
        addListener(button_4,"4")
        addListener(button_5,"5")
        addListener(button_6,"6")
        addListener(button_7,"7")
        addListener(button_8,"8")
        addListener(button_9,"9")
        addListener(button_0,"0")
        addListener(button_dot,".")
        addListener1(button_div,1)
        addListener1(button_mul,2)
        addListener1(button_add,3)
        addListener1(button_sub,4)
        button_equal.setOnClickListener {
            showResult()
            memory1 = result_screen.text.toString().toDouble()
            mode=0
            mode_num=0
        }

    }
    private fun addListener(buttonName: Button, text: String){
        buttonName.setOnClickListener {
        }
    }
    private fun addListener1(buttonName: Button, text: Int) {
        buttonName.setOnClickListener {

        }
    }

       private fun showResult() {
            var sonuc: Double = 0.000000
            var screen = result_screen.text.toString().toDouble()
        }

}



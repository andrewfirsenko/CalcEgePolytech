package ru.cutepool.calcegepolytech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_main.setOnClickListener {
//            Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, StepsActivity::class.java)
            startActivity(intent)
        }
    }
}

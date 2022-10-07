package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var mainbutton: Button
    private lateinit var number10: EditText
    private lateinit var numebr20: EditText
    private lateinit var numebr30: EditText
    private lateinit var numebr40: EditText


    private lateinit var checkBoxman: CheckBox
    private lateinit var checkBoxfemaile: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainbutton = findViewById(R.id.mainbutton)
        number10 = findViewById(R.id.number1)
        numebr20 = findViewById(R.id.number2)
        numebr30 = findViewById(R.id.number3)
        numebr40 = findViewById(R.id.number4)

        checkBoxman = findViewById(R.id.checkBoxman)
        checkBoxfemaile = findViewById(R.id.checkBoxfemaile)
        //обработчик нажатия кнопки
        val assw1: String = number10.text.toString()
        val assw2: String = numebr20.text.toString()
        val assw3: String = numebr30.text.toString()
        val assw4: String = numebr40.text.toString()





        mainbutton.setOnClickListener {
            if (checkBoxman.isChecked || checkBoxfemaile.isChecked) {

                    val intent = Intent(this, SecondActivity::class.java)
                    if (checkBoxman.isChecked) {
                        intent.putExtra("key_num1", "0");
                        startActivity(intent)
                    }
                    if (checkBoxfemaile.isChecked) {
                        intent.putExtra("key_num1", "1");
                        startActivity(intent)
                    }





            } else {

                Toast.makeText(this, "выберите пол ", Toast.LENGTH_LONG).show();

            }
        }
    }

}
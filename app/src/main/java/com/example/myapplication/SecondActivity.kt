package com.example.myapplication

import android.annotation.SuppressLint
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        imageView =findViewById(R.id.imageView2)

        //получение данных по ключу
        val num2=intent.getStringExtra("key_num1")
        val numConvert1:Int= num2!!.toInt()
        if(num2=="1"){
            imageView.setBackgroundResource(R.drawable.images);
            Toast.makeText(this, "женщина"+numConvert1*numConvert1, Toast.LENGTH_LONG).show();
        }
        if(num2=="0"){
            imageView.setBackgroundResource(R.drawable.resource__);
            Toast.makeText(this, "мужчина", Toast.LENGTH_LONG).show();
        }




    }
}
package com.example.elementarylearnersaid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class SyllabusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_syllabus)

        var alpha = Array<String>(26){""}
        var j = 65
        for (i in 0..25){
            alpha[i] = Character.toString(j.toChar())
            j++
        }

        var adapter = ArrayAdapter<String>(applicationContext,android.R.layout.simple_dropdown_item_1line,alpha)
        var gridView : GridView = findViewById(R.id.gridView)
        gridView.adapter = adapter


    }
}

//Research
//val content = intent.getParcelableExtra<Content>("content")
//
//if (content!= null){
//
//    val textView : TextView = findViewById(R.id.contentSyllabus)
//    val imageView : ImageView = findViewById(R.id.imageSyllabus)
//
//    textView.text = content.description
//    imageView.setImageResource(content.titleImage)
//
//}
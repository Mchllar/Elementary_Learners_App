package com.example.elementarylearnersaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var newRecyclerview: RecyclerView
    private lateinit var newArrayList : ArrayList<Content>
    private lateinit var imageId : Array<Int>
    private lateinit var description : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        //TextView
        val message = intent.getStringExtra("PLAYER_NAME")

        val textView: TextView = findViewById(R.id.greetingTextView)

        textView.text = message

        //Button listener
        val btnBack: Button = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {

            val mainActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(mainActivityIntent)
        }

        //Populating the recycler view
        imageId = arrayOf(
            R.drawable.alphabet,
            R.drawable.numbers,
            R.drawable.cooking,
            R.drawable.reading,
            R.drawable.writing,

            //add Content
            R.drawable.alphabet,
            R.drawable.numbers,
            R.drawable.cooking,
            R.drawable.reading,
            R.drawable.writing
        )

        description = arrayOf (
            "Learn the Alphabets",
            "Lets do some Math",
            "Who's Hungry?",
            "Learn new Spellings",
            "Improve your Grammar",

            //add content
            "Learn the Alphabets",
            "Lets do some Math",
            "Who's Hungry?",
            "Learn new Spellings",
            "Improve your Grammar"
        )

        //Declare
        newRecyclerview = findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserdata()

    }

    private fun getUserdata() {

        for(i in imageId.indices){

            val subject = Content(imageId[i],description[i])
            newArrayList.add(subject)
        }

        val adapter = MyAdapter(newArrayList)
        newRecyclerview.adapter = adapter

        //To switch to a new activity
        adapter.onItemClick = {

            val intent = Intent(this, SyllabusActivity::class.java)

            startActivity(intent)

        }


    }

}

//        //To switch to a new activity
//        adapter.onItemClick = {
//
//            val intent = Intent(this, SyllabusActivity::class.java)
//            intent.putExtra("content", it)
//
//            startActivity(intent)
//
//        }

//To toast onclick
//        adapter.setOnItemClickListener(object: MyAdapter.onItemClickListener{
//
//            override fun onItemClick(position: Int) {
//
//                Toast.makeText(this@RecyclerViewActivity, "You clicked on item no $position", Toast.LENGTH_SHORT).show()
//            }
//
//
//        })





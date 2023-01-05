package com.example.elementarylearnersaid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val subjectsList : ArrayList<Content>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

//    //Onclicking an Item in the recycler view (FOR TOASTING)
//    private  lateinit var mlistener : onItemClickListener
//
//    interface onItemClickListener{
//
//       fun onItemClick(position : Int)
//    }
//
//    fun setOnItemClickListener(listener: onItemClickListener){
//
//        mlistener = listener
//    }

    //Listener to open a new activity
    var onItemClick :((Content) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        //listener for onclick add mlistener as a variable
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = subjectsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.lessonTitle.text = currentItem.description

        //Listener to start a new activity
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentItem)
        }

    }

    override fun getItemCount(): Int {

        return subjectsList.size
    }

    //For toast parse , listener: onItemClickListener
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val lessonTitle : TextView = itemView.findViewById(R.id.lessonTitle)

//        //defining the onclickListener
//        init{
//
//            itemView.setOnClickListener {
//
//                listener.onItemClick(adapterPosition)
//            }
//        }

    }

}
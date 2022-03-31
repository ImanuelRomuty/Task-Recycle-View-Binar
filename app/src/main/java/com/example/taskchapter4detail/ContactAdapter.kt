package com.example.taskchapter4detail

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
class ContactAdapter(private val user : List<User> ):RecyclerView.Adapter<ContactAdapter.UserViewHolder>() {

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nameTextView : TextView = view.findViewById(R.id.name_text_view)
        val noHpTextView : TextView = view.findViewById(R.id.noHp_text_view)
        val detailButton : Button   = view.findViewById(R.id.detail_button)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.nameTextView.text = user[position].name
        holder.noHpTextView.text = user[position].noHp
        holder.detailButton.setOnClickListener {
            val patchContact = User(
                user[position].name,
                user[position].noHp
            )
            it.findNavController().navigate(RecycleFragmentDirections.actionRecycleFragmentToDetailFragment(patchContact))
        }
    }
    override fun getItemCount(): Int {
        return user.size
    }
}



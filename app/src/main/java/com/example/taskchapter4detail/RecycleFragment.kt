package com.example.taskchapter4detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecycleFragment : Fragment()  {
    lateinit var contactRecycler : RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userList = listOf(
            User( "Imanuel", "1111"),
            User( "Cahyo", "1111"),
            User( "Afif", "1111"),

        )
        contactRecycler = view.findViewById(R.id.contact_recycle)
        val contactAdapter = ContactAdapter(userList)
        val layoutManager  = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL , false)
        contactRecycler.layoutManager = layoutManager
        contactRecycler.adapter        = contactAdapter
    }

}
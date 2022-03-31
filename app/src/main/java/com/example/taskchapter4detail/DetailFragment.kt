package com.example.taskchapter4detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class DetailFragment : Fragment() {
    private val arguments : DetailFragmentArgs by navArgs()
    private lateinit var passingName : TextView
    private lateinit var passingNoHp : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        passingName = view.findViewById(R.id.name_passing_text_view)
        passingNoHp = view.findViewById(R.id.noHp_passing_text_view)
        val patchName = arguments.patch.name
        val patchNoHp = arguments.patch.noHp
        passingName.text = patchName
        passingNoHp.text = patchNoHp


    }


}
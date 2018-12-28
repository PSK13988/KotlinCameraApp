package com.shiva.kotlincameraapp.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.shiva.kotlincameraapp.R
import kotlinx.android.synthetic.main.fragment_java.view.*

class PhpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_php, container, false)

        view.androidButton!!.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, "PHP fragment", Toast.LENGTH_SHORT).show()
        })
        return view
    }
}

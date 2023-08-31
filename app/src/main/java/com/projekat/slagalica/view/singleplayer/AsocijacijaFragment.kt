package com.projekat.slagalica.view.singleplayer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projekat.slagalica.AsocijacijaViewModel
import com.projekat.slagalica.R

class AsocijacijaFragment : Fragment() {

    companion object {
        fun newInstance() = AsocijacijaFragment()
    }

    private lateinit var viewModel: AsocijacijaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_asocijacija, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AsocijacijaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
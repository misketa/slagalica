package com.projekat.slagalica.view.singleplayer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projekat.slagalica.R
import com.projekat.slagalica.SkockoViewModel

class SkockoFragment : Fragment() {

    companion object {
        fun newInstance() = SkockoFragment()
    }

    private lateinit var viewModel: SkockoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_skocko, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SkockoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
package com.projekat.slagalica.view.singleplayer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projekat.slagalica.R
import com.projekat.slagalica.SpojnicaViewModel

class SpojnicaFragment : Fragment() {

    companion object {
        fun newInstance() = SpojnicaFragment()
    }

    private lateinit var viewModel: SpojnicaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_spojnica, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpojnicaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
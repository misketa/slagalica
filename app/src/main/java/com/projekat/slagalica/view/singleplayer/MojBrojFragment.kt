package com.projekat.slagalica.view.singleplayer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projekat.slagalica.R
import com.projekat.slagalica.MojBrojViewModel

class MojBrojFragment : Fragment() {

    companion object {
        fun newInstance() = MojBrojFragment()
    }

    private lateinit var viewModel: MojBrojViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_moj_broj, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MojBrojViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
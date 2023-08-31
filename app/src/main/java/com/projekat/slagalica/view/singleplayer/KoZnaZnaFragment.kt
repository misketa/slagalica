package com.projekat.slagalica.view.singleplayer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projekat.slagalica.KoZnaZnaViewModel
import com.projekat.slagalica.R

class KoZnaZnaFragment : Fragment() {

    companion object {
        fun newInstance() = KoZnaZnaFragment()
    }

    private lateinit var viewModel: KoZnaZnaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ko_zna_zna, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[KoZnaZnaViewModel::class.java]
        // TODO: Use the ViewModel
    }

}
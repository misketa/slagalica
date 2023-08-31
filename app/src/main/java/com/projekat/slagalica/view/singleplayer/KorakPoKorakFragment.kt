package com.projekat.slagalica.view.singleplayer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projekat.slagalica.KorakPoKorakViewModel
import com.projekat.slagalica.R

class KorakPoKorakFragment : Fragment() {

    companion object {
        fun newInstance() = KorakPoKorakFragment()
    }

    private lateinit var viewModel: KorakPoKorakViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_korak_po_korak, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(KorakPoKorakViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
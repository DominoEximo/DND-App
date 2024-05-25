package com.example.dndapp.ui.puzzles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.dndapp.R
import com.example.dndapp.databinding.FragmentSlideshowBinding
import com.example.dndapp.ui.slideshow.SlideshowViewModel


/**
 * A simple [Fragment] subclass.
 * Use the [PuzzlesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PuzzlesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_puzzles, container, false)


        return root
    }

}
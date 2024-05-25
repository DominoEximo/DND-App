package com.example.dndapp.ui.puzzles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/**
 * TODO: document your custom view class.
 */
class PuzzlesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is puzzles Fragment"
    }
    val text: LiveData<String> = _text
}
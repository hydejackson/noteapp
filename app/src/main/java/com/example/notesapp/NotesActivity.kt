package com.example.notesapp

import Adapter.NotesAdapter
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notesapp.databinding.ActivityNotesBinding
import entities.Notes

class NotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotesBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.addNoteButton.setOnClickListener{
            (binding.notesRecyclerView.adapter as NotesAdapter).addNote(Notes("test","test"))
                binding.notesRecyclerView.smoothScrollToPosition((binding.notesRecyclerView.adapter as NotesAdapter).itemCount - 1)
        }
    }
}
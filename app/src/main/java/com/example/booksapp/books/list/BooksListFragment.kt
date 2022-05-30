package com.example.booksapp.books.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.booksapp.Book
import com.example.booksapp.databinding.FragmentBooksListBinding

class BooksListFragment : Fragment() {

    lateinit var binding: FragmentBooksListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBooksListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        booksList.adapter = BooksAdapter(
            listOf(
                Book("orlovi rano lete", "Ivo Andric", ""),
                Book("Ima jedna krcma u planini", "Miroslav Ilic", "")
            )
        )
    }
}
package com.pqt.hackernews.ui.top

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.pqt.hackernews.R
import com.pqt.hackernews.databinding.TopNewsActBinding
import com.pqt.hackernews.repository.NewsRepository
import com.pqt.hackernews.viewmodels.TopNewsModel

class TopNewsActivity : AppCompatActivity() {

    private lateinit var binding: TopNewsActBinding

    private lateinit var topNewsViewModel: TopNewsModel
    private lateinit var topNewsModelFactory: TopNewsModel.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TopNewsActBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {

        topNewsModelFactory = TopNewsModel.Factory(application /*,NewsRepository*/)
        topNewsViewModel =
            ViewModelProvider(this, topNewsModelFactory).get(TopNewsModel::class.java)
    }
}
package com.pqt.hackernews.domain

data class TopNews(val id: Int,
                   val title: String) {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}
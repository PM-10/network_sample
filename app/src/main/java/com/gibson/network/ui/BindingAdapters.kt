package com.gibson.network.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bind:loadImage")
fun loadImage(view: ImageView, url: String?) {
    url?.let {
        Glide.with(view.context)
            .load(url)
            .circleCrop()
            .into(view)
    }
}
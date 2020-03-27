package com.example.helloworld.activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picasso.*

class PicassoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        btnLoader.setOnClickListener { loadImages() }

        Picasso.with(this).load("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg").fetch()
    }

    fun loadImages() {
//        Picasso
//                .with(this)
//            .load("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg")
//            .fit()
//            .into(imageViewTop)

        Picasso
            .with(this)
            .load("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg")
            .resize(400, 400)
            .centerInside()
            .into(imageViewTop)

//        Picasso
//            .with(this)
//            .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
//            .fit()
//            .into(imageViewBottom)
//
//        Picasso
//            .with(this)
//            .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
//            .fit()
//            .transform(CircleTransform())
//            .into(imageViewBottom)

        val context: Context = this

        Picasso
            .with(this)
            .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
            .fetch(object: Callback {
                override fun onSuccess() {
                    imageViewBottom.alpha = 0f
                    Picasso
                        .with(context)
                        .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
                        .fit()
                        .into(imageViewBottom)
                    imageViewBottom.animate().setDuration(1300).alpha(1f).start()
                }

                override fun onError() {
                    TODO("Not yet implemented")
                }

            })
    }
}

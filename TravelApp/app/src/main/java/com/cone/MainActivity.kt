package com.cone

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var currentImage = 0
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)
        var txView = findViewById<TextView>(R.id.tVview)

        next.setOnClickListener {
            var idCurrentImageString = "d$currentImage"
            var idCurrentImageInt =
                this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (3 + currentImage + 1) % 3

            var idImageToShowString = "d$currentImage"
            var idImageToShowInt =
                this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
        }

        prev.setOnClickListener {
            var idCurrentImageString = "d$currentImage"
            var idCurrentImageInt =
                this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            txView.text="ss"
            currentImage = (3 + currentImage - 1) % 3

            var idImageToShowString = "d$currentImage"
            var idImageToShowInt =
                this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
        }
    }
}

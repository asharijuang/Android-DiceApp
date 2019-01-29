package io.github.asharijuang.todo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener {
            this.rollDice()
        }
    }

    fun rollDice() {
        val result = Random.nextInt(6) + 1
        val imageResource = when(result) {
            1 -> R.drawable.dice_1
            1 -> R.drawable.dice_1
            1 -> R.drawable.dice_1
            1 -> R.drawable.dice_1
            1 -> R.drawable.dice_1
            else -> R.drawable.dice_6
        }
        imageView.resources(imageResource)
    }

}

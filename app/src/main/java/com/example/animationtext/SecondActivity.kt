package com.example.animationtext

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.animationtext.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        clickListener()
    }

    private fun clickListener() {
        binding.btnBlink.setOnClickListener {
            // adding the color to be shown
            // adding the color to be shown
            val animator =
                ObjectAnimator.ofInt(
                    binding.tvBlink,
                    "backgroundColor",
                    Color.BLUE,
                    Color.RED,
                    Color.GREEN
                )
            animator.duration = 500
            animator.setEvaluator(ArgbEvaluator())
            animator.repeatCount = Animation.REVERSE
            animator.repeatCount = Animation.INFINITE
            animator.start()
        }
        cardViewAnimation()
    }

    private fun cardViewAnimation() {
        /*    val rotateAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.card_rotet)
         //  val cardStroke = cardView.findViewById<androidx.cardview.widget.CardView>(R.id.cardView)
         try {
             binding.cardView.startAnimation(rotateAnimation)
         } catch (e: Exception) {
             e.printStackTrace()
             Log.d("TAG", "$e")
         }*/
    }
}
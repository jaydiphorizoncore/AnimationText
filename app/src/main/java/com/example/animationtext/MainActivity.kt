package com.example.animationtext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.example.animationtext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*   binding.btn.setOnClickListener {
               val textToAnimate = binding.tvOne.text.toString()
               binding.tvOne.startAnimation(
                   android.view.animation.AnimationUtils.loadAnimation(
                       this, R.anim.slide_down
                   )
               )
               binding.tvTwo.text = textToAnimate
           }*/

        clickListener()

    }

    private fun clickListener() {

        binding.btnTranslate.setOnClickListener {
            val move = AnimationUtils.loadAnimation(this, R.anim.move)
            binding.tvAnimation.startAnimation(move)

        }
        binding.btnAlpha.setOnClickListener {
            val alpha = AnimationUtils.loadAnimation(this, R.anim.alpha)
            binding.tvAnimation.startAnimation(alpha)
        }
        binding.btnRotate.setOnClickListener {
            val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            binding.tvAnimation.startAnimation(rotate)
        }
        binding.btnScale.setOnClickListener {
            val scale = AnimationUtils.loadAnimation(this, R.anim.scale)
            binding.tvAnimation.startAnimation(scale)
        }
        binding.btnNextActivity.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }
    }
}
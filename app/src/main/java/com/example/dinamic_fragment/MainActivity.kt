package com.example.dinamic_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dinamic_fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val blankFragment = BlankFragment()
        val blankFragment2 = BlankFragment2()

        binding.apply {
            btnAdd.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .add(R.id.my_container, blankFragment)
                    .commit()
            }
            btnRemove.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .remove(blankFragment)
                    .commit()
            }
            btnHide.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .hide(blankFragment)
                    .commit()
            }
            btnShow.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .show(blankFragment)
                    .commit()
            }
            btnReplace.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .addToBackStack("key")
                    .replace(R.id.my_container, blankFragment2)
                    .commit()
            }
        }
    }
}
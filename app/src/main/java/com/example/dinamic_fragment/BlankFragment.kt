package com.example.dinamic_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.dinamic_fragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private val blankBinding by lazy { FragmentBlankBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        blankBinding.text1.setOnClickListener {
            Toast.makeText(blankBinding.root.context, "Salom!", Toast.LENGTH_SHORT).show()
        }
        return blankBinding.root
    }


}
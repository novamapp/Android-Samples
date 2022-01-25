package com.example.day001

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FragmentTwo: Fragment(), View.OnClickListener, RandGenInterface {
    private lateinit var btnGoBack: Button
    private lateinit var tvRandNum: TextView

    val args: FragmentTwoArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btnFragTwo) {
            findNavController()
                .navigate(
                    FragmentTwoDirections.actionFragmentTwoToFragmentOne(
                        (object: RandGenInterface{}).getRandomNum()
                    )
                )
        }
    }

    private fun setupView(view: View) {
        btnGoBack = view.findViewById(R.id.btnFragTwo)
        btnGoBack.setOnClickListener(this)
        tvRandNum = view.findViewById(R.id.tvFragTwoRandNum)
        tvRandNum.text = args.NumFromOne.toString()
    }
}
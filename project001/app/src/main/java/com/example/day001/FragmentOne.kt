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

class FragmentOne: Fragment(), View.OnClickListener, RandGenInterface {
    private lateinit var btnForward: Button
    private lateinit var tvRandNum: TextView

    val args: FragmentOneArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btnFragOne) {
            findNavController()
                .navigate(
                    FragmentOneDirections.actionFragmentOneToFragmentTwo(
                        (object : RandGenInterface{}).getRandomNum()
                    )
                )
        }
    }

    private fun setupView(view: View) {
        btnForward = view.findViewById(R.id.btnFragOne)
        btnForward.setOnClickListener(this)
        tvRandNum = view.findViewById(R.id.tvFragOneRandNum)
        tvRandNum.text = args.NumFromTwo.toString()
    }
}
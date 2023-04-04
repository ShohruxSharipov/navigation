package com.example.regfrag

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.regfrag.Fragments.First
import com.example.regfrag.Fragments.Second
import com.example.regfrag.Fragments.Third
import com.example.regfrag.databinding.FragmentHomeBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFr : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    var first = false
    var second = false
    var third = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.one.setOnClickListener {
            Change(R.id.to_first)
        }
        binding.two.setOnClickListener {
            Change(R.id.to_second)

        }
        binding.three.setOnClickListener {
            Change(R.id.to_third)
        }
            return binding.root
        }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFr().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    fun Change(a: Int) {

                findNavController().navigate(a)
//            else if (a == 2)
//                findNavController().navigate(R.id.secind)
//            else
//                findNavController().navigate(R.id.third)

    }
}
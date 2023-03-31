package asilbek.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import asilbek.fragment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater,container, false)


        binding.home.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.homemain,CabinetFragment())
                .commit()
        }
        return binding.root
    }




}
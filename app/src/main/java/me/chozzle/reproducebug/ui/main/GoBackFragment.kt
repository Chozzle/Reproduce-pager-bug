package me.chozzle.reproducebug.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.chozzle.reproducebug.databinding.FragmentGoBackBinding

/**
 * A placeholder fragment containing a simple view.
 */
class GoBackFragment : Fragment() {

    private var _binding: FragmentGoBackBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGoBackBinding.inflate(inflater, container, false)
        val root = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
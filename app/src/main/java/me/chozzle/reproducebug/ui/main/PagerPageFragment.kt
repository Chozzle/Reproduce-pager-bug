package me.chozzle.reproducebug.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import me.chozzle.reproducebug.R
import me.chozzle.reproducebug.databinding.FragmentPagerPageBinding

/**
 * A placeholder fragment containing a simple view.
 */
class PagerPageFragment : Fragment() {

    private var _binding: FragmentPagerPageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPagerPageBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.navigateButton.setOnClickListener {
            findNavController().navigate(R.id.action_placeholderFragment_to_goBackFragment)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
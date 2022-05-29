package me.chozzle.reproducebug.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.viewinterop.AndroidViewBinding
import androidx.fragment.app.Fragment
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import me.chozzle.reproducebug.databinding.FragmentHomeBinding
import me.chozzle.reproducebug.databinding.PagerPageContainerBinding

/**
 * A placeholder fragment containing a simple view.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    @OptIn(ExperimentalPagerApi::class)
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root = binding.root

        _binding!!.viewPagerCompose.setContent {
            val pagerState = rememberPagerState()
            HorizontalPager(count = 1, state = pagerState) { page ->
                AndroidViewBinding(PagerPageContainerBinding::inflate) {

                }
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
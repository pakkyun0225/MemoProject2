package kr.co.lion.memoprojcet2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.lion.memoprojcet2.databinding.FragmentCalendarBinding
import kr.co.lion.memoprojcet2.databinding.FragmentShowMemoBinding

class ShowMemoFragment : Fragment() {
    lateinit var fragmentShowMemoBinding: FragmentShowMemoBinding
    lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentShowMemoBinding = FragmentShowMemoBinding.inflate(inflater)
        mainActivity = activity as MainActivity

        return fragmentShowMemoBinding.root
    }
}

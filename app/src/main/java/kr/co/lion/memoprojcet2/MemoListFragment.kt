package kr.co.lion.memoprojcet2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.lion.memoprojcet2.databinding.FragmentCalendarBinding
import kr.co.lion.memoprojcet2.databinding.FragmentMemoListBinding
import kr.co.lion.memoprojcet2.databinding.FragmentShowMemoBinding

class MemoListFragment : Fragment() {
    lateinit var fragmentMemoListBinding: FragmentMemoListBinding
    lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentMemoListBinding = FragmentMemoListBinding.inflate(inflater)
        mainActivity = activity as MainActivity

        return fragmentMemoListBinding.root
    }
}

package com.letuse.actionbar

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment

class threeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false)
    }


}
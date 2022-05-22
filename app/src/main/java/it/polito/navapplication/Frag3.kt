package it.polito.navapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Frag3: Fragment(R.layout.frag3_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv = view.findViewById<TextView>(R.id.textView)

        tv.setOnClickListener{
            findNavController().navigate(R.id.action_frag3_to_frag1)
        }
    }
}
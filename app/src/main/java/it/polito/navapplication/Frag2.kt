package it.polito.navapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Frag2: Fragment(R.layout.frag2_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv = view.findViewById<TextView>(R.id.textView)

        tv.setOnClickListener{
            findNavController().navigate(R.id.action_frag2_to_frag3)
        }
    }
}
package com.letuse.actionbar

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment

class twoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onViewCreated(view, savedInstanceState)

    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        //inflate menu
        inflater.inflate(R.menu.menu_main,menu)
        //hide item add
        menu.findItem(R.id.action_add).setVisible(false)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //handle menu item clicks
        var id : Int = item.itemId

        if(id == R.id.action_setting){
            Toast.makeText(context , "setting" , Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }
}
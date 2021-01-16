package com.ab.grocerydelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ab.grocerydelivery.data.GroceryItem

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    //    view.findViewById<Button>(R.id.button_first).setOnClickListener {
    //        findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
    //    }

     val groceryItems = listOf(
         GroceryItem("Brown Eggs", 3.99, "Delicious Brown Eggs" ),
         GroceryItem("Potatoes", 6.99, "Boil 'em, Mash 'em, Stick 'em in a stew" ),
         GroceryItem("Strawberries", 9.99, "Freshly Picked" ),
         GroceryItem("Brown Eggs", 3.99, "Delicious Brown Eggs" ),
         GroceryItem("Brown Eggs", 3.99, "Delicious Brown Eggs" ),
         GroceryItem("Brown Eggs", 3.99, "Delicious Brown Eggs" ),
         GroceryItem("Brown Eggs", 3.99, "Delicious Brown Eggs" ),
         GroceryItem("Brown Eggs", 3.99, "Delicious Brown Eggs" ),
         GroceryItem("Brown Eggs", 3.99, "Delicious Brown Eggs" ),
         )

        view.findViewById<RecyclerView>(R.id.groceryRecyclerView).apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = GroceryAdapter(groceryItems)
        }

    }
}
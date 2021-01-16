package com.ab.grocerydelivery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ab.grocerydelivery.data.GroceryItem
import kotlinx.android.synthetic.main.a_single_restaurant_row.view.*



class GroceryAdapter(private val groceryItems: List<GroceryItem>) :
    RecyclerView.Adapter<GroceryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.a_single_grocery_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount()= groceryItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val groceryItem = groceryItems[position]
        holder.bind(groceryItem)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(groceryItem: GroceryItem) {
            itemView.groceryItemTitle.text = groceryItem.name


        }

    }
}
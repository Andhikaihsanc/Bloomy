package com.blommy.app.modules.reviews.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListvectorBinding
import com.blommy.app.modules.reviews.`data`.model.ListvectorRowModel
import kotlin.Int
import kotlin.collections.List

class ListvectorAdapter(
  var list: List<ListvectorRowModel>
) : RecyclerView.Adapter<ListvectorAdapter.RowListvectorVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvectorVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvector,parent,false)
    return RowListvectorVH(view)
  }

  override fun onBindViewHolder(holder: RowListvectorVH, position: Int) {
    val listvectorRowModel = ListvectorRowModel()
    // TODO uncomment following line after integration with data source
    // val listvectorRowModel = list[position]
    holder.binding.listvectorRowModel = listvectorRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListvectorRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListvectorRowModel
    ) {
    }
  }

  inner class RowListvectorVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvectorBinding = RowListvectorBinding.bind(itemView)
  }
}

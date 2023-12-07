package com.blommy.app.modules.reviews.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListkatonabeatrixBinding
import com.blommy.app.modules.reviews.`data`.model.ListkatonabeatrixRowModel
import kotlin.Int
import kotlin.collections.List

class ListkatonabeatrixAdapter(
  var list: List<ListkatonabeatrixRowModel>
) : RecyclerView.Adapter<ListkatonabeatrixAdapter.RowListkatonabeatrixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkatonabeatrixVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkatonabeatrix,parent,false)
    return RowListkatonabeatrixVH(view)
  }

  override fun onBindViewHolder(holder: RowListkatonabeatrixVH, position: Int) {
    val listkatonabeatrixRowModel = ListkatonabeatrixRowModel()
    // TODO uncomment following line after integration with data source
    // val listkatonabeatrixRowModel = list[position]
    holder.binding.listkatonabeatrixRowModel = listkatonabeatrixRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkatonabeatrixRowModel>) {
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
      item: ListkatonabeatrixRowModel
    ) {
    }
  }

  inner class RowListkatonabeatrixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkatonabeatrixBinding = RowListkatonabeatrixBinding.bind(itemView)
  }
}

package com.blommy.app.modules.checkout.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListmoreverticalBinding
import com.blommy.app.modules.checkout.`data`.model.ListmoreverticalRowModel
import kotlin.Int
import kotlin.collections.List

class ListmoreverticalAdapter(
  var list: List<ListmoreverticalRowModel>
) : RecyclerView.Adapter<ListmoreverticalAdapter.RowListmoreverticalVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmoreverticalVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmorevertical,parent,false)
    return RowListmoreverticalVH(view)
  }

  override fun onBindViewHolder(holder: RowListmoreverticalVH, position: Int) {
    val listmoreverticalRowModel = ListmoreverticalRowModel()
    // TODO uncomment following line after integration with data source
    // val listmoreverticalRowModel = list[position]
    holder.binding.listmoreverticalRowModel = listmoreverticalRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmoreverticalRowModel>) {
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
      item: ListmoreverticalRowModel
    ) {
    }
  }

  inner class RowListmoreverticalVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmoreverticalBinding = RowListmoreverticalBinding.bind(itemView)
  }
}

package com.blommy.app.modules.productlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListrectangleseventythreeBinding
import com.blommy.app.modules.productlist.`data`.model.ListrectangleseventythreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleseventythreeAdapter(
  var list: List<ListrectangleseventythreeRowModel>
) : RecyclerView.Adapter<ListrectangleseventythreeAdapter.RowListrectangleseventythreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListrectangleseventythreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleseventythree,parent,false)
    return RowListrectangleseventythreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleseventythreeVH, position: Int) {
    val listrectangleseventythreeRowModel = ListrectangleseventythreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleseventythreeRowModel = list[position]
    holder.binding.listrectangleseventythreeRowModel = listrectangleseventythreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleseventythreeRowModel>) {
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
      item: ListrectangleseventythreeRowModel
    ) {
    }
  }

  inner class RowListrectangleseventythreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleseventythreeBinding =
        RowListrectangleseventythreeBinding.bind(itemView)
  }
}

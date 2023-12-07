package com.blommy.app.modules.productlistseller.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowGridrectangleseventythree1Binding
import com.blommy.app.modules.productlistseller.`data`.model.Gridrectangleseventythree1RowModel
import kotlin.Int
import kotlin.collections.List

class GridrectangleseventythreeAdapter(
  var list: List<Gridrectangleseventythree1RowModel>
) : RecyclerView.Adapter<GridrectangleseventythreeAdapter.RowGridrectangleseventythree1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowGridrectangleseventythree1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridrectangleseventythree1,parent,false)
    return RowGridrectangleseventythree1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridrectangleseventythree1VH, position: Int) {
    val gridrectangleseventythree1RowModel = Gridrectangleseventythree1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridrectangleseventythree1RowModel = list[position]
    holder.binding.gridrectangleseventythree1RowModel = gridrectangleseventythree1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridrectangleseventythree1RowModel>) {
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
      item: Gridrectangleseventythree1RowModel
    ) {
    }
  }

  inner class RowGridrectangleseventythree1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridrectangleseventythree1Binding =
        RowGridrectangleseventythree1Binding.bind(itemView)
    init {
      binding.linearColumnrectangleseventythree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Gridrectangleseventythree1RowModel())
      }
    }
  }
}

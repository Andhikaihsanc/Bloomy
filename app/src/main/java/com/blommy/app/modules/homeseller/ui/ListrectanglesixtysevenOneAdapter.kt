package com.blommy.app.modules.homeseller.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListrectanglesixtysevenOne1Binding
import com.blommy.app.modules.homeseller.`data`.model.ListrectanglesixtysevenOne1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglesixtysevenOneAdapter(
  var list: List<ListrectanglesixtysevenOne1RowModel>
) : RecyclerView.Adapter<ListrectanglesixtysevenOneAdapter.RowListrectanglesixtysevenOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListrectanglesixtysevenOne1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglesixtyseven_one1,parent,false)
    return RowListrectanglesixtysevenOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglesixtysevenOne1VH, position: Int) {
    val listrectanglesixtysevenOne1RowModel = ListrectanglesixtysevenOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglesixtysevenOne1RowModel = list[position]
    holder.binding.listrectanglesixtysevenOne1RowModel = listrectanglesixtysevenOne1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglesixtysevenOne1RowModel>) {
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
      item: ListrectanglesixtysevenOne1RowModel
    ) {
    }
  }

  inner class RowListrectanglesixtysevenOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglesixtysevenOne1Binding =
        RowListrectanglesixtysevenOne1Binding.bind(itemView)
    init {
      binding.linearColumnrectanglesixtysevenOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglesixtysevenOne1RowModel())
      }
      binding.linearColumnrectanglesixtyeightOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglesixtysevenOne1RowModel())
      }
      binding.linearColumnrectanglesixtynineOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglesixtysevenOne1RowModel())
      }
    }
  }
}

package com.blommy.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListrectanglesixtysevenOneBinding
import com.blommy.app.modules.home.`data`.model.ListrectanglesixtysevenOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglesixtysevenOneAdapter(
  var list: List<ListrectanglesixtysevenOneRowModel>
) : RecyclerView.Adapter<ListrectanglesixtysevenOneAdapter.RowListrectanglesixtysevenOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListrectanglesixtysevenOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglesixtyseven_one,parent,false)
    return RowListrectanglesixtysevenOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglesixtysevenOneVH, position: Int) {
    val listrectanglesixtysevenOneRowModel = ListrectanglesixtysevenOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglesixtysevenOneRowModel = list[position]
    holder.binding.listrectanglesixtysevenOneRowModel = listrectanglesixtysevenOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglesixtysevenOneRowModel>) {
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
      item: ListrectanglesixtysevenOneRowModel
    ) {
    }
  }

  inner class RowListrectanglesixtysevenOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglesixtysevenOneBinding =
        RowListrectanglesixtysevenOneBinding.bind(itemView)
    init {
      binding.linearColumnrectanglesixtysevenOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglesixtysevenOneRowModel())
      }
      binding.linearColumnrectanglesixtyeightOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglesixtysevenOneRowModel())
      }
      binding.linearColumnrectanglesixtynineOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglesixtysevenOneRowModel())
      }
    }
  }
}

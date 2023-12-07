package com.blommy.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListrectanglesixtysevenBinding
import com.blommy.app.modules.home.`data`.model.ListrectanglesixtysevenRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglesixtysevenAdapter(
  var list: List<ListrectanglesixtysevenRowModel>
) : RecyclerView.Adapter<ListrectanglesixtysevenAdapter.RowListrectanglesixtysevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglesixtysevenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglesixtyseven,parent,false)
    return RowListrectanglesixtysevenVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglesixtysevenVH, position: Int) {
    val listrectanglesixtysevenRowModel = ListrectanglesixtysevenRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglesixtysevenRowModel = list[position]
    holder.binding.listrectanglesixtysevenRowModel = listrectanglesixtysevenRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglesixtysevenRowModel>) {
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
      item: ListrectanglesixtysevenRowModel
    ) {
    }
  }

  inner class RowListrectanglesixtysevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglesixtysevenBinding =
        RowListrectanglesixtysevenBinding.bind(itemView)
    init {
      binding.linearColumnrectanglesixtyseven.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglesixtysevenRowModel())
      }
    }
  }
}

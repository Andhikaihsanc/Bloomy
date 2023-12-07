package com.blommy.app.modules.homeseller.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListrectanglesixtyseven1Binding
import com.blommy.app.modules.homeseller.`data`.model.Listrectanglesixtyseven1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglesixtysevenAdapter(
  var list: List<Listrectanglesixtyseven1RowModel>
) : RecyclerView.Adapter<ListrectanglesixtysevenAdapter.RowListrectanglesixtyseven1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglesixtyseven1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglesixtyseven1,parent,false)
    return RowListrectanglesixtyseven1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglesixtyseven1VH, position: Int) {
    val listrectanglesixtyseven1RowModel = Listrectanglesixtyseven1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglesixtyseven1RowModel = list[position]
    holder.binding.listrectanglesixtyseven1RowModel = listrectanglesixtyseven1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglesixtyseven1RowModel>) {
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
      item: Listrectanglesixtyseven1RowModel
    ) {
    }
  }

  inner class RowListrectanglesixtyseven1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglesixtyseven1Binding =
        RowListrectanglesixtyseven1Binding.bind(itemView)
    init {
      binding.linearColumnrectanglesixtyseven.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listrectanglesixtyseven1RowModel())
      }
    }
  }
}

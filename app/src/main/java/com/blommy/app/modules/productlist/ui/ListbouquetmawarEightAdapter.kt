package com.blommy.app.modules.productlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListbouquetmawarEightBinding
import com.blommy.app.modules.productlist.`data`.model.ListbouquetmawarEightRowModel
import kotlin.Int
import kotlin.collections.List

class ListbouquetmawarEightAdapter(
  var list: List<ListbouquetmawarEightRowModel>
) : RecyclerView.Adapter<ListbouquetmawarEightAdapter.RowListbouquetmawarEightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbouquetmawarEightVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbouquetmawar_eight,parent,false)
    return RowListbouquetmawarEightVH(view)
  }

  override fun onBindViewHolder(holder: RowListbouquetmawarEightVH, position: Int) {
    val listbouquetmawarEightRowModel = ListbouquetmawarEightRowModel()
    // TODO uncomment following line after integration with data source
    // val listbouquetmawarEightRowModel = list[position]
    holder.binding.listbouquetmawarEightRowModel = listbouquetmawarEightRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbouquetmawarEightRowModel>) {
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
      item: ListbouquetmawarEightRowModel
    ) {
    }
  }

  inner class RowListbouquetmawarEightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbouquetmawarEightBinding = RowListbouquetmawarEightBinding.bind(itemView)
    init {
      binding.frameStackbouquetmawarEight.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListbouquetmawarEightRowModel())
      }
    }
  }
}

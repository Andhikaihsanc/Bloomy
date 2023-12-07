package com.blommy.app.modules.productlistseller.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowListrectangleseventythreeFourBinding
import com.blommy.app.modules.productlistseller.`data`.model.ListrectangleseventythreeFourRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleseventythreeFourAdapter(
  var list: List<ListrectangleseventythreeFourRowModel>
) : RecyclerView.Adapter<ListrectangleseventythreeFourAdapter.RowListrectangleseventythreeFourVH>()
    {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListrectangleseventythreeFourVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleseventythree_four,parent,false)
    return RowListrectangleseventythreeFourVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleseventythreeFourVH, position: Int) {
    val listrectangleseventythreeFourRowModel = ListrectangleseventythreeFourRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleseventythreeFourRowModel = list[position]
    holder.binding.listrectangleseventythreeFourRowModel = listrectangleseventythreeFourRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleseventythreeFourRowModel>) {
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
      item: ListrectangleseventythreeFourRowModel
    ) {
    }
  }

  inner class RowListrectangleseventythreeFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleseventythreeFourBinding =
        RowListrectangleseventythreeFourBinding.bind(itemView)
    init {
      binding.linearColumn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangleseventythreeFourRowModel())
      }
      binding.frameStackbouquetmawarTwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangleseventythreeFourRowModel())
      }
    }
  }
}

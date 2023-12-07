package com.blommy.app.modules.chatsseller.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blommy.app.R
import com.blommy.app.databinding.RowChatsSellerBinding
import com.blommy.app.modules.chatsseller.`data`.model.ChatsSellerRowModel
import kotlin.Int
import kotlin.collections.List

class ChatssellerAdapter(
  var list: List<ChatsSellerRowModel>
) : RecyclerView.Adapter<ChatssellerAdapter.RowChatsSellerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChatsSellerVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_chats_seller,parent,false)
    return RowChatsSellerVH(view)
  }

  override fun onBindViewHolder(holder: RowChatsSellerVH, position: Int) {
    val chatsSellerRowModel = ChatsSellerRowModel()
    // TODO uncomment following line after integration with data source
    // val chatsSellerRowModel = list[position]
    holder.binding.chatsSellerRowModel = chatsSellerRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ChatsSellerRowModel>) {
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
      item: ChatsSellerRowModel
    ) {
    }
  }

  inner class RowChatsSellerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowChatsSellerBinding = RowChatsSellerBinding.bind(itemView)
  }
}

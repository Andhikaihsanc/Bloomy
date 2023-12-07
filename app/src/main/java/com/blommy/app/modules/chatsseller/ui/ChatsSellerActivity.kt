package com.blommy.app.modules.chatsseller.ui

import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityChatsSellerBinding
import com.blommy.app.modules.chatsseller.`data`.model.ChatsSellerRowModel
import com.blommy.app.modules.chatsseller.`data`.viewmodel.ChatsSellerVM
import com.blommy.app.modules.profileseller.ui.ProfileSellerActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatsSellerActivity : BaseActivity<ActivityChatsSellerBinding>(R.layout.activity_chats_seller)
    {
  private val viewModel: ChatsSellerVM by viewModels<ChatsSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val chatssellerAdapter =
    ChatssellerAdapter(viewModel.chatssellerList.value?:mutableListOf())
    binding.recyclerChatsseller.adapter = chatssellerAdapter
    chatssellerAdapter.setOnItemClickListener(
    object : ChatssellerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatsSellerRowModel) {
        onClickRecyclerChatsseller(view, position, item)
      }
    }
    )
    viewModel.chatssellerList.observe(this) {
      chatssellerAdapter.updateData(it)
    }
    binding.chatsSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnlayerone.setOnClickListener {
      val destIntent = ProfileSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerChatsseller(
    view: View,
    position: Int,
    item: ChatsSellerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHATS_SELLER_ACTIVITY"

  }
}

package com.blommy.app.modules.chats.ui

import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityChatsBinding
import com.blommy.app.modules.cart.ui.CartActivity
import com.blommy.app.modules.chats.`data`.model.ChatsRowModel
import com.blommy.app.modules.chats.`data`.viewmodel.ChatsVM
import com.blommy.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatsActivity : BaseActivity<ActivityChatsBinding>(R.layout.activity_chats) {
  private val viewModel: ChatsVM by viewModels<ChatsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val chatsAdapter = ChatsAdapter(viewModel.chatsList.value?:mutableListOf())
    binding.recyclerChats.adapter = chatsAdapter
    chatsAdapter.setOnItemClickListener(
    object : ChatsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatsRowModel) {
        onClickRecyclerChats(view, position, item)
      }
    }
    )
    viewModel.chatsList.observe(this) {
      chatsAdapter.updateData(it)
    }
    binding.chatsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackvector.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnlayerone.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerChats(
    view: View,
    position: Int,
    item: ChatsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHATS_ACTIVITY"

  }
}

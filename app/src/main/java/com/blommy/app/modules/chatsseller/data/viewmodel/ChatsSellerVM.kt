package com.blommy.app.modules.chatsseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.chatsseller.`data`.model.ChatsSellerModel
import com.blommy.app.modules.chatsseller.`data`.model.ChatsSellerRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChatsSellerVM : ViewModel(), KoinComponent {
  val chatsSellerModel: MutableLiveData<ChatsSellerModel> = MutableLiveData(ChatsSellerModel())

  var navArguments: Bundle? = null

  val chatssellerList: MutableLiveData<MutableList<ChatsSellerRowModel>> =
      MutableLiveData(mutableListOf())
}

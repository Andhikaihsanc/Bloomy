package com.blommy.app.modules.chatsseller.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsSellerRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDewaFloristOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dewaflorist1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_30_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)

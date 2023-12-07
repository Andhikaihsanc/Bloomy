package com.blommy.app.modules.productlist.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ListbouquetmawarEightRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBouquetmawarEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bouquet_mawar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDewafloristEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dewaflorist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_100_000)

)

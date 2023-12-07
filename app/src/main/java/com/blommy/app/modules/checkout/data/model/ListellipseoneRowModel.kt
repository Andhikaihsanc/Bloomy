package com.blommy.app.modules.checkout.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipseoneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBouquetMawar: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bouquet_mawar2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_124_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX1: String? = MyApp.getInstance().resources.getString(R.string.lbl_x1)

)

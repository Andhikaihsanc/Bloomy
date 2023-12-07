package com.blommy.app.modules.productlistseller.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ProductListSellerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKatalogBarang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_katalog_barang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_items)

)

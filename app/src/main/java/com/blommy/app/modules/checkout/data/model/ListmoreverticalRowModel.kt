package com.blommy.app.modules.checkout.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ListmoreverticalRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJlHRRasuna: String? = MyApp.getInstance().resources.getString(R.string.msg_jl_h_r_rasuna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_87201)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKotaMalang: String? = MyApp.getInstance().resources.getString(R.string.lbl_kota_malang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_indonesia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliveryAdress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delivery_adress)

)

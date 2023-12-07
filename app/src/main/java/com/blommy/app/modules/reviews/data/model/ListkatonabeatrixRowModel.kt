package com.blommy.app.modules.reviews.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ListkatonabeatrixRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKatonaBeatrix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_katona_beatrix)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUtenimadmini: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ut_enim_ad_mini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt20200505102: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2020_05_05_10_2)

)

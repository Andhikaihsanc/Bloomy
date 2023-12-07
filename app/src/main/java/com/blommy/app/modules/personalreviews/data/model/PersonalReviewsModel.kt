package com.blommy.app.modules.personalreviews.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class PersonalReviewsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_tambah_ulasan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTuliskanulasan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tuliskan_ulasan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPerlihatkannam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_perlihatkan_nam)
  ,
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

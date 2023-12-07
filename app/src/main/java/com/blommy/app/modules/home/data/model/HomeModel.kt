package com.blommy.app.modules.home.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNinetyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKategori: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_flowers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandbucket: String? = MyApp.getInstance().resources.getString(R.string.lbl_hand_bucket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlowerbox: String? = MyApp.getInstance().resources.getString(R.string.lbl_flower_box)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStandingflower: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_standing_flower)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRekomendasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_rekomendasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChats: String? = MyApp.getInstance().resources.getString(R.string.lbl_chats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)

)

package com.blommy.app.modules.profile.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_profile_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_jacob)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt337655572: String? = MyApp.getInstance().resources.getString(R.string.msg_33_7_65_55_72)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpCenter: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_center)
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
  var txtGroupFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup167Value: String? = null
)

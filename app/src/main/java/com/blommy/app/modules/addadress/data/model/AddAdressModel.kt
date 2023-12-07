package com.blommy.app.modules.addadress.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class AddAdressModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalDetail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personal_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullName: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLszlCintia: String? = MyApp.getInstance().resources.getString(R.string.lbl_l_szl_cintia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAdress: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_adress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAdressTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_adress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressDetail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_address_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProvince: String? = MyApp.getInstance().resources.getString(R.string.lbl_province)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJawaTimur: String? = MyApp.getInstance().resources.getString(R.string.lbl_jawa_timur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAdressThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_adress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAdressFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_adress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAdressFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_adress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAdressSix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_adress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup136Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup136OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup136TwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup136ThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup136FourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup136FiveValue: String? = null
)

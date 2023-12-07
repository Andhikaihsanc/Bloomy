package com.blommy.app.modules.checkout.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class CheckoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliveryAddres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_addres)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderSummary: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_atur_pengiriman)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightyFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_self_pick_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihPembayara: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilih_pembayara)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_cod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_banking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHargaBarang: String? = MyApp.getInstance().resources.getString(R.string.lbl_harga_barang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOngkir: String? = MyApp.getInstance().resources.getString(R.string.lbl_ongkir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_243_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_3_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_246_123)

)

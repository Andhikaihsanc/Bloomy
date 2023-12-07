package com.blommy.app.modules.tambahbarangseller.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class TambahBarangSellerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTambahBarang: String? = MyApp.getInstance().resources.getString(R.string.lbl_tambah_barang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaBarang: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama_barang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_deskripsi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBanyakbarang: String? = MyApp.getInstance().resources.getString(R.string.lbl_banyak_barang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_harga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori2)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRpCounterValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null
)

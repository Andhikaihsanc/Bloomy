package com.blommy.app.modules.tambahbarangseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.tambahbarangseller.`data`.model.TambahBarangSellerModel
import org.koin.core.KoinComponent

class TambahBarangSellerVM : ViewModel(), KoinComponent {
  val tambahBarangSellerModel: MutableLiveData<TambahBarangSellerModel> =
      MutableLiveData(TambahBarangSellerModel())

  var navArguments: Bundle? = null
}

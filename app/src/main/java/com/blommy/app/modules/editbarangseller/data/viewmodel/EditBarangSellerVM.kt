package com.blommy.app.modules.editbarangseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.editbarangseller.`data`.model.EditBarangSellerModel
import org.koin.core.KoinComponent

class EditBarangSellerVM : ViewModel(), KoinComponent {
  val editBarangSellerModel: MutableLiveData<EditBarangSellerModel> =
      MutableLiveData(EditBarangSellerModel())

  var navArguments: Bundle? = null
}

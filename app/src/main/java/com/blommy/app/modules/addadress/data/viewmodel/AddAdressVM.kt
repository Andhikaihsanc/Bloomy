package com.blommy.app.modules.addadress.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.addadress.`data`.model.AddAdressModel
import org.koin.core.KoinComponent

class AddAdressVM : ViewModel(), KoinComponent {
  val addAdressModel: MutableLiveData<AddAdressModel> = MutableLiveData(AddAdressModel())

  var navArguments: Bundle? = null
}

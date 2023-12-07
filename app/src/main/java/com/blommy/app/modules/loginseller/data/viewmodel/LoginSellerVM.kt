package com.blommy.app.modules.loginseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.loginseller.`data`.model.LoginSellerModel
import org.koin.core.KoinComponent

class LoginSellerVM : ViewModel(), KoinComponent {
  val loginSellerModel: MutableLiveData<LoginSellerModel> = MutableLiveData(LoginSellerModel())

  var navArguments: Bundle? = null
}

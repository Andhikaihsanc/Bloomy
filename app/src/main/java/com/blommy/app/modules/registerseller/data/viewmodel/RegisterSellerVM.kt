package com.blommy.app.modules.registerseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.registerseller.`data`.model.RegisterSellerModel
import org.koin.core.KoinComponent

class RegisterSellerVM : ViewModel(), KoinComponent {
  val registerSellerModel: MutableLiveData<RegisterSellerModel> =
      MutableLiveData(RegisterSellerModel())

  var navArguments: Bundle? = null
}

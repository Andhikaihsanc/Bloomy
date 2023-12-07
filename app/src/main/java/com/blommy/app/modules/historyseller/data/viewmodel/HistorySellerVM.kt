package com.blommy.app.modules.historyseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.historyseller.`data`.model.HistorySellerModel
import org.koin.core.KoinComponent

class HistorySellerVM : ViewModel(), KoinComponent {
  val historySellerModel: MutableLiveData<HistorySellerModel> =
      MutableLiveData(HistorySellerModel())

  var navArguments: Bundle? = null
}

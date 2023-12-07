package com.blommy.app.modules.checkout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.checkout.`data`.model.CheckoutModel
import com.blommy.app.modules.checkout.`data`.model.ListellipseoneRowModel
import com.blommy.app.modules.checkout.`data`.model.ListmoreverticalRowModel
import com.blommy.app.modules.checkout.`data`.model.SpinnerTimeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CheckoutVM : ViewModel(), KoinComponent {
  val checkoutModel: MutableLiveData<CheckoutModel> = MutableLiveData(CheckoutModel())

  var navArguments: Bundle? = null

  val spinnerTimeList: MutableLiveData<MutableList<SpinnerTimeModel>> = MutableLiveData()

  val listmoreverticalList: MutableLiveData<MutableList<ListmoreverticalRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipseoneList: MutableLiveData<MutableList<ListellipseoneRowModel>> =
      MutableLiveData(mutableListOf())
}

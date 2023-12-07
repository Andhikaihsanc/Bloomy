package com.blommy.app.modules.productdesc.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.productdesc.`data`.model.ProductDescModel
import org.koin.core.KoinComponent

class ProductDescVM : ViewModel(), KoinComponent {
  val productDescModel: MutableLiveData<ProductDescModel> = MutableLiveData(ProductDescModel())

  var navArguments: Bundle? = null
}

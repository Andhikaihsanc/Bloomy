package com.blommy.app.modules.productlistseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.productlistseller.`data`.model.Gridrectangleseventythree1RowModel
import com.blommy.app.modules.productlistseller.`data`.model.ListrectangleseventythreeFourRowModel
import com.blommy.app.modules.productlistseller.`data`.model.ProductListSellerModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductListSellerVM : ViewModel(), KoinComponent {
  val productListSellerModel: MutableLiveData<ProductListSellerModel> =
      MutableLiveData(ProductListSellerModel())

  var navArguments: Bundle? = null

  val gridrectangleseventythreeList:
      MutableLiveData<MutableList<Gridrectangleseventythree1RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangleseventythreeFourList:
      MutableLiveData<MutableList<ListrectangleseventythreeFourRowModel>> =
      MutableLiveData(mutableListOf())
}

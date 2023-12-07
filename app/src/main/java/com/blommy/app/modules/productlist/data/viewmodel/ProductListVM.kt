package com.blommy.app.modules.productlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.productlist.`data`.model.ListbouquetmawarEightRowModel
import com.blommy.app.modules.productlist.`data`.model.ListrectangleseventythreeRowModel
import com.blommy.app.modules.productlist.`data`.model.ProductListModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductListVM : ViewModel(), KoinComponent {
  val productListModel: MutableLiveData<ProductListModel> = MutableLiveData(ProductListModel())

  var navArguments: Bundle? = null

  val listrectangleseventythreeList: MutableLiveData<MutableList<ListrectangleseventythreeRowModel>>
      = MutableLiveData(mutableListOf())

  val listbouquetmawarEightList: MutableLiveData<MutableList<ListbouquetmawarEightRowModel>> =
      MutableLiveData(mutableListOf())
}

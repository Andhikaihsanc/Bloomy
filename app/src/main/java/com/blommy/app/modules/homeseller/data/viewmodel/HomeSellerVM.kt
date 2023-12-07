package com.blommy.app.modules.homeseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.homeseller.`data`.model.HomeSellerModel
import com.blommy.app.modules.homeseller.`data`.model.Listrectanglesixtyseven1RowModel
import com.blommy.app.modules.homeseller.`data`.model.ListrectanglesixtysevenOne1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeSellerVM : ViewModel(), KoinComponent {
  val homeSellerModel: MutableLiveData<HomeSellerModel> = MutableLiveData(HomeSellerModel())

  var navArguments: Bundle? = null

  val listrectanglesixtysevenList: MutableLiveData<MutableList<Listrectanglesixtyseven1RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglesixtysevenOneList:
      MutableLiveData<MutableList<ListrectanglesixtysevenOne1RowModel>> =
      MutableLiveData(mutableListOf())
}

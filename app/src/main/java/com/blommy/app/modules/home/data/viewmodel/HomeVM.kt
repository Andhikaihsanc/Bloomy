package com.blommy.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.home.`data`.model.HomeModel
import com.blommy.app.modules.home.`data`.model.ListrectanglesixtysevenOneRowModel
import com.blommy.app.modules.home.`data`.model.ListrectanglesixtysevenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val listrectanglesixtysevenList: MutableLiveData<MutableList<ListrectanglesixtysevenRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglesixtysevenOneList:
      MutableLiveData<MutableList<ListrectanglesixtysevenOneRowModel>> =
      MutableLiveData(mutableListOf())
}

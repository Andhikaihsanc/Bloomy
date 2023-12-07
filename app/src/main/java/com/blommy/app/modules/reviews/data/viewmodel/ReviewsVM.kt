package com.blommy.app.modules.reviews.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.reviews.`data`.model.ListkatonabeatrixRowModel
import com.blommy.app.modules.reviews.`data`.model.ListvectorRowModel
import com.blommy.app.modules.reviews.`data`.model.ReviewsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReviewsVM : ViewModel(), KoinComponent {
  val reviewsModel: MutableLiveData<ReviewsModel> = MutableLiveData(ReviewsModel())

  var navArguments: Bundle? = null

  val listvectorList: MutableLiveData<MutableList<ListvectorRowModel>> =
      MutableLiveData(mutableListOf())

  val listkatonabeatrixList: MutableLiveData<MutableList<ListkatonabeatrixRowModel>> =
      MutableLiveData(mutableListOf())
}

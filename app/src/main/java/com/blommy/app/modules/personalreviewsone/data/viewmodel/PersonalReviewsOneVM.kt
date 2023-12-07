package com.blommy.app.modules.personalreviewsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.personalreviewsone.`data`.model.PersonalReviewsOneModel
import org.koin.core.KoinComponent

class PersonalReviewsOneVM : ViewModel(), KoinComponent {
  val personalReviewsOneModel: MutableLiveData<PersonalReviewsOneModel> =
      MutableLiveData(PersonalReviewsOneModel())

  var navArguments: Bundle? = null
}

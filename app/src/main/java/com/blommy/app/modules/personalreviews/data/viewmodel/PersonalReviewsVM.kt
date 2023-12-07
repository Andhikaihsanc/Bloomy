package com.blommy.app.modules.personalreviews.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.personalreviews.`data`.model.PersonalReviewsModel
import org.koin.core.KoinComponent

class PersonalReviewsVM : ViewModel(), KoinComponent {
  val personalReviewsModel: MutableLiveData<PersonalReviewsModel> =
      MutableLiveData(PersonalReviewsModel())

  var navArguments: Bundle? = null
}

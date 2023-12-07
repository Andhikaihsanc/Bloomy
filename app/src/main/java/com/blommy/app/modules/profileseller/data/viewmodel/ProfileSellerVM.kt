package com.blommy.app.modules.profileseller.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blommy.app.modules.profileseller.`data`.model.ProfileSellerModel
import org.koin.core.KoinComponent

class ProfileSellerVM : ViewModel(), KoinComponent {
  val profileSellerModel: MutableLiveData<ProfileSellerModel> =
      MutableLiveData(ProfileSellerModel())

  var navArguments: Bundle? = null
}

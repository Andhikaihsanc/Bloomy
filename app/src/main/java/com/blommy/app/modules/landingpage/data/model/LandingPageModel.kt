package com.blommy.app.modules.landingpage.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class LandingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWELCOME: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)

)

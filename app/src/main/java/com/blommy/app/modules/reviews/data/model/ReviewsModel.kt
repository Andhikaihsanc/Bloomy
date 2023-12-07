package com.blommy.app.modules.reviews.`data`.model

import com.blommy.app.R
import com.blommy.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_82)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt30reviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_reviews)

)

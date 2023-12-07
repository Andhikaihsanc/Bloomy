package com.blommy.app.modules.personalreviewsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityPersonalReviewsOneBinding
import com.blommy.app.modules.personalreviewsone.`data`.viewmodel.PersonalReviewsOneVM
import kotlin.String
import kotlin.Unit

class PersonalReviewsOneActivity :
    BaseActivity<ActivityPersonalReviewsOneBinding>(R.layout.activity_personal_reviews_one) {
  private val viewModel: PersonalReviewsOneVM by viewModels<PersonalReviewsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalReviewsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_REVIEWS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalReviewsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

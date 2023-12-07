package com.blommy.app.modules.personalreviews.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityPersonalReviewsBinding
import com.blommy.app.modules.personalreviews.`data`.viewmodel.PersonalReviewsVM
import kotlin.String
import kotlin.Unit

class PersonalReviewsActivity :
    BaseActivity<ActivityPersonalReviewsBinding>(R.layout.activity_personal_reviews) {
  private val viewModel: PersonalReviewsVM by viewModels<PersonalReviewsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalReviewsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_REVIEWS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalReviewsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

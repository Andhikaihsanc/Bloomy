package com.blommy.app.modules.history.ui

import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityHistoryBinding
import com.blommy.app.modules.cart.ui.CartActivity
import com.blommy.app.modules.history.`data`.viewmodel.HistoryVM
import com.blommy.app.modules.personalreviews.ui.PersonalReviewsActivity
import com.blommy.app.modules.profile.ui.ProfileActivity
import kotlin.String
import kotlin.Unit

class HistoryActivity : BaseActivity<ActivityHistoryBinding>(R.layout.activity_history) {
  private val viewModel: HistoryVM by viewModels<HistoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.historyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowvectorTwo.setOnClickListener {
      val destIntent = PersonalReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowvectorThree.setOnClickListener {
      val destIntent = PersonalReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowvectorSix.setOnClickListener {
      val destIntent = PersonalReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackvector.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnlayerone.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HISTORY_ACTIVITY"

  }
}

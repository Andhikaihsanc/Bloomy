package com.blommy.app.modules.historyseller.ui

import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityHistorySellerBinding
import com.blommy.app.modules.historyseller.`data`.viewmodel.HistorySellerVM
import com.blommy.app.modules.personalreviewsone.ui.PersonalReviewsOneActivity
import com.blommy.app.modules.profileseller.ui.ProfileSellerActivity
import kotlin.String
import kotlin.Unit

class HistorySellerActivity :
    BaseActivity<ActivityHistorySellerBinding>(R.layout.activity_history_seller) {
  private val viewModel: HistorySellerVM by viewModels<HistorySellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.historySellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnlayerone.setOnClickListener {
      val destIntent = ProfileSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowvectorOne.setOnClickListener {
      val destIntent = PersonalReviewsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HISTORY_SELLER_ACTIVITY"

  }
}

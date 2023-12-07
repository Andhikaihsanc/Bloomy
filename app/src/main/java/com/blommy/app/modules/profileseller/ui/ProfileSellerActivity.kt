package com.blommy.app.modules.profileseller.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityProfileSellerBinding
import com.blommy.app.modules.landingpage.ui.LandingPageActivity
import com.blommy.app.modules.productlistseller.ui.ProductListSellerActivity
import com.blommy.app.modules.profileseller.`data`.viewmodel.ProfileSellerVM
import kotlin.String
import kotlin.Unit

class ProfileSellerActivity :
    BaseActivity<ActivityProfileSellerBinding>(R.layout.activity_profile_seller) {
  private val viewModel: ProfileSellerVM by viewModels<ProfileSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etGroupSeventy.setOnClickListener {
      val destIntent = ProductListSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etGroup167.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_SELLER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileSellerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

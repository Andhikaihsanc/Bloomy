package com.blommy.app.modules.registerseller.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityRegisterSellerBinding
import com.blommy.app.modules.loginseller.ui.LoginSellerActivity
import com.blommy.app.modules.registerseller.`data`.viewmodel.RegisterSellerVM
import kotlin.String
import kotlin.Unit

class RegisterSellerActivity :
    BaseActivity<ActivityRegisterSellerBinding>(R.layout.activity_register_seller) {
  private val viewModel: RegisterSellerVM by viewModels<RegisterSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = LoginSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_SELLER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterSellerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

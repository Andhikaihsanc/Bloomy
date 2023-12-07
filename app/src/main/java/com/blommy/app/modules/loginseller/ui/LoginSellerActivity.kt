package com.blommy.app.modules.loginseller.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityLoginSellerBinding
import com.blommy.app.modules.homeseller.ui.HomeSellerActivity
import com.blommy.app.modules.loginseller.`data`.viewmodel.LoginSellerVM
import com.blommy.app.modules.registerseller.ui.RegisterSellerActivity
import kotlin.String
import kotlin.Unit

class LoginSellerActivity : BaseActivity<ActivityLoginSellerBinding>(R.layout.activity_login_seller)
    {
  private val viewModel: LoginSellerVM by viewModels<LoginSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLoginOne.setOnClickListener {
      val destIntent = HomeSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSignup.setOnClickListener {
      val destIntent = RegisterSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_SELLER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginSellerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

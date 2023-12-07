package com.blommy.app.modules.addadress.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityAddAdressBinding
import com.blommy.app.modules.addadress.`data`.viewmodel.AddAdressVM
import com.blommy.app.modules.profile.ui.ProfileActivity
import kotlin.String
import kotlin.Unit

class AddAdressActivity : BaseActivity<ActivityAddAdressBinding>(R.layout.activity_add_adress) {
  private val viewModel: AddAdressVM by viewModels<AddAdressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addAdressVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_ADRESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddAdressActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

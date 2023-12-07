package com.blommy.app.modules.editbarangseller.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityEditBarangSellerBinding
import com.blommy.app.modules.editbarangseller.`data`.viewmodel.EditBarangSellerVM
import kotlin.String
import kotlin.Unit

class EditBarangSellerActivity :
    BaseActivity<ActivityEditBarangSellerBinding>(R.layout.activity_edit_barang_seller) {
  private val viewModel: EditBarangSellerVM by viewModels<EditBarangSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editBarangSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_BARANG_SELLER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditBarangSellerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

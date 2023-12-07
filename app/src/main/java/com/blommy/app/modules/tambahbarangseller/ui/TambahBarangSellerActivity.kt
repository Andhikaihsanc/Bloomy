package com.blommy.app.modules.tambahbarangseller.ui

import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityTambahBarangSellerBinding
import com.blommy.app.modules.productlistseller.ui.ProductListSellerActivity
import com.blommy.app.modules.tambahbarangseller.`data`.viewmodel.TambahBarangSellerVM
import kotlin.String
import kotlin.Unit

class TambahBarangSellerActivity :
    BaseActivity<ActivityTambahBarangSellerBinding>(R.layout.activity_tambah_barang_seller) {
  private val viewModel: TambahBarangSellerVM by viewModels<TambahBarangSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tambahBarangSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = ProductListSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TAMBAH_BARANG_SELLER_ACTIVITY"

  }
}

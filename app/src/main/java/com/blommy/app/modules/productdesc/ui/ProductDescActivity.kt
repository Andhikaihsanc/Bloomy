package com.blommy.app.modules.productdesc.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityProductDescBinding
import com.blommy.app.modules.cart.ui.CartActivity
import com.blommy.app.modules.productdesc.`data`.viewmodel.ProductDescVM
import com.blommy.app.modules.reviews.ui.ReviewsActivity
import kotlin.String
import kotlin.Unit

class ProductDescActivity : BaseActivity<ActivityProductDescBinding>(R.layout.activity_product_desc)
    {
  private val viewModel: ProductDescVM by viewModels<ProductDescVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.productDescVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackvector.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txt30reviews.setOnClickListener {
      val destIntent = ReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAddToCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_DESC_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDescActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

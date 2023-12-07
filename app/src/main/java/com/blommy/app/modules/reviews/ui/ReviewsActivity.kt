package com.blommy.app.modules.reviews.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityReviewsBinding
import com.blommy.app.modules.reviews.`data`.model.ListkatonabeatrixRowModel
import com.blommy.app.modules.reviews.`data`.model.ListvectorRowModel
import com.blommy.app.modules.reviews.`data`.viewmodel.ReviewsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReviewsActivity : BaseActivity<ActivityReviewsBinding>(R.layout.activity_reviews) {
  private val viewModel: ReviewsVM by viewModels<ReviewsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listvectorAdapter = ListvectorAdapter(viewModel.listvectorList.value?:mutableListOf())
    binding.recyclerListvector.adapter = listvectorAdapter
    listvectorAdapter.setOnItemClickListener(
    object : ListvectorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvectorRowModel) {
        onClickRecyclerListvector(view, position, item)
      }
    }
    )
    viewModel.listvectorList.observe(this) {
      listvectorAdapter.updateData(it)
    }
    val listkatonabeatrixAdapter =
    ListkatonabeatrixAdapter(viewModel.listkatonabeatrixList.value?:mutableListOf())
    binding.recyclerListkatonabeatrix.adapter = listkatonabeatrixAdapter
    listkatonabeatrixAdapter.setOnItemClickListener(
    object : ListkatonabeatrixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListkatonabeatrixRowModel) {
        onClickRecyclerListkatonabeatrix(view, position, item)
      }
    }
    )
    viewModel.listkatonabeatrixList.observe(this) {
      listkatonabeatrixAdapter.updateData(it)
    }
    binding.reviewsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListvector(
    view: View,
    position: Int,
    item: ListvectorRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListkatonabeatrix(
    view: View,
    position: Int,
    item: ListkatonabeatrixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REVIEWS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.blommy.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityHomeBinding
import com.blommy.app.modules.cart.ui.CartActivity
import com.blommy.app.modules.home.`data`.model.ListrectanglesixtysevenOneRowModel
import com.blommy.app.modules.home.`data`.model.ListrectanglesixtysevenRowModel
import com.blommy.app.modules.home.`data`.viewmodel.HomeVM
import com.blommy.app.modules.productdesc.ui.ProductDescActivity
import com.blommy.app.modules.productlist.ui.ProductListActivity
import com.blommy.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglesixtysevenAdapter =
    ListrectanglesixtysevenAdapter(viewModel.listrectanglesixtysevenList.value?:mutableListOf())
    binding.recyclerListrectanglesixtyseven.adapter = listrectanglesixtysevenAdapter
    listrectanglesixtysevenAdapter.setOnItemClickListener(
    object : ListrectanglesixtysevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglesixtysevenRowModel) {
        onClickRecyclerListrectanglesixtyseven(view, position, item)
      }
    }
    )
    viewModel.listrectanglesixtysevenList.observe(this) {
      listrectanglesixtysevenAdapter.updateData(it)
    }
    val listrectanglesixtysevenOneAdapter =
    ListrectanglesixtysevenOneAdapter(viewModel.listrectanglesixtysevenOneList.value?:mutableListOf())
    binding.recyclerListrectanglesixtysevenOne.adapter = listrectanglesixtysevenOneAdapter
    listrectanglesixtysevenOneAdapter.setOnItemClickListener(
    object : ListrectanglesixtysevenOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglesixtysevenOneRowModel) {
        onClickRecyclerListrectanglesixtysevenOne(view, position, item)
      }
    }
    )
    viewModel.listrectanglesixtysevenOneList.observe(this) {
      listrectanglesixtysevenOneAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackvector.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSearch.setOnClickListener {
      val destIntent = ProductListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnlayerone.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglesixtyseven(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectanglesixtyseven ->  {
        onClickRecyclerListrectanglesixtysevenLinearColumnrectanglesixtyseven(view, position, item)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenOne(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenOneRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectanglesixtyeightOne ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearColumnrectanglesixtynineOne ->  {
        onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtynineOne(view, position,
            item)
      }
      R.id.linearColumnrectanglesixtysevenOne ->  {
        onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtysevenOne(view, position,
            item)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenLinearColumnrectanglesixtyseven(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtynineOne(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenOneRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtysevenOne(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenOneRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = ProductDescActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

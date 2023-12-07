package com.blommy.app.modules.homeseller.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityHomeSellerBinding
import com.blommy.app.modules.editbarangseller.ui.EditBarangSellerActivity
import com.blommy.app.modules.homeseller.`data`.model.Listrectanglesixtyseven1RowModel
import com.blommy.app.modules.homeseller.`data`.model.ListrectanglesixtysevenOne1RowModel
import com.blommy.app.modules.homeseller.`data`.viewmodel.HomeSellerVM
import com.blommy.app.modules.profileseller.ui.ProfileSellerActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeSellerActivity : BaseActivity<ActivityHomeSellerBinding>(R.layout.activity_home_seller) {
  private val viewModel: HomeSellerVM by viewModels<HomeSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglesixtysevenAdapter =
    ListrectanglesixtysevenAdapter(viewModel.listrectanglesixtysevenList.value?:mutableListOf())
    binding.recyclerListrectanglesixtyseven.adapter = listrectanglesixtysevenAdapter
    listrectanglesixtysevenAdapter.setOnItemClickListener(
    object : ListrectanglesixtysevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listrectanglesixtyseven1RowModel) {
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
      ListrectanglesixtysevenOne1RowModel) {
        onClickRecyclerListrectanglesixtysevenOne(view, position, item)
      }
    }
    )
    viewModel.listrectanglesixtysevenOneList.observe(this) {
      listrectanglesixtysevenOneAdapter.updateData(it)
    }
    binding.homeSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnlayerone.setOnClickListener {
      val destIntent = ProfileSellerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglesixtyseven(
    view: View,
    position: Int,
    item: Listrectanglesixtyseven1RowModel
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
    item: ListrectanglesixtysevenOne1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectanglesixtynineOne ->  {
        onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtynineOne(view, position,
            item)
      }
      R.id.linearColumnrectanglesixtysevenOne ->  {
        onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtysevenOne(view, position,
            item)
      }
      R.id.linearColumnrectanglesixtyeightOne ->  {
        onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtyeightOne(view, position,
            item)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenLinearColumnrectanglesixtyseven(
    view: View,
    position: Int,
    item: Listrectanglesixtyseven1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtynineOne(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenOne1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtysevenOne(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenOne1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectanglesixtysevenOneLinearColumnrectanglesixtyeightOne(
    view: View,
    position: Int,
    item: ListrectanglesixtysevenOne1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_SELLER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeSellerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

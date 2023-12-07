package com.blommy.app.modules.productlistseller.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityProductListSellerBinding
import com.blommy.app.modules.editbarangseller.ui.EditBarangSellerActivity
import com.blommy.app.modules.productlistseller.`data`.model.Gridrectangleseventythree1RowModel
import com.blommy.app.modules.productlistseller.`data`.model.ListrectangleseventythreeFourRowModel
import com.blommy.app.modules.productlistseller.`data`.viewmodel.ProductListSellerVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProductListSellerActivity :
    BaseActivity<ActivityProductListSellerBinding>(R.layout.activity_product_list_seller) {
  private val viewModel: ProductListSellerVM by viewModels<ProductListSellerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridrectangleseventythreeAdapter =
    GridrectangleseventythreeAdapter(viewModel.gridrectangleseventythreeList.value?:mutableListOf())
    binding.recyclerGridrectangleseventythree.adapter = gridrectangleseventythreeAdapter
    gridrectangleseventythreeAdapter.setOnItemClickListener(
    object : GridrectangleseventythreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Gridrectangleseventythree1RowModel) {
        onClickRecyclerGridrectangleseventythree(view, position, item)
      }
    }
    )
    viewModel.gridrectangleseventythreeList.observe(this) {
      gridrectangleseventythreeAdapter.updateData(it)
    }
    val listrectangleseventythreeFourAdapter =
    ListrectangleseventythreeFourAdapter(viewModel.listrectangleseventythreeFourList.value?:mutableListOf())
    binding.recyclerListrectangleseventythreeFour.adapter = listrectangleseventythreeFourAdapter
    listrectangleseventythreeFourAdapter.setOnItemClickListener(
    object : ListrectangleseventythreeFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangleseventythreeFourRowModel) {
        onClickRecyclerListrectangleseventythreeFour(view, position, item)
      }
    }
    )
    viewModel.listrectangleseventythreeFourList.observe(this) {
      listrectangleseventythreeFourAdapter.updateData(it)
    }
    binding.productListSellerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerGridrectangleseventythree(
    view: View,
    position: Int,
    item: Gridrectangleseventythree1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectangleseventythree -> {
        onClickRecyclerGridrectangleseventythreeLinearColumnrectangleseventythree(view, position,
        item)
      }
    }
  }

  fun onClickRecyclerListrectangleseventythreeFour(
    view: View,
    position: Int,
    item: ListrectangleseventythreeFourRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumn -> {
        onClickRecyclerListrectangleseventythreeFourLinearColumn(view, position, item)
      }
      R.id.frameStackbouquetmawarTwo -> {
        onClickRecyclerListrectangleseventythreeFourFrameStackbouquetmawarTwo(view, position, item)
      }
    }
  }

  fun onClickRecyclerGridrectangleseventythreeLinearColumnrectangleseventythree(
    view: View,
    position: Int,
    item: Gridrectangleseventythree1RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectangleseventythreeFourLinearColumn(
    view: View,
    position: Int,
    item: ListrectangleseventythreeFourRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectangleseventythreeFourFrameStackbouquetmawarTwo(
    view: View,
    position: Int,
    item: ListrectangleseventythreeFourRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = EditBarangSellerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_LIST_SELLER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductListSellerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

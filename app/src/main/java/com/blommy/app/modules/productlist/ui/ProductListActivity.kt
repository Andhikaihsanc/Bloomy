package com.blommy.app.modules.productlist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityProductListBinding
import com.blommy.app.modules.cart.ui.CartActivity
import com.blommy.app.modules.productdesc.ui.ProductDescActivity
import com.blommy.app.modules.productlist.`data`.model.ListbouquetmawarEightRowModel
import com.blommy.app.modules.productlist.`data`.model.ListrectangleseventythreeRowModel
import com.blommy.app.modules.productlist.`data`.viewmodel.ProductListVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProductListActivity : BaseActivity<ActivityProductListBinding>(R.layout.activity_product_list)
    {
  private val viewModel: ProductListVM by viewModels<ProductListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangleseventythreeAdapter =
    ListrectangleseventythreeAdapter(viewModel.listrectangleseventythreeList.value?:mutableListOf())
    binding.recyclerListrectangleseventythree.adapter = listrectangleseventythreeAdapter
    listrectangleseventythreeAdapter.setOnItemClickListener(
    object : ListrectangleseventythreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangleseventythreeRowModel) {
        onClickRecyclerListrectangleseventythree(view, position, item)
      }
    }
    )
    viewModel.listrectangleseventythreeList.observe(this) {
      listrectangleseventythreeAdapter.updateData(it)
    }
    val listbouquetmawarEightAdapter =
    ListbouquetmawarEightAdapter(viewModel.listbouquetmawarEightList.value?:mutableListOf())
    binding.recyclerListbouquetmawarEight.adapter = listbouquetmawarEightAdapter
    listbouquetmawarEightAdapter.setOnItemClickListener(
    object : ListbouquetmawarEightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListbouquetmawarEightRowModel) {
        onClickRecyclerListbouquetmawarEight(view, position, item)
      }
    }
    )
    viewModel.listbouquetmawarEightList.observe(this) {
      listbouquetmawarEightAdapter.updateData(it)
    }
    binding.productListVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackvector.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectangleseventythree(
    view: View,
    position: Int,
    item: ListrectangleseventythreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListbouquetmawarEight(
    view: View,
    position: Int,
    item: ListbouquetmawarEightRowModel
  ): Unit {
    when(view.id) {
      R.id.frameStackbouquetmawarEight ->  {
        onClickRecyclerListbouquetmawarEightFrameStackbouquetmawarEight(view, position, item)
      }
    }
  }

  fun onClickRecyclerListbouquetmawarEightFrameStackbouquetmawarEight(
    view: View,
    position: Int,
    item: ListbouquetmawarEightRowModel
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
    const val TAG: String = "PRODUCT_LIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

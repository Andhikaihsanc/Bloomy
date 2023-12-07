package com.blommy.app.modules.checkout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.blommy.app.R
import com.blommy.app.appcomponents.base.BaseActivity
import com.blommy.app.databinding.ActivityCheckoutBinding
import com.blommy.app.modules.addadress.ui.AddAdressActivity
import com.blommy.app.modules.checkout.`data`.model.ListellipseoneRowModel
import com.blommy.app.modules.checkout.`data`.model.ListmoreverticalRowModel
import com.blommy.app.modules.checkout.`data`.model.SpinnerTimeModel
import com.blommy.app.modules.checkout.`data`.viewmodel.CheckoutVM
import com.blommy.app.modules.home.ui.HomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CheckoutActivity : BaseActivity<ActivityCheckoutBinding>(R.layout.activity_checkout) {
  private val viewModel: CheckoutVM by viewModels<CheckoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerTimeList.value = mutableListOf(
    SpinnerTimeModel("Item1"),
    SpinnerTimeModel("Item2"),
    SpinnerTimeModel("Item3"),
    SpinnerTimeModel("Item4"),
    SpinnerTimeModel("Item5")
    )
    val spinnerTimeAdapter =
    SpinnerTimeAdapter(this,R.layout.spinner_item,viewModel.spinnerTimeList.value?:
    mutableListOf())
    binding.spinnerTime.adapter = spinnerTimeAdapter
    val listmoreverticalAdapter =
    ListmoreverticalAdapter(viewModel.listmoreverticalList.value?:mutableListOf())
    binding.recyclerListmorevertical.adapter = listmoreverticalAdapter
    listmoreverticalAdapter.setOnItemClickListener(
    object : ListmoreverticalAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmoreverticalRowModel) {
        onClickRecyclerListmorevertical(view, position, item)
      }
    }
    )
    viewModel.listmoreverticalList.observe(this) {
      listmoreverticalAdapter.updateData(it)
    }
    val listellipseoneAdapter =
    ListellipseoneAdapter(viewModel.listellipseoneList.value?:mutableListOf())
    binding.recyclerListellipseone.adapter = listellipseoneAdapter
    listellipseoneAdapter.setOnItemClickListener(
    object : ListellipseoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseoneRowModel) {
        onClickRecyclerListellipseone(view, position, item)
      }
    }
    )
    viewModel.listellipseoneList.observe(this) {
      listellipseoneAdapter.updateData(it)
    }
    binding.checkoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckoutOne.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackgroup.setOnClickListener {
      val destIntent = AddAdressActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListmorevertical(
    view: View,
    position: Int,
    item: ListmoreverticalRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipseone(
    view: View,
    position: Int,
    item: ListellipseoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHECKOUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

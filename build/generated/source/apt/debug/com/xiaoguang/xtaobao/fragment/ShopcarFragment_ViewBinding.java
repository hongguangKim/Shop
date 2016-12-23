// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShopcarFragment_ViewBinding<T extends ShopcarFragment> implements Unbinder {
  protected T target;

  private View view2131493172;

  private View view2131493178;

  @UiThread
  public ShopcarFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.frag_shop_car_msg, "field 'mFragShopCarMsg' and method 'onClick'");
    target.mFragShopCarMsg = Utils.castView(view, R.id.frag_shop_car_msg, "field 'mFragShopCarMsg'", ImageView.class);
    view2131493172 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mFragShopcarLv = Utils.findRequiredViewAsType(source, R.id.frag_shopcar_lv, "field 'mFragShopcarLv'", SwipeMenuListView.class);
    target.mFragShopCarCb = Utils.findRequiredViewAsType(source, R.id.frag_shop_car_cb, "field 'mFragShopCarCb'", CheckBox.class);
    target.mFragShopCarTvMoney = Utils.findRequiredViewAsType(source, R.id.frag_shop_car_tv_money, "field 'mFragShopCarTvMoney'", TextView.class);
    view = Utils.findRequiredView(source, R.id.frag_shop_car_btn_submit, "field 'mFragShopCarBtnSubmit' and method 'onClick'");
    target.mFragShopCarBtnSubmit = Utils.castView(view, R.id.frag_shop_car_btn_submit, "field 'mFragShopCarBtnSubmit'", Button.class);
    view2131493178 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mFragShopcarLn = Utils.findRequiredViewAsType(source, R.id.frag_shopcar_ln, "field 'mFragShopcarLn'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mFragShopCarMsg = null;
    target.mFragShopcarLv = null;
    target.mFragShopCarCb = null;
    target.mFragShopCarTvMoney = null;
    target.mFragShopCarBtnSubmit = null;
    target.mFragShopcarLn = null;

    view2131493172.setOnClickListener(null);
    view2131493172 = null;
    view2131493178.setOnClickListener(null);
    view2131493178 = null;

    this.target = null;
  }
}

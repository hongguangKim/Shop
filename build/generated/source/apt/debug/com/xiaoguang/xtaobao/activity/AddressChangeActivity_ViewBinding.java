// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddressChangeActivity_ViewBinding<T extends AddressChangeActivity> implements Unbinder {
  protected T target;

  private View view2131492976;

  private View view2131492977;

  @UiThread
  public AddressChangeActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_address_iv_back, "field 'mActAddressIvBack' and method 'onClick'");
    target.mActAddressIvBack = Utils.castView(view, R.id.act_address_iv_back, "field 'mActAddressIvBack'", ImageView.class);
    view2131492976 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_address_tv_add, "field 'mActAddressTvAdd' and method 'onClick'");
    target.mActAddressTvAdd = Utils.castView(view, R.id.act_address_tv_add, "field 'mActAddressTvAdd'", TextView.class);
    view2131492977 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActAddressLv = Utils.findRequiredViewAsType(source, R.id.act_address_lv, "field 'mActAddressLv'", SwipeMenuListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActAddressIvBack = null;
    target.mActAddressTvAdd = null;
    target.mActAddressLv = null;

    view2131492976.setOnClickListener(null);
    view2131492976 = null;
    view2131492977.setOnClickListener(null);
    view2131492977 = null;

    this.target = null;
  }
}

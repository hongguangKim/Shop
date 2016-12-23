// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import com.xiaoguang.xtaobao.widget.NotSlipViewPager;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding<T extends HomeActivity> implements Unbinder {
  protected T target;

  private View view2131493020;

  private View view2131493021;

  private View view2131493022;

  private View view2131493023;

  private View view2131493024;

  @UiThread
  public HomeActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mActHomeVpContent = Utils.findRequiredViewAsType(source, R.id.act_home_vp_content, "field 'mActHomeVpContent'", NotSlipViewPager.class);
    view = Utils.findRequiredView(source, R.id.act_home_btn_home, "field 'mActHomeBtnHome' and method 'onClick'");
    target.mActHomeBtnHome = Utils.castView(view, R.id.act_home_btn_home, "field 'mActHomeBtnHome'", Button.class);
    view2131493020 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_home_btn_we, "field 'mActHomeBtnWe' and method 'onClick'");
    target.mActHomeBtnWe = Utils.castView(view, R.id.act_home_btn_we, "field 'mActHomeBtnWe'", Button.class);
    view2131493021 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_home_btn_ask, "field 'mActHomeBtnAsk' and method 'onClick'");
    target.mActHomeBtnAsk = Utils.castView(view, R.id.act_home_btn_ask, "field 'mActHomeBtnAsk'", Button.class);
    view2131493022 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_home_btn_shopcar, "field 'mActHomeBtnShopcar' and method 'onClick'");
    target.mActHomeBtnShopcar = Utils.castView(view, R.id.act_home_btn_shopcar, "field 'mActHomeBtnShopcar'", Button.class);
    view2131493023 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_home_btn_my, "field 'mActHomeBtnMy' and method 'onClick'");
    target.mActHomeBtnMy = Utils.castView(view, R.id.act_home_btn_my, "field 'mActHomeBtnMy'", Button.class);
    view2131493024 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActHomeVpContent = null;
    target.mActHomeBtnHome = null;
    target.mActHomeBtnWe = null;
    target.mActHomeBtnAsk = null;
    target.mActHomeBtnShopcar = null;
    target.mActHomeBtnMy = null;

    view2131493020.setOnClickListener(null);
    view2131493020 = null;
    view2131493021.setOnClickListener(null);
    view2131493021 = null;
    view2131493022.setOnClickListener(null);
    view2131493022 = null;
    view2131493023.setOnClickListener(null);
    view2131493023 = null;
    view2131493024.setOnClickListener(null);
    view2131493024 = null;

    this.target = null;
  }
}

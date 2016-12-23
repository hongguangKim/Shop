// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PayActivity_ViewBinding<T extends PayActivity> implements Unbinder {
  protected T target;

  private View view2131493071;

  private View view2131493008;

  private View view2131493074;

  private View view2131493075;

  @UiThread
  public PayActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_pay_iv_back, "field 'mActPayIvBack' and method 'onClick'");
    target.mActPayIvBack = Utils.castView(view, R.id.act_pay_iv_back, "field 'mActPayIvBack'", ImageView.class);
    view2131493071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_goods_result_tv_menu, "field 'mActGoodsResultTvMenu' and method 'onClick'");
    target.mActGoodsResultTvMenu = Utils.castView(view, R.id.act_goods_result_tv_menu, "field 'mActGoodsResultTvMenu'", TextView.class);
    view2131493008 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActPayTvGoodsTitle = Utils.findRequiredViewAsType(source, R.id.act_pay_tv_goods_title, "field 'mActPayTvGoodsTitle'", TextView.class);
    target.mActPayTvMoney = Utils.findRequiredViewAsType(source, R.id.act_pay_tv_money, "field 'mActPayTvMoney'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_pay_btn_weixin, "field 'mActPayBtnWeixin' and method 'onClick'");
    target.mActPayBtnWeixin = Utils.castView(view, R.id.act_pay_btn_weixin, "field 'mActPayBtnWeixin'", Button.class);
    view2131493074 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_pay_alipay, "field 'mActPayAlipay' and method 'onClick'");
    target.mActPayAlipay = Utils.castView(view, R.id.act_pay_alipay, "field 'mActPayAlipay'", Button.class);
    view2131493075 = view;
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

    target.mActPayIvBack = null;
    target.mActGoodsResultTvMenu = null;
    target.mActPayTvGoodsTitle = null;
    target.mActPayTvMoney = null;
    target.mActPayBtnWeixin = null;
    target.mActPayAlipay = null;

    view2131493071.setOnClickListener(null);
    view2131493071 = null;
    view2131493008.setOnClickListener(null);
    view2131493008 = null;
    view2131493074.setOnClickListener(null);
    view2131493074 = null;
    view2131493075.setOnClickListener(null);
    view2131493075 = null;

    this.target = null;
  }
}

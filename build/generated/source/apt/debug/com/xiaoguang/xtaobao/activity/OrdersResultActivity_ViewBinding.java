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
import com.xiaoguang.xtaobao.R;
import com.xiaoguang.xtaobao.widget.XListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OrdersResultActivity_ViewBinding<T extends OrdersResultActivity> implements Unbinder {
  protected T target;

  private View view2131493059;

  private View view2131493060;

  @UiThread
  public OrdersResultActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_order_result_iv_back, "field 'mActOrderResultIvBack' and method 'onClick'");
    target.mActOrderResultIvBack = Utils.castView(view, R.id.act_order_result_iv_back, "field 'mActOrderResultIvBack'", ImageView.class);
    view2131493059 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_orders_result_tv_menu, "field 'mActOrdersResultTvMenu' and method 'onClick'");
    target.mActOrdersResultTvMenu = Utils.castView(view, R.id.act_orders_result_tv_menu, "field 'mActOrdersResultTvMenu'", TextView.class);
    view2131493060 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrdersResultXlv = Utils.findRequiredViewAsType(source, R.id.act_orders_result_xlv, "field 'mActOrdersResultXlv'", XListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActOrderResultIvBack = null;
    target.mActOrdersResultTvMenu = null;
    target.mActOrdersResultXlv = null;

    view2131493059.setOnClickListener(null);
    view2131493059 = null;
    view2131493060.setOnClickListener(null);
    view2131493060 = null;

    this.target = null;
  }
}

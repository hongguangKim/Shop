// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GoodsResultActivity_ViewBinding<T extends GoodsResultActivity> implements Unbinder {
  protected T target;

  private View view2131493007;

  private View view2131493008;

  @UiThread
  public GoodsResultActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_goods_result_iv_back, "field 'mActGoodsResultIvBack' and method 'onClick'");
    target.mActGoodsResultIvBack = Utils.castView(view, R.id.act_goods_result_iv_back, "field 'mActGoodsResultIvBack'", ImageView.class);
    view2131493007 = view;
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
    target.mActGoodsResultGv = Utils.findRequiredViewAsType(source, R.id.act_goods_result_gv, "field 'mActGoodsResultGv'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActGoodsResultIvBack = null;
    target.mActGoodsResultTvMenu = null;
    target.mActGoodsResultGv = null;

    view2131493007.setOnClickListener(null);
    view2131493007 = null;
    view2131493008.setOnClickListener(null);
    view2131493008 = null;

    this.target = null;
  }
}

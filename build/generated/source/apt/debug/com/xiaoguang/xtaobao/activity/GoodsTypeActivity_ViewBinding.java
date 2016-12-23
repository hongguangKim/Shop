// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GoodsTypeActivity_ViewBinding<T extends GoodsTypeActivity> implements Unbinder {
  protected T target;

  private View view2131493013;

  private View view2131493014;

  @UiThread
  public GoodsTypeActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_goods_type_iv_back, "field 'mActGoodsTypeIvBack' and method 'onClick'");
    target.mActGoodsTypeIvBack = Utils.castView(view, R.id.act_goods_type_iv_back, "field 'mActGoodsTypeIvBack'", ImageView.class);
    view2131493013 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_goods_type_tv_menu, "field 'mActGoodsTypeTvMenu' and method 'onClick'");
    target.mActGoodsTypeTvMenu = Utils.castView(view, R.id.act_goods_type_tv_menu, "field 'mActGoodsTypeTvMenu'", TextView.class);
    view2131493014 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActGoodsTypeGv = Utils.findRequiredViewAsType(source, R.id.act_goods_type_gv, "field 'mActGoodsTypeGv'", GridView.class);
    target.mActGoodsTypeLnContent = Utils.findRequiredViewAsType(source, R.id.act_goods_type_ln_content, "field 'mActGoodsTypeLnContent'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActGoodsTypeIvBack = null;
    target.mActGoodsTypeTvMenu = null;
    target.mActGoodsTypeGv = null;
    target.mActGoodsTypeLnContent = null;

    view2131493013.setOnClickListener(null);
    view2131493013 = null;
    view2131493014.setOnClickListener(null);
    view2131493014 = null;

    this.target = null;
  }
}

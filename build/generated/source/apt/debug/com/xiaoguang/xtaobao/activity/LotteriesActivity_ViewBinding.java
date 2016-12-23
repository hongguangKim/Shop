// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LotteriesActivity_ViewBinding<T extends LotteriesActivity> implements Unbinder {
  protected T target;

  private View view2131493035;

  private View view2131493033;

  @UiThread
  public LotteriesActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mContainer = Utils.findRequiredViewAsType(source, R.id.container, "field 'mContainer'", RelativeLayout.class);
    target.mActLotteriesTvTitle = Utils.findRequiredViewAsType(source, R.id.act_lotteries_tv_title, "field 'mActLotteriesTvTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_lotteries_btn_lingqu, "field 'mActLotteriesBtnLingqu' and method 'onClick'");
    target.mActLotteriesBtnLingqu = Utils.castView(view, R.id.act_lotteries_btn_lingqu, "field 'mActLotteriesBtnLingqu'", Button.class);
    view2131493035 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_lotteries_tv_finish, "field 'mActLotteriesTvFinish' and method 'onClick'");
    target.mActLotteriesTvFinish = Utils.castView(view, R.id.act_lotteries_tv_finish, "field 'mActLotteriesTvFinish'", TextView.class);
    view2131493033 = view;
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

    target.mContainer = null;
    target.mActLotteriesTvTitle = null;
    target.mActLotteriesBtnLingqu = null;
    target.mActLotteriesTvFinish = null;

    view2131493035.setOnClickListener(null);
    view2131493035 = null;
    view2131493033.setOnClickListener(null);
    view2131493033 = null;

    this.target = null;
  }
}

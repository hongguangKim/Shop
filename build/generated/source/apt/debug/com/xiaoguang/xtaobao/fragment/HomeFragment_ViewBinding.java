// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jude.rollviewpager.RollPagerView;
import com.sunfusheng.marqueeview.MarqueeView;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding<T extends HomeFragment> implements Unbinder {
  protected T target;

  private View view2131493151;

  private View view2131493153;

  private View view2131493141;

  @UiThread
  public HomeFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_home_btn_scan, "field 'mActHomeBtnScan' and method 'onClick'");
    target.mActHomeBtnScan = Utils.castView(view, R.id.act_home_btn_scan, "field 'mActHomeBtnScan'", Button.class);
    view2131493151 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_home_btn_msg, "field 'mActHomeBtnMsg' and method 'onClick'");
    target.mActHomeBtnMsg = Utils.castView(view, R.id.act_home_btn_msg, "field 'mActHomeBtnMsg'", Button.class);
    view2131493153 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mFragHomeEtSearch = Utils.findRequiredViewAsType(source, R.id.frag_home_et_search, "field 'mFragHomeEtSearch'", EditText.class);
    target.mFragHomeRollVpAd = Utils.findRequiredViewAsType(source, R.id.frag_home_roll_vp_ad, "field 'mFragHomeRollVpAd'", RollPagerView.class);
    target.gridViewSort = Utils.findRequiredViewAsType(source, R.id.frag_home_gv_sort, "field 'gridViewSort'", GridView.class);
    view = Utils.findRequiredView(source, R.id.frag_home_ln_top, "field 'linearLayoutTop' and method 'onClick'");
    target.linearLayoutTop = Utils.castView(view, R.id.frag_home_ln_top, "field 'linearLayoutTop'", LinearLayout.class);
    view2131493141 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.marqueeViewTop = Utils.findRequiredViewAsType(source, R.id.frag_home_marqueeView, "field 'marqueeViewTop'", MarqueeView.class);
    target.gridViewContent = Utils.findRequiredViewAsType(source, R.id.frag_home_gv_content, "field 'gridViewContent'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActHomeBtnScan = null;
    target.mActHomeBtnMsg = null;
    target.mFragHomeEtSearch = null;
    target.mFragHomeRollVpAd = null;
    target.gridViewSort = null;
    target.linearLayoutTop = null;
    target.marqueeViewTop = null;
    target.gridViewContent = null;

    view2131493151.setOnClickListener(null);
    view2131493151 = null;
    view2131493153.setOnClickListener(null);
    view2131493153 = null;
    view2131493141.setOnClickListener(null);
    view2131493141 = null;

    this.target = null;
  }
}

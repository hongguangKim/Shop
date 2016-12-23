// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WeFragment_ViewBinding<T extends WeFragment> implements Unbinder {
  protected T target;

  private View view2131493179;

  private View view2131493182;

  private View view2131493183;

  private View view2131493184;

  private View view2131493185;

  private View view2131493186;

  @UiThread
  public WeFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.frag_we_iv_search, "field 'mFragWeIvSearch' and method 'onClick'");
    target.mFragWeIvSearch = Utils.castView(view, R.id.frag_we_iv_search, "field 'mFragWeIvSearch'", ImageView.class);
    view2131493179 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.mFragWeVp = Utils.findRequiredViewAsType(source, R.id.frag_we_vp, "field 'mFragWeVp'", ViewPager.class);
    view = Utils.findRequiredView(source, R.id.frag_we_btn_news, "field 'mFragWeBtnNews' and method 'onClick'");
    target.mFragWeBtnNews = Utils.castView(view, R.id.frag_we_btn_news, "field 'mFragWeBtnNews'", Button.class);
    view2131493182 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_home_btn_good_new, "field 'mFragHomeBtnGoodNew' and method 'onClick'");
    target.mFragHomeBtnGoodNew = Utils.castView(view, R.id.frag_home_btn_good_new, "field 'mFragHomeBtnGoodNew'", Button.class);
    view2131493183 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_we_btn_video, "field 'mFragWeBtnVideo' and method 'onClick'");
    target.mFragWeBtnVideo = Utils.castView(view, R.id.frag_we_btn_video, "field 'mFragWeBtnVideo'", Button.class);
    view2131493184 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_we_btn_hot_title, "field 'mFragWeBtnHotTitle' and method 'onClick'");
    target.mFragWeBtnHotTitle = Utils.castView(view, R.id.frag_we_btn_hot_title, "field 'mFragWeBtnHotTitle'", Button.class);
    view2131493185 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_we_btn_medial, "field 'mFragWeBtnMedial' and method 'onClick'");
    target.mFragWeBtnMedial = Utils.castView(view, R.id.frag_we_btn_medial, "field 'mFragWeBtnMedial'", Button.class);
    view2131493186 = view;
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

    target.mFragWeIvSearch = null;
    target.mFragWeVp = null;
    target.mFragWeBtnNews = null;
    target.mFragHomeBtnGoodNew = null;
    target.mFragWeBtnVideo = null;
    target.mFragWeBtnHotTitle = null;
    target.mFragWeBtnMedial = null;

    view2131493179.setOnClickListener(null);
    view2131493179 = null;
    view2131493182.setOnClickListener(null);
    view2131493182 = null;
    view2131493183.setOnClickListener(null);
    view2131493183 = null;
    view2131493184.setOnClickListener(null);
    view2131493184 = null;
    view2131493185.setOnClickListener(null);
    view2131493185 = null;
    view2131493186.setOnClickListener(null);
    view2131493186 = null;

    this.target = null;
  }
}

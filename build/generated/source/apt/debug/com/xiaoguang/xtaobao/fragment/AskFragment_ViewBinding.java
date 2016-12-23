// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AskFragment_ViewBinding<T extends AskFragment> implements Unbinder {
  protected T target;

  private View view2131493129;

  private View view2131493130;

  private View view2131493131;

  private View view2131493132;

  private View view2131493133;

  private View view2131493134;

  private View view2131493135;

  private View view2131493136;

  private View view2131493137;

  @UiThread
  public AskFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mFragAskIvHead = Utils.findRequiredViewAsType(source, R.id.frag_ask_iv_head, "field 'mFragAskIvHead'", CircleImageView.class);
    target.mFragAskEdSearch = Utils.findRequiredViewAsType(source, R.id.frag_ask_ed_search, "field 'mFragAskEdSearch'", EditText.class);
    view = Utils.findRequiredView(source, R.id.frag_ask_iv_msg, "field 'mFragAskIvMsg' and method 'onClick'");
    target.mFragAskIvMsg = Utils.castView(view, R.id.frag_ask_iv_msg, "field 'mFragAskIvMsg'", ImageView.class);
    view2131493129 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_hot, "field 'mFragAskBtnHot' and method 'onClick'");
    target.mFragAskBtnHot = Utils.castView(view, R.id.frag_ask_btn_hot, "field 'mFragAskBtnHot'", Button.class);
    view2131493130 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_clothes, "field 'mFragAskBtnClothes' and method 'onClick'");
    target.mFragAskBtnClothes = Utils.castView(view, R.id.frag_ask_btn_clothes, "field 'mFragAskBtnClothes'", Button.class);
    view2131493131 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_buy, "field 'mFragAskBtnBuy' and method 'onClick'");
    target.mFragAskBtnBuy = Utils.castView(view, R.id.frag_ask_btn_buy, "field 'mFragAskBtnBuy'", Button.class);
    view2131493132 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_child, "field 'mFragAskBtnChild' and method 'onClick'");
    target.mFragAskBtnChild = Utils.castView(view, R.id.frag_ask_btn_child, "field 'mFragAskBtnChild'", Button.class);
    view2131493133 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_fix, "field 'mFragAskBtnFix' and method 'onClick'");
    target.mFragAskBtnFix = Utils.castView(view, R.id.frag_ask_btn_fix, "field 'mFragAskBtnFix'", Button.class);
    view2131493134 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_beautiful, "field 'mFragAskBtnBeautiful' and method 'onClick'");
    target.mFragAskBtnBeautiful = Utils.castView(view, R.id.frag_ask_btn_beautiful, "field 'mFragAskBtnBeautiful'", Button.class);
    view2131493135 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_media, "field 'mFragAskBtnMedia' and method 'onClick'");
    target.mFragAskBtnMedia = Utils.castView(view, R.id.frag_ask_btn_media, "field 'mFragAskBtnMedia'", Button.class);
    view2131493136 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_ask_btn_heathy, "field 'mFragAskBtnHeathy' and method 'onClick'");
    target.mFragAskBtnHeathy = Utils.castView(view, R.id.frag_ask_btn_heathy, "field 'mFragAskBtnHeathy'", Button.class);
    view2131493137 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mFragAskVp = Utils.findRequiredViewAsType(source, R.id.frag_ask_vp, "field 'mFragAskVp'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mFragAskIvHead = null;
    target.mFragAskEdSearch = null;
    target.mFragAskIvMsg = null;
    target.mFragAskBtnHot = null;
    target.mFragAskBtnClothes = null;
    target.mFragAskBtnBuy = null;
    target.mFragAskBtnChild = null;
    target.mFragAskBtnFix = null;
    target.mFragAskBtnBeautiful = null;
    target.mFragAskBtnMedia = null;
    target.mFragAskBtnHeathy = null;
    target.mFragAskVp = null;

    view2131493129.setOnClickListener(null);
    view2131493129 = null;
    view2131493130.setOnClickListener(null);
    view2131493130 = null;
    view2131493131.setOnClickListener(null);
    view2131493131 = null;
    view2131493132.setOnClickListener(null);
    view2131493132 = null;
    view2131493133.setOnClickListener(null);
    view2131493133 = null;
    view2131493134.setOnClickListener(null);
    view2131493134 = null;
    view2131493135.setOnClickListener(null);
    view2131493135 = null;
    view2131493136.setOnClickListener(null);
    view2131493136 = null;
    view2131493137.setOnClickListener(null);
    view2131493137 = null;

    this.target = null;
  }
}

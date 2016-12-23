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
import com.jude.rollviewpager.RollPagerView;
import com.xiaoguang.xtaobao.R;
import com.xiaoguang.xtaobao.widget.XListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GoodsDetailsActivity_ViewBinding<T extends GoodsDetailsActivity> implements Unbinder {
  protected T target;

  private View view2131492995;

  private View view2131492996;

  private View view2131492999;

  private View view2131493002;

  private View view2131493003;

  private View view2131493004;

  private View view2131493005;

  private View view2131493006;

  @UiThread
  public GoodsDetailsActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_goods_details_iv_back, "field 'mActGoodsDetailsIvBack' and method 'onClick'");
    target.mActGoodsDetailsIvBack = Utils.castView(view, R.id.act_goods_details_iv_back, "field 'mActGoodsDetailsIvBack'", ImageView.class);
    view2131492995 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_goods_details_tv_menu, "field 'mActGoodsDetailsTvMenu' and method 'onClick'");
    target.mActGoodsDetailsTvMenu = Utils.castView(view, R.id.act_goods_details_tv_menu, "field 'mActGoodsDetailsTvMenu'", TextView.class);
    view2131492996 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActGoodsDetailsRollVpAd = Utils.findRequiredViewAsType(source, R.id.act_goods_details_roll_vp_ad, "field 'mActGoodsDetailsRollVpAd'", RollPagerView.class);
    target.mActGoodsDetailsTvGoodsName = Utils.findRequiredViewAsType(source, R.id.act_goods_details_tv_goods_name, "field 'mActGoodsDetailsTvGoodsName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_goods_details_btn_share, "field 'mActGoodsDetailsBtnShare' and method 'onClick'");
    target.mActGoodsDetailsBtnShare = Utils.castView(view, R.id.act_goods_details_btn_share, "field 'mActGoodsDetailsBtnShare'", Button.class);
    view2131492999 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActGoodsDetailsTvMoney = Utils.findRequiredViewAsType(source, R.id.act_goods_details_tv_money, "field 'mActGoodsDetailsTvMoney'", TextView.class);
    target.mActGoodsDetailsXlv = Utils.findRequiredViewAsType(source, R.id.act_goods_details_xlv, "field 'mActGoodsDetailsXlv'", XListView.class);
    view = Utils.findRequiredView(source, R.id.act_goods_details_btn_kefu, "field 'mActGoodsDetailsBtnKefu' and method 'onClick'");
    target.mActGoodsDetailsBtnKefu = Utils.castView(view, R.id.act_goods_details_btn_kefu, "field 'mActGoodsDetailsBtnKefu'", Button.class);
    view2131493002 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_goods_details_btn_dianpu, "field 'mActGoodsDetailsBtnDianpu' and method 'onClick'");
    target.mActGoodsDetailsBtnDianpu = Utils.castView(view, R.id.act_goods_details_btn_dianpu, "field 'mActGoodsDetailsBtnDianpu'", Button.class);
    view2131493003 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_goods_details_btn_shoucang, "field 'mActGoodsDetailsBtnShoucang' and method 'onClick'");
    target.mActGoodsDetailsBtnShoucang = Utils.castView(view, R.id.act_goods_details_btn_shoucang, "field 'mActGoodsDetailsBtnShoucang'", Button.class);
    view2131493004 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_goods_details_btn_jiaru, "field 'mActGoodsDetailsBtnJiaru' and method 'onClick'");
    target.mActGoodsDetailsBtnJiaru = Utils.castView(view, R.id.act_goods_details_btn_jiaru, "field 'mActGoodsDetailsBtnJiaru'", Button.class);
    view2131493005 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_goods_details_btn_goumai, "field 'mActGoodsDetailsBtnGoumai' and method 'onClick'");
    target.mActGoodsDetailsBtnGoumai = Utils.castView(view, R.id.act_goods_details_btn_goumai, "field 'mActGoodsDetailsBtnGoumai'", Button.class);
    view2131493006 = view;
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

    target.mActGoodsDetailsIvBack = null;
    target.mActGoodsDetailsTvMenu = null;
    target.mActGoodsDetailsRollVpAd = null;
    target.mActGoodsDetailsTvGoodsName = null;
    target.mActGoodsDetailsBtnShare = null;
    target.mActGoodsDetailsTvMoney = null;
    target.mActGoodsDetailsXlv = null;
    target.mActGoodsDetailsBtnKefu = null;
    target.mActGoodsDetailsBtnDianpu = null;
    target.mActGoodsDetailsBtnShoucang = null;
    target.mActGoodsDetailsBtnJiaru = null;
    target.mActGoodsDetailsBtnGoumai = null;

    view2131492995.setOnClickListener(null);
    view2131492995 = null;
    view2131492996.setOnClickListener(null);
    view2131492996 = null;
    view2131492999.setOnClickListener(null);
    view2131492999 = null;
    view2131493002.setOnClickListener(null);
    view2131493002 = null;
    view2131493003.setOnClickListener(null);
    view2131493003 = null;
    view2131493004.setOnClickListener(null);
    view2131493004 = null;
    view2131493005.setOnClickListener(null);
    view2131493005 = null;
    view2131493006.setOnClickListener(null);
    view2131493006 = null;

    this.target = null;
  }
}

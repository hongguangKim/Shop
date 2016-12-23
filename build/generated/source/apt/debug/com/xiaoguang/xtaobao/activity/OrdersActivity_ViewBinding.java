// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OrdersActivity_ViewBinding<T extends OrdersActivity> implements Unbinder {
  protected T target;

  private View view2131493047;

  private View view2131493036;

  private View view2131493038;

  private View view2131493039;

  private View view2131493041;

  private View view2131493043;

  private View view2131493045;

  private View view2131493058;

  @UiThread
  public OrdersActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_orders_iv_back, "field 'mActOrdersIvBack' and method 'onClick'");
    target.mActOrdersIvBack = Utils.castView(view, R.id.act_orders_iv_back, "field 'mActOrdersIvBack'", ImageView.class);
    view2131493047 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrderTvTop = Utils.findRequiredViewAsType(source, R.id.act_order_tv_top, "field 'mActOrderTvTop'", TextView.class);
    target.mActOrderTvShouhuoName = Utils.findRequiredViewAsType(source, R.id.act_order_tv_shouhuoName, "field 'mActOrderTvShouhuoName'", TextView.class);
    target.mActOrderTvShouhuoPhone = Utils.findRequiredViewAsType(source, R.id.act_order_tv_shouhuoPhone, "field 'mActOrderTvShouhuoPhone'", TextView.class);
    target.mActOrderTvShouhuoAddress = Utils.findRequiredViewAsType(source, R.id.act_order_tv_shouhuo_address, "field 'mActOrderTvShouhuoAddress'", TextView.class);
    target.mActOrderIvGoodsImg = Utils.findRequiredViewAsType(source, R.id.act_order_iv_goods_img, "field 'mActOrderIvGoodsImg'", ImageView.class);
    target.mActOrderTvGoodsName = Utils.findRequiredViewAsType(source, R.id.act_order_tv_goods_name, "field 'mActOrderTvGoodsName'", TextView.class);
    target.mActOrderTvGoodsMoney = Utils.findRequiredViewAsType(source, R.id.act_order_tv_goods_money, "field 'mActOrderTvGoodsMoney'", TextView.class);
    target.mActOrderLn = Utils.findRequiredViewAsType(source, R.id.act_order_ln, "field 'mActOrderLn'", LinearLayout.class);
    target.mActOrderIvLine = Utils.findRequiredViewAsType(source, R.id.act_order_iv_line, "field 'mActOrderIvLine'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.act_order_btn_add, "field 'mActOrderBtnAdd' and method 'onClick'");
    target.mActOrderBtnAdd = Utils.castView(view, R.id.act_order_btn_add, "field 'mActOrderBtnAdd'", Button.class);
    view2131493036 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrderEtCount = Utils.findRequiredViewAsType(source, R.id.act_order_et_count, "field 'mActOrderEtCount'", EditText.class);
    view = Utils.findRequiredView(source, R.id.act_order_btn_jian, "field 'mActOrderBtnJian' and method 'onClick'");
    target.mActOrderBtnJian = Utils.castView(view, R.id.act_order_btn_jian, "field 'mActOrderBtnJian'", Button.class);
    view2131493038 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrderTvShouhou = Utils.findRequiredViewAsType(source, R.id.act_order_tv_shouhou, "field 'mActOrderTvShouhou'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_order_rl_shouhou, "field 'mActOrderRlShouhou' and method 'onClick'");
    target.mActOrderRlShouhou = Utils.castView(view, R.id.act_order_rl_shouhou, "field 'mActOrderRlShouhou'", RelativeLayout.class);
    view2131493039 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrderTvPeisong = Utils.findRequiredViewAsType(source, R.id.act_order_tv_peisong, "field 'mActOrderTvPeisong'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_order_rl_peisong, "field 'mActOrderRlPeisong' and method 'onClick'");
    target.mActOrderRlPeisong = Utils.castView(view, R.id.act_order_rl_peisong, "field 'mActOrderRlPeisong'", RelativeLayout.class);
    view2131493041 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrderTvYunfei = Utils.findRequiredViewAsType(source, R.id.act_order_tv_yunfei, "field 'mActOrderTvYunfei'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_order_rl_yunfei, "field 'mActOrderRlYunfei' and method 'onClick'");
    target.mActOrderRlYunfei = Utils.castView(view, R.id.act_order_rl_yunfei, "field 'mActOrderRlYunfei'", RelativeLayout.class);
    view2131493043 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrderTvLiuyan = Utils.findRequiredViewAsType(source, R.id.act_order_tv_liuyan, "field 'mActOrderTvLiuyan'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_order_rl_liuyan, "field 'mActOrderRlLiuyan' and method 'onClick'");
    target.mActOrderRlLiuyan = Utils.castView(view, R.id.act_order_rl_liuyan, "field 'mActOrderRlLiuyan'", RelativeLayout.class);
    view2131493045 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActOrdersTvNumMoney = Utils.findRequiredViewAsType(source, R.id.act_orders_tv_num_money, "field 'mActOrdersTvNumMoney'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_orders_btn_submit, "field 'mActOrdersBtnSubmit' and method 'onClick'");
    target.mActOrdersBtnSubmit = Utils.castView(view, R.id.act_orders_btn_submit, "field 'mActOrdersBtnSubmit'", Button.class);
    view2131493058 = view;
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

    target.mActOrdersIvBack = null;
    target.mActOrderTvTop = null;
    target.mActOrderTvShouhuoName = null;
    target.mActOrderTvShouhuoPhone = null;
    target.mActOrderTvShouhuoAddress = null;
    target.mActOrderIvGoodsImg = null;
    target.mActOrderTvGoodsName = null;
    target.mActOrderTvGoodsMoney = null;
    target.mActOrderLn = null;
    target.mActOrderIvLine = null;
    target.mActOrderBtnAdd = null;
    target.mActOrderEtCount = null;
    target.mActOrderBtnJian = null;
    target.mActOrderTvShouhou = null;
    target.mActOrderRlShouhou = null;
    target.mActOrderTvPeisong = null;
    target.mActOrderRlPeisong = null;
    target.mActOrderTvYunfei = null;
    target.mActOrderRlYunfei = null;
    target.mActOrderTvLiuyan = null;
    target.mActOrderRlLiuyan = null;
    target.mActOrdersTvNumMoney = null;
    target.mActOrdersBtnSubmit = null;

    view2131493047.setOnClickListener(null);
    view2131493047 = null;
    view2131493036.setOnClickListener(null);
    view2131493036 = null;
    view2131493038.setOnClickListener(null);
    view2131493038 = null;
    view2131493039.setOnClickListener(null);
    view2131493039 = null;
    view2131493041.setOnClickListener(null);
    view2131493041 = null;
    view2131493043.setOnClickListener(null);
    view2131493043 = null;
    view2131493045.setOnClickListener(null);
    view2131493045 = null;
    view2131493058.setOnClickListener(null);
    view2131493058 = null;

    this.target = null;
  }
}

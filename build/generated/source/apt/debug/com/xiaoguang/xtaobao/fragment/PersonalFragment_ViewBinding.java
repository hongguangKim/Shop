// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PersonalFragment_ViewBinding<T extends PersonalFragment> implements Unbinder {
  protected T target;

  private View view2131493154;

  private View view2131493155;

  private View view2131493156;

  private View view2131493158;

  private View view2131493159;

  private View view2131493160;

  private View view2131493161;

  private View view2131493162;

  private View view2131493163;

  private View view2131493164;

  @UiThread
  public PersonalFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.frag_personal_tv_setting, "field 'mFragPersonalTvetting' and method 'onClick'");
    target.mFragPersonalTvetting = Utils.castView(view, R.id.frag_personal_tv_setting, "field 'mFragPersonalTvetting'", TextView.class);
    view2131493154 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_personal_iv_msg, "field 'mFragPersonalIvMsg' and method 'onClick'");
    target.mFragPersonalIvMsg = Utils.castView(view, R.id.frag_personal_iv_msg, "field 'mFragPersonalIvMsg'", ImageView.class);
    view2131493155 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_personal_iv_head, "field 'mFragPersonalIvHead' and method 'onClick'");
    target.mFragPersonalIvHead = Utils.castView(view, R.id.frag_personal_iv_head, "field 'mFragPersonalIvHead'", CircleImageView.class);
    view2131493156 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mFragPersonalTvNickName = Utils.findRequiredViewAsType(source, R.id.frag_personal_tv_nick_name, "field 'mFragPersonalTvNickName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.frag_personal_rl_show_dingdan, "field 'mFragPersonalRlShowDingdan' and method 'onClick'");
    target.mFragPersonalRlShowDingdan = Utils.castView(view, R.id.frag_personal_rl_show_dingdan, "field 'mFragPersonalRlShowDingdan'", RelativeLayout.class);
    view2131493158 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_personal_btn_pay, "field 'mFragPersonalBtnPay' and method 'onClick'");
    target.mFragPersonalBtnPay = Utils.castView(view, R.id.frag_personal_btn_pay, "field 'mFragPersonalBtnPay'", Button.class);
    view2131493159 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_personal_btn_daifahuo, "field 'mFragPersonalBtnDaifahuo' and method 'onClick'");
    target.mFragPersonalBtnDaifahuo = Utils.castView(view, R.id.frag_personal_btn_daifahuo, "field 'mFragPersonalBtnDaifahuo'", Button.class);
    view2131493160 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_personal_btn_daishouhuo, "field 'mFragPersonalBtnDaishouhuo' and method 'onClick'");
    target.mFragPersonalBtnDaishouhuo = Utils.castView(view, R.id.frag_personal_btn_daishouhuo, "field 'mFragPersonalBtnDaishouhuo'", Button.class);
    view2131493161 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_home_personal_daipingjia, "field 'mFragHomePersonalDaipingjia' and method 'onClick'");
    target.mFragHomePersonalDaipingjia = Utils.castView(view, R.id.frag_home_personal_daipingjia, "field 'mFragHomePersonalDaipingjia'", Button.class);
    view2131493162 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_personal_btn_tuikuan, "field 'mFragPersonalBtnTuikuan' and method 'onClick'");
    target.mFragPersonalBtnTuikuan = Utils.castView(view, R.id.frag_personal_btn_tuikuan, "field 'mFragPersonalBtnTuikuan'", Button.class);
    view2131493163 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_personal_rl_show_jianzhi, "field 'mFragPersonalRlShowJianzhi' and method 'onClick'");
    target.mFragPersonalRlShowJianzhi = Utils.castView(view, R.id.frag_personal_rl_show_jianzhi, "field 'mFragPersonalRlShowJianzhi'", RelativeLayout.class);
    view2131493164 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mFragPersonalGvCenter = Utils.findRequiredViewAsType(source, R.id.frag_personal_gv_center, "field 'mFragPersonalGvCenter'", GridView.class);
    target.mFragPersonalGvBottom = Utils.findRequiredViewAsType(source, R.id.frag_personal_gv_bottom, "field 'mFragPersonalGvBottom'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mFragPersonalTvetting = null;
    target.mFragPersonalIvMsg = null;
    target.mFragPersonalIvHead = null;
    target.mFragPersonalTvNickName = null;
    target.mFragPersonalRlShowDingdan = null;
    target.mFragPersonalBtnPay = null;
    target.mFragPersonalBtnDaifahuo = null;
    target.mFragPersonalBtnDaishouhuo = null;
    target.mFragHomePersonalDaipingjia = null;
    target.mFragPersonalBtnTuikuan = null;
    target.mFragPersonalRlShowJianzhi = null;
    target.mFragPersonalGvCenter = null;
    target.mFragPersonalGvBottom = null;

    view2131493154.setOnClickListener(null);
    view2131493154 = null;
    view2131493155.setOnClickListener(null);
    view2131493155 = null;
    view2131493156.setOnClickListener(null);
    view2131493156 = null;
    view2131493158.setOnClickListener(null);
    view2131493158 = null;
    view2131493159.setOnClickListener(null);
    view2131493159 = null;
    view2131493160.setOnClickListener(null);
    view2131493160 = null;
    view2131493161.setOnClickListener(null);
    view2131493161 = null;
    view2131493162.setOnClickListener(null);
    view2131493162 = null;
    view2131493163.setOnClickListener(null);
    view2131493163 = null;
    view2131493164.setOnClickListener(null);
    view2131493164 = null;

    this.target = null;
  }
}

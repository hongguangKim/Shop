// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingActivtity_ViewBinding<T extends SettingActivtity> implements Unbinder {
  protected T target;

  private View view2131493090;

  private View view2131493077;

  private View view2131493091;

  private View view2131493092;

  private View view2131493093;

  private View view2131493094;

  private View view2131493095;

  private View view2131493096;

  private View view2131493097;

  private View view2131493098;

  @UiThread
  public SettingActivtity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_setting_iv_back, "field 'mActSettingIvBack' and method 'onClick'");
    target.mActSettingIvBack = Utils.castView(view, R.id.act_setting_iv_back, "field 'mActSettingIvBack'", ImageView.class);
    view2131493090 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_tv_menu, "field 'mActSettingTvMenu' and method 'onClick'");
    target.mActSettingTvMenu = Utils.castView(view, R.id.act_setting_tv_menu, "field 'mActSettingTvMenu'", TextView.class);
    view2131493077 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_personal_setting_tv_exit, "field 'mActPersonalSettingTvExit' and method 'onClick'");
    target.mActPersonalSettingTvExit = Utils.castView(view, R.id.act_personal_setting_tv_exit, "field 'mActPersonalSettingTvExit'", TextView.class);
    view2131493091 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_ln_person, "field 'mActSettingLnPerson' and method 'onClick'");
    target.mActSettingLnPerson = Utils.castView(view, R.id.act_setting_ln_person, "field 'mActSettingLnPerson'", LinearLayout.class);
    view2131493092 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_ln_self, "field 'mActSettingLnSelf' and method 'onClick'");
    target.mActSettingLnSelf = Utils.castView(view, R.id.act_setting_ln_self, "field 'mActSettingLnSelf'", LinearLayout.class);
    view2131493093 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_ln_new_msg, "field 'mActSettingLnNewMsg' and method 'onClick'");
    target.mActSettingLnNewMsg = Utils.castView(view, R.id.act_setting_ln_new_msg, "field 'mActSettingLnNewMsg'", LinearLayout.class);
    view2131493094 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_ln_count_msg, "field 'mActSettingLnCountMsg' and method 'onClick'");
    target.mActSettingLnCountMsg = Utils.castView(view, R.id.act_setting_ln_count_msg, "field 'mActSettingLnCountMsg'", LinearLayout.class);
    view2131493095 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_ln_shezhi, "field 'mActSettingLnShezhi' and method 'onClick'");
    target.mActSettingLnShezhi = Utils.castView(view, R.id.act_setting_ln_shezhi, "field 'mActSettingLnShezhi'", LinearLayout.class);
    view2131493096 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_ln_xiaomi, "field 'mActSettingLnXiaomi' and method 'onClick'");
    target.mActSettingLnXiaomi = Utils.castView(view, R.id.act_setting_ln_xiaomi, "field 'mActSettingLnXiaomi'", LinearLayout.class);
    view2131493097 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_setting_ln_about, "field 'mActSettingLnAbout' and method 'onClick'");
    target.mActSettingLnAbout = Utils.castView(view, R.id.act_setting_ln_about, "field 'mActSettingLnAbout'", LinearLayout.class);
    view2131493098 = view;
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

    target.mActSettingIvBack = null;
    target.mActSettingTvMenu = null;
    target.mActPersonalSettingTvExit = null;
    target.mActSettingLnPerson = null;
    target.mActSettingLnSelf = null;
    target.mActSettingLnNewMsg = null;
    target.mActSettingLnCountMsg = null;
    target.mActSettingLnShezhi = null;
    target.mActSettingLnXiaomi = null;
    target.mActSettingLnAbout = null;

    view2131493090.setOnClickListener(null);
    view2131493090 = null;
    view2131493077.setOnClickListener(null);
    view2131493077 = null;
    view2131493091.setOnClickListener(null);
    view2131493091 = null;
    view2131493092.setOnClickListener(null);
    view2131493092 = null;
    view2131493093.setOnClickListener(null);
    view2131493093 = null;
    view2131493094.setOnClickListener(null);
    view2131493094 = null;
    view2131493095.setOnClickListener(null);
    view2131493095 = null;
    view2131493096.setOnClickListener(null);
    view2131493096 = null;
    view2131493097.setOnClickListener(null);
    view2131493097 = null;
    view2131493098.setOnClickListener(null);
    view2131493098 = null;

    this.target = null;
  }
}

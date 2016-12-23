// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding<T extends LoginActivity> implements Unbinder {
  protected T target;

  private View view2131493025;

  private View view2131493026;

  private View view2131493029;

  private View view2131493030;

  private View view2131493031;

  @UiThread
  public LoginActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.frag_login_iv_back, "field 'mFragLoginIvBack' and method 'onClick'");
    target.mFragLoginIvBack = Utils.castView(view, R.id.frag_login_iv_back, "field 'mFragLoginIvBack'", ImageView.class);
    view2131493025 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_login_tv_help, "field 'mFragLoginTvHelp' and method 'onClick'");
    target.mFragLoginTvHelp = Utils.castView(view, R.id.frag_login_tv_help, "field 'mFragLoginTvHelp'", TextView.class);
    view2131493026 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActHomeEtPhone = Utils.findRequiredViewAsType(source, R.id.act_home_et_phone, "field 'mActHomeEtPhone'", EditText.class);
    target.mActLoginEtPwd = Utils.findRequiredViewAsType(source, R.id.act_login_et_pwd, "field 'mActLoginEtPwd'", EditText.class);
    view = Utils.findRequiredView(source, R.id.act_login_tv_login, "field 'mActLoginTvLogin' and method 'onClick'");
    target.mActLoginTvLogin = Utils.castView(view, R.id.act_login_tv_login, "field 'mActLoginTvLogin'", TextView.class);
    view2131493029 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_login_tv_forget, "field 'mActLoginTvForget' and method 'onClick'");
    target.mActLoginTvForget = Utils.castView(view, R.id.act_login_tv_forget, "field 'mActLoginTvForget'", TextView.class);
    view2131493030 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_login_tv_reg, "field 'mActLoginTvReg' and method 'onClick'");
    target.mActLoginTvReg = Utils.castView(view, R.id.act_login_tv_reg, "field 'mActLoginTvReg'", TextView.class);
    view2131493031 = view;
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

    target.mFragLoginIvBack = null;
    target.mFragLoginTvHelp = null;
    target.mActHomeEtPhone = null;
    target.mActLoginEtPwd = null;
    target.mActLoginTvLogin = null;
    target.mActLoginTvForget = null;
    target.mActLoginTvReg = null;

    view2131493025.setOnClickListener(null);
    view2131493025 = null;
    view2131493026.setOnClickListener(null);
    view2131493026 = null;
    view2131493029.setOnClickListener(null);
    view2131493029 = null;
    view2131493030.setOnClickListener(null);
    view2131493030 = null;
    view2131493031.setOnClickListener(null);
    view2131493031 = null;

    this.target = null;
  }
}

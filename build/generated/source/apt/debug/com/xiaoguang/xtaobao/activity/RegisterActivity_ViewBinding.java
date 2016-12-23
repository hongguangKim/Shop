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

public class RegisterActivity_ViewBinding<T extends RegisterActivity> implements Unbinder {
  protected T target;

  private View view2131493100;

  private View view2131493101;

  private View view2131493106;

  private View view2131493099;

  @UiThread
  public RegisterActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.frag_tv_help, "field 'mFragTvHelp' and method 'onClick'");
    target.mFragTvHelp = Utils.castView(view, R.id.frag_tv_help, "field 'mFragTvHelp'", TextView.class);
    view2131493100 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActHomeEtPhone = Utils.findRequiredViewAsType(source, R.id.act_home_et_phone, "field 'mActHomeEtPhone'", EditText.class);
    view = Utils.findRequiredView(source, R.id.frag_register_tv_getcode, "field 'mFragRegisterTvGetcode' and method 'onClick'");
    target.mFragRegisterTvGetcode = Utils.castView(view, R.id.frag_register_tv_getcode, "field 'mFragRegisterTvGetcode'", TextView.class);
    view2131493101 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActHomeEtSmsCode = Utils.findRequiredViewAsType(source, R.id.act_home_et_sms_code, "field 'mActHomeEtSmsCode'", EditText.class);
    target.mActHomeEtNickName = Utils.findRequiredViewAsType(source, R.id.act_reg_et_nick_name, "field 'mActHomeEtNickName'", EditText.class);
    target.mActRegEtPwd = Utils.findRequiredViewAsType(source, R.id.act_reg_et_pwd, "field 'mActRegEtPwd'", EditText.class);
    target.mActRegEtPwd2 = Utils.findRequiredViewAsType(source, R.id.act_reg_et_pwd2, "field 'mActRegEtPwd2'", EditText.class);
    view = Utils.findRequiredView(source, R.id.act_reg_tv_reg, "field 'mActRegTvReg' and method 'onClick'");
    target.mActRegTvReg = Utils.castView(view, R.id.act_reg_tv_reg, "field 'mActRegTvReg'", TextView.class);
    view2131493106 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.frag_register_tv_back, "field 'mFragRegisterTvBack' and method 'onClick'");
    target.mFragRegisterTvBack = Utils.castView(view, R.id.frag_register_tv_back, "field 'mFragRegisterTvBack'", ImageView.class);
    view2131493099 = view;
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

    target.mFragTvHelp = null;
    target.mActHomeEtPhone = null;
    target.mFragRegisterTvGetcode = null;
    target.mActHomeEtSmsCode = null;
    target.mActHomeEtNickName = null;
    target.mActRegEtPwd = null;
    target.mActRegEtPwd2 = null;
    target.mActRegTvReg = null;
    target.mFragRegisterTvBack = null;

    view2131493100.setOnClickListener(null);
    view2131493100 = null;
    view2131493101.setOnClickListener(null);
    view2131493101 = null;
    view2131493106.setOnClickListener(null);
    view2131493106 = null;
    view2131493099.setOnClickListener(null);
    view2131493099 = null;

    this.target = null;
  }
}

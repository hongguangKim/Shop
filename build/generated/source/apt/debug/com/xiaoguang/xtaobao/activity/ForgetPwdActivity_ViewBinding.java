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

public class ForgetPwdActivity_ViewBinding<T extends ForgetPwdActivity> implements Unbinder {
  protected T target;

  private View view2131492987;

  private View view2131492988;

  private View view2131492990;

  private View view2131492994;

  @UiThread
  public ForgetPwdActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.frag_forget_tv_back, "field 'mFragForgetTvBack' and method 'onClick'");
    target.mFragForgetTvBack = Utils.castView(view, R.id.frag_forget_tv_back, "field 'mFragForgetTvBack'", ImageView.class);
    view2131492987 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_forget_tv_help, "field 'mActForgetTvHelp' and method 'onClick'");
    target.mActForgetTvHelp = Utils.castView(view, R.id.act_forget_tv_help, "field 'mActForgetTvHelp'", TextView.class);
    view2131492988 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActForgetEtPhone = Utils.findRequiredViewAsType(source, R.id.act_forget_et_phone, "field 'mActForgetEtPhone'", EditText.class);
    view = Utils.findRequiredView(source, R.id.act_forget_tv_getcode, "field 'mActForgetTvGetcode' and method 'onClick'");
    target.mActForgetTvGetcode = Utils.castView(view, R.id.act_forget_tv_getcode, "field 'mActForgetTvGetcode'", TextView.class);
    view2131492990 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActForgetEtSmsCode = Utils.findRequiredViewAsType(source, R.id.act_forget_et_sms_code, "field 'mActForgetEtSmsCode'", EditText.class);
    target.mActForgetEtPwd = Utils.findRequiredViewAsType(source, R.id.act_forget_et_pwd, "field 'mActForgetEtPwd'", EditText.class);
    target.mActForgetEtPwd2 = Utils.findRequiredViewAsType(source, R.id.act_forget_et_pwd2, "field 'mActForgetEtPwd2'", EditText.class);
    view = Utils.findRequiredView(source, R.id.act_forget_tv_reset, "field 'mActForgetTvReset' and method 'onClick'");
    target.mActForgetTvReset = Utils.castView(view, R.id.act_forget_tv_reset, "field 'mActForgetTvReset'", TextView.class);
    view2131492994 = view;
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

    target.mFragForgetTvBack = null;
    target.mActForgetTvHelp = null;
    target.mActForgetEtPhone = null;
    target.mActForgetTvGetcode = null;
    target.mActForgetEtSmsCode = null;
    target.mActForgetEtPwd = null;
    target.mActForgetEtPwd2 = null;
    target.mActForgetTvReset = null;

    view2131492987.setOnClickListener(null);
    view2131492987 = null;
    view2131492988.setOnClickListener(null);
    view2131492988 = null;
    view2131492990.setOnClickListener(null);
    view2131492990 = null;
    view2131492994.setOnClickListener(null);
    view2131492994 = null;

    this.target = null;
  }
}

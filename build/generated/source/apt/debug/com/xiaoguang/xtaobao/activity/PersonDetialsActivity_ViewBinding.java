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
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PersonDetialsActivity_ViewBinding<T extends PersonDetialsActivity> implements Unbinder {
  protected T target;

  private View view2131493076;

  private View view2131493077;

  private View view2131492975;

  private View view2131493078;

  private View view2131493080;

  private View view2131493082;

  private View view2131493084;

  private View view2131493088;

  private View view2131493086;

  @UiThread
  public PersonDetialsActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_person_details_iv_back, "field 'mActPersonDetailsIvBack' and method 'onClick'");
    target.mActPersonDetailsIvBack = Utils.castView(view, R.id.act_person_details_iv_back, "field 'mActPersonDetailsIvBack'", ImageView.class);
    view2131493076 = view;
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
    view = Utils.findRequiredView(source, R.id.act_setting_ln_nav, "field 'mActSettingLnNav' and method 'onClick'");
    target.mActSettingLnNav = Utils.castView(view, R.id.act_setting_ln_nav, "field 'mActSettingLnNav'", LinearLayout.class);
    view2131492975 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActPersonDetailsIvHead = Utils.findRequiredViewAsType(source, R.id.act_person_details_iv_head, "field 'mActPersonDetailsIvHead'", CircleImageView.class);
    view = Utils.findRequiredView(source, R.id.act_person_details_ln_head, "field 'mActPersonDetailsLnHead' and method 'onClick'");
    target.mActPersonDetailsLnHead = Utils.castView(view, R.id.act_person_details_ln_head, "field 'mActPersonDetailsLnHead'", LinearLayout.class);
    view2131493078 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActPersonDetailsTvHuiyanName = Utils.findRequiredViewAsType(source, R.id.act_person_details_tv_huiyan_name, "field 'mActPersonDetailsTvHuiyanName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_person_details_ln_huiyuan_name, "field 'mActPersonDetailsLnHuiyuanName' and method 'onClick'");
    target.mActPersonDetailsLnHuiyuanName = Utils.castView(view, R.id.act_person_details_ln_huiyuan_name, "field 'mActPersonDetailsLnHuiyuanName'", LinearLayout.class);
    view2131493080 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActPersonDetailsTvNickName = Utils.findRequiredViewAsType(source, R.id.act_person_details_tv_nick_name, "field 'mActPersonDetailsTvNickName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_person_details_ln_nick_name, "field 'mActPersonDetailsLnNickName' and method 'onClick'");
    target.mActPersonDetailsLnNickName = Utils.castView(view, R.id.act_person_details_ln_nick_name, "field 'mActPersonDetailsLnNickName'", LinearLayout.class);
    view2131493082 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mTextView = Utils.findRequiredViewAsType(source, R.id.textView, "field 'mTextView'", TextView.class);
    target.mActPersonDetailsTvSex = Utils.findRequiredViewAsType(source, R.id.act_person_details_tv_sex, "field 'mActPersonDetailsTvSex'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_person_details_ln_sex, "field 'mActPersonDetailsLnSex' and method 'onClick'");
    target.mActPersonDetailsLnSex = Utils.castView(view, R.id.act_person_details_ln_sex, "field 'mActPersonDetailsLnSex'", LinearLayout.class);
    view2131493084 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_person_details_ln_address, "field 'mActPersonDetailsLnAddress' and method 'onClick'");
    target.mActPersonDetailsLnAddress = Utils.castView(view, R.id.act_person_details_ln_address, "field 'mActPersonDetailsLnAddress'", LinearLayout.class);
    view2131493088 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.act_person_details_ln_ercode, "field 'mActPersonDetailsLnErcode' and method 'onClick'");
    target.mActPersonDetailsLnErcode = Utils.castView(view, R.id.act_person_details_ln_ercode, "field 'mActPersonDetailsLnErcode'", LinearLayout.class);
    view2131493086 = view;
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

    target.mActPersonDetailsIvBack = null;
    target.mActSettingTvMenu = null;
    target.mActSettingLnNav = null;
    target.mActPersonDetailsIvHead = null;
    target.mActPersonDetailsLnHead = null;
    target.mActPersonDetailsTvHuiyanName = null;
    target.mActPersonDetailsLnHuiyuanName = null;
    target.mActPersonDetailsTvNickName = null;
    target.mActPersonDetailsLnNickName = null;
    target.mTextView = null;
    target.mActPersonDetailsTvSex = null;
    target.mActPersonDetailsLnSex = null;
    target.mActPersonDetailsLnAddress = null;
    target.mActPersonDetailsLnErcode = null;

    view2131493076.setOnClickListener(null);
    view2131493076 = null;
    view2131493077.setOnClickListener(null);
    view2131493077 = null;
    view2131492975.setOnClickListener(null);
    view2131492975 = null;
    view2131493078.setOnClickListener(null);
    view2131493078 = null;
    view2131493080.setOnClickListener(null);
    view2131493080 = null;
    view2131493082.setOnClickListener(null);
    view2131493082 = null;
    view2131493084.setOnClickListener(null);
    view2131493084 = null;
    view2131493088.setOnClickListener(null);
    view2131493088 = null;
    view2131493086.setOnClickListener(null);
    view2131493086 = null;

    this.target = null;
  }
}

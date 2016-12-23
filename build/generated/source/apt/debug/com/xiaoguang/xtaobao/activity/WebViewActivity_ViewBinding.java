// Generated code from Butter Knife. Do not modify!
package com.xiaoguang.xtaobao.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.xiaoguang.xtaobao.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WebViewActivity_ViewBinding<T extends WebViewActivity> implements Unbinder {
  protected T target;

  private View view2131493107;

  private View view2131493109;

  @UiThread
  public WebViewActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.act_webview_iv_back, "field 'mActWebviewIvBack' and method 'onClick'");
    target.mActWebviewIvBack = Utils.castView(view, R.id.act_webview_iv_back, "field 'mActWebviewIvBack'", ImageView.class);
    view2131493107 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActWebviewTitle = Utils.findRequiredViewAsType(source, R.id.act_webview_title, "field 'mActWebviewTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.act_webview_iv_goto, "field 'mActWebviewIvGoto' and method 'onClick'");
    target.mActWebviewIvGoto = Utils.castView(view, R.id.act_webview_iv_goto, "field 'mActWebviewIvGoto'", ImageView.class);
    view2131493109 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mActWebviewWv = Utils.findRequiredViewAsType(source, R.id.act_webview_wv, "field 'mActWebviewWv'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActWebviewIvBack = null;
    target.mActWebviewTitle = null;
    target.mActWebviewIvGoto = null;
    target.mActWebviewWv = null;

    view2131493107.setOnClickListener(null);
    view2131493107 = null;
    view2131493109.setOnClickListener(null);
    view2131493109 = null;

    this.target = null;
  }
}

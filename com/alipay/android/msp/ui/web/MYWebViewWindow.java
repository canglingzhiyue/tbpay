package com.alipay.android.msp.ui.web;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MYWebViewWindow extends LinearLayout implements IWebViewWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public View getBackView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7ce4092b", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ImageView getFreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("f545e3cc", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ImageView getHelpView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a4624f6d", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ProgressBar getProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("98fa86b3", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public TextView getTitleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("91d40de2", new Object[]{this});
        }
        return null;
    }

    public void init(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c032eb1", new Object[]{this, new Boolean(z), str, str2});
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void showReFreshView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed484a", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void showTip(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bfa920", new Object[]{this, str, str2, onClickListener});
        }
    }

    public MYWebViewWindow(Context context) {
        super(context);
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public JSONObject getBackDlg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fca0e9", new Object[]{this}) : new JSONObject();
    }
}

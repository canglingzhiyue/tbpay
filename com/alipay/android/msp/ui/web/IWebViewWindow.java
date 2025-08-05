package com.alipay.android.msp.ui.web;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes3.dex */
public interface IWebViewWindow {
    void destroy();

    JSONObject getBackDlg();

    View getBackView();

    ImageView getFreshView();

    ImageView getHelpView();

    ProgressBar getProgressBar();

    TextView getTitleView();

    void reload();

    void showReFreshView(boolean z);

    void showTip(String str, String str2, View.OnClickListener onClickListener);
}

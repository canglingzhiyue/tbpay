package com.ali.user.mobile.register.old;

import android.content.Context;
import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.webview.WebViewActivity;
import tb.kge;

/* loaded from: classes2.dex */
public class TaoUrlSpan extends URLSpan {
    static {
        kge.a(384069411);
    }

    public TaoUrlSpan(String str) {
        super(str);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        if (view == null || view.getContext() == null) {
            return;
        }
        Context context = view.getContext();
        Intent intent = new Intent();
        intent.setClass(context, WebViewActivity.class);
        intent.putExtra(WebConstant.WEBURL, getURL());
        context.startActivity(intent);
    }
}

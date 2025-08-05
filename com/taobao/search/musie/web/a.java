package com.taobao.search.musie.web;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.uc.webview.export.WebView;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1187719312);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -623958539) {
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Context context) {
        super(context);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, view, str})).booleanValue();
        }
        q.c(view, "view");
        if (TextUtils.isEmpty(str)) {
            return super.shouldOverrideUrlLoading(view, str);
        }
        Nav.from(view.getContext()).toUri(str);
        return true;
    }
}

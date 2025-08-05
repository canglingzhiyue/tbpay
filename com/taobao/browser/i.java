package com.taobao.browser;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.config.p;
import android.taobao.windvane.embed.Empty;
import android.taobao.windvane.extra.uc.WVUCClient;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.fragment.SplashFragment;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedView;
import com.uc.webview.export.extension.IEmbedViewContainer;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class i extends WVUCClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IWVWebView f16781a;

    static {
        kge.a(1776905505);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 1410714603) {
            if (hashCode != 1507240588) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onWebViewEvent((WebView) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        return super.getEmbedView((EmbedViewConfig) objArr[0], (IEmbedViewContainer) objArr[1]);
    }

    public i(IWVWebView iWVWebView) {
        super(iWVWebView);
        this.f16781a = iWVWebView;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public IEmbedView getEmbedView(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEmbedView) ipChange.ipc$dispatch("5415cbeb", new Object[]{this, embedViewConfig, iEmbedViewContainer});
        }
        IWVWebView iWVWebView = this.f16781a;
        if (iWVWebView == null || !p.i(iWVWebView.getUrl())) {
            if (this.f16781a == null) {
                m.e(android.taobao.windvane.monitor.a.MONITOR_POINT_EMBED_VIEW, "embed view not allowed, for webview is null");
            } else {
                m.e(android.taobao.windvane.monitor.a.MONITOR_POINT_EMBED_VIEW, "embed view not allowed, for url = [" + this.f16781a.getUrl() + "] is not allowed");
            }
            Empty empty = new Empty();
            empty.init("", "empty", this.f16781a, null);
            return empty;
        }
        return super.getEmbedView(embedViewConfig, iEmbedViewContainer);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public void onWebViewEvent(WebView webView, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d6aa8c", new Object[]{this, webView, new Integer(i), obj});
            return;
        }
        if (i == 6) {
            try {
                String str = "0";
                if ((obj instanceof Map) && ((Map) obj).containsKey("ts")) {
                    str = (String) ((Map) obj).get("ts");
                }
                long parseLong = Long.parseLong(str);
                m.c("TBUCClient", "BA UC_T1:  t1=" + parseLong);
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    context = ((MutableContextWrapper) webView.getContext()).getBaseContext();
                }
                if (context instanceof FragmentActivity) {
                    if (com.taobao.browser.utils.f.a()) {
                        SplashFragment.dismiss(((FragmentActivity) context).getSupportFragmentManager());
                    }
                } else {
                    m.e("TBUCClient", "cannot dismiss. context is " + context);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.onWebViewEvent(webView, i, obj);
    }
}

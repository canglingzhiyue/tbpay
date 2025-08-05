package com.taobao.android.searchbaseframe.ace;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.e;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.util.t;
import com.uc.webview.export.WebView;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile WVUCWebView f14944a;
    private static LinkedList<e<String, String>> b;
    private static boolean c;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ LinkedList b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("4ac103e5", new Object[0]) : b;
    }

    public static /* synthetic */ WVUCWebView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("3e67794d", new Object[0]) : f14944a;
    }

    static {
        kge.a(1625939197);
        b = new LinkedList<>();
        c = false;
    }

    public static View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{context});
        }
        b(context);
        t.a(f14944a);
        return f14944a;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (f14944a != null) {
            return;
        }
        synchronized (a.class) {
            if (f14944a == null) {
                q.a(AceMultiPortBridge.PLUGIN_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) AceMultiPortBridge.class);
                WVUCWebView wVUCWebView = new WVUCWebView(applicationContext);
                f14944a = wVUCWebView;
                wVUCWebView.setWebViewClient(new WVUCWebViewClient(applicationContext) { // from class: com.taobao.android.searchbaseframe.ace.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == -332805219) {
                            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                    public void onPageFinished(WebView webView, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                            return;
                        }
                        super.onPageFinished(webView, str);
                        a.a(true);
                        while (!a.b().isEmpty()) {
                            e eVar = (e) a.b().pollFirst();
                            String str2 = (String) eVar.f15014a;
                            String str3 = (String) eVar.b;
                            k.d("[Ace]", "send pending msg, " + str2 + ":" + str3, new Object[0]);
                            WVStandardEventCenter.postNotificationToJS(a.c(), str2, str3);
                        }
                    }
                });
                f14944a.loadUrl("http://onepiece.alibaba-inc.com/ace/#/mobile/home");
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f14944a == null) {
        } else {
            f14944a.loadUrl("http://onepiece.alibaba-inc.com/ace/#/mobile/home");
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (f14944a != null && c) {
            WVStandardEventCenter.postNotificationToJS(f14944a, str, str2);
        } else {
            b.add(e.a(str, str2));
        }
    }
}

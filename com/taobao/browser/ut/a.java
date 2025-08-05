package com.taobao.browser.ut;

import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserHybridWebView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.j;
import java.util.Map;
import tb.apr;
import tb.aqc;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f16841a;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(42825967);
        f16841a = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("dc9872ce", new Object[0]) : f16841a;
    }

    public void a(Map<String, String> map, Object obj, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ea2dd", new Object[]{this, map, obj, iWVWebView});
            return;
        }
        if (apr.a()) {
            apr.b("FragmentUTHybridHelper", "h5UT2 view", obj, "dataMap", map);
        }
        if (map == null || map.size() == 0) {
            apr.e("h5UT", "dataMap is empty");
            return;
        }
        String remove = map.remove("functype");
        if (remove == null) {
            apr.e("h5UT", "funcType is null");
        } else if (remove.equals("page")) {
            b(map, obj, iWVWebView);
        } else if (!remove.equals("ctrl")) {
        } else {
            a(map);
        }
    }

    private void b(Map<String, String> map, Object obj, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf00cfc", new Object[]{this, map, obj, iWVWebView});
            return;
        }
        apr.c();
        if (map == null || map.size() == 0) {
            apr.d("h5Page2", "dataMap is null or empty,return");
            return;
        }
        String remove = map.remove("url");
        m.e("FragmentUTHybridHelper", "h5Page2 pageName=" + remove);
        m.e("FragmentUTHybridHelper", "h5Page2 map=" + map);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, remove);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        if (!(iWVWebView instanceof BrowserHybridWebView)) {
            return;
        }
        ((BrowserHybridWebView) iWVWebView).setUTPageNameAndParamMap(remove, map);
    }

    private void a(Map<String, String> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.size() == 0) {
        } else {
            try {
                i = Integer.parseInt(map.remove("funcId"));
            } catch (Throwable unused) {
                i = -1;
            }
            if (i == -1) {
                return;
            }
            String remove = map.remove("url");
            if (remove == null || aqc.e(remove)) {
                apr.d("h5Ctrl", "pageName is null,return");
                return;
            }
            String remove2 = map.remove("logkey");
            if (remove2 == null || aqc.e(remove2)) {
                apr.d("h5Ctrl", "logkey is null,return");
                return;
            }
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(remove, i, remove2, null, null, map);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(uTOriginalCustomHitBuilder.build());
            } else {
                apr.e("h5Ctrl event error", "Fatal Error,must call setRequestAuthentication method first.");
            }
        }
    }
}

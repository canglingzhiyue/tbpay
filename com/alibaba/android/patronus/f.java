package com.alibaba.android.patronus;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.lang.reflect.Proxy;
import java.util.Objects;
import tb.kgo;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2410a;

    public f(Context context) {
        this.f2410a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (_Patrons.deleteWebViewReservation() > 0) {
                boolean equals = Objects.equals(kgo.a(this.f2410a, "MemKeeper", 0).getString("shouldUseNewCookieManager", "true"), "true");
                com.alibaba.android.patronus.simplecookie.b.a(this.f2410a);
                a(equals, e.a(this.f2410a));
                Log.e("WebViewFactoryCommand", "succ");
                return;
            }
            Log.e("WebViewFactoryCommand", "failed");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(boolean z, boolean z2) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        com.taobao.android.boutique.reflection.e a2 = com.taobao.android.boutique.reflection.e.a(Class.forName("android.webkit.WebViewFactory"));
        Object a3 = a2.a("sProviderInstance").a();
        if (a3 != null) {
            crashCaughtHeader.addHeaderInfo("WebViewFactoryCommand", "sProviderInstance already loaded");
        }
        a2.a("sProviderInstance", Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{Class.forName("android.webkit.WebViewFactoryProvider")}, new c(a3, z, z2)));
        if (Build.VERSION.SDK_INT >= 26) {
            com.taobao.android.boutique.reflection.e.a(Class.forName("android.webkit.WebViewLibraryLoader")).a("nativeLoadWithRelroFile", new Class[]{String.class, String.class, ClassLoader.class}, new Object[]{"~~~ForReleaseWebViewReservation~", "/dev/null", f.class.getClassLoader()});
        } else if (Build.VERSION.SDK_INT >= 24) {
            a2.a("nativeLoadWithRelroFile", new Class[]{String.class, String.class, String.class, String.class, ClassLoader.class}, new Object[]{"~~~ForReleaseWebViewReservation~", "~~~ForReleaseWebViewReservation~", "/dev/null", "/dev/null", f.class.getClassLoader()});
        } else {
            a2.a("nativeLoadWithRelroFile", new Class[]{String.class, String.class, String.class, String.class}, new Object[]{"~~~ForReleaseWebViewReservation~", "~~~ForReleaseWebViewReservation~", "/dev/null", "/dev/null"});
        }
        crashCaughtHeader.addHeaderInfo("WebViewFactoryCommand", "disable system webview succ");
    }
}

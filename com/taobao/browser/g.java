package com.taobao.browser;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.guc;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends BasePreInitManager<BrowserHybridWebView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PreInit";

    /* renamed from: a  reason: collision with root package name */
    private static g f16779a;

    static {
        kge.a(790018484);
    }

    private g() {
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("10c169d0", new Object[0]);
        }
        if (f16779a == null) {
            synchronized (g.class) {
                if (f16779a == null) {
                    f16779a = new g();
                }
            }
        }
        return f16779a;
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!guc.a(context, "enablePreinit")) {
        } else {
            a.a().b(new Runnable() { // from class: com.taobao.browser.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    try {
                        g.a().setPreWeb(new BrowserHybridWebView(new MutableContextWrapper(context)));
                        m.e(g.TAG, "idle setPreWeb use time = " + (System.currentTimeMillis() - valueOf.longValue()));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }
}

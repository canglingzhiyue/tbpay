package com.taobao.browser;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile AtomicBoolean f16758a;

    static {
        kge.a(1949999459);
        f16758a = new AtomicBoolean(false);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (t.b(application.getApplicationContext())) {
            TMSLogger.d("BrowserInitTask", "skip TMSEarlyInitializer");
        } else {
            b(application, hashMap);
        }
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{application, hashMap});
        } else if (!f16758a.compareAndSet(false, true)) {
        } else {
            BrowserApplication.setupOpenMultiMode();
            BrowserApplication.initMonitor();
            BrowserApplication.registerConfig();
            BrowserApplication.registerOrangeListener();
            b(application);
        }
    }

    private static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
            return;
        }
        g.a();
        g.a(application);
        a.a().b(new Runnable() { // from class: com.taobao.browser.b.1
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
                    new BrowserActivity();
                    Log.e("BrowserInitTask", "BrowserActivity newInstance use time = " + (System.currentTimeMillis() - valueOf.longValue()));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}

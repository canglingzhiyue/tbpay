package com.alibaba.aliweex;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.weex.WXEnvironment;
import java.util.Map;
import tb.ams;
import tb.amz;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f2022a;
    private static amz e;
    private Application b;
    private e c;
    private ams d;

    static {
        kge.a(-80217106);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        e = new amz();
        TCrashSDK.instance().addJvmUncaughtCrashListener(e);
    }

    public ams q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ams) ipChange.ipc$dispatch("8a1cba27", new Object[]{this}) : this.d;
    }

    public static synchronized void a(String str) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                return;
            }
            if (e != null) {
                e.a(str);
            }
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY).addHeaderInfo(WXEnvironment.WEEX_CURRENT_KEY, str);
        }
    }

    public static synchronized void b(String str) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
                return;
            }
            if (e != null) {
                e.b(str);
            }
        }
    }

    public void a(Application application, e eVar, ams amsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4917657f", new Object[]{this, application, eVar, amsVar});
            return;
        }
        this.b = application;
        this.c = eVar;
        this.d = amsVar;
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("87f89386", new Object[0]);
        }
        if (f2022a == null) {
            synchronized (d.class) {
                if (f2022a == null) {
                    f2022a = new d();
                }
            }
        }
        return f2022a;
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : this.b;
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this});
        }
        Application application = this.b;
        if (application == null) {
            return null;
        }
        return application.getApplicationContext();
    }

    public e l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("fe744bf0", new Object[]{this}) : this.c;
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        ams amsVar = this.d;
        if (amsVar == null) {
            return;
        }
        amsVar.onStage(str, map);
    }
}

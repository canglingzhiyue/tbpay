package com.taobao.pha.core;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.h;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUILD_VERSION = "";

    /* renamed from: a  reason: collision with root package name */
    public volatile h f18758a;
    private final AtomicBoolean b;
    private volatile Context c;
    private volatile n d;

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final p f18759a;

        static {
            kge.a(-1385043216);
            f18759a = new p();
        }

        public static /* synthetic */ p a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("10c0fd60", new Object[0]) : f18759a;
        }
    }

    static {
        kge.a(1480369256);
    }

    public static p a() {
        if (!d()) {
            Log.e("PHASDK", "start to initialize PHA lazily.");
            try {
                Class.forName("com.taobao.pha.tb.PHAInitializer").getMethod("init", Application.class, HashMap.class).invoke(null, (Application) Class.forName("com.taobao.tao.Globals").getMethod("getApplication", new Class[0]).invoke(null, new Object[0]), new HashMap());
                Log.e("PHASDK", "finish initializing PHA lazily.");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return a.a();
    }

    public static n b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("4a120de3", new Object[0]) : a().d;
    }

    public static h c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("83631dea", new Object[0]);
        }
        h hVar = a().f18758a;
        return hVar != null ? hVar : h.a.C();
    }

    public static void a(Context context, n nVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526adee6", new Object[]{context, nVar, hVar});
        } else if (d()) {
            Log.e("PHASDK", "PHASDK setup multi times, skipped.");
        } else {
            p a2 = a.a();
            a2.c = context;
            a2.d = nVar;
            a2.f18758a = hVar;
            a2.b.set(true);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a.a().b.get();
    }

    public static Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[0]) : a().c;
    }

    private p() {
        this.b = new AtomicBoolean(false);
    }
}

package com.taobao.tao;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.login4android.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import tb.jdy;
import tb.jel;

/* loaded from: classes.dex */
public abstract class l implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f20679a;
    public final String b;
    public final String c;

    public abstract void b();

    public static l a(Application application, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("9c10c590", new Object[]{application, str, str2, new Boolean(z)});
        }
        if (str2.startsWith(":gpu_process") || z) {
            return new g(application, str, str2);
        }
        if (StringUtils.equals(str, str2)) {
            return new f(application, str, str2);
        }
        return new d(application, str, str2);
    }

    public l(Application application, String str, String str2) {
        this.f20679a = application;
        this.b = str;
        this.c = str2;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            jdy jdyVar = new jdy(this.f20679a);
            jdyVar.a("STARTUP_TIME", Long.valueOf(TaobaoApplication.sStartTime));
            jdyVar.a("APP_ID", (Object) "12278902@android");
            jdyVar.a("APP_KEY", (Object) "12278902");
            jdyVar.a("CHANNEL", (Object) "60000");
            jdyVar.a(SessionManager.CURRENT_PROCESS, (Object) this.c);
            jdyVar.a("APP_VERSION", (Object) TaobaoApplication.sAppVersion);
            HashMap hashMap = new HashMap();
            hashMap.put(SessionManager.CURRENT_PROCESS, this.c);
            com.taobao.android.tcrash.c.a(this.f20679a, "12278902", TaobaoApplication.sAppVersion, jdyVar.a("CHANNEL", "60000"), null, hashMap);
            UncaughtCrashManager a2 = com.taobao.android.tcrash.d.a(jdyVar, (Map<String, Object>) null).a();
            if (!(a2 instanceof jel)) {
                return;
            }
            ((jel) a2).a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        a();
        b();
    }
}

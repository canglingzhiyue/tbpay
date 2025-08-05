package com.taobao.android.virtual_thread.adapter.tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.jqo;
import tb.jqp;
import tb.jqq;
import tb.jqs;
import tb.jqv;
import tb.jqw;
import tb.jqx;
import tb.jrd;
import tb.jre;
import tb.jrh;
import tb.jrj;
import tb.jrk;
import tb.kge;
import tb.sdd;
import tb.sde;
import tb.sdf;
import tb.src;
import tb.thp;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f15805a;

    static {
        kge.a(-616893326);
        f15805a = false;
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (f15805a) {
        } else {
            f15805a = true;
            b(application, hashMap);
            jrk.b("VirtualThreadLauncher", "init", "succ");
        }
    }

    private static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{application, hashMap});
            return;
        }
        jrj jrjVar = new jrj(a(application));
        if (!jrh.a(jrjVar)) {
            return;
        }
        jqp a2 = a(application, jrjVar, hashMap);
        jrk.b("VirtualThreadLauncher", a2.getClass().getSimpleName());
        new jqs().a(new jrd(jrjVar, a2)).a(new jqq(jrjVar, a2)).a(new src(jrjVar, hashMap)).a(new jqw(jrjVar, a2)).a(new jqx(jrjVar, a2)).a(new jqv(jrjVar, a2)).a(new sdd(jrjVar, a2)).a(new sde(jrjVar, a2)).a(new sdf(jrjVar, a2)).a(new thp(jrjVar, a2)).a();
    }

    private static jqp a(Context context, jrj jrjVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqp) ipChange.ipc$dispatch("a25d2478", new Object[]{context, jrjVar, hashMap});
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        jrj jrjVar2 = new jrj(hashMap);
        if (!jrh.c()) {
            return new jqo(jrjVar);
        }
        String a2 = jrjVar2.a("appVersion", "1.0.0");
        jrk.b("VirtualThreadLauncher", a2);
        if (a2.split("\\.").length > 3) {
            return new jqo(jrjVar);
        }
        return new jqp(jrjVar);
    }

    public static Map<String, String> a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6c7a56c", new Object[]{application});
        }
        try {
            Map<String, String> a2 = jre.a().a(new File("/data/local/tmp/", "virtual_thread_config.txt"));
            return a2.size() > 0 ? a2 : jre.a().a(new File(application.getFilesDir(), "virtual_thread_config.txt"));
        } catch (Throwable th) {
            jrk.a(th);
            return new HashMap();
        }
    }
}

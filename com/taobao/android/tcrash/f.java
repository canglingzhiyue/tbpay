package com.taobao.android.tcrash;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.jdy;
import tb.jfk;
import tb.jfm;
import tb.jfr;
import tb.jgr;
import tb.krp;
import tb.sff;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        g.a().a(application);
        jfm.a().b();
        jfk.c a2 = new jfk(application, jgr.b(application)).a();
        if (a2 != null) {
            jfr.a().a("LastCrash", a2.f29523a, a2.b);
        }
        sff.a();
        new krp(new jdy(application)).a();
    }
}

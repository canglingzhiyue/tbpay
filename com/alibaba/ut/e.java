package com.alibaba.ut;

import android.app.Application;
import com.alibaba.ut.comm.a;
import com.alibaba.ut.comm.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cfg;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SDK_VERSION = "0.2.29";
    public static final String USER_AGENT = "UT4Aplus/0.2.29";

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f4227a = false;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            a(application, null);
        }
    }

    public static synchronized void a(Application application, Map map) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9eeaf2e", new Object[]{application, map});
                return;
            }
            if (!f4227a) {
                f4227a = true;
                a.a().a(application);
                new cfg().a();
                new com.alibaba.ut.page.a().a();
                b.a().b();
            }
        }
    }
}

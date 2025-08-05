package com.taobao.aranger.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import tb.kao;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f16372a;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final ExecutorService b = kao.a(1, "ARanger-single");
    private final ThreadPoolExecutor d = kao.a(3, "ARanger-ipc");

    static {
        kge.a(-786482489);
    }

    private static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("59a45ac5", new Object[0]);
        }
        if (f16372a == null) {
            synchronized (b.class) {
                if (f16372a == null) {
                    f16372a = new b();
                }
            }
        }
        return f16372a;
    }

    private b() {
    }

    public static void a(boolean z, boolean z2, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f88b366", new Object[]{new Boolean(z), new Boolean(z2), runnable});
        } else if (z) {
            a().c.post(runnable);
        } else if (z2) {
            a().b.execute(runnable);
        } else {
            a().d.execute(runnable);
        }
    }
}

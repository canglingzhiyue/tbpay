package com.taobao.android.riverlogger.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes6.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14933a;
    private static final AtomicBoolean b;

    static {
        kge.a(-2009419237);
        f14933a = new Object();
        b = new AtomicBoolean(false);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (b.get()) {
        } else {
            synchronized (f14933a) {
                if (!b.get()) {
                    System.loadLibrary("riverlogger");
                    b.set(true);
                }
            }
        }
    }
}

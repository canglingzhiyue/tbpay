package com.alibaba.ut.abtest.internal.database;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f4188a;

    static {
        kge.a(-1491214133);
    }

    private b() {
        super(new c(cex.a().c()));
    }

    public static synchronized b a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d3bcb606", new Object[0]);
            }
            if (f4188a == null) {
                f4188a = new b();
            }
            return f4188a;
        }
    }
}

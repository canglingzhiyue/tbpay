package com.ut.mini.core;

import com.alibaba.analytics.core.config.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aoa;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f24102a;

    static {
        kge.a(-47542737);
        f24102a = null;
    }

    private a() {
    }

    public static a getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3813018c", new Object[0]);
        }
        if (f24102a == null) {
            synchronized (a.class) {
                if (f24102a == null) {
                    f24102a = new a();
                }
            }
        }
        return f24102a;
    }

    public void transferLog(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8801825", new Object[]{this, map});
        } else if (map == null) {
        } else {
            try {
                if (q.a().a(map)) {
                    aoa.a(map);
                } else {
                    apr.a("log discard", "aLogMap", map);
                }
            } catch (Throwable th) {
                apr.b(null, th, new Object[0]);
            }
        }
    }
}

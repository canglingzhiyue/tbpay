package com.taobao.alimama.api;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f8400a;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f8401a;

        static {
            kge.a(1989616665);
            f8401a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ab32ffec", new Object[0]) : f8401a;
        }
    }

    static {
        kge.a(-426245556);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f8400a = new e();
        String str = "invocation manager load done, cost=" + (SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    public Object a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("31dd1e0e", new Object[]{this, dVar});
        }
        e eVar = this.f8400a;
        if (eVar == null) {
            throw new IllegalStateException("SDK Not initialized!");
        }
        return eVar.a(dVar);
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("abdfab8b", new Object[0]) : a.a();
    }
}

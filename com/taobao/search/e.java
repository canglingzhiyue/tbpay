package com.taobao.search;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jbg;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f19053a;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final e f19054a;

        static {
            kge.a(2117510644);
            f19054a = new e();
        }

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("bd6c1ec8", new Object[0]) : f19054a;
        }
    }

    static {
        kge.a(1893172604);
    }

    private e() {
        HandlerThread a2 = jbg.a("tbsearch_load");
        a2.start();
        this.f19053a = new Handler(a2.getLooper());
    }

    public static Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : a.a().f19053a;
    }
}

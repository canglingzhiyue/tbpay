package com.taobao.android.tbuprofen.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f15483a = (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(2, new h() { // from class: com.taobao.android.tbuprofen.common.e.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "tbuprofen-thread";
        }
    });

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final e f15485a;

        static {
            kge.a(-274937909);
            f15485a = new e();
        }

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("cc75f0ff", new Object[0]) : f15485a;
        }
    }

    static {
        kge.a(-1437462792);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("cc75f0ff", new Object[0]) : a.a();
    }

    public e() {
        this.f15483a.setKeepAliveTime(5L, TimeUnit.SECONDS);
        this.f15483a.allowCoreThreadTimeOut(true);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f15483a.execute(runnable);
        }
    }

    public void a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aab07da", new Object[]{this, runnable, new Long(j), timeUnit});
        } else {
            this.f15483a.schedule(runnable, j, timeUnit);
        }
    }
}

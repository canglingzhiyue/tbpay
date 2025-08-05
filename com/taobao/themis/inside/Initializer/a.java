package com.taobao.themis.inside.Initializer;

import android.app.Application;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;
import tb.qpt;
import tb.sxe;
import tb.sxg;
import tb.sxh;
import tb.sxj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007J\b\u0010\u0016\u001a\u00020\u0014H\u0007J\b\u0010\u0017\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/inside/Initializer/TMSCompensationInitJob;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "initAppInfoTaskStatus", "Ljava/util/concurrent/atomic/AtomicInteger;", "getInitAppInfoTaskStatus$annotations", "getInitAppInfoTaskStatus", "()Ljava/util/concurrent/atomic/AtomicInteger;", "initWeex1Task", "getInitWeex1Task$annotations", "getInitWeex1Task", "initWeexTaskStatus", "getInitWeexTaskStatus$annotations", "getInitWeexTaskStatus", "initZCacheTaskStatus", "getInitZCacheTaskStatus$annotations", "getInitZCacheTaskStatus", "CompensationPreloadInitTask", "", "CompensationWeex1InitTask", "CompensationWeexInitTask", "CompensationZCacheInitTask", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f22418a;
    private static final AtomicInteger b;
    private static final AtomicInteger c;
    private static final AtomicInteger d;

    static {
        kge.a(1303569923);
        INSTANCE = new a();
        f22418a = new AtomicInteger(3);
        b = new AtomicInteger(3);
        c = new AtomicInteger(3);
        d = new AtomicInteger(3);
    }

    private a() {
    }

    public static final AtomicInteger a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("f45a6d52", new Object[0]) : f22418a;
    }

    public static final AtomicInteger b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("69d49393", new Object[0]) : b;
    }

    public static final AtomicInteger c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("df4eb9d4", new Object[0]) : c;
    }

    public static final AtomicInteger d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("54c8e015", new Object[0]) : d;
    }

    @JvmStatic
    public static final void e() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        try {
            if (f22418a.get() != 0 || (iExecutorService = (IExecutorService) qpt.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) == null) {
                return;
            }
            executor.execute(c.INSTANCE);
        } catch (Exception e) {
            TMSLogger.b("TMSCompensationInitExtension", "CompensationWeexInitTask error", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
            Application applicationContext = iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null;
            if (applicationContext == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            sxh.a(applicationContext);
            a.a().set(1);
        }
    }

    @JvmStatic
    public static final void f() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        try {
            if (b.get() != 0 || (iExecutorService = (IExecutorService) qpt.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) == null) {
                return;
            }
            executor.execute(RunnableC0937a.INSTANCE);
        } catch (Exception e) {
            TMSLogger.b("TMSCompensationInitExtension", "CompensationPreloadInitTask error", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.inside.Initializer.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class RunnableC0937a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final RunnableC0937a INSTANCE = new RunnableC0937a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sxe.f();
            a.b().set(1);
        }
    }

    @JvmStatic
    public static final void g() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        try {
            if (c.get() != 0 || (iExecutorService = (IExecutorService) qpt.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) == null) {
                return;
            }
            executor.execute(d.INSTANCE);
        } catch (Exception e) {
            TMSLogger.b("TMSCompensationInitExtension", "CompensationZCacheInitTask error ", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sxj.f();
            a.c().set(1);
        }
    }

    @JvmStatic
    public static final void h() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        try {
            if (c.get() != 0 || (iExecutorService = (IExecutorService) qpt.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) == null) {
                return;
            }
            executor.execute(b.INSTANCE);
        } catch (Exception e) {
            TMSLogger.b("TMSCompensationInitExtension", "CompensationZCacheInitTask error", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
            Application applicationContext = iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null;
            if (applicationContext != null) {
                sxg.c(applicationContext, com.taobao.android.launcher.common.c.a("InitBasicParam"));
                a.d().set(1);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
    }
}

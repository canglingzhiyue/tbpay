package com.taobao.android.order.bundle.nav.list;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bxd;
import tb.jqg;
import tb.jqh;
import tb.kge;
import tb.qpf;

/* loaded from: classes6.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g INSTANCE;
    private static final AtomicInteger d;

    /* renamed from: a  reason: collision with root package name */
    private final String f14565a = "OrderListAsyncTask";
    private qpf b;
    private boolean c;

    public static /* synthetic */ qpf a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpf) ipChange.ipc$dispatch("e432ba3", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ AtomicInteger c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("df4eb9d4", new Object[0]) : d;
    }

    static {
        kge.a(-1166486941);
        d = new AtomicInteger(0);
        INSTANCE = new g();
    }

    private g() {
    }

    public void a(final Intent intent, final com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d54a2f", new Object[]{this, intent, dVar});
            return;
        }
        this.b = new qpf(dVar.a());
        this.c = true;
        com.taobao.android.order.bundle.cache.a.f();
        jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.nav.list.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!g.c().compareAndSet(0, 1)) {
                } else {
                    try {
                        jqg.b("OrderListAsyncTask", "asyncTaskOnNav start");
                        g.a(g.this).a(intent);
                        com.taobao.android.order.bundle.cache.a.a(dVar.a(), g.a(g.this).j(), com.taobao.android.order.bundle.cache.a.SCENE_FIRSTSCREEN);
                        g.a(g.this).a(true);
                        if (bxd.a("asyncCreateUltronProxy", false)) {
                            jqg.b("OrderListAsyncTask", "asyncPreCreate ultronProxy start");
                            g.a(g.this).b(intent);
                            g.a(g.this).b();
                            jqg.b("OrderListAsyncTask", "asyncPreCreate ultronProxy done");
                        }
                    } catch (Exception e) {
                        jqg.b("OrderListAsyncTask", "asyncNavTask error: " + e.getMessage());
                    } finally {
                        g.c().set(0);
                        jqg.b("OrderListAsyncTask", "asyncTaskOnNav end");
                    }
                }
            }
        });
    }

    public qpf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpf) ipChange.ipc$dispatch("f09b3d7", new Object[]{this});
        }
        if (!this.c) {
            this.b = null;
        }
        return this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}

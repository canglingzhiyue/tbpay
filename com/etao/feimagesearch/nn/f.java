package com.etao.feimagesearch.nn;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.f;
import com.etao.feimagesearch.util.ac;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.dai.adapter.MRTTaobaoAdapter;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAIConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.com;
import tb.cot;
import tb.coy;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String MNN_ACTION = "com.taobao.mrt.cv_task_ready";
    private static final kotlin.d e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f6898a;
    private final CopyOnWriteArrayList<b> b;
    private boolean c;
    private int d;

    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes3.dex */
    public static final class c extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Application b = com.b();
            if (b == null) {
                return;
            }
            DAIConfiguration create = DAI.newConfigurationBuilder(b).setUserAdapter(com.alibaba.analytics.h.class).setDebugMode(false).create();
            String c = com.c();
            if (StringUtils.isEmpty(c)) {
                return;
            }
            try {
                MRTTaobaoAdapter.startMNNRuntime(b, c, create);
                MNNCV.init(b);
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callMnnInit", 19999, new String[0]);
                cot.a("AutoDetect", "callMnnInit", "");
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        public d(String str, b bVar) {
            this.b = str;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (f.a(f.this, this.b)) {
                this.c.a();
            } else {
                f.c(f.this).add(this.c);
            }
        }
    }

    private f() {
        this.f6898a = new AtomicBoolean(false);
        this.b = new CopyOnWriteArrayList<>();
        this.d = 100;
        boolean a2 = a("");
        a(a2);
        if (a2 || com.etao.feimagesearch.config.b.N()) {
            return;
        }
        LocalBroadcastManager.getInstance(com.b()).registerReceiver(new BroadcastReceiver() { // from class: com.etao.feimagesearch.nn.MNNManager$broadcastReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* loaded from: classes3.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str = com.etao.feimagesearch.structure.capture.a.f6987a;
                    f fVar = f.this;
                    coy.a(str, "receiveMnnBroadcast", 19999, "hasCallMnnInit", String.valueOf(f.$ipChange));
                    StringBuilder sb = new StringBuilder();
                    sb.append("hasCallMnnInit:");
                    f fVar2 = f.this;
                    sb.append(f.$ipChange);
                    cot.a("AutoDetect", "receiveMnnBroadcast", sb.toString());
                    Iterator it = f.c(f.this).iterator();
                    q.a((Object) it, "mnnStatusListenerList.iterator()");
                    while (it.hasNext()) {
                        ((f.b) it.next()).a();
                    }
                    f.c(f.this).clear();
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                f fVar = f.this;
                f.$ipChange.set(true);
                com.etao.feimagesearch.mnn.g.a(new a());
            }
        }, new IntentFilter("com.taobao.mrt.cv_task_ready"));
    }

    public /* synthetic */ f(o oVar) {
        this();
    }

    public static final /* synthetic */ boolean a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52508c21", new Object[]{fVar, str})).booleanValue() : fVar.a(str);
    }

    public static final /* synthetic */ CopyOnWriteArrayList c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("bd6a573e", new Object[]{fVar}) : fVar.b;
    }

    public static final /* synthetic */ kotlin.d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("8055a8c5", new Object[0]) : e;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6899a;

        static {
            kge.a(644303304);
            f6899a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/nn/MNNManager;"))};
        }

        public final f a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("45061253", new Object[]{this});
            } else {
                kotlin.d c = f.c();
                a aVar = f.Companion;
                value = c.getValue();
            }
            return (f) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(1581481600);
        Companion = new a(null);
        e = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, MNNManager$Companion$instance$2.INSTANCE);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c || !com.etao.feimagesearch.config.b.bH() || a("")) {
        } else {
            this.c = true;
            VExecutors.defaultSharedThreadPool().submit(new c());
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void a(String taskName, b statusListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7a7bcb", new Object[]{this, taskName, statusListener});
            return;
        }
        q.c(taskName, "taskName");
        q.c(statusListener, "statusListener");
        com.etao.feimagesearch.mnn.g.a(new d(taskName, statusListener));
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.f6898a.get()) {
            return true;
        }
        return StringUtils.isEmpty(str) ? MNNCV.isAvailable() && MNNCV.isTaskRunnable("plt_autodetect") : MNNCV.isAvailable() && MNNCV.isTaskRunnable(str);
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "mnnInitStatusOnFirstIn", 19999, "mnnStatus", String.valueOf(z));
        cot.a("AutoDetect", "mnnInitStatusOnFirstIn", "mnnStatus: " + z);
        if (!z || MNNCV.isTaskRunnable("plt_autodetect")) {
            return;
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "mnnAvailableState", 19999, "plt_autodetect", "false", "plt_search", String.valueOf(MNNCV.isTaskRunnable("plt_search")));
    }

    public final void a(b statusListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351dd4d5", new Object[]{this, statusListener});
            return;
        }
        q.c(statusListener, "statusListener");
        this.b.remove(statusListener);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.clear();
        }
    }
}

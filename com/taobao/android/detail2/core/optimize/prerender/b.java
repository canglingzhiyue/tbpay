package com.taobao.android.detail2.core.optimize.prerender;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;
import tb.ctu;
import tb.fjt;
import tb.fkr;
import tb.gso;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b d;
    public a b;
    private String c = "NewDetail";

    /* renamed from: a  reason: collision with root package name */
    public List<C0469b> f11674a = new ArrayList(2);

    static {
        kge.a(-1200587295);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cb923cb4", new Object[0]);
        }
        if (d == null) {
            d = new b();
        }
        return d;
    }

    public C0469b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0469b) ipChange.ipc$dispatch("35f960d5", new Object[]{this});
        }
        if (!this.f11674a.isEmpty()) {
            return this.f11674a.remove(0);
        }
        return null;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3bfd2c15", new Object[]{this});
        }
        a aVar = this.b;
        this.b = null;
        return aVar;
    }

    public void a(fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bbe36b", new Object[]{this, fkrVar});
        } else if (fkrVar.r() == null || !fkrVar.r().e(fkrVar.k().W)) {
        } else {
            while (this.f11674a.size() < 2) {
                a(this.f11674a.size());
            }
        }
    }

    public void b(fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73ee9ec", new Object[]{this, fkrVar});
        } else if (fkrVar.r() == null || !fkrVar.r().e(fkrVar.k().W)) {
        } else {
            d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.taobao.android.detail2.core.optimize.prerender.b$1] */
    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "preCreateInstanceRootViewImpl");
        ctu.a("preCreateInstanceRootViewImpl");
        final a aVar = new a();
        aVar.f11677a = new Object();
        aVar.c = new c(Globals.getApplication());
        this.b = aVar;
        new Thread(this.c) { // from class: com.taobao.android.detail2.core.optimize.prerender.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    try {
                        ctu.a("AsyncInstanceViewLoad");
                        gso.a();
                        fjt.a(fjt.TAG_RENDER, "开始异步instance_layout视图");
                        aVar.b = com.taobao.android.detail2.core.optimize.prerender.a.b(aVar.c);
                        synchronized (aVar.f11677a) {
                            fjt.a(fjt.TAG_RENDER, "通知终止异步instance_layout视图线程阻塞");
                            aVar.f11677a.notifyAll();
                        }
                    } catch (Throwable unused) {
                        fjt.a(fjt.TAG_RENDER, "异步instance_layout视图异常");
                        synchronized (aVar.f11677a) {
                            fjt.a(fjt.TAG_RENDER, "通知终止异步instance_layout视图线程阻塞");
                            aVar.f11677a.notifyAll();
                        }
                    }
                    ctu.a();
                    fjt.a(fjt.TAG_RENDER, "异步instance_layout视图完成");
                } catch (Throwable th) {
                    synchronized (aVar.f11677a) {
                        fjt.a(fjt.TAG_RENDER, "通知终止异步instance_layout视图线程阻塞");
                        aVar.f11677a.notifyAll();
                        ctu.a();
                        throw th;
                    }
                }
            }
        }.start();
        ctu.a();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.taobao.android.detail2.core.optimize.prerender.b$2] */
    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "preCreateCardRootViewImpl" + i);
        ctu.a("preCreateCardRootViewImpl" + i);
        final C0469b c0469b = new C0469b();
        c0469b.f11678a = new Object();
        c0469b.d = new c(Globals.getApplication());
        this.f11674a.add(c0469b);
        new Thread(this.c) { // from class: com.taobao.android.detail2.core.optimize.prerender.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    try {
                        ctu.a("AsyncCardViewLoad");
                        gso.a();
                        fjt.a(fjt.TAG_RENDER, "开始异步detail_card_layout视图");
                        c0469b.b = com.taobao.android.detail2.core.optimize.prerender.a.a(c0469b.d);
                        c0469b.c = com.taobao.android.detail2.core.optimize.prerender.a.c(c0469b.d);
                        synchronized (c0469b.f11678a) {
                            fjt.a(fjt.TAG_RENDER, "通知终止异步detail_card_layout视图线程阻塞");
                            c0469b.f11678a.notifyAll();
                        }
                    } catch (Throwable unused) {
                        fjt.a(fjt.TAG_RENDER, "异步detail_card_layout视图异常");
                        synchronized (c0469b.f11678a) {
                            fjt.a(fjt.TAG_RENDER, "通知终止异步detail_card_layout视图线程阻塞");
                            c0469b.f11678a.notifyAll();
                        }
                    }
                    ctu.a();
                    fjt.a(fjt.TAG_RENDER, "异步detail_card_layout视图完成");
                } catch (Throwable th) {
                    synchronized (c0469b.f11678a) {
                        fjt.a(fjt.TAG_RENDER, "通知终止异步detail_card_layout视图线程阻塞");
                        c0469b.f11678a.notifyAll();
                        ctu.a();
                        throw th;
                    }
                }
            }
        }.start();
        ctu.a();
    }

    /* renamed from: com.taobao.android.detail2.core.optimize.prerender.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0469b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f11678a;
        public View b;
        public FrameLayout c;
        public c d;

        static {
            kge.a(1648050829);
        }

        public C0469b() {
        }

        public Object a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f11678a;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b;
        }

        public FrameLayout c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("56f39b2f", new Object[]{this}) : this.c;
        }

        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            } else {
                this.d.a(context);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f11677a;
        public View b;
        public c c;

        static {
            kge.a(107267842);
        }

        public a() {
        }

        public Object a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f11677a;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b;
        }

        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            } else {
                this.c.a(context);
            }
        }
    }
}

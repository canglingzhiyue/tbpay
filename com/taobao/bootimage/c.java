package com.taobao.bootimage;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.task.Coordinator;
import com.taobao.statistic.TBS;
import java.util.Properties;
import tb.kej;
import tb.kel;
import tb.kem;
import tb.keo;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f16673a;
    private volatile boolean b;
    private boolean c;
    private boolean d;
    private volatile boolean e;
    private long f;
    private volatile d h;
    private int g = -1;
    private boolean i = false;

    public static /* synthetic */ long a(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8995f3eb", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.f = j;
        return j;
    }

    public static /* synthetic */ d a(c cVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f1135e89", new Object[]{cVar, dVar});
        }
        cVar.h = dVar;
        return dVar;
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35fc9071", new Object[]{cVar})).booleanValue() : cVar.b;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8996300b", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.b = z;
        return z;
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f4c74f2", new Object[]{cVar})).booleanValue() : cVar.i;
    }

    public static /* synthetic */ d c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("964afd2b", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ long d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1ec3de4", new Object[]{cVar})).longValue() : cVar.f;
    }

    public static /* synthetic */ boolean e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db3c2275", new Object[]{cVar})).booleanValue() : cVar.d;
    }

    public static /* synthetic */ c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8df0ce2d", new Object[0]) : f16673a;
    }

    static {
        kge.a(-152795822);
        f16673a = new c();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e90aa1f3", new Object[0]) : f16673a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i = ABGlobal.isFeatureOpened(f.b(), "optBootImageEnable");
        try {
            Coordinator.postTask(new Coordinator.TaggedRunnable("bootimage pre-Init") { // from class: com.taobao.bootimage.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (c.g()) {
                        if (c.a(c.this)) {
                            return;
                        }
                        c.a(c.this, true);
                        if (!c.b(c.this)) {
                            TBS.Ext.commitEvent("BootImage_Init", (Properties) null);
                            c.a(c.this, keo.b());
                        }
                        BootImageDataMgr.a().e();
                        if (c.c(c.this) == null) {
                            c.a(c.this, new d(true, false));
                            if (!kel.c) {
                                c.c(c.this).a();
                            }
                        }
                        if (c.b(c.this)) {
                            return;
                        }
                        Properties properties = new Properties();
                        properties.put("time", Long.valueOf(keo.b() - c.d(c.this)));
                        properties.put("initResources", Boolean.valueOf(c.e(c.this)));
                        TBS.Ext.commitEvent("BootImage_InitFinish", properties);
                        kej.a(kem.TAG, "BootImageInitializer init finish");
                    }
                }
            });
            this.d = true;
        } catch (Throwable th) {
            kej.a(kem.TAG, "BootImageInitializer initResources error", th);
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.g == -1) {
            this.g = b(f.b());
        }
        return this.g;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            synchronized (f16673a) {
                if (!this.e && context != null) {
                    this.e = true;
                    if (!this.i) {
                        kej.a(kem.TAG, "BootImageInitializer initActivity start.");
                        this.g = b(context);
                    }
                    kem.a().j();
                }
            }
        } catch (Throwable th) {
            kej.a(kem.TAG, "BootImageInitializer init exception", th);
            this.e = false;
            this.c = true;
        }
    }

    private static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        try {
            return context.getResources().getDimensionPixelOffset(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c;
    }

    public d f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9d1fc6ed", new Object[]{this}) : this.h;
    }
}

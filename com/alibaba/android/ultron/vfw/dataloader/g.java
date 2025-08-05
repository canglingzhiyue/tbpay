package com.alibaba.android.ultron.vfw.dataloader;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.ultron.vfw.dataloader.m;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.kge;

/* loaded from: classes2.dex */
public class g implements p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f2695a;
    public b b;
    public n c;
    public com.alibaba.android.ultron.vfw.instance.d d;
    public Handler e = new Handler(Looper.getMainLooper());
    private boolean f;

    static {
        kge.a(-1977530590);
        kge.a(-1612684884);
    }

    public static /* synthetic */ boolean a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5ec3346", new Object[]{gVar})).booleanValue() : gVar.f;
    }

    public static g a(d dVar, n nVar, b bVar, com.alibaba.android.ultron.vfw.instance.d dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("724372de", new Object[]{dVar, nVar, bVar, dVar2});
        }
        g gVar = new g();
        gVar.f2695a = dVar;
        gVar.c = nVar;
        gVar.b = bVar;
        gVar.d = dVar2;
        if (dVar != null && nVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("DataLoaderRequest params error");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.alibaba.android.ultron.vfw.dataloader.p
    public void a(final m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24be769f", new Object[]{this, aVar});
        } else {
            this.c.a(this.f2695a, new b() { // from class: com.alibaba.android.ultron.vfw.dataloader.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.dataloader.b
                public void a(final h hVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5eca7a1", new Object[]{this, hVar});
                    } else if (g.this.b == null) {
                    } else {
                        UnifyLog.a(g.this.d.g(), "DataLoaderRequest", "DataLoader finished step5", new String[0]);
                        if (Looper.getMainLooper() == Looper.myLooper() || g.a(g.this)) {
                            g.this.b.a(hVar);
                            m.a aVar2 = aVar;
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.a();
                            return;
                        }
                        g.this.e.post(new Runnable() { // from class: com.alibaba.android.ultron.vfw.dataloader.g.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                g.this.b.a(hVar);
                                if (aVar == null) {
                                    return;
                                }
                                aVar.a();
                            }
                        });
                    }
                }

                @Override // com.alibaba.android.ultron.vfw.dataloader.b
                public void a(final h hVar, final UltronError ultronError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b531dfc4", new Object[]{this, hVar, ultronError});
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: com.alibaba.android.ultron.vfw.dataloader.g.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            d.InterfaceC0100d v = g.this.d.v();
                            if (v != null) {
                                v.a(ultronError);
                            }
                            if (g.this.b != null) {
                                g.this.b.a(hVar, ultronError);
                            }
                            if (aVar == null) {
                                return;
                            }
                            aVar.a();
                        }
                    };
                    if (Looper.getMainLooper() == Looper.myLooper() || g.a(g.this)) {
                        runnable.run();
                    } else {
                        g.this.e.post(runnable);
                    }
                }
            });
        }
    }
}

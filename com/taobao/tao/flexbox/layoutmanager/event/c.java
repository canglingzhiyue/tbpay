package com.taobao.tao.flexbox.layoutmanager.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f20391a;
    private int b;
    private long c;
    private WeakReference<aa> d;

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68369de5", new Object[]{cVar})).intValue();
        }
        int i = cVar.b;
        cVar.b = i - 1;
        return i;
    }

    public static /* synthetic */ int b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abc1bba6", new Object[]{cVar})).intValue() : cVar.b;
    }

    static {
        kge.a(2098417734);
        f20391a = new c();
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("29771c78", new Object[0]) : f20391a;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1b20c259", new Object[]{this});
        }
        this.b++;
        return new a() { // from class: com.taobao.tao.flexbox.layoutmanager.event.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.event.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                c.a(c.this);
                ogg.a("[GlobalClickManager] runningMonitorCount " + c.b(c.this));
            }
        };
    }

    public boolean a(aa aaVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691d3054", new Object[]{this, aaVar})).booleanValue();
        }
        if (!oeb.aN()) {
            return true;
        }
        boolean z2 = aaVar.M().I() instanceof PopLayerComponent;
        boolean o = (oeb.bd() ? aaVar.M() : aaVar.k().A()).o();
        ogg.a("[GlobalClickManager] canHandleClick runningMonitorCount:" + this.b + "  rootAppear:" + o);
        if (this.b <= 0 && ((o || z2) && b(aaVar))) {
            z = true;
        }
        if (z) {
            this.c = System.currentTimeMillis();
            this.d = new WeakReference<>(aaVar);
        }
        return z;
    }

    private boolean b(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca84e15", new Object[]{this, aaVar})).booleanValue();
        }
        WeakReference<aa> weakReference = this.d;
        return weakReference == null || weakReference.get() == aaVar || System.currentTimeMillis() - this.c > ((long) oeb.aY());
    }
}

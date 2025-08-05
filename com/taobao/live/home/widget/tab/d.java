package com.taobao.live.home.widget.tab;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f17776a;

    /* loaded from: classes7.dex */
    interface a {
        void a(d dVar);
    }

    /* loaded from: classes7.dex */
    public static class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-791767611);
            kge.a(480887338);
        }

        @Override // com.taobao.live.home.widget.tab.d.a
        public void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecb241a", new Object[]{this, dVar});
            }
        }
    }

    /* loaded from: classes7.dex */
    interface c {
        void a(d dVar);
    }

    /* renamed from: com.taobao.live.home.widget.tab.d$d  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    interface InterfaceC0687d {
        d a();
    }

    /* loaded from: classes7.dex */
    public static abstract class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes7.dex */
        interface a {
            void a();
        }

        /* loaded from: classes7.dex */
        interface b {
            void a();
        }

        static {
            kge.a(-1059777009);
        }

        public abstract void a();

        public abstract void a(float f, float f2);

        public abstract void a(int i);

        public abstract void a(int i, int i2);

        public abstract void a(Interpolator interpolator);

        public abstract void a(a aVar);

        public abstract void a(b bVar);

        public abstract boolean b();

        public abstract int c();

        public abstract void d();

        public abstract float e();

        public abstract long f();
    }

    static {
        kge.a(-1996656779);
    }

    public d(e eVar) {
        this.f17776a = eVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f17776a.a();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f17776a.b();
    }

    public void a(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade445bd", new Object[]{this, interpolator});
        } else {
            this.f17776a.a(interpolator);
        }
    }

    public void a(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8768667b", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.f17776a.a(new e.b() { // from class: com.taobao.live.home.widget.tab.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.live.home.widget.tab.d.e.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        cVar.a(d.this);
                    }
                }
            });
        } else {
            this.f17776a.a((e.b) null);
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87677dbd", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.f17776a.a(new e.a() { // from class: com.taobao.live.home.widget.tab.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.live.home.widget.tab.d.e.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        aVar.a(d.this);
                    }
                }
            });
        } else {
            this.f17776a.a((e.a) null);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f17776a.a(i, i2);
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f17776a.c();
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f17776a.a(f, f2);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f17776a.a(i);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f17776a.d();
        }
    }

    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.f17776a.e();
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.f17776a.f();
    }
}

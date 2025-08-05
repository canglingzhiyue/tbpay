package com.taobao.search.musie.tab;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f19280a;
    private int b;
    private boolean c;

    static {
        kge.a(984300197);
    }

    public static /* synthetic */ int a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4290668b", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.b = i;
        return i;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4290a66d", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.c = z;
        return z;
    }

    public static /* synthetic */ int b(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56383a0c", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.f19280a = i;
        return i;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f19280a = i;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f19280a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f19281a;
        private int b;
        private boolean c;

        static {
            kge.a(2106825852);
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ae63fe1", new Object[]{this, new Integer(i)});
            }
            this.f19281a = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8c38dc80", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff4afbb2", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a0935cb", new Object[]{this});
            }
            d dVar = new d();
            d.a(dVar, this.c);
            d.a(dVar, this.b);
            d.b(dVar, this.f19281a);
            return dVar;
        }
    }
}

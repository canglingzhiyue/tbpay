package com.taobao.taolive.sdk.model;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.n;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import tb.ipy;
import tb.kge;
import tb.pnq;
import tb.pns;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<pns> c;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private a l;
    private a m;
    private int n = 0;
    private int o = 0;

    /* renamed from: a  reason: collision with root package name */
    public pnq f21856a = new pnq() { // from class: com.taobao.taolive.sdk.model.i.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pnq
        public void a(final int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
            } else if (i.a(i.this) == null) {
            } else {
                i.a(i.this).post(new Runnable() { // from class: com.taobao.taolive.sdk.model.i.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (i == 1000) {
                            i.a(i.this, "single subscribe success");
                            i.b(i.this);
                        } else {
                            i.a(i.this, "single subscribe error");
                            i.a(i.this, i);
                        }
                    }
                });
            }
        }
    };
    public pnq b = new pnq() { // from class: com.taobao.taolive.sdk.model.i.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pnq
        public void a(final int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
            } else if (i.a(i.this) == null) {
            } else {
                i.a(i.this).post(new Runnable() { // from class: com.taobao.taolive.sdk.model.i.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (i == 1000) {
                            i.a(i.this, "single unSubscribe success");
                            i.c(i.this);
                        } else {
                            i.a(i.this, "single unSubscribe error");
                            i.b(i.this, i);
                        }
                    }
                });
            }
        }
    };
    private int d = 100;
    private Handler p = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, i iVar);

        void a(i iVar);

        void b(int i, i iVar);

        void b(i iVar);
    }

    static {
        kge.a(1489553889);
    }

    public static /* synthetic */ Handler a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("11e4aee9", new Object[]{iVar}) : iVar.p;
    }

    public static /* synthetic */ void a(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cd45e6", new Object[]{iVar, new Integer(i)});
        } else {
            iVar.b(i);
        }
    }

    public static /* synthetic */ void a(i iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7521947", new Object[]{iVar, str});
        } else {
            iVar.a(str);
        }
    }

    public static /* synthetic */ void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c353983e", new Object[]{iVar});
        } else {
            iVar.o();
        }
    }

    public static /* synthetic */ void b(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71fe285", new Object[]{iVar, new Integer(i)});
        } else {
            iVar.c(i);
        }
    }

    public static /* synthetic */ void c(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fb6bbf", new Object[]{iVar});
        } else {
            iVar.p();
        }
    }

    public i(h hVar) {
        this.i = "";
        this.m = hVar.h;
        this.c = hVar.i;
        this.e = hVar.b();
        this.f = hVar.i();
        this.g = hVar.d();
        this.h = hVar.e();
        this.i = hVar.f();
        this.j = hVar.g();
        this.k = hVar.h();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a("subscribe mEnterRetryCount = " + this.n);
        pns pnsVar = this.c.get();
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(this.g, this.e, this.h, this.i, this.j ? "33" : "tb", this.k, this.f21856a, new Object[0]);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a("unSubscribe mLeaveRetryCount = " + this.o);
        pns pnsVar = this.c.get();
        if (pnsVar == null) {
            return;
        }
        pnsVar.b(this.g, this.e, this.h, this.i, this.j ? "33" : "tb", this.k, this.b, new Object[0]);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a("setState before " + ipy.a(this.d));
        this.d = i;
        a("setState after " + ipy.a(this.d));
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.g;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.h;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.i;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.j;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.k;
    }

    public WeakReference<pns> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("830c0540", new Object[]{this}) : this.c;
    }

    public a l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8173d2fb", new Object[]{this}) : this.m;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a281a0", new Object[]{this, aVar});
        } else {
            this.l = aVar;
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        WeakReference<pns> weakReference = this.c;
        return (weakReference == null || weakReference.get() == null || this.e == null || this.f == null) ? false : true;
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : UUID.randomUUID().toString();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = k.TAG;
        n.a(str2, "MessageServiceTransaction-" + this.e + "-" + this.f + " " + str);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            r();
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.n;
        if (i2 < 3) {
            this.n = i2 + 1;
            a();
            return;
        }
        e(i);
        this.n = 0;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            q();
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.o;
        if (i2 < 3) {
            this.o = i2 + 1;
            b();
            return;
        }
        d(i);
        this.o = 0;
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.m;
        if (aVar != null) {
            aVar.b(i, this);
        }
        a aVar2 = this.l;
        if (aVar2 == null) {
            return;
        }
        aVar2.b(i, this);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        a aVar = this.m;
        if (aVar != null) {
            aVar.b(this);
        }
        a aVar2 = this.l;
        if (aVar2 == null) {
            return;
        }
        aVar2.b(this);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        a aVar = this.m;
        if (aVar != null) {
            aVar.a(this);
        }
        a aVar2 = this.l;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(this);
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.m;
        if (aVar != null) {
            aVar.a(i, this);
        }
        a aVar2 = this.l;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(i, this);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageServiceTransaction{mState=" + ipy.a(this.d) + ", topic='" + this.e + "', pmSession='" + this.f + "', mBizCode=" + this.g + ", mChannel='" + this.h + "', nick='" + this.i + "', isFandom=" + this.j + '}';
    }
}

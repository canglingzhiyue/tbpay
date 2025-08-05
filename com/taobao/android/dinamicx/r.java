package com.taobao.android.dinamicx;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.fqi;
import tb.fux;
import tb.ggx;
import tb.kge;

/* loaded from: classes.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f11918a;
    private final WeakReference<DXEngineConfig> b;
    private WeakReference<t> c;
    private WeakReference<com.taobao.android.dinamicx.expression.expr_v2.d> d;
    private WeakReference<DinamicXEngine> e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private final boolean l;
    private final int m;
    private final String n;
    private final String o;
    private boolean p;
    private boolean q;

    static {
        kge.a(-1601480538);
    }

    public r(DXEngineConfig dXEngineConfig) {
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = 500;
        this.j = false;
        this.k = false;
        this.p = false;
        this.b = new WeakReference<>(dXEngineConfig);
        this.f11918a = dXEngineConfig.c();
        if (fqi.c(dXEngineConfig.f11775a)) {
            this.f = true;
        }
        if (fqi.d(dXEngineConfig.c())) {
            this.g = true;
        }
        if (fqi.h(dXEngineConfig.c())) {
            this.h = true;
            this.i = fqi.w();
        }
        if (fqi.t(dXEngineConfig.c())) {
            this.p = true;
        }
        this.j = fqi.i(dXEngineConfig.c());
        Log.e("DXEngineContext", "supportViewReuse " + this.j);
        fux.b("DXEngineContext supportViewReuse" + this.j);
        if (fqi.p(dXEngineConfig.c())) {
            this.k = true;
        }
        this.l = fqi.r(dXEngineConfig.c());
        this.m = fqi.c(dXEngineConfig.c(), dXEngineConfig.x());
        this.n = fqi.d(dXEngineConfig.c(), dXEngineConfig.x()) ? dXEngineConfig.x() : DXEngineConfig.DX_DEFAULT_SUB_BIZTYPE;
        this.o = q();
        if (fqi.E(dXEngineConfig.c())) {
            this.q = true;
        }
    }

    public DXEngineConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3edbcd12", new Object[]{this});
        }
        DinamicXEngine b = b();
        if (b == null) {
            return this.b.get();
        }
        return b.b();
    }

    public void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
        } else {
            this.e = new WeakReference<>(dinamicXEngine);
        }
    }

    public DinamicXEngine b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("870a047e", new Object[]{this});
        }
        WeakReference<DinamicXEngine> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public com.taobao.android.dinamicx.expression.expr_v2.d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.expression.expr_v2.d) ipChange.ipc$dispatch("1cc54c84", new Object[]{this});
        }
        WeakReference<com.taobao.android.dinamicx.expression.expr_v2.d> weakReference = this.d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(com.taobao.android.dinamicx.expression.expr_v2.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d976c0", new Object[]{this, dVar});
        } else {
            this.d = new WeakReference<>(dVar);
        }
    }

    public t d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("d4de9c7b", new Object[]{this});
        }
        WeakReference<t> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea7c5f8", new Object[]{this, tVar});
        } else {
            this.c = new WeakReference<>(tVar);
        }
    }

    public void a(DXRootView dXRootView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5028c185", new Object[]{this, dXRootView, obj});
        } else if (b() == null) {
        } else {
            b().a(dXRootView, obj);
        }
    }

    public long e() {
        ak r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        if (b() != null && (r = b().r()) != null) {
            return r.a();
        }
        return -1L;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.i;
    }

    public bj j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bj) ipChange.ipc$dispatch("80700779", new Object[]{this});
        }
        DinamicXEngine b = b();
        if (b != null) {
            return b.y();
        }
        return null;
    }

    public ggx k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggx) ipChange.ipc$dispatch("5bf57e3c", new Object[]{this});
        }
        DinamicXEngine b = b();
        if (b != null) {
            return b.z();
        }
        return null;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : (a() == null || a().w() == 0 || !this.j) ? false : true;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.k;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.l;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.m;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.o;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        DXEngineConfig a2 = a();
        return a2.c() + "|" + this.n;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.p;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.q;
    }
}

package com.alibaba.security.realidentity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABActionResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.n0;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class t0 extends a1 implements y3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String G = "ABStateMachine";
    public c0 A;
    public boolean B;
    public ABActionResult C;
    public List<ABDetectType> D;
    public int E;
    public ABDetectType F;
    public final q h;
    public final Context i;
    public final s3 j;
    public final Handler k;
    public final y l;
    public final l0 m;
    public e1 n;
    public n0 o;
    public final m0 p;
    public u0 q;
    public w0 r;
    public q0 s;
    public r0 t;
    public o0 u;
    public p0 v;
    public v0 w;
    public final RPBizConfig x;
    public boolean y;
    public ABDetectPhase z;

    public t0(Context context, q qVar, RPBizConfig rPBizConfig, u4 u4Var, i0 i0Var) {
        super(G);
        this.z = ABDetectPhase.INIT;
        this.B = false;
        this.E = -1;
        this.F = ABDetectType.DONE;
        this.x = rPBizConfig;
        this.h = qVar;
        this.i = context;
        s3 s3Var = new s3(this.i);
        this.j = s3Var;
        s3Var.b(this);
        this.k = new Handler(Looper.getMainLooper());
        y yVar = new y(this, u4Var);
        this.l = yVar;
        this.p = new m0(this.i, rPBizConfig, i0Var, yVar);
        l0 l0Var = new l0(this);
        this.m = l0Var;
        this.l.a(l0Var);
        D();
        E();
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        this.y = false;
        boolean a2 = this.l.a(this.i, this.x);
        if (!a2) {
            a2 = this.l.a(this.i, this.x);
        }
        this.y = a2;
        return a2;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detectType", e0.a(this.x.getBiometricsType()) ? "colorful" : "action");
        hashMap.put("timeout", Integer.valueOf(this.x.getBiometricsConfig().timeOut));
        o.b().a(6, (Map<String, Object>) hashMap);
        c(this.x.getBiometricsConfig().timeOut);
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        this.q = new u0(this);
        this.r = new w0(this);
        if (!e0.a(this.x.getBiometricsType())) {
            this.s = new q0(this);
            this.t = new r0(this);
            this.u = new o0(this);
            this.v = new p0(this);
        }
        this.w = new v0(this);
        g();
    }

    private boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : System.currentTimeMillis() - this.p.c().beginTime > 200 && this.z.getValue() < ABDetectPhase.FINISH.getValue();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a((z0) this.q);
        a(this.r, this.q);
        if (!e0.a(this.x.getBiometricsType())) {
            a(this.s, this.r);
            a(this.t, this.r);
            a(this.u, this.r);
            a(this.v, this.r);
        }
        a(this.w, this.r);
    }

    public static /* synthetic */ Object ipc$super(t0 t0Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.p.d();
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else if (!e0.a(this.x.getBiometricsType())) {
            if (this.x.getBiometricsConfig().strategy != null && this.x.getBiometricsConfig().strategy.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i : this.x.getBiometricsConfig().strategy) {
                    arrayList.add(ABDetectType.valueOf(i));
                }
                this.n = new c1(arrayList);
                return;
            }
            this.n = new d1();
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        List<ABDetectType> list = this.D;
        return list == null || this.E >= list.size() - 1;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.B;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.o.a();
    }

    public ABDetectType J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABDetectType) ipChange.ipc$dispatch("f0ee0294", new Object[]{this});
        }
        this.F = ABDetectType.DONE;
        List<ABDetectType> list = this.D;
        if (list != null && this.E < list.size() - 1) {
            int i = this.E + 1;
            this.E = i;
            this.F = this.D.get(i);
        }
        return this.F;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        d();
        y yVar = this.l;
        if (yVar != null) {
            yVar.k();
        }
        List<ABDetectType> list = this.D;
        if (list != null) {
            list.clear();
        }
        n0 n0Var = this.o;
        if (n0Var != null) {
            n0Var.a((n0.b) null);
        }
        s3 s3Var = this.j;
        if (s3Var != null) {
            s3Var.d();
        }
        this.y = false;
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        this.p.c().increaseRetryTime();
        if (this.p.c().retryCount > 5) {
            this.m.b(e2.s);
        } else {
            P();
        }
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.p.a(this.l);
    }

    public final boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue() : this.p.b(this.l);
    }

    public final boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.p.c(this.l);
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else if (m.e()) {
            this.m.b(e2.k);
        } else if (!this.y && !B()) {
        } else {
            if (this.z != ABDetectPhase.INIT) {
                b(0);
            }
            C();
            D();
            E();
            h();
            this.p.f();
            this.B = true;
            this.A = null;
            this.m.b();
            this.z = ABDetectPhase.INIT;
            b((z0) this.r);
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
        } else {
            f();
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else {
            this.B = true;
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        try {
            T();
            if (this.o != null) {
                this.o.d();
            }
            b(998);
        } catch (Throwable unused) {
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else {
            this.B = false;
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        this.h.g();
        this.p.g();
    }

    public final boolean a(ABActionResult aBActionResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23ba7150", new Object[]{this, aBActionResult})).booleanValue() : this.p.a(this.l, aBActionResult, t());
    }

    public final void b(y0 y0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e2725c", new Object[]{this, y0Var});
        } else if (y0Var == null) {
        } else {
            a(y0Var);
        }
    }

    public final void c(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb731075", new Object[]{this, new Integer(i), obj});
        } else {
            this.p.b(i, obj);
        }
    }

    public final void d(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72ac0be", new Object[]{this, message});
        } else {
            a(message);
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.p.f(i);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (e0.a(this.x.getBiometricsType())) {
        } else {
            List<ABDetectType> a2 = this.n.a(this.x.getBiometricsConfig().actionCount);
            if (!this.x.getBiometricsConfig().stepAdjust && a2.size() > 0) {
                ABDetectType aBDetectType = a2.get(0);
                if (aBDetectType == ABDetectType.BLINK) {
                    aBDetectType = ABDetectType.BLINK_STILL;
                } else if (aBDetectType == ABDetectType.MOUTH) {
                    aBDetectType = ABDetectType.MOUTH_STILL;
                } else if (aBDetectType == ABDetectType.POS_YAW) {
                    aBDetectType = ABDetectType.YAW_STILL;
                } else if (aBDetectType == ABDetectType.POS_PITCH) {
                    aBDetectType = ABDetectType.PITCH_STILL;
                } else if (aBDetectType == ABDetectType.POS_PITCH_UP || aBDetectType == ABDetectType.POS_PITCH_DOWN) {
                    aBDetectType = ABDetectType.PITCH_STILL;
                }
                a2.set(0, aBDetectType);
            }
            this.D = a2;
            this.E = -1;
            this.F = ABDetectType.NONE;
        }
    }

    public final l0 i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l0) ipChange.ipc$dispatch("77af938c", new Object[]{this}) : this.m;
    }

    public q j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("7ff86a36", new Object[]{this}) : this.h;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        List<ABDetectType> list = this.D;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final o0 l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o0) ipChange.ipc$dispatch("8ddf3e2c", new Object[]{this}) : this.u;
    }

    public final p0 m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p0) ipChange.ipc$dispatch("9544770c", new Object[]{this}) : this.v;
    }

    public List<ABDetectType> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("25adebb2", new Object[]{this}) : this.D;
    }

    public final q0 o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q0) ipChange.ipc$dispatch("a40ee50b", new Object[]{this}) : this.s;
    }

    @Override // com.alibaba.security.realidentity.y3
    public void onIlluminanceChangedListener(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35571687", new Object[]{this, new Float(f)});
            return;
        }
        y yVar = this.l;
        if (yVar == null) {
            return;
        }
        yVar.a(f);
    }

    public final r0 p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r0) ipChange.ipc$dispatch("ab741deb", new Object[]{this}) : this.t;
    }

    public c0 q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c0) ipChange.ipc$dispatch("b2d91abb", new Object[]{this}) : this.A;
    }

    public ALBiometricsResult r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ALBiometricsResult) ipChange.ipc$dispatch("bf085b6e", new Object[]{this}) : this.p.c();
    }

    public ABDetectType s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABDetectType) ipChange.ipc$dispatch("e45cc8bd", new Object[]{this}) : this.F;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.E;
    }

    public ABActionResult u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABActionResult) ipChange.ipc$dispatch("e91666e0", new Object[]{this}) : this.C;
    }

    public ABDetectPhase v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABDetectPhase) ipChange.ipc$dispatch("895e1230", new Object[]{this}) : this.z;
    }

    public final m0 w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m0) ipChange.ipc$dispatch("df387eff", new Object[]{this}) : this.p;
    }

    public final y x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (y) ipChange.ipc$dispatch("30bac53c", new Object[]{this}) : this.l;
    }

    public final v0 y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v0) ipChange.ipc$dispatch("ee030b06", new Object[]{this}) : this.w;
    }

    public final Handler z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("4c3dcd25", new Object[]{this}) : this.k;
    }

    public final void a(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777bd59", new Object[]{this, new Integer(i), bundle});
        } else {
            this.p.a(i, bundle);
        }
    }

    public void b(ABActionResult aBActionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526bdb6b", new Object[]{this, aBActionResult});
        } else {
            this.C = aBActionResult;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.o == null) {
            this.o = new n0(i);
        }
        this.o.b();
        this.o.c();
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.p.e(i);
        }
    }

    public final void a(ABDetectType aBDetectType, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2aaf2b", new Object[]{this, aBDetectType, new Boolean(z), new Boolean(z2)});
        } else {
            this.p.a(aBDetectType, z, z2);
        }
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ecb514", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.B) {
        } else {
            if (bArr == null) {
                this.m.b(e2.l);
                return;
            }
            if (H()) {
                this.l.a(bArr, i, i2, i3);
            } else {
                z = false;
            }
            if (z && (i3 == 90 || i3 == 270)) {
                i3 = 0;
                i2 = i;
                i = i2;
            }
            this.p.a(bArr, i, i2, i3);
        }
    }

    public void a(ABDetectPhase aBDetectPhase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4458ecdb", new Object[]{this, aBDetectPhase});
        } else {
            this.z = aBDetectPhase;
        }
    }

    public void a(c0 c0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26afe85", new Object[]{this, c0Var});
        } else {
            this.A = c0Var;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.p.a(j);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p.a(z);
        }
    }
}

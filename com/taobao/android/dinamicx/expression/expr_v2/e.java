package com.taobao.android.dinamicx.expression.expr_v2;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import tb.fqx;
import tb.frj;
import tb.frp;
import tb.frz;
import tb.fsa;
import tb.fsq;
import tb.fsr;
import tb.fst;
import tb.ftg;
import tb.fuf;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static fqx h;
    private static ftg i;
    private static fsr j;
    private static frj k;
    private static fsq l;
    private static frz m;
    private static frp n;
    private static fst o;
    private static fsa p;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11868a = false;
    private boolean b = true;
    private b c = new b();
    private final ArrayList<f> d = new ArrayList<>();
    private final Stack<f> e = new Stack<>();
    private boolean f = false;
    private d g;

    static {
        kge.a(432792301);
        h = new fqx();
        i = new ftg();
        j = new fsr();
        k = new frj();
        l = new fsq();
        m = new frz();
        n = new frp();
        o = new fst();
        p = new fsa();
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d976c0", new Object[]{this, dVar});
        } else {
            this.g = dVar;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXExprVM{mConst=" + this.d + ", mVarStack=" + this.e + '}';
    }

    public void a(byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i2)});
            return;
        }
        this.f = true;
        this.c.a(bArr, i2);
        int a2 = this.c.a();
        this.d.clear();
        this.d.ensureCapacity(a2);
        for (int i3 = 0; i3 < a2; i3++) {
            this.d.add(null);
        }
    }

    public f a(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, int i2, Map<String, f> map, i iVar, c cVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a8250588", new Object[]{this, dXRuntimeContext, dXEvent, new Integer(i2), map, iVar, cVar, aVar});
        }
        if (!this.f) {
            throw new IllegalStateException("run before decode");
        }
        try {
            a(dXRuntimeContext, dXEvent, this.c.b(), this.c.b(i2), this.c.c(i2), map, iVar, cVar, aVar);
            if (this.e.size() == 0) {
                throw new IllegalStateException("expression has no return value");
            }
            if (this.e.size() > 1) {
                throw new IllegalStateException("invalid stack size. vm error");
            }
            return this.e.pop();
        } catch (Throwable th) {
            this.e.clear();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:306:0x07fe, code lost:
        if (r25.e.pop().C() != false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0800, code lost:
        r24 = (r1 - r19) - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x084a, code lost:
        if (r25.e.pop().C() == false) goto L326;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.dinamicx.DXRuntimeContext r26, com.taobao.android.dinamicx.expression.event.DXEvent r27, byte[] r28, int r29, int r30, java.util.Map<java.lang.String, com.taobao.android.dinamicx.expression.expr_v2.f> r31, com.taobao.android.dinamicx.expression.expr_v2.i r32, com.taobao.android.dinamicx.expression.expr_v2.c r33, com.taobao.android.dinamicx.expression.expr_v2.a r34) {
        /*
            Method dump skipped, instructions count: 3384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.expression.expr_v2.e.a(com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.expression.event.DXEvent, byte[], int, int, java.util.Map, com.taobao.android.dinamicx.expression.expr_v2.i, com.taobao.android.dinamicx.expression.expr_v2.c, com.taobao.android.dinamicx.expression.expr_v2.a):void");
    }

    private f a(f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("342ab858", new Object[]{this, fVar, fVar2});
        }
        if (fVar.b() || fVar2.b()) {
            return a(fVar.c() / fVar2.c());
        }
        throw new IllegalStateException("Can't do " + fVar + " / " + fVar2);
    }

    private f b(f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("21f31b77", new Object[]{this, fVar, fVar2});
        }
        if (fVar.b() || fVar2.b()) {
            return a(fVar.c() * fVar2.c());
        }
        throw new IllegalStateException("Can't do " + fVar + " * " + fVar2);
    }

    private f c(f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("fbb7e96", new Object[]{this, fVar, fVar2});
        }
        if (fVar.b() || fVar2.b()) {
            return a(fVar.A() - fVar2.A());
        }
        throw new IllegalStateException("Can't do " + fVar + " - " + fVar2);
    }

    private f d(f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("fd83e1b5", new Object[]{this, fVar, fVar2});
        }
        if (fVar.b() && fVar2.b()) {
            return a(fVar.c() + fVar2.c());
        }
        if (fVar.y()) {
            fVar = a(fVar.c());
        }
        if (fVar2.y()) {
            fVar2 = a(fVar2.c());
        }
        return f.a(fVar.toString() + fVar2.toString());
    }

    private f a(f fVar, f fVar2, DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, fuf fufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("abf7d08c", new Object[]{this, fVar, fVar2, dXEvent, dXRuntimeContext, fufVar});
        }
        f[] fVarArr = {fVar, fVar2};
        h hVar = new h();
        hVar.a(dXEvent);
        try {
            return fufVar.call(dXRuntimeContext, null, 2, fVarArr, hVar);
        } catch (Throwable th) {
            f.f();
            throw new IllegalArgumentException("FunctionError: " + th.getMessage(), th);
        }
    }

    private boolean e(f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b658ad1c", new Object[]{this, fVar, fVar2})).booleanValue();
        }
        if (fVar2.e() == fVar.e()) {
            switch (fVar2.e()) {
                case 0:
                case 1:
                    return true;
                case 2:
                    if (fVar2.w() == fVar.w()) {
                        return true;
                    }
                    break;
                case 3:
                    if (Double.compare(fVar2.z(), fVar.z()) == 0) {
                        return true;
                    }
                    break;
                case 4:
                    if (fVar2.B() == fVar.B()) {
                        return true;
                    }
                    break;
                case 5:
                    return fVar2.i().equals(fVar.i());
                case 6:
                case 7:
                case 8:
                case 9:
                    return fVar2.b(fVar);
                default:
                    throw new IllegalArgumentException("invalid type");
            }
        }
        return false;
    }

    private f a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("12591cd6", new Object[]{this, new Double(d)});
        }
        long round = Math.round(d);
        if (round == d) {
            return f.a(round);
        }
        return f.a(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.android.dinamicx.expression.expr_v2.f a(com.taobao.android.dinamicx.DXRuntimeContext r6, com.taobao.android.dinamicx.expression.expr_v2.f r7, com.taobao.android.dinamicx.expression.expr_v2.f r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.expression.expr_v2.e.a(com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.expression.expr_v2.f, com.taobao.android.dinamicx.expression.expr_v2.f, boolean):com.taobao.android.dinamicx.expression.expr_v2.f");
    }

    private f a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("258601da", new Object[]{this, jSONObject, str});
        }
        Object obj = jSONObject.get(str);
        if (obj == null) {
            return f.g();
        }
        return f.b(obj);
    }

    private f a(JSONArray jSONArray, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f6a2bfd9", new Object[]{this, jSONArray, new Integer(i2)});
        }
        Object obj = jSONArray.get(i2);
        if (obj == null) {
            return f.g();
        }
        return f.b(obj);
    }

    private f a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f79420b1", new Object[]{this, new Integer(i2)});
        }
        f fVar = this.d.get(i2);
        if (fVar == null) {
            fVar = this.c.a(i2);
            this.d.set(i2, fVar);
        }
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Invalid const: " + i2);
    }

    private boolean a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("487cd5dd", new Object[]{this, dXRuntimeContext})).booleanValue() : dXRuntimeContext.C().f();
    }
}

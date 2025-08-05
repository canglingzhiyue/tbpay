package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.internal.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public class c extends AbstractEventHandler implements o.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private x A;
    private x B;
    private a C;
    private boolean n;
    private double o;
    private double p;
    private double q;
    private double r;
    private double s;
    private double t;
    private o u;
    private p v;
    private p w;
    private p x;
    private String y;
    private LinkedList<Double> z;

    static {
        kge.a(1259890122);
        kge.a(188810242);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 69046641) {
            super.a((String) objArr[0], (Map) objArr[1], (l) objArr[2], (List) objArr[3], (d.a) objArr[4]);
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    public c(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.n = false;
        this.z = new LinkedList<>();
        this.A = new x(mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, 1.0d);
        this.B = new x(mto.a.GEO_NOT_SUPPORT, 1.0d, 1.0d);
        this.C = new a(mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT);
        if (context != null) {
            this.u = o.a(context);
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        o oVar = this.u;
        if (oVar == null) {
            return false;
        }
        oVar.a(this);
        return this.u.a(1);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a(String str, Map<String, Object> map, l lVar, List<Map<String, Object>> list, d.a aVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d9171", new Object[]{this, str, map, lVar, list, aVar});
            return;
        }
        super.a(str, map, lVar, list, aVar);
        if (map != null) {
            String str3 = (String) map.get(BindingXConstants.KEY_SCENE_TYPE);
            str2 = TextUtils.isEmpty(str3) ? "2d" : str3.toLowerCase();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || (!"2d".equals(str2) && !"3d".equals(str2))) {
            str2 = "2d";
        }
        this.y = str2;
        com.alibaba.android.bindingx.core.h.b("[ExpressionOrientationHandler] sceneType is " + str2);
        if ("2d".equals(str2)) {
            this.v = new p(null, Double.valueOf(90.0d), null);
            this.w = new p(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), null, Double.valueOf(90.0d));
        } else if (!"3d".equals(str2)) {
        } else {
            this.x = new p(null, null, null);
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        d();
        if (this.u == null) {
            return false;
        }
        a("end", this.r, this.s, this.t, new Object[0]);
        return this.u.b(this);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        o oVar = this.u;
        if (oVar != null) {
            oVar.b(this);
            this.u.a();
        }
        if (this.f2232a == null) {
            return;
        }
        this.f2232a.clear();
        this.f2232a = null;
    }

    @Override // com.alibaba.android.bindingx.core.internal.o.a
    public void a(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        boolean c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d0ab16", new Object[]{this, new Double(d), new Double(d2), new Double(d3)});
            return;
        }
        double round = Math.round(d);
        double round2 = Math.round(d2);
        double round3 = Math.round(d3);
        if (round == this.r && round2 == this.s && round3 == this.t) {
            return;
        }
        if (!this.n) {
            this.n = true;
            a("start", round, round2, round3, new Object[0]);
            d5 = round;
            this.o = d5;
            d6 = round2;
            this.p = d6;
            d4 = round3;
            this.q = d4;
        } else {
            d4 = round3;
            d5 = round;
            d6 = round2;
        }
        if ("2d".equals(this.y)) {
            d7 = d4;
            d8 = d6;
            c = b(d5, d6, d7);
        } else {
            d7 = d4;
            d8 = d6;
            c = "3d".equals(this.y) ? c(d5, d8, d7) : false;
        }
        if (!c) {
            return;
        }
        double d9 = this.C.f2238a;
        double d10 = this.C.b;
        double d11 = this.C.c;
        this.r = d5;
        double d12 = d8;
        this.s = d12;
        double d13 = d7;
        this.t = d13;
        try {
            if (com.alibaba.android.bindingx.core.h.f2229a) {
                com.alibaba.android.bindingx.core.h.b(String.format(Locale.getDefault(), "[OrientationHandler] orientation changed. (alpha:%f,beta:%f,gamma:%f,x:%f,y:%f,z:%f)", Double.valueOf(d5), Double.valueOf(d12), Double.valueOf(d13), Double.valueOf(d9), Double.valueOf(d10), Double.valueOf(d11)));
            }
            JSMath.applyOrientationValuesToScope(this.d, d5, d12, d13, this.o, this.p, this.q, d9, d10, d11);
            if (a(this.k, this.d)) {
                return;
            }
            a(this.f2232a, this.d, "orientation");
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.h.a("runtime error", e);
        }
    }

    private boolean b(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8db1d7f9", new Object[]{this, new Double(d), new Double(d2), new Double(d3)})).booleanValue();
        }
        if (this.v != null && this.w != null) {
            this.z.add(Double.valueOf(d));
            if (this.z.size() > 5) {
                this.z.removeFirst();
            }
            a(this.z, 360);
            LinkedList<Double> linkedList = this.z;
            double doubleValue = (linkedList.get(linkedList.size() - 1).doubleValue() - this.o) % 360.0d;
            r a2 = this.v.a(d, d2, d3, doubleValue);
            r a3 = this.w.a(d, d2, d3, doubleValue);
            this.A.a(mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, 1.0d);
            this.A.a(a2);
            this.B.a(mto.a.GEO_NOT_SUPPORT, 1.0d, 1.0d);
            this.B.a(a3);
            double degrees = Math.toDegrees(Math.acos(this.A.f2250a)) - 90.0d;
            double degrees2 = Math.toDegrees(Math.acos(this.B.b)) - 90.0d;
            if (Double.isNaN(degrees) || Double.isNaN(degrees2) || Double.isInfinite(degrees) || Double.isInfinite(degrees2)) {
                return false;
            }
            a aVar = this.C;
            aVar.f2238a = Math.round(degrees);
            aVar.b = Math.round(degrees2);
        }
        return true;
    }

    private boolean c(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f59304d8", new Object[]{this, new Double(d), new Double(d2), new Double(d3)})).booleanValue();
        }
        if (this.x != null) {
            this.z.add(Double.valueOf(d));
            if (this.z.size() > 5) {
                this.z.removeFirst();
            }
            a(this.z, 360);
            LinkedList<Double> linkedList = this.z;
            r a2 = this.x.a(d, d2, d3, (linkedList.get(linkedList.size() - 1).doubleValue() - this.o) % 360.0d);
            if (Double.isNaN(a2.f2246a) || Double.isNaN(a2.b) || Double.isNaN(a2.c) || Double.isInfinite(a2.f2246a) || Double.isInfinite(a2.b) || Double.isInfinite(a2.c)) {
                return false;
            }
            this.C.f2238a = a2.f2246a;
            this.C.b = a2.b;
            this.C.c = a2.c;
        }
        return true;
    }

    private void a(List<Double> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        int size = list.size();
        if (size <= 1) {
            return;
        }
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = i2 - 1;
            if (list.get(i3) != null && list.get(i2) != null) {
                if (list.get(i2).doubleValue() - list.get(i3).doubleValue() < (-i) / 2) {
                    double d = i;
                    list.set(i2, Double.valueOf(list.get(i2).doubleValue() + ((Math.floor(list.get(i3).doubleValue() / d) + 1.0d) * d)));
                }
                if (list.get(i2).doubleValue() - list.get(i3).doubleValue() > i / 2) {
                    list.set(i2, Double.valueOf(list.get(i2).doubleValue() - i));
                }
            }
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else {
            a("exit", ((Double) map.get("alpha")).doubleValue(), ((Double) map.get("beta")).doubleValue(), ((Double) map.get("gamma")).doubleValue(), new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(BindingXConstants.STATE_INTERCEPTOR, ((Double) map.get("alpha")).doubleValue(), ((Double) map.get("beta")).doubleValue(), ((Double) map.get("gamma")).doubleValue(), Collections.singletonMap(BindingXConstants.STATE_INTERCEPTOR, str));
        }
    }

    private void a(String str, double d, double d2, double d3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425378a5", new Object[]{this, str, new Double(d), new Double(d2), new Double(d3), objArr});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("alpha", Double.valueOf(d));
            hashMap.put("beta", Double.valueOf(d2));
            hashMap.put("gamma", Double.valueOf(d3));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map)) {
                hashMap.putAll((Map) objArr[0]);
            }
            this.c.a(hashMap);
            com.alibaba.android.bindingx.core.h.b(">>>>>>>>>>>fire event:(" + str + "," + d + "," + d2 + "," + d3 + riy.BRACKET_END_STR);
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        o oVar = this.u;
        if (oVar == null) {
            return;
        }
        oVar.a();
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        o oVar = this.u;
        if (oVar == null) {
            return;
        }
        oVar.a(1);
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f2238a;
        public double b;
        public double c;

        static {
            kge.a(1551409795);
        }

        public a() {
        }

        public a(double d, double d2, double d3) {
            this.f2238a = d;
            this.b = d2;
            this.c = d3;
        }
    }
}

package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class a extends AbstractEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int n;
    public int o;
    private boolean p;

    static {
        kge.a(528720156);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.p = false;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        d();
        this.p = false;
        a("end", this.n, this.o, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, new Object[0]);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else {
            a("exit", ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(BindingXConstants.STATE_INTERCEPTOR, ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), ((Double) map.get("dx")).doubleValue(), ((Double) map.get("dy")).doubleValue(), ((Double) map.get("tdx")).doubleValue(), ((Double) map.get("tdy")).doubleValue(), Collections.singletonMap(BindingXConstants.STATE_INTERCEPTOR, str));
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.p = false;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b020d788", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            a(i, i2, i3, i4, i5, i6, "scroll");
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5822f52", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), str});
            return;
        }
        if (com.alibaba.android.bindingx.core.h.f2229a) {
            com.alibaba.android.bindingx.core.h.b(String.format(Locale.getDefault(), "[ScrollHandler] scroll changed. (contentOffsetX:%d,contentOffsetY:%d,dx:%d,dy:%d,tdx:%d,tdy:%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        this.n = i;
        this.o = i2;
        if (!this.p) {
            this.p = true;
            aVar = this;
            aVar.a("start", i, i2, i3, i4, i5, i6, new Object[0]);
        } else {
            aVar = this;
        }
        try {
            JSMath.applyScrollValuesToScope(aVar.d, i, i2, i3, i4, i5, i6, aVar.i.a());
            if (aVar.a(aVar.k, aVar.d)) {
                return;
            }
            aVar.a(aVar.f2232a, aVar.d, str);
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.h.a("runtime error", e);
        }
    }

    public void a(String str, double d, double d2, double d3, double d4, double d5, double d6, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3a6bff", new Object[]{this, str, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), objArr});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            double b = this.i.a().b(d, new Object[0]);
            double b2 = this.i.a().b(d2, new Object[0]);
            hashMap.put("x", Double.valueOf(b));
            hashMap.put("y", Double.valueOf(b2));
            double b3 = this.i.a().b(d3, new Object[0]);
            double b4 = this.i.a().b(d4, new Object[0]);
            hashMap.put("dx", Double.valueOf(b3));
            hashMap.put("dy", Double.valueOf(b4));
            double b5 = this.i.a().b(d5, new Object[0]);
            double b6 = this.i.a().b(d6, new Object[0]);
            hashMap.put("tdx", Double.valueOf(b5));
            hashMap.put("tdy", Double.valueOf(b6));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map)) {
                hashMap.putAll((Map) objArr[0]);
            }
            this.c.a(hashMap);
            com.alibaba.android.bindingx.core.h.b(">>>>>>>>>>>fire event:(" + str + "," + b + "," + b2 + "," + b3 + "," + b4 + "," + b5 + "," + b6 + riy.BRACKET_END_STR);
        }
    }
}

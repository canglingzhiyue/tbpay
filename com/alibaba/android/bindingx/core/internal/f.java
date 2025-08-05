package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.internal.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class f extends AbstractEventHandler implements q.a, q.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private v n;

    static {
        kge.a(-408479731);
        kge.a(-1126043968);
        kge.a(1107012460);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 69046641) {
            super.a((String) objArr[0], (Map) objArr[1], (l) objArr[2], (List) objArr[3], (d.a) objArr[4]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public f(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a(String str, Map<String, Object> map, l lVar, List<Map<String, Object>> list, d.a aVar) {
        double d;
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d9171", new Object[]{this, str, map, lVar, list, aVar});
            return;
        }
        super.a(str, map, lVar, list, aVar);
        v vVar = this.n;
        if (vVar != null) {
            double f = vVar.f();
            double e = this.n.e();
            this.n.b();
            d2 = f;
            d = e;
        } else {
            d = 0.0d;
            d2 = 0.0d;
        }
        this.n = new v();
        this.n.a((q.b) this);
        this.n.a((q.a) this);
        this.n.b(a(this.m, d, d2));
        a("start", this.n.e(), this.n.f(), new Object[0]);
    }

    private Map<String, Object> a(Map<String, Object> map, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8051c212", new Object[]{this, map, new Double(d), new Double(d2)});
        }
        if (map == null) {
            return Collections.emptyMap();
        }
        Map<String, Object> c = w.c(map, BindingXConstants.KEY_EVENT_CONFIG);
        if (c.get("initialVelocity") == null) {
            if (c.isEmpty()) {
                c = new HashMap<>();
            }
            c.put("initialVelocity", Double.valueOf(d2));
        }
        if (c.get("fromValue") == null) {
            if (c.isEmpty()) {
                c = new HashMap<>();
            }
            c.put("fromValue", Double.valueOf(d));
        }
        return c;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        a("exit", ((Double) map.get("p")).doubleValue(), ((Double) map.get("v")).doubleValue(), new Object[0]);
        v vVar = this.n;
        if (vVar == null) {
            return;
        }
        vVar.b();
    }

    private void a(String str, double d, double d2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273f127f", new Object[]{this, str, new Double(d), new Double(d2), objArr});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("position", Double.valueOf(d));
            hashMap.put("velocity", Double.valueOf(d2));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map)) {
                hashMap.putAll((Map) objArr[0]);
            }
            this.c.a(hashMap);
            com.alibaba.android.bindingx.core.h.b(">>>>>>>>>>>fire event:(" + str + ",position:" + d + ",velocity:" + d2 + riy.BRACKET_END_STR);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        v vVar = this.n;
        if (vVar == null) {
            return;
        }
        a(BindingXConstants.STATE_INTERCEPTOR, vVar.e(), this.n.f(), Collections.singletonMap(BindingXConstants.STATE_INTERCEPTOR, str));
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        d();
        v vVar = this.n;
        if (vVar != null) {
            a("end", vVar.e(), this.n.f(), new Object[0]);
            this.n.a((q.a) null);
            this.n.a((q.b) null);
            this.n.b();
        }
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.q.b
    public void a(q qVar, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec10003", new Object[]{this, qVar, new Double(d), new Double(d2)});
            return;
        }
        if (com.alibaba.android.bindingx.core.h.f2229a) {
            com.alibaba.android.bindingx.core.h.a(String.format(Locale.getDefault(), "animation update, [value: %f, velocity: %f]", Double.valueOf(d), Double.valueOf(d2)));
        }
        try {
            JSMath.applySpringValueToScope(this.d, d, d2);
            if (a(this.k, this.d)) {
                return;
            }
            a(this.f2232a, this.d, com.taobao.android.dinamicx_v4.animation.util.b.SPRING_SPEC);
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.h.a("runtime error", e);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.q.a
    public void b(q qVar, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfbb184", new Object[]{this, qVar, new Double(d), new Double(d2)});
            return;
        }
        if (com.alibaba.android.bindingx.core.h.f2229a) {
            com.alibaba.android.bindingx.core.h.a(String.format(Locale.getDefault(), "animation end, [value: %f, velocity: %f]", Double.valueOf(d), Double.valueOf(d2)));
        }
        a("end", this.n.e(), this.n.f(), new Object[0]);
    }
}

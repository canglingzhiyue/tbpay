package com.taobao.android.dinamicx.expression.expr_v2;

import android.text.TextUtils;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fsj;
import tb.ftw;
import tb.ftx;
import tb.fty;
import tb.ftz;
import tb.fua;
import tb.fub;
import tb.fuc;
import tb.fud;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, f> f11866a;
    private final ConcurrentHashMap<String, e> b = new ConcurrentHashMap<>();

    static {
        kge.a(-1625967720);
        f11866a = new HashMap();
        a(com.taobao.android.weex_framework.util.a.ATOM_EXT_parseInt, new fuc());
        a(com.taobao.android.weex_framework.util.a.ATOM_EXT_parseFloat, new fub());
        a(com.taobao.android.weex_framework.util.a.ATOM_EXT_substring, new fud());
        a("slice", new ftx());
        a(com.taobao.android.weex_framework.util.a.ATOM_length, new fsj());
        fua fuaVar = new fua();
        a(com.taobao.android.weex_framework.util.a.ATOM_Math, com.taobao.android.weex_framework.util.a.ATOM_EXT_abs, new fty(fuaVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_abs));
        a(com.taobao.android.weex_framework.util.a.ATOM_Math, com.taobao.android.weex_framework.util.a.ATOM_EXT_ceil, new fty(fuaVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_ceil));
        a(com.taobao.android.weex_framework.util.a.ATOM_Math, "exp", new fty(fuaVar, "exp"));
        a(com.taobao.android.weex_framework.util.a.ATOM_Math, com.taobao.android.weex_framework.util.a.ATOM_EXT_floor, new fty(fuaVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_floor));
        a(com.taobao.android.weex_framework.util.a.ATOM_Math, "max", new fty(fuaVar, "max"));
        a(com.taobao.android.weex_framework.util.a.ATOM_Math, "min", new fty(fuaVar, "min"));
        a(com.taobao.android.weex_framework.util.a.ATOM_Math, com.taobao.android.weex_framework.util.a.ATOM_EXT_round, new fty(fuaVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_round));
        ftz ftzVar = new ftz();
        a("JSON", "parse", new fty(ftzVar, "parse"));
        a("JSON", com.taobao.android.weex_framework.util.a.ATOM_EXT_stringify, new fty(ftzVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_stringify));
        a("comboEventHandler", new ftw());
    }

    public static void a(String str, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c85ca44", new Object[]{str, jVar});
        } else {
            f11866a.put(str, f.a(jVar));
        }
    }

    public static void a(String str, String str2, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49b650e", new Object[]{str, str2, jVar});
            return;
        }
        f fVar = f11866a.get(str);
        if (fVar == null) {
            fVar = f.a(new g());
            f11866a.put(str, fVar);
        }
        if (!fVar.q()) {
            throw new IllegalStateException("objectName is not a builtin obj");
        }
        fVar.s().a(str2, f.a(jVar));
    }

    public static f a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2f0764fa", new Object[]{str}) : f11866a.get(str);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && this.b.containsKey(str);
    }

    public a a(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("91f95ee7", new Object[]{this, str, bArr, new Integer(i)});
        }
        this.b.remove(str);
        e eVar = new e();
        eVar.a(this);
        try {
            eVar.a(bArr, i);
            this.b.put(str, eVar);
            return new a(true, null, null);
        } catch (Throwable th) {
            th.printStackTrace();
            return new a(false, th.getMessage(), null);
        }
    }

    public a a(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, String str, int i, Object obj, Object obj2, Integer num, Map<String, f> map, i iVar, c cVar, com.taobao.android.dinamicx.expression.expr_v2.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9f2f9d26", new Object[]{this, dXRuntimeContext, dXEvent, str, new Integer(i), obj, obj2, num, map, iVar, cVar, aVar});
        }
        e eVar = this.b.get(str);
        if (eVar == null) {
            return new a(false, "template engine not exist: " + str, null);
        }
        try {
            HashMap hashMap = new HashMap();
            if (obj != null && (obj instanceof JSONObject)) {
                hashMap.put("data", f.a((JSONObject) obj));
            } else if (obj != null && dXRuntimeContext.O() && (obj instanceof Object)) {
                hashMap.put("data", f.a(obj));
            }
            if (obj2 != null && (obj2 instanceof JSONObject)) {
                hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, f.a((JSONObject) obj2));
            } else if (obj2 != null && dXRuntimeContext.O() && (obj2 instanceof Object)) {
                hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, f.a(obj2));
            }
            if (dXRuntimeContext.f() instanceof JSONObject) {
                hashMap.put("subdata", f.a((JSONObject) dXRuntimeContext.f()));
            } else if (dXRuntimeContext.f() != null && dXRuntimeContext.O() && (dXRuntimeContext.f() instanceof Object)) {
                hashMap.put("subdata", f.a(dXRuntimeContext.f()));
            }
            if (num != null) {
                hashMap.put(q.MSGTYPE_INTERVAL, f.a(num.intValue()));
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            return new a(true, null, eVar.a(dXRuntimeContext, dXEvent, i, hashMap, iVar, cVar, aVar));
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            return new a(false, th.getMessage(), null);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f11867a;
        public final String b;
        public final f c;

        static {
            kge.a(1060083371);
        }

        public a(boolean z, String str, f fVar) {
            this.f11867a = z;
            this.b = str;
            this.c = fVar;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "EngineResult{success=" + this.f11867a + ", errorMsg='" + this.b + "', result=" + this.c + '}';
        }
    }
}

package com.alibaba.android.bindingx.core;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.android.bindingx.core.internal.w;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class d implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, b<e, Context, i>> c;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Map<String, e>> f2222a;
    private final Map<String, b<e, Context, i>> b = new HashMap(8);
    private final i d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Object obj);
    }

    /* loaded from: classes.dex */
    public interface b<Type, ParamA, ParamB> {
        Type a(ParamA parama, ParamB paramb, Object... objArr);
    }

    static {
        kge.a(-312229561);
        kge.a(840914445);
        c = new HashMap(4);
    }

    public d(i iVar) {
        this.d = iVar;
        a("pan", new b<e, Context, i>() { // from class: com.alibaba.android.bindingx.core.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public e a(Context context, i iVar2, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("400a90e5", new Object[]{this, context, iVar2, objArr}) : new com.alibaba.android.bindingx.core.internal.h(context, iVar2, objArr);
            }
        });
        a("pinch", new b<e, Context, i>() { // from class: com.alibaba.android.bindingx.core.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public e a(Context context, i iVar2, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("400a90e5", new Object[]{this, context, iVar2, objArr}) : new com.alibaba.android.bindingx.core.internal.d(context, iVar2, objArr);
            }
        });
        a("rotation", new b<e, Context, i>() { // from class: com.alibaba.android.bindingx.core.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public e a(Context context, i iVar2, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("400a90e5", new Object[]{this, context, iVar2, objArr}) : new com.alibaba.android.bindingx.core.internal.e(context, iVar2, objArr);
            }
        });
        a("orientation", new b<e, Context, i>() { // from class: com.alibaba.android.bindingx.core.d.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public e a(Context context, i iVar2, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("400a90e5", new Object[]{this, context, iVar2, objArr}) : new com.alibaba.android.bindingx.core.internal.c(context, iVar2, objArr);
            }
        });
        a("timing", new b<e, Context, i>() { // from class: com.alibaba.android.bindingx.core.d.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public e a(Context context, i iVar2, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("400a90e5", new Object[]{this, context, iVar2, objArr}) : new com.alibaba.android.bindingx.core.internal.g(context, iVar2, objArr);
            }
        });
        a(com.taobao.android.dinamicx_v4.animation.util.b.SPRING_SPEC, new b<e, Context, i>() { // from class: com.alibaba.android.bindingx.core.d.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public e a(Context context, i iVar2, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("400a90e5", new Object[]{this, context, iVar2, objArr}) : new com.alibaba.android.bindingx.core.internal.f(context, iVar2, objArr);
            }
        });
    }

    public String a(Context context, String str, Map<String, Object> map, a aVar, Object... objArr) {
        Map<String, Object> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46d5e989", new Object[]{this, context, str, map, aVar, objArr});
        }
        String a2 = w.a(map, "eventType");
        String a3 = w.a(map, "instanceId");
        h.a(map);
        Object obj = map.get("options");
        if (obj != null && (obj instanceof Map)) {
            try {
                map2 = w.a(new JSONObject((Map) obj));
            } catch (Exception e) {
                h.a("parse external config failed.\n", e);
            }
            return a(w.a(map, "anchor"), a3, a2, map2, w.b(map, BindingXConstants.KEY_EXIT_EXPRESSION), w.a(map), w.b(map), aVar, context, str, map, objArr);
        }
        map2 = null;
        return a(w.a(map, "anchor"), a3, a2, map2, w.b(map, BindingXConstants.KEY_EXIT_EXPRESSION), w.a(map), w.b(map), aVar, context, str, map, objArr);
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            a(w.a(map, "token"), w.a(map, "eventType"));
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        h.b("disable binding [" + str + "," + str2 + riy.ARRAY_END_STR);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h.b("disable binding failed(0x1) [" + str + "," + str2 + riy.ARRAY_END_STR);
            return;
        }
        Map<String, Map<String, e>> map = this.f2222a;
        if (map == null || map.isEmpty()) {
            h.b("disable binding failed(0x2) [" + str + "," + str2 + riy.ARRAY_END_STR);
            return;
        }
        Map<String, e> map2 = this.f2222a.get(str);
        if (map2 == null || map2.isEmpty()) {
            h.b("disable binding failed(0x3) [" + str + "," + str2 + riy.ARRAY_END_STR);
            return;
        }
        e eVar = map2.get(str2);
        if (eVar == null) {
            h.b("disable binding failed(0x4) [" + str + "," + str2 + riy.ARRAY_END_STR);
        } else if (eVar.b(str, str2)) {
            this.f2222a.remove(str);
            h.b("disable binding success[" + str + "," + str2 + riy.ARRAY_END_STR);
        } else {
            h.b("disabled failed(0x4) [" + str + "," + str2 + riy.ARRAY_END_STR);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Map<String, Map<String, e>> map = this.f2222a;
        if (map == null) {
            return;
        }
        try {
            for (Map<String, e> map2 : map.values()) {
                if (map2 != null && !map2.isEmpty()) {
                    for (e eVar : map2.values()) {
                        if (eVar != null) {
                            eVar.a();
                        }
                    }
                }
            }
            this.f2222a.clear();
            this.f2222a = null;
        } catch (Exception e) {
            h.a("release failed", e);
        }
    }

    public String a(Context context, String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2, Object... objArr) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9207977", new Object[]{this, context, str, str2, str3, str4, map, map2, objArr});
        }
        if (TextUtils.isEmpty(str4)) {
            h.d("[doPrepare] failed. can not found eventType");
            return null;
        } else if (context == null) {
            h.d("[doPrepare] failed. context or wxInstance is null");
            return null;
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = d();
            }
            if (this.f2222a == null) {
                this.f2222a = new HashMap();
            }
            Map<String, e> map3 = this.f2222a.get(str2);
            if (map3 != null && (eVar = map3.get(str4)) != null) {
                if (h.f2229a) {
                    h.b("you have already enabled binding,[token:" + str2 + ",type:" + str4 + riy.ARRAY_END_STR);
                }
                eVar.a(objArr);
                if (h.f2229a) {
                    h.b("enableBinding success.[token:" + str2 + ",type:" + str4 + riy.ARRAY_END_STR);
                }
            } else {
                if (map3 == null) {
                    map3 = new HashMap<>(4);
                    this.f2222a.put(str2, map3);
                }
                e a2 = a(context, str, str4);
                if (a2 != null) {
                    a2.a(str3);
                    a2.b(str2);
                    a2.a(map);
                    a2.a(objArr);
                    if (a2.a(str2, str4)) {
                        map3.put(str4, a2);
                        if (h.f2229a) {
                            h.b("enableBinding success.[token:" + str2 + ",type:" + str4 + riy.ARRAY_END_STR);
                        }
                    } else {
                        if (h.f2229a) {
                            h.d("expression enabled failed. [token:" + str2 + ",type:" + str4 + riy.ARRAY_END_STR);
                        }
                        return null;
                    }
                } else {
                    h.d("unknown eventType: " + str4);
                    return null;
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.Object> r21, com.alibaba.android.bindingx.core.internal.l r22, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r23, java.util.Map<java.lang.String, com.alibaba.android.bindingx.core.internal.l> r24, com.alibaba.android.bindingx.core.d.a r25, android.content.Context r26, java.lang.String r27, java.util.Map<java.lang.String, java.lang.Object> r28, java.lang.Object... r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.bindingx.core.d.a(java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.alibaba.android.bindingx.core.internal.l, java.util.List, java.util.Map, com.alibaba.android.bindingx.core.d$a, android.content.Context, java.lang.String, java.util.Map, java.lang.Object[]):java.lang.String");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Map<String, Map<String, e>> map = this.f2222a;
        if (map == null) {
            return;
        }
        try {
            for (Map<String, e> map2 : map.values()) {
                for (e eVar : map2.values()) {
                    try {
                        eVar.b();
                    } catch (Exception e) {
                        h.a("execute activity pause failed.", e);
                    }
                }
            }
        } catch (Exception e2) {
            h.a("activity pause failed", e2);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Map<String, Map<String, e>> map = this.f2222a;
        if (map == null) {
            return;
        }
        try {
            for (Map<String, e> map2 : map.values()) {
                for (e eVar : map2.values()) {
                    try {
                        eVar.c();
                    } catch (Exception e) {
                        h.a("execute activity pause failed.", e);
                    }
                }
            }
        } catch (Exception e2) {
            h.a("activity pause failed", e2);
        }
    }

    public void a(String str, b<e, Context, i> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f9e562", new Object[]{this, str, bVar});
        } else if (TextUtils.isEmpty(str) || bVar == null) {
        } else {
            this.b.put(str, bVar);
        }
    }

    public static void b(String str, b<e, Context, i> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77385501", new Object[]{str, bVar});
        } else if (TextUtils.isEmpty(str) || bVar == null) {
        } else {
            c.put(str, bVar);
        }
    }

    private String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : UUID.randomUUID().toString();
    }

    private e a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("98bfbf95", new Object[]{this, context, str, str2});
        }
        e eVar = null;
        if (!this.b.isEmpty() && this.d != null) {
            b<e, Context, i> bVar = this.b.get(str2);
            if (bVar == null) {
                bVar = c.get(str2);
            }
            if (bVar != null) {
                eVar = bVar.a(context, this.d, str);
            }
            if (eVar != null) {
                eVar.a(this);
            }
        }
        return eVar;
    }

    @Override // com.alibaba.android.bindingx.core.g
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Map<String, Map<String, e>> map = this.f2222a;
        if (map == null) {
            return;
        }
        map.remove(str);
    }
}

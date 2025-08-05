package com.taobao.tao.flexbox.layoutmanager.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogg;

/* loaded from: classes8.dex */
public class a implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ab f20290a;

    static {
        kge.a(790206843);
        kge.a(-1420926486);
    }

    public static /* synthetic */ ab a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("943fe01e", new Object[]{aVar}) : aVar.f20290a;
    }

    public a(ab abVar) {
        this.f20290a = abVar;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (aaVar2 != null) {
            aaVar2.a(str, map);
        }
        if (str2 == null && aaVar2 != null) {
            str2 = oec.a(aaVar2.e(str), (String) null);
        }
        if (str2 == null || !str2.startsWith("$://")) {
            return false;
        }
        a(aaVar2, str2.substring(4), map, bVar);
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue() : onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
    }

    private void a(final aa aaVar, final String str, final Map map, final com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b3de16", new Object[]{this, aaVar, str, map, bVar});
        } else {
            aaVar.f20292a.g.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    aa M = aaVar.M();
                    JSONObject jSONObject = new JSONObject();
                    if (aaVar.c != null && aaVar.c.m != null) {
                        jSONObject.put("attrs", (Object) aaVar.c.m);
                    }
                    jSONObject.put("target", (Object) Integer.valueOf(aaVar.E()));
                    jSONObject.put("time", (Object) Long.valueOf(System.nanoTime()));
                    jSONObject.put("params", (Object) map);
                    jSONObject.put("msg", (Object) str);
                    jSONObject.put("instanceId", (Object) Integer.valueOf(M.E()));
                    jSONObject.put("tid", (Object) aaVar.F());
                    String U = aaVar.U();
                    jSONObject.put("keypath", (Object) U);
                    if (aaVar.A() != null) {
                        jSONObject.put("props", (Object) aaVar.A());
                    }
                    int i = M.f20292a.h;
                    jSONObject.put("version", (Object) Integer.valueOf(i));
                    if (i <= 0) {
                        jSONObject.put("data", M.D());
                        M.f20292a.h = 1;
                    } else if (U == null) {
                        ogg.b("keypath is null : " + str);
                        jSONObject.put("data", aaVar.D());
                    }
                    if (M.f20292a.i <= 0) {
                        jSONObject.put("options", (Object) M.f20292a.e);
                        M.f20292a.i = 1;
                    }
                    com.taobao.tao.flexbox.layoutmanager.event.b bVar2 = bVar;
                    if (bVar2 != null) {
                        aaVar.a(str, bVar2);
                    }
                    g.c cVar = new g.c(a.a(a.this), jSONObject, null);
                    cVar.d = bVar;
                    com.taobao.tao.flexbox.layoutmanager.ac.g k = a.a(a.this).k();
                    String X = aaVar.X();
                    String h = aaVar.h();
                    k.a(X + "." + h + "." + str, aaVar, cVar);
                }
            });
        }
    }
}

package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events;

import android.taobao.windvane.util.m;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Iterator;
import tb.jqc;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIZ_PARAMS = "bizParams";

    /* renamed from: a  reason: collision with root package name */
    private static final String f13831a;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(406119566);
        f13831a = a.class.getSimpleName();
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            DMEvent dMEvent = (DMEvent) eVar.i();
            eVar.a(new DMEvent(dMEvent.getType(), f.a(d(eVar), eVar.d().getData(), (DXRuntimeContext) eVar.f(com.taobao.android.adam.common.b.PARSER_KEY_DX_RUNTIMECONTEXT)), dMEvent.getComponents(), dMEvent.getOption()));
        } catch (Throwable th) {
            m.e(f13831a, th.toString());
        }
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec3aacd", new Object[]{this, eVar, str, jSONObject, jSONObject2});
            return;
        }
        IDMComponent d = eVar.d();
        if (d == null) {
            m.e(f13831a, "component is null!");
            return;
        }
        JSONObject data = d.getData();
        if (data == null) {
            m.e(f13831a, "component data is null!");
            return;
        }
        data.put("currentOutput", (Object) jSONObject2);
        JSONObject jSONObject3 = data.getJSONObject("events");
        if (jSONObject3 == null) {
            m.e(f13831a, "events is null!");
            return;
        }
        JSONArray jSONArray = jSONObject3.getJSONArray(jSONObject.getString(str));
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject a2 = jqc.a((JSONObject) next);
                    String string = a2.getString("type");
                    JSONObject jSONObject4 = a2.getJSONObject("fields");
                    if (string != null) {
                        a(string, jSONObject4, eVar);
                    }
                }
            }
        } else {
            m.e(f13831a, String.format("events doesn't contains %s", str));
        }
        data.remove("currentOutput");
    }

    private void a(String str, JSONObject jSONObject, com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df17052d", new Object[]{this, str, jSONObject, eVar});
        } else if (eVar == null || eVar.h() == null) {
            m.e(f13831a, "ultron instance is null");
        } else {
            com.alibaba.android.ultron.event.base.f d = eVar.h().d();
            com.alibaba.android.ultron.event.base.e a2 = d.a();
            a2.a("bizParams", eVar.d("bizParams"));
            a2.a("triggerView", eVar.d("triggerView"));
            a2.a(eVar.d());
            a2.a(eVar.e());
            a2.a(new DMEvent(str, jSONObject, new ArrayList()));
            a2.a(str);
            d.a(a2);
        }
    }

    public JSONObject d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("568f0900", new Object[]{this, eVar});
        }
        DMEvent dMEvent = (DMEvent) eVar.i();
        if (dMEvent == null) {
            return null;
        }
        return JSON.parseObject(dMEvent.getFields().toJSONString());
    }
}

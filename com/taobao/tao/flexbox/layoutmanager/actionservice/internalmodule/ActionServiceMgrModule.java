package com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import tb.kge;

/* loaded from: classes8.dex */
public class ActionServiceMgrModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-779626222);
        kge.a(259975031);
    }

    public static void init(JSONObject jSONObject, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f428ddb3", new Object[]{jSONObject, bVar, interfaceC0830a, aVar});
        } else {
            aVar.f();
        }
    }

    public static void success(JSONObject jSONObject, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668904e0", new Object[]{jSONObject, bVar, interfaceC0830a, aVar});
        } else {
            aVar.a(jSONObject.getInteger("methodId").intValue(), true, bVar, jSONObject.getJSONObject("actionServiceContext"), jSONObject.get("data"));
        }
    }

    public static void fail(JSONObject jSONObject, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9e86e5", new Object[]{jSONObject, bVar, interfaceC0830a, aVar});
        } else {
            aVar.a(jSONObject.getInteger("methodId").intValue(), false, bVar, jSONObject.getJSONObject("actionServiceContext"), jSONObject.get("data"));
        }
    }

    public static void cb(JSONObject jSONObject, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5234c704", new Object[]{jSONObject, bVar, interfaceC0830a, aVar});
            return;
        }
        int intValue = jSONObject.getInteger("methodId").intValue();
        Object obj = jSONObject.get("data");
        Object obj2 = jSONObject.get("error");
        if (obj != null) {
            aVar.a(intValue, true, bVar, jSONObject.getJSONObject("actionServiceContext"), obj);
        } else if (obj2 == null) {
        } else {
            aVar.a(intValue, false, bVar, jSONObject.getJSONObject("actionServiceContext"), obj2);
        }
    }
}

package com.taobao.tao.flexbox.layoutmanager.ac;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class TNodeActionServiceMgrModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-594573065);
        kge.a(-818961104);
    }

    public static void cb(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cc9cd9", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) cVar.b;
        int intValue = jSONObject.getInteger("methodId").intValue();
        Object obj = jSONObject.get("data");
        Object obj2 = jSONObject.get("error");
        boolean booleanValue = jSONObject.containsKey("retain") ? jSONObject.getBoolean("retain").booleanValue() : false;
        if (obj != null) {
            cVar.f19938a.k().a(intValue, true, obj, booleanValue);
        } else if (obj2 == null) {
        } else {
            cVar.f19938a.k().a(intValue, false, obj2, booleanValue);
        }
    }

    public static void report(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e08ca4", new Object[]{cVar});
        } else {
            w.a(cVar.f19938a, (Map) cVar.b, cVar.f19938a.A());
        }
    }
}

package com.taobao.android.layoutmanager.module;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.b;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class ABTestModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1611466717);
        kge.a(-818961104);
    }

    public static void get(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df6a2c2", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            Object obj = ((JSONObject) cVar.b).get("keypath");
            b v = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().v();
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(v.a(String.valueOf(obj2), ""));
                }
                cVar.c.a(cVar, arrayList);
            } else if (obj instanceof String) {
                cVar.c.a(cVar, v.a((String) obj, ""));
            }
        }
    }

    public static void getABConfig(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442a485f", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("component");
            String string2 = jSONObject.getString("module");
            JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
            boolean booleanValue = jSONObject.getBooleanValue("needPageObject");
            String string3 = jSONObject.getString(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION);
            Context context = null;
            if (booleanValue) {
                context = cVar.f19938a.l();
            }
            VariationSet activate = UTABTest.activate(string, string2, jSONObject2, context);
            if (activate != null) {
                Variation variation = activate.getVariation(string3);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("config", (Object) variation.getValueAsString(""));
                cVar.c.a(cVar, jSONObject3);
                return;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("config", (Object) "");
            cVar.c.a(cVar, jSONObject4);
        }
    }

    public static void activateServer(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2e5c02", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("data");
            Context context = null;
            if (jSONObject.getBooleanValue("needPageObject")) {
                context = cVar.f19938a.l();
            }
            UTABTest.activateServer(string, context);
        }
    }
}

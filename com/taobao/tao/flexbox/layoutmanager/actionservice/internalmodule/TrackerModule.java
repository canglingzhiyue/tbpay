package com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class TrackerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(450649559);
        kge.a(259975031);
    }

    public static void commit(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f076e6b", new Object[]{json, bVar, interfaceC0830a, aVar});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("pageName");
            int intValue = jSONObject.getIntValue(PopConst.POP_EVENT_ID_KEY);
            String string2 = jSONObject.getString("arg1");
            String string3 = jSONObject.getString("arg2");
            String string4 = jSONObject.getString("arg3");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                }
            }
            TBS.Ext.commitEvent(string, intValue, string2, string3, string4, arrayList.toString());
        }
    }

    public static void click(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcccf4ba", new Object[]{json, bVar, interfaceC0830a, aVar});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("controlName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                }
            }
            TBS.Adv.ctrlClicked(string, CT.Button, string2, arrayList.toString());
        }
    }

    public static void updatePageName(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09c657f", new Object[]{json, bVar, interfaceC0830a, aVar});
        } else if (!(json instanceof JSONObject)) {
        } else {
            String string = ((JSONObject) json).getString("pageName");
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(aVar.d(), string);
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(aVar.d(), string);
        }
    }

    public static void updateProperties(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462ad3e6", new Object[]{json, bVar, interfaceC0830a, aVar});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(aVar.d(), hashMap);
        }
    }
}

package com.taobao.android.layoutmanager.module;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import tb.kge;
import tb.ohg;

/* loaded from: classes5.dex */
public class OrangeModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1667065378);
        kge.a(-818961104);
    }

    public static void getConfig(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4cf420", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("groupName");
            String string2 = jSONObject.getString("key");
            String string3 = jSONObject.getString("defaultConfig");
            if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
                return;
            }
            ohg a2 = ohg.a();
            if (StringUtils.isEmpty(string3)) {
                string3 = "";
            }
            String a3 = a2.a(string, string2, string3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config", (Object) a3);
            cVar.c.a(cVar, jSONObject2);
        }
    }

    public static void getConfigs(g.c cVar) {
        JSONArray jSONArray;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d3cb7d", new Object[]{cVar});
            return;
        }
        if (cVar.b instanceof JSONObject) {
            jSONArray = ((JSONObject) cVar.b).getJSONArray("configs");
        } else {
            jSONArray = cVar.b instanceof JSONArray ? (JSONArray) cVar.b : null;
        }
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("groupName");
                String string2 = jSONObject.getString("key");
                String string3 = jSONObject.getString("defaultConfig");
                if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
                    str = null;
                } else {
                    ohg a2 = ohg.a();
                    if (StringUtils.isEmpty(string3)) {
                        string3 = "";
                    }
                    str = a2.a(string, string2, string3);
                }
                jSONArray2.add(str);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs", (Object) jSONArray2);
        cVar.c.a(cVar, jSONObject2);
    }
}

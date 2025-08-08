package com.taobao.desktop.widget.manager;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import tb.kge;
import tb.khd;
import tb.khf;
import tb.khg;
import tb.khm;
import tb.khn;
import tb.kif;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(133602532);
    }

    public static void a(String str, khf khfVar, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde7c3df", new Object[]{str, khfVar, khgVar});
        } else {
            b(Collections.singletonList(str), "", false, khfVar, khgVar);
        }
    }

    public static void a(List<String> list, String str, boolean z, khf khfVar, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653fd9fe", new Object[]{list, str, new Boolean(z), khfVar, khgVar});
        } else {
            b(list, str, z, khfVar, khgVar);
        }
    }

    private static void b(List<String> list, String str, boolean z, khf khfVar, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66762cdd", new Object[]{list, str, new Boolean(z), khfVar, khgVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("channel", (Object) str);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (list.contains("43")) {
            jSONObject2.put("43", (Object) "3");
        }
        if (list.contains("88")) {
            jSONObject2.put("88", (Object) "2");
        }
        jSONObject.put("dataVersion", (Object) jSONObject2.toString());
        jSONObject.put("uid", (Object) khn.a(khm.a().c()).c());
        JSONObject a2 = a(list);
        if (a2 != null) {
            jSONObject.put("switchRecords", (Object) a2);
        }
        if (z) {
            khd.a().b("widget", list, jSONObject, khfVar);
        } else {
            khd.a().a("widget", list, jSONObject, khfVar, khgVar);
        }
    }

    private static JSONObject a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8603079", new Object[]{list});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : list) {
                JSONObject f = g.a(khm.a().c()).f(str);
                if (f != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("currentId", f.get("switch_id_index"));
                    jSONObject2.put("lastRefreshTime", f.get("switch_refresh_time"));
                    jSONObject2.put("lastSwitchTime", f.get("switch_click_time"));
                    jSONObject.put(str, (Object) jSONObject2);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            kif.a("buildWidgetSwitchData error: " + e.getMessage());
            return null;
        }
    }
}

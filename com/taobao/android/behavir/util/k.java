package com.taobao.android.behavir.util;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.decision.BHRDecisionEngine;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.solution.f;
import java.io.File;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1589752874);
    }

    public static boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ed4546e", new Object[]{fVar})).booleanValue() : fVar.e().getTaskInfo().getBooleanValue("isNeedWua");
    }

    public static void a(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4293d6", new Object[]{str, str2, str3, str4, str5, jSONObject});
            return;
        }
        BHREvent buildInternalEvent = BHREvent.buildInternalEvent(str3, str4, str5, true);
        buildInternalEvent.createTime = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("br_action", (Object) str2);
        jSONObject.put("br_from", (Object) str);
        jSONObject.put("br_currentPageName", (Object) a.a());
        jSONObject.put("br_currentPageUrl", (Object) a.b());
        buildInternalEvent.bizArgKVMapObject = jSONObject;
        BHRDecisionEngine.a().a(buildInternalEvent);
    }

    public static JSONObject a(String str, String str2, String str3, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9a8ca59f", new Object[]{str, str2, str3, map});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put("schemeId", (Object) str);
        jSONObject.put("bizId", (Object) str2);
        jSONObject.put("traceId", (Object) str3);
        if (map != null) {
            jSONObject.putAll(map);
        }
        return jSONObject;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return com.taobao.android.behavix.d.b().getFilesDir().getAbsolutePath() + File.separator + "ucp" + File.separator;
    }
}

package com.taobao.android.fluid.framework.performance;

import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.util.Map;
import tb.kge;
import tb.obw;
import tb.son;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1781096108);
    }

    public static void a(Map map, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaef1cc", new Object[]{map, jSONObject, strArr});
            return;
        }
        for (String str : strArr) {
            jSONObject.put(str, map.get(str));
        }
    }

    public static void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{spyVar});
        } else if (!son.g() || !spy.MSG_DATA_CHANGE.equals(spyVar.c) || spyVar.i == null) {
        } else {
            Map map = spyVar.i;
            JSONObject jSONObject = new JSONObject();
            try {
                a(map, jSONObject, "pageMap", "extraMap", "id");
                Object obj = map.get("content");
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    JSONObject jSONObject2 = new JSONObject();
                    a(map2, jSONObject2, "id", "status", "summary", "title", "interactiveId");
                    jSONObject.put("content", (Object) jSONObject2);
                    Object obj2 = map2.get("elements");
                    if (obj2 instanceof Map) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject2.put("elements", (Object) jSONObject3);
                        a((Map) obj2, jSONObject3, "duration", "firstFrameUrl", "height", "type", "url", "videoId", "width");
                    }
                }
                Object obj3 = map.get(com.taobao.android.weex_framework.util.a.ATOM_raw);
                if (obj3 instanceof Map) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_raw, (Object) jSONObject4);
                    a((Map) obj3, jSONObject4, LoginConstant.ACCOUNT, "content", "sequenceNumber", "sequenceNumberStr", "nid", "subType", "type", "bginteractive", "playletInfo", "utPairs", "extraData", "frontendTransmission");
                }
                a(map, jSONObject, "type", "hasExposed", "index", "modelIndex", "relativeIndex", "sequenceNumber", obw.UPDATE_DATA_MSG_FOR_GLOBAL_H5, "utPairs");
                spyVar.i = jSONObject;
            } catch (Throwable th) {
                spz.a("TBVideoUtils", "removeUnusedMediaData error", th);
            }
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, str, str2, str3, map);
        }
    }
}

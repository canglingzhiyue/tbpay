package com.taobao.android.behavix.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.tmall.android.dai.DAI;
import java.util.HashMap;
import java.util.Map;
import tb.dsb;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXCEPTION = "exception";
    public static final String WALLE_WRONG = "walle_wrong";

    static {
        kge.a(1907852257);
    }

    public static void a(String str, String str2, Map<String, Object> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc246ee5", new Object[]{str, str2, map, dVar});
        } else {
            a(false, str, str2, map, dVar);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924ef7a6", new Object[]{str, str2, map, dVar});
        } else {
            a(true, str, str2, map, dVar);
        }
    }

    private static void a(boolean z, String str, final String str2, Map<String, Object> map, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3326dae9", new Object[]{new Boolean(z), str, str2, map, dVar});
            return;
        }
        try {
            if (!Utils.a()) {
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.FORCE_SAVE_DATA_TO_DB, null, null);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("_walle_bizname", str);
            com.tmall.android.dai.c cVar = new com.tmall.android.dai.c() { // from class: com.taobao.android.behavix.task.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.tmall.android.dai.c
                public void a(boolean z2, Map<String, Object> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z2), map2});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(map2);
                    if (z2) {
                        d.this.a(str2, jSONObject);
                    } else {
                        d.this.a(str2, e.WALLE_WRONG, JSON.toJSONString(map2.get("error")), jSONObject);
                    }
                }
            };
            map.put("bxFeature", BUFS.getFeature(new BUFS.QueryArgs(), str2, "UCP", "UCP"));
            if (z) {
                DAI.runComputeByAlias(str2, map, cVar, hashMap);
            } else {
                DAI.runCompute(str2, map, cVar, hashMap);
            }
        } catch (Exception e) {
            dVar.a(str2, "exception", e.getMessage(), new JSONObject());
            String str3 = z ? "ByAlias" : "";
            dsb.a("runCompute" + str3, str2, null, e);
        }
    }
}

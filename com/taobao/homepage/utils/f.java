package com.taobao.homepage.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.alj;
import tb.kge;
import tb.ksp;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f17286a;

    static {
        kge.a(1627558893);
        f17286a = false;
    }

    public static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(map);
                JSONArray jSONArray = jSONObject.getJSONArray("dataTrack");
                if (jSONArray != null) {
                    UTABTest.activateServer(jSONArray.toJSONString());
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("starkApm");
                if (jSONObject2 == null) {
                    return;
                }
                HashMap<String, String> hashMap = new HashMap<>();
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        hashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
                alj.a().b("homepage", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
                ksp.a("ExtraUtils", "abtestRecord error");
            }
        }
    }

    public static float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a93", new Object[]{context, new Integer(i)})).floatValue() : (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}

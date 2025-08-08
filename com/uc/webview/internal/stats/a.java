package com.uc.webview.internal.stats;

import mtopsdk.common.util.StringUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.Log;
import com.uc.webview.export.extension.IStatsHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23990a = "a";

    public static boolean a(List<d> list) {
        IStatsHandler iStatsHandler = IStatsHandler.Instance.get();
        if (iStatsHandler == null) {
            Log.b();
            return false;
        }
        boolean z = !EnvInfo.f();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lt", "ev");
            jSONObject.put(com.taobao.tao.content.business.b.CT, "corepv");
            HashMap hashMap = new HashMap();
            i.a();
            i.a(hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            for (d dVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ev_ac", dVar.f23997a);
                for (Map.Entry<String, String> entry2 : dVar.b.entrySet()) {
                    jSONObject2.put(entry2.getKey(), entry2.getValue());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("items", jSONArray);
            jSONObject.put("stat_size", String.valueOf(jSONObject.toString().length()));
            String jSONObject3 = jSONObject.toString();
            if (!StringUtils.isEmpty(jSONObject3)) {
                z |= !iStatsHandler.stat(jSONObject3);
                StringBuilder sb = new StringBuilder("upload shouldContinue:");
                sb.append(z);
                sb.append(", jsonData: \n");
                sb.append(jSONObject3);
                Log.b();
            }
        } catch (Throwable th) {
            Log.w(f23990a, "IStatsHandler failed", th);
        }
        return !z;
    }
}

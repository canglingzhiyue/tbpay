package com.taobao.android.weex.inspector;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.android.weex.WeexInstanceImpl;
import org.json.JSONException;
import org.json.JSONObject;
import tb.jtz;
import tb.juk;
import tb.jvw;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1683342632);
    }

    public static JSONObject a(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9ed4a34", new Object[]{weexInstanceImpl});
        }
        jvw jvwVar = null;
        jtz jtzVar = (jtz) weexInstanceImpl.getExtend(jtz.class);
        if (jtzVar != null) {
            jvwVar = jtzVar.a();
        }
        if (jvwVar == null) {
            return a(102, "Instance apm not found");
        }
        try {
            try {
                String b = jvwVar.b().b();
                if (b == null) {
                    return a(104, "Procedure data is null");
                }
                JSONObject jSONObject = new JSONObject(b);
                juk jukVar = (juk) weexInstanceImpl.getExtend(juk.class);
                if (jukVar != null) {
                    String str = jukVar.i().get("raster_end_time_stamp_opt");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            jSONObject.getJSONObject("value").getJSONObject(NWFullTracePlugin.FullTraceJSParam.STAGES).put(jvw.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT, Long.parseLong(str));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("success", true);
                    jSONObject2.put("result", jSONObject);
                } catch (JSONException unused2) {
                }
                return jSONObject2;
            } catch (JSONException unused3) {
                return a(105, "Procedure data is invalid");
            }
        } catch (NoSuchMethodError unused4) {
            return a(103, "Can not get procedure data");
        }
    }

    private static JSONObject a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5329d913", new Object[]{new Integer(i), str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", false);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Code = "code";
    public static final String Error = "error";
    public static final String Message = "message";
    public static final String Method = "method";
    public static final String Params = "params";
    public static final String RVLModuleName = "RiverLogger";
    public static final String ResponseId = "responseId";
    public static final String Result = "result";
    public static final String SessionId = "sessionId";

    static {
        kge.a(2103581917);
    }

    public static JSONObject a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5329d913", new Object[]{new Integer(i), str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", i);
            if (str == null) {
                str = "failed";
            }
            jSONObject2.put("message", str);
            jSONObject.put("error", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

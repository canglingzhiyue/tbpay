package com.taobao.highway.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.kth;
import tb.ktk;

/* loaded from: classes7.dex */
public class HighwayJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_DEFAULT_SOLUTION = "JS_SOLUTION";
    public static final String JS_DEFAULT_TRIGGER = "JS_TRIGGER";

    static {
        kge.a(1845527);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str2)) {
                wVCallBackContext.error(r.RET_PARAM_ERR);
                return false;
            }
            JSONObject jSONObject = new JSONObject(str2);
            if ("sendEvent".equals(str)) {
                if (!StringUtils.isEmpty(jSONObject.getString("eventName")) && !StringUtils.isEmpty(jSONObject.getString("highway_content"))) {
                    String string = jSONObject.getString("eventName");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("highway_content");
                    kth a2 = ktk.a();
                    a2.a(string, jSONObject2, JS_DEFAULT_SOLUTION, "JS_TRIGGER_" + str);
                    wVCallBackContext.success(r.RET_SUCCESS);
                    return true;
                }
                wVCallBackContext.error(r.RET_PARAM_ERR);
                return false;
            } else if ("sendBatchEvent".equals(str)) {
                if (StringUtils.isEmpty(jSONObject.getString("eventName"))) {
                    wVCallBackContext.error(r.RET_PARAM_ERR);
                    return false;
                }
                ktk.a().a(jSONObject.getString("eventName"));
                wVCallBackContext.success(r.RET_SUCCESS);
                return true;
            } else if ("sendSceneEvent".equals(str)) {
                if (StringUtils.isEmpty(jSONObject.getString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName))) {
                    wVCallBackContext.error(r.RET_PARAM_ERR);
                    return false;
                }
                ktk.a().b(jSONObject.getString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName));
                wVCallBackContext.success(r.RET_SUCCESS);
                return true;
            } else {
                wVCallBackContext.error(r.RET_PARAM_ERR);
                return false;
            }
        } catch (JSONException unused) {
            wVCallBackContext.error(r.RET_PARAM_ERR);
            return false;
        }
    }
}

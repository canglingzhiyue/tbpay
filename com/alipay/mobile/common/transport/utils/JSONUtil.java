package com.alipay.mobile.common.transport.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class JSONUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final JSONObject convertJSONObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f8b4d0b9", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable th) {
            JSONException jSONException = new JSONException("Parse json error. value=" + str);
            jSONException.initCause(th);
            MonitorErrorLogHelper.log("JSONUtil", jSONException);
            return null;
        }
    }
}

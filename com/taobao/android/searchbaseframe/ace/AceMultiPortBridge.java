package com.taobao.android.searchbaseframe.ace;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import tb.imp;
import tb.kge;

/* loaded from: classes6.dex */
public class AceMultiPortBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "ACEMultiPortBridge";

    static {
        kge.a(-362263526);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, "fetchCurrentPort")) {
            int g = imp.a().g();
            k.e(PLUGIN_NAME, "ace current port:" + g);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("port", (Object) String.valueOf(g));
            wVCallBackContext.success(jSONObject.toString());
        }
        return false;
    }
}

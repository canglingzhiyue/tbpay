package com.taobao.android.detail.core.standard.mainpic.weex;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsPicGalleryWindvaneApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1231801036);
    }

    public abstract boolean handleAction(String str, JSONObject jSONObject, WVCallBackContext wVCallBackContext);

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || wVCallBackContext == null) {
            ard a2 = arc.a();
            StringBuilder sb = new StringBuilder();
            sb.append("invalid input:");
            sb.append(StringUtils.isEmpty(str) ? "action is empty" : "wvCallBackContext is null.");
            a2.c("AbsPicGalleryWindvaneApiPlugin", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, sb.toString());
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringUtils.isEmpty(str2)) {
                jSONObject.putAll(JSONObject.parseObject(str2));
            }
        } catch (Exception e) {
            arc.a().c("AbsPicGalleryWindvaneApiPlugin", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, e.toString());
        }
        return handleAction(str, jSONObject, wVCallBackContext);
    }
}

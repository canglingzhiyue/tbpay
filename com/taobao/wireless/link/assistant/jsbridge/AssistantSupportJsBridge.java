package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.rjt;
import tb.rjw;
import tb.rkg;

/* loaded from: classes9.dex */
public class AssistantSupportJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_SUPPORT = "assistant_support";
    public static final String CLASSNAME_ASSISTANT_SUPPORT = "AssistantSupportJsBridge";

    static {
        kge.a(1893712856);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals(str, ACTION_ASSISTANT_SUPPORT)) {
                boolean c = rjw.c(rjt.a().f33186a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("supportAssistant", c);
                r rVar = new r();
                rVar.a("data", jSONObject);
                wVCallBackContext.success(rVar);
                rkg.a("link_tag", "AssistantSupportJsBridge === execute === h5调用是否支持小助手=" + jSONObject);
            }
        } catch (Exception e) {
            rkg.a("link_tag", "AssistantSupportJsBridge === execute === 小助手jsbridge调用，是否支持异常：" + e.getMessage());
        }
        return false;
    }
}

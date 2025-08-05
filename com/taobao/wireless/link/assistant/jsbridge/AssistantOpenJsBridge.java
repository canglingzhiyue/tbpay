package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;
import tb.rjt;
import tb.rju;
import tb.rkg;
import tb.rkj;

/* loaded from: classes9.dex */
public class AssistantOpenJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_OPEN = "assistant_open";
    public static final String CLASSNAME_ASSISTANT_OPEN = "AssistantOpenJsBridge";

    static {
        kge.a(512694597);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals(str, ACTION_ASSISTANT_OPEN)) {
                String str3 = null;
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("id")) {
                        str3 = (String) jSONObject.get("id");
                    }
                    boolean booleanValue = jSONObject.has("needEquity") ? ((Boolean) jSONObject.get("needEquity")).booleanValue() : false;
                    if (jSONObject.has("extraInfo")) {
                        hashMap = (HashMap) rkj.a(jSONObject.getJSONObject("extraInfo"));
                    }
                    rju.a().a(rjt.a().f33186a, str3, booleanValue, hashMap);
                } catch (Exception e) {
                    rkg.a("link_tag", "AssistantOpenJsBridge === execute === 打开小助手获取参数异常=" + e.getMessage());
                    return false;
                }
            }
        } catch (Exception e2) {
            rkg.a("link_tag", "AssistantOpenJsBridge === execute === 小助手jsbridge调用，打开异常：" + e2.getMessage());
        }
        return false;
    }
}

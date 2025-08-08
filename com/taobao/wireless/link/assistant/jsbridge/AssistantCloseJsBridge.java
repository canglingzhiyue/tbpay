package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.rjt;
import tb.rju;
import tb.rkg;

/* loaded from: classes9.dex */
public class AssistantCloseJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_CLOSE = "assistant_close";
    public static final String CLASSNAME_ASSISTANT_CLOSE = "AssistantCloseJsBridge";

    static {
        kge.a(-879187263);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (StringUtils.equals(str, ACTION_ASSISTANT_CLOSE)) {
                String str3 = null;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("id")) {
                        str3 = (String) jSONObject.get("id");
                    }
                    rkg.a("link_tag", "AssistantCloseJsBridge === execute === 关闭小助手，活动id=" + str3);
                    rju.a().a(rjt.a().f33186a, str3);
                } catch (Exception e) {
                    rkg.a("link_tag", "AssistantCloseJsBridge === execute === 关闭小助手异常=" + e.getMessage());
                    return false;
                }
            }
        } catch (Exception e2) {
            rkg.a("link_tag", "AssistantCloseJsBridge === execute === 小助手jsbridge调用，关闭异常：" + e2.getMessage());
        }
        return false;
    }
}

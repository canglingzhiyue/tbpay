package com.taobao.wireless.link.webApp;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.rkg;

/* loaded from: classes9.dex */
public class WebAppJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ADD_SHORTCUT = "addShortCut2Desktop";
    public static final String NAME = "ShortCutInterface";

    static {
        kge.a(1244794186);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        if (TextUtils.equals(str, ACTION_ADD_SHORTCUT)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String str3 = (String) jSONObject.get("labelName");
                String str4 = (String) jSONObject.get("resId");
                String str5 = (String) jSONObject.get("url");
                rkg.a("WebApp", "WebAppJSBridge === execute === labelName = " + str3 + "  resId = " + str4 + "  url = " + str5);
                a.a(b.a().f23626a, str3, str4, str5);
                r rVar = new r();
                rVar.a("data", jSONObject);
                wVCallBackContext.success(rVar);
            } catch (Exception e) {
                rkg.a("WebApp", "WebAppJSBridge === execute === 解析异常：" + e.getMessage());
                wVCallBackContext.error();
                return false;
            }
        }
        return true;
    }
}

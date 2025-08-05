package com.taobao.android.detail.ttdetail.widget.webview.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(702887453);
    }

    public static boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"callService".equalsIgnoreCase(str) || str2 == null || (parseObject = JSONObject.parseObject(str2)) == null || !parseObject.containsKey("phone")) {
            return false;
        }
        parseObject.getString("phone");
        return true;
    }
}

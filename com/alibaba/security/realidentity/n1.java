package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.common.http.MTopManager;
import com.alibaba.security.realidentity.biz.biometrics.EventRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class n1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "VideoRecorderUpload";

    /* renamed from: a  reason: collision with root package name */
    public final MTopManager f3475a;

    public n1(Context context) {
        this.f3475a = new MTopManager(context);
    }

    public void a(String str, String str2, String str3, boolean z, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ec1162", new Object[]{this, str, str2, str3, new Boolean(z), str4, str5});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        jSONObject.put("type", (Object) str3);
        jSONObject.put("url", (Object) str);
        jSONObject.put("conf", (Object) str5);
        EventRequest eventRequest = new EventRequest(str2, "", z);
        eventRequest.eventCode = str4;
        eventRequest.eventData = jSONObject.toJSONString();
        this.f3475a.asyncRequest(eventRequest, null);
    }
}

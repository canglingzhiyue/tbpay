package com.taobao.search.common.voicesearch.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.a;
import com.taobao.runtimepermission.f;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class SpeechPermissionPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "SearchSpeechPermissionBridge";

    static {
        kge.a(1004181948);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!a.CALENDAR_EVENT_PERMISSION_CHECK.equals(str)) {
            return false;
        }
        f.a(this.mContext, new String[]{"android.permission.RECORD_AUDIO"}).b(noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME).a(true).a(new Runnable() { // from class: com.taobao.search.common.voicesearch.jsbridge.SpeechPermissionPlugin.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    wVCallBackContext.success(SpeechPermissionPlugin.this.generateRetStr(android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW));
                }
            }
        }).b(new Runnable() { // from class: com.taobao.search.common.voicesearch.jsbridge.SpeechPermissionPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    wVCallBackContext.error(SpeechPermissionPlugin.this.generateRetStr(android.taobao.windvane.runtimepermission.a.PERMISSION_DENY));
                }
            }
        }).a();
        return true;
    }

    public String generateRetStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a117daea", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        return jSONObject.toJSONString();
    }
}

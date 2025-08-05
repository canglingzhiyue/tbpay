package com.taobao.tlog.adapter;

import android.preference.PreferenceManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.q;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.f;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TLogJSBridage extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            q.a("TLogJSBridage", (Class<? extends android.taobao.windvane.jsbridge.e>) TLogJSBridage.class);
            TLogDiagnose.init();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"toLogcat".equals(str)) {
            return false;
        }
        toLogcat(str2, wVCallBackContext);
        return true;
    }

    public void toLogcat(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad3377b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean(LogCategory.CATEGORY_LOGCAT);
            boolean z2 = jSONObject.getBoolean("restart");
            f.a().a(z);
            if (z2) {
                PreferenceManager.getDefaultSharedPreferences(f.a().j().getApplicationContext()).edit().putBoolean("tlog_isDebug", z).commit();
            }
            wVCallBackContext.success();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }
}

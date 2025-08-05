package com.network.diagnosis.toolchain;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class WVNetworkDiagnosisPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVNetworkDiagnosisPlugin";
    private static final String WV_ENABLE_INTERNAL_DETECT = "enableInternalDetect";
    private static final String WV_PLUGIN_NAME = "NetworkDiagnosisPlugin";
    private static boolean enableInternalDetect = false;

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            q.a(WV_PLUGIN_NAME, (Class<? extends e>) WVNetworkDiagnosisPlugin.class);
        } catch (Throwable unused) {
            ALog.e(TAG, "[register]error", null, new Object[0]);
        }
    }

    public static boolean isEnableInternalDetect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c82d3678", new Object[0])).booleanValue() : enableInternalDetect;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!WV_ENABLE_INTERNAL_DETECT.equals(str) || TextUtils.isEmpty(str2)) {
            wVCallBackContext.error();
            return false;
        }
        try {
            enableInternalDetect = JSON.parseObject(str2).getBoolean(WV_ENABLE_INTERNAL_DETECT).booleanValue();
            wVCallBackContext.success();
        } catch (Exception e) {
            wVCallBackContext.error(e.toString());
        }
        return true;
    }
}

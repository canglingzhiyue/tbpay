package com.network.diagnosis.toolchain;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import anet.channel.detect.NetworkDetector;
import anet.channel.util.ALog;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.MtopUnitStrategy;

/* loaded from: classes.dex */
public class WVNetworkQualityPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_ACCS = "accs";
    private static final String CHANNEL_MTOP = "mtop";
    private static final String TAG = "WVNetworkDiagnosisPlugin";
    private static final String WV_GET_RTT = "getRTT";
    private static final String WV_GET_RTT_CHANNEL = "channel";
    private static final String WV_PLUGIN_NAME = "WVNetworkQuality";

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            q.a(WV_PLUGIN_NAME, (Class<? extends e>) WVNetworkQualityPlugin.class);
        } catch (Throwable unused) {
            ALog.e(TAG, "[register]error", null, new Object[0]);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!WV_GET_RTT.equals(str) || TextUtils.isEmpty(str2)) {
            wVCallBackContext.error();
            return false;
        }
        try {
            JSONArray jSONArray = JSON.parseObject(str2).getJSONArray("channel");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if ("mtop".equalsIgnoreCase(string)) {
                    jSONArray2.add(Long.valueOf(NetworkDetector.getRTTDetector().getRTT(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN)));
                } else if ("accs".equalsIgnoreCase(string)) {
                    jSONArray2.add(Long.valueOf(NetworkDetector.getRTTDetector().getRTT("msgacs.m.taobao.com")));
                } else {
                    jSONArray2.add(-1);
                }
            }
            wVCallBackContext.success(jSONArray2.toString());
        } catch (Exception e) {
            wVCallBackContext.error(e.toString());
        }
        return true;
    }
}

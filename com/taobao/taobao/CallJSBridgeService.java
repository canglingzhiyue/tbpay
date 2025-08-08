package com.taobao.taobao;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.callservice.WVAlipayApiPlugin;
import com.taobao.tao.alipay.callservice.WVIdleFishApiBridge;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;

/* loaded from: classes8.dex */
public class CallJSBridgeService extends Service implements android.taobao.windvane.jsbridge.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if ("WVIdleFishApi".equals(str)) {
            return WVIdleFishApiBridge.class;
        }
        if ("TBAlipayJSBridge".equals(str)) {
            return WVAlipayApiPlugin.class;
        }
        if (!PayPasswrdValidateBridge.PLUGIN_NAME.equals(str)) {
            return null;
        }
        return PayPasswrdValidateBridge.class;
    }
}

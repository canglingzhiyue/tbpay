package com.taobao.detail.rate.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.tao.TaobaoApplication;

/* loaded from: classes7.dex */
public class RateJsBridgeService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    public RateJsBridgeService() {
        f.a("com.taobao.detail.rate", "com.taobao.detail.rate.jsbridge.RateJsBridgeService");
        ApplicationInvoker.getInstance("com.taobao.detail.rate").invoke("com.taobao.detail.rate.RateDisplayApplication", TaobaoApplication.sApplication);
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || !str.equals("WVPreviewPlugin")) {
            return null;
        }
        return WVPreviewPlugin.class;
    }
}

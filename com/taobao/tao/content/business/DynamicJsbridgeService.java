package com.taobao.tao.content.business;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class DynamicJsbridgeService extends Service implements android.taobao.windvane.jsbridge.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-837673411);
        kge.a(-1332442189);
    }

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
        if (!"TBContentBusiness".equals(str)) {
            return null;
        }
        return WVBusinessSDKBridge.class;
    }
}

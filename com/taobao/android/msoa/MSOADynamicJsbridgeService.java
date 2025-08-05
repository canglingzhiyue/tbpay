package com.taobao.android.msoa;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class MSOADynamicJsbridgeService extends Service implements android.taobao.windvane.jsbridge.c {
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
    public Class<? extends android.taobao.windvane.jsbridge.e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.equals(MSOAWVService.PLUGIN_NAME)) {
            return null;
        }
        return MSOAWVService.class;
    }
}

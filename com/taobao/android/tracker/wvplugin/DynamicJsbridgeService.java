package com.taobao.android.tracker.wvplugin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class DynamicJsbridgeService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1035338505);
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
        if (StringUtils.isEmpty(str) || !str.equals("DynamicTracker")) {
            return null;
        }
        return DynamicTrackerPlugin.class;
    }
}

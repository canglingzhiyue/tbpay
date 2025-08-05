package com.taobao.tao.powermsg.outter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.g;
import tb.kge;

/* loaded from: classes8.dex */
public class PowerMsg4WXService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(583320389);
        kge.a(-1332442189);
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (!"powermsg".equalsIgnoreCase(str)) {
            return null;
        }
        MsgLog.a("4WXService", "PowerMsg4WW register >>");
        g.a();
        return PowerMsg4WW.class;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}

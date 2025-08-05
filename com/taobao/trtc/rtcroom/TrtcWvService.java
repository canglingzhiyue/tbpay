package com.taobao.trtc.rtcroom;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcWvService extends Service implements android.taobao.windvane.jsbridge.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1145513209);
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
    public Class<? extends android.taobao.windvane.jsbridge.e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.equals("artc_wv_bridge")) {
            return null;
        }
        TrtcLog.d(TrtcWvService.class.getName(), "get bridge for trtc");
        return TrtcWvPlugin.class;
    }
}

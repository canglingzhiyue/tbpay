package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.ike;
import tb.ikq;

/* loaded from: classes6.dex */
public final class TaobaoRSoLinkInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            Log.e("RemoteSo", "LinkInit.init(), start");
            TLog.loge("RemoteSo", "RemoteSo", "LinkInit.init(), start");
            ike.f29113a = true;
            Log.e("RemoteSo", "LinkInit.init(), success");
            TLog.loge("RemoteSo", "RemoteSo", "LinkInit.init(), success");
        } catch (Throwable th) {
            ikq.a("LinkInit.init()  error", th);
        }
    }
}

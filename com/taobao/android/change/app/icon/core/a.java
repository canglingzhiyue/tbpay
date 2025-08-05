package com.taobao.android.change.app.icon.core;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHANGE_APP_ICON_RESULT = "change_app_icon_result";

    static {
        kge.a(-1789151253);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
            return;
        }
        AdapterForTLog.loge(igc.TAG, "sendBroadcast:" + intent.getAction());
        LocalBroadcastManager.getInstance(igc.b()).sendBroadcast(intent);
    }
}

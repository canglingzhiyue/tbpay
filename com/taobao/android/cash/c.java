package com.taobao.android.cash;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-239560666);
    }

    public static boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
        TLog.logd("", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }
}

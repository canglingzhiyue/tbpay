package com.ali.user.open.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class SessionSyncReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            try {
                if (!StringUtils.equals(intent.getAction(), "aliuser_sync_session")) {
                    return;
                }
                intent.getStringExtra("from");
            } catch (Throwable unused) {
            }
        }
    }
}

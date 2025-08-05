package com.taobao.desktop.widget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class FloatWindowStateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public static class FloatWindowStateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-484090940);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            }
        }
    }

    static {
        kge.a(-270793068);
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a954e7", new Object[]{context, broadcastReceiver});
        } else if (context == null || broadcastReceiver == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.desktop.float_window_close");
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}

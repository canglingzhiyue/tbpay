package com.taobao.android.tbtheme.kit;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1192600593);
    }

    public static void a(boolean z, BroadcastReceiver broadcastReceiver, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97750ee4", new Object[]{new Boolean(z), broadcastReceiver, strArr});
            return;
        }
        Application application = Globals.getApplication();
        if (application == null || strArr == null || broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        if (z) {
            LocalBroadcastManager.getInstance(application).registerReceiver(broadcastReceiver, intentFilter);
        } else {
            application.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void a(boolean z, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578d2a5b", new Object[]{new Boolean(z), broadcastReceiver});
            return;
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return;
        }
        if (z) {
            LocalBroadcastManager.getInstance(application).unregisterReceiver(broadcastReceiver);
        } else {
            application.unregisterReceiver(broadcastReceiver);
        }
    }
}

package com.alibaba.android.split;

import android.content.Context;
import android.content.ServiceConnection;
import com.alibaba.android.split.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import tb.kge;

/* loaded from: classes2.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1274406430);
    }

    public static boolean a(Context context, ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("384d3068", new Object[]{context, serviceConnection})).booleanValue() : Services.bind(context, BIND_SPLIT_INSTALL_SERVICE.class, serviceConnection);
    }

    public static void b(Context context, ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860ca865", new Object[]{context, serviceConnection});
        } else {
            Services.unbind(context, serviceConnection);
        }
    }
}

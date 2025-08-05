package com.taobao.taolive.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ksx;

/* loaded from: classes8.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1861708920);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return new ksx(context).a(context);
    }
}

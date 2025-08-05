package com.alibaba.security.realidentity;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class k3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static p2 a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p2) ipChange.ipc$dispatch("4efb1cde", new Object[]{context}) : Build.VERSION.SDK_INT >= 18 ? new l3(context) : new q3(context);
    }
}

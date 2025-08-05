package com.alibaba.wireless.security.aopsdk;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AopEntry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        }
    }
}

package com.taobao.android.navigationextern;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kmx;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context != null) {
            return kmx.a(context, "download-sdk/tmp");
        }
        return null;
    }
}

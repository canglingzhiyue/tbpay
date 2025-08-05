package com.alipay.share.sdk.openapi;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APAPIFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private APAPIFactory() {
    }

    public static IAPApi createZFBApi(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAPApi) ipChange.ipc$dispatch("58e2f51d", new Object[]{context, str, new Boolean(z)}) : new APApiImlV1(context, str, z);
    }

    public static IAPApi createZFBApi(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAPApi) ipChange.ipc$dispatch("a82a99ff", new Object[]{context, str}) : new APApiImlV1(context, str);
    }
}

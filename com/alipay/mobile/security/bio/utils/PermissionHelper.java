package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.os.Binder;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PermissionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int checkCallingOrSelfPermission(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7883aba4", new Object[]{context, str})).intValue();
        }
        if (str != null && context != null) {
            return context.checkPermission(str, Binder.getCallingPid(), Binder.getCallingUid());
        }
        throw new IllegalArgumentException("context or permission is null");
    }
}

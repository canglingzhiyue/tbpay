package com.alipay.security.mobile.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SecurityUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean isRoot(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc0e9f79", new Object[]{context})).booleanValue();
        }
        return false;
    }
}

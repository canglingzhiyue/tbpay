package com.alipay.android.phone.mobilesdk.socketcraft.util;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue() : "".equals(str) || str == null || str.trim().length() <= 0;
    }
}

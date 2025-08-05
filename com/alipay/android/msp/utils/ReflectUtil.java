package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ReflectUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> T newInstance(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace("ReflectUtil", "Failed newInstance of ".concat(String.valueOf(str)), th);
            return null;
        }
    }
}

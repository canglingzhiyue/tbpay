package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class GtsUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static long f5623a = -1;

    public static final long getCurrentTimeMillis() {
        long currentTimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aff3291", new Object[0])).longValue();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis2 != f5623a) {
            f5623a = currentTimeMillis2;
            return currentTimeMillis2;
        }
        synchronized (GtsUtils.class) {
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                LogCatUtil.printError("GtsUtils", e);
            }
            currentTimeMillis = System.currentTimeMillis();
            f5623a = currentTimeMillis;
        }
        return currentTimeMillis;
    }

    public static final String get64HexCurrentTimeMillis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("445df574", new Object[0]) : HexaDecimalConvUtil.c10to64(getCurrentTimeMillis());
    }
}

package com.alipay.mobile.verifyidentity.module.password.pay.customized.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class EditTextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static EditTextUtil f5926a;

    public static EditTextUtil getEditStringUtils() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("195dbf2f", new Object[0]);
        }
        if (f5926a == null) {
            f5926a = new EditTextUtil();
        }
        return f5926a;
    }
}

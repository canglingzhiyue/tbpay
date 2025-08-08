package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class EditTextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static EditTextUtil f5907a;

    public static EditTextUtil getEditStringUtils() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("356f5861", new Object[0]);
        }
        if (f5907a == null) {
            f5907a = new EditTextUtil();
        }
        return f5907a;
    }
}

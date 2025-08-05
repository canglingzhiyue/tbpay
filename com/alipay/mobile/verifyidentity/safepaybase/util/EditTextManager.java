package com.alipay.mobile.verifyidentity.safepaybase.util;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class EditTextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static EditTextUtil f6057a;

    public static EditTextUtil a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("b140f1bc", new Object[0]);
        }
        if (f6057a == null) {
            f6057a = new EditTextUtil();
        }
        return f6057a;
    }
}

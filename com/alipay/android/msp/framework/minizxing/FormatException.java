package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class FormatException extends ReaderException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final FormatException instance = new FormatException();

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FormatException) ipChange.ipc$dispatch("278abff3", new Object[0]) : instance;
    }
}

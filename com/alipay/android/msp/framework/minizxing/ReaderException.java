package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class ReaderException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this});
        }
        return null;
    }
}

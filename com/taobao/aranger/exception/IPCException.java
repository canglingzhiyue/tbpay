package com.taobao.aranger.exception;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class IPCException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mErrorCode;

    static {
        kge.a(1843182623);
    }

    public IPCException(int i, String str) {
        super(str);
        this.mErrorCode = i;
    }

    public IPCException(int i, Throwable th) {
        super(th.toString(), th);
        this.mErrorCode = i;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.mErrorCode;
    }
}

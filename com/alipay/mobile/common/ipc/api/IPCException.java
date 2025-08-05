package com.alipay.mobile.common.ipc.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes3.dex */
public class IPCException extends IOException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errorCode;
    public String errorMsg;

    public IPCException() {
    }

    public IPCException(String str) {
        super(str);
    }

    public IPCException(String str, Throwable th) {
        super(str, th);
    }

    public IPCException(Throwable th) {
        super(th);
    }

    public IPCException(int i, String str) {
        this("errorCode:" + i + " errorMsg:" + str);
        this.errorCode = i;
        this.errorMsg = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IPCException{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + "'}";
    }
}

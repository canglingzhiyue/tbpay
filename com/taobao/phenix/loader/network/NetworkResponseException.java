package com.taobao.phenix.loader.network;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class NetworkResponseException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mExtraCode;
    private final int mHttpCode;

    static {
        kge.a(1078729553);
    }

    public NetworkResponseException(int i, String str, int i2, Throwable th) {
        super(str, th);
        this.mHttpCode = i;
        this.mExtraCode = i2;
    }

    public NetworkResponseException(int i, String str) {
        this(i, str, 0, null);
    }

    public int getHttpCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58026b05", new Object[]{this})).intValue() : this.mHttpCode;
    }

    public int getExtraCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0a61861", new Object[]{this})).intValue() : this.mExtraCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getName() + "(httpCode=" + this.mHttpCode + ", extraCode=" + this.mExtraCode + ", desc=" + getMessage() + riy.BRACKET_END_STR;
    }
}

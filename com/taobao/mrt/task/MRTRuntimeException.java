package com.taobao.mrt.task;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class MRTRuntimeException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errorCode;

    static {
        kge.a(323403663);
    }

    public MRTRuntimeException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MRTRuntimeException{errorCode:" + this.errorCode + ",msg:" + getMessage() + '}';
    }
}

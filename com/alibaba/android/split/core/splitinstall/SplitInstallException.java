package com.alibaba.android.split.core.splitinstall;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class SplitInstallException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int errorCode;

    static {
        kge.a(-380242406);
    }

    public SplitInstallException(int i) {
        super(String.format("Split Install Error(%d): %s", Integer.valueOf(i), com.alibaba.android.split.model.a.a(i)));
        this.errorCode = i;
    }

    public SplitInstallException(String str, Throwable th) {
        super(str, th);
        this.errorCode = 0;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.errorCode;
    }
}

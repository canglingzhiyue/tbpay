package com.alibaba.android.split.core.install;

import com.alibaba.android.split.core.install.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class InstallException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int errorCode;

    static {
        kge.a(885147618);
    }

    public InstallException(int i) {
        super(String.format("Install Error(%d): %s", Integer.valueOf(i), a.a(i)));
        this.errorCode = i;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.errorCode;
    }
}

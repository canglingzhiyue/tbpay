package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class Result extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private native int nativeGetChanges();

    private native long nativeGetLastInsertedRowID();

    public Result(long j) {
        super(j);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }
}

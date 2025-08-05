package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class DBConnection extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private native long nativeCreateStatement(String str);

    private native long nativePrepareStatement(String str);

    public DBConnection(long j) {
        super(j);
    }
}

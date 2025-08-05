package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class c extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public c(long j) {
        super(j);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            c();
        }
    }
}

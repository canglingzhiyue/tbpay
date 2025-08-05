package com.alibaba.android.split.access;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class AbstractAccessSplitDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1854207493);
    }

    public abstract String[] getAccessClasses();
}

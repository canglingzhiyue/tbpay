package com.tmall.android.dai.internal.featurecenter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class FeatureCenterImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1667755309);
    }

    private static native void nativeSetupFeatureCenter();

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            nativeSetupFeatureCenter();
        }
    }
}

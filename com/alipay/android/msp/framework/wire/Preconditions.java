package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class Preconditions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private Preconditions() {
    }

    public static void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
        } else if (obj != null) {
        } else {
            throw new NullPointerException(str + " == null");
        }
    }

    public static void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{new Boolean(z), str});
        } else if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}

package com.ali.user.open.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class Validate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-849249933);
    }

    public static void notNull(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07aa8a7", new Object[]{obj, str});
        } else if (obj != null) {
        } else {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }
}

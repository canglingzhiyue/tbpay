package com.alibaba.jsi.standard;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kDontNotifyNative = 1;
    public static final int kStrategyNone = 0;

    static {
        kge.a(515090845);
    }

    public int a(JSEngine jSEngine, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bb7fa6c", new Object[]{this, jSEngine, map})).intValue();
        }
        return 0;
    }
}

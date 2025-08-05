package com.taobao.tab2interact.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(88062988);
    }

    public static float a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25edca48", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue() : f < f2 ? f2 : f > f3 ? f3 : f;
    }
}

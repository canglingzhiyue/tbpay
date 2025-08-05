package com.taobao.android.weex_framework.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1559344362);
    }

    public static float a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f50", new Object[]{context, new Float(f)})).floatValue() : (f / context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}

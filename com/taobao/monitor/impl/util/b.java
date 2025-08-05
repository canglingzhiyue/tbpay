package com.taobao.monitor.impl.util;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : (int) ((i * com.taobao.monitor.impl.common.e.a().b().getResources().getDisplayMetrics().density) + 0.5f);
    }
}

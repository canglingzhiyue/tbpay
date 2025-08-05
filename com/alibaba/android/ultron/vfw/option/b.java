package com.alibaba.android.ultron.vfw.option;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1000098399);
    }

    public static boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : (i & i2) != 0;
    }
}

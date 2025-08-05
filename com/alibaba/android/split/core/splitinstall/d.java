package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-728582565);
    }

    public boolean a(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{this, context, strArr})).booleanValue() : com.alibaba.android.split.core.splitcompat.j.a(context, strArr);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : com.alibaba.android.split.core.splitcompat.j.g();
    }
}

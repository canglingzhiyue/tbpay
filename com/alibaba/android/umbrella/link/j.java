package com.alibaba.android.umbrella.link;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    public static boolean b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cdf7d91", new Object[]{charSequence})).booleanValue() : !a(charSequence);
    }
}

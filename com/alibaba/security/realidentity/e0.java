package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class e0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final int f3385a = 1;
    public static final int b = 2;

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 2;
    }
}

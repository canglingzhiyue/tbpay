package com.alilive.adapter.uikit;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.png;

/* loaded from: classes3.dex */
public class g implements png {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f4327a;
    private int b;

    static {
        kge.a(-1987043758);
        kge.a(-426609473);
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f4327a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}

package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private double f15877a;
    private double b;
    private double c;
    private double d;

    static {
        kge.a(1329394919);
    }

    public double a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c56", new Object[]{this})).doubleValue() : this.f15877a;
    }

    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.b;
    }

    public double c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b58", new Object[]{this})).doubleValue() : this.c;
    }

    public double d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2d9", new Object[]{this})).doubleValue() : this.d;
    }
}

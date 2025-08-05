package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private double f15876a = -1.0d;
    private double b = -1.0d;
    private double c = -1.0d;
    private p d;

    static {
        kge.a(-759452165);
    }

    public double a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c56", new Object[]{this})).doubleValue() : this.f15876a;
    }

    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.b;
    }

    public double c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b58", new Object[]{this})).doubleValue() : this.c;
    }

    public void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
        } else {
            this.c = d;
        }
    }

    public p d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("c4a13407", new Object[]{this}) : this.d;
    }
}

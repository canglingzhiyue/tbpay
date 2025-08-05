package com.alilive.adapter.uikit;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.png;

/* loaded from: classes3.dex */
public class TLiveRoundedCornersProcessor implements png {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f4325a;
    private final int b;
    private final int c;
    private final int d;
    private final CornerType e;

    /* loaded from: classes3.dex */
    public enum CornerType {
        ALL,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    static {
        kge.a(-1576783967);
        kge.a(-426609473);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f4325a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public CornerType e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CornerType) ipChange.ipc$dispatch("eb177c2b", new Object[]{this}) : this.e;
    }
}

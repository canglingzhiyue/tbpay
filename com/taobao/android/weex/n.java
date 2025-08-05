package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeexExternalType f15875a;
    private float b;
    private float c;
    private float d;
    private float e;
    private WeexExternalEventType f;
    private long g;

    static {
        kge.a(437664499);
    }

    public n(WeexExternalType weexExternalType, float f, float f2, float f3, float f4, WeexExternalEventType weexExternalEventType, long j) {
        this.f15875a = weexExternalType;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = weexExternalEventType;
        this.g = j;
    }

    public WeexExternalType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexExternalType) ipChange.ipc$dispatch("8891b5fc", new Object[]{this}) : this.f15875a;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.b;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.c;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.d;
    }

    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.e;
    }

    public WeexExternalEventType f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexExternalEventType) ipChange.ipc$dispatch("c56119b1", new Object[]{this}) : this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.g;
    }
}

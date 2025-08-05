package com.alipay.android.msp.network.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class NetResponseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final NetRequestData f4934a;
    private final ResData b;

    public final String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<NetResponseData of %s with response %s>", this.f4934a, this.b);
    }

    public NetResponseData(NetRequestData netRequestData, ResData resData) {
        this.f4934a = netRequestData;
        this.b = resData;
    }

    public final NetRequestData getRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetRequestData) ipChange.ipc$dispatch("954d03d2", new Object[]{this}) : this.f4934a;
    }

    public final ResData getResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResData) ipChange.ipc$dispatch("da8917c0", new Object[]{this}) : this.b;
    }
}

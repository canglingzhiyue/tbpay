package com.alipay.android.msp.network.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class NetRequestData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final RequestConfig f4933a;
    private final CustomCallback b;
    private final String c;

    public NetRequestData(RequestConfig requestConfig, String str, CustomCallback customCallback) {
        this.f4933a = requestConfig;
        this.c = str;
        this.b = customCallback == null ? CustomCallback.defaultCallback : customCallback;
    }

    public final RequestConfig getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestConfig) ipChange.ipc$dispatch("42c8a178", new Object[]{this}) : this.f4933a;
    }

    public final CustomCallback getCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomCallback) ipChange.ipc$dispatch("a738929a", new Object[]{this}) : this.b;
    }

    public final String getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : this.c;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<NetRequestData to %s with callback %s>", this.f4933a, this.b);
    }
}

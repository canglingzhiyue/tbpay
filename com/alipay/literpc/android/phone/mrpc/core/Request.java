package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TransportCallback f5296a;
    private boolean b = false;

    public TransportCallback getCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportCallback) ipChange.ipc$dispatch("64f6479e", new Object[]{this}) : this.f5296a;
    }

    public void setTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d02905d", new Object[]{this, transportCallback});
        } else {
            this.f5296a = transportCallback;
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    public boolean isCanceled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue() : this.b;
    }
}

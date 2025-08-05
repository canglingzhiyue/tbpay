package com.alipay.android.phone.mobilesdk.socketcraft.handshake;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5109a = "*";

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder
    public void setResourceDescriptor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97996770", new Object[]{this, str});
        } else if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        } else {
            this.f5109a = str;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake
    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this}) : this.f5109a;
    }
}

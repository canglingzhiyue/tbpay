package com.alipay.android.phone.mobilesdk.socketcraft.handshake;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private short f5110a;
    private String b;

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake
    public String getHttpStatusMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("25d8dc02", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake
    public short getHttpStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea25b314", new Object[]{this})).shortValue() : this.f5110a;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder
    public void setHttpStatusMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c1ac1c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder
    public void setHttpStatus(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9167e1ca", new Object[]{this, new Short(s)});
        } else {
            this.f5110a = s;
        }
    }
}

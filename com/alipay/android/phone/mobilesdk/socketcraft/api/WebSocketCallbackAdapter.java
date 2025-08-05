package com.alipay.android.phone.mobilesdk.socketcraft.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class WebSocketCallbackAdapter implements WebSocketCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
    public void onSocketClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ada86d", new Object[]{this});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
    public void onSocketError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7adf907", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
    public void onSocketMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d2a46", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
    public void onSocketMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b24355", new Object[]{this, byteBuffer});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
    public void onSocketOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb387e23", new Object[]{this});
        }
    }
}

package com.huawei.nfc.sdk.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.nfc.sdk.service.ICUPOnlinePayService;
import com.unionpay.utils.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class e implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f7603a;

    private e(a aVar) {
        this.f7603a = aVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        byte[] bArr;
        byte[] bArr2;
        j.b("HwOpenPayTask", "---onServiceConnected---begin");
        bArr = this.f7603a.f7601a;
        synchronized (bArr) {
            this.f7603a.c = ICUPOnlinePayService.Stub.asInterface(iBinder);
            j.b("HwOpenPayTask", "---onServiceConnected---");
            bArr2 = this.f7603a.f7601a;
            bArr2.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        byte[] bArr;
        byte[] bArr2;
        j.b("HwOpenPayTask", "---onServiceDisconnected---begin");
        bArr = this.f7603a.f7601a;
        synchronized (bArr) {
            j.b("HwOpenPayTask", "---onServiceDisconnected---");
            this.f7603a.c = null;
            bArr2 = this.f7603a.f7601a;
            bArr2.notifyAll();
        }
    }
}

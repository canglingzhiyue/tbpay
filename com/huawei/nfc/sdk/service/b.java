package com.huawei.nfc.sdk.service;

import android.os.Bundle;
import com.unionpay.utils.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f7602a;
    final /* synthetic */ String b;
    final /* synthetic */ a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, d dVar, String str) {
        this.c = aVar;
        this.f7602a = dVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        ICUPOnlinePayService iCUPOnlinePayService;
        a aVar;
        ICUPOnlinePayService iCUPOnlinePayService2;
        bArr = this.c.f7601a;
        synchronized (bArr) {
            this.c.e = this.f7602a;
            this.c.a();
            iCUPOnlinePayService = this.c.c;
            if (iCUPOnlinePayService != null) {
                try {
                    j.b("HwOpenPayTask", "supportCapacity capacity is " + this.b);
                    iCUPOnlinePayService2 = this.c.c;
                    boolean supportCapacity = iCUPOnlinePayService2.supportCapacity(this.b);
                    j.b("HwOpenPayTask", "supportCapacity result is " + supportCapacity);
                    if (this.f7602a != null) {
                        this.f7602a.a(supportCapacity ? 1 : 0, new Bundle());
                    }
                    aVar = this.c;
                } catch (Exception unused) {
                    j.c("HwOpenPayTask", "supportCapacity---RemoteException--");
                    this.f7602a.a(0, new Bundle());
                    aVar = this.c;
                }
                aVar.c();
            } else {
                j.b("HwOpenPayTask", "mOpenService is null");
            }
        }
    }
}

package com.huawei.nfc.sdk.service;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService;
import com.unionpay.utils.j;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class a {
    private WeakReference b;
    private ICUPOnlinePayService c;
    private c d;
    private d e;
    private boolean f;

    /* renamed from: a */
    private final byte[] f7601a = new byte[0];
    private ServiceConnection g = new e(this);
    private ICUPOnlinePayCallBackService h = new ICUPOnlinePayCallBackService.Stub() { // from class: com.huawei.nfc.sdk.service.HwOpenPayTask$1
        @Override // com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService
        public void onError(String str, String str2) {
            j.b("HwOpenPayTask", "getUnionOnlinePayStatus---onError--- errorCode is " + str + " and errorMsg is " + str2);
            if (a.a(a.this) != null) {
                a.a(a.this);
                a.a(a.this, (c) null);
            }
            if (a.b(a.this)) {
                a.c(a.this);
            }
        }

        @Override // com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService
        public void onResult(Bundle bundle) {
            j.b("HwOpenPayTask", "getUnionOnlinePayStatus---onResult---");
            if (a.a(a.this) != null) {
                a.a(a.this);
                a.a(a.this, (c) null);
            }
            if (a.b(a.this)) {
                a.c(a.this);
            }
        }
    };

    public a(Context context) {
        this.b = new WeakReference(context);
    }

    public static /* synthetic */ c a(a aVar) {
        return aVar.d;
    }

    public static /* synthetic */ c a(a aVar, c cVar) {
        aVar.d = cVar;
        return cVar;
    }

    public void a() {
        String str;
        String str2;
        Context context;
        synchronized (this.f7601a) {
            if (this.c == null) {
                Intent intent = new Intent("com.huawei.nfc.action.OPEN_AIDL_API_PAY");
                intent.setPackage("com.huawei.wallet");
                j.b("HwOpenPayTask", "---bindService---start");
                boolean z = false;
                if (this.b != null && (context = (Context) this.b.get()) != null) {
                    z = context.bindService(intent, this.g, 1);
                }
                j.b("HwOpenPayTask", "---bindService---end:" + z);
                if (z) {
                    this.f = true;
                    if (this.c == null) {
                        try {
                            j.b("HwOpenPayTask", "--waiting--");
                            this.f7601a.wait();
                        } catch (Exception unused) {
                            j.c("HwOpenPayTask", "---InterruptedException--");
                        }
                    } else {
                        str = "HwOpenPayTask";
                        str2 = "---initNfcService---isConnection mOpenService not null";
                    }
                }
                b();
            } else {
                str = "HwOpenPayTask";
                str2 = "---initNfcService---mOpenService not null";
            }
            j.b(str, str2);
        }
    }

    private void b() {
        j.b("HwOpenPayTask", "--failResult--:");
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(0, new Bundle());
        }
        c();
    }

    public static /* synthetic */ boolean b(a aVar) {
        return aVar.f;
    }

    public void c() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.c = null;
        if (this.b == null || this.g == null) {
            return;
        }
        j.b("HwOpenPayTask", "---unbindService---start");
        try {
            Context context = (Context) this.b.get();
            if (context != null) {
                context.unbindService(this.g);
            }
        } catch (Exception unused) {
        }
        j.b("HwOpenPayTask", "---unbindService---end");
    }

    public static /* synthetic */ void c(a aVar) {
        aVar.c();
    }

    public void a(String str, d dVar) {
        Executors.newCachedThreadPool().execute(new b(this, dVar, str));
    }
}

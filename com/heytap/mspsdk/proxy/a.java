package com.heytap.mspsdk.proxy;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.heytap.msp.a;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import tb.cwg;
import tb.cwn;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7249a;

    static {
        kge.a(722801755);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Handler handler) {
        super(handler);
        this.f7249a = bVar;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        cwn.b("ApiProxy", "MspResultReceiver onReceiveResult " + i + ", thread name " + Thread.currentThread().getName());
        if (i == 1000) {
            synchronized (this.f7249a.b) {
                com.heytap.msp.a a2 = a.AbstractBinderC0258a.a(bundle.getBinder("msp_core_binder"));
                if (a2 != null) {
                    cwn.b("ApiProxy", "MspResultReceiver onReceiveResult takes core binder");
                    cwg.a().a(a2);
                }
                Collection<CountDownLatch> values = this.f7249a.f7250a.values();
                cwn.b("ApiProxy", "MspResultReceiver onReceiveResult latches size " + values.size());
                if (!values.isEmpty() && values.size() > 0) {
                    for (CountDownLatch countDownLatch : values) {
                        countDownLatch.countDown();
                        cwn.b("ApiProxy", "MspResultReceiver onReceiveResult latches countDown()");
                    }
                }
            }
        }
    }
}

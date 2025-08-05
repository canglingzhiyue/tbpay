package com.meizu.cloud.pushsdk.e.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<com.meizu.cloud.pushsdk.e.e.a> f7930a;

    public d(com.meizu.cloud.pushsdk.e.e.a aVar) {
        super(Looper.getMainLooper());
        this.f7930a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        com.meizu.cloud.pushsdk.e.e.a aVar = this.f7930a.get();
        if (message.what != 1) {
            super.handleMessage(message);
        } else if (aVar == null) {
        } else {
            com.meizu.cloud.pushsdk.e.g.a aVar2 = (com.meizu.cloud.pushsdk.e.g.a) message.obj;
            aVar.a(aVar2.f7931a, aVar2.b);
        }
    }
}

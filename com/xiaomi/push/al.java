package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.ak;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class al extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak f24352a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(ak akVar, Looper looper) {
        super(looper);
        this.f24352a = akVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ak.b bVar = (ak.b) message.obj;
        if (message.what == 0) {
            bVar.a();
        } else if (message.what == 1) {
            bVar.mo1828c();
        }
        super.handleMessage(message);
    }
}

package com.unionpay;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import tb.rnl;
import tb.rnm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class c implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        rnm rnmVar;
        Context q;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        try {
            handler = a.W;
            handler.sendEmptyMessageDelayed(1001, 800L);
            rnmVar = a.V;
            q = a.q();
            rnl rnlVar = new rnl(rnmVar, com.unionpay.utils.b.a(q));
            rnlVar.a();
            String b = rnlVar.b();
            handler2 = a.W;
            if (handler2 == null) {
                return;
            }
            handler3 = a.W;
            Message obtainMessage = handler3.obtainMessage();
            obtainMessage.what = 1002;
            obtainMessage.obj = b;
            handler4 = a.W;
            handler4.removeMessages(1001);
            handler5 = a.W;
            handler5.sendMessage(obtainMessage);
        } catch (Exception unused) {
        }
    }
}

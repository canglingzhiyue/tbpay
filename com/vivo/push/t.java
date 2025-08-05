package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f24245a = new Handler(Looper.getMainLooper());
    private static final HandlerThread b;
    private static final Handler c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        b = handlerThread;
        handlerThread.start();
        c = new u(b.getLooper());
    }

    public static void a(s sVar) {
        if (sVar == null) {
            com.vivo.push.util.u.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a2 = sVar.a();
        Message message = new Message();
        message.what = a2;
        message.obj = sVar;
        c.sendMessageDelayed(message, 0L);
    }

    public static void a(Runnable runnable) {
        c.removeCallbacks(runnable);
        c.postDelayed(runnable, 15000L);
    }

    public static void b(Runnable runnable) {
        f24245a.post(runnable);
    }

    public static void c(Runnable runnable) {
        Handler handler = c;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}

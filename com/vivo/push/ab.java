package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import tb.riy;

/* loaded from: classes9.dex */
public abstract class ab {

    /* renamed from: a  reason: collision with root package name */
    protected Context f24149a;
    protected Handler b;
    private final Object c = new Object();

    /* loaded from: classes9.dex */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ab.this.b(message);
        }
    }

    public ab() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.b = new a(handlerThread.getLooper());
    }

    public final void a(Context context) {
        this.f24149a = context;
    }

    public final void a(Message message) {
        synchronized (this.c) {
            if (this.b == null) {
                String simpleName = getClass().getSimpleName();
                com.vivo.push.util.u.e(simpleName, ("Dead worker dropping a message: " + message.what) + " (Thread " + Thread.currentThread().getId() + riy.BRACKET_END_STR);
            } else {
                this.b.sendMessage(message);
            }
        }
    }

    public abstract void b(Message message);
}

package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final h f24773a;
    private final int b;
    private final c c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(c cVar, Looper looper, int i) {
        super(looper);
        this.c = cVar;
        this.b = i;
        this.f24773a = new h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(l lVar, Object obj) {
        g a2 = g.a(lVar, obj);
        synchronized (this) {
            this.f24773a.a(a2);
            if (!this.d) {
                this.d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                g a2 = this.f24773a.a();
                if (a2 == null) {
                    synchronized (this) {
                        a2 = this.f24773a.a();
                        if (a2 == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.a(a2);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.d = true;
        } finally {
            this.d = false;
        }
    }
}

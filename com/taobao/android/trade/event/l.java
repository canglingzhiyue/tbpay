package com.taobao.android.trade.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class l extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final n f15624a;
    private final int b;
    private final d c;
    private boolean d;

    static {
        kge.a(259367364);
    }

    public l(d dVar, Looper looper, int i) {
        super(looper);
        this.c = dVar;
        this.b = i;
        this.f15624a = new n();
    }

    public void a(p pVar, Event event, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf6cfe1", new Object[]{this, pVar, event, cVar});
            return;
        }
        m a2 = m.a(pVar, event, cVar);
        synchronized (this) {
            this.f15624a.a(a2);
            if (!this.d) {
                this.d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new RuntimeException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                m a2 = this.f15624a.a();
                if (a2 == null) {
                    synchronized (this) {
                        a2 = this.f15624a.a();
                        if (a2 == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.a(a2);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new RuntimeException("Could not send handler message");
            }
            this.d = true;
        } finally {
            this.d = false;
        }
    }
}

package com.taobao.taolive.room.utils;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long b;
    private final long c;
    private long d;
    private boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21784a = false;
    private a f = new a();

    static {
        kge.a(-1830262294);
    }

    public abstract void a(long j);

    public abstract void c();

    public static /* synthetic */ boolean a(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36a151e1", new Object[]{zVar})).booleanValue() : zVar.e;
    }

    public static /* synthetic */ long b(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97f3ee70", new Object[]{zVar})).longValue() : zVar.d;
    }

    public static /* synthetic */ long c(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9468b0f", new Object[]{zVar})).longValue() : zVar.c;
    }

    public z(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = true;
        this.f21784a = false;
        this.f.removeMessages(1);
    }

    public final synchronized z b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("e65d329e", new Object[]{this});
        }
        this.e = false;
        if (this.b <= 0) {
            c();
            return this;
        }
        this.d = SystemClock.elapsedRealtime() + this.b;
        this.f.sendMessage(this.f.obtainMessage(1));
        this.f21784a = true;
        return this;
    }

    /* loaded from: classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1175970015);
        }

        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            synchronized (z.this) {
                if (z.a(z.this)) {
                    return;
                }
                long b = z.b(z.this) - SystemClock.elapsedRealtime();
                if (b <= 0) {
                    z.this.c();
                    z.this.f21784a = false;
                } else if (b < z.c(z.this)) {
                    sendMessageDelayed(obtainMessage(1), b);
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    z.this.a(b);
                    long c = (elapsedRealtime + z.c(z.this)) - SystemClock.elapsedRealtime();
                    while (c < 0) {
                        c += z.c(z.this);
                    }
                    sendMessageDelayed(obtainMessage(1), c);
                }
            }
        }
    }
}

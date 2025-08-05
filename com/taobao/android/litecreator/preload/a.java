package com.taobao.android.litecreator.preload;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.s;
import java.util.Objects;
import java.util.Observable;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a extends Observable implements c, IPriority, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_FINISHED = 2;
    public static final int STATE_IDLE = 0;
    public static final int STATE_RUNNING = 1;
    public static final int STATE_TIMEOUT = 3;

    /* renamed from: a  reason: collision with root package name */
    private static final long f13383a;
    private Handler b = new Handler(Looper.getMainLooper());
    private volatile int c = 0;
    private volatile boolean d = false;
    private Runnable e = new Runnable() { // from class: com.taobao.android.litecreator.preload.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.this.g();
            }
        }
    };

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 1;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "";
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "defalut_task";
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-444810077);
        kge.a(-1390502639);
        kge.a(-108472623);
        kge.a(-1891971453);
        f13383a = s.h();
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : f13383a;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.c != 0) {
        } else {
            this.c = 1;
            this.b.postDelayed(this.e, d());
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c != 1) {
        } else {
            this.c = 2;
            this.b.removeCallbacksAndMessages(null);
            setChanged();
            notifyObservers(2);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.c != 1) {
        } else {
            this.c = 3;
            setChanged();
            notifyObservers(3);
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b().equals(((a) obj).b());
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.e);
    }
}

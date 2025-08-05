package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class n0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Timer f3473a;
    public int b;
    public int c;
    public int d = 1000;
    public int e = 1000;
    public b f;

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n0.b(n0.this);
            if (n0.a(n0.this) <= 0) {
                n0.a(n0.this, 0);
                if (n0.c(n0.this) != null) {
                    n0.c(n0.this).cancel();
                    n0.a(n0.this, (Timer) null);
                }
            }
            if (n0.d(n0.this) == null) {
                return;
            }
            n0.d(n0.this).a(n0.a(n0.this));
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);
    }

    public n0(int i) {
        this.b = i;
        this.c = i;
    }

    public static /* synthetic */ int a(n0 n0Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3060103", new Object[]{n0Var})).intValue() : n0Var.c;
    }

    public static /* synthetic */ int b(n0 n0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88476fc4", new Object[]{n0Var})).intValue();
        }
        int i = n0Var.c;
        n0Var.c = i - 1;
        return i;
    }

    public static /* synthetic */ Timer c(n0 n0Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timer) ipChange.ipc$dispatch("8ac5ca7e", new Object[]{n0Var}) : n0Var.f3473a;
    }

    public static /* synthetic */ b d(n0 n0Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f213b70d", new Object[]{n0Var}) : n0Var.f;
    }

    public static /* synthetic */ int a(n0 n0Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdba93e6", new Object[]{n0Var, new Integer(i)})).intValue();
        }
        n0Var.c = i;
        return i;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c = this.b;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int i = this.b;
        this.c = i;
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(i);
        }
        d();
        Timer timer = new Timer();
        this.f3473a = timer;
        timer.schedule(new a(), this.d, this.e);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c = this.b;
        Timer timer = this.f3473a;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.f3473a = null;
    }

    public static /* synthetic */ Timer a(n0 n0Var, Timer timer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("8a42fb98", new Object[]{n0Var, timer});
        }
        n0Var.f3473a = timer;
        return timer;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85f6992", new Object[]{this, bVar});
        } else {
            this.f = bVar;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c == 0;
    }
}

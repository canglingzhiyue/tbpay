package com.taobao.trtc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import tb.kge;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private int c;
    private a e;

    /* renamed from: a  reason: collision with root package name */
    private Timer f23190a = null;
    private TimerTask d = null;

    /* loaded from: classes9.dex */
    public interface a {
        void onTimeOut();
    }

    static {
        kge.a(1694956523);
    }

    public static /* synthetic */ a a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b4e05479", new Object[]{gVar}) : gVar.e;
    }

    public g(boolean z, int i, a aVar) {
        this.b = false;
        this.c = 1000;
        this.e = null;
        this.b = z;
        this.c = i;
        this.e = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        boolean z = this.b;
        if (z) {
            this.f23190a = new Timer("TrtcTimer", z);
        } else {
            this.f23190a = new Timer("TrtcTimer");
        }
        this.d = new TimerTask() { // from class: com.taobao.trtc.utils.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (g.a(g.this) == null) {
                } else {
                    g.a(g.this).onTimeOut();
                }
            }
        };
        if (this.b) {
            Timer timer = this.f23190a;
            TimerTask timerTask = this.d;
            int i = this.c;
            timer.schedule(timerTask, i, i);
            return;
        }
        this.f23190a.schedule(this.d, this.c);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Timer timer = this.f23190a;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.f23190a = null;
    }
}

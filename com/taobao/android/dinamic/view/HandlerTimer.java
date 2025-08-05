package com.taobao.android.dinamic.view;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class HandlerTimer implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f11771a;
    public TimerStatus b;
    private Handler c;
    private Runnable d;

    /* loaded from: classes5.dex */
    public enum TimerStatus {
        Waiting(0, "待启动"),
        Running(1, "运行中"),
        Paused(-1, "暂停"),
        Stopped(-2, "停止");
        
        private int code;
        private String desc;

        TimerStatus(int i, String str) {
            this.code = i;
            this.desc = str;
        }

        public int getCode() {
            return this.code;
        }

        public String getDesc() {
            return this.desc;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setDesc(String str) {
            this.desc = str;
        }
    }

    static {
        kge.a(-991560142);
        kge.a(-1390502639);
    }

    public HandlerTimer(Runnable runnable) {
        this(1000L, runnable);
    }

    public HandlerTimer(long j, Runnable runnable) {
        this(j, runnable, new Handler(Looper.getMainLooper()));
    }

    public HandlerTimer(long j, Runnable runnable, Handler handler) {
        this.f11771a = j;
        this.d = runnable;
        this.c = handler;
        this.b = TimerStatus.Waiting;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.b == TimerStatus.Waiting || this.b == TimerStatus.Paused || this.b == TimerStatus.Stopped) {
        } else {
            this.d.run();
            this.c.removeCallbacks(this);
            this.c.postDelayed(this, this.f11771a);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.removeCallbacks(this);
        this.b = TimerStatus.Running;
        this.c.postDelayed(this, this.f11771a);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.c.removeCallbacks(this);
        this.b = TimerStatus.Running;
        this.c.postDelayed(this, j);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = TimerStatus.Stopped;
        this.c.removeCallbacksAndMessages(null);
    }
}

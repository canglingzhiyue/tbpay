package com.taobao.uikit.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class HandlerTimer implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler handler;
    private long interval;
    private TimerStatus status;
    private Runnable task;

    /* loaded from: classes9.dex */
    enum TimerStatus {
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
        kge.a(869053305);
        kge.a(-1390502639);
    }

    public HandlerTimer(Runnable runnable) {
        this(1000L, runnable);
    }

    public HandlerTimer(long j, Runnable runnable) {
        this(j, runnable, new Handler(Looper.getMainLooper()));
    }

    public HandlerTimer(long j, Runnable runnable, Handler handler) {
        if (handler == null || runnable == null) {
            throw new NullPointerException("handler or task must not be null");
        }
        this.interval = j;
        this.task = runnable;
        this.handler = handler;
        this.status = TimerStatus.Waiting;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.handler == null || this.status == TimerStatus.Waiting || this.status == TimerStatus.Paused || this.status == TimerStatus.Stopped) {
        } else {
            this.task.run();
            this.handler.postDelayed(this, this.interval);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.handler == null || this.status == TimerStatus.Running) {
        } else {
            this.handler.removeCallbacks(this);
            this.status = TimerStatus.Running;
            this.handler.postDelayed(this, this.interval);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.status = TimerStatus.Paused;
        Handler handler = this.handler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this);
    }

    public void restart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
            return;
        }
        Handler handler = this.handler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this);
        this.status = TimerStatus.Running;
        this.handler.postDelayed(this, this.interval);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.handler == null) {
        } else {
            this.status = TimerStatus.Stopped;
            this.handler.removeCallbacks(this);
            this.handler = null;
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.handler == null) {
        } else {
            this.status = TimerStatus.Stopped;
            this.handler.removeCallbacks(this);
        }
    }
}

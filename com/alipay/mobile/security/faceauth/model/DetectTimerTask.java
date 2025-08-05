package com.alipay.mobile.security.faceauth.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class DetectTimerTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Timer f5838a;
    public int b;
    public int c;
    public int d;
    public TimerListener e;
    public Object f;
    private int g;

    /* loaded from: classes3.dex */
    public interface TimerListener {
        void countdown(int i);
    }

    public DetectTimerTask(int i) {
        this.f5838a = null;
        this.g = 30000;
        this.b = 30000;
        this.c = 1000;
        this.d = 1000;
        this.f = new Object();
        this.g = i;
        this.b = i;
    }

    public DetectTimerTask(int i, int i2, int i3) {
        this.f5838a = null;
        this.g = 30000;
        this.b = 30000;
        this.c = 1000;
        this.d = 1000;
        this.f = new Object();
        this.g = i;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public void setTimerTaskListener(TimerListener timerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37ed399", new Object[]{this, timerListener});
            return;
        }
        synchronized (this.f) {
            this.e = timerListener;
        }
    }

    public int getLeftTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a5a4864", new Object[]{this})).intValue() : this.b;
    }

    public int getInitTimeTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("229d4b5a", new Object[]{this})).intValue() : this.g;
    }

    public boolean isTimeOut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93da6dc2", new Object[]{this})).booleanValue() : this.b == 0;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.b = this.g;
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.b = this.g;
        TimerListener timerListener = this.e;
        if (timerListener != null) {
            timerListener.countdown(this.b);
        }
        stop();
        this.f5838a = new Timer();
        this.f5838a.schedule(new TimerTask() { // from class: com.alipay.mobile.security.faceauth.model.DetectTimerTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DetectTimerTask.this.b -= DetectTimerTask.this.d;
                if (DetectTimerTask.this.b <= 0) {
                    DetectTimerTask detectTimerTask = DetectTimerTask.this;
                    detectTimerTask.b = 0;
                    detectTimerTask.f5838a.cancel();
                }
                synchronized (DetectTimerTask.this.f) {
                    if (DetectTimerTask.this.e != null) {
                        DetectTimerTask.this.e.countdown(DetectTimerTask.this.b);
                    }
                }
            }
        }, this.c, this.d);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.b = this.g;
        Timer timer = this.f5838a;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.f5838a = null;
    }
}

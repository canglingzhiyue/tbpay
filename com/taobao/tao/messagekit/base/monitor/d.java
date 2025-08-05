package com.taobao.tao.messagekit.base.monitor;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REPORT_IGNORE = 0;
    public static final int REPORT_IMMEDIATELY = -1;

    /* renamed from: a  reason: collision with root package name */
    public long f20761a = 0;
    private Handler b = new Handler(Looper.getMainLooper());
    private Runnable c;

    static {
        kge.a(739085231);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
        }
        this.f20761a = 0L;
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb04066", new Object[]{dVar});
        } else {
            dVar.a();
        }
    }

    public synchronized boolean a(long j, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d73bde", new Object[]{this, new Long(j), runnable})).booleanValue();
        } else if (0 == j) {
            return false;
        } else {
            if (-1 == j) {
                if (runnable != null) {
                    runnable.run();
                }
                a();
                return true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis + j;
            if (this.f20761a > 0 && currentTimeMillis < this.f20761a && this.f20761a < j2) {
                return false;
            }
            a();
            Handler handler = this.b;
            Runnable runnable2 = new Runnable() { // from class: com.taobao.tao.messagekit.base.monitor.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Runnable runnable3 = runnable;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    d.a(d.this);
                }
            };
            this.c = runnable2;
            handler.postDelayed(runnable2, j);
            this.f20761a = j2;
            return true;
        }
    }
}

package com.alipay.mobile.security.bio.thread;

import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class WatchThread extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ThreadGroup tg = new ThreadGroup("watch-thread");

    /* renamed from: a  reason: collision with root package name */
    private boolean f5822a;
    private String b;

    public abstract void a();

    public WatchThread(String str) {
        super(tg, str);
        this.f5822a = true;
        this.b = null;
        setDaemon(true);
    }

    public void kill() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdee0e5", new Object[]{this});
        } else {
            this.f5822a = false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (this.f5822a) {
            try {
                a();
            } catch (Exception e) {
                BioLog.e(e);
            } catch (Throwable th) {
                BioLog.e(th);
            }
        }
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71829d11", new Object[]{this}) : this.b;
    }
}

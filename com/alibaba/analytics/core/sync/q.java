package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import tb.apr;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class q implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSGTYPE_INTERVAL = "i";
    public static final String MSGTYPE_REALTIME = "r";
    private static BlockingQueue<String> b;
    private static q c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2113a = false;

    static {
        kge.a(-821121194);
        kge.a(-1390502639);
        b = new LinkedBlockingQueue();
        c = new q();
    }

    public static q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("165efa96", new Object[0]) : c;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!this.f2113a) {
            this.f2113a = true;
            aqe.a().a(null, a(), 0L);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (this.f2113a) {
            try {
                String take = b.take();
                apr.b("", "take queueCache size", Integer.valueOf(b.size()));
                if (MSGTYPE_INTERVAL.equals(take)) {
                    o.b().c();
                } else if ("r".equals(take)) {
                    n.b().c();
                }
            } catch (Throwable th) {
                apr.b("", th);
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (b.contains(str)) {
            apr.b("", "queueCache contains", str);
        } else {
            try {
                b.put(str);
                apr.b("", "queueCache put", str, "queueCache size", Integer.valueOf(b.size()));
            } catch (Exception e) {
                apr.b("", e);
            }
        }
    }
}

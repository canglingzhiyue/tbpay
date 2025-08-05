package com.taobao.tao.messagekit.base.monitor.monitorthread;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import tb.kge;
import tb.oma;

/* loaded from: classes8.dex */
public class a extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f20765a;
    public MonitorTaskExecutor b;
    private volatile boolean c;
    private volatile boolean d;

    /* renamed from: com.taobao.tao.messagekit.base.monitor.monitorthread.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0871a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f20766a;

        static {
            kge.a(-71286091);
            f20766a = new a(a.f20765a);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c7341a5a", new Object[0]) : f20766a;
        }
    }

    static {
        kge.a(1980538338);
        f20765a = "MonitorThreadPool";
    }

    private a(String str) {
        this.b = null;
        setName(str);
        this.b = new MonitorTaskExecutor();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c7341a5a", new Object[0]) : C0871a.a();
    }

    public void a(oma omaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5373bf", new Object[]{this, omaVar, new Boolean(z)});
        } else {
            a(omaVar, z, false);
        }
    }

    public void a(oma omaVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1bb6f5", new Object[]{this, omaVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        String str = f20765a;
        Object[] objArr = new Object[2];
        objArr[0] = "putMessageTask, type=";
        objArr[1] = omaVar == null ? null : Integer.valueOf(omaVar.b());
        MsgLog.a(str, objArr);
        if (omaVar == null) {
            return;
        }
        if (!z2 && (this.c || b())) {
            return;
        }
        try {
            if (z) {
                this.b.a(omaVar);
            } else {
                this.b.b(omaVar);
            }
        } catch (InterruptedException e) {
            MsgLog.c(f20765a, e, "putMessageTask error: ");
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        MsgLog.b(f20765a, "run start");
        try {
            try {
                this.b.a();
                MsgLog.b(f20765a, "arriveMonitor is terminated");
                this.d = true;
            } catch (InterruptedException unused) {
                MsgLog.c(f20765a, "tasksToExecute take error");
                MsgLog.b(f20765a, "arriveMonitor is terminated");
                this.d = true;
            }
        } catch (Throwable th) {
            MsgLog.b(f20765a, "arriveMonitor is terminated");
            this.d = true;
            throw th;
        }
    }
}

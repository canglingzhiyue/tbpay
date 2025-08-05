package com.taobao.common.inspector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcLog;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.kgj;
import tb.mto;

/* loaded from: classes7.dex */
public class DeviceInspector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f16926a;
    private kgj c;
    private boolean d;
    private ScheduledFuture<?> e;
    private volatile Intent f;
    private volatile Debug.MemoryInfo g;
    private long i;
    private long j;
    private final c l;
    private final BroadcastReceiver b = new ReceiverImpl();
    private volatile double h = mto.a.GEO_NOT_SUPPORT;
    private volatile int m = 0;
    private boolean n = false;
    private int k = Runtime.getRuntime().availableProcessors();

    static {
        kge.a(-1062162152);
    }

    public static /* synthetic */ void lambda$lx5lo7L85tWwJMj5hSThZv6PWdw(DeviceInspector deviceInspector) {
        deviceInspector.g();
    }

    public static /* synthetic */ void a(DeviceInspector deviceInspector, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccb537e", new Object[]{deviceInspector, intent});
        } else {
            deviceInspector.a(intent);
        }
    }

    public DeviceInspector(Context context, c cVar) {
        this.f16926a = context;
        this.l = cVar;
    }

    public kgj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgj) ipChange.ipc$dispatch("f06d850", new Object[]{this});
        }
        if (this.c == null) {
            try {
                this.c = f();
            } catch (Throwable th) {
                ArtcLog.e("DeviceInspector", "", th, new Object[0]);
            }
        }
        return this.c;
    }

    public Intent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("ee89e30a", new Object[]{this}) : this.f;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.m;
    }

    public double d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2d9", new Object[]{this})).doubleValue() : this.h;
    }

    public synchronized void a(ScheduledExecutorService scheduledExecutorService, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfcb5f8", new Object[]{this, scheduledExecutorService, new Long(j)});
        } else if (this.d) {
        } else {
            this.f16926a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (scheduledExecutorService != null) {
                try {
                    this.i = b.a();
                } catch (Exception unused) {
                    this.i = 0L;
                }
                this.j = SystemClock.elapsedRealtime();
                this.e = scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.taobao.common.inspector.-$$Lambda$DeviceInspector$lx5lo7L85tWwJMj5hSThZv6PWdw
                    {
                        DeviceInspector.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceInspector.lambda$lx5lo7L85tWwJMj5hSThZv6PWdw(DeviceInspector.this);
                    }
                }, j, j, TimeUnit.MILLISECONDS);
            }
            this.d = true;
        }
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.f16926a.unregisterReceiver(this.b);
            this.f = null;
            if (this.e != null) {
                this.e.cancel(false);
                this.e = null;
            }
            this.d = false;
        }
    }

    private kgj f() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgj) ipChange.ipc$dispatch("357f132b", new Object[]{this});
        }
        kgj kgjVar = new kgj();
        String a2 = SystemProperties.a("ro.board.platform");
        if (a2 != null) {
            kgjVar.b = new String[]{a2};
        }
        b.a(kgjVar);
        c cVar = this.l;
        if (cVar != null) {
            kgjVar.f30053a = cVar.a(kgjVar);
        }
        return kgjVar;
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else {
            this.f = intent;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (!this.n) {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            this.g = memoryInfo;
            if (this.g != null) {
                this.m = this.g.getTotalPss();
            }
            this.n = true;
        } else {
            this.n = false;
        }
        long j = this.i;
        long j2 = this.j;
        try {
            this.i = b.a();
        } catch (Exception unused) {
        }
        this.j = SystemClock.elapsedRealtime();
        this.h = (((this.i - j) * 1.0d) / (this.j - j2)) / this.k;
    }

    /* loaded from: classes7.dex */
    public class ReceiverImpl extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-910932773);
        }

        public ReceiverImpl() {
            DeviceInspector.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            char c = 65535;
            if (action.hashCode() == -1538406691 && action.equals("android.intent.action.BATTERY_CHANGED")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            DeviceInspector.a(DeviceInspector.this, intent);
        }
    }
}

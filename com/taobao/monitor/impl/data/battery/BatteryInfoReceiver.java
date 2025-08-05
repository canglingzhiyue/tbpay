package com.taobao.monitor.impl.data.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.util.h;
import tb.mnd;
import tb.mpi;
import tb.orq;

/* loaded from: classes7.dex */
public class BatteryInfoReceiver extends BroadcastReceiver implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f18157a = false;
    private final Context b;
    private d c;
    private c d;

    public static /* synthetic */ Object ipc$super(BatteryInfoReceiver batteryInfoReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(BatteryInfoReceiver batteryInfoReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5c0f20e5", new Object[]{batteryInfoReceiver}) : batteryInfoReceiver.b;
    }

    public BatteryInfoReceiver(Context context) {
        this.b = context;
        m a2 = f.a(com.taobao.monitor.impl.common.a.BATTERY_DISPATCHER);
        if (a2 instanceof d) {
            this.c = (d) a2;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f18157a) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            final Intent registerReceiver = this.b.registerReceiver(this, intentFilter, null, e.a().d());
            if (registerReceiver != null) {
                e.a().d().post(new Runnable() { // from class: com.taobao.monitor.impl.data.battery.BatteryInfoReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BatteryInfoReceiver batteryInfoReceiver = BatteryInfoReceiver.this;
                        batteryInfoReceiver.onReceive(BatteryInfoReceiver.a(batteryInfoReceiver), registerReceiver);
                    }
                });
            }
            this.f18157a = true;
            mpi.c("BatteryInfoReceiver", "BatteryInfoReceiver registerReceiver");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Intent a2 = com.taobao.monitor.impl.util.a.a(this.b);
        if (a2 == null) {
            return;
        }
        onReceive(this.b, a2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        Handler d = e.a().d();
        d.removeCallbacks(this);
        d.postDelayed(this, orq.FRAME_CHECK_TIMEOUT);
        if (TextUtils.isEmpty(intent.getAction())) {
            return;
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -2128145023) {
            if (action.equals("android.intent.action.SCREEN_OFF")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1538406691) {
            if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            int intExtra = intent.getIntExtra("temperature", -1);
            int intExtra2 = intent.getIntExtra("level", 0);
            int intExtra3 = intent.getIntExtra("scale", 100);
            int intExtra4 = intent.getIntExtra("plugged", 0);
            int i = (intExtra2 * 100) / intExtra3;
            mpi.c("BatteryInfoReceiver", "temperature", Integer.valueOf(intExtra), "level", Integer.valueOf(intExtra2), "scale", Integer.valueOf(intExtra3), "plugged", Integer.valueOf(intExtra4), "health", Integer.valueOf(intent.getIntExtra("health", 1)), "status", Integer.valueOf(intent.getIntExtra("status", 1)), "voltage", Integer.valueOf(intent.getIntExtra("voltage", 0)));
            d dVar = this.c;
            if (dVar != null) {
                dVar.a(intExtra / 10.0f, intExtra4, i);
            }
            a(intExtra / 10.0f);
        } else if (c == 1) {
            mpi.c("BatteryInfoReceiver", "Detect screen on.");
            d dVar2 = this.c;
            if (dVar2 == null) {
                return;
            }
            dVar2.a("android.intent.action.SCREEN_ON");
        } else if (c != 2) {
        } else {
            mpi.c("BatteryInfoReceiver", "Detect screen off.");
            d dVar3 = this.c;
            if (dVar3 == null) {
                return;
            }
            dVar3.a("android.intent.action.SCREEN_OFF");
        }
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        if (this.d == null && f >= 45.0f) {
            this.d = new c(false, "highTemperature");
            this.d.a();
        }
        c cVar = this.d;
        String str = "bg";
        if (cVar != null && f < 40.0f) {
            cVar.a(mnd.b ? str : "fg");
            this.d = null;
        }
        if (this.d == null || h.a() - this.d.b() <= 60000) {
            return;
        }
        c cVar2 = this.d;
        if (!mnd.b) {
            str = "fg";
        }
        cVar2.a(str);
    }
}

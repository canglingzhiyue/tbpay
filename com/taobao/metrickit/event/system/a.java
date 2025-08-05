package com.taobao.metrickit.event.system;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes7.dex */
public class a extends com.taobao.metrickit.event.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Handler f18086a;
    private Application b;
    private boolean c;
    private final BroadcastReceiver d;

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : com.taobao.metrickit.context.c.SWITCH_POWER_CONNECT_EVENT;
    }

    public static /* synthetic */ void a(a aVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d26729", new Object[]{aVar, new Integer(i), map});
        } else {
            aVar.a(i, map);
        }
    }

    public static /* synthetic */ void b(a aVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebf7e48", new Object[]{aVar, new Integer(i), map});
        } else {
            aVar.a(i, map);
        }
    }

    public a(Handler handler) {
        super(handler);
        this.c = false;
        this.d = new BroadcastReceiver() { // from class: com.taobao.metrickit.event.system.PowerConnectEventSource$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != -1886648615) {
                    if (hashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 0;
                    }
                } else if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 1;
                }
                if (c == 0) {
                    a.a(a.this, 90, Collections.emptyMap());
                } else if (c != 1) {
                } else {
                    a.b(a.this, 91, Collections.emptyMap());
                }
            }
        };
        this.f18086a = handler;
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{90, 91};
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            metricContext.getApplication().registerReceiver(this.d, intentFilter, null, this.f18086a);
            a(metricContext.isCharging() ? 90 : 91, Collections.emptyMap());
            this.c = true;
            this.b = metricContext.getApplication();
        } catch (Exception e) {
            TLog.loge("MetricKit.SysBatteryEventSource", "register error", e);
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.c) {
        } else {
            this.c = false;
            this.b.unregisterReceiver(this.d);
        }
    }
}

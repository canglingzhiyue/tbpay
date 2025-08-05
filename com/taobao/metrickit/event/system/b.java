package com.taobao.metrickit.event.system;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.Collections;

/* loaded from: classes7.dex */
public class b extends com.taobao.metrickit.event.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MetricKit.PowerSaveModeEventSource";

    /* renamed from: a */
    private Application f18087a;
    private boolean b;
    private final BroadcastReceiver c;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : com.taobao.metrickit.context.c.SWITCH_POWER_SAVE_MODE_EVENT;
    }

    public static /* synthetic */ Application a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5ad51935", new Object[]{bVar}) : bVar.f18087a;
    }

    public static /* synthetic */ void a(b bVar, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a766e39", new Object[]{bVar, application});
        } else {
            bVar.a(application);
        }
    }

    public b(Handler handler) {
        super(handler);
        this.b = false;
        this.c = new BroadcastReceiver() { // from class: com.taobao.metrickit.event.system.PowerSaveModeEventSource$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                b bVar = b.this;
                b.a(bVar, b.a(bVar));
            }
        };
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{92, 93};
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
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            metricContext.getApplication().registerReceiver(this.c, intentFilter, null, metricContext.getDefaultInnerHandler());
            this.b = true;
            this.f18087a = metricContext.getApplication();
            a(metricContext.getApplication());
        } catch (Exception e) {
            TLog.loge(TAG, "register error", e);
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Application application = this.f18087a;
        if (application == null || !this.b) {
            return;
        }
        application.unregisterReceiver(this.c);
        this.b = false;
    }

    private void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        try {
            if (((PowerManager) application.getSystemService("power")).isPowerSaveMode()) {
                a(92, Collections.emptyMap());
            } else {
                a(93, Collections.emptyMap());
            }
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge(TAG, "makeDispatch error", e);
        }
    }
}

package com.alibaba.analytics.core.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.any;
import tb.apr;
import tb.aqc;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class UTClientConfigMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static UTClientConfigMgr f2050a;
    private boolean d = false;
    private Map<String, String> b = Collections.synchronizedMap(new HashMap());
    private Map<String, List<a>> c = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes.dex */
    public interface a {
        String getKey();

        void onChange(String str);
    }

    public static /* synthetic */ void a(UTClientConfigMgr uTClientConfigMgr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d94da8", new Object[]{uTClientConfigMgr, str, str2});
        } else {
            uTClientConfigMgr.a(str, str2);
        }
    }

    static {
        kge.a(1224762661);
        f2050a = null;
    }

    private UTClientConfigMgr() {
    }

    public static UTClientConfigMgr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTClientConfigMgr) ipChange.ipc$dispatch("dce7d914", new Object[0]);
        }
        if (f2050a == null) {
            synchronized (UTClientConfigMgr.class) {
                if (f2050a == null) {
                    f2050a = new UTClientConfigMgr();
                }
            }
        }
        return f2050a;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d) {
        } else {
            Context e = any.d().e();
            if (e == null) {
                return;
            }
            a(e, new ConfigReceiver(), new IntentFilter("com.alibaba.analytics.config.change"));
            this.d = true;
            apr.b("UTClientConfigMgr", "registerReceiver");
        }
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("22a8ab87", new Object[]{context, broadcastReceiver, intentFilter});
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public synchronized void a(a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66db75b7", new Object[]{this, aVar});
            return;
        }
        if (aVar != null && !aqc.e(aVar.getKey())) {
            String key = aVar.getKey();
            if (this.b.containsKey(key)) {
                aVar.onChange(this.b.get(key));
            }
            if (this.c.get(key) == null) {
                list = new ArrayList<>();
            } else {
                list = this.c.get(key);
            }
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
            this.c.put(key, list);
        }
    }

    /* loaded from: classes.dex */
    public class ConfigReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(924268752);
        }

        public ConfigReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                aqe.a().a(new Runnable() { // from class: com.alibaba.analytics.core.config.UTClientConfigMgr.ConfigReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            String packageName = context.getPackageName();
                            if (TextUtils.isEmpty(packageName)) {
                                return;
                            }
                            String str = intent.getPackage();
                            if (!TextUtils.isEmpty(str) && packageName.equalsIgnoreCase(str)) {
                                UTClientConfigMgr.a(UTClientConfigMgr.this, intent.getStringExtra("key"), intent.getStringExtra("value"));
                            }
                        } catch (Throwable th) {
                            apr.b("UTClientConfigMgr", th, new Object[0]);
                        }
                    }
                });
            }
        }
    }

    private synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        apr.b("UTClientConfigMgr", "dispatchConfig key", str, "value", str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(str, str2);
        List<a> list = this.c.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).onChange(str2);
            }
        }
    }
}

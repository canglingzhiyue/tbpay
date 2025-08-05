package com.taobao.zcache.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.zcache.n;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static BroadcastReceiver f23639a;
    private static a b;

    /* loaded from: classes9.dex */
    public interface a {
        void a(int i);
    }

    public static /* synthetic */ a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b8ac6b38", new Object[0]) : b;
    }

    static {
        kge.a(1668856287);
        f23639a = null;
        b = null;
    }

    public static int a() {
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        Context a2 = n.a();
        ConnectivityManager connectivityManager = (ConnectivityManager) a2.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo networkInfo = null;
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
        }
        if (networkInfo == null || !networkInfo.isAvailable()) {
            return 0;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo2 != null && (state = networkInfo2.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return 1;
        }
        TelephonyManager telephonyManager = (TelephonyManager) a2.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                i = telephonyManager.getDataNetworkType();
            } catch (SecurityException unused2) {
            }
        } else {
            i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
        }
        return (i == 1 || i == 2 || i == 4 || i == 7 || i == 11 || i == 16) ? 2 : 3;
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74899d3", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            if (f23639a == null) {
                try {
                    f23639a = new BroadcastReceiver() { // from class: com.taobao.zcache.core.NetworkUtils$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else if (c.b() == null) {
                            } else {
                                e.a(new Runnable() { // from class: com.taobao.zcache.core.NetworkUtils$1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            c.b().a(c.a());
                                        }
                                    }
                                });
                            }
                        }
                    };
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    n.a().getApplicationContext().registerReceiver(f23639a, intentFilter);
                } catch (Throwable th) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "ZCache/Setup").a("networkListener").a(101, th.getLocalizedMessage()).a();
                }
            }
            b = aVar;
        }
    }
}

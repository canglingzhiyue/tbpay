package com.taobao.downloader.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.net.ConnectivityManagerCompat;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.Serializable;
import tb.kmv;

/* loaded from: classes7.dex */
public class NetworkManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static NetworkManager f17079a;
    private a b = new a();
    private BroadcastReceiver c;
    private Context d;
    private NetChangeListener e;

    /* loaded from: classes7.dex */
    public interface NetChangeListener extends Serializable {
        void onChange(a aVar);
    }

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17081a;
        public int b;
    }

    public static /* synthetic */ a a(NetworkManager networkManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("232af7b1", new Object[]{networkManager}) : networkManager.b;
    }

    public static /* synthetic */ void b(NetworkManager networkManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd12cf0", new Object[]{networkManager});
        } else {
            networkManager.b();
        }
    }

    public static /* synthetic */ NetChangeListener c(NetworkManager networkManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetChangeListener) ipChange.ipc$dispatch("f891baef", new Object[]{networkManager}) : networkManager.e;
    }

    public static NetworkManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkManager) ipChange.ipc$dispatch("a50153fd", new Object[]{context});
        }
        if (f17079a == null && context != null) {
            f17079a = new NetworkManager(context);
        }
        return f17079a;
    }

    public void a(NetChangeListener netChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6927692", new Object[]{this, netChangeListener});
        } else {
            this.e = netChangeListener;
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3a310558", new Object[]{this}) : this.b;
    }

    private NetworkManager(Context context) {
        this.d = context;
        b();
        com.taobao.downloader.a.p = this.b.f17081a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.c = new BroadcastReceiver() { // from class: com.taobao.downloader.manager.NetworkManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                int i = NetworkManager.a(NetworkManager.this).f17081a;
                NetworkManager.b(NetworkManager.this);
                com.taobao.downloader.a.p = NetworkManager.a(NetworkManager.this).f17081a;
                if (i == NetworkManager.a(NetworkManager.this).f17081a) {
                    kmv.a("NetworkManager", "network status is not changed", "netType", Integer.valueOf(i));
                } else if (NetworkManager.c(NetworkManager.this) == null) {
                } else {
                    NetworkManager.c(NetworkManager.this).onChange(NetworkManager.a(NetworkManager.this));
                }
            }
        };
        try {
            context.registerReceiver(this.c, intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.d.getSystemService("connectivity");
            if (connectivityManager == null) {
                c();
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                c();
            } else if (activeNetworkInfo.getType() == 1) {
                if (a(connectivityManager)) {
                    this.b.f17081a = 1;
                } else {
                    this.b.f17081a = 4;
                }
                this.b.b = 0;
            } else {
                this.b.f17081a = 2;
                this.b.b = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) this.d.getSystemService("phone"));
            }
        } catch (Throwable unused) {
            c();
        }
    }

    private boolean a(ConnectivityManager connectivityManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9dbef19", new Object[]{this, connectivityManager})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                return connectivityManager.isActiveNetworkMetered();
            }
            return ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
        } catch (Throwable unused) {
            return false;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a aVar = this.b;
        aVar.f17081a = 0;
        aVar.b = 0;
    }
}

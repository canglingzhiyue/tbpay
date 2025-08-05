package com.alibaba.analytics.core.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aob;
import tb.apr;
import tb.aqe;
import tb.aqf;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK_CLASS_2_3_G = "2G/3G";
    public static final String NETWORK_CLASS_2_G = "2G";
    public static final String NETWORK_CLASS_3_G = "3G";
    public static final String NETWORK_CLASS_4_G = "4G";
    public static final String NETWORK_CLASS_5_G = "5G";
    public static final String NETWORK_CLASS_UNKNOWN = "Unknown";
    public static final String NETWORK_CLASS_WIFI = "Wi-Fi";

    /* renamed from: a  reason: collision with root package name */
    private static String[] f2090a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static NetworkStatusReceiver e;
    private static a f;

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i == 20) {
            return "4G";
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    public static /* synthetic */ a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d45002d6", new Object[0]) : f;
    }

    public static /* synthetic */ void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f6cf7", new Object[]{context});
        } else {
            k(context);
        }
    }

    static {
        kge.a(-1453271639);
        f2090a = new String[]{"Unknown", "Unknown"};
        b = false;
        c = false;
        d = false;
        e = new NetworkStatusReceiver();
        f = new a();
    }

    public static String a() {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        Context k = aob.a().k();
        if (k == null) {
            return "Unknown";
        }
        try {
            if (k.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", k.getPackageName()) == 0 && (activeNetworkInfo = ((ConnectivityManager) k.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "Wi-Fi";
                }
                if (activeNetworkInfo.getType() == 0) {
                    return a(activeNetworkInfo.getSubtype());
                }
            }
        } catch (Throwable unused) {
        }
        return "Unknown";
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        return false;
                    }
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static String[] b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6f4b820e", new Object[]{context});
        }
        if (!b) {
            k(context);
        }
        return f2090a;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        try {
            return b(context)[0];
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static String d(Context context) {
        String[] b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        try {
            b2 = b(context);
        } catch (Exception unused) {
        }
        if (b2[0].equals(NETWORK_CLASS_2_3_G)) {
            return b2[1];
        }
        return b2[1].equals("5G") ? "5G" : "Unknown";
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                String str = b(context)[0];
                if (str.equals("2G") || str.equals("3G") || str.equals("4G") || str.equals(NETWORK_CLASS_2_3_G)) {
                    apr.b("NetworkUtil", "isMobile");
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                if (b(context)[0].equals("Wi-Fi")) {
                    apr.b("NetworkUtil", "isWifi");
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
        } else if (context == null) {
        } else {
            context.registerReceiver(e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            try {
                com.alibaba.analytics.core.network.a.a(context);
            } catch (Exception unused) {
            }
            aqe.a().a(f.a(context));
        }
    }

    public static void h(Context context) {
        NetworkStatusReceiver networkStatusReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{context});
        } else if (context == null || (networkStatusReceiver = e) == null) {
        } else {
            context.unregisterReceiver(networkStatusReceiver);
        }
    }

    /* loaded from: classes.dex */
    public static class NetworkStatusReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(359045364);
        }

        private NetworkStatusReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                aqe.a().a(NetworkUtil.b().a(context));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f2091a;

        static {
            kge.a(562293744);
            kge.a(-1390502639);
        }

        private a() {
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("23255b3f", new Object[]{this, context});
            }
            this.f2091a = context;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = this.f2091a;
            if (context == null) {
                return;
            }
            NetworkUtil.j(context);
            com.alibaba.analytics.core.network.a.b(this.f2091a);
            aqf.a(this.f2091a);
        }
    }

    private static synchronized void k(Context context) {
        synchronized (NetworkUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4dc1896", new Object[]{context});
            } else if (context == null) {
            } else {
                try {
                } catch (Exception e2) {
                    apr.b("NetworkUtil", e2);
                }
                if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
                    f2090a[0] = "Unknown";
                    f2090a[1] = "Unknown";
                    return;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    f2090a[0] = "Unknown";
                    f2090a[1] = "Unknown";
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (1 == activeNetworkInfo.getType()) {
                        f2090a[0] = "Wi-Fi";
                        f2090a[1] = "Unknown";
                    } else if (activeNetworkInfo.getType() == 0) {
                        f2090a[0] = NETWORK_CLASS_2_3_G;
                        f2090a[1] = activeNetworkInfo.getSubtypeName();
                    }
                } else {
                    f2090a[0] = "Unknown";
                    f2090a[1] = "Unknown";
                }
                if (!b) {
                    b = true;
                }
            }
        }
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        if (c) {
            return d;
        }
        try {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (Build.VERSION.SDK_INT >= 21) {
                    d = wifiManager.is5GHzBandSupported();
                } else {
                    d = false;
                }
                return d;
            } catch (Throwable unused) {
                return d;
            }
        } finally {
            c = true;
        }
    }
}

package com.taobao.taobaoavsdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.strategy.HttpDnsAdapter;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ddf;
import tb.kge;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NET_2G = "2G";
    public static final String NET_3G = "3G";
    public static final String NET_4G = "4G";
    public static final String NET_5G = "5G";
    public static final String NET_WIFI = "WIFI";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Long> f21347a;
    private static final Map<String, String> b;
    private static final Map<String, String> c;

    static {
        kge.a(-1774844952);
        f21347a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
    }

    public static boolean a(String str) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            host = Uri.parse(str).getHost();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        if (!b.containsKey(host)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils no local cached IP , host is :" + host);
            return false;
        } else if (f21347a.containsKey(host)) {
            long longValue = f21347a.get(host).longValue();
            if (System.currentTimeMillis() - longValue >= 300000) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils has cached IP , host is :" + host + ",but is time out " + String.valueOf(System.currentTimeMillis() - longValue));
                return false;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils has cached IP , host is :" + host);
            return true;
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils has cached IP, but no cached time , host is :" + host);
            return false;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host) && b.containsKey(host)) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils has got cached IP , host is :" + host + " IP is " + b.get(host));
                return b.get(host);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            String host = Uri.parse(str).getHost();
            if (TextUtils.isEmpty(host)) {
                return;
            }
            b.put(host, str2);
            f21347a.put(host, Long.valueOf(System.currentTimeMillis()));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils  cached IP , host is :" + host + " IP is " + str2);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        try {
            String host = Uri.parse(str).getHost();
            if (TextUtils.isEmpty(host)) {
                return;
            }
            c.put(host, str2);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils  cached IP list , host is :" + host + " IP list  is " + str2);
        } catch (Throwable unused) {
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host) && c.containsKey(host)) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils has got cached IP List , host is :" + host + " IPlist is " + c.get(host));
                return c.get(host);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        b.clear();
        f21347a.clear();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils clear cached IP by network changed");
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        try {
            return NetworkQualityMonitor.getGlobalNetworkQuality();
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils getGlobalNetworkQuality error:" + th.getMessage());
            return 0;
        }
    }

    public static double d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2d9", new Object[0])).doubleValue();
        }
        try {
            return NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth();
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils getGlobalCurrentBandWidth error:" + th.getMessage());
            return -1.0d;
        }
    }

    public static double e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5a", new Object[0])).doubleValue();
        }
        try {
            return NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth();
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TBAVNetworkUtils getGlobalPredictBandWidth error:" + th.getMessage());
            return -1.0d;
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            return (int) BandWidthSampler.getInstance().getNetSpeedValue();
        } catch (Throwable th) {
            c.b(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, " TBAVNetworkUtils getNetSpeedValue error:" + th.getMessage());
            return Integer.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(ddf ddfVar, Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb0dec8a", new Object[]{ddfVar, context});
        }
        if (ddfVar != null && !TextUtils.isEmpty(ddfVar.getNetworkStutas())) {
            return ddfVar.getNetworkStutas();
        }
        if (context == null || context.getApplicationContext() == null || (activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        switch (activeNetworkInfo.getSubtype()) {
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
                break;
            case 13:
                return "4G";
            default:
                if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                    return subtypeName;
                }
                break;
        }
        return "3G";
    }

    public static boolean b(ddf ddfVar, Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe76b79", new Object[]{ddfVar, context})).booleanValue();
        }
        if (ddfVar != null && !TextUtils.isEmpty(ddfVar.getNetworkStutas())) {
            return ddfVar.isConnected();
        }
        Context applicationContext = context.getApplicationContext();
        return (applicationContext == null || (activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static ArrayList<String> a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a0e98bbc", new Object[]{str, new Boolean(z)});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Iterator<HttpDnsAdapter.HttpDnsOrigin> it = c(parse).iterator();
        while (it.hasNext()) {
            HttpDnsAdapter.HttpDnsOrigin next = it.next();
            if (next != null && !TextUtils.isEmpty(next.getOriginIP()) && (!startsWith || TextUtils.isEmpty(parse.getScheme()) || parse.getScheme().equals(next.getOriginProtocol()))) {
                String originIP = next.getOriginIP();
                if (z || !originIP.contains(":")) {
                    if (hashSet.add(originIP)) {
                        arrayList.add(originIP);
                    }
                }
            }
        }
        return arrayList;
    }

    public static HttpDnsAdapter.HttpDnsOrigin b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsAdapter.HttpDnsOrigin) ipChange.ipc$dispatch("ebe18e96", new Object[]{str, new Boolean(z)});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        if (z) {
            return a(parse);
        }
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> c2 = c(parse);
        if (c2 == null || c2.isEmpty() || c2.get(0) == null || TextUtils.isEmpty(c2.get(0).getOriginIP())) {
            return null;
        }
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin = c2.get(i);
            if (httpDnsOrigin != null && !TextUtils.isEmpty(httpDnsOrigin.getOriginIP()) && ((!startsWith || parse.getScheme().equals(httpDnsOrigin.getOriginProtocol())) && !httpDnsOrigin.getOriginIP().contains(":"))) {
                return httpDnsOrigin;
            }
        }
        return null;
    }

    public static String c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0f57e00", new Object[]{str, new Boolean(z)});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        if (z) {
            return b(parse);
        }
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> c2 = c(parse);
        if (c2 == null || c2.isEmpty() || c2.get(0) == null || TextUtils.isEmpty(c2.get(0).getOriginIP())) {
            return null;
        }
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            if (c2.get(i) != null && !TextUtils.isEmpty(c2.get(i).getOriginIP()) && (!startsWith || parse.getScheme().equals(c2.get(i).getOriginProtocol()))) {
                String originIP = c2.get(i).getOriginIP();
                if (!originIP.contains(":")) {
                    return originIP;
                }
            }
        }
        return null;
    }

    public static String a(String str, boolean z, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76838a37", new Object[]{str, new Boolean(z), sb});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> c2 = c(parse);
        String str2 = null;
        if (z) {
            if (c2 != null && !c2.isEmpty() && c2.get(0) != null && !TextUtils.isEmpty(c2.get(0).getOriginIP())) {
                for (int size = c2.size() - 1; size > 0; size--) {
                    if (c2.get(size) != null && !TextUtils.isEmpty(c2.get(size).getOriginIP()) && (!startsWith || parse.getScheme().equals(c2.get(size).getOriginProtocol()))) {
                        sb.append(c2.get(size).getOriginIP());
                        break;
                    }
                }
                return c2.get(0).getOriginIP();
            }
        } else if (c2 != null && !c2.isEmpty() && c2.get(0) != null && !TextUtils.isEmpty(c2.get(0).getOriginIP())) {
            int size2 = c2.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                if (c2.get(i) != null && !TextUtils.isEmpty(c2.get(i).getOriginIP()) && (!startsWith || parse.getScheme().equals(c2.get(i).getOriginProtocol()))) {
                    String originIP = c2.get(i).getOriginIP();
                    if (!originIP.contains(":")) {
                        str2 = originIP;
                        break;
                    }
                }
                i++;
            }
            int i2 = size2 - 1;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                if (c2.get(i2) != null && !TextUtils.isEmpty(c2.get(i2).getOriginIP()) && (!startsWith || parse.getScheme().equals(c2.get(i2).getOriginProtocol()))) {
                    String originIP2 = c2.get(i2).getOriginIP();
                    if (!originIP2.contains(":") && !TextUtils.isEmpty(str2) && !str2.equals(originIP2)) {
                        sb.append(originIP2);
                        break;
                    }
                }
                i2--;
            }
        }
        return str2;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_GET_IP_WITH_NO_WAIT, "true"));
    }

    private static HttpDnsAdapter.HttpDnsOrigin a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsAdapter.HttpDnsOrigin) ipChange.ipc$dispatch("6dae5bb8", new Object[]{uri});
        }
        if (b()) {
            return HttpDnsAdapter.getOriginByHttpDnsNoWait(uri.getHost());
        }
        return HttpDnsAdapter.getOriginByHttpDns(uri.getHost());
    }

    private static String b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e66ffe2", new Object[]{uri});
        }
        if (b()) {
            HttpDnsAdapter.HttpDnsOrigin originByHttpDnsNoWait = HttpDnsAdapter.getOriginByHttpDnsNoWait(uri.getHost());
            if (originByHttpDnsNoWait == null) {
                return null;
            }
            return originByHttpDnsNoWait.getOriginIP();
        }
        return HttpDnsAdapter.getIpByHttpDns(uri.getHost());
    }

    private static ArrayList<HttpDnsAdapter.HttpDnsOrigin> c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fa212e77", new Object[]{uri});
        }
        if (b()) {
            return HttpDnsAdapter.getOriginsByHttpDnsNoWait(uri.getHost(), false);
        }
        return HttpDnsAdapter.getOriginsByHttpDns(uri.getHost(), false);
    }
}

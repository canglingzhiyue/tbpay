package com.taobao.trtc.utils;

import android.text.TextUtils;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.HttpDnsAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.qvc;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final i f23187a;
    private static ArrayList<HttpDnsAdapter.HttpDnsOrigin> b;
    private static AtomicBoolean c;

    public static /* synthetic */ ArrayList a(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a85ead1c", new Object[]{arrayList});
        }
        b = arrayList;
        return arrayList;
    }

    public static /* synthetic */ i b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("860508fe", new Object[0]) : f23187a;
    }

    public static /* synthetic */ AtomicBoolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("34e62c2a", new Object[0]) : c;
    }

    static {
        kge.a(-677823833);
        f23187a = new i();
        b = null;
        c = new AtomicBoolean(false);
    }

    public static Object[] a(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("ba3f5a13", new Object[]{str});
        }
        TrtcLog.d("TrtcHttpDns", "GetIPFromHttpDns host: " + str);
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> b2 = b(str);
        if (b2 == null || b2.size() <= 0) {
            TrtcLog.a("TrtcHttpDns", "GetIPFromHttpDns get ip error");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<HttpDnsAdapter.HttpDnsOrigin> it = b2.iterator();
        while (it.hasNext()) {
            String originIP = it.next().getOriginIP();
            if (!TextUtils.isEmpty(originIP)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (((String) it2.next()).equals(originIP)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    try {
                        if (NetworkStatusHelper.getStatus().isWifi() && !arrayList.isEmpty() && (InetAddress.getByName((String) arrayList.get(0)) instanceof Inet6Address) && (InetAddress.getByName(originIP) instanceof Inet4Address) && qvc.a(com.taobao.trtc.impl.h.TRTC_ORANGE_DEF_BOOL_DNS_WIFI_DUAL_STACK_V4_FIRST, true)) {
                            arrayList.add(0, originIP);
                            h.a("TrtcHttpDns", "httpdns v4 first: " + originIP);
                        } else {
                            arrayList.add(originIP);
                        }
                    } catch (Throwable unused) {
                        arrayList.add(originIP);
                    }
                }
            }
        }
        b2.clear();
        Object[] array = arrayList.toArray();
        TrtcLog.d("TrtcHttpDns", "GetIPFromHttpDns host: " + Arrays.toString(array));
        return array;
    }

    private static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        TrtcLog.d("TrtcHttpDns", "execute thread.");
        com.taobao.artc.utils.a.d(runnable);
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        TrtcLog.d("TrtcHttpDns", "shutdown thread.");
        com.taobao.artc.utils.a.d();
    }

    private static ArrayList<HttpDnsAdapter.HttpDnsOrigin> b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("569491cd", new Object[]{str});
        }
        a(new Runnable() { // from class: com.taobao.trtc.utils.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    d.a(HttpDnsAdapter.getOriginsByHttpDns(str));
                } catch (Exception e) {
                    TrtcLog.d("TrtcHttpDns", "GetIPFromHttpDns e: " + e.getMessage());
                } finally {
                    TrtcLog.d("TrtcHttpDns", "TrtcWaiter signal for get httpdns done");
                    d.b().a(3);
                    d.c().set(false);
                }
            }
        });
        TrtcLog.d("TrtcHttpDns", "TrtcWaiter wait for get httpdns done");
        c.set(true);
        f23187a.a(3, 5000);
        return b;
    }

    public static void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcHttpDns", "UpdateHttpDnsAMDC host: " + str + " ,ip: " + str2 + " ,status: " + z);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        TrtcLog.d("TrtcHttpDns", "TrtcWaiter signal for get httpdns done, http dns workding: " + c);
        if (c.get()) {
            f23187a.a(3);
            d();
            c.set(false);
        }
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> arrayList = b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        b.clear();
        b = null;
    }
}

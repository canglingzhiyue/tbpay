package android.taobao.windvane.monitor;

import android.taobao.windvane.monitor.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static q f1685a;
    private static d b;
    private static g c;
    private static p d;
    private static n f;
    private static f.e g;
    private static f.b h;
    private static f.a i;
    private static f.c j;
    private static f.InterfaceC0020f k;
    private static f.d l;

    static {
        kge.a(1107192979);
    }

    public static q getPerformanceMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("bddf03c0", new Object[0]) : f1685a;
    }

    public static void registerPerformanceMonitor(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5142f335", new Object[]{qVar});
        } else {
            f1685a = qVar;
        }
    }

    public static d getErrorMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("68102fd5", new Object[0]) : b;
    }

    public static void registerErrorMonitor(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0ccbfa", new Object[]{dVar});
        } else {
            b = dVar;
        }
    }

    public static g getJsBridgeMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("97b09c9c", new Object[0]) : c;
    }

    public static void registerJsBridgeMonitor(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3138dde7", new Object[]{gVar});
        } else {
            c = gVar;
        }
    }

    public static p getPackageMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("2fdb2090", new Object[0]) : d;
    }

    public static void registerPackageMonitorInterface(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a60f101", new Object[]{pVar});
        } else {
            d = pVar;
        }
    }

    public static void registerWVMonitor(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3e488d", new Object[]{nVar});
        } else {
            f = nVar;
        }
    }

    public static n getWvMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("f1306757", new Object[0]) : f;
    }

    public static void registerWVWhitePageMonitorInterface(f.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d727bf7", new Object[]{eVar});
        } else {
            g = eVar;
        }
    }

    public static f.e getWVWhitePageMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.e) ipChange.ipc$dispatch("af9a870c", new Object[0]) : g;
    }

    public static void registerWVJsErrorMonitorInterface(f.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ccb953", new Object[]{bVar});
        } else {
            h = bVar;
        }
    }

    public static f.b getWvJsErrorMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.b) ipChange.ipc$dispatch("dd326c36", new Object[0]) : h;
    }

    public static void registerWVJsBridgeMonitorInterface(f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7190add", new Object[]{aVar});
        } else {
            i = aVar;
        }
    }

    public static f.a getWvJsBridgeMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("3f536394", new Object[0]) : i;
    }

    public static void registerWVNetWorkMonitorInterface(f.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b20f483", new Object[]{cVar});
        } else {
            j = cVar;
        }
    }

    public static f.c getWVNetWorkMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.c) ipChange.ipc$dispatch("cab18b84", new Object[0]) : j;
    }

    public static void registerWVZCacheMonitorInterface(f.InterfaceC0020f interfaceC0020f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45799002", new Object[]{interfaceC0020f});
        } else {
            k = interfaceC0020f;
        }
    }

    public static f.InterfaceC0020f getWvzCacheMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.InterfaceC0020f) ipChange.ipc$dispatch("3e29f045", new Object[0]) : k;
    }

    public static void registerWVPerformanceMonitorInterface(f.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b877040", new Object[]{dVar});
        } else {
            l = dVar;
        }
    }

    public static f.d getWvPerformanceMonitorInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.d) ipChange.ipc$dispatch("7ef50de5", new Object[0]) : l;
    }
}

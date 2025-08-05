package org.android.spdy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.android.netutil.UtilTool;
import tb.sab;
import tb.sad;

/* loaded from: classes.dex */
public class NetWorkStatusUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Network f25066a = null;
    public static volatile Network b = null;
    public static boolean c = false;
    public static int d = -1;
    public static String e;
    public static volatile InterfaceStatus f = InterfaceStatus.ACTIVE_INTERFACE_NONE;
    public static CopyOnWriteArraySet<a> g = new CopyOnWriteArraySet<>();
    private static StringBuilder h;
    private static ConnectivityManager i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum InterfaceStatus {
        ACTIVE_INTERFACE_NONE(0),
        ACTIVE_INTERFACE_CELLULAR(1),
        ACTIVE_INTERFACE_WIFI(2),
        ACTIVE_INTERFACE_MULTI(3);
        
        private int interfaceStatus;

        InterfaceStatus(int i) {
            this.interfaceStatus = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getInterfaceStatus() {
            return this.interfaceStatus;
        }

        void setInterfaceStatus(int i) {
            this.interfaceStatus = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(InterfaceStatus interfaceStatus, boolean z);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return NetworkStatusHelper.getStatus().isWifi();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return NetworkStatusHelper.getStatus().isMobile();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : sad.c() && Build.VERSION.SDK_INT >= 21 && e();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = org.android.spdy.NetWorkStatusUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r9 = "9e1d6460"
            r0.ipc$dispatch(r9, r1)
            return
        L12:
            r0 = 3
            r1 = 4
            r4 = 2
            java.lang.String r5 = ""
            java.lang.String r6 = "tnetsdk.NetWorkStatusUtil"
            if (r9 == 0) goto L2f
            boolean r7 = c()     // Catch: java.lang.Exception -> L2d
            if (r7 == 0) goto L2f
            b(r9)     // Catch: java.lang.Exception -> L2d
            c(r9)     // Catch: java.lang.Exception -> L2d
            org.android.spdy.NetWorkStatusUtil.c = r3     // Catch: java.lang.Exception -> L2d
            org.android.spdy.NetWorkStatusUtil.d = r2     // Catch: java.lang.Exception -> L2d
            goto L65
        L2d:
            r9 = move-exception
            goto L4f
        L2f:
            if (r9 != 0) goto L34
            org.android.spdy.NetWorkStatusUtil.d = r3     // Catch: java.lang.Exception -> L2d
            goto L65
        L34:
            boolean r9 = tb.sad.c()     // Catch: java.lang.Exception -> L2d
            if (r9 != 0) goto L3d
            org.android.spdy.NetWorkStatusUtil.d = r4     // Catch: java.lang.Exception -> L2d
            goto L65
        L3d:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2d
            r7 = 21
            if (r9 >= r7) goto L46
            org.android.spdy.NetWorkStatusUtil.d = r0     // Catch: java.lang.Exception -> L2d
            goto L65
        L46:
            boolean r9 = e()     // Catch: java.lang.Exception -> L2d
            if (r9 != 0) goto L65
            org.android.spdy.NetWorkStatusUtil.d = r1     // Catch: java.lang.Exception -> L2d
            goto L65
        L4f:
            r9.printStackTrace()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r9
            java.lang.String r8 = "registerNetwork error"
            org.android.spdy.spduLog.Tloge(r6, r5, r8, r7)
            java.lang.String r9 = r9.getMessage()
            org.android.spdy.NetWorkStatusUtil.e = r9
            r9 = 5
            org.android.spdy.NetWorkStatusUtil.d = r9
        L65:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "succ"
            r9[r2] = r1
            int r1 = org.android.spdy.NetWorkStatusUtil.d
            if (r1 != 0) goto L71
            r2 = 1
        L71:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r9[r3] = r1
            java.lang.String r1 = "errCode"
            r9[r4] = r1
            int r1 = org.android.spdy.NetWorkStatusUtil.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r0] = r1
            java.lang.String r0 = "[registerNetwork]"
            org.android.spdy.spduLog.Tloge(r6, r5, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.NetWorkStatusUtil.a(android.content.Context):void");
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        try {
            if (h == null) {
                StringBuilder sb = new StringBuilder(32);
                h = sb;
                sb.append("err=");
                sb.append(d);
                sb.append(",level=");
                sb.append(Build.VERSION.SDK_INT);
                sb.append(",hmOs=");
                sb.append(UtilTool.c());
                sb.append(",hmVersin=");
                sb.append(UtilTool.d());
                sb.append(",hmWhite=");
                sb.append(sad.c(UtilTool.d()));
                if (e != null) {
                    StringBuilder sb2 = h;
                    sb2.append(",exMsg=");
                    sb2.append(e);
                }
            }
        } catch (Exception unused) {
        }
        StringBuilder sb3 = h;
        return sb3 != null ? sb3.toString() : "null";
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            if (i == null) {
                i = (ConnectivityManager) context.getSystemService("connectivity");
            }
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(0).addCapability(12);
            i.requestNetwork(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: org.android.spdy.NetWorkStatusUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 838841652) {
                        super.onAvailable((Network) objArr[0]);
                        return null;
                    } else if (hashCode != 2071672155) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onLost((Network) objArr[0]);
                        return null;
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("31ffb534", new Object[]{this, network});
                        return;
                    }
                    super.onAvailable(network);
                    NetWorkStatusUtil.f25066a = network;
                    NetWorkStatusUtil.a(InterfaceStatus.ACTIVE_INTERFACE_CELLULAR, true);
                    spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "TRANSPORT_CELLULAR onAvailable", "cellularNetwork", network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                        return;
                    }
                    super.onLost(network);
                    NetWorkStatusUtil.f25066a = null;
                    NetWorkStatusUtil.a(InterfaceStatus.ACTIVE_INTERFACE_CELLULAR, false);
                    spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "TRANSPORT_CELLULAR onLost", "cellularNetwork", network);
                }
            });
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "registerCellularNetwork success", new Object[0]);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            if (i == null) {
                i = (ConnectivityManager) context.getSystemService("connectivity");
            }
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(1).addCapability(12);
            i.requestNetwork(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: org.android.spdy.NetWorkStatusUtil.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 838841652) {
                        super.onAvailable((Network) objArr[0]);
                        return null;
                    } else if (hashCode != 2071672155) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onLost((Network) objArr[0]);
                        return null;
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("31ffb534", new Object[]{this, network});
                        return;
                    }
                    super.onAvailable(network);
                    NetWorkStatusUtil.b = network;
                    NetWorkStatusUtil.a(InterfaceStatus.ACTIVE_INTERFACE_WIFI, true);
                    spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "TRANSPORT_WIFI onAvailable", "wifiNetwork", network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                        return;
                    }
                    super.onLost(network);
                    NetWorkStatusUtil.b = null;
                    NetWorkStatusUtil.a(InterfaceStatus.ACTIVE_INTERFACE_WIFI, false);
                    spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "TRANSPORT_WIFI onLost", "wifiNetwork", network);
                }
            });
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "registerWifiNetwork success", new Object[0]);
        }
    }

    public static int a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i2)})).intValue();
        }
        try {
            if (f25066a != null && Build.VERSION.SDK_INT >= 23 && (!sab.b() || !sad.d())) {
                f25066a.bindSocket(ParcelFileDescriptor.fromFd(i2).getFileDescriptor());
                spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "bind cellular succ", "fd", Integer.valueOf(i2), "cellularNetwork", f25066a);
                return 0;
            }
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "bind Cellular Fail", "cellular", f25066a, "isEnterBgLong", Boolean.valueOf(sab.b()), "isBrandBlock", Boolean.valueOf(sad.d()));
            return -1;
        } catch (Throwable th) {
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "bind cellular fail", "e", th);
            return -1;
        }
    }

    public static int b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i2)})).intValue();
        }
        if (b == null || Build.VERSION.SDK_INT < 23 || i2 <= 0) {
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "bind Wifi Fail", "wifi", b, "fd", Integer.valueOf(i2));
            return -1;
        }
        try {
            b.bindSocket(ParcelFileDescriptor.fromFd(i2).getFileDescriptor());
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "bind Wifi succ", "fd", Integer.valueOf(i2), "wifiNetwork", b);
            return 0;
        } catch (Throwable th) {
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "bind Wifi fail", "e", th);
            return -1;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : !UtilTool.c() || sad.c(UtilTool.d());
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue();
        }
        if (c) {
            i2 = 1;
        }
        if (b != null) {
            i2 |= 2;
        }
        return f25066a != null ? i2 | 4 : i2;
    }

    public static void a(InterfaceStatus interfaceStatus, boolean z) {
        int interfaceStatus2;
        int interfaceStatus3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0551554", new Object[]{interfaceStatus, new Boolean(z)});
            return;
        }
        int interfaceStatus4 = f.getInterfaceStatus();
        if (interfaceStatus == InterfaceStatus.ACTIVE_INTERFACE_WIFI) {
            if (z) {
                interfaceStatus3 = InterfaceStatus.ACTIVE_INTERFACE_WIFI.getInterfaceStatus();
                interfaceStatus4 |= interfaceStatus3;
            } else {
                interfaceStatus2 = InterfaceStatus.ACTIVE_INTERFACE_WIFI.getInterfaceStatus();
                interfaceStatus4 &= ~interfaceStatus2;
            }
        } else if (interfaceStatus == InterfaceStatus.ACTIVE_INTERFACE_CELLULAR) {
            if (z) {
                interfaceStatus3 = InterfaceStatus.ACTIVE_INTERFACE_CELLULAR.getInterfaceStatus();
                interfaceStatus4 |= interfaceStatus3;
            } else {
                interfaceStatus2 = InterfaceStatus.ACTIVE_INTERFACE_CELLULAR.getInterfaceStatus();
                interfaceStatus4 &= ~interfaceStatus2;
            }
        }
        if (f.getInterfaceStatus() != interfaceStatus4) {
            f.setInterfaceStatus(interfaceStatus4);
        }
        Iterator<a> it = g.iterator();
        while (it.hasNext()) {
            it.next().a(interfaceStatus, z);
            spduLog.Tloge("tnetsdk.NetWorkStatusUtil", "", "onNetworkStatusChanged", "updataType", interfaceStatus, "isAvaiable", Boolean.valueOf(z));
        }
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866f050a", new Object[]{aVar});
            return;
        }
        try {
            g.add(aVar);
        } catch (Throwable unused) {
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb073cb", new Object[]{aVar});
            return;
        }
        try {
            g.remove(aVar);
        } catch (Throwable unused) {
        }
    }
}

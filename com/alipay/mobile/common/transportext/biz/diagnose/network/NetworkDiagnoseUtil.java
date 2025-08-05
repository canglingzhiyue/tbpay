package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public class NetworkDiagnoseUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss.S";
    public static final String FORMAT_FULL_CN = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";
    public static final String FORMAT_HMS = "HH:mm:ss.S";
    public static final String FORMAT_LONG = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_LONG_CN = "yyyy年MM月dd日  HH时mm分ss秒";
    public static final String FORMAT_SHORT = "yyyy-MM-dd";
    public static final String FORMAT_SHORT_CN = "yyyy年MM月dd";

    public static boolean blank(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e16d8845", new Object[]{new Byte(b)})).booleanValue() : b == 32 || b == 9;
    }

    public static int defaultPort(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9c11fe", new Object[]{new Boolean(z)})).intValue() : z ? 443 : 80;
    }

    public static boolean digital(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fb8601", new Object[]{new Byte(b)})).booleanValue() : b >= 48 && b <= 57;
    }

    public static double nsToMs(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("187225e5", new Object[]{new Long(j)})).doubleValue() : j / 1000000.0d;
    }

    public static long sToMs(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e2d533c", new Object[]{new Integer(i)})).longValue() : i * 1000;
    }

    public static String getTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c3efd8c", new Object[]{str});
        }
        if (str == null || str.isEmpty()) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        try {
            return new SimpleDateFormat(str).format(new Date());
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String dns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a697ce6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] convert(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("df1a4159", new Object[]{str});
        }
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String convert(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8faf7bf", new Object[]{bArr});
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean isSafety(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9dd9ae31", new Object[]{str})).booleanValue() : str != null && !str.isEmpty() && !str.trim().isEmpty();
    }

    public static String parse(String str) {
        String trim;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a9201c", new Object[]{str});
        }
        if (!isSafety(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            trim = str.trim();
        } else {
            trim = str.substring(0, lastIndexOf).trim();
        }
        if (isSafety(trim)) {
            return trim;
        }
        return null;
    }

    public static Configuration.Address parse(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration.Address) ipChange.ipc$dispatch("1af7b83c", new Object[]{str, new Boolean(z)});
        }
        Configuration.Address address = new Configuration.Address();
        if (str == null) {
            return address;
        }
        String str3 = null;
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            str2 = str.trim();
        } else {
            String trim = str.substring(0, lastIndexOf).trim();
            str3 = str.substring(lastIndexOf + 1).trim();
            str2 = trim;
        }
        if (str2.isEmpty()) {
            address.ip = "127.0.0.1";
        } else {
            address.ip = str2;
        }
        if (str3 == null || str3.isEmpty()) {
            address.port = defaultPort(z);
        } else {
            try {
                address.port = Integer.parseInt(str3);
                if (address.port < 0 || address.port > 65535) {
                    address.port = 0;
                }
            } catch (Throwable unused) {
                if (str3.compareToIgnoreCase("http") == 0) {
                    address.port = 80;
                } else if (str3.compareToIgnoreCase("https") == 0) {
                    address.port = 443;
                } else {
                    address.port = 0;
                }
            }
        }
        return address;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[Catch: Throwable -> 0x00b6, TryCatch #0 {Throwable -> 0x00b6, blocks: (B:11:0x0029, B:13:0x002d, B:15:0x005b, B:16:0x0070, B:18:0x0076, B:20:0x007e, B:22:0x0086, B:26:0x00a5, B:29:0x00b3, B:14:0x0049), top: B:32:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[Catch: Throwable -> 0x00b6, TryCatch #0 {Throwable -> 0x00b6, blocks: (B:11:0x0029, B:13:0x002d, B:15:0x005b, B:16:0x0070, B:18:0x0076, B:20:0x007e, B:22:0x0086, B:26:0x00a5, B:29:0x00b3, B:14:0x0049), top: B:32:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address sysProxy(com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address r7, boolean r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1d
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r8)
            r8 = 1
            r1[r8] = r7
            java.lang.String r7 = "70a37516"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address r7 = (com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address) r7
            return r7
        L1d:
            r0 = 0
            if (r8 == 0) goto L24
            java.lang.String r8 = "https://"
            goto L27
        L24:
            java.lang.String r8 = "http://"
        L27:
            if (r7 == 0) goto L49
            java.lang.String r1 = r7.ip     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r1.<init>()     // Catch: java.lang.Throwable -> Lb6
            r1.append(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r7.ip     // Catch: java.lang.Throwable -> Lb6
            r1.append(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = ":"
            r1.append(r8)     // Catch: java.lang.Throwable -> Lb6
            int r7 = r7.port     // Catch: java.lang.Throwable -> Lb6
            r1.append(r7)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Lb6
            goto L5b
        L49:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r7.<init>()     // Catch: java.lang.Throwable -> Lb6
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "www.taobao.com"
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb6
        L5b:
            java.net.URI r8 = new java.net.URI     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Lb6
            java.net.ProxySelector r7 = java.net.ProxySelector.getDefault()     // Catch: java.lang.Throwable -> Lb6
            java.util.List r7 = r7.select(r8)     // Catch: java.lang.Throwable -> Lb6
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lb6
            r8 = 10
            com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address[] r8 = new com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address[r8]     // Catch: java.lang.Throwable -> Lb6
        L70:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto La3
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> Lb6
            java.net.Proxy r1 = (java.net.Proxy) r1     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L70
            java.net.SocketAddress r1 = r1.address()     // Catch: java.lang.Throwable -> Lb6
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L70
            com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address r3 = new com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address     // Catch: java.lang.Throwable -> Lb6
            r3.<init>()     // Catch: java.lang.Throwable -> Lb6
            r8[r2] = r3     // Catch: java.lang.Throwable -> Lb6
            r3 = r8[r2]     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = r1.getHostName()     // Catch: java.lang.Throwable -> Lb6
            r3.ip = r4     // Catch: java.lang.Throwable -> Lb6
            r3 = r8[r2]     // Catch: java.lang.Throwable -> Lb6
            int r1 = r1.getPort()     // Catch: java.lang.Throwable -> Lb6
            r3.port = r1     // Catch: java.lang.Throwable -> Lb6
            int r2 = r2 + 1
            int r1 = r8.length     // Catch: java.lang.Throwable -> Lb6
            if (r2 == r1) goto La3
            goto L70
        La3:
            if (r2 == 0) goto Lb6
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lb6
            r7 = 32
            long r5 = r3 >>> r7
            int r7 = (int) r5     // Catch: java.lang.Throwable -> Lb6
            int r1 = (int) r3     // Catch: java.lang.Throwable -> Lb6
            r7 = r7 ^ r1
            if (r7 >= 0) goto Lb3
            int r7 = -r7
        Lb3:
            int r7 = r7 % r2
            r0 = r8[r7]     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseUtil.sysProxy(com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address, boolean):com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address");
    }

    public static long msToS(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33f7309f", new Object[]{new Long(j)})).longValue() : j / 1000;
    }
}

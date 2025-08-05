package tb;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.alibaba.security.realidentity.g4;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.File;
import java.io.FileFilter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetParam;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ckc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ckc f26328a = new ckc();

    /* loaded from: classes3.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    private ckc() {
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        long j = 0;
        if (str == null) {
            return "0";
        }
        try {
            if ("mounted".equals(str2)) {
                StatFs statFs = new StatFs(str);
                j = statFs.getBlockSize() * statFs.getAvailableBlocks();
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    public static ckc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ckc) ipChange.ipc$dispatch("f034383", new Object[0]) : f26328a;
    }

    private static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue() : !b(context, str);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        long j = 0;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        long j = 0;
        if (str == null) {
            return "0";
        }
        try {
            if ("mounted".equals(str2)) {
                StatFs statFs = new StatFs(str);
                j = statFs.getBlockSize() * statFs.getBlockCount();
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    private static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue() : context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String c() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ckc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "bd025a76"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L85
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L85
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L85
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L67
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L67
            r1 = 1
            r5 = 1
        L2d:
            r6 = 100
            if (r5 >= r6) goto L5b
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L5b
            java.lang.String r7 = "Serial"
            int r7 = r6.indexOf(r7)     // Catch: java.lang.Throwable -> L59
            if (r7 < 0) goto L53
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + r1
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r6.substring(r5, r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L59
            goto L5b
        L53:
            int r5 = r5 + 1
            goto L2d
        L56:
            r0 = move-exception
            r1 = r4
            goto L71
        L59:
            r1 = r4
            goto L87
        L5b:
            r4.close()     // Catch: java.lang.Throwable -> L5e
        L5e:
            r3.close()     // Catch: java.lang.Throwable -> L61
        L61:
            r2.close()     // Catch: java.lang.Throwable -> L98
            goto L98
        L65:
            r0 = move-exception
            goto L71
        L67:
            goto L87
        L69:
            r0 = move-exception
            r3 = r1
            goto L71
        L6c:
            r3 = r1
            goto L87
        L6e:
            r0 = move-exception
            r2 = r1
            r3 = r2
        L71:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.lang.Throwable -> L77
            goto L78
        L77:
        L78:
            if (r3 == 0) goto L7f
            r3.close()     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
        L7f:
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.lang.Throwable -> L84
        L84:
            throw r0
        L85:
            r2 = r1
            r3 = r2
        L87:
            if (r1 == 0) goto L8e
            r1.close()     // Catch: java.lang.Throwable -> L8d
            goto L8e
        L8d:
        L8e:
            if (r3 == 0) goto L95
            r3.close()     // Catch: java.lang.Throwable -> L94
            goto L95
        L94:
        L95:
            if (r2 == 0) goto L98
            goto L61
        L98:
            if (r0 != 0) goto L9c
            java.lang.String r0 = ""
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckc.c():java.lang.String");
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i == 1 ? "1" : "0";
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i));
            jSONObject.put("call", String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put("alarm", String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String e() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ckc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "ca0dcfb4"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.String r0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L53
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L53
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L54
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L42
            boolean r3 = tb.cjw.a(r1)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L36
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L42
            r0.close()     // Catch: java.lang.Throwable -> L32
        L32:
            r2.close()     // Catch: java.lang.Throwable -> L35
        L35:
            return r1
        L36:
            r0.close()     // Catch: java.lang.Throwable -> L39
        L39:
            r2.close()     // Catch: java.lang.Throwable -> L5c
            goto L5c
        L3d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L48
        L42:
            r1 = r0
            goto L54
        L44:
            r0 = move-exception
            goto L48
        L46:
            r0 = move-exception
            r2 = r1
        L48:
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L4d
        L4d:
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.lang.Throwable -> L52
        L52:
            throw r0
        L53:
            r2 = r1
        L54:
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.lang.Throwable -> L59
        L59:
            if (r2 == 0) goto L5c
            goto L39
        L5c:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckc.e():java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String f() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ckc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "50938a53"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L59
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L59
        L23:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L4b
            boolean r5 = tb.cjw.a(r3)     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L23
            java.lang.String r5 = ":"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L23
            int r5 = r3.length     // Catch: java.lang.Throwable -> L54
            r6 = 1
            if (r5 <= r6) goto L23
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L54
            java.lang.String r7 = "BogoMIPS"
            boolean r5 = r5.contains(r7)     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L23
            r2 = r3[r6]     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L54
        L4b:
            r4.close()     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0.close()     // Catch: java.lang.Throwable -> L78
            goto L78
        L52:
            r1 = move-exception
            goto L5e
        L54:
            r3 = r0
            goto L6c
        L56:
            r1 = move-exception
            r0 = r3
            goto L5e
        L59:
            goto L6c
        L5b:
            r1 = move-exception
            r0 = r3
            r4 = r0
        L5e:
            if (r4 == 0) goto L65
            r4.close()     // Catch: java.lang.Throwable -> L64
            goto L65
        L64:
        L65:
            if (r0 == 0) goto L6a
            r0.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            throw r1
        L6b:
            r4 = r3
        L6c:
            if (r4 == 0) goto L73
            r4.close()     // Catch: java.lang.Throwable -> L72
            goto L73
        L72:
        L73:
            if (r3 == 0) goto L78
            r3.close()     // Catch: java.lang.Throwable -> L78
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckc.f():java.lang.String");
    }

    public static String f(Context context) {
        List<Sensor> sensorList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7289b85", new Object[]{context});
        }
        String str = null;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb.append(sensor.getName());
                        sb.append(sensor.getVersion());
                        sb.append(sensor.getVendor());
                    }
                    str = cjw.e(sb.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return str == null ? "" : str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String g() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ckc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "d71944f2"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = ":\\s+"
            r4 = 2
            java.lang.String[] r0 = r0.split(r3, r4)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L39
            int r3 = r0.length     // Catch: java.lang.Throwable -> L42
            r4 = 1
            if (r3 <= r4) goto L39
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L42
            r1.close()     // Catch: java.lang.Throwable -> L35
        L35:
            r2.close()     // Catch: java.lang.Throwable -> L38
        L38:
            return r0
        L39:
            r1.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            r2.close()     // Catch: java.lang.Throwable -> L69
            goto L69
        L40:
            r0 = move-exception
            goto L4f
        L42:
            r0 = r2
            goto L5d
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L4f
        L49:
            goto L5d
        L4b:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L4f:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
        L56:
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            throw r0
        L5c:
            r1 = r0
        L5d:
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.lang.Throwable -> L63
            goto L64
        L63:
        L64:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.lang.Throwable -> L69
        L69:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckc.g():java.lang.String");
    }

    public static String g(Context context) {
        List<Sensor> sensorList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ca2c1c6", new Object[]{context});
        }
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String h() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ckc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "5d9eff91"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L57
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L57
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L45
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L37
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L40
            r5 = 1
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L40
            int r1 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L40
            long r1 = (long) r1
        L37:
            r4.close()     // Catch: java.lang.Throwable -> L3a
        L3a:
            r0.close()     // Catch: java.lang.Throwable -> L64
            goto L64
        L3e:
            r1 = move-exception
            goto L4a
        L40:
            r3 = r0
            goto L58
        L42:
            r1 = move-exception
            r0 = r3
            goto L4a
        L45:
            goto L58
        L47:
            r1 = move-exception
            r0 = r3
            r4 = r0
        L4a:
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.lang.Throwable -> L50
            goto L51
        L50:
        L51:
            if (r0 == 0) goto L56
            r0.close()     // Catch: java.lang.Throwable -> L56
        L56:
            throw r1
        L57:
            r4 = r3
        L58:
            if (r4 == 0) goto L5f
            r4.close()     // Catch: java.lang.Throwable -> L5e
            goto L5f
        L5e:
        L5f:
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.lang.Throwable -> L64
        L64:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckc.h():java.lang.String");
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context});
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        long j = 0;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67970e48", new Object[]{context});
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd113489", new Object[]{context});
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Map<String, String> j() {
        String externalStorageState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db121866", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdcard", "0");
        hashMap.put("sdcardavailable", "0");
        String str = null;
        if (APSecuritySdk.dirInterface != null) {
            externalStorageState = APSecuritySdk.dirInterface.getExternalStorageState();
            File externalStorageDirectory = APSecuritySdk.dirInterface.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                str = externalStorageDirectory.getPath();
            }
        } else {
            externalStorageState = Environment.getExternalStorageState();
            str = "/sdcard";
        }
        try {
            String b = b(str, externalStorageState);
            String a2 = a(str, externalStorageState);
            hashMap.put("sdcard", b);
            hashMap.put("sdcardavailable", a2);
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static String k() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String l() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]);
        }
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]);
        }
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]);
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2f9cd8d", new Object[]{context});
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager)) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[0]);
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[0]);
        }
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00:");
            for (int i = 0; i < 7; i++) {
                sb.append(new File(strArr[i]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0036 -> B:17:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String p(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = tb.ckc.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L17
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            java.lang.String r3 = "9dee1a0f"
            java.lang.Object r3 = r1.ipc$dispatch(r3, r0)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L17:
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L36
            r2 = 29
            if (r1 < r2) goto L24
            goto L36
        L24:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L36
            r2 = 26
            if (r1 < r2) goto L33
            r1 = 28
            if (r3 < r1) goto L33
            java.lang.String r3 = com.android.taobao.aop.ANDROID_OS_BUILD_PROXY.proxy_getSerial()     // Catch: java.lang.Throwable -> L36
            goto L37
        L33:
            java.lang.String r3 = android.os.Build.SERIAL     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r3 = r0
        L37:
            if (r3 != 0) goto L3a
            r3 = r0
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckc.p(android.content.Context):java.lang.String");
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[0]);
        }
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb = new StringBuilder();
        sb.append("00");
        sb.append(":");
        for (int i = 0; i <= 0; i++) {
            try {
                Class.forName(strArr[0]);
                sb.append("1");
            } catch (Throwable unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static String q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13684050", new Object[]{context});
        }
        try {
            String t = t(context);
            String u = u();
            if (!cjw.b(t) || !cjw.b(u)) {
                return "";
            }
            return t + ":" + u();
        } catch (Throwable unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String r() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ckc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "9ed849c7"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = "/system/build.prop"
            java.lang.String r3 = "ro.product.name=sdk"
            r1.put(r2, r3)
            java.lang.String r2 = "goldfish"
            java.lang.String r3 = "/proc/tty/drivers"
            r1.put(r3, r2)
            java.lang.String r3 = "/proc/cpuinfo"
            r1.put(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "00"
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = 48
            java.io.LineNumberReader r6 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L9c
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9c
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9c
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L9c
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L9c
        L6c:
            java.lang.String r4 = r6.readLine()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L84
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r7 = r1.get(r3)     // Catch: java.lang.Throwable -> L90
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch: java.lang.Throwable -> L90
            boolean r4 = r4.contains(r7)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L6c
            r5 = 49
        L84:
            r0.append(r5)
            r6.close()     // Catch: java.lang.Throwable -> L8b
            goto L4e
        L8b:
            goto L4e
        L8d:
            r1 = move-exception
            r4 = r6
            goto L93
        L90:
            r4 = r6
            goto L9c
        L92:
            r1 = move-exception
        L93:
            r0.append(r5)
            if (r4 == 0) goto L9b
            r4.close()     // Catch: java.lang.Throwable -> L9b
        L9b:
            throw r1
        L9c:
            r0.append(r5)
            if (r4 == 0) goto L4e
            r4.close()     // Catch: java.lang.Throwable -> L8b
            goto L4e
        La5:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckc.r():java.lang.String");
    }

    public static String r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88e26691", new Object[]{context});
        }
        try {
            long j = 0;
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            for (int i = 0; i < 5; i++) {
                long j2 = -1;
                try {
                    j2 = new File(strArr[i]).lastModified();
                } catch (Throwable unused) {
                }
                j = Math.max(j2, j);
            }
            return "1:".concat(String.valueOf(j));
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String s() {
        StringBuilder sb = new StringBuilder();
        sb.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put(Mtop.Id.PRODUCT, g4.a.f3423a);
        linkedHashMap.put("MODEL", g4.a.f3423a);
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                String str2 = null;
                String str3 = (String) Build.class.getField(str).get(null);
                String str4 = (String) linkedHashMap.get(str);
                if (str3 != null) {
                    str2 = str3.toLowerCase();
                }
                if (str2 != null && str2.contains(str4)) {
                    c = '1';
                }
            } catch (Throwable unused) {
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String s(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe5c8cd2", new Object[]{context});
        }
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("status", -1);
            if (intExtra2 == 2 || intExtra2 == 5) {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "1" : "0");
            sb.append(":");
            sb.append(intExtra);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", g4.a.f3423a);
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", g4.a.f3423a);
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            String str2 = (String) linkedHashMap.get(str);
            String b = cjw.b(str, "");
            if (b != null && b.contains(str2)) {
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    private static String t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73d6b313", new Object[]{context});
        }
        if (a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0) {
                return null;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 4 && subtype != 1 && subtype != 2 && subtype != 7 && subtype != 11) {
                if (subtype != 3 && subtype != 5 && subtype != 6 && subtype != 8 && subtype != 9 && subtype != 10 && subtype != 12 && subtype != 14 && subtype != 15) {
                    return subtype == 13 ? "4G" : "UNKNOW";
                }
                return "3G";
            }
            return "2G";
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public final synchronized String a(Context context) {
        String imei;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (imei = APSecuritySdk.getDeviceInfo().getImei()) != null) {
            return imei;
        }
        String a2 = ckd.a("imei");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a2 = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager);
                }
            } catch (Throwable unused) {
            }
        }
        if (a2 == null) {
            a2 = "";
        }
        ckd.a("imei", a2);
        return a2;
    }

    public final synchronized String b(Context context) {
        String subscriberId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (subscriberId = APSecuritySdk.getDeviceInfo().getSubscriberId()) != null) {
            return subscriberId;
        }
        String a2 = ckd.a("imsi");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a2 = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager);
                }
            } catch (Throwable unused) {
            }
        }
        if (a2 == null) {
            a2 = "";
        }
        ckd.a("imsi", a2);
        return a2;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new a()).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public final synchronized String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{this, context});
        }
        String a2 = ckd.a("NetworkOperatorName");
        if (a2 != null) {
            return a2;
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a2 = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        if (a2 == null || "null".equals(a2)) {
            a2 = "";
        }
        ckd.a("NetworkOperatorName", a2);
        return a2;
    }

    public final synchronized String k(Context context) {
        String hardwareAddress;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("528b5aca", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (hardwareAddress = APSecuritySdk.getDeviceInfo().getHardwareAddress()) != null) {
            return hardwareAddress;
        }
        String a2 = ckd.a("mac");
        if (a2 != null) {
            return a2;
        }
        if (a(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        ckd.a("mac", a2);
        return a2;
    }

    public final synchronized String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c805810b", new Object[]{this, context});
        }
        String a2 = ckd.a("SimSerial");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        ckd.a("SimSerial", a2);
        return a2;
    }

    public final synchronized String m(Context context) {
        String str;
        String androidId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7fa74c", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (androidId = APSecuritySdk.getDeviceInfo().getAndroidId()) != null) {
            return androidId;
        }
        String a2 = ckd.a("ANDROIDID");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = "";
        }
        ckd.a("ANDROIDID", str);
        return str;
    }

    public final synchronized String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2873f3ce", new Object[]{this, context});
        }
        String a2 = ckd.a(NetParam.NetParamKey.BSSID);
        if (a2 != null) {
            return a2;
        }
        if (a(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        if (a2 == null) {
            a2 = "";
        }
        ckd.a(NetParam.NetParamKey.BSSID, a2);
        return a2;
    }
}

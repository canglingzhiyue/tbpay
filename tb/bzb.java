package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import com.ta.utdid2.device.UTDevice;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public class bzb {
    public static final String NETWORK_CLASS_WIFI = "Wi-Fi";

    /* renamed from: a  reason: collision with root package name */
    private static String f26195a;
    private static String b;
    private static String[] c;
    private static String d;
    private static String e;

    static {
        kge.a(1031118171);
        f26195a = null;
        b = null;
        c = new String[]{"Unknown", "Unknown"};
        d = null;
        e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
        if (r0 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = tb.bzb.f26195a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "/proc/cpuinfo"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L51
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L51
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L40
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L40
        L12:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L53
            if (r3 == 0) goto L32
            java.lang.String r4 = "Hardware"
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L53
            if (r4 == 0) goto L12
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L53
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L53
            tb.bzb.f26195a = r3     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L53
            r2.close()     // Catch: java.lang.Exception -> L31
            r0.close()     // Catch: java.lang.Exception -> L31
        L31:
            return r3
        L32:
            r2.close()     // Catch: java.lang.Exception -> L5b
        L35:
            r0.close()     // Catch: java.lang.Exception -> L5b
            goto L5b
        L39:
            r1 = move-exception
            goto L46
        L3b:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L46
        L40:
            r0 = r1
            goto L53
        L42:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L46:
            if (r2 == 0) goto L4b
            r2.close()     // Catch: java.lang.Exception -> L50
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.lang.Exception -> L50
        L50:
            throw r1
        L51:
            r0 = r1
            r2 = r0
        L53:
            if (r2 == 0) goto L58
            r2.close()     // Catch: java.lang.Exception -> L5b
        L58:
            if (r0 == 0) goto L5b
            goto L35
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bzb.a():java.lang.String");
    }

    public static String a(Context context) {
        return "unknown";
    }

    public static byte[] a(int i) {
        byte[] bArr = {(byte) ((r3 >> 8) % 256), (byte) (r3 % 256), (byte) (r3 % 256), (byte) (i % 256)};
        int i2 = i >> 8;
        int i3 = i2 >> 8;
        return bArr;
    }

    public static String b() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e2) {
            bzd.b("get country error ", e2);
            return null;
        }
    }

    private static String b(int i) {
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

    public static String[] b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return c;
        }
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0 && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    c[0] = "Wi-Fi";
                    return c;
                } else if (activeNetworkInfo.getType() == 0) {
                    c[0] = b(activeNetworkInfo.getSubtype());
                    c[1] = activeNetworkInfo.getSubtypeName();
                    return c;
                }
            }
            return c;
        }
        return c;
    }

    public static String c() {
        try {
            return Locale.getDefault().getCountry();
        } catch (Exception e2) {
            bzd.b("get country error ", e2);
            return null;
        }
    }

    public static String c(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                int i3 = i ^ i2;
                i2 ^= i3;
                i = i3 ^ i2;
            }
            return i2 + "*" + i;
        } catch (Exception e2) {
            bzd.b("DeviceUtils getResolution: error", e2);
            return "Unknown";
        }
    }

    public static final String d() {
        try {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int nanoTime = (int) System.nanoTime();
            int nextInt = new Random().nextInt();
            int nextInt2 = new Random().nextInt();
            byte[] a2 = a(currentTimeMillis);
            byte[] a3 = a(nanoTime);
            byte[] a4 = a(nextInt);
            byte[] a5 = a(nextInt2);
            byte[] bArr = new byte[16];
            System.arraycopy(a2, 0, bArr, 0, 4);
            System.arraycopy(a3, 0, bArr, 4, 4);
            System.arraycopy(a4, 0, bArr, 8, 4);
            System.arraycopy(a5, 0, bArr, 12, 4);
            return byz.b(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Exception e2) {
            bzd.b("get utdid error ", e2);
            return null;
        }
    }

    public static String e(Context context) {
        String str = d;
        if (str != null) {
            return str;
        }
        String d2 = d();
        d = d2;
        return StringUtils.isEmpty(d2) ? "unknown" : d;
    }

    public static String f(Context context) {
        String str = e;
        if (str != null) {
            return str;
        }
        String d2 = d();
        e = d2;
        return d2;
    }
}

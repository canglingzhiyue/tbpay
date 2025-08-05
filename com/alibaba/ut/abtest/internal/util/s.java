package com.alibaba.ut.abtest.internal.util;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Random;
import java.util.StringTokenizer;
import tb.kge;

/* loaded from: classes.dex */
public final class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK_CLASS_2_G = "2G";
    public static final String NETWORK_CLASS_3_G = "3G";
    public static final String NETWORK_CLASS_4_G = "4G";
    public static final String NETWORK_CLASS_UNKNOWN = "Unknown";
    public static final String NETWORK_CLASS_WIFI = "Wi-Fi";

    /* renamed from: a  reason: collision with root package name */
    private static Application f4207a;
    private static final Random b;

    private static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
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

    public static synchronized Application a() {
        synchronized (s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
            }
            if (f4207a == null) {
                f4207a = b();
            }
            return f4207a;
        }
    }

    private static Application b() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            b.a("Utils.getSystemApp", e);
            return null;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                h.c("Utils", "to int fail", e);
            }
        }
        return i;
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue() : a(str, 0L);
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            h.c("Utils", "to long fail", e);
            return j;
        }
    }

    public static String a(Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e645ad", new Object[]{objArr, str});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0 && str != null) {
                sb.append(str);
            }
            if (objArr[i] != null) {
                sb.append(objArr[i].toString());
            }
        }
        return sb.toString();
    }

    public static String a(Collection collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79dedd5d", new Object[]{collection, str});
        }
        if (collection != null) {
            return a(collection.toArray(), str);
        }
        return null;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || a(context, "android.permission.ACCESS_NETWORK_STATE") == -1) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            b.a("Utils.isNetworkConnected", th);
        }
        return false;
    }

    public static String b(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (context == null) {
            return "Unknown";
        }
        try {
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0 && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "Wi-Fi";
                }
                if (activeNetworkInfo.getType() == 0) {
                    return b(activeNetworkInfo.getSubtype());
                }
            }
        } catch (Throwable th) {
            b.a("Utils.getNetworkType", th);
        }
        return "Unknown";
    }

    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{context, str})).intValue();
        }
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (RuntimeException e) {
            b.a("Utils.checkSelfPermission", e);
            return -1;
        }
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.startsWith("http")) {
            scheme = "http";
        }
        return scheme + ":" + uri.getAuthority() + ":" + uri.getPath();
    }

    public static Uri a(Uri uri, Uri uri2, Uri uri3) {
        String replace;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("cf09036", new Object[]{uri, uri2, uri3});
        }
        try {
            String path = uri.getPath();
            if (TextUtils.equals(path, "/UTABTEST-ANY")) {
                replace = uri2.toString().replace("/UTABTEST-ANY", uri3.getPath());
            } else {
                String path2 = uri3.getPath();
                int indexOf = path.indexOf("UTABTEST-ANY");
                String substring = indexOf > 1 ? path.substring(0, indexOf - 1) : null;
                int i = indexOf + 12;
                String substring2 = i < path.length() ? path.substring(i) : null;
                if (!TextUtils.isEmpty(substring)) {
                    path2 = path2.replace(substring, "");
                }
                if (!TextUtils.isEmpty(substring2) && (lastIndexOf = path2.lastIndexOf(substring2)) != -1) {
                    path2 = path2.substring(0, lastIndexOf);
                }
                replace = uri2.toString().replace("/UTABTEST-ANY", path2);
            }
            return Uri.parse(replace);
        } catch (Throwable th) {
            b.a("Utils.getRedirectUrlOperatorAny", th);
            return null;
        }
    }

    static {
        kge.a(-132778263);
        b = new Random();
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        try {
            return Math.abs(b.nextInt(i));
        } catch (Exception e) {
            h.c("Utils", "random fail", e);
            return i;
        }
    }

    public static long[] b(String str) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("7d24c9d2", new Object[]{str});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int countTokens = stringTokenizer.countTokens();
        long[] jArr = new long[countTokens];
        for (int i = 0; i < countTokens; i++) {
            jArr[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        return jArr;
    }

    public static String[] a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a8022a7", new Object[]{str, str2, new Boolean(z)});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        int countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i = 0; i < countTokens; i++) {
            if (z) {
                strArr[i] = stringTokenizer.nextToken().trim();
            } else {
                strArr[i] = stringTokenizer.nextToken();
            }
        }
        return strArr;
    }
}

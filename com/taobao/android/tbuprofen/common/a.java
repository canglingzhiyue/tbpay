package com.taobao.android.tbuprofen.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Random;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_GRAY = 2;
    public static final int TYPE_INTEGRATION = 4;
    public static final int TYPE_RELEASE = 1;
    public static final int TYPE_SELF_GRAY = 3;
    public static final int TYPE_TEST = 5;
    public static final int TYPE_UNKNOWN = 0;
    public static long b;
    public static long c;

    static {
        kge.a(563460891);
        b = System.currentTimeMillis();
        c = SystemClock.uptimeMillis();
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            i = context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Exception unused) {
        }
        if (i == 0) {
            return null;
        }
        return context.getString(i);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        String a2 = a(context, "package_type");
        String a3 = a(context, "publish_type");
        if (a2 == null || a3 == null) {
            return 0;
        }
        char c2 = 65535;
        switch (a2.hashCode()) {
            case 49:
                if (a2.equals("1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 50:
                if (a2.equals("2")) {
                    c2 = 1;
                    break;
                }
                break;
            case 51:
                if (a2.equals("3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 != 0) {
            if (c2 == 1) {
                return 4;
            }
            return c2 != 2 ? 0 : 5;
        } else if ("1".equals(a3)) {
            return 1;
        } else {
            return "0".equals(a3) ? 2 : 4;
        }
    }

    public static Object a(Class<?> cls, String str, Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Field a2 = ReflectUtils.a(cls, str);
        if (a2 == null) {
            throw new NoSuchFieldException();
        }
        Object obj3 = a2.get(obj);
        a2.set(obj, obj2);
        return obj3;
    }

    public static boolean a(File file, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c808800f", new Object[]{file, str, new Boolean(z)})).booleanValue();
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z));
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)}) : j == 0 ? "UNKNOWN" : new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(j));
    }

    public static String b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2381a05", new Object[]{new Long(j)}) : new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(b + (j - c)));
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static boolean d(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad40213d", new Object[]{new Long(j)})).booleanValue() : j == 10000 || j > ((long) new Random().nextInt(10000));
    }
}

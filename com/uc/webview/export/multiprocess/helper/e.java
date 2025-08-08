package com.uc.webview.export.multiprocess.helper;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import tb.riy;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static String f23851a = "u4proc.Utils";
    private static WeakReference<Context> b;

    public static Context a() {
        WeakReference<Context> weakReference = b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private static String a(long j) {
        try {
            return new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(j));
        } catch (Throwable unused) {
            return Long.toString(j);
        }
    }

    public static String a(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        if (bundle == null) {
            sb.append("null");
        } else {
            sb.append('[');
            for (String str : bundle.keySet()) {
                sb.append(str);
                sb.append('=');
                sb.append(bundle.get(str));
                sb.append(", ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return "[fd: null]";
        }
        return "[fd: " + parcelFileDescriptor.getFd() + riy.ARRAY_END_STR;
    }

    public static String a(String str, String str2) {
        Context a2 = a();
        if (a2 == null) {
            return str2;
        }
        try {
            return a2.getSharedPreferences("u4app_core", 0).getString(str, str2);
        } catch (Throwable th) {
            c.c(f23851a, "SharedPreferences.getString(%s) failure", str, th);
            return "";
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String a(ParcelFileDescriptor[] parcelFileDescriptorArr) {
        if (parcelFileDescriptorArr == null) {
            return "null";
        }
        int length = parcelFileDescriptorArr.length - 1;
        if (length == -1) {
            return "[fd: null]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[fd: ");
        int i = 0;
        while (true) {
            sb.append(parcelFileDescriptorArr[i].getFd());
            if (i == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            Method method = cls.getMethod(str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
    }

    public static void a(Context context) {
        if (context != null) {
            WeakReference<Context> weakReference = b;
            if (weakReference != null && weakReference.get() != null) {
                return;
            }
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            } catch (Throwable unused) {
            }
            b = new WeakReference<>(context);
        }
    }

    public static void a(String str, ArrayList<String> arrayList, boolean z) {
        String str2;
        c.a(str, "file info:");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!StringUtils.isEmpty(next)) {
                c.b(str, " %s", next);
                try {
                    File file = new File(next);
                    if (!file.exists()) {
                        str2 = " | not exists";
                    } else if (file.isDirectory()) {
                        str2 = " | is directory";
                    } else if (!file.isFile()) {
                        str2 = " | is not file";
                    } else {
                        c.b(str, " | size: %d, last modify time: %s", Long.valueOf(file.length()), a(file.lastModified()));
                        if (z) {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            FileInputStream fileInputStream = new FileInputStream(file);
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                messageDigest.update(bArr, 0, read);
                            }
                            byte[] digest = messageDigest.digest();
                            c.a(str, " |  md5: " + a(digest));
                            fileInputStream.close();
                        }
                    }
                    c.c(str, str2);
                } catch (Throwable th) {
                    c.b(str, " | get info exception", th);
                }
            }
        }
    }

    public static void a(String str, boolean z) {
        Context a2 = a();
        if (a2 == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = a2.getSharedPreferences("u4app_core", 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (Throwable th) {
            c.c(f23851a, "SharedPreferences.putBoolean(%s, %b) failure", str, Boolean.valueOf(z), th);
        }
    }

    public static boolean a(String str) {
        Context a2 = a();
        if (a2 == null) {
            return false;
        }
        try {
            return a2.getSharedPreferences("u4app_core", 0).getBoolean(str, false);
        } catch (Throwable th) {
            c.c(f23851a, "SharedPreferences.getBoolean(%s) failure", str, th);
            return false;
        }
    }

    public static String b(Context context) {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            return (String) cls.getMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]).invoke(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable unused) {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        }
    }

    public static void b(String str, String str2) {
        Context a2 = a();
        if (a2 == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = a2.getSharedPreferences("u4app_core", 0).edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Throwable th) {
            c.c(f23851a, "SharedPreferences.putString(%s, %s) failure", str, str2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return (Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'Q' && Build.VERSION.CODENAME.charAt(0) <= 'Z') || Build.VERSION.SDK_INT >= 29;
    }
}

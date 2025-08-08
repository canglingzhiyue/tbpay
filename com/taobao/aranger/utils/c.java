package com.taobao.aranger.utils;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import com.taobao.atools.StaticHook;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.jzv;
import tb.kak;
import tb.kge;
import tb.xkf;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f16373a;
    private static final List<ProviderInfo> b;
    private static final ConcurrentHashMap<String, Uri> c;
    private static String d;
    private static ActivityManager e;
    private static Field f;
    private static Field g;
    private static Method h;

    static {
        kge.a(-1387812769);
        TAG = c.class.getSimpleName();
        f16373a = new CopyOnWriteArraySet();
        b = new CopyOnWriteArrayList();
        c = new ConcurrentHashMap<>();
    }

    public static void a(ComponentName componentName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd07311", new Object[]{componentName, str});
        } else if (componentName == null || StringUtils.isEmpty(str)) {
        } else {
            c.put(componentName.toShortString(), b(str));
        }
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        for (ProviderInfo providerInfo : b) {
            if (b(providerInfo.authority).equals(uri)) {
                return providerInfo.processName;
            }
        }
        return null;
    }

    public static int a(String str, int i) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null || (lastIndexOf = str.lastIndexOf(64)) == -1) {
            return i;
        }
        try {
            return Integer.parseInt(str.substring(0, lastIndexOf));
        } catch (NumberFormatException unused) {
            return -10000;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str != null) {
            return str.substring(str.lastIndexOf(64) + 1);
        }
        return null;
    }

    public static Uri a(ComponentName componentName) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("584cb83e", new Object[]{componentName});
        }
        try {
            if (!f16373a.contains(componentName.getPackageName())) {
                f16373a.add(componentName.getPackageName());
                Collections.addAll(b, jzv.a().getPackageManager().getPackageInfo(componentName.getPackageName(), 8).providers);
            }
            for (ProviderInfo providerInfo : b) {
                if (providerInfo.name.equals(componentName.getClassName())) {
                    return b(providerInfo.authority);
                }
            }
            String shortString = componentName.toShortString();
            if (c.containsKey(shortString)) {
                return c.get(shortString);
            }
            throw new IPCException(29, "can't find authorities in the " + componentName.getClass() + ", please check the provider is correct.");
        } catch (Exception e2) {
            throw new IPCException(30, e2);
        }
    }

    public static boolean b(ComponentName componentName) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aff156a", new Object[]{componentName})).booleanValue();
        }
        try {
            if (!f16373a.contains(componentName.getPackageName())) {
                f16373a.add(componentName.getPackageName());
                Collections.addAll(b, jzv.a().getPackageManager().getPackageInfo(componentName.getPackageName(), 8).providers);
            }
            str = "";
            for (ProviderInfo providerInfo : b) {
                if (providerInfo.name.equals(componentName.getClassName())) {
                    str = providerInfo.processName;
                }
            }
        } catch (Exception unused) {
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (e == null) {
            e = (ActivityManager) jzv.a().getSystemService("activity");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = e.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(str)) {
                return true;
            }
        }
        if (!xkf.a()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(componentName.getPackageName(), com.taobao.accs.utl.c.channelService));
            return jzv.a().stopService(intent);
        }
        return false;
    }

    public static boolean a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258f9aa7", new Object[]{context, new Integer(i)})).booleanValue();
        }
        boolean[] a2 = a(context.getPackageName(), context.getPackageName() + ":channel");
        if (a2 != null && a2.length == 2) {
            if (i != 1) {
                if (i == 2) {
                    return a2[0] || a2[1];
                } else if (i == 3) {
                    return a2[1] ^ a2[0];
                }
            } else if (a2[0] && a2[1]) {
                return true;
            }
        }
        return false;
    }

    private static boolean[] a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("729b881e", new Object[]{strArr});
        }
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    if (e == null) {
                        e = (ActivityManager) jzv.a().getSystemService("activity");
                    }
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = e.getRunningAppProcesses();
                    if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                        HashSet hashSet = new HashSet();
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            hashSet.add(runningAppProcessInfo.processName);
                        }
                        boolean[] zArr = new boolean[strArr.length];
                        for (int i = 0; i < zArr.length; i++) {
                            zArr[i] = hashSet.contains(strArr[i]);
                        }
                        return zArr;
                    }
                    return null;
                }
            } catch (Throwable th) {
                kak.a(TAG, "isProcessArrAlive err", th, new Object[0]);
            }
        }
        return null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (StringUtils.isEmpty(d)) {
            if (Build.VERSION.SDK_INT >= 28) {
                d = Application.getProcessName();
            } else if (Build.VERSION.SDK_INT >= 18) {
                d = ActivityThread.currentProcessName();
            }
            if (StringUtils.isEmpty(d)) {
                d = a(Process.myPid());
            }
        }
        return d;
    }

    private static Uri b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("95fe68aa", new Object[]{str});
        }
        return Uri.parse("content://" + str);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (e == null) {
            e = (ActivityManager) jzv.a().getSystemService("activity");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = e.getRunningAppProcesses();
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (!StringUtils.isEmpty(readLine)) {
                        readLine = readLine.trim();
                    }
                    try {
                        bufferedReader2.close();
                    } catch (IOException e2) {
                        Log.e(TAG, "getProcessName close is fail. exception=", e2);
                    }
                    return readLine;
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = bufferedReader2;
                    Log.e(TAG, "getProcessName read is fail. exception=", e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            Log.e(TAG, "getProcessName close is fail. exception=", e4);
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e5) {
                            Log.e(TAG, "getProcessName close is fail. exception=", e5);
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ServiceConnection a(Object obj) {
        try {
            if (f == null) {
                Field c2 = StaticHook.c(obj.getClass(), "mDispatcher");
                f = c2;
                c2.setAccessible(true);
            }
            Object obj2 = ((WeakReference) f.get(obj)).get();
            if (obj2 != null) {
                if (g == null) {
                    Field c3 = StaticHook.c(obj2.getClass(), "mConnection");
                    g = c3;
                    c3.setAccessible(true);
                }
                return (ServiceConnection) g.get(obj2);
            }
        } catch (Throwable th) {
            kak.a(TAG, "getConnectionFromServiceDispatcher err", th, new Object[0]);
        }
        kak.b(TAG, "getConnectionFromServiceDispatcher, return null", new Object[0]);
        return null;
    }

    public static Method b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("33fb52b5", new Object[0]);
        }
        if (h == null) {
            Method a2 = StaticHook.a(ContentResolver.class, Constants.ACQUIRE_UNSTABLE_PROVIDER, Uri.class);
            h = a2;
            a2.setAccessible(true);
        }
        return h;
    }
}

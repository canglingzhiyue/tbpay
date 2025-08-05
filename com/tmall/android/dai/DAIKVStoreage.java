package com.tmall.android.dai;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import com.taobao.mrt.utils.a;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class DAIKVStoreage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f23673a;
    private static Map<String, Map<String, String>> b;
    private static int c;
    private static int d;

    static {
        kge.a(1727534909);
        b = new HashMap();
        c = 1024;
        d = 1024;
        f23673a = 0;
    }

    private static boolean a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b63135cd", new Object[]{objArr})).booleanValue();
        }
        for (Object obj : objArr) {
            if (!(obj instanceof String)) {
                return true;
            }
        }
        return false;
    }

    public static String getValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{str, str2});
        }
        if (a(str, str2)) {
            return null;
        }
        String memoryValue = getMemoryValue(str, str2);
        return memoryValue != null ? memoryValue : getDiskValue(str, str2);
    }

    public static synchronized String getMemoryValue(String str, String str2) {
        synchronized (DAIKVStoreage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cbcdd56b", new Object[]{str, str2});
            } else if (a(str, str2)) {
                return null;
            } else {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    Map<String, String> map = b.get(str);
                    if (map == null) {
                        return null;
                    }
                    return map.get(str2);
                }
                return null;
            }
        }
    }

    public static String getDiskValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a26287", new Object[]{str, str2});
        }
        if (a(str, str2)) {
            return null;
        }
        try {
            h b2 = AVFSCacheManager.getInstance().cacheForModule("DAI").b();
            return (String) b2.b(str + "_" + str2);
        } catch (Throwable th) {
            a.b("DAIKVStoreage", "getDiskValue error", th);
            return null;
        }
    }

    public static boolean put(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234b2d78", new Object[]{str, str2, str3})).booleanValue();
        }
        if (a(str, str2, str3)) {
            return false;
        }
        putToMemory(str, str2, str3);
        putToDisk(str, str2, str3);
        return true;
    }

    public static synchronized boolean putToMemory(String str, String str2, String str3) {
        synchronized (DAIKVStoreage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16f6eef4", new Object[]{str, str2, str3})).booleanValue();
            } else if (a(str, str2, str3)) {
                return false;
            } else {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if (str3 != null) {
                        if (f23673a >= c) {
                            return false;
                        }
                        if (str3.length() > d) {
                            return false;
                        }
                        Map<String, String> map = b.get(str);
                        if (map == null) {
                            map = new HashMap<>();
                            b.put(str, map);
                        }
                        if (!map.containsKey(str2)) {
                            f23673a++;
                        }
                        map.put(str2, str3);
                        return true;
                    }
                    Map<String, String> map2 = b.get(str);
                    if (map2 != null && map2.containsKey(str2)) {
                        map2.remove(str2);
                        f23673a--;
                        if (map2.size() == 0) {
                            b.remove(str);
                        }
                    }
                    return true;
                }
                return false;
            }
        }
    }

    public static boolean putToDisk(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c26eff10", new Object[]{str, str2, str3})).booleanValue();
        }
        if (a(str, str2, str3)) {
            return false;
        }
        try {
            h b2 = AVFSCacheManager.getInstance().cacheForModule("DAI").b();
            b2.a(str + "_" + str2, (Object) str3);
        } catch (Throwable th) {
            a.b("DAIKVStoreage", "putToDisk error", th);
        }
        return true;
    }

    public static boolean removeFromDisk(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3417682a", new Object[]{str, str2})).booleanValue();
        }
        if (a(str, str2)) {
            return false;
        }
        try {
            h b2 = AVFSCacheManager.getInstance().cacheForModule("DAI").b();
            b2.c(str + "_" + str2);
        } catch (Throwable th) {
            a.b("DAIKVStoreage", "removeFromDisk error", th);
        }
        return true;
    }
}

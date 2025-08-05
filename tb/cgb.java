package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class cgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65cbb312", new Object[]{obj, str})).booleanValue();
        }
        if (obj == null) {
            c.a("CoreCommonUtils", str);
        }
        return obj == null;
    }

    public static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue() : (cfw.a() == null || intent == null || cfw.a().getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) ? false : true;
    }

    public static ThreadFactory a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadFactory) ipChange.ipc$dispatch("f2e0e9fb", new Object[]{str, new Boolean(z)}) : new ThreadFactory() { // from class: tb.cgb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static <T> Map<String, T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <S, T> Map<S, T> a(Map<S, T> map, Map<S, T> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc57ffd", new Object[]{map, map2});
        }
        try {
            HashMap hashMap = new HashMap(map);
            for (S s : map2.keySet()) {
                if (map.containsKey(s)) {
                    hashMap.put(s, map2.get(s));
                } else {
                    hashMap.put(s, map2.get(s));
                }
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        try {
            return JSONObject.toJSONString(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        try {
            return JSONObject.parseArray(str, String.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}

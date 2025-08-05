package com.taobao.android.jarviswe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.tracker.JarvisTracker;
import com.taobao.android.jarviswe.tracker.e;
import com.tmall.android.dai.DAIKVStoreage;
import java.util.Map;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class Jarvis {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final WeakHashMap<Object, JarvisTracker> sTrackerMap;

    public static Map<String, String> sceneModelsVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7082be8", new Object[]{str});
        }
        return null;
    }

    static {
        kge.a(-764441362);
        sTrackerMap = new WeakHashMap<>();
    }

    public static synchronized JarvisTracker getTracker(Object obj) {
        synchronized (Jarvis.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JarvisTracker) ipChange.ipc$dispatch("2eb27723", new Object[]{obj});
            }
            JarvisTracker jarvisTracker = sTrackerMap.get(obj);
            if (jarvisTracker == null) {
                jarvisTracker = new e(obj);
                sTrackerMap.put(obj, jarvisTracker);
            }
            return jarvisTracker;
        }
    }

    public static String readKKVCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55a0863", new Object[]{str, str2});
        }
        String value = DAIKVStoreage.getValue(str, str2);
        String str3 = "good to see cache value " + value;
        return value;
    }
}

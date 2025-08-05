package com.alibaba.android.split.core.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, com.alibaba.android.split.manager.b> f2443a;

    static {
        kge.a(-2007409390);
        f2443a = new HashMap();
    }

    public static com.alibaba.android.split.manager.b a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("e9139db9", new Object[]{str});
        } else {
            if (!f2443a.containsKey(str)) {
                f2443a.put(str, new f());
            }
            obj = f2443a.get(str);
        }
        return (com.alibaba.android.split.manager.b) obj;
    }
}

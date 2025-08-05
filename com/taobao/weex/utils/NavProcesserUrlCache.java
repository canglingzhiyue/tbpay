package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class NavProcesserUrlCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f23532a;

    static {
        kge.a(1815190757);
        f23532a = new HashMap();
    }

    public static void addUrlCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a2512f", new Object[]{str, str2});
        } else if (str == null || str2 == null) {
        } else {
            f23532a.put(str, str2);
        }
    }

    public static String getOriginalUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd743487", new Object[]{str});
        }
        Map<String, String> map = f23532a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }
}

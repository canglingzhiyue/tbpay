package com.alibaba.android.ultron.ext.event.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, j> f2617a;

    static {
        kge.a(-188936421);
        HashMap hashMap = new HashMap();
        f2617a = hashMap;
        hashMap.put("data", new b());
        f2617a.put("triggerData", new l());
        f2617a.put("jsonToString", new g());
    }

    public static j a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("92234be9", new Object[]{str}) : f2617a.get(str);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : f2617a.containsKey(str);
    }
}

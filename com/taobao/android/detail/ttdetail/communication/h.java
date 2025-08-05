package com.taobao.android.detail.ttdetail.communication;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f10527a;
    private static final AtomicInteger b;

    static {
        kge.a(507285629);
        f10527a = new ConcurrentHashMap();
        b = new AtomicInteger(0);
    }

    public static <T extends d> int a(Class<T> cls) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20fa47c8", new Object[]{cls})).intValue();
        }
        String name = cls.getName();
        synchronized (f10527a) {
            Integer num = f10527a.get(name);
            if (num == null) {
                num = Integer.valueOf(b.getAndIncrement());
                f10527a.put(name, num);
            }
            intValue = num.intValue();
        }
        return intValue;
    }
}

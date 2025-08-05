package com.taobao.android.behavir.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.LinkedMapWithMaxSize;
import com.taobao.android.behavir.util.d;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f9139a;
    private static int b;
    private final Map<String, BHREvent> c = Collections.synchronizedMap(new LinkedMapWithMaxSize(10));
    @Deprecated
    private List<BHREvent> d = Collections.synchronizedList(new LinkedList());

    static {
        kge.a(484638002);
        f9139a = 500;
        b = 50;
    }

    public b() {
        f9139a = 200;
        b = 50;
    }

    public BHREvent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("88bd7e57", new Object[]{this}) : a("pv");
    }

    private BHREvent a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHREvent) ipChange.ipc$dispatch("84d201a1", new Object[]{this, str});
        }
        try {
            return this.c.get(str);
        } catch (Exception e) {
            TLog.loge("BHREventHistory", "BHREventHistory", e);
            d.a("BHREventHistory", e);
            return null;
        }
    }
}

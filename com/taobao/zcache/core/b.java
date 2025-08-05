package com.taobao.zcache.core;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23638a;
    private static final Set<String> b;

    static {
        kge.a(-1806192354);
        f23638a = false;
        b = Collections.newSetFromMap(new ConcurrentHashMap());
        try {
            f23638a = true;
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static void a(String str, Map<String, String> map, Map<String, Double> map2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{str, map, map2});
        } else if (f23638a && !TextUtils.isEmpty(str) && (indexOf = str.indexOf(46)) >= 0) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (map == null) {
                map = new HashMap<>();
            }
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            if (b.add(str)) {
                AppMonitor.register(substring, substring2, MeasureSet.create(map2.keySet()), DimensionSet.create(map.keySet()));
            }
            DimensionValueSet create = DimensionValueSet.create(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                create.setValue(entry.getKey(), entry.getValue());
            }
            MeasureValueSet create2 = MeasureValueSet.create(map2.size());
            for (Map.Entry<String, Double> entry2 : map2.entrySet()) {
                create2.setValue(entry2.getKey(), entry2.getValue().doubleValue());
            }
            AppMonitor.Stat.commit(substring, substring2, create, create2);
        }
    }
}

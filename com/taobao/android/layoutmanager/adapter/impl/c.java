package com.taobao.android.layoutmanager.adapter.impl;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1389823319);
        kge.a(1516633910);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c
    public void a(String str, String str2, List<String> list, List<String> list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac5a936", new Object[]{this, str, str2, list, list2, new Boolean(z)});
            return;
        }
        DimensionSet dimensionSet = null;
        MeasureSet create = list != null ? MeasureSet.create(list) : null;
        if (list2 != null) {
            dimensionSet = DimensionSet.create(list2);
        }
        AppMonitor.register(str, str2, create, dimensionSet);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c
    public void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
            return;
        }
        DimensionValueSet dimensionValueSet = null;
        MeasureValueSet create = map != null ? MeasureValueSet.create(map) : null;
        if (map2 != null) {
            dimensionValueSet = DimensionValueSet.fromStringMap(map2);
        }
        AppMonitor.Stat.commit(str, str2, dimensionValueSet, create);
    }
}

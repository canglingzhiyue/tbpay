package com.alibaba.ability.inject;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class e implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1635230540);
        kge.a(-289651095);
    }

    @Override // com.alibaba.ability.inject.b
    public void a(String module, String monitorPoint, JSONObject dimensionValues, JSONObject measureValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04f5c7c", new Object[]{this, module, monitorPoint, dimensionValues, measureValues});
            return;
        }
        q.d(module, "module");
        q.d(monitorPoint, "monitorPoint");
        q.d(dimensionValues, "dimensionValues");
        q.d(measureValues, "measureValues");
        try {
            if (dimensionValues.size() <= 0) {
                return;
            }
            DimensionSet create = DimensionSet.create();
            q.b(create, "DimensionSet.create()");
            DimensionValueSet create2 = DimensionValueSet.create();
            q.b(create2, "DimensionValueSet.create()");
            for (String str : dimensionValues.keySet()) {
                create.addDimension(new Dimension(str));
                create2.setValue(str, dimensionValues.getString(str));
            }
            MeasureSet create3 = MeasureSet.create();
            q.b(create3, "MeasureSet.create()");
            MeasureValueSet create4 = MeasureValueSet.create();
            q.b(create4, "MeasureValueSet.create()");
            for (String str2 : measureValues.keySet()) {
                create3.addMeasure(new Measure(str2));
                create4.setValue(str2, measureValues.getDoubleValue(str2));
            }
            AppMonitor.register(module, monitorPoint, create3, create, true);
            AppMonitor.Stat.commit(module, monitorPoint, create2, create4);
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
    }
}

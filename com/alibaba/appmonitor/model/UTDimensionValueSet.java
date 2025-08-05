package com.alibaba.appmonitor.model;

import com.alibaba.analytics.core.model.LogField;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import java.util.Map;
import tb.apv;
import tb.kge;

/* loaded from: classes.dex */
public class UTDimensionValueSet extends DimensionValueSet {
    static {
        kge.a(345599517);
    }

    public Integer getEventId() {
        int i;
        String str;
        if (this.map != null && (str = this.map.get(LogField.EVENTID.toString())) != null) {
            try {
                i = apv.a(str);
            } catch (NumberFormatException unused) {
            }
            return Integer.valueOf(i);
        }
        i = 0;
        return Integer.valueOf(i);
    }

    public static UTDimensionValueSet create(Map<String, String> map) {
        return (UTDimensionValueSet) com.alibaba.appmonitor.pool.a.a().a(UTDimensionValueSet.class, map);
    }

    @Override // com.alibaba.mtl.appmonitor.model.DimensionValueSet, com.alibaba.appmonitor.pool.b
    public void clean() {
        super.clean();
    }

    @Override // com.alibaba.mtl.appmonitor.model.DimensionValueSet, com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        super.fill(objArr);
    }
}

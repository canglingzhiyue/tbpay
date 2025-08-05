package com.alibaba.appmonitor.event;

import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.apr;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Long f2881a;
    private com.alibaba.appmonitor.model.a b;
    private MeasureValueSet c;
    private DimensionValueSet d;
    private Map<String, MeasureValue> k;
    private Long l;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1275793840) {
            super.clean();
            return null;
        } else if (hashCode == -418211225) {
            super.fill((Object[]) objArr[0]);
            return null;
        } else if (hashCode != 2013839273) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c((Long) objArr[0]);
            return null;
        }
    }

    static {
        kge.a(-615825156);
        f2881a = 300000L;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<Measure> measures = this.b.h().getMeasures();
        if (measures != null) {
            int size = measures.size();
            for (int i = 0; i < size; i++) {
                Measure measure = measures.get(i);
                if (measure != null) {
                    double doubleValue = measure.getMax() != null ? measure.getMax().doubleValue() : f2881a.longValue();
                    MeasureValue measureValue = this.k.get(measure.getName());
                    if (measureValue != null && !measureValue.isFinish() && currentTimeMillis - measureValue.getValue() > doubleValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.k.isEmpty()) {
            this.l = Long.valueOf(currentTimeMillis);
        }
        this.k.put(str, (MeasureValue) com.alibaba.appmonitor.pool.a.a().a(MeasureValue.class, Double.valueOf(currentTimeMillis), Double.valueOf(currentTimeMillis - this.l.longValue())));
        super.c(null);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        MeasureValue measureValue = this.k.get(str);
        if (measureValue != null) {
            double currentTimeMillis = System.currentTimeMillis();
            apr.b("DurationEvent", "statEvent consumeTime. module:", this.e, " monitorPoint:", this.f, " measureName:", str, " time:", Double.valueOf(currentTimeMillis - measureValue.getValue()));
            measureValue.setValue(currentTimeMillis - measureValue.getValue());
            measureValue.setFinish(true);
            this.c.setValue(str, measureValue);
            if (this.b.h().valid(this.c)) {
                return true;
            }
        }
        super.c(null);
        return false;
    }

    public void a(DimensionValueSet dimensionValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14306d91", new Object[]{this, dimensionValueSet});
            return;
        }
        DimensionValueSet dimensionValueSet2 = this.d;
        if (dimensionValueSet2 == null) {
            this.d = dimensionValueSet;
        } else {
            dimensionValueSet2.addValues(dimensionValueSet);
        }
    }

    public MeasureValueSet c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MeasureValueSet) ipChange.ipc$dispatch("5ab53a9d", new Object[]{this}) : this.c;
    }

    public DimensionValueSet d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DimensionValueSet) ipChange.ipc$dispatch("28f6c634", new Object[]{this}) : this.d;
    }

    @Override // com.alibaba.appmonitor.event.d, com.alibaba.appmonitor.pool.b
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        super.clean();
        this.b = null;
        this.l = null;
        for (MeasureValue measureValue : this.k.values()) {
            com.alibaba.appmonitor.pool.a.a().a((com.alibaba.appmonitor.pool.a) measureValue);
        }
        this.k.clear();
        if (this.c != null) {
            com.alibaba.appmonitor.pool.a.a().a((com.alibaba.appmonitor.pool.a) this.c);
            this.c = null;
        }
        if (this.d == null) {
            return;
        }
        com.alibaba.appmonitor.pool.a.a().a((com.alibaba.appmonitor.pool.a) this.d);
        this.d = null;
    }

    @Override // com.alibaba.appmonitor.event.d, com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        super.fill(objArr);
        if (this.k == null) {
            this.k = new HashMap();
        }
        this.b = com.alibaba.appmonitor.model.b.a().a(this.e, this.f);
        if (this.b.e() != null) {
            this.d = (DimensionValueSet) com.alibaba.appmonitor.pool.a.a().a(DimensionValueSet.class, new Object[0]);
            this.b.e().setConstantValue(this.d);
        }
        this.c = (MeasureValueSet) com.alibaba.appmonitor.pool.a.a().a(MeasureValueSet.class, new Object[0]);
    }
}

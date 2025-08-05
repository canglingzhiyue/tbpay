package com.alibaba.appmonitor.event;

import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class f extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.appmonitor.model.a f2884a;
    private Map<DimensionValueSet, a> b;

    static {
        kge.a(-1592640708);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1275793840:
                super.clean();
                return null;
            case -418211225:
                super.fill((Object[]) objArr[0]);
                return null;
            case 1889499016:
                return super.a();
            case 2013839273:
                super.c((Long) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ com.alibaba.appmonitor.model.a a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.appmonitor.model.a) ipChange.ipc$dispatch("e9c75c84", new Object[]{fVar}) : fVar.f2884a;
    }

    public synchronized void a(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afc782", new Object[]{this, dimensionValueSet, measureValueSet});
            return;
        }
        if (dimensionValueSet == null) {
            dimensionValueSet = (DimensionValueSet) com.alibaba.appmonitor.pool.a.a().a(DimensionValueSet.class, new Object[0]);
        }
        if (this.b.containsKey(dimensionValueSet)) {
            aVar = this.b.get(dimensionValueSet);
        } else {
            DimensionValueSet dimensionValueSet2 = (DimensionValueSet) com.alibaba.appmonitor.pool.a.a().a(DimensionValueSet.class, new Object[0]);
            dimensionValueSet2.addValues(dimensionValueSet);
            a aVar2 = new a();
            this.b.put(dimensionValueSet2, aVar2);
            aVar = aVar2;
        }
        if (this.f2884a != null) {
            z = this.f2884a.a(dimensionValueSet, measureValueSet);
        }
        if (z) {
            aVar.b();
            aVar.a(measureValueSet);
        } else {
            aVar.c();
            if (this.f2884a != null && this.f2884a.i()) {
                aVar.a(measureValueSet);
            }
        }
        super.c(null);
    }

    @Override // com.alibaba.appmonitor.event.d
    public synchronized JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject a2 = super.a();
        if (this.f2884a != null) {
            a2.put("isCommitDetail", (Object) String.valueOf(this.f2884a.i()));
        }
        JSONArray jSONArray = (JSONArray) com.alibaba.appmonitor.pool.a.a().a(ReuseJSONArray.class, new Object[0]);
        if (this.b != null) {
            for (Map.Entry<DimensionValueSet, a> entry : this.b.entrySet()) {
                JSONObject jSONObject = (JSONObject) com.alibaba.appmonitor.pool.a.a().a(ReuseJSONObject.class, new Object[0]);
                DimensionValueSet key = entry.getKey();
                a value = entry.getValue();
                Integer valueOf = Integer.valueOf(a.a(value));
                Integer valueOf2 = Integer.valueOf(a.b(value));
                jSONObject.put("count", (Object) valueOf);
                jSONObject.put("noise", (Object) valueOf2);
                jSONObject.put("dimensions", (Object) (key != null ? new HashMap(key.getMap()) : null));
                jSONObject.put("measures", (Object) value.a());
                jSONArray.add(jSONObject);
            }
        }
        a2.put("values", (Object) jSONArray);
        return a2;
    }

    @Override // com.alibaba.appmonitor.event.d, com.alibaba.appmonitor.pool.b
    public synchronized void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        super.clean();
        this.f2884a = null;
        for (DimensionValueSet dimensionValueSet : this.b.keySet()) {
            com.alibaba.appmonitor.pool.a.a().a((com.alibaba.appmonitor.pool.a) dimensionValueSet);
        }
        this.b.clear();
    }

    @Override // com.alibaba.appmonitor.event.d, com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        super.fill(objArr);
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.f2884a = com.alibaba.appmonitor.model.b.a().a(this.e, this.f);
    }

    /* loaded from: classes.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b = 0;
        private int c = 0;
        private List<MeasureValueSet> d = new ArrayList();

        static {
            kge.a(-1859187093);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cda755d1", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96a84d12", new Object[]{aVar})).intValue() : aVar.c;
        }

        public a() {
        }

        public void a(MeasureValueSet measureValueSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55864299", new Object[]{this, measureValueSet});
            } else if (measureValueSet == null) {
            } else {
                if (f.a(f.this) != null && f.a(f.this).i()) {
                    this.d.add(b(measureValueSet));
                } else if (this.d.isEmpty()) {
                    MeasureValueSet b = b(measureValueSet);
                    if (f.a(f.this) != null && f.a(f.this).h() != null) {
                        b.setBuckets(f.a(f.this).h().getMeasures());
                    }
                    this.d.add(b);
                } else {
                    this.d.get(0).merge(measureValueSet);
                }
            }
        }

        private MeasureValueSet b(MeasureValueSet measureValueSet) {
            List<Measure> measures;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MeasureValueSet) ipChange.ipc$dispatch("4b436c2d", new Object[]{this, measureValueSet});
            }
            MeasureValueSet measureValueSet2 = (MeasureValueSet) com.alibaba.appmonitor.pool.a.a().a(MeasureValueSet.class, new Object[0]);
            if (f.a(f.this) != null && f.a(f.this).h() != null && (measures = f.a(f.this).h().getMeasures()) != null) {
                int size = measures.size();
                for (int i = 0; i < size; i++) {
                    Measure measure = measures.get(i);
                    if (measure != null) {
                        MeasureValue measureValue = (MeasureValue) com.alibaba.appmonitor.pool.a.a().a(MeasureValue.class, new Object[0]);
                        MeasureValue value = measureValueSet.getValue(measure.getName());
                        if (value.getOffset() != null) {
                            measureValue.setOffset(value.getOffset().doubleValue());
                        }
                        measureValue.setValue(value.getValue());
                        measureValueSet2.setValue(measure.getName(), measureValue);
                    }
                }
            }
            return measureValueSet2;
        }

        public List<Map<String, Map<String, Object>>> a() {
            Map<String, MeasureValue> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
            }
            List<MeasureValueSet> list = this.d;
            if (list == null || list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                MeasureValueSet measureValueSet = this.d.get(i);
                if (measureValueSet != null && (map = measureValueSet.getMap()) != null && !map.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, MeasureValue> entry : map.entrySet()) {
                        HashMap hashMap2 = new HashMap();
                        String key = entry.getKey();
                        MeasureValue value = entry.getValue();
                        hashMap2.put("value", Double.valueOf(value.getValue()));
                        if (value.getOffset() != null) {
                            hashMap2.put("offset", value.getOffset());
                        }
                        Map<String, Double> buckets = value.getBuckets();
                        if (buckets != null) {
                            hashMap2.put("buckets", buckets);
                        }
                        hashMap.put(key, hashMap2);
                    }
                    arrayList.add(hashMap);
                }
            }
            return arrayList;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.b++;
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.c++;
            }
        }
    }
}

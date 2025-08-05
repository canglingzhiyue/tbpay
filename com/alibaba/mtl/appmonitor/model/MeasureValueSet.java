package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.appmonitor.pool.a;
import com.alibaba.appmonitor.pool.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class MeasureValueSet implements Parcelable, b, IMerge<MeasureValueSet> {
    public static final Parcelable.Creator<MeasureValueSet> CREATOR;
    private Map<String, MeasureValue> map = new LinkedHashMap();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static MeasureValueSet create() {
        return (MeasureValueSet) a.a().a(MeasureValueSet.class, new Object[0]);
    }

    @Deprecated
    public static MeasureValueSet create(int i) {
        return (MeasureValueSet) a.a().a(MeasureValueSet.class, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MeasureValueSet create(Map<String, Double> map) {
        MeasureValueSet measureValueSet = (MeasureValueSet) a.a().a(MeasureValueSet.class, new Object[0]);
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    Double d = map.get(str);
                    if (d != null) {
                        measureValueSet.map.put(str, a.a().a(MeasureValue.class, d));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return measureValueSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MeasureValueSet fromStringMap(Map<String, String> map) {
        MeasureValueSet measureValueSet = (MeasureValueSet) a.a().a(MeasureValueSet.class, new Object[0]);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Double d = toDouble(entry.getValue());
                if (d != null) {
                    measureValueSet.map.put(entry.getKey(), a.a().a(MeasureValue.class, d));
                }
            }
        }
        return measureValueSet;
    }

    private static Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MeasureValueSet setValue(String str, double d) {
        this.map.put(str, a.a().a(MeasureValue.class, Double.valueOf(d)));
        return this;
    }

    public void setValue(String str, MeasureValue measureValue) {
        this.map.put(str, measureValue);
    }

    public MeasureValue getValue(String str) {
        return this.map.get(str);
    }

    public Map<String, MeasureValue> getMap() {
        return this.map;
    }

    public void setMap(Map<String, MeasureValue> map) {
        this.map = map;
    }

    public boolean containValue(String str) {
        return this.map.containsKey(str);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // com.alibaba.mtl.appmonitor.model.IMerge
    public void merge(MeasureValueSet measureValueSet) {
        for (String str : this.map.keySet()) {
            this.map.get(str).merge(measureValueSet.getValue(str));
        }
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void clean() {
        for (MeasureValue measureValue : this.map.values()) {
            a.a().a((a) measureValue);
        }
        this.map.clear();
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        if (this.map == null) {
            this.map = new LinkedHashMap();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.map);
    }

    static MeasureValueSet readFromParcel(Parcel parcel) {
        try {
            MeasureValueSet create = create();
            try {
                create.map = parcel.readHashMap(DimensionValueSet.class.getClassLoader());
                return create;
            } catch (Throwable unused) {
                return create;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    static {
        kge.a(-116877826);
        kge.a(-1568559328);
        kge.a(1105107017);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MeasureValueSet>() { // from class: com.alibaba.mtl.appmonitor.model.MeasureValueSet.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public MeasureValueSet mo237createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MeasureValueSet) ipChange.ipc$dispatch("21f52cf0", new Object[]{this, parcel}) : MeasureValueSet.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public MeasureValueSet[] mo238newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MeasureValueSet[]) ipChange.ipc$dispatch("61faab99", new Object[]{this, new Integer(i)}) : new MeasureValueSet[i];
            }
        };
    }

    public void setBuckets(List<Measure> list) {
        if (list == null) {
            return;
        }
        for (String str : this.map.keySet()) {
            this.map.get(str).setBuckets(getMeasure(list, str));
        }
    }

    private Measure getMeasure(List<Measure> list, String str) {
        for (Measure measure : list) {
            if (str.equalsIgnoreCase(measure.getName())) {
                return measure;
            }
        }
        return null;
    }
}

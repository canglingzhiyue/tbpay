package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.apr;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class Measure implements Parcelable {
    public static final Parcelable.Creator<Measure> CREATOR;
    private static List<Double> nullList;
    private List<Double> bounds;
    protected Double constantValue;
    public String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Measure() {
        this.constantValue = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
    }

    static {
        kge.a(-1442202195);
        kge.a(1630535278);
        nullList = null;
        ArrayList arrayList = new ArrayList(1);
        nullList = arrayList;
        arrayList.add(null);
        CREATOR = new Parcelable.Creator<Measure>() { // from class: com.alibaba.mtl.appmonitor.model.Measure.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public Measure mo231createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Measure) ipChange.ipc$dispatch("c2989e21", new Object[]{this, parcel}) : Measure.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public Measure[] mo232newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Measure[]) ipChange.ipc$dispatch("dc97d5ca", new Object[]{this, new Integer(i)}) : new Measure[i];
            }
        };
    }

    public Measure(String str) {
        this(str, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
    }

    public Measure(String str, Double d, List<Double> list) {
        double d2 = mto.a.GEO_NOT_SUPPORT;
        this.constantValue = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        if (list != null) {
            if (list.removeAll(nullList)) {
                apr.c("bounds entity must not be null", new Object[0]);
            }
            Collections.sort(list);
            this.bounds = list;
        }
        this.name = str;
        this.constantValue = Double.valueOf(d != null ? d.doubleValue() : d2);
    }

    public Measure(String str, Double d) {
        this(str, d, null, null);
    }

    public Measure(String str, Double d, Double d2, Double d3) {
        this(str, d, null);
        if (d2 == null && d3 == null) {
            return;
        }
        setRange(d2, d3);
    }

    public void setRange(Double d, Double d2) {
        if (d == null || d2 == null) {
            apr.c("min or max must not be null", new Object[0]);
            return;
        }
        this.bounds = new ArrayList(2);
        this.bounds.add(d);
        this.bounds.add(d2);
    }

    public Double getMin() {
        List<Double> list = this.bounds;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.bounds.get(0);
    }

    public Double getMax() {
        List<Double> list = this.bounds;
        if (list == null || list.size() < 2) {
            return null;
        }
        List<Double> list2 = this.bounds;
        return list2.get(list2.size() - 1);
    }

    public List<Double> getBounds() {
        return this.bounds;
    }

    public String getName() {
        return this.name;
    }

    public Double getConstantValue() {
        return this.constantValue;
    }

    public void setConstantValue(Double d) {
        this.constantValue = d;
    }

    public boolean valid(MeasureValue measureValue) {
        Double valueOf = Double.valueOf(measureValue.getValue());
        if (valueOf != null) {
            if (getMin() != null && valueOf.doubleValue() < getMin().doubleValue()) {
                return false;
            }
            return getMax() == null || valueOf.doubleValue() < getMax().doubleValue();
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Measure measure = (Measure) obj;
        String str = this.name;
        if (str == null) {
            if (measure.name != null) {
                return false;
            }
        } else if (!str.equals(measure.name)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeList(this.bounds);
            parcel.writeString(this.name);
            parcel.writeInt(this.constantValue == null ? 0 : 1);
            if (this.constantValue == null) {
                return;
            }
            parcel.writeDouble(this.constantValue.doubleValue());
        } catch (Throwable th) {
            apr.b("writeToParcel", th, new Object[0]);
        }
    }

    static Measure readFromParcel(Parcel parcel) {
        try {
            return new Measure(parcel.readString(), !(parcel.readInt() == 0) ? Double.valueOf(parcel.readDouble()) : null, parcel.readArrayList(Measure.class.getClassLoader()));
        } catch (Throwable th) {
            th.printStackTrace();
            apr.b("readFromParcel", th, new Object[0]);
            return null;
        }
    }
}

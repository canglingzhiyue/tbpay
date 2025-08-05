package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.appmonitor.pool.a;
import com.alibaba.appmonitor.pool.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class MeasureValue implements Parcelable, b, IMerge<MeasureValue> {
    public static final Parcelable.Creator<MeasureValue> CREATOR;
    private List<Bucket> buckets;
    private boolean finish;
    private Double offset;
    private double value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public MeasureValue() {
    }

    @Deprecated
    public MeasureValue(double d) {
        this.value = d;
    }

    @Deprecated
    public MeasureValue(double d, double d2) {
        this.offset = Double.valueOf(d2);
        this.value = d;
        this.finish = false;
    }

    public static MeasureValue create() {
        return (MeasureValue) a.a().a(MeasureValue.class, new Object[0]);
    }

    public static MeasureValue create(double d) {
        return (MeasureValue) a.a().a(MeasureValue.class, Double.valueOf(d));
    }

    public static MeasureValue create(double d, double d2) {
        return (MeasureValue) a.a().a(MeasureValue.class, Double.valueOf(d), Double.valueOf(d2));
    }

    public Double getOffset() {
        return this.offset;
    }

    public boolean isFinish() {
        return this.finish;
    }

    public void setFinish(boolean z) {
        this.finish = z;
    }

    public void setOffset(double d) {
        this.offset = Double.valueOf(d);
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double d) {
        this.value = d;
    }

    @Override // com.alibaba.mtl.appmonitor.model.IMerge
    public synchronized void merge(MeasureValue measureValue) {
        if (measureValue == null) {
            return;
        }
        try {
            this.value += measureValue.getValue();
            if (measureValue.getOffset() != null) {
                if (this.offset == null) {
                    this.offset = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
                }
                this.offset = Double.valueOf(this.offset.doubleValue() + measureValue.getOffset().doubleValue());
            }
            Bucket bucket = getBucket(measureValue.getValue());
            if (bucket != null) {
                bucket.increase();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.alibaba.appmonitor.pool.b
    public synchronized void clean() {
        this.value = mto.a.GEO_NOT_SUPPORT;
        this.offset = null;
        this.finish = false;
        this.buckets = null;
    }

    @Override // com.alibaba.appmonitor.pool.b
    public synchronized void fill(Object... objArr) {
        if (objArr == null) {
            return;
        }
        if (objArr.length > 0) {
            this.value = ((Double) objArr[0]).doubleValue();
        }
        if (objArr.length > 1) {
            this.offset = (Double) objArr[1];
            this.finish = false;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeInt(this.finish ? 1 : 0);
            parcel.writeDouble(this.offset == null ? mto.a.GEO_NOT_SUPPORT : this.offset.doubleValue());
            parcel.writeDouble(this.value);
        } catch (Throwable unused) {
        }
    }

    static MeasureValue readFromParcel(Parcel parcel) {
        MeasureValue measureValue = null;
        try {
            boolean z = parcel.readInt() != 0;
            Double valueOf = Double.valueOf(parcel.readDouble());
            double readDouble = parcel.readDouble();
            measureValue = create();
            measureValue.finish = z;
            measureValue.offset = valueOf;
            measureValue.value = readDouble;
            return measureValue;
        } catch (Throwable th) {
            th.printStackTrace();
            return measureValue;
        }
    }

    static {
        kge.a(-475764796);
        kge.a(-1568559328);
        kge.a(1105107017);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MeasureValue>() { // from class: com.alibaba.mtl.appmonitor.model.MeasureValue.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public MeasureValue mo235createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MeasureValue) ipChange.ipc$dispatch("2606aae4", new Object[]{this, parcel}) : MeasureValue.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public MeasureValue[] mo236newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MeasureValue[]) ipChange.ipc$dispatch("6e54d4db", new Object[]{this, new Integer(i)}) : new MeasureValue[i];
            }
        };
    }

    public synchronized Map<String, Double> getBuckets() {
        if (this.buckets == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Bucket bucket : this.buckets) {
            if (Bucket.access$000(bucket) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(Bucket.access$100(bucket) == null ? "-∞" : Bucket.access$100(bucket));
                sb.append(",");
                sb.append(Bucket.access$200(bucket) == null ? "∞" : Bucket.access$200(bucket));
                hashMap.put(sb.toString(), Long.valueOf(Bucket.access$000(bucket)));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void setBuckets(Measure measure) {
        List<Double> bounds = measure.getBounds();
        if (bounds != null && bounds.size() >= 2) {
            if (this.buckets != null) {
                return;
            }
            this.buckets = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= bounds.size()) {
                    break;
                }
                this.buckets.add(new Bucket(bounds.get(i), bounds.get(i2)));
                i = i2;
            }
            Bucket bucket = getBucket(this.value);
            if (bucket != null) {
                bucket.increase();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class Bucket {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long count = 0;
        private Double max;
        private Double min;

        static {
            kge.a(-2064670998);
        }

        public static /* synthetic */ long access$000(Bucket bucket) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b5e5fc70", new Object[]{bucket})).longValue() : bucket.count;
        }

        public static /* synthetic */ Double access$100(Bucket bucket) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Double) ipChange.ipc$dispatch("4257ad83", new Object[]{bucket}) : bucket.min;
        }

        public static /* synthetic */ Double access$200(Bucket bucket) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Double) ipChange.ipc$dispatch("5b58ff22", new Object[]{bucket}) : bucket.max;
        }

        public Bucket(Double d, Double d2) {
            this.min = d;
            this.max = d2;
        }

        public boolean in(Double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f009fa3a", new Object[]{this, d})).booleanValue();
            }
            if (d == null) {
                return false;
            }
            Double d2 = this.min;
            Double d3 = this.max;
            if (d2 == null) {
                d2 = Double.valueOf(Double.MIN_VALUE);
            }
            if (d3 == null) {
                d3 = Double.valueOf(Double.MAX_VALUE);
            }
            return d.doubleValue() >= d2.doubleValue() && d.doubleValue() < d3.doubleValue();
        }

        public void increase() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71f711c9", new Object[]{this});
            } else {
                this.count++;
            }
        }
    }

    private Bucket getBucket(double d) {
        if (this.buckets != null) {
            for (int i = 0; i < this.buckets.size(); i++) {
                if (this.buckets.get(i).in(Double.valueOf(d))) {
                    return this.buckets.get(i);
                }
            }
            return null;
        }
        return null;
    }
}

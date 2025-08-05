package com.alibaba.ut.abtest.internal.bucketing;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class DefaultVariation implements Variation {
    public static final Parcelable.Creator<DefaultVariation> CREATOR;
    private static final String TAG = "DefaultVariation";
    private final String name;
    private final String value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DefaultVariation(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public String getName() {
        return this.name;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public int getValueAsInt(int i) {
        String str = this.value;
        if (str != null && str.length() != 0) {
            try {
                return Integer.parseInt(this.value);
            } catch (Exception e) {
                h.b(TAG, "变量 '" + this.name + "' 不能转换成 int 类型，变量值：" + this.value, e);
                com.alibaba.ut.abtest.internal.util.b.a("DefaultVariation.getValueAsInt", e);
            }
        }
        return i;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public long getValueAsLong(long j) {
        String str = this.value;
        if (str != null && str.length() != 0) {
            try {
                return Long.parseLong(this.value);
            } catch (Exception e) {
                h.b(TAG, "变量 '" + this.name + "' 不能转换成 long 类型，变量值：" + this.value, e);
                com.alibaba.ut.abtest.internal.util.b.a("DefaultVariation.getValueAsLong", e);
            }
        }
        return j;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public short getValueAsShort(short s) {
        String str = this.value;
        if (str != null && str.length() != 0) {
            try {
                return Short.parseShort(this.value);
            } catch (Exception e) {
                h.b(TAG, "变量 '" + this.name + "' 不能转换成 short 类型，变量值：" + this.value, e);
                com.alibaba.ut.abtest.internal.util.b.a("DefaultVariation.getValueAsShort", e);
            }
        }
        return s;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public double getValueAsDouble(double d) {
        String str = this.value;
        if (str != null && str.length() != 0) {
            try {
                return Double.parseDouble(this.value);
            } catch (Exception e) {
                h.b(TAG, "变量 '" + this.name + "' 不能转换成 double 类型，变量值：" + this.value, e);
                com.alibaba.ut.abtest.internal.util.b.a("DefaultVariation.getValueAsDouble", e);
            }
        }
        return d;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public float getValueAsFloat(float f) {
        String str = this.value;
        if (str != null && str.length() != 0) {
            try {
                return Float.parseFloat(this.value);
            } catch (Exception e) {
                h.b(TAG, "变量 '" + this.name + "' 不能转换成 float 类型，变量值：" + this.value, e);
                com.alibaba.ut.abtest.internal.util.b.a("DefaultVariation.getValueAsFloat", e);
            }
        }
        return f;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public String getValueAsString(String str) {
        String str2 = this.value;
        return (str2 == null || str2.length() == 0) ? str : this.value;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public boolean getValueAsBoolean(boolean z) {
        String str = this.value;
        if (str != null && str.length() != 0) {
            try {
                return Boolean.parseBoolean(this.value);
            } catch (Exception e) {
                h.b(TAG, "变量 '" + this.name + "' 不能转换成 boolean 类型，变量值：" + this.value, e);
                com.alibaba.ut.abtest.internal.util.b.a("DefaultVariation.getValueAsBoolean", e);
            }
        }
        return z;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public Object getValue(Object obj) {
        String str = this.value;
        return str != null ? str : obj;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.name);
            parcel.writeString(this.value);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("DefaultVariation.writeToParcel", th);
        }
    }

    static {
        kge.a(-355318514);
        kge.a(-1344899642);
        CREATOR = new Parcelable.Creator<DefaultVariation>() { // from class: com.alibaba.ut.abtest.internal.bucketing.DefaultVariation.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.ut.abtest.internal.bucketing.DefaultVariation] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DefaultVariation createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.ut.abtest.internal.bucketing.DefaultVariation[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DefaultVariation[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public DefaultVariation a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultVariation) ipChange.ipc$dispatch("5897fba8", new Object[]{this, parcel}) : new DefaultVariation(parcel.readString(), parcel.readString());
            }

            public DefaultVariation[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultVariation[]) ipChange.ipc$dispatch("e4d4ce99", new Object[]{this, new Integer(i)}) : new DefaultVariation[i];
            }
        };
    }
}

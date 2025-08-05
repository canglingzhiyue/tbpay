package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class Dimension implements Parcelable {
    public static final Parcelable.Creator<Dimension> CREATOR;
    static final String DEFAULT_NULL_VALUE = "null";
    protected String constantValue;
    protected String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Dimension() {
        this.constantValue = "null";
    }

    public Dimension(String str) {
        this(str, null);
    }

    public Dimension(String str, String str2) {
        this.constantValue = "null";
        this.name = str;
        this.constantValue = str2 == null ? "null" : str2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getConstantValue() {
        return this.constantValue;
    }

    public void setConstantValue(String str) {
        this.constantValue = str;
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
        Dimension dimension = (Dimension) obj;
        String str = this.name;
        if (str == null) {
            if (dimension.name != null) {
                return false;
            }
        } else if (!str.equals(dimension.name)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.constantValue);
        parcel.writeString(this.name);
    }

    static Dimension readFromParcel(Parcel parcel) {
        try {
            return new Dimension(parcel.readString(), parcel.readString());
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        kge.a(439528949);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<Dimension>() { // from class: com.alibaba.mtl.appmonitor.model.Dimension.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public Dimension mo225createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Dimension) ipChange.ipc$dispatch("277c0619", new Object[]{this, parcel}) : Dimension.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public Dimension[] mo226newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Dimension[]) ipChange.ipc$dispatch("be8bf782", new Object[]{this, new Integer(i)}) : new Dimension[i];
            }
        };
    }
}

package com.heytap.msp.keychain;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    public int f7247a;
    public String b;
    public Bundle c;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<b> {
        static {
            kge.a(536701617);
            kge.a(-1712646186);
        }

        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    static {
        kge.a(407261940);
        kge.a(1630535278);
        CREATOR = new a();
    }

    public b() {
    }

    public b(Parcel parcel) {
        this.f7247a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Response{code='" + this.f7247a + "', message='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7247a);
        parcel.writeString(this.b);
        parcel.writeBundle(this.c);
    }
}

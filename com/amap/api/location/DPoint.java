package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;
import tb.mto;

/* loaded from: classes3.dex */
public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new Parcelable.Creator<DPoint>() { // from class: com.amap.api.location.DPoint.1
        private static DPoint a(Parcel parcel) {
            return new DPoint(parcel);
        }

        private static DPoint[] a(int i) {
            return new DPoint[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint[] newArray(int i) {
            return a(i);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private double f6391a;
    private double b;

    public DPoint() {
        this.f6391a = mto.a.GEO_NOT_SUPPORT;
        this.b = mto.a.GEO_NOT_SUPPORT;
    }

    public DPoint(double d, double d2) {
        this.f6391a = mto.a.GEO_NOT_SUPPORT;
        this.b = mto.a.GEO_NOT_SUPPORT;
        d2 = d2 > 180.0d ? 180.0d : d2;
        d2 = d2 < -180.0d ? -180.0d : d2;
        d = d > 90.0d ? 90.0d : d;
        d = d < -90.0d ? -90.0d : d;
        this.f6391a = d2;
        this.b = d;
    }

    protected DPoint(Parcel parcel) {
        this.f6391a = mto.a.GEO_NOT_SUPPORT;
        this.b = mto.a.GEO_NOT_SUPPORT;
        this.f6391a = parcel.readDouble();
        this.b = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DPoint)) {
            return false;
        }
        DPoint dPoint = (DPoint) obj;
        return this.b == dPoint.b && this.f6391a == dPoint.f6391a;
    }

    public double getLatitude() {
        return this.b;
    }

    public double getLongitude() {
        return this.f6391a;
    }

    public int hashCode() {
        return Double.valueOf((this.b + this.f6391a) * 1000000.0d).intValue();
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.b = d;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        }
        if (d < -180.0d) {
            d = -180.0d;
        }
        this.f6391a = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f6391a);
        parcel.writeDouble(this.b);
    }
}

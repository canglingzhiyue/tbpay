package com.loc;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class eq implements Parcelable {
    public static final Parcelable.Creator<eq> CREATOR = new Parcelable.Creator<eq>() { // from class: com.loc.eq.1
        private static eq a(Parcel parcel) {
            eq eqVar = new eq();
            eqVar.c(parcel.readString());
            eqVar.d(parcel.readString());
            eqVar.e(parcel.readString());
            eqVar.f(parcel.readString());
            eqVar.b(parcel.readString());
            eqVar.c(parcel.readLong());
            eqVar.d(parcel.readLong());
            eqVar.a(parcel.readLong());
            eqVar.b(parcel.readLong());
            eqVar.a(parcel.readString());
            return eqVar;
        }

        private static eq[] a(int i) {
            return new eq[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ eq createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ eq[] newArray(int i) {
            return a(i);
        }
    };
    private String e;
    private String f;

    /* renamed from: a  reason: collision with root package name */
    private long f7765a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private String g = "first";
    private String h = "";
    private String i = "";
    private String j = null;

    public final long a() {
        long j = this.d;
        long j2 = this.c;
        if (j - j2 <= 0) {
            return 0L;
        }
        return j - j2;
    }

    public final void a(long j) {
        this.c = j;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final String b() {
        return this.i;
    }

    public final void b(long j) {
        this.d = j;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final String c() {
        return this.j;
    }

    public final void c(long j) {
        this.f7765a = j;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final String d() {
        return this.e;
    }

    public final void d(long j) {
        this.b = j;
    }

    public final void d(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f;
    }

    public final void e(String str) {
        this.g = str;
    }

    public final String f() {
        return this.g;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final String g() {
        return this.h;
    }

    public final long h() {
        long j = this.b;
        long j2 = this.f7765a;
        if (j <= j2) {
            return 0L;
        }
        return j - j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.j);
            parcel.writeLong(this.f7765a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeString(this.i);
        } catch (Throwable unused) {
        }
    }
}

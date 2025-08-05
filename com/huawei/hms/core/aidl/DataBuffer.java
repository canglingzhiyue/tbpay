package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new a();
    public String URI;

    /* renamed from: a  reason: collision with root package name */
    private int f7408a;
    private Bundle b;
    public Bundle header;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator<DataBuffer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DataBuffer[] newArray(int i) {
            return new DataBuffer[i];
        }
    }

    public DataBuffer() {
        this.header = null;
        this.f7408a = 1;
        this.b = null;
    }

    private DataBuffer(Parcel parcel) {
        this.header = null;
        this.f7408a = 1;
        this.b = null;
        a(parcel);
    }

    /* synthetic */ DataBuffer(Parcel parcel, a aVar) {
        this(parcel);
    }

    public DataBuffer(String str) {
        this.header = null;
        this.f7408a = 1;
        this.b = null;
        this.URI = str;
    }

    public DataBuffer(String str, int i) {
        this.header = null;
        this.b = null;
        this.URI = str;
        this.f7408a = i;
    }

    private static ClassLoader a(Class cls) {
        return cls.getClassLoader();
    }

    private void a(Parcel parcel) {
        this.f7408a = parcel.readInt();
        this.URI = parcel.readString();
        this.header = parcel.readBundle(a(Bundle.class));
        this.b = parcel.readBundle(a(Bundle.class));
    }

    public DataBuffer addBody(Bundle bundle) {
        this.b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.b;
    }

    public int getBodySize() {
        return this.b == null ? 0 : 1;
    }

    public int getProtocol() {
        return this.f7408a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7408a);
        parcel.writeString(this.URI);
        parcel.writeBundle(this.header);
        parcel.writeBundle(this.b);
    }
}

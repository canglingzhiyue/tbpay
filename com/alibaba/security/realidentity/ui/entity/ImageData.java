package com.alibaba.security.realidentity.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ImageData implements Parcelable {
    public static final Parcelable.Creator<ImageData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f3568a;
    public int b;
    public String c;
    public String d;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<ImageData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ImageData a(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageData) ipChange.ipc$dispatch("b463d927", new Object[]{this, parcel}) : new ImageData(parcel);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.security.realidentity.ui.entity.ImageData] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImageData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.security.realidentity.ui.entity.ImageData[]] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImageData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
        }

        public ImageData[] a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageData[]) ipChange.ipc$dispatch("fc99cc98", new Object[]{this, new Integer(i)}) : new ImageData[i];
        }
    }

    public ImageData() {
    }

    public void a(int i) {
        this.b = i;
    }

    public void b(String str) {
        this.f3568a = str;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ImageData{source='" + this.d + "', path='" + this.f3568a + "', type=" + this.b + ", gestureUrl='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3568a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public ImageData(Parcel parcel) {
        this.f3568a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readString();
    }

    public void a(String str) {
        this.c = str;
    }

    public String b() {
        return this.f3568a;
    }

    public void c(String str) {
        this.d = str;
    }

    public String a() {
        return this.c;
    }
}

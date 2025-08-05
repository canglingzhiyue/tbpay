package com.alibaba.security.realidentity.service.camera.size;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.SparseArrayCompat;
import com.alibaba.security.realidentity.c3;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AspectRatio implements Parcelable, Comparable<AspectRatio> {

    /* renamed from: a  reason: collision with root package name */
    public final int f3517a;
    public final int b;
    public static final AspectRatio c = new AspectRatio(4, 3);
    public static final SparseArrayCompat<SparseArrayCompat<AspectRatio>> d = new SparseArrayCompat<>(16);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a();

    public AspectRatio(int i, int i2) {
        this.f3517a = i;
        this.b = i2;
    }

    public static AspectRatio a(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return b(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed aspect ratio: " + str, e);
            }
        }
        throw new IllegalArgumentException("Malformed aspect ratio: " + str);
    }

    public static AspectRatio b(int i, int i2) {
        int a2 = a(i, i2);
        int i3 = i / a2;
        int i4 = i2 / a2;
        SparseArrayCompat<AspectRatio> sparseArrayCompat = d.get(i3);
        if (sparseArrayCompat == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            SparseArrayCompat<AspectRatio> sparseArrayCompat2 = new SparseArrayCompat<>();
            sparseArrayCompat2.put(i4, aspectRatio);
            d.put(i3, sparseArrayCompat2);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = sparseArrayCompat.get(i4);
        if (aspectRatio2 != null) {
            return aspectRatio2;
        }
        AspectRatio aspectRatio3 = new AspectRatio(i3, i4);
        sparseArrayCompat.put(i4, aspectRatio3);
        return aspectRatio3;
    }

    public AspectRatio c() {
        return b(this.b, this.f3517a);
    }

    public float d() {
        return this.f3517a / this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatio) {
            AspectRatio aspectRatio = (AspectRatio) obj;
            if (this.f3517a == aspectRatio.f3517a && this.b == aspectRatio.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.f3517a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f3517a + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3517a);
        parcel.writeInt(this.b);
    }

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<AspectRatio> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AspectRatio a(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AspectRatio) ipChange.ipc$dispatch("ab966206", new Object[]{this, parcel}) : AspectRatio.b(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.security.realidentity.service.camera.size.AspectRatio] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AspectRatio createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.security.realidentity.service.camera.size.AspectRatio[]] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AspectRatio[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
        }

        public AspectRatio[] a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AspectRatio[]) ipChange.ipc$dispatch("f34db3f7", new Object[]{this, new Integer(i)}) : new AspectRatio[i];
        }
    }

    public int a() {
        return this.f3517a;
    }

    public boolean a(c3 c3Var) {
        int a2 = a(c3Var.b(), c3Var.a());
        return this.f3517a == c3Var.b() / a2 && this.b == c3Var.a() / a2;
    }

    public int b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return d() - aspectRatio.d() > 0.0f ? 1 : -1;
    }

    public static int a(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i != 0) {
                i2 = i4 % i;
            } else {
                return i4;
            }
        }
    }
}

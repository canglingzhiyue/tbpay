package com.taobao.interact.publish.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR;
    private int aspectRatioX;
    private int aspectRatioY;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAspectRatioX() {
        return this.aspectRatioX;
    }

    public void setAspectRatioX(int i) {
        this.aspectRatioX = i;
    }

    public int getAspectRatioY() {
        return this.aspectRatioY;
    }

    public void setAspectRatioY(int i) {
        this.aspectRatioY = i;
    }

    public AspectRatio() {
    }

    public AspectRatio(int i, int i2) {
        this.aspectRatioX = i;
        this.aspectRatioY = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aspectRatioX);
        parcel.writeInt(this.aspectRatioY);
    }

    static {
        kge.a(-147482253);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<AspectRatio>() { // from class: com.taobao.interact.publish.service.AspectRatio.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.interact.publish.service.AspectRatio] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AspectRatio createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.interact.publish.service.AspectRatio[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AspectRatio[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public AspectRatio[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AspectRatio[]) ipChange.ipc$dispatch("2c1edd4", new Object[]{this, new Integer(i)}) : new AspectRatio[i];
            }

            public AspectRatio a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (AspectRatio) ipChange.ipc$dispatch("2bf851a3", new Object[]{this, parcel});
                }
                AspectRatio aspectRatio = new AspectRatio();
                aspectRatio.aspectRatioX = parcel.readInt();
                aspectRatio.aspectRatioY = parcel.readInt();
                return aspectRatio;
            }
        };
    }
}

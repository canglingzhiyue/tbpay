package com.taobao.android.pissarro.external;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class AspectRatio implements Parcelable, Serializable {
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

    public int getAspectRatioY() {
        return this.aspectRatioY;
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
        kge.a(-726276732);
        kge.a(1630535278);
        kge.a(1028243835);
        CREATOR = new Parcelable.Creator<AspectRatio>() { // from class: com.taobao.android.pissarro.external.AspectRatio.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.pissarro.external.AspectRatio] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AspectRatio createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.android.pissarro.external.AspectRatio[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AspectRatio[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public AspectRatio[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AspectRatio[]) ipChange.ipc$dispatch("174d880b", new Object[]{this, new Integer(i)}) : new AspectRatio[i];
            }

            public AspectRatio a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AspectRatio) ipChange.ipc$dispatch("14e39e1c", new Object[]{this, parcel}) : new AspectRatio(parcel.readInt(), parcel.readInt());
            }
        };
    }
}

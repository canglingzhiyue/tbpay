package com.taobao.interact.publish.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class BitmapSize implements Parcelable {
    public static final Parcelable.Creator<BitmapSize> CREATOR;
    private int height;
    private int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BitmapSize() {
    }

    public BitmapSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    static {
        kge.a(1403216624);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<BitmapSize>() { // from class: com.taobao.interact.publish.service.BitmapSize.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.interact.publish.service.BitmapSize] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BitmapSize createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.interact.publish.service.BitmapSize[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BitmapSize[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public BitmapSize[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BitmapSize[]) ipChange.ipc$dispatch("8480dd1f", new Object[]{this, new Integer(i)}) : new BitmapSize[i];
            }

            public BitmapSize a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BitmapSize) ipChange.ipc$dispatch("8e174370", new Object[]{this, parcel});
                }
                BitmapSize bitmapSize = new BitmapSize();
                bitmapSize.width = parcel.readInt();
                bitmapSize.height = parcel.readInt();
                return bitmapSize;
            }
        };
    }
}

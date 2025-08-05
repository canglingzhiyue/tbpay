package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class MaSizeType implements Parcelable {
    public static final Parcelable.Creator<MaSizeType> CREATOR;
    public int size;
    public int x;
    public int y;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MaSizeType(int i, int i2, int i3) {
        this.x = 0;
        this.y = 0;
        this.size = 0;
        this.x = i;
        this.y = i2;
        this.size = i3;
    }

    public MaSizeType(int i, int i2) {
        this.x = 0;
        this.y = 0;
        this.size = 0;
        this.x = i;
        this.y = i2;
    }

    public MaSizeType(int i) {
        this.x = 0;
        this.y = 0;
        this.size = 0;
        this.size = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.size);
    }

    public void readFromParcel(Parcel parcel) {
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.size = parcel.readInt();
    }

    static {
        kge.a(-1438357925);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MaSizeType>() { // from class: com.taobao.taobao.scancode.encode.aidlservice.MaSizeType.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taobao.scancode.encode.aidlservice.MaSizeType, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MaSizeType createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taobao.scancode.encode.aidlservice.MaSizeType[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MaSizeType[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MaSizeType[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MaSizeType[]) ipChange.ipc$dispatch("57bf0e14", new Object[]{this, new Integer(i)}) : new MaSizeType[i];
            }

            public MaSizeType a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MaSizeType) ipChange.ipc$dispatch("196a8325", new Object[]{this, parcel}) : new MaSizeType(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }
        };
    }
}

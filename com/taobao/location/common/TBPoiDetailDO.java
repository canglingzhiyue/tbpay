package com.taobao.location.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class TBPoiDetailDO implements Parcelable {
    public static final Parcelable.Creator<TBPoiDetailDO> CREATOR;
    public String address;
    public String direction;
    public float distance;
    public String latitude;
    public String longitude;
    public String name;
    public String tel;
    public String type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TBPoiDetailDO() {
    }

    private TBPoiDetailDO(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.tel);
        parcel.writeFloat(this.distance);
        parcel.writeString(this.direction);
        parcel.writeString(this.address);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
    }

    public void readFromParcel(Parcel parcel) {
        this.name = parcel.readString();
        this.type = parcel.readString();
        this.tel = parcel.readString();
        this.distance = parcel.readFloat();
        this.direction = parcel.readString();
        this.address = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
    }

    static {
        kge.a(-1273608869);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TBPoiDetailDO>() { // from class: com.taobao.location.common.TBPoiDetailDO.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.location.common.TBPoiDetailDO, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBPoiDetailDO createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.location.common.TBPoiDetailDO[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBPoiDetailDO[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TBPoiDetailDO a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBPoiDetailDO) ipChange.ipc$dispatch("45ceee25", new Object[]{this, parcel}) : new TBPoiDetailDO(parcel);
            }

            public TBPoiDetailDO[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBPoiDetailDO[]) ipChange.ipc$dispatch("cb1d3714", new Object[]{this, new Integer(i)}) : new TBPoiDetailDO[i];
            }
        };
    }
}

package com.taobao.passivelocation.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class LocationDTO implements Parcelable {
    public static final Parcelable.Creator<LocationDTO> CREATOR;
    public Integer accuracy;
    public String cityCode;
    public String cityName;
    public boolean isDefaultPostion;
    public boolean isLocal;
    public boolean isNavSuccess;
    public boolean isNoNetwork;
    public boolean isSwitched;
    public String latitude;
    public String longitude;
    public String msg;
    public String poi;
    public String result;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isNavSuccess() {
        return this.isNavSuccess;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public LocationDTO() {
        this.isNavSuccess = false;
        this.isSwitched = false;
        this.isLocal = false;
        this.isDefaultPostion = false;
        this.isNoNetwork = false;
        this.accuracy = 0;
    }

    private LocationDTO(Parcel parcel) {
        this.isNavSuccess = false;
        this.isSwitched = false;
        this.isLocal = false;
        this.isDefaultPostion = false;
        this.isNoNetwork = false;
        this.accuracy = 0;
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.result);
        parcel.writeString(this.msg);
        parcel.writeByte(this.isNavSuccess ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSwitched ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLocal ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDefaultPostion ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isNoNetwork ? (byte) 1 : (byte) 0);
        parcel.writeString(this.cityCode);
        parcel.writeString(this.cityName);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        parcel.writeInt(this.accuracy.intValue());
        parcel.writeString(this.poi);
    }

    public void readFromParcel(Parcel parcel) {
        this.result = parcel.readString();
        this.msg = parcel.readString();
        boolean z = true;
        this.isNavSuccess = parcel.readByte() != 0;
        this.isSwitched = parcel.readByte() != 0;
        this.isLocal = parcel.readByte() != 0;
        this.isDefaultPostion = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.isNoNetwork = z;
        this.cityCode = parcel.readString();
        this.cityName = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
        this.accuracy = Integer.valueOf(parcel.readInt());
        this.poi = parcel.readString();
    }

    static {
        kge.a(-1960066831);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<LocationDTO>() { // from class: com.taobao.passivelocation.aidl.LocationDTO.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public LocationDTO mo1196createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LocationDTO) ipChange.ipc$dispatch("4a120e97", new Object[]{this, parcel}) : new LocationDTO(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public LocationDTO[] mo1197newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LocationDTO[]) ipChange.ipc$dispatch("95004a4e", new Object[]{this, new Integer(i)}) : new LocationDTO[i];
            }
        };
    }
}

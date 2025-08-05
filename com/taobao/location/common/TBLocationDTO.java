package com.taobao.location.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TBLocationDTO implements Parcelable {
    public static final Parcelable.Creator<TBLocationDTO> CREATOR;
    private static final String LOG = "TBLocationDTO";
    public Integer accuracy;
    public String address;
    public Double altitude;
    public String areaCode;
    public String areaName;
    public String cityCode;
    public String cityName;
    public String countryCode;
    public String countryName;
    public Integer errorCode;
    public boolean isNavSuccess;
    public String latitude;
    public Integer locationType;
    public String longitude;
    public List<TBPoiDetailDO> pois;
    public String provinceCode;
    public String provinceName;
    public Long timeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isNavSuccess() {
        return this.isNavSuccess;
    }

    public Integer getAccuracy() {
        return this.accuracy;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getAddress() {
        return this.address;
    }

    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public Integer getLocationType() {
        return this.locationType;
    }

    public TBLocationDTO() {
        this.isNavSuccess = false;
        this.pois = new ArrayList();
    }

    private TBLocationDTO(Parcel parcel) {
        this.isNavSuccess = false;
        this.pois = new ArrayList();
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.provinceCode);
        parcel.writeString(this.provinceName);
        parcel.writeString(this.cityCode);
        parcel.writeString(this.cityName);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.areaName);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        parcel.writeString(this.address);
        parcel.writeLong(this.timeStamp.longValue());
        parcel.writeInt(this.accuracy.intValue());
        parcel.writeTypedList(this.pois);
        parcel.writeByte(this.isNavSuccess ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.errorCode.intValue());
        parcel.writeInt(this.locationType.intValue());
        parcel.writeString(this.countryCode);
        parcel.writeString(this.countryName);
    }

    public void readFromParcel(Parcel parcel) {
        this.provinceCode = parcel.readString();
        this.provinceName = parcel.readString();
        this.cityCode = parcel.readString();
        this.cityName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
        this.address = parcel.readString();
        this.timeStamp = Long.valueOf(parcel.readLong());
        this.accuracy = Integer.valueOf(parcel.readInt());
        parcel.readTypedList(this.pois, TBPoiDetailDO.CREATOR);
        this.isNavSuccess = parcel.readByte() != 0;
        this.errorCode = Integer.valueOf(parcel.readInt());
        this.locationType = Integer.valueOf(parcel.readInt());
        this.countryCode = parcel.readString();
        this.countryName = parcel.readString();
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    static {
        kge.a(-1293280705);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TBLocationDTO>() { // from class: com.taobao.location.common.TBLocationDTO.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.location.common.TBLocationDTO, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBLocationDTO createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.location.common.TBLocationDTO[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBLocationDTO[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TBLocationDTO a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBLocationDTO) ipChange.ipc$dispatch("2175b5c1", new Object[]{this, parcel}) : new TBLocationDTO(parcel);
            }

            public TBLocationDTO[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBLocationDTO[]) ipChange.ipc$dispatch("a6c3feb0", new Object[]{this, new Integer(i)}) : new TBLocationDTO[i];
            }
        };
    }
}

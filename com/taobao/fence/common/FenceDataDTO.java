package com.taobao.fence.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class FenceDataDTO implements Parcelable {
    public static final Parcelable.Creator<FenceDataDTO> CREATOR;
    private static final String LOG = "FenceDataDTO";
    public int errorCode;
    public String errorMsg;
    public String ibeaconStr;
    public String locationStr;
    public boolean success;
    public String wifiStr;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FenceDataDTO(boolean z, ResultEnums resultEnums) {
        this.success = z;
        if (resultEnums != null) {
            this.errorCode = resultEnums.code;
            this.errorMsg = resultEnums.message;
        }
    }

    private FenceDataDTO(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.success ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.locationStr);
        parcel.writeString(this.wifiStr);
        parcel.writeString(this.ibeaconStr);
    }

    public void readFromParcel(Parcel parcel) {
        this.success = parcel.readByte() != 0;
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
        this.locationStr = parcel.readString();
        this.wifiStr = parcel.readString();
        this.ibeaconStr = parcel.readString();
    }

    public ContentData getLocation() {
        String str = this.locationStr;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return (ContentData) JSON.parseObject(this.locationStr, ContentData.class);
    }

    public ContentData getWifi() {
        String str = this.wifiStr;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return (ContentData) JSON.parseObject(this.wifiStr, ContentData.class);
    }

    public ContentData getIbeacon() {
        String str = this.ibeaconStr;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return (ContentData) JSON.parseObject(this.ibeaconStr, ContentData.class);
    }

    static {
        kge.a(708876407);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<FenceDataDTO>() { // from class: com.taobao.fence.common.FenceDataDTO.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public FenceDataDTO mo1062createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FenceDataDTO) ipChange.ipc$dispatch("778c0e17", new Object[]{this, parcel}) : new FenceDataDTO(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public FenceDataDTO[] mo1063newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FenceDataDTO[]) ipChange.ipc$dispatch("50238240", new Object[]{this, new Integer(i)}) : new FenceDataDTO[i];
            }
        };
    }
}

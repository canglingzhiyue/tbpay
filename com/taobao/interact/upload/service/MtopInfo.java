package com.taobao.interact.upload.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopInfo implements Parcelable {
    public static final Parcelable.Creator<MtopInfo> CREATOR;
    private String bizCode;
    private String ownerNick;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public String getOwnerNick() {
        return this.ownerNick;
    }

    public void setOwnerNick(String str) {
        this.ownerNick = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bizCode);
        parcel.writeString(this.ownerNick);
    }

    static {
        kge.a(958949496);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MtopInfo>() { // from class: com.taobao.interact.upload.service.MtopInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.interact.upload.service.MtopInfo, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MtopInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.interact.upload.service.MtopInfo[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MtopInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MtopInfo[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MtopInfo[]) ipChange.ipc$dispatch("fe28356f", new Object[]{this, new Integer(i)}) : new MtopInfo[i];
            }

            public MtopInfo a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MtopInfo) ipChange.ipc$dispatch("d0ed8be", new Object[]{this, parcel});
                }
                MtopInfo mtopInfo = new MtopInfo();
                mtopInfo.bizCode = parcel.readString();
                mtopInfo.ownerNick = parcel.readString();
                return mtopInfo;
            }
        };
    }
}

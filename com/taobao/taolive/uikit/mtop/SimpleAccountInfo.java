package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class SimpleAccountInfo implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<SimpleAccountInfo> CREATOR;
    public String accountDes;
    public String accountExplain;
    public long accountId;
    public String accountNick;
    public String accountUrl;
    public String headImg;
    public String level;
    public String levelLogo;
    public String shop;
    public String shopLogoTxt;
    public String tmall;
    public boolean v;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SimpleAccountInfo() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.accountId);
        parcel.writeString(this.accountNick);
        parcel.writeString(this.headImg);
        parcel.writeString(this.accountDes);
        parcel.writeString(this.accountExplain);
        parcel.writeString(this.accountUrl);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
    }

    protected SimpleAccountInfo(Parcel parcel) {
        this.accountId = parcel.readLong();
        this.accountNick = parcel.readString();
        this.headImg = parcel.readString();
        this.accountDes = parcel.readString();
        this.accountExplain = parcel.readString();
        this.accountUrl = parcel.readString();
        this.v = parcel.readByte() != 0;
    }

    static {
        kge.a(-486563005);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<SimpleAccountInfo>() { // from class: com.taobao.taolive.uikit.mtop.SimpleAccountInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.uikit.mtop.SimpleAccountInfo] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SimpleAccountInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taolive.uikit.mtop.SimpleAccountInfo[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SimpleAccountInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public SimpleAccountInfo a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SimpleAccountInfo) ipChange.ipc$dispatch("b96f81d3", new Object[]{this, parcel}) : new SimpleAccountInfo(parcel);
            }

            public SimpleAccountInfo[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SimpleAccountInfo[]) ipChange.ipc$dispatch("90391e04", new Object[]{this, new Integer(i)}) : new SimpleAccountInfo[i];
            }
        };
    }
}

package com.ali.user.mobile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class RegionInfo implements Parcelable {
    public static final Parcelable.Creator<RegionInfo> CREATOR;
    public String character;
    public String checkPattern;
    public String code;
    public String domain;
    public boolean isDisplayLetter;
    public String name;
    public String pinyin;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RegionInfo() {
    }

    public RegionInfo(Parcel parcel) {
        this.character = parcel.readString();
        this.name = parcel.readString();
        this.pinyin = parcel.readString();
        this.code = parcel.readString();
        this.checkPattern = parcel.readString();
        this.domain = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.isDisplayLetter = zArr[0];
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.character);
        parcel.writeString(this.name);
        parcel.writeString(this.pinyin);
        parcel.writeString(this.code);
        parcel.writeString(this.checkPattern);
        parcel.writeString(this.domain);
        parcel.writeBooleanArray(new boolean[]{this.isDisplayLetter});
    }

    static {
        kge.a(1817719216);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<RegionInfo>() { // from class: com.ali.user.mobile.model.RegionInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public RegionInfo[] mo106newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RegionInfo[]) ipChange.ipc$dispatch("50ff1027", new Object[]{this, new Integer(i)}) : new RegionInfo[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public RegionInfo mo105createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RegionInfo) ipChange.ipc$dispatch("78679bfe", new Object[]{this, parcel}) : new RegionInfo(parcel);
            }
        };
    }
}

package com.alibaba.ariver.app.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class EntryInfo implements Parcelable {
    public static final Parcelable.Creator<EntryInfo> CREATOR;
    public String desc;
    public JSONObject extraInfo;
    public String iconUrl;
    public boolean isOffline;
    public String slogan;
    public String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EntryInfo() {
    }

    public EntryInfo(String str, String str2, String str3, boolean z) {
        this.title = str;
        this.iconUrl = str2;
        this.slogan = str3;
        this.isOffline = z;
    }

    public EntryInfo(Parcel parcel) {
        this.title = parcel.readString();
        this.iconUrl = parcel.readString();
        this.slogan = parcel.readString();
        this.desc = parcel.readString();
        this.isOffline = parcel.readByte() != 1 ? false : true;
        this.extraInfo = (JSONObject) parcel.readSerializable();
    }

    static {
        kge.a(-153674150);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<EntryInfo>() { // from class: com.alibaba.ariver.app.api.EntryInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public EntryInfo mo156createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (EntryInfo) ipChange.ipc$dispatch("3dc64494", new Object[]{this, parcel}) : new EntryInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public EntryInfo[] mo157newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (EntryInfo[]) ipChange.ipc$dispatch("165db8bd", new Object[]{this, new Integer(i)}) : new EntryInfo[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.slogan);
        parcel.writeString(this.desc);
        parcel.writeByte((byte) (!this.isOffline ? 1 : 0));
        parcel.writeSerializable(this.extraInfo);
    }

    public String toString() {
        return "EntryInfo{title='" + this.title + "', iconUrl='" + this.iconUrl + "', slogan='" + this.slogan + "', desc='" + this.desc + "', extraInfo='" + this.extraInfo + "'}";
    }
}

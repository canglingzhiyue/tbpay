package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class HpBannerFrontData implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<HpBannerFrontData> CREATOR;
    public static final String TYPE_LIVE = "LIVE";
    public static final String TYPE_PIC = "PIC";
    public LiveInfoItem liveVideoDo;
    public String pic;
    public String picUrl;
    public String scm;
    public String spm;
    public String type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HpBannerFrontData() {
        this.type = "";
        this.pic = "";
        this.picUrl = "";
    }

    public HpBannerFrontData(Parcel parcel) {
        this.type = "";
        this.pic = "";
        this.picUrl = "";
        this.type = parcel.readString();
        this.pic = parcel.readString();
        this.picUrl = parcel.readString();
        this.liveVideoDo = (LiveInfoItem) parcel.readParcelable(LiveInfoItem.class.getClassLoader());
    }

    static {
        kge.a(-737329831);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<HpBannerFrontData>() { // from class: com.taobao.taolive.uikit.mtop.HpBannerFrontData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.uikit.mtop.HpBannerFrontData] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ HpBannerFrontData createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taolive.uikit.mtop.HpBannerFrontData[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ HpBannerFrontData[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public HpBannerFrontData a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (HpBannerFrontData) ipChange.ipc$dispatch("ea152a7d", new Object[]{this, parcel}) : new HpBannerFrontData(parcel);
            }

            public HpBannerFrontData[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (HpBannerFrontData[]) ipChange.ipc$dispatch("c0dec6ae", new Object[]{this, new Integer(i)}) : new HpBannerFrontData[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.pic);
        parcel.writeString(this.picUrl);
        parcel.writeParcelable(this.liveVideoDo, i);
    }
}

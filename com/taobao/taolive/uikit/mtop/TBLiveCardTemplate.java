package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TBLiveCardTemplate implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<TBLiveCardTemplate> CREATOR;
    public String name4Android;
    public String url4Android;
    public String version4Android;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TBLiveCardTemplate() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name4Android);
        parcel.writeString(this.url4Android);
        parcel.writeString(this.version4Android);
    }

    protected TBLiveCardTemplate(Parcel parcel) {
        this.name4Android = parcel.readString();
        this.url4Android = parcel.readString();
        this.version4Android = parcel.readString();
    }

    static {
        kge.a(-829635446);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator() { // from class: com.taobao.taolive.uikit.mtop.TBLiveCardTemplate.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Object[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TBLiveCardTemplate a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBLiveCardTemplate) ipChange.ipc$dispatch("55e89fd6", new Object[]{this, parcel}) : new TBLiveCardTemplate(parcel);
            }

            public TBLiveCardTemplate[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBLiveCardTemplate[]) ipChange.ipc$dispatch("585289c5", new Object[]{this, new Integer(i)}) : new TBLiveCardTemplate[i];
            }
        };
    }
}

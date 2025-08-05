package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class QualitySelectItem implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<QualitySelectItem> CREATOR;
    public String artpUrl;
    public String auth_key;
    public String definition;
    public String flvUrl;
    public String h265Url;
    public String hlsUrl;
    public String name;
    public String wholeH265ArtpUrl;
    public String wholeH265FlvUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.flvUrl);
        parcel.writeString(this.h265Url);
        parcel.writeString(this.artpUrl);
        parcel.writeString(this.hlsUrl);
        parcel.writeString(this.auth_key);
        parcel.writeString(this.wholeH265FlvUrl);
        parcel.writeString(this.wholeH265ArtpUrl);
        parcel.writeString(this.definition);
    }

    public QualitySelectItem() {
    }

    protected QualitySelectItem(Parcel parcel) {
        this.name = parcel.readString();
        this.flvUrl = parcel.readString();
        this.h265Url = parcel.readString();
        this.artpUrl = parcel.readString();
        this.hlsUrl = parcel.readString();
        this.auth_key = parcel.readString();
        this.wholeH265FlvUrl = parcel.readString();
        this.wholeH265ArtpUrl = parcel.readString();
        this.definition = parcel.readString();
    }

    static {
        kge.a(-1680982936);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<QualitySelectItem>() { // from class: com.taobao.taolive.uikit.mtop.QualitySelectItem.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taolive.uikit.mtop.QualitySelectItem, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ QualitySelectItem createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taolive.uikit.mtop.QualitySelectItem[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ QualitySelectItem[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public QualitySelectItem a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (QualitySelectItem) ipChange.ipc$dispatch("1a740d4e", new Object[]{this, parcel}) : new QualitySelectItem(parcel);
            }

            public QualitySelectItem[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (QualitySelectItem[]) ipChange.ipc$dispatch("f13da97f", new Object[]{this, new Integer(i)}) : new QualitySelectItem[i];
            }
        };
    }
}

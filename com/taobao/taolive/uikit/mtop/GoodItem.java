package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GoodItem implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<GoodItem> CREATOR;
    public String itemH5TaokeUrl;
    public String itemId;
    public String itemImg;
    public String itemTitle;
    public String itemUrl;
    public float price;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GoodItem() {
    }

    public GoodItem(Parcel parcel) {
        this.itemImg = parcel.readString();
        this.itemTitle = parcel.readString();
        this.price = parcel.readFloat();
        this.itemUrl = parcel.readString();
        this.itemH5TaokeUrl = parcel.readString();
        this.itemId = parcel.readString();
    }

    static {
        kge.a(-722935722);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<GoodItem>() { // from class: com.taobao.taolive.uikit.mtop.GoodItem.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.uikit.mtop.GoodItem] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ GoodItem createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taolive.uikit.mtop.GoodItem[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ GoodItem[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public GoodItem a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (GoodItem) ipChange.ipc$dispatch("602a67ca", new Object[]{this, parcel}) : new GoodItem(parcel);
            }

            public GoodItem[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (GoodItem[]) ipChange.ipc$dispatch("b5042079", new Object[]{this, new Integer(i)}) : new GoodItem[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemImg);
        parcel.writeString(this.itemTitle);
        parcel.writeFloat(this.price);
        parcel.writeString(this.itemUrl);
        parcel.writeString(this.itemH5TaokeUrl);
        parcel.writeString(this.itemId);
    }
}

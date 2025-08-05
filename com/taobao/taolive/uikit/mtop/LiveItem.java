package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveItem implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<LiveItem> CREATOR;
    public long itemId;
    public String itemName;
    public String itemPic;
    public float itemPrice;
    public String itemUrl;
    public String liveId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LiveItem() {
    }

    public LiveItem(Parcel parcel) {
        this.itemId = parcel.readLong();
        this.itemPic = parcel.readString();
        this.itemName = parcel.readString();
        this.itemPrice = parcel.readFloat();
        this.itemUrl = parcel.readString();
        this.liveId = parcel.readString();
    }

    static {
        kge.a(-1427545851);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<LiveItem>() { // from class: com.taobao.taolive.uikit.mtop.LiveItem.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.uikit.mtop.LiveItem] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LiveItem createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taolive.uikit.mtop.LiveItem[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LiveItem[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public LiveItem a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LiveItem) ipChange.ipc$dispatch("4a39fcfb", new Object[]{this, parcel}) : new LiveItem(parcel);
            }

            public LiveItem[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LiveItem[]) ipChange.ipc$dispatch("9f13b5aa", new Object[]{this, new Integer(i)}) : new LiveItem[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.itemId);
        parcel.writeString(this.itemPic);
        parcel.writeString(this.itemName);
        parcel.writeFloat(this.itemPrice);
        parcel.writeString(this.itemUrl);
        parcel.writeString(this.liveId);
    }
}

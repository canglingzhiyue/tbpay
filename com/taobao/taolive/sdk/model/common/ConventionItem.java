package com.taobao.taolive.sdk.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ConventionItem implements Parcelable, INetDataObject {
    public static final Parcelable.Creator<ConventionItem> CREATOR;
    public String content;
    public String mockNick;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mockNick);
        parcel.writeString(this.content);
    }

    public ConventionItem() {
    }

    protected ConventionItem(Parcel parcel) {
        this.mockNick = parcel.readString();
        this.content = parcel.readString();
    }

    static {
        kge.a(398392345);
        kge.a(-540945145);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ConventionItem>() { // from class: com.taobao.taolive.sdk.model.common.ConventionItem.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.sdk.model.common.ConventionItem] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ConventionItem createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taolive.sdk.model.common.ConventionItem[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ConventionItem[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ConventionItem a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ConventionItem) ipChange.ipc$dispatch("ef1434e7", new Object[]{this, parcel}) : new ConventionItem(parcel);
            }

            public ConventionItem[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ConventionItem[]) ipChange.ipc$dispatch("feab5f16", new Object[]{this, new Integer(i)}) : new ConventionItem[i];
            }
        };
    }
}

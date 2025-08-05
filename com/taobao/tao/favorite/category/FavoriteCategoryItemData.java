package com.taobao.tao.favorite.category;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class FavoriteCategoryItemData implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<FavoriteCategoryItemData> CREATOR;
    public long collectTime;
    public boolean isSelected;
    public String itemId;
    public String itemImageUrl;
    public String itemType;
    public int originFrom;
    public String price;
    public String promotionPrice;
    public int saleType;
    public boolean show11Price;
    public String tagPrice;
    public String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("itemId=");
        stringBuffer.append(this.itemId);
        stringBuffer.append(", itemType=");
        stringBuffer.append(this.itemType);
        stringBuffer.append(", itemImageUrl=");
        stringBuffer.append(this.itemImageUrl);
        stringBuffer.append(", tagPrice=");
        stringBuffer.append(this.tagPrice);
        stringBuffer.append(", promotionPrice=");
        stringBuffer.append(this.promotionPrice);
        stringBuffer.append(", price=");
        stringBuffer.append(this.price);
        stringBuffer.append(", title=");
        stringBuffer.append(this.title);
        stringBuffer.append(", saleType=");
        stringBuffer.append(this.saleType);
        stringBuffer.append(", originFrom=");
        stringBuffer.append(this.originFrom);
        stringBuffer.append(", collectTime=");
        stringBuffer.append(this.collectTime);
        stringBuffer.append(", show11Price=");
        stringBuffer.append(this.show11Price);
        stringBuffer.append(", isSelected=");
        stringBuffer.append(this.isSelected);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        parcel.writeString(this.itemType);
        parcel.writeString(this.itemImageUrl);
        parcel.writeString(this.price);
        parcel.writeString(this.tagPrice);
        parcel.writeString(this.promotionPrice);
        parcel.writeString(this.title);
        parcel.writeInt(this.saleType);
        parcel.writeInt(this.originFrom);
        parcel.writeLong(this.collectTime);
        parcel.writeString(Boolean.toString(this.show11Price));
        parcel.writeString(Boolean.toString(this.isSelected));
    }

    static {
        kge.a(-1496484843);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<FavoriteCategoryItemData>() { // from class: com.taobao.tao.favorite.category.FavoriteCategoryItemData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.tao.favorite.category.FavoriteCategoryItemData, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FavoriteCategoryItemData createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.tao.favorite.category.FavoriteCategoryItemData[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FavoriteCategoryItemData[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public FavoriteCategoryItemData[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FavoriteCategoryItemData[]) ipChange.ipc$dispatch("a83f8072", new Object[]{this, new Integer(i)}) : new FavoriteCategoryItemData[i];
            }

            public FavoriteCategoryItemData a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FavoriteCategoryItemData) ipChange.ipc$dispatch("1c02ad81", new Object[]{this, parcel}) : new FavoriteCategoryItemData(parcel);
            }
        };
    }

    public FavoriteCategoryItemData() {
    }

    public FavoriteCategoryItemData(Parcel parcel) {
        this.itemId = parcel.readString();
        this.itemType = parcel.readString();
        this.itemImageUrl = parcel.readString();
        this.price = parcel.readString();
        this.tagPrice = parcel.readString();
        this.promotionPrice = parcel.readString();
        this.title = parcel.readString();
        this.saleType = parcel.readInt();
        this.originFrom = parcel.readInt();
        this.collectTime = parcel.readLong();
        this.show11Price = Boolean.valueOf(parcel.readString()).booleanValue();
        this.isSelected = Boolean.valueOf(parcel.readString()).booleanValue();
    }
}

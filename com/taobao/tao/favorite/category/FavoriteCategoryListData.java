package com.taobao.tao.favorite.category;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class FavoriteCategoryListData implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<FavoriteCategoryListData> CREATOR;
    public boolean hasMore;
    public String nextPage;
    public List<FavoriteCategoryData> resultList;
    public String tips;
    public String tipsUrl;
    public Integer totalCount;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("totalCount=");
        stringBuffer.append(this.totalCount);
        stringBuffer.append(", hasMore=");
        stringBuffer.append(this.hasMore);
        stringBuffer.append(", nextPage=");
        stringBuffer.append(this.nextPage);
        stringBuffer.append(", resultList.size=");
        stringBuffer.append(this.resultList.size());
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount.intValue());
        parcel.writeList(this.resultList);
        parcel.writeString(Boolean.toString(this.hasMore));
        parcel.writeString(this.nextPage);
        parcel.writeString(this.tips);
        parcel.writeString(this.tipsUrl);
    }

    static {
        kge.a(-1328354272);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<FavoriteCategoryListData>() { // from class: com.taobao.tao.favorite.category.FavoriteCategoryListData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.tao.favorite.category.FavoriteCategoryListData, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FavoriteCategoryListData createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.tao.favorite.category.FavoriteCategoryListData[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FavoriteCategoryListData[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public FavoriteCategoryListData[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FavoriteCategoryListData[]) ipChange.ipc$dispatch("dee909c7", new Object[]{this, new Integer(i)}) : new FavoriteCategoryListData[i];
            }

            public FavoriteCategoryListData a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FavoriteCategoryListData) ipChange.ipc$dispatch("52ac36d6", new Object[]{this, parcel}) : new FavoriteCategoryListData(parcel);
            }
        };
    }

    public FavoriteCategoryListData() {
        this.resultList = new ArrayList();
    }

    public FavoriteCategoryListData(Parcel parcel) {
        this.resultList = new ArrayList();
        this.totalCount = Integer.valueOf(parcel.readInt());
        this.resultList = parcel.readArrayList(FavoriteCategoryData.class.getClassLoader());
        this.hasMore = Boolean.valueOf(parcel.readString()).booleanValue();
        this.nextPage = parcel.readString();
        this.tips = parcel.readString();
        this.tipsUrl = parcel.readString();
    }
}

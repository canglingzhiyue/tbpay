package com.taobao.cainiao.card;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class GoodsInfoEntity implements Parcelable {
    public static final Parcelable.Creator<GoodsInfoEntity> CREATOR;
    public static final String TAG;
    public String authCode;
    public String cpCode;
    public String cpName;
    public boolean fromMtop;
    public String goodsCount;
    public String goodsName;
    public String goodsUrl;
    public String orderCode;
    public String predictArriveTime;
    public String providerName;
    public String status;
    public String statusDesc;
    public String traceNo;
    public String tradeId;
    public int type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        kge.a(-1169266058);
        kge.a(1630535278);
        TAG = GoodsInfoEntity.class.getSimpleName();
        CREATOR = new Parcelable.Creator<GoodsInfoEntity>() { // from class: com.taobao.cainiao.card.GoodsInfoEntity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.cainiao.card.GoodsInfoEntity, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ GoodsInfoEntity createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.cainiao.card.GoodsInfoEntity[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ GoodsInfoEntity[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public GoodsInfoEntity a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (GoodsInfoEntity) ipChange.ipc$dispatch("f66f4c00", new Object[]{this, parcel}) : new GoodsInfoEntity(parcel);
            }

            public GoodsInfoEntity[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (GoodsInfoEntity[]) ipChange.ipc$dispatch("3ccca931", new Object[]{this, new Integer(i)}) : new GoodsInfoEntity[i];
            }
        };
    }

    public GoodsInfoEntity() {
    }

    protected GoodsInfoEntity(Parcel parcel) {
        this.traceNo = parcel.readString();
        this.cpCode = parcel.readString();
        this.orderCode = parcel.readString();
        this.goodsUrl = parcel.readString();
        this.goodsName = parcel.readString();
        this.goodsCount = parcel.readString();
        this.cpName = parcel.readString();
        this.statusDesc = parcel.readString();
        this.status = parcel.readString();
        this.tradeId = parcel.readString();
        this.predictArriveTime = parcel.readString();
        this.authCode = parcel.readString();
        this.type = parcel.readInt();
        this.providerName = parcel.readString();
        this.fromMtop = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.traceNo);
        parcel.writeString(this.cpCode);
        parcel.writeString(this.orderCode);
        parcel.writeString(this.goodsUrl);
        parcel.writeString(this.goodsName);
        parcel.writeString(this.goodsCount);
        parcel.writeString(this.cpName);
        parcel.writeString(this.statusDesc);
        parcel.writeString(this.status);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.predictArriveTime);
        parcel.writeString(this.authCode);
        parcel.writeInt(this.type);
        parcel.writeString(this.providerName);
        parcel.writeByte(this.fromMtop ? (byte) 1 : (byte) 0);
    }
}

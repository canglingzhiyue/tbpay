package com.alipay.mobile.common.amnet.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AcceptedData implements Parcelable {
    public static final Parcelable.Creator<AcceptedData> CREATOR = new Parcelable.Creator<AcceptedData>() { // from class: com.alipay.mobile.common.amnet.api.model.AcceptedData.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public AcceptedData mo553createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AcceptedData) ipChange.ipc$dispatch("f1d8cc70", new Object[]{this, parcel}) : new AcceptedData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public AcceptedData[] mo554newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AcceptedData[]) ipChange.ipc$dispatch("ff50f67", new Object[]{this, new Integer(i)}) : new AcceptedData[i];
        }
    };
    public double airTime;
    public double amnetAllTime;
    public double amnetEncodeTime;
    public double amnetHungTime;
    public double amnetStalledTime;
    public double amnetWaitTime;
    public byte channel;
    public long cid;
    public int compressSize;
    public double ctjOutTime;
    public byte[] data;
    public Map<String, String> headers;
    public int ipStack;
    public double ipcP2m;
    public double ipcTime;
    public boolean isFlexible;
    public boolean isOnShort;
    public boolean isUseBifrost;
    public boolean isUseHttp2;
    public double jtcTIme;
    public String mtag;
    public double ntIOTime;
    public int qoeCur;
    public String queneStorage;
    public double queueOutTime;
    public double readTiming;
    public long receipt;
    public int reqZipType;
    public boolean retried;
    public int rspZipType;
    public double saTime;
    public String targetHostLong;
    public String targetHostShort;
    public int uncompressSize;
    public boolean useShort;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AcceptedData() {
        this.retried = false;
        this.isFlexible = false;
        this.reqZipType = -1;
        this.rspZipType = -1;
        this.isUseBifrost = false;
        this.isUseHttp2 = false;
        this.ipStack = -1;
    }

    private AcceptedData(Parcel parcel) {
        this.retried = false;
        this.isFlexible = false;
        this.reqZipType = -1;
        this.rspZipType = -1;
        this.isUseBifrost = false;
        this.isUseHttp2 = false;
        this.ipStack = -1;
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.channel);
        parcel.writeMap(this.headers);
        parcel.writeInt(this.data.length);
        parcel.writeByteArray(this.data);
        parcel.writeDouble(this.readTiming);
        parcel.writeInt(this.compressSize);
        parcel.writeInt(this.uncompressSize);
        parcel.writeDouble(this.ipcTime);
        parcel.writeDouble(this.jtcTIme);
        parcel.writeDouble(this.amnetWaitTime);
        parcel.writeDouble(this.ipcP2m);
        parcel.writeDouble(this.amnetStalledTime);
        parcel.writeDouble(this.airTime);
        parcel.writeLong(this.receipt);
        parcel.writeByte(this.retried ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.saTime);
        parcel.writeByte(this.isOnShort ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useShort ? (byte) 1 : (byte) 0);
        parcel.writeString(this.targetHostShort);
        parcel.writeString(this.mtag);
        parcel.writeInt(this.qoeCur);
        parcel.writeString(this.queneStorage);
        parcel.writeByte(this.isFlexible ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.ctjOutTime);
        parcel.writeDouble(this.ntIOTime);
        parcel.writeDouble(this.queueOutTime);
        parcel.writeDouble(this.amnetHungTime);
        parcel.writeDouble(this.amnetEncodeTime);
        parcel.writeDouble(this.amnetAllTime);
        parcel.writeLong(this.cid);
        parcel.writeString(this.targetHostLong);
        parcel.writeInt(this.reqZipType);
        parcel.writeInt(this.rspZipType);
        parcel.writeByte(this.isUseBifrost ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isUseHttp2 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.ipStack);
    }

    public void readFromParcel(Parcel parcel) {
        this.channel = parcel.readByte();
        this.headers = new HashMap();
        parcel.readMap(this.headers, AcceptedData.class.getClassLoader());
        this.data = new byte[parcel.readInt()];
        parcel.readByteArray(this.data);
        this.readTiming = parcel.readDouble();
        this.compressSize = parcel.readInt();
        this.uncompressSize = parcel.readInt();
        this.ipcTime = parcel.readDouble();
        this.jtcTIme = parcel.readDouble();
        this.amnetWaitTime = parcel.readDouble();
        this.ipcP2m = parcel.readDouble();
        this.amnetStalledTime = parcel.readDouble();
        this.airTime = parcel.readDouble();
        this.receipt = parcel.readLong();
        boolean z = false;
        this.retried = parcel.readByte() != 0;
        this.saTime = parcel.readDouble();
        this.isOnShort = parcel.readByte() != 0;
        this.useShort = parcel.readByte() != 0;
        this.targetHostShort = parcel.readString();
        this.mtag = parcel.readString();
        this.qoeCur = parcel.readInt();
        this.queneStorage = parcel.readString();
        this.isFlexible = parcel.readByte() != 0;
        this.ctjOutTime = parcel.readDouble();
        this.ntIOTime = parcel.readDouble();
        this.queueOutTime = parcel.readDouble();
        this.amnetHungTime = parcel.readDouble();
        this.amnetEncodeTime = parcel.readDouble();
        this.amnetAllTime = parcel.readDouble();
        this.cid = parcel.readLong();
        this.targetHostLong = parcel.readString();
        this.reqZipType = parcel.readInt();
        this.rspZipType = parcel.readInt();
        this.isUseBifrost = parcel.readByte() == 1;
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.isUseHttp2 = z;
        this.ipStack = parcel.readInt();
    }
}

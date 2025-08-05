package com.taobao.taolive.room.business.mess;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveDetailMessinfoRequest implements Parcelable, INetDataObject, Cloneable {
    public static final Parcelable.Creator<LiveDetailMessinfoRequest> CREATOR;
    private String API_NAME;
    private boolean NEED_ECODE;
    private boolean NEED_SESSION;
    private String VERSION;
    public String accountStays;
    public String creatorId;
    public String liveId;
    public long n;
    public long s;
    public String serviceVersion;
    public String type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LiveDetailMessinfoRequest() {
        this.API_NAME = "mtop.mediaplatform.livedetail.messinfo";
        this.VERSION = "2.0";
        this.NEED_ECODE = false;
        this.NEED_SESSION = false;
        this.creatorId = null;
        this.serviceVersion = "6.0";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.API_NAME);
        parcel.writeString(this.VERSION);
        parcel.writeByte(this.NEED_ECODE ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.NEED_SESSION ? (byte) 1 : (byte) 0);
        parcel.writeString(this.creatorId);
        parcel.writeString(this.type);
        parcel.writeString(this.liveId);
        parcel.writeLong(this.s);
        parcel.writeLong(this.n);
        parcel.writeString(this.accountStays);
    }

    protected LiveDetailMessinfoRequest(Parcel parcel) {
        this.API_NAME = "mtop.mediaplatform.livedetail.messinfo";
        this.VERSION = "2.0";
        boolean z = false;
        this.NEED_ECODE = false;
        this.NEED_SESSION = false;
        this.creatorId = null;
        this.serviceVersion = "6.0";
        this.API_NAME = parcel.readString();
        this.VERSION = parcel.readString();
        this.NEED_ECODE = parcel.readByte() != 0;
        this.NEED_SESSION = parcel.readByte() != 0 ? true : z;
        this.creatorId = parcel.readString();
        this.type = parcel.readString();
        this.liveId = parcel.readString();
        this.s = parcel.readLong();
        this.n = parcel.readLong();
        this.accountStays = parcel.readString();
    }

    static {
        kge.a(-177805308);
        kge.a(-540945145);
        kge.a(1630535278);
        kge.a(-723128125);
        CREATOR = new Parcelable.Creator<LiveDetailMessinfoRequest>() { // from class: com.taobao.taolive.room.business.mess.LiveDetailMessinfoRequest.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taolive.room.business.mess.LiveDetailMessinfoRequest, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LiveDetailMessinfoRequest createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taolive.room.business.mess.LiveDetailMessinfoRequest[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LiveDetailMessinfoRequest[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public LiveDetailMessinfoRequest a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LiveDetailMessinfoRequest) ipChange.ipc$dispatch("40967f32", new Object[]{this, parcel}) : new LiveDetailMessinfoRequest(parcel);
            }

            public LiveDetailMessinfoRequest[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LiveDetailMessinfoRequest[]) ipChange.ipc$dispatch("592b9963", new Object[]{this, new Integer(i)}) : new LiveDetailMessinfoRequest[i];
            }
        };
    }
}

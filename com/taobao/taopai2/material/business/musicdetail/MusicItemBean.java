package com.taobao.taopai2.material.business.musicdetail;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicItemBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicItemBean> CREATOR;
    public static final int VENDOR_TYPE_XIAMI = 10;
    public String artists;
    public String audioId;
    public String dataFrom;
    public boolean directUseRefrain;
    public String downloadUrl;
    public long duration;
    public String filePath;
    public List<String> iconUrls;
    public String id;
    public boolean liked;
    public String listenUrl;
    public String logoUrl;
    public String name;
    public long refrainEndTime;
    public String refrainSource;
    public long refrainStartTime;
    public String soundId;
    public String subName;
    public int vendorType;
    public String waveformUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MusicItemBean() {
        this.dataFrom = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MusicItemBean(Parcel parcel) {
        this.dataFrom = "";
        this.id = parcel.readString();
        this.artists = parcel.readString();
        this.duration = parcel.readLong();
        boolean z = true;
        this.liked = parcel.readByte() != 0;
        this.logoUrl = parcel.readString();
        this.name = parcel.readString();
        this.vendorType = parcel.readInt();
        this.filePath = parcel.readString();
        this.downloadUrl = parcel.readString();
        this.listenUrl = parcel.readString();
        this.subName = parcel.readString();
        this.waveformUrl = parcel.readString();
        this.iconUrls = parcel.createStringArrayList();
        this.refrainStartTime = parcel.readLong();
        this.refrainEndTime = parcel.readLong();
        this.directUseRefrain = parcel.readByte() == 0 ? false : z;
        this.dataFrom = parcel.readString();
        this.audioId = parcel.readString();
    }

    static {
        kge.a(1714661858);
        kge.a(1028243835);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MusicItemBean>() { // from class: com.taobao.taopai2.material.business.musicdetail.MusicItemBean.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taopai2.material.business.musicdetail.MusicItemBean] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MusicItemBean createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taopai2.material.business.musicdetail.MusicItemBean[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MusicItemBean[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MusicItemBean a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MusicItemBean) ipChange.ipc$dispatch("e08cf0be", new Object[]{this, parcel}) : new MusicItemBean(parcel);
            }

            public MusicItemBean[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MusicItemBean[]) ipChange.ipc$dispatch("8ec34c6d", new Object[]{this, new Integer(i)}) : new MusicItemBean[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.artists);
        parcel.writeLong(this.duration);
        parcel.writeByte(this.liked ? (byte) 1 : (byte) 0);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.name);
        parcel.writeInt(this.vendorType);
        parcel.writeString(this.filePath);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.listenUrl);
        parcel.writeString(this.subName);
        parcel.writeString(this.waveformUrl);
        parcel.writeStringList(this.iconUrls);
        parcel.writeLong(this.refrainStartTime);
        parcel.writeLong(this.refrainEndTime);
        parcel.writeByte(this.directUseRefrain ? (byte) 1 : (byte) 0);
        parcel.writeString(this.dataFrom);
        parcel.writeString(this.audioId);
    }
}

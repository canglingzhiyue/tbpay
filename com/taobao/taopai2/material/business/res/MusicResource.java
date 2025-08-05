package com.taobao.taopai2.material.business.res;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicResource extends MusicItemBean {
    public static final Parcelable.Creator<MusicResource> CREATOR;
    public String musicPath;
    public String musicWavePath;

    @Override // com.taobao.taopai2.material.business.musicdetail.MusicItemBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MusicResource() {
    }

    protected MusicResource(Parcel parcel) {
        super(parcel);
        this.musicPath = parcel.readString();
        this.musicWavePath = parcel.readString();
    }

    @Override // com.taobao.taopai2.material.business.musicdetail.MusicItemBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.musicPath);
        parcel.writeString(this.musicWavePath);
    }

    static {
        kge.a(1007800311);
        CREATOR = new Parcelable.Creator<MusicResource>() { // from class: com.taobao.taopai2.material.business.res.MusicResource.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taopai2.material.business.res.MusicResource, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MusicResource createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taopai2.material.business.res.MusicResource[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MusicResource[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MusicResource a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MusicResource) ipChange.ipc$dispatch("32928249", new Object[]{this, parcel}) : new MusicResource(parcel);
            }

            public MusicResource[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MusicResource[]) ipChange.ipc$dispatch("f11afcf8", new Object[]{this, new Integer(i)}) : new MusicResource[i];
            }
        };
    }
}

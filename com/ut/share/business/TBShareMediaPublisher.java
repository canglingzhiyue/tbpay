package com.ut.share.business;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TBShareMediaPublisher implements Parcelable {
    public static final Parcelable.Creator<TBShareMediaPublisher> CREATOR;
    private String avatar;
    private String nick;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String str) {
        this.nick = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.avatar);
        parcel.writeString(this.nick);
    }

    public TBShareMediaPublisher() {
    }

    protected TBShareMediaPublisher(Parcel parcel) {
        this.avatar = parcel.readString();
        this.nick = parcel.readString();
    }

    static {
        kge.a(1779766508);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TBShareMediaPublisher>() { // from class: com.ut.share.business.TBShareMediaPublisher.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public TBShareMediaPublisher mo1610createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBShareMediaPublisher) ipChange.ipc$dispatch("485339fc", new Object[]{this, parcel}) : new TBShareMediaPublisher(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public TBShareMediaPublisher[] mo1611newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBShareMediaPublisher[]) ipChange.ipc$dispatch("934175b3", new Object[]{this, new Integer(i)}) : new TBShareMediaPublisher[i];
            }
        };
    }
}

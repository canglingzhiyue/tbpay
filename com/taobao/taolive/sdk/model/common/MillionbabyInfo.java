package com.taobao.taolive.sdk.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MillionbabyInfo implements Parcelable, INetDataObject {
    public static final Parcelable.Creator<MillionbabyInfo> CREATOR;
    public boolean answerUseWeex;
    public String answerWeexUrl;
    public boolean canAnswer;
    public String gameId;
    public String icon;
    public String inviteCode;
    public PlayerSetting playerSetting;
    public int resurrectionCardNum;
    public String sk;
    public String unlimitCardNum;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.answerUseWeex ? (byte) 1 : (byte) 0);
        parcel.writeString(this.answerWeexUrl);
        parcel.writeByte(this.canAnswer ? (byte) 1 : (byte) 0);
        parcel.writeString(this.icon);
        parcel.writeString(this.inviteCode);
        parcel.writeParcelable(this.playerSetting, i);
        parcel.writeString(this.unlimitCardNum);
        parcel.writeInt(this.resurrectionCardNum);
        parcel.writeString(this.sk);
        parcel.writeString(this.gameId);
    }

    public MillionbabyInfo() {
    }

    protected MillionbabyInfo(Parcel parcel) {
        boolean z = true;
        this.answerUseWeex = parcel.readByte() != 0;
        this.answerWeexUrl = parcel.readString();
        this.canAnswer = parcel.readByte() == 0 ? false : z;
        this.icon = parcel.readString();
        this.inviteCode = parcel.readString();
        this.playerSetting = (PlayerSetting) parcel.readParcelable(PlayerSetting.class.getClassLoader());
        this.unlimitCardNum = parcel.readString();
        this.resurrectionCardNum = parcel.readInt();
        this.sk = parcel.readString();
        this.gameId = parcel.readString();
    }

    static {
        kge.a(-299732549);
        kge.a(-540945145);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MillionbabyInfo>() { // from class: com.taobao.taolive.sdk.model.common.MillionbabyInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taolive.sdk.model.common.MillionbabyInfo, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MillionbabyInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taolive.sdk.model.common.MillionbabyInfo[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MillionbabyInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MillionbabyInfo a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MillionbabyInfo) ipChange.ipc$dispatch("a5adccdb", new Object[]{this, parcel}) : new MillionbabyInfo(parcel);
            }

            public MillionbabyInfo[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MillionbabyInfo[]) ipChange.ipc$dispatch("88fbe88c", new Object[]{this, new Integer(i)}) : new MillionbabyInfo[i];
            }
        };
    }

    /* loaded from: classes8.dex */
    public static class PlayerSetting implements Parcelable, INetDataObject {
        public static final Parcelable.Creator<PlayerSetting> CREATOR;
        public String maxFastPlay;
        public String maxNormalPlay;
        public String minNormalPlay;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.maxNormalPlay);
            parcel.writeString(this.minNormalPlay);
            parcel.writeString(this.maxFastPlay);
        }

        public PlayerSetting() {
        }

        protected PlayerSetting(Parcel parcel) {
            this.maxNormalPlay = parcel.readString();
            this.minNormalPlay = parcel.readString();
            this.maxFastPlay = parcel.readString();
        }

        static {
            kge.a(253695206);
            kge.a(-540945145);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<PlayerSetting>() { // from class: com.taobao.taolive.sdk.model.common.MillionbabyInfo.PlayerSetting.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taolive.sdk.model.common.MillionbabyInfo$PlayerSetting, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ PlayerSetting createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taolive.sdk.model.common.MillionbabyInfo$PlayerSetting[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ PlayerSetting[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public PlayerSetting a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (PlayerSetting) ipChange.ipc$dispatch("97643bd0", new Object[]{this, parcel}) : new PlayerSetting(parcel);
                }

                public PlayerSetting[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (PlayerSetting[]) ipChange.ipc$dispatch("df1b8dc1", new Object[]{this, new Integer(i)}) : new PlayerSetting[i];
                }
            };
        }
    }
}

package com.taobao.live.timemove.video.videoitem.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class AccountInfo implements Parcelable, INetDataObject {
    public static final Parcelable.Creator<AccountInfo> CREATOR;
    public static final String TYPE_DAREN = "daren";
    public static final String TYPE_SHOP = "shop";
    public String accountDes;
    public String accountExplain;
    public String accountId;
    public String accountInfoNewUrl;
    public String accountInfoUrl;
    public String accountIntroduce;
    public String accountName;
    public boolean anchorGuard;
    public String anchorSideKey;
    public Atmosphere atmosphere;
    public String backGroundImg;
    public JSONObject clickMaidian;
    public long fansNum;
    public boolean follow;
    public String headImg;
    public String jumpUrl;
    public long lastTime;
    public long lastVideoId;
    public String ratingPicUrl;
    public String shopName;
    public String shopUrl;
    public JSONObject showMaidian;
    public int status;
    public String strDes;
    public String subAccountName;
    public boolean subscribe;
    public JSONObject tag;
    public boolean taoKe;
    public String tidbitsUrl;
    public boolean tmall;
    public String tmallHomepageUrl;
    public String topicId;
    public String topicShowImage;
    public String topicTitle;
    public String trackInfo;
    public String type;
    public String typeLogo;
    public ArrayList<String> types;
    public String url;
    public boolean v;
    public String wangwangLink;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes7.dex */
    public static class Atmosphere implements Parcelable, INetDataObject {
        public static final Parcelable.Creator<Atmosphere> CREATOR;
        public String headIcon;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.headIcon);
        }

        public Atmosphere() {
        }

        protected Atmosphere(Parcel parcel) {
            this.headIcon = parcel.readString();
        }

        static {
            kge.a(903880998);
            kge.a(-540945145);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<Atmosphere>() { // from class: com.taobao.live.timemove.video.videoitem.domain.model.AccountInfo.Atmosphere.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.live.timemove.video.videoitem.domain.model.AccountInfo$Atmosphere, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Atmosphere createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.live.timemove.video.videoitem.domain.model.AccountInfo$Atmosphere[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Atmosphere[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public Atmosphere a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Atmosphere) ipChange.ipc$dispatch("b4e93d3a", new Object[]{this, parcel}) : new Atmosphere(parcel);
                }

                public Atmosphere[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Atmosphere[]) ipChange.ipc$dispatch("b861faa9", new Object[]{this, new Integer(i)}) : new Atmosphere[i];
                }
            };
        }
    }

    public AccountInfo() {
        this.lastTime = 0L;
        this.lastVideoId = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accountId);
        parcel.writeString(this.accountName);
        parcel.writeString(this.accountDes);
        parcel.writeString(this.accountExplain);
        parcel.writeString(this.accountIntroduce);
        parcel.writeString(this.url);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.wangwangLink);
        parcel.writeString(this.type);
        parcel.writeString(this.headImg);
        parcel.writeString(this.typeLogo);
        parcel.writeInt(this.status);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.follow ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.subscribe ? (byte) 1 : (byte) 0);
        parcel.writeString(this.strDes);
        parcel.writeString(this.backGroundImg);
        parcel.writeLong(this.lastTime);
        parcel.writeLong(this.lastVideoId);
        parcel.writeString(this.accountInfoUrl);
        parcel.writeString(this.tidbitsUrl);
        parcel.writeByte(this.tmall ? (byte) 1 : (byte) 0);
        parcel.writeString(this.shopUrl);
        parcel.writeString(this.tmallHomepageUrl);
        parcel.writeString(this.subAccountName);
        parcel.writeString(this.ratingPicUrl);
        parcel.writeString(this.shopName);
        parcel.writeLong(this.fansNum);
        parcel.writeByte(this.anchorGuard ? (byte) 1 : (byte) 0);
        parcel.writeString(this.topicId);
        parcel.writeString(this.topicTitle);
        parcel.writeString(this.topicShowImage);
        parcel.writeParcelable(this.atmosphere, i);
        parcel.writeList(this.types);
        parcel.writeValue(this.tag);
        parcel.writeValue(this.clickMaidian);
        parcel.writeValue(this.showMaidian);
        parcel.writeString(this.trackInfo);
    }

    protected AccountInfo(Parcel parcel) {
        this.lastTime = 0L;
        this.lastVideoId = 0L;
        this.accountId = parcel.readString();
        this.accountName = parcel.readString();
        this.accountDes = parcel.readString();
        this.accountExplain = parcel.readString();
        this.accountIntroduce = parcel.readString();
        this.url = parcel.readString();
        this.jumpUrl = parcel.readString();
        this.wangwangLink = parcel.readString();
        this.type = parcel.readString();
        this.headImg = parcel.readString();
        this.typeLogo = parcel.readString();
        this.status = parcel.readInt();
        boolean z = true;
        this.v = parcel.readByte() != 0;
        this.follow = parcel.readByte() != 0;
        this.subscribe = parcel.readByte() != 0;
        this.strDes = parcel.readString();
        this.backGroundImg = parcel.readString();
        this.lastTime = parcel.readLong();
        this.lastVideoId = parcel.readLong();
        this.accountInfoUrl = parcel.readString();
        this.tidbitsUrl = parcel.readString();
        this.tmall = parcel.readByte() != 0;
        this.shopUrl = parcel.readString();
        this.tmallHomepageUrl = parcel.readString();
        this.subAccountName = parcel.readString();
        this.ratingPicUrl = parcel.readString();
        this.shopName = parcel.readString();
        this.fansNum = parcel.readLong();
        this.anchorGuard = parcel.readByte() == 0 ? false : z;
        this.topicId = parcel.readString();
        this.topicTitle = parcel.readString();
        this.topicShowImage = parcel.readString();
        this.atmosphere = (Atmosphere) parcel.readParcelable(Atmosphere.class.getClassLoader());
        this.types = parcel.readArrayList(String.class.getClassLoader());
        this.tag = (JSONObject) parcel.readValue(JSONObject.class.getClassLoader());
        this.clickMaidian = (JSONObject) parcel.readValue(JSONObject.class.getClassLoader());
        this.showMaidian = (JSONObject) parcel.readValue(JSONObject.class.getClassLoader());
        this.trackInfo = parcel.readString();
    }

    static {
        kge.a(-1421298880);
        kge.a(-540945145);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<AccountInfo>() { // from class: com.taobao.live.timemove.video.videoitem.domain.model.AccountInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.live.timemove.video.videoitem.domain.model.AccountInfo] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AccountInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.live.timemove.video.videoitem.domain.model.AccountInfo[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AccountInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public AccountInfo a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AccountInfo) ipChange.ipc$dispatch("806e68b6", new Object[]{this, parcel}) : new AccountInfo(parcel);
            }

            public AccountInfo[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AccountInfo[]) ipChange.ipc$dispatch("c825baa7", new Object[]{this, new Integer(i)}) : new AccountInfo[i];
            }
        };
    }
}

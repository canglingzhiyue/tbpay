package com.taobao.taolive.sdk.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
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
    public List<BroadCasterTag> broadCasterTags;
    public String encodeAccountId;
    public long fansNum;
    public boolean follow;
    public boolean frameLockForbidden;
    public String headImg;
    public String jumpUrl;
    public long lastTime;
    public long lastVideoId;
    public Map<String, String> profileJumpConfig;
    public String ratingPicUrl;
    public String shopId;
    public String shopName;
    public String shopUrl;
    public int status;
    public String strDes;
    public String subAccountName;
    public boolean subscribe;
    public boolean taoKe;
    public String tidbitsUrl;
    public boolean tmall;
    public String tmallHomepageUrl;
    public boolean topFollow;
    public String topicId;
    public String topicShowImage;
    public String topicTitle;
    public String type;
    public String typeLogo;
    public ArrayList<String> types;
    public String url;
    public boolean v;
    public List<BroadCasterTag> viconInfos;
    public List<String> vicons;
    public String wangwangLink;
    public WidgetTip widgetTip;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes8.dex */
    public static class Atmosphere implements Parcelable, INetDataObject {
        public static final Parcelable.Creator<Atmosphere> CREATOR;
        public String headIcon;
        public String headIconForLight;
        public boolean questionChallenge;
        public String questionExplain;
        public String questionUrl;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.headIcon);
            parcel.writeString(this.headIconForLight);
            parcel.writeByte(this.questionChallenge ? (byte) 1 : (byte) 0);
            parcel.writeString(this.questionUrl);
            parcel.writeString(this.questionExplain);
        }

        public Atmosphere() {
        }

        protected Atmosphere(Parcel parcel) {
            this.headIcon = parcel.readString();
            this.headIconForLight = parcel.readString();
            this.questionChallenge = parcel.readByte() != 0;
            this.questionUrl = parcel.readString();
            this.questionExplain = parcel.readString();
        }

        static {
            kge.a(391567872);
            kge.a(-540945145);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<Atmosphere>() { // from class: com.taobao.taolive.sdk.model.common.AccountInfo.Atmosphere.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.sdk.model.common.AccountInfo$Atmosphere] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Atmosphere createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taolive.sdk.model.common.AccountInfo$Atmosphere[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Atmosphere[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public Atmosphere a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Atmosphere) ipChange.ipc$dispatch("e969ee0", new Object[]{this, parcel}) : new Atmosphere(parcel);
                }

                public Atmosphere[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Atmosphere[]) ipChange.ipc$dispatch("9f42a0f", new Object[]{this, new Integer(i)}) : new Atmosphere[i];
                }
            };
        }
    }

    /* loaded from: classes8.dex */
    public static class BroadCasterTag implements Parcelable {
        public static final Parcelable.Creator<BroadCasterTag> CREATOR;
        public String icon;
        public String jumpUrl;
        public String showTime;
        public String text;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.showTime);
            parcel.writeString(this.icon);
            parcel.writeString(this.text);
            parcel.writeString(this.jumpUrl);
        }

        public void readFromParcel(Parcel parcel) {
            this.showTime = parcel.readString();
            this.icon = parcel.readString();
            this.text = parcel.readString();
            this.jumpUrl = parcel.readString();
        }

        public BroadCasterTag() {
        }

        protected BroadCasterTag(Parcel parcel) {
            this.showTime = parcel.readString();
            this.icon = parcel.readString();
            this.text = parcel.readString();
            this.jumpUrl = parcel.readString();
        }

        static {
            kge.a(483116362);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<BroadCasterTag>() { // from class: com.taobao.taolive.sdk.model.common.AccountInfo.BroadCasterTag.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.sdk.model.common.AccountInfo$BroadCasterTag] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ BroadCasterTag createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.taolive.sdk.model.common.AccountInfo$BroadCasterTag[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ BroadCasterTag[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public BroadCasterTag a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (BroadCasterTag) ipChange.ipc$dispatch("fcf84256", new Object[]{this, parcel}) : new BroadCasterTag(parcel);
                }

                public BroadCasterTag[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (BroadCasterTag[]) ipChange.ipc$dispatch("ab2e9e05", new Object[]{this, new Integer(i)}) : new BroadCasterTag[i];
                }
            };
        }
    }

    /* loaded from: classes8.dex */
    public static class WidgetTip implements Parcelable {
        public static final Parcelable.Creator<WidgetTip> CREATOR;
        public ComponentData componentData;
        public String jumpType;
        public boolean showWidgetTip;
        public boolean widgetAddition;
        public String widgetJumpUrl;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public WidgetTip() {
        }

        protected WidgetTip(Parcel parcel) {
            boolean z = true;
            this.widgetAddition = parcel.readByte() != 0;
            this.showWidgetTip = parcel.readByte() == 0 ? false : z;
            this.widgetJumpUrl = parcel.readString();
            this.jumpType = parcel.readString();
            this.componentData = (ComponentData) parcel.readParcelable(ComponentData.class.getClassLoader());
        }

        static {
            kge.a(43779865);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<WidgetTip>() { // from class: com.taobao.taolive.sdk.model.common.AccountInfo.WidgetTip.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taolive.sdk.model.common.AccountInfo$WidgetTip, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ WidgetTip createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taolive.sdk.model.common.AccountInfo$WidgetTip[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ WidgetTip[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public WidgetTip a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (WidgetTip) ipChange.ipc$dispatch("3a067afd", new Object[]{this, parcel}) : new WidgetTip(parcel);
                }

                public WidgetTip[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (WidgetTip[]) ipChange.ipc$dispatch("c6434dee", new Object[]{this, new Integer(i)}) : new WidgetTip[i];
                }
            };
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.widgetAddition ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.showWidgetTip ? (byte) 1 : (byte) 0);
            parcel.writeString(this.widgetJumpUrl);
            parcel.writeString(this.jumpType);
            parcel.writeParcelable(this.componentData, i);
        }
    }

    /* loaded from: classes8.dex */
    public static class ComponentData implements Parcelable {
        public static final Parcelable.Creator<ComponentData> CREATOR;
        public String componentName;
        public Map<String, String> params;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ComponentData() {
        }

        protected ComponentData(Parcel parcel) {
            this.componentName = parcel.readString();
            int readInt = parcel.readInt();
            this.params = new HashMap(readInt);
            for (int i = 0; i < readInt; i++) {
                this.params.put(parcel.readString(), parcel.readString());
            }
        }

        static {
            kge.a(-21124951);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<ComponentData>() { // from class: com.taobao.taolive.sdk.model.common.AccountInfo.ComponentData.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taolive.sdk.model.common.AccountInfo$ComponentData, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ComponentData createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taolive.sdk.model.common.AccountInfo$ComponentData[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ComponentData[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public ComponentData a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ComponentData) ipChange.ipc$dispatch("66535ed", new Object[]{this, parcel}) : new ComponentData(parcel);
                }

                public ComponentData[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ComponentData[]) ipChange.ipc$dispatch("b12d285e", new Object[]{this, new Integer(i)}) : new ComponentData[i];
                }
            };
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.componentName);
            parcel.writeInt(this.params.size());
            for (Map.Entry<String, String> entry : this.params.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public AccountInfo() {
        this.lastTime = 0L;
        this.lastVideoId = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accountId);
        parcel.writeString(this.encodeAccountId);
        parcel.writeString(this.shopId);
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
        parcel.writeByte(this.frameLockForbidden ? (byte) 1 : (byte) 0);
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
        parcel.writeList(this.broadCasterTags);
        parcel.writeStringList(this.vicons);
        parcel.writeParcelable(this.widgetTip, i);
        parcel.writeInt(this.profileJumpConfig.size());
        for (Map.Entry<String, String> entry : this.profileJumpConfig.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    protected AccountInfo(Parcel parcel) {
        this.lastTime = 0L;
        this.lastVideoId = 0L;
        this.accountId = parcel.readString();
        this.encodeAccountId = parcel.readString();
        this.shopId = parcel.readString();
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
        this.frameLockForbidden = parcel.readByte() != 0;
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
        this.broadCasterTags = new ArrayList();
        parcel.readList(this.broadCasterTags, BroadCasterTag.class.getClassLoader());
        this.vicons = parcel.createStringArrayList();
        this.widgetTip = (WidgetTip) parcel.readParcelable(WidgetTip.class.getClassLoader());
        int readInt = parcel.readInt();
        this.profileJumpConfig = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.profileJumpConfig.put(parcel.readString(), parcel.readString());
        }
    }

    static {
        kge.a(-745734490);
        kge.a(-540945145);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<AccountInfo>() { // from class: com.taobao.taolive.sdk.model.common.AccountInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taolive.sdk.model.common.AccountInfo, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AccountInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taolive.sdk.model.common.AccountInfo[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AccountInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public AccountInfo a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AccountInfo) ipChange.ipc$dispatch("da8d92d0", new Object[]{this, parcel}) : new AccountInfo(parcel);
            }

            public AccountInfo[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AccountInfo[]) ipChange.ipc$dispatch("b1572f01", new Object[]{this, new Integer(i)}) : new AccountInfo[i];
            }
        };
    }
}

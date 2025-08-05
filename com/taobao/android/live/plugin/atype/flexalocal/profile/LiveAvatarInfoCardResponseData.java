package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveAvatarInfoCardResponseData implements INetDataObject {
    public String agencyCompany;
    public AnchorSubscribeInfo anchorSubscribeInfo;
    public List<AnchorTag> anchorTags;
    public String brief;
    public String broadCasterName;
    public String broadCasterPic;
    public List<Object> broadCasterTags;
    public boolean canShowFavoriteDesc;
    public ChatGroupInfo chatGroupInfo;
    public List<Object> countStrDetails;
    public boolean dianTaoStyle;
    public boolean follow;
    public String headAtmospherePic;
    public String headJumpUrl;
    public String managerContent;
    public String managerShop;
    public SimpleReplayLive playbackInfo;
    public PreLiveInfo preLiveInfo;
    public String shopJumpUrl;
    public ShopWindow shopWindow;
    public String sourceType;
    public boolean topFollow;
    public List<SimpleContent> videos;

    /* loaded from: classes6.dex */
    public class AnchorSubscribeInfo implements Serializable {
        public String jumpUrl;
        public String title;

        static {
            kge.a(-1227730145);
            kge.a(1028243835);
        }

        public AnchorSubscribeInfo() {
        }
    }

    /* loaded from: classes6.dex */
    public class AnchorTag implements Serializable {
        public String desc;
        public String detailDesc;
        public String detailTitle;
        public String tagName;
        public int tagType;

        static {
            kge.a(865836641);
            kge.a(1028243835);
        }

        public AnchorTag() {
        }
    }

    /* loaded from: classes6.dex */
    public class ChatGroupInfo implements Serializable {
        public static final long serialVersionUID = 1;
        public String canJoinChatGroup;
        public String chatGroupID;
        public String isInChatGroup;

        static {
            kge.a(718347025);
            kge.a(1028243835);
        }

        public ChatGroupInfo() {
        }
    }

    /* loaded from: classes6.dex */
    public static class GenerateParams implements Serializable {
        public String controlName;
        public HashMap<String, String> params;

        static {
            kge.a(1231352607);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public class PreLiveInfo implements Serializable {
        public String content;
        public String jumpUrl;
        public long liveId;
        public String title;

        static {
            kge.a(-604730823);
            kge.a(1028243835);
        }

        public PreLiveInfo() {
        }
    }

    /* loaded from: classes6.dex */
    public static class ShopItem implements Serializable {
        public String itemId;
        public String itemName;
        public String itemPic;
        public String itemUrl;
        public String liveId;
        public String promotionPrice;
        public UtParams utParams;

        static {
            kge.a(-316332563);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class ShopWindow implements Serializable {
        public List<ShopItem> itemList;
        public TitleSection titleSection;
        public UtParams utParams;

        static {
            kge.a(1337997386);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public class SimpleContent implements Serializable {
        public static final long serialVersionUID = 1;
        public String cover;
        public Long id;
        public String jumpUrl;
        public String name;
        public String sourceType;
        public String type;

        static {
            kge.a(1239581219);
            kge.a(1028243835);
        }

        public SimpleContent() {
        }
    }

    /* loaded from: classes6.dex */
    public class SimpleReplayLive implements Serializable {
        public static final long serialVersionUID = 1;
        public String content;
        public String jumpUrl;
        public long liveId;
        public String startTime;
        public String title;

        static {
            kge.a(-1242629239);
            kge.a(1028243835);
        }

        public SimpleReplayLive() {
        }
    }

    /* loaded from: classes6.dex */
    public static class TitleSection implements Serializable {
        public String desc;
        public String jumpUrl;
        public String title;

        static {
            kge.a(-2069436879);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class UtParams implements Serializable {
        public GenerateParams clickParams;
        public GenerateParams showParams;

        static {
            kge.a(34277321);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1568020096);
        kge.a(-540945145);
    }
}

package com.taobao.taolive.sdk.model.common;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.MillionbabyInfo;
import com.taobao.taolive.sdk.model.interact.ShareDo;
import com.taobao.taolive.sdk.model.interact.Sharer;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class VideoInfo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LIVE_STATUS_END = 1;
    public static final int LIVE_STATUS_LIVE = 0;
    public static final int LIVE_STATUS_NONE_EXISTS = -1;
    public static final int LIVE_STATUS_PAUSE = 3;
    public static final int LIVE_STATUS_UNSTART = 4;
    public static final String ROOM_STATUS_LIVE = "1";
    public static final String ROOM_STATUS_PRELIVE = "0";
    public static final String ROOM_STATUS_REPLAY = "2";
    public static final String STREAM_STATUS_LIVE = "1";
    public static final String STREAM_STATUS_PAUSE = "0";
    public AccessInfo accessInfo;
    public AccountTag accountTag;
    public String activityIds;
    public List<String> activityTypes;
    public AdmireInfo admireInfo;
    public AlimamaEnjoyFirst alimamaEnjoyFirst;
    public String anchorNotice;
    public String avatarPopupUrl;
    public String backgroundImageURL;
    public String backgroundImageUrlV2;
    public boolean bcIdentify;
    public boolean bcLiveLinkage;
    public LiveShowCaseBenefit benefit;
    public String bizCode;
    public BizInfo bizInfo;
    public AccountInfo broadCaster;
    public String cartsEntranceUrl;
    public String channel;
    public JSONObject clientInteracts;
    public boolean closeAddOneComment;
    public boolean closeLeftAndRightSlide;
    public boolean closeUpAndDownSlide;
    public boolean closeXiaochuang;
    public ArrayList<CommentIcon> commentIcons;
    public int commentSwitchStatus;
    public ArrayList<ConventionItem> conventionList;
    public String coverImg;
    public String coverImg169;
    public ArrayList<LiveItem> curItemList;
    public int curItemNum;
    public CurPreLiveInfo curPreLiveInfo;
    public String dataSource;
    public DegradeInfo degradeInfo;
    public String descInfo;
    public DTGroupBuyingInfo diantaoGroupBuyingInfo;
    public String disPatchTrackInfo;
    public String dispatchItemID;
    public String displayExtParams;
    public DiantaoDisplayInfo displayInfo;
    public DynamicRender dynamicRender;
    public boolean edgePcdn;
    public boolean enableHideWatchNums;
    public int extraBizType;
    public List<ExtraGoodsTabItem> extraGoodsTabList;
    public ArrayList<ItemListTabInfo> extraWeexUrlList;
    public String favorIcon;
    public String favorImg;
    public List<Feedback> feedBackList;
    public boolean fetchCommentsUseLMSDK;
    public boolean fetchCommentsUseMtop;
    public boolean fetchItemCardRealTimeData;
    public boolean fetchItemUseCdn;
    public String fetchItemUseCdnUrl;
    public String fetchMSGCdnUrl;
    public FirstRenderInfo firstRenderInfo;
    public boolean followBroadCaster;
    public boolean forceCommentsUseCdn;
    public boolean fullScreen;
    public String gameId;
    public boolean groupBuyShare;
    public boolean h265;
    public boolean hasAddCart;
    public String hasItemSearchEntrance;
    public boolean hasSei;
    public String headWeex;
    public String[] hiddenElementList;
    public HashMap<String, String> hierarchyIcons;
    public String holdItemIds;
    public ArrayList<LiveItem> hotItemList;
    public List<ImportantEventItem> importantEventList;
    public InfoCard infoCard;
    public int inputCodeLevel;
    public String inputStreamUrl;
    public boolean intelligence;
    public String intelligenceSceneUrl;
    public ArrayList<String> interacts;
    public boolean isAD;
    public String itemCategoryEnabled;
    public String itemCheck1111;
    public JSONObject itemConfigInfo;
    public String itemHoldType;
    public String itemListShowType;
    public String itemListType;
    public String itemNoBeauty;
    public JSONObject itemTransferInfo;
    public String itemid;
    public long joinCount;
    public boolean landScape;
    public String latestPreLiveId;
    public String latestPreLiveStartTime;
    public String latestPreLiveStartTimeDesc;
    public boolean latestPreUserSubscribe;
    public LinkageInfo linkage;
    public boolean linklivePower;
    public String liveBizType;
    public String liveConfigForStream;
    public String liveId;
    public String liveIntroduction;
    public boolean liveIsdestroy;
    public boolean liveLinkage;
    public ArrayList<LiveMarketingInfo> liveMarketingInfo;
    public LivePlayExtendMap livePlayExtendMap;
    public SubLiveInfo liveSubView;
    public JSONArray liveTags;
    public String liveTemplateId;
    public String liveUrl;
    public String liveUrlHls;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String livexShareCardUrl;
    public String location;
    public int maxItemNum;
    public String mediaConfig;
    public String menuWeex;
    public MillionbabyInfo millionBaby;
    public MoreLiveTips moreLiveTips;
    public String nativeFeedDetailUrl;
    public String nbItemStatus;
    public boolean needFetchCdn;
    public long newRoomType;
    public HashMap<String, String> newtonParamsMap;
    public String noSjsdReason;
    public OfficialLiveInfo officialLiveInfo;
    public String openReportUrl;
    public JSONObject originalData;
    public String paidLiveType;
    public String playErrorRedirectUrl;
    public String playModeLandscape;
    public String playModePortrait;
    public MillionbabyInfo.PlayerSetting playerSetting;
    public JSONObject pmContext;
    public ArrayList<LiveItem> popItemCardList;
    public String positionForVideo;
    public long praiseCount;
    public boolean presentHierarchy;
    public ProjectScreenInfo projectScreenInfo;
    public boolean publishCommentsUseMtop;
    public String pushFeature;
    public String pushUserId;
    public boolean rateAdapte;
    public String recExtParams;
    public String recommendBindId;
    public String recommendReason;
    public String relatedAccountId;
    public String relatedAccountType;
    public String replayUrl;
    public String reportUrl;
    public String reportUrlPopLayer;
    public RoomExtendInfo roomExtend;
    public String roomNum;
    public String roomStatus;
    public int roomType;
    public String sceneType;
    public String screenRecordingAllowed;
    public boolean secKillHitPublishToLiveItemList;
    public boolean secSkillNeedLimit;
    public String secretUserId;
    public String shareType;
    public String shareUrl;
    public ShareDo shareUrlDO;
    public Sharer sharer;
    public boolean shopHasVip;
    public boolean shopVip;
    public boolean showQueryExplain;
    public LiveItem sourceGood;
    public long startTime;
    public StaticRender staticRender;
    public String streamStatus;
    public boolean subscribeQueryEnable;
    public String superLiveAtmosphereUrl;
    public String switchMap;
    public JSONObject switchTagMap;
    public TaoLiveAtmosphereInfo taoLiveAtmosphereInfo;
    public long taolivePv;
    public String taolivePvFormat;
    public TBTVProgramInfo tbtvLiveDO;
    public JSONObject tcpContext;
    public HashMap<String, String> theme;
    public String themeAction;
    public String tidbitsUrl;
    public LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
    public String timeMovingPlayUrl;
    public String timeMovingTypeInfo;
    public String timePlayUrl;
    public String title;
    public String toast;
    public List<GoodTopEntrance> topBarEntranceUrl;
    public String topic;
    public long totalJoinCount;
    public String trackInfo;
    public Boolean trialBroadcast;
    public String tvChannelId;
    public int type;
    public boolean useNewRecommendsApi;
    public long viewCount;
    public String viewCountFormat;
    public HashMap<String, String> visitorIdentity;
    public String voiceSilent;
    public int vr3dfovlat;
    public int vr3dfovlng;
    public int vr3dtype;
    public int vrType;
    public WeexBundleUrl weexBundleUrl;
    public boolean groupBuy = true;
    public int status = -1;
    public boolean mIsTimeMove = false;

    /* loaded from: classes8.dex */
    public static class AccessInfo implements INetDataObject {
        public boolean access;
        public String accessType;
        public String poplayerUrl;

        static {
            kge.a(2133213762);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class AccountTag implements INetDataObject {
        public String backgroundUrl;
        public String tagIcon;
        public String tagName;
        public String title;

        static {
            kge.a(-1822754755);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class ActivityInfo implements INetDataObject {
        public String activityPosition;
        public boolean onlyOneOpen;
        public String scriptUrl;
        public String scriptUrl4LandScape;
        public String type;

        static {
            kge.a(1227124333);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class AdmireInfo implements INetDataObject {
        public String accountJumpUrl;
        public boolean contributionEnabled;
        public boolean enableGiftMultiSend;
        public boolean enableInvisibility;
        public FreeGiftInfo freeGift;
        public String giftIcon;
        public boolean giftIsNeedBackGround;
        public boolean hasFansClub;
        public JSONObject invisibilityJumpInfo;
        public boolean isFeedCat;
        public boolean juvenileRefund;

        static {
            kge.a(-212517552);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class AlimamaEnjoyFirst implements INetDataObject {
        public String eurl;
        public String ifs;

        static {
            kge.a(2001830971);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class BizInfo implements INetDataObject {
        public ArrayList<ActivityInfo> data;

        static {
            kge.a(-634861487);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class CommentIcon implements INetDataObject {
        public String icon;
        public String name;

        static {
            kge.a(566236008);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class CurPreLiveInfo implements INetDataObject {
        public String curPreLiveId;
        public String curPreLiveStartTimeDesc;
        public boolean curPreUserSubscribe;

        static {
            kge.a(560968493);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class DTGroupBuyingInfo implements INetDataObject {
        public boolean enableGroupBuying;
        public String jumpUrl;

        static {
            kge.a(-1195560023);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class DegradeInfo implements INetDataObject {
        public boolean cdnDegrade;
        public String degradeUrl;

        static {
            kge.a(-736819788);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class DiantaoDisplayInfo implements INetDataObject {
        public DiantaoOfficialAtmosphereInfo diantaoOfficialAtmosphereInfo;
        public int diantaoRoomType;

        static {
            kge.a(-535690864);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class DiantaoOfficialAtmosphereInfo implements INetDataObject {
        public String taoLiveIcon;

        static {
            kge.a(289498043);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class DynamicRender implements INetDataObject {
        public String h5DynamicRenderUrl;
        public String h5DynamicRenderVersion;
        public String weexDynamicRenderUrl;
        public String weexDynamicRenderUrl4LandScape;

        static {
            kge.a(903520933);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class ExtraGoodsTabItem implements INetDataObject {
        public String anchorTab;
        public String bizType;
        public String showCart;
        public String showOrderList;
        public String showSearch;
        public String showTab;
        public List<String> showTopBarType;
        public String title;
        public String type;
        public String url;

        static {
            kge.a(-952145870);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class Feedback implements INetDataObject {
        public static final String TYPE_NOT_WATCH = "BROADCASTER";
        public static final String TYPE_REDUCE_RECOMMEND = "KIND_OF_BROADCASTER";
        public String icon;
        public int id;
        public String text;
        public String type;

        static {
            kge.a(343750037);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class FirstRenderInfo implements INetDataObject {
        public int highPlayIndex;
        public int lowPlayIndex;
        public long switchDelay;

        static {
            kge.a(1701361188);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class FreeGiftInfo implements INetDataObject {
        public String bizType;
        public String giftIcon;
        public String giftId;
        public boolean isMaxFreeCount;
        public String source;
        public int sumCount;
        public String tabId;
        public float timePerCycle;
        public String toast;

        static {
            kge.a(1562524314);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class GoodTopEntrance implements INetDataObject {
        public String entranceUrl;
        public String title;
        public int type;

        static {
            kge.a(-1044181474);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class InfoCard implements INetDataObject {
        public String infoCardId;
        public String infoCardItemBusinessInfo;
        public String infoCardType;
        public String infoCardUrl;
        public String infoCardUrlV2;

        static {
            kge.a(712677102);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class ItemListTabInfo implements INetDataObject {
        public String title;
        public String url;

        static {
            kge.a(-1065667006);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class LiveMarketingInfo implements INetDataObject {
        public String title;
        public String type;
        public String url;

        static {
            kge.a(2090894936);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class LivePlayExtendMap implements INetDataObject {
        public String landscapeAspect;

        static {
            kge.a(1670264178);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class LiveShowCaseBenefit implements INetDataObject {
        public String benefitItemList;
        public LiveShowCaseDiscount discountUIModel;

        static {
            kge.a(1980183918);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class LiveShowCaseDiscount implements INetDataObject {
        public String discountAmount;
        public String discountSubtitle;
        public String discountTitle;
        public String rightText;

        static {
            kge.a(-156561590);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class MoreLiveTips implements INetDataObject {
        public String imageUrl;
        public String modType;
        public String picTip;
        public String showEntry;
        public String title;

        static {
            kge.a(1575968457);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class OfficialLiveInfo implements INetDataObject {
        public String accountId;
        public String accountName;
        public String activityName;
        public String activityStatus;
        public String encryptAnchorId;
        public String follow;
        public String officialHeadImg;
        public String officialLive;
        public String officialLiveId;
        public String officialLiveTopic;
        public String praiseCount;
        public String pvCount;
        public List<AccountInfo.BroadCasterTag> viconInfos;
        public List<String> vicons;
        public String viewCountFormat;

        static {
            kge.a(1133793749);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class ProjectScreenInfo implements INetDataObject {
        public String enableProjectScreen;
        public String projectScreenPlayUrl;
        public String projectScreenPlayUrlBackup;

        static {
            kge.a(1970497315);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class RoomExtendInfo implements INetDataObject {
        public boolean chaoliu;

        static {
            kge.a(-147046349);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class StaticRender implements INetDataObject {
        public String weexStaticRenderUrl;
        public String weexStaticRenderUrl4LandScape;

        static {
            kge.a(896316340);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class SubLiveInfo implements INetDataObject {
        public String mainIcon;
        public String mainTitle;
        public String subIcon;
        public ArrayList<QualitySelectItem> subLiveUrlList;
        public String subTitle;

        static {
            kge.a(1194906122);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class TaoLiveAtmosphereInfo implements INetDataObject {
        public boolean taoLiveHideMenu;
        public String taoLiveHideMenuPic;
        public String taoLiveIcon;
        public String taoLiveIconJumpUrl;
        public String taoLiveLandScapeIcon;
        public String taoLiveLandScapeMenuBackgroundPic;

        static {
            kge.a(-1512281042);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class WeexBundleUrl implements INetDataObject {
        public String goodsListClient;
        public String hostDashboard;
        public String hostToolsPortrait;
        public String landscapeBundle;
        public String livingBundle;
        public String preBundle;

        static {
            kge.a(1649124988);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1556201292);
        kge.a(-540945145);
    }

    public boolean isOfficialLive() {
        OfficialLiveInfo officialLiveInfo;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("982b80cc", new Object[]{this})).booleanValue() : u.aP() && (officialLiveInfo = this.officialLiveInfo) != null && !StringUtils.isEmpty(officialLiveInfo.officialLive) && "1".equals(this.roomStatus);
    }

    public boolean isOfficialType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b5b881a", new Object[]{this})).booleanValue() : isOfficialLive() && "official".equals(this.officialLiveInfo.officialLive);
    }

    public boolean enableProjectScreen() {
        ProjectScreenInfo projectScreenInfo;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3477bad", new Object[]{this})).booleanValue() : u.aR() && "1".equals(this.roomStatus) && (projectScreenInfo = this.projectScreenInfo) != null && "true".equals(projectScreenInfo.enableProjectScreen) && (!StringUtils.isEmpty(this.projectScreenInfo.projectScreenPlayUrl) || !StringUtils.isEmpty(this.projectScreenInfo.projectScreenPlayUrlBackup));
    }
}

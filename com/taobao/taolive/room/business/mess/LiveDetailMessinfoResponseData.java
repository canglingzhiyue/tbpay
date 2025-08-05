package com.taobao.taolive.room.business.mess;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveDetailMessinfoResponseData implements a, INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ActivityInfo activity;
    public Map<String, ArrayList<ActivityInfo>> bizInfo;
    public String hasLive;
    public LiveHeadBanner liveHeadBanner;
    public String powerMessageKey;
    public String snsNick;
    public SponsorData sponsor;
    public String streamStatus;
    public TBTVData tbtvMenuBanner;
    public String timerInteractive;
    public ArrayList<RecVideo> upDownVideo;
    public HashMap<String, String> visitorIdentity;

    /* loaded from: classes8.dex */
    public static class ActivityInfo implements INetDataObject {
        public String activityPosition;
        public String bizData;
        public String bizType;
        public String enterAnimation;
        public String exitAnimation;
        public String modal;
        public String msgUuid;
        public String onlyOneOpen;
        public String scriptUrl;
        public String type;

        static {
            kge.a(432256811);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class AdEurlParams implements INetDataObject {
        public String eurl;
        public int pay_time;

        static {
            kge.a(-1998479263);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class Advs implements INetDataObject {
        public long endTime;
        public String logoUrl;
        public String missionId;
        public String shopId;
        public String shopUrl;
        public long startTime;

        static {
            kge.a(587683566);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class AlimamaInfo implements INetDataObject {
        public Map<String, Object> clickInfo;
        public String clickid;
        public String context;
        public String eurl;
        public String ifsUrl;
        public String interactiveid;
        public int pay_time;
        public String pid;

        static {
            kge.a(1707403782);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class AlimamaInfo2 implements INetDataObject {
        public ArrayList<String> action_list;
        public String adLiveId;
        public String eurl;
        public String pay_url;

        static {
            kge.a(1389909740);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class DxData implements INetDataObject {
        static {
            kge.a(-2068921428);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class LiveHeadBanner implements INetDataObject {
        public String bkUrl;
        public String iconUrl;
        public String title;

        static {
            kge.a(1872377478);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class RecVideo implements INetDataObject {
        public String accountId;
        public AdEurlParams adEurlParams;
        public AlimamaInfo2 adTransParams;
        public AlimamaInfo alimama;
        public String anchorId;
        public int autoRecommendInterval;
        public int autoRecommendRepeat;
        public HashMap<String, Object> clientReturnMap;
        public String coverImg;
        public boolean edgePcdn;
        public Map<String, String> explainDebugInfo;
        public String extendMap;
        public String feedType;
        public boolean h265;
        public String keyPointId;
        public String liveId;
        public ArrayList<QualitySelectItem> liveUrlList;
        public String mediaConfig;
        public String mediaSourceType;
        public Map<String, String> modelDebugInfo;
        public String nativeFeedDetailUrl;
        public String productType;
        public boolean rateAdapte;
        public String recommendBindId;
        public RecommendCardInfo recommendCardInfo;
        public ReserveItemCardInfo reserveItemCardInfo;
        public List<SideGudieInfo> sideGudieInfo;
        public String sjsdItemId;
        public int supportPreLoad;
        public String timeMovingId;
        public String timeMovingSpfPlayVideo;
        public String title;
        public String trackInfo;
        public String updownPromptText;
        public String updownRecommendDesc;
        public long viewCount;

        static {
            kge.a(160229273);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class RecommendCardInfo implements INetDataObject {
        public JSONObject dxData;
        public String dxTemplateName;

        static {
            kge.a(1084803756);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class ReserveItemCardInfo implements INetDataObject {
        public RecommendCardInfo bottomInfo;
        public RecommendCardInfo cardInfo;

        static {
            kge.a(-779591585);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class SponsorData implements INetDataObject {
        public ArrayList<Advs> advs = new ArrayList<>();

        static {
            kge.a(1291976022);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class TBTVData implements INetDataObject {
        public String bigLogo;
        public String bubbleBkUrl;
        public String menuUrl;
        public String preLive;
        public String smallLogo;
        public String supportNewLogo;
        public String supportNewUrl;
        public String supportUrl;

        static {
            kge.a(-2077517080);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1929485110);
        kge.a(-540945145);
        kge.a(-380930225);
    }

    @Override // com.taobao.taolive.room.business.mess.a
    public String hasLiveId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a8135338", new Object[]{this}) : this.hasLive;
    }
}

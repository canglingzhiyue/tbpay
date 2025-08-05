package com.taobao.live.timemove.base.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.video.videoitem.domain.model.AccountInfo;
import com.taobao.live.timemove.video.videoitem.domain.model.LiveItem;
import com.taobao.live.timemove.video.videoitem.domain.model.QualitySelectItem;
import com.taobao.live.timemove.video.videoitem.domain.model.TppParamFeedInfo;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class RecModel implements INetDataObject, IRecyclerModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEDIA_TYPE_LIVE = "live";
    public static final String MEDIA_TYPE_TIMEMOVE = "timemove";
    public String accountId;
    public String anchorId;
    public JSONObject atmosphereInfo;
    public AccountInfo broadCaster;
    public JSONObject cardConfig;
    public HashMap<String, Object> clientReturnMap;
    public String contentType;
    public String coverImg;
    public boolean edgePcdn;
    public String extendMap;
    public TppParamFeedInfo feedExtraInfo;
    public String feedType;
    public boolean h265;
    public boolean isFirst;
    public ItemInfo itemInfo;
    public List<ItemInfo> itemInfoList;
    public String liveId;
    public LiveInfo liveInfo;
    public String liveServerParams;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String mediaConfig;
    public String mediaSourceType;
    public String mediaType;
    public int miniNum;
    public String nativeFeedDetailUrl;
    public String pushFeature;
    public boolean rateAdapte;
    public JSONObject rawData;
    public String replayUrl;
    public int roomStatus;
    public JSONObject sjsdBubble;
    public boolean sjsdCard;
    public String themeTagId;
    public TimeMovingPlayInfo timeMovingPlayInfo;
    public String topic;
    public JSONObject topicContentInfo;
    public String trackInfo;
    public String updownPromptText;
    public String updownRecommendDesc;
    public long viewCount;
    public boolean pmSubscriber = true;
    public int subscriberDelay = 3000;
    public int supportPreLoad = 1;

    /* loaded from: classes7.dex */
    public static class ExtraPlayInfo implements INetDataObject {
        public String mp4Url;

        static {
            kge.a(-604706193);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes7.dex */
    public static class LiveInfo implements INetDataObject {
        public int isAd;
        public int itemCount;
        public boolean landScape;
        public String liveId;
        public int newRoomType;
        public int praiseCount;
        public String recommendTitle;
        public int roomStatus;
        public int roomType;
        public boolean showLbs;
        public int streamStatus;
        public String title;
        public String topic;
        public int viewCount;
        public String viewCountFormat;

        static {
            kge.a(771811677);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes7.dex */
    public static class SpfPlayVideo implements INetDataObject {
        public ExtraPlayInfo extraPlayInfo;
        public String playInfo;
        public String seekTime;
        public List<TimeMovingLabelInfos> timeMovingLabelInfos;
        public String timeMovingUtParams;
        public String videoSource;
        public String videoType;

        static {
            kge.a(-2084547039);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes7.dex */
    public static class TimeMovingLabelInfos implements INetDataObject {
        public String labelName;
        public long oppsTime;
        public int tagId;

        static {
            kge.a(419474415);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes7.dex */
    public static class TimeMovingPlayInfo implements INetDataObject {
        public Ext extendVal = new Ext();
        public boolean isMounting;
        public boolean isSpeaking;
        public String itemId;
        public SpfPlayVideo spfPlayVideo;
        public int startSeekTime;
        public String timeMovingId;
        public String timeMovingM3u8Url;
        public String timeMovingPageUrl;
        public String videoId;

        static {
            kge.a(-1462402432);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1424755775);
        kge.a(-540945145);
        kge.a(1505143947);
    }

    @Override // com.taobao.taolive.sdk.controller.IRecyclerModel
    public int getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue();
        }
        if (TextUtils.isEmpty(this.mediaType) || "live".equals(this.mediaType)) {
            return ContentType.SimpleLive.ordinal();
        }
        if (MEDIA_TYPE_TIMEMOVE.equals(this.mediaType.toLowerCase())) {
            return ContentType.NewTimeMoving.ordinal();
        }
        return ContentType.SimpleLive.ordinal();
    }

    @Override // com.taobao.taolive.sdk.controller.IRecyclerModel
    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        String str = "";
        if (getViewType() == ContentType.NewTimeMoving.ordinal()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.liveId);
            sb.append("_");
            TimeMovingPlayInfo timeMovingPlayInfo = this.timeMovingPlayInfo;
            if (timeMovingPlayInfo != null) {
                str = timeMovingPlayInfo.timeMovingId;
            }
            sb.append(str);
            return sb.toString();
        }
        return this.liveId + str;
    }

    /* loaded from: classes7.dex */
    public static class ItemInfo implements INetDataObject, Comparable<ItemInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String customizedItemRights;
        public String goodIndex;
        public boolean isSpeaking;
        public String itemId;
        public String itemPic;
        public String itemTitle;
        public String itemType;
        public String jumpUrl;
        public String price;

        static {
            kge.a(531646468);
            kge.a(-540945145);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public int compareTo(ItemInfo itemInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b1f9e865", new Object[]{this, itemInfo})).intValue();
            }
            if (!TextUtils.isEmpty(this.goodIndex) && !TextUtils.isEmpty(itemInfo.goodIndex)) {
                return Integer.parseInt(this.goodIndex) - Integer.parseInt(itemInfo.goodIndex);
            }
            return 0;
        }
    }

    /* loaded from: classes7.dex */
    public static class Ext implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String adgrid;
        public String anchorId;
        public String atmosphere;
        public JSONArray atmosphereList;
        public String bizType;
        public String bulkEndTime;
        public String bulkPrice;
        public int bulkSize;
        public String business;
        private JSONObject businessJSON;
        public String buyCount;
        public String canEnjoyDiscounts;
        public String categoryLevelLeaf;
        public String categoryLevelLeafName;
        public String categoryLevelOne;
        public String categoryLevelOneName;
        public String commission;
        private JSONObject commissionJSON;
        public String context;
        public String customizedItemRights;
        public String defaultRight;
        public String discountsQuota;
        public boolean enableSKU = true;
        public String exclusivePrice;
        public String goodService;
        public String goodsSubscribeType;
        public String groupInfo;
        private LiveItem.GroupInfo groupInfoObj;
        public String groupItemId;
        public String groupItemInfos;
        public String groupItemShowPrice;
        public String groupItemTitle;
        public String groupItemTradeParams;
        public String isBulk;
        public String isCpc;
        public String isTop;
        public String isYanxuan;
        public String itemBizType;
        public String itemCategoryId;
        public String itemCategoryIdList;
        public List<String> itemCategoryIds;
        public String itemEntrySource;
        public String itemIcon;
        public String itemIconOfficial;
        public String itemIconPromotion;
        public int itemNotInPocket;
        public String itemPick;
        public String itemShopType;
        public String itemTabSource;
        private ArrayList<String> itemTagList;
        public String itemTags;
        public String itemType;
        private JSONArray itemTypeJSONArray;
        public String itemUniqueKey;
        public String liveId;
        public String liveItemBizTags;
        public String liveUserNick;
        public String materialName;
        public String msgUuid;
        public boolean needJumpH5;
        public String needRecovery;
        public String playUrl;
        public String refpid;
        public String rightType;
        public String scene;
        public String secKillInfo;
        public String secKillRecordId;
        public String subTitle;
        public String submissionId;
        public String time;
        public String timeMovingContentId;
        public String timeMovingPlayInfo;
        public String timeMovingStampInfo;
        public String timeMovingTypeInfo;
        public long timeVersion;
        public int timemovingstatus;
        public String timepoint;
        public String trackInfo;
        public JSONObject trackInfoJSON;
        public String tradeParams;
        private JSONObject tradeParamsJSON;
        public String userType;

        static {
            kge.a(1418959518);
            kge.a(-540945145);
        }

        public JSONObject getTrackInfoJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("6ceea372", new Object[]{this});
            }
            if (this.trackInfoJSON == null && !TextUtils.isEmpty(this.trackInfo)) {
                try {
                    this.trackInfoJSON = JSON.parseObject(this.trackInfo);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return this.trackInfoJSON;
        }

        public JSONObject getTradeParamsJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("6d0f0363", new Object[]{this});
            }
            if (this.tradeParamsJSON == null && !TextUtils.isEmpty(this.tradeParams)) {
                try {
                    this.tradeParamsJSON = JSON.parseObject(this.tradeParams);
                } catch (Exception unused) {
                }
            }
            return this.tradeParamsJSON;
        }

        public void setGroupInfoObj(LiveItem.GroupInfo groupInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc444c3f", new Object[]{this, groupInfo});
            } else {
                this.groupInfoObj = groupInfo;
            }
        }

        public LiveItem.GroupInfo getGroupInfoObj() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveItem.GroupInfo) ipChange.ipc$dispatch("ed19b35b", new Object[]{this});
            }
            if (this.groupInfoObj == null && !TextUtils.isEmpty(this.groupInfo)) {
                try {
                    this.groupInfoObj = (LiveItem.GroupInfo) JSON.parseObject(this.groupInfo, LiveItem.GroupInfo.class);
                } catch (Exception unused) {
                }
            }
            return this.groupInfoObj;
        }

        public void setItemTypeArray(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c5828d9", new Object[]{this, jSONArray});
            } else {
                this.itemTypeJSONArray = jSONArray;
            }
        }

        public JSONArray getItemType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("7b015794", new Object[]{this});
            }
            if (this.itemTypeJSONArray == null && !TextUtils.isEmpty(this.itemType)) {
                this.itemTypeJSONArray = JSONObject.parseArray(this.itemType);
            }
            return this.itemTypeJSONArray;
        }

        public JSONObject getBusinessJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b367f3c5", new Object[]{this});
            }
            if (this.businessJSON == null && !TextUtils.isEmpty(this.business)) {
                this.businessJSON = JSONObject.parseObject(this.business);
            }
            return this.businessJSON;
        }

        public ArrayList<String> getItemTags() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("20105823", new Object[]{this});
            }
            this.itemTagList = new ArrayList<>();
            if (!TextUtils.isEmpty(this.itemTags)) {
                this.itemTagList = (ArrayList) JSON.parseObject(this.itemTags, ArrayList.class);
            }
            return this.itemTagList;
        }

        public JSONObject getCommissionJson() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("f81d090", new Object[]{this});
            }
            if (this.commissionJSON == null && !TextUtils.isEmpty(this.commission)) {
                this.commissionJSON = JSONObject.parseObject(this.commission);
            }
            return this.commissionJSON;
        }
    }

    public boolean isSimpleLive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42002b13", new Object[]{this})).booleanValue() : getViewType() == ContentType.SimpleLive.ordinal();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return getViewItemId().equals(((RecModel) obj).getViewItemId());
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : getViewItemId().hashCode();
    }
}

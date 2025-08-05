package com.taobao.taolive.sdk.model.common;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pqj;

/* loaded from: classes8.dex */
public class LiveItem implements INetDataObject, Comparable<LiveItem> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _itemPos;
    public String asac;
    public String clickSource;
    public String cpsClickPos;
    public Map<String, String> extraUTParams;
    public int goodsIndex;
    public int groupNum;
    public boolean isSpeaking;
    public String isSubscribe;
    public String isTop;
    public JSONObject itemActionData;
    public JSONObject itemConfigInfo;
    public JSONObject itemExtData;
    public String itemH5TaokeUrl;
    public JSONArray itemIcons;
    public long itemId;
    public String itemName;
    public String itemPic;
    public String itemPrice;
    public String itemShortTitle;
    public String itemType;
    public String itemUrl;
    public String liveId;
    public JSONObject liveItemStatusData;
    public JSONObject nativeConfigInfos;
    public String native_buttonStatus;
    public boolean native_canShowVipEntrance;
    public String native_channel;
    public JSONArray native_itemBenefits;
    public boolean native_topItemAnimShow;
    public boolean native_vipTagsShow;
    public JSONObject personalityData;
    public JSONArray picTopLabels;
    public SabItemAtmosphere sabItemAtmosphere;
    public SabItemAtmosphere sabItemAtmospherePreHeat;
    public Ext extendVal = new Ext();
    public boolean itemTimeshift = false;

    /* loaded from: classes8.dex */
    public static class ExtraPlayInfo implements INetDataObject {
        public String mp4Url;

        static {
            kge.a(-596389566);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class GroupInfo implements INetDataObject {
        public static final int BUYING = 1;
        public static final int END = 2;
        public static final int SELLOUT = 3;
        public long activityBegin;
        public long activityEnd;
        public String activityId;
        public String backUserImg;
        public String channelCode;
        public String salesDesc;
        public int salesQuantity;
        public String shareDesc;
        public String shareIcon;
        public boolean shared;
        public List<StagePrice> stagePriceList;
        public int status;
        public long totalInventory;
        public String uChannel;

        static {
            kge.a(1419296477);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public enum LiveItemBenefitType {
        NEW_CUSTOMER_BENEFIT(0, "newCustomerBenefit"),
        LIVE_SPECIAL_COUPON(1, "aliveSpecialCoupon");
        
        private String desc;
        private int type;

        LiveItemBenefitType(int i, String str) {
            this.type = i;
            this.desc = str;
        }

        public static LiveItemBenefitType getLiveItemBenefitType(String str) {
            LiveItemBenefitType liveItemBenefitType = LIVE_SPECIAL_COUPON;
            return !TextUtils.isEmpty(str) ? LIVE_SPECIAL_COUPON.desc.equals(str) ? LIVE_SPECIAL_COUPON : NEW_CUSTOMER_BENEFIT.desc.equals(str) ? NEW_CUSTOMER_BENEFIT : liveItemBenefitType : liveItemBenefitType;
        }
    }

    /* loaded from: classes8.dex */
    public static class SabItemAtmosphere implements INetDataObject {
        public String atmosphereBgImg;
        public String benefitTitle;
        public String benefitTitleImg;
        public String clickAction;
        public String posterMark;
        public String rightType;
        public String subBenefitTitle;
        public String subRightType;

        static {
            kge.a(-106122087);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class SpfPlayVideo implements INetDataObject {
        public ExtraPlayInfo extraPlayInfo;
        public String playInfo;
        public String seekTime;
        public List<TimeMovingLabelInfos> timeMovingLabelInfos;
        public String timeMovingUtParams;
        public String videoSource;
        public String videoType;

        static {
            kge.a(825215214);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class StagePrice implements INetDataObject {
        public int stage;
        public long stageCouponPrice;
        public int stageNum;

        static {
            kge.a(892389339);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class TimeMovingMp4Urls implements INetDataObject {
        public String url;

        static {
            kge.a(1311344778);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class TimeMovingPlayInfo implements INetDataObject {
        public boolean isMounting;
        public boolean isSpeaking;
        public String itemId;
        public String keyPointId;
        public String liveGuideTxt;
        public String playUrl;
        public String sjsdItemId;
        public SpfPlayVideo spfPlayVideo;
        public int spotDuration;
        public String timeMovingId;
        public List<TimeMovingLabelInfos> timeMovingLabelInfos;
        public String timeMovingM3u8Url;
        public List<TimeMovingMp4Urls> timeMovingMp4Urls;
        public String timeMovingPageUrl;
        public String timeMovingType;
        public String videoId;

        static {
            kge.a(700770189);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(492894164);
        kge.a(-540945145);
        kge.a(415966670);
    }

    public JSONObject parseJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5862d001", new Object[]{this});
        }
        JSONObject jSONObject = (JSONObject) pqj.b(this);
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.containsKey("extendVal")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("extendVal");
            changeValues(jSONObject2, "groupItemTradeParams");
            changeValues(jSONObject2, "canEnjoyDiscounts");
            changeValues(jSONObject2, "groupItemInfos");
            changeValues(jSONObject2, "secKillInfo");
            jSONObject.put("extendVal", (Object) jSONObject2);
        }
        return jSONObject;
    }

    private void changeValues(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef012ba1", new Object[]{this, jSONObject, str});
        } else if (!jSONObject.containsKey(str)) {
        } else {
            Object obj = jSONObject.get(str);
            if (!(obj instanceof String)) {
                return;
            }
            jSONObject.put(str, pqj.a((String) obj));
        }
    }

    /* loaded from: classes8.dex */
    public static class TimeMovingLabelInfos implements INetDataObject, Comparable<TimeMovingLabelInfos> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String labelName;
        public long oppsTime;
        public int tagId;

        static {
            kge.a(464191932);
            kge.a(-540945145);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public int compareTo(TimeMovingLabelInfos timeMovingLabelInfos) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5556f611", new Object[]{this, timeMovingLabelInfos})).intValue() : Long.compare(this.oppsTime, timeMovingLabelInfos.oppsTime);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8137495", new Object[]{this, liveItem})).intValue() : liveItem.goodsIndex - this.goodsIndex;
    }

    /* loaded from: classes8.dex */
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
        public String closePopItem;
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
        private GroupInfo groupInfoObj;
        public String groupItemId;
        public String groupItemInfos;
        public String groupItemShowPrice;
        public String groupItemTitle;
        public String groupItemTradeParams;
        public String isBulk;
        public String isCpc;
        public boolean isDuplicate;
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
        public String itemSourceType;
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
        public String tradeParamsForPcg;
        private JSONObject tradeParamsJSON;
        public String userType;

        static {
            kge.a(298474801);
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

        public void setGroupInfoObj(GroupInfo groupInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d88e92a5", new Object[]{this, groupInfo});
            } else {
                this.groupInfoObj = groupInfo;
            }
        }

        public GroupInfo getGroupInfoObj() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GroupInfo) ipChange.ipc$dispatch("b7f0b381", new Object[]{this});
            }
            if (this.groupInfoObj == null && !TextUtils.isEmpty(this.groupInfo)) {
                try {
                    this.groupInfoObj = (GroupInfo) JSON.parseObject(this.groupInfo, GroupInfo.class);
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
}

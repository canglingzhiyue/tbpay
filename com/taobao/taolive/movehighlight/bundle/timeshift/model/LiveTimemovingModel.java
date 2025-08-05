package com.taobao.taolive.movehighlight.bundle.timeshift.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveTimemovingModel implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String adgrid;
    public int buyCount;
    public String collectIcon;
    public String collectName;
    public String collectUrl;
    public Object commentsList;
    public String customizedItemRights;
    public String defaultRecommend;
    public LiveItem.Ext extendVal = new LiveItem.Ext();
    public boolean hasSideslip;
    public String isBulk;
    public String isCpc;
    public LiveItem itemCard;
    public JSONObject itemExtData;
    public String itemH5TaokeUrl;
    public String itemId;
    public String itemIndex;
    public String itemPic;
    public String itemPrice;
    public String itemTitle;
    public String itemUrl;
    public String keyPointId;
    public String liveId;
    public JSONObject liveItemStatusData;
    public int pageIndex;
    public JSONObject personalityData;
    public String refpid;
    public RightInfo rightInfo;
    public String shopRecommend;
    public String timeMovingId;
    public JSONObject timeMovingJsonObject;
    public float timestamps;

    /* loaded from: classes8.dex */
    public static class RightInfo implements INetDataObject {
        public String asac;
        public String benefitCode;
        public String channel;
        public String displayAmount;
        public String displayAmountUnit;
        public String displayConditionAmount;
        public String issueEndTime;
        public String issueStartTime;
        public String status;
        public String strategyCode;
        public String type;

        static {
            kge.a(-754036933);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1579892651);
        kge.a(-540945145);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof LiveTimemovingModel) {
            LiveTimemovingModel liveTimemovingModel = (LiveTimemovingModel) obj;
            if (this.itemId.equals(liveTimemovingModel.itemId) && this.itemIndex == liveTimemovingModel.itemIndex) {
                return true;
            }
        }
        return false;
    }
}

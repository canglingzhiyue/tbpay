package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class BaseRecModel implements INetDataObject, IRecyclerModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String accountId;
    public String actionUrl;
    public String algoExtendInfo;
    public String anchorId;
    public HashMap<String, Object> clientReturnMap;
    public String contentType;
    public boolean edgePcdn;
    public String extendMap;
    public String feedType;
    public boolean h265;
    public String imageUrl;
    public Map<String, String> initParams;
    public boolean isFirst;
    public String liveId;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String mediaConfig;
    public String mediaSourceType;
    public boolean rateAdapte;
    public int supportPreLoad = 1;
    public LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
    public String trackInfo;
    public String updownPromptText;
    public String updownRecommendDesc;
    public long viewCount;
    public boolean visit;
    public long watchTime;

    static {
        kge.a(469376569);
        kge.a(-540945145);
        kge.a(1505143947);
    }

    public int getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue() : ContentType.Live.ordinal();
    }

    @Override // com.taobao.taolive.sdk.controller.IRecyclerModel
    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        return this.liveId + "";
    }
}

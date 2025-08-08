package com.taobao.taolive.uikit.cardsuite.data;

import mtopsdk.common.util.StringUtils;
import com.taobao.taolive.uikit.mtop.LiveItem;
import com.taobao.taolive.uikit.mtop.QualitySelectItem;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.prr;

/* loaded from: classes8.dex */
public class TBLiveData implements IMTOPDataObject {
    public static final int ROOM_STATUS_END = 2;
    public static final int ROOM_STATUS_LIVE = 1;
    public static final int ROOM_STATUS_NOTSTART = 0;
    public String accountId;
    public String bizCode;
    public BroadCaster broadCaster;
    public String coverImg;
    public String coverImg169;
    public String descInfo;
    public boolean h265;
    public String id;
    public ArrayList<LiveItem> itemList;
    public String liveChannelId;
    public String liveColumnId;
    public String liveUrl;
    public String liveUrlHls;
    public List<QualitySelectItem> liveUrlList;
    public String location;
    public String mediaConfig;
    public String nativeFeedDetailUrl;
    public String needItem;
    public long praiseCount;
    public boolean rateAdapte;
    public int roomStatus;
    public String scm;
    public boolean shownOnceFlg;
    public SimpleBroadCaster simpleBroadCaster;
    public long startTime;
    public String sxm;
    public String title;
    public String topic;
    public String totalViewCount;
    public String trackInfo;
    public long viewCount;
    public String vscore;

    static {
        kge.a(-266638207);
        kge.a(-350052935);
    }

    public String getLiveUrl() {
        int defalutQualityIndex = getDefalutQualityIndex();
        if (defalutQualityIndex != -1) {
            String str = this.liveUrlList.get(defalutQualityIndex).h265Url;
            return (StringUtils.isEmpty(str) || !prr.a()) ? this.liveUrlList.get(defalutQualityIndex).flvUrl : str;
        }
        return this.liveUrl;
    }

    public int getDefalutQualityIndex() {
        List<QualitySelectItem> list = this.liveUrlList;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        if (this.liveUrlList.size() == 1) {
            return 0;
        }
        return this.liveUrlList.size() >= 2 ? 1 : -1;
    }
}

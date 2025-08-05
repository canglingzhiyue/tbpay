package com.taobao.taolive.room.afccoldlunch;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class SimpleVideoInfo implements INetDataObject {
    public String accountId;
    public String disPatchTrackInfo;
    public String dispatchItemID;
    public String holdItemIds;
    public String itemHoldType;
    public String liveId;
    public ArrayList<MediaData.QualityLiveItem> liveUrlList;
    public String roomStatus;
    public String simpleTransParams;
    public String timeMovingId;
    public String timeMovingSpfPlayVideo;
    public String voiceSilent;

    static {
        kge.a(-1641927856);
        kge.a(-540945145);
    }
}

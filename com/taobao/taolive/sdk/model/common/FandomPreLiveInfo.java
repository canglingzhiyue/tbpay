package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class FandomPreLiveInfo implements INetDataObject {
    public Map<String, Object> _UserData;
    public boolean callForTop;
    public String coverImg;
    public VideoInfo.DynamicRender dynamicRender;
    public ExtendInfo extendInfo;
    public String liveId;
    public String liveTemplateId;
    public Map<String, Object> lotteryInfo;
    public int preItemCount;
    public ArrayList<LiveItem> preLiveItems;
    public String preShareHeadPic;
    public int roomStatus;
    public String shareUrl;
    public boolean showDirver;
    public String startTime;
    public String startTimeDesc;
    public String tidbitsUrl;
    public String tidbitsUrlType;
    public String title;
    public String topic;
    public boolean userSubscribe;

    /* loaded from: classes8.dex */
    public static class ExtendInfo implements INetDataObject {
        public boolean subscribeLottery;

        static {
            kge.a(-1998874637);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(233617561);
        kge.a(-540945145);
    }
}

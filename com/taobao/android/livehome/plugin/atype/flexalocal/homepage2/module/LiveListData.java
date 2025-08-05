package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.module;

import com.alibaba.fastjson.JSONObject;
import com.taobao.live.home.dinamic.model.FeedListData;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveListData extends FeedListData {
    public JSONObject background;
    public boolean isToTopCard;
    public long lastLiveId;
    public long lastTime;
    public JSONObject pageInfo;
    public boolean queryLiveOnly = false;
    public String startDate;

    static {
        kge.a(-947305537);
    }
}

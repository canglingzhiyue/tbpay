package com.taobao.taolive.sdk.business.detail;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class RecommendLiveDetailRequest implements INetDataObject {
    public String creatorId;
    public String extendJson;
    public String liveId;
    public String liveSource;
    public String sjsdItemId;
    public String timeMovingItemId;
    public String type;
    private String API_NAME = "mtop.mediaplatform.live.recommend.livedetail";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String ignoreH265 = "false";

    static {
        kge.a(822437806);
        kge.a(-540945145);
    }
}

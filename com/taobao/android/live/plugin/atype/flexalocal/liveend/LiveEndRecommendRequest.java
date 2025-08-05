package com.taobao.android.live.plugin.atype.flexalocal.liveend;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveEndRecommendRequest implements INetDataObject {
    public String liveId;
    public String tppParam;
    public String API_NAME = "mtop.tblive.recommend.live.end";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-283925322);
        kge.a(-540945145);
    }
}

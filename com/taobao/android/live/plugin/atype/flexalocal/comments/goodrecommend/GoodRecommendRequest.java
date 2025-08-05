package com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodRecommendRequest implements INetDataObject {
    public String exParam;
    public String liveId;
    private String API_NAME = "mtop.tblive.live.stay.item.recommend";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-257836433);
        kge.a(-540945145);
    }
}

package com.taobao.android.live.plugin.atype.flexalocal.good.business.hotItemSubscribe;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class HotItemSubscribeRequest implements INetDataObject {
    public String activityDetailId;
    public String userId;
    public String API_NAME = "mtop.iliad.hotitem.subscribe";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        kge.a(-707891127);
        kge.a(-540945145);
    }
}

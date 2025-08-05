package com.taobao.android.live.plugin.atype.flexalocal.giftwish;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class GiftWishQueryRequest implements INetDataObject {
    public List<String> activityTypes;
    public String liveId;
    public String location;
    public String API_NAME = "mtop.taobao.tblive.content.activity.queryActivities";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;

    static {
        kge.a(-876590998);
        kge.a(-540945145);
    }
}

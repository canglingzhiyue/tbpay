package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class ItemActionQueryRequest implements INetDataObject {
    public String asac;
    public String entryLiveSource;
    public JSONObject itemActionData;
    public String liveSource;
    public String API_NAME = "mtop.tblive.live.item.itemaction.query";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String recordId = "";
    public String itemId = "";
    public String anchorId = "";
    public String liveId = "";

    static {
        kge.a(-2014143719);
        kge.a(-540945145);
    }
}

package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class QuerySimpleRightsInfoRequest implements INetDataObject {
    public String entryLiveSource;
    public String liveSource;
    public String spm;
    public JSONObject transParams;
    public String API_NAME = "mtop.tblive.right.room.querySimpleRightsInfo";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String liveId = "";
    public String anchorId = "";
    public String interactTypes = "";

    static {
        kge.a(711500825);
        kge.a(-540945145);
    }
}

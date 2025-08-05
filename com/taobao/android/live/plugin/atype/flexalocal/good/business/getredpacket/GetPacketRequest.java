package com.taobao.android.live.plugin.atype.flexalocal.good.business.getredpacket;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class GetPacketRequest implements INetDataObject {
    public String anchorId;
    public String asac;
    public String entryLiveSource;
    public String entrySpm;
    public String liveId;
    public String spmCnt;
    public String spmUrl;
    public JSONObject transParams;
    public String API_NAME = "mtop.tblive.right.room.issuesimplerights";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String liveSource = "";

    static {
        kge.a(-1524215948);
        kge.a(-540945145);
    }
}

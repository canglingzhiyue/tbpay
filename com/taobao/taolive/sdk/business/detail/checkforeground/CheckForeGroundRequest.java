package com.taobao.taolive.sdk.business.detail.checkforeground;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class CheckForeGroundRequest implements INetDataObject {
    private String API_NAME = "mtop.taobao.tbcontent.livediscoverypage.liveinfo.get";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public List<String> liveIdList = null;

    static {
        kge.a(1568970592);
        kge.a(-540945145);
    }
}

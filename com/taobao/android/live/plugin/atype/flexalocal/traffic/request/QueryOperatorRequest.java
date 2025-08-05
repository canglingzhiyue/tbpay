package com.taobao.android.live.plugin.atype.flexalocal.traffic.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class QueryOperatorRequest implements INetDataObject {
    public String isp;
    public String API_NAME = "mtop.alibaba.alicom.vtplan.live.flow.pseudo";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(1539361921);
        kge.a(-540945145);
    }
}

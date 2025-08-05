package com.taobao.android.live.plugin.atype.flexalocal.traffic.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class QueryTrafficCardRequest implements INetDataObject {
    public String isp;
    public String ispResult;
    public String API_NAME = "mtop.alibaba.alicom.vtplan.live.flow.check";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-235285460);
        kge.a(-540945145);
    }
}

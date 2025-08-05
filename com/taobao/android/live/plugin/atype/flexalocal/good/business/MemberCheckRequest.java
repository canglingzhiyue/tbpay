package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class MemberCheckRequest implements INetDataObject {
    public String anchorId;
    public String liveId;
    public String API_NAME = "mtop.tblive.live.amto.real";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String queryType = "member";

    static {
        kge.a(1829118282);
        kge.a(-540945145);
    }
}

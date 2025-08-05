package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class ShareReturnResponseData implements INetDataObject {
    @JSONField(name = "result")
    public String result;
    @JSONField(name = "toast")
    public String toast;

    static {
        kge.a(1326400005);
        kge.a(-540945145);
    }
}

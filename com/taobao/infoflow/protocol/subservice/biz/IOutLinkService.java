package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Intent;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.lli;

/* loaded from: classes.dex */
public interface IOutLinkService extends ISubService {
    public static final String SERVICE_NAME = "OutLinkService";

    lli getScrolledToItemTraceInfo();

    void onOutLinkTrigger(String str, Intent intent);
}

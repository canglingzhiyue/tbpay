package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Intent;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.lkq;

/* loaded from: classes7.dex */
public interface IIconBackGuideAnimeService extends ISubService, lkq {
    public static final String SERVICE_NAME = "IconBackGuideAnimeService";

    void onOutLinkTrigger(String str, Intent intent);
}

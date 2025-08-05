package com.taobao.live.home.business;

import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes7.dex */
public interface b {
    boolean onJudgeEnd();

    void onLoadMore(BaseListRequest baseListRequest);

    void onPageEnd();

    void onPageError(String str);

    void onPageReceived(BaseOutDo baseOutDo);

    void onPageReload(BaseOutDo baseOutDo);

    void onReload(BaseListRequest baseListRequest);
}

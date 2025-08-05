package com.ut.share.business;

import java.util.Map;

/* loaded from: classes9.dex */
public interface ShareBusinessListener {
    void onFinished(Map<String, String> map);

    void onShare(ShareContent shareContent, ShareTargetType shareTargetType);
}

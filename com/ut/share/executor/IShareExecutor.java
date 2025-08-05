package com.ut.share.executor;

import android.content.Context;
import com.ut.share.SharePlatform;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IShareExecutor {
    boolean isAppAvailable(Context context);

    boolean isAppAvailable(Context context, SharePlatform sharePlatform);

    void register(Map<String, String> map);

    void share(Context context, SharePlatform sharePlatform, ShareData shareData, ShareListener shareListener);

    void share(Context context, ShareData shareData, ShareListener shareListener);

    boolean supportImageShare();
}

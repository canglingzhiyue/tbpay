package com.taobao.android.fluid.framework.preload;

import android.view.View;
import com.taobao.android.fluid.core.FluidService;
import java.util.HashMap;
import java.util.Map;
import tb.sjq;
import tb.snd;
import tb.snv;
import tb.soq;
import tb.sor;
import tb.sox;

/* loaded from: classes5.dex */
public interface IUsePreloadService extends FluidService, snd {
    boolean enableTab3UseCacheData();

    snv findPreAttachedDWInstance();

    sor findPreAttachedPreloadedVideo();

    soq getConfig();

    String getPlayerPlayToken();

    sox getPreLoadManager();

    HashMap<String, String> getTab3CacheTrackParams();

    long getTab3LauncherPrePlayerStartTime();

    String getmPrePlayerVideoId();

    boolean isLaunchCodeRequest();

    boolean isLocalOrCacheVideo(snv snvVar);

    boolean ismTab3QuickRender();

    void moveVideoToList(sor sorVar);

    void preloadDetailDataInBackground();

    void quickRenderFetchContentDetail(Map map);

    void removePreAttachedDWInstance(boolean z);

    void removePreAttachedWeexInstance();

    void resetDetailPrefetchFlag();

    void setIsLaunchCodeRequest(boolean z);

    void setPlayerPlayToken(String str);

    void setTab3CacheTrackParams(HashMap<String, String> hashMap);

    void setTab3LauncherPrePlayerStartTime(long j);

    sjq setVideoCommentSizeObject(View view);

    void startPreloadVideo(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, int i2, int i3);

    void stopPreloadVideo();
}

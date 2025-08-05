package com.taobao.android.fluid.business.usertrack;

import com.taobao.android.fluid.business.usertrack.track.PageStartTimeBean;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import java.util.HashMap;
import java.util.Map;
import tb.juo;
import tb.lzc;
import tb.psw;
import tb.snd;

/* loaded from: classes5.dex */
public interface ITrackService extends FluidService, snd {
    Map<String, String> getActiveCardCommonTrack();

    juo getConfig();

    Map<String, String> getDPVCommonTrack();

    int getMaxSlideIndexPublicMode();

    long getNavElapsdorealTime();

    long getNavStartTime();

    PageStartTimeBean getPageCreateTimeBean();

    lzc getPageFastTracker();

    Map getPageUTProperties();

    HashMap<String, String> getPageUtProperties();

    VideoTracker getPageVideoTracker();

    String getRecordContentId();

    int getRecordCount();

    int getTab3ComponentDisappearTimes();

    Map<String, String> getThisCardCommonTrack(psw pswVar);

    t getTrackTint();

    RenderTrackUtils.a getTrackerRenderInfo();

    String getUtparamPre();

    String getUtparamUrl();

    c.b getVideoTrackerPageInfo();

    boolean isFirstSetAdapter();

    boolean isFirstSetUTParams();

    boolean isPageFirstEnter();

    boolean isProcessFromLauncherFlag();

    boolean isTab3PageFirstEnter();

    void resetTab3EnterPageStartTime();

    void setFirstSetAdapter(boolean z);

    void setFirstSetUTParams(boolean z);

    void setPageCreateTimeBean(PageStartTimeBean pageStartTimeBean);

    void setPageFastTracker(lzc lzcVar);

    void setPageFirstEnter(boolean z);

    PageStartTimeBean setPageStartTime(FluidContext fluidContext);

    void setPageVideoTracker(VideoTracker videoTracker);

    void setRecordContentId(String str);

    void setRecordCount(int i);

    void setTab3ComponentDisappearTimes(int i);

    void setTrackerRenderInfo(RenderTrackUtils.a aVar);

    void setVideoTrackerPageInfo(c.b bVar);

    void trackPageStart();

    void updateCommonTrack(Map<String, String> map);
}

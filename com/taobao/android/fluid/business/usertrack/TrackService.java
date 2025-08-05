package com.taobao.android.fluid.business.usertrack;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.PageStartTimeBean;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker.a;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.h;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.fscrmid.nav.ShotVideoNavProcessor;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.tao.log.logger.CustomEventLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.fga;
import tb.ihi;
import tb.ihj;
import tb.juo;
import tb.jup;
import tb.kge;
import tb.ljm;
import tb.ljq;
import tb.lmw;
import tb.lzc;
import tb.oec;
import tb.ogv;
import tb.ohh;
import tb.pil;
import tb.pio;
import tb.psw;
import tb.shm;
import tb.sjt;
import tb.ska;
import tb.slm;
import tb.snv;
import tb.son;
import tb.spj;
import tb.sps;
import tb.spz;
import tb.tjy;

/* loaded from: classes5.dex */
public class TrackService implements ITrackService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TrackService";
    private static boolean hasCachedStage;
    public static int sTab3ColdDisAppearTimes;
    private final DefaultFluidInstance fluidInstance;
    private ICardService mCardService;
    private final fga mCommonTrackManager;
    private IContainerService mContainerService;
    private final FluidContext mFluidContext;
    private boolean mHasUploadUT;
    private int mMaxSlideIndexPublicMode;
    private long mNavElapsdorealTime;
    private long mNavStartTime;
    private PageStartTimeBean mPageCreateTimeBean;
    private lzc mPageFastTracker;
    private VideoTracker mPageVideoTracker;
    private boolean mProcessFromLauncherFlag;
    private String mRecordContentId;
    private int mRecordCount;
    private ISceneConfigService mSceneConfigService;
    private long mStartTime;
    private int mTab3ComponentDisappearTimes;
    private RenderTrackUtils.a mTrackerRenderInfo;
    private h mUtCallback;
    private c.b mVideoTrackserPageInfo;
    private final HashMap<String, String> mPageUtProperties = new HashMap<>();
    private boolean pageBeginTracked = false;
    private boolean mIsTab3PageFirstEnter = true;
    private boolean mIsPageFirstEnter = true;
    private boolean mIsFirstSetUTParams = true;
    private boolean mIsFirstSetAdapter = true;
    private final juo mTrackServiceConfig = new juo();
    private t trackTint = tjy.b();

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ FluidContext access$000(TrackService trackService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("b2e99232", new Object[]{trackService}) : trackService.mFluidContext;
    }

    public static /* synthetic */ h access$100(TrackService trackService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("46be7858", new Object[]{trackService}) : trackService.mUtCallback;
    }

    public static /* synthetic */ h access$102(TrackService trackService, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("a9d413d9", new Object[]{trackService, hVar});
        }
        trackService.mUtCallback = hVar;
        return hVar;
    }

    public static /* synthetic */ int access$200(TrackService trackService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2cdafa4b", new Object[]{trackService})).intValue() : trackService.mMaxSlideIndexPublicMode;
    }

    public static /* synthetic */ int access$202(TrackService trackService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b46cb5c", new Object[]{trackService, new Integer(i)})).intValue();
        }
        trackService.mMaxSlideIndexPublicMode = i;
        return i;
    }

    public static /* synthetic */ long access$300(TrackService trackService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7a9a724d", new Object[]{trackService})).longValue() : trackService.mStartTime;
    }

    public static /* synthetic */ long access$302(TrackService trackService, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d576573d", new Object[]{trackService, new Long(j)})).longValue();
        }
        trackService.mStartTime = j;
        return j;
    }

    static {
        kge.a(1743695952);
        kge.a(-1233591987);
        sTab3ColdDisAppearTimes = 0;
        hasCachedStage = false;
    }

    public TrackService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.fluidInstance = (DefaultFluidInstance) fluidContext;
        this.mCommonTrackManager = new fga(fluidContext);
    }

    public void addCommonTrackChangedListener(jup jupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186029b", new Object[]{this, jupVar});
        } else {
            this.mCommonTrackManager.a(jupVar);
        }
    }

    public void removeCommonTrackChangedListener(jup jupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193803e", new Object[]{this, jupVar});
        } else {
            this.mCommonTrackManager.b(jupVar);
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getActiveCardCommonTrack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1a4044d0", new Object[]{this}) : this.mCommonTrackManager.a(((ICardService) this.mFluidContext.getService(ICardService.class)).getActiveCard());
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getThisCardCommonTrack(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4c8435d4", new Object[]{this, pswVar}) : this.mCommonTrackManager.a(pswVar);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getDPVCommonTrack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bb5f02c8", new Object[]{this}) : this.mCommonTrackManager.b(((ICardService) this.mFluidContext.getService(ICardService.class)).getActiveCard());
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void updateCommonTrack(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee91127", new Object[]{this, map});
        } else {
            this.mCommonTrackManager.b(map);
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public int getMaxSlideIndexPublicMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9216e275", new Object[]{this})).intValue() : this.mMaxSlideIndexPublicMode;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isFirstSetUTParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cfe827ec", new Object[]{this})).booleanValue() : this.mIsFirstSetUTParams;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setFirstSetUTParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf900bb4", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFirstSetUTParams = z;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isFirstSetAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63c893de", new Object[]{this})).booleanValue() : this.mIsFirstSetAdapter;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setFirstSetAdapter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c147d72", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFirstSetAdapter = z;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isPageFirstEnter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73dd4dcc", new Object[]{this})).booleanValue() : this.mIsPageFirstEnter;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageFirstEnter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1df3d4", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsPageFirstEnter = z;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public c.b getVideoTrackerPageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.b) ipChange.ipc$dispatch("66bffa73", new Object[]{this}) : this.mVideoTrackserPageInfo;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setVideoTrackerPageInfo(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54a0769", new Object[]{this, bVar});
        } else {
            this.mVideoTrackserPageInfo = bVar;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public RenderTrackUtils.a getTrackerRenderInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderTrackUtils.a) ipChange.ipc$dispatch("60347f3", new Object[]{this}) : this.mTrackerRenderInfo;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setTrackerRenderInfo(RenderTrackUtils.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c02b4b", new Object[]{this, aVar});
        } else {
            this.mTrackerRenderInfo = aVar;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public long getNavStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78326e5d", new Object[]{this})).longValue() : this.mNavStartTime;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public long getNavElapsdorealTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("317aa2c1", new Object[]{this})).longValue() : this.mNavElapsdorealTime;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public String getRecordContentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae4b012c", new Object[]{this}) : this.mRecordContentId;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setRecordContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53cf932", new Object[]{this, str});
        } else {
            this.mRecordContentId = str;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public int getRecordCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19c38682", new Object[]{this})).intValue() : this.mRecordCount;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setRecordCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2aa5360", new Object[]{this, new Integer(i)});
        } else {
            this.mRecordCount = i;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isProcessFromLauncherFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79863f06", new Object[]{this})).booleanValue() : this.mProcessFromLauncherFlag;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isTab3PageFirstEnter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e99b4aa", new Object[]{this})).booleanValue() : this.mIsTab3PageFirstEnter;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public lzc getPageFastTracker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lzc) ipChange.ipc$dispatch("7309cad3", new Object[]{this}) : this.mPageFastTracker;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageFastTracker(lzc lzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18224f2d", new Object[]{this, lzcVar});
        } else {
            this.mPageFastTracker = lzcVar;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public VideoTracker getPageVideoTracker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoTracker) ipChange.ipc$dispatch("47f07db3", new Object[]{this}) : this.mPageVideoTracker;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageVideoTracker(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5d61b", new Object[]{this, videoTracker});
        } else {
            this.mPageVideoTracker = videoTracker;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public final Map getPageUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("73e0e373", new Object[]{this});
        }
        if (!son.i()) {
            b.a(this.mFluidContext, getPageUtProperties());
        }
        return getPageUtProperties();
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void resetTab3EnterPageStartTime() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1229c", new Object[]{this});
            return;
        }
        if (!spj.d(this.mFluidContext) || !isEnableTab3CorrectStartTime() || !this.mIsTab3PageFirstEnter) {
            z = false;
        } else {
            this.mIsTab3PageFirstEnter = false;
        }
        if (!z) {
            return;
        }
        setPageStartTime(this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public PageStartTimeBean setPageStartTime(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStartTimeBean) ipChange.ipc$dispatch("18bd1382", new Object[]{this, fluidContext});
        }
        PageStartTimeBean pageCreateTimeBean = ((ITrackService) fluidContext.getService(ITrackService.class)).getPageCreateTimeBean();
        if (pageCreateTimeBean == null) {
            pageCreateTimeBean = new PageStartTimeBean();
            ((ITrackService) fluidContext.getService(ITrackService.class)).setPageCreateTimeBean(pageCreateTimeBean);
        }
        pageCreateTimeBean.pageStartTime = System.currentTimeMillis();
        return pageCreateTimeBean;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void trackPageStart() {
        IPreloadService iPreloadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5246668f", new Object[]{this});
            return;
        }
        pio.a(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_TRACKPAGESTART);
        d.a(this.mFluidContext, ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionParams());
        ljq.a(this.mFluidContext, d.b(this.mFluidContext));
        if (ShotVideoNavProcessor.b > 0) {
            this.mNavElapsdorealTime = ShotVideoNavProcessor.b;
            this.mNavStartTime = ShotVideoNavProcessor.c;
            RenderTrackUtils.a(this.mFluidContext, RenderTrackUtils.pageNav);
            ShotVideoNavProcessor.a();
        }
        RenderTrackUtils.a(this.mFluidContext, RenderTrackUtils.pageCreate);
        VideoTracker videoTracker = this.mPageVideoTracker;
        if (((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).enableTab3UseCacheData() && videoTracker != null && (iPreloadService = (IPreloadService) this.mFluidContext.getService(IPreloadService.class)) != null && iPreloadService.getPreloadVideoTrackerManager() != null) {
            iPreloadService.getPreloadVideoTrackerManager().a(videoTracker);
        }
        this.mProcessFromLauncherFlag = com.taobao.android.fluid.framework.preload.dwinstance.c.c();
        pio.b(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_TRACKPAGESTART);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public t getTrackTint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("81b43820", new Object[]{this}) : this.trackTint;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public HashMap<String, String> getPageUtProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("c45ab7c1", new Object[]{this}) : this.mPageUtProperties;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public PageStartTimeBean getPageCreateTimeBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageStartTimeBean) ipChange.ipc$dispatch("2d4cad30", new Object[]{this}) : this.mPageCreateTimeBean;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageCreateTimeBean(PageStartTimeBean pageStartTimeBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8ac38a", new Object[]{this, pageStartTimeBean});
        } else {
            this.mPageCreateTimeBean = pageStartTimeBean;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public juo getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (juo) ipChange.ipc$dispatch("feb8b6e3", new Object[]{this}) : this.mTrackServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public String getUtparamUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35c56222", new Object[]{this}) : this.mCommonTrackManager.b();
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public String getUtparamPre() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c157d6e", new Object[]{this}) : this.mCommonTrackManager.a();
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public int getTab3ComponentDisappearTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b095fe6", new Object[]{this})).intValue() : this.mTab3ComponentDisappearTimes;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setTab3ComponentDisappearTimes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84c0e7c", new Object[]{this, new Integer(i)});
        } else {
            this.mTab3ComponentDisappearTimes = i;
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        spz.c(TAG, "APMdata onCreate");
        resetTab3EnterPageStartTime();
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        pil.a(this.mFluidContext.getContext(), spj.j(this.mFluidContext), "gg_videoTab_page_enter");
        if (!hasCachedStage) {
            ohh.b("TAB2_VIDEO_PRELOAD_STAGE", "tabStart");
            hasCachedStage = true;
        }
        if (!this.pageBeginTracked) {
            this.pageBeginTracked = true;
            trackPageStart();
        }
        d.a(this.mFluidContext);
        HashMap hashMap = new HashMap();
        hashMap.put("url", this.mFluidContext.getInstanceConfig().getFluidOriginUrl());
        pil.a(this.mFluidContext.getContext(), spj.j(this.mFluidContext), "gg_videoTab_page_enter", hashMap);
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        spz.c(TAG, "APMdata onResume ");
        if (!((IContainerService) this.mFluidContext.getService(IContainerService.class)).isLoading() && !spj.h(this.mFluidContext) && !spj.f(this.mFluidContext) && !spj.g(this.mFluidContext)) {
            ((ITrackService) this.mFluidContext.getService(ITrackService.class)).setPageStartTime(this.mFluidContext);
        }
        com.taobao.android.fluid.framework.performance.b.f12613a.post(new Runnable() { // from class: com.taobao.android.fluid.business.usertrack.TrackService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    pio.a(TrackService.access$000(TrackService.this), 0L);
                }
            }
        });
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        spz.c(TAG, "onPauseMedia: uploadPreDWLeaveUT");
        uploadPreDWLeaveUT(((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).findPreAttachedDWInstance());
        reportTintInfo();
        ILifecycleService iLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        HashMap hashMap = new HashMap();
        hashMap.put(b.PROPERTY_IS_FINISH, String.valueOf(iLifecycleService.isFinish()));
        b.a(this.mFluidContext, getPageUtProperties(), Boolean.valueOf(iLifecycleService.isFinish()));
        spz.c(TAG, "更新2001，mUtCallback = " + this.mUtCallback);
        h hVar = this.mUtCallback;
        if (hVar == null) {
            return;
        }
        hVar.a(getPageUtProperties(), hashMap);
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        spz.c(TAG, "onStop: uploadPreDWLeaveUT");
        ljq.b(this.mFluidContext);
        a.b(this.mFluidContext);
        String str = null;
        long j = 0;
        try {
            str = ((IDataService) this.mFluidContext.getService(IDataService.class)).getRecommendRequestId();
            j = System.currentTimeMillis() - ((IDataService) this.mFluidContext.getService(IDataService.class)).getStartRecommendtime();
        } catch (Throwable unused) {
        }
        d.a(this.mFluidContext, "fullpage_stop", String.valueOf(j), "", "", str);
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        ljq.a(this.mFluidContext);
        a.a(this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        if (sjt.G()) {
            new lmw(this.mFluidContext);
        }
        this.mCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        this.mContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        this.mSceneConfigService = (ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class);
        spz.c(TAG, "onCreateService mUtCallback ");
        if (this.mFluidContext.getInstanceConfig().getUtCallback() != null) {
            this.mUtCallback = this.mFluidContext.getInstanceConfig().getUtCallback();
            spz.c(TAG, "onCreateService 设置mUtCallback = " + this.mUtCallback);
        }
        this.mSceneConfigService.addInstanceConfigChangedListener(new ihj() { // from class: com.taobao.android.fluid.business.usertrack.TrackService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihj
            public void a(FluidInstanceConfig fluidInstanceConfig, sps spsVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1183802a", new Object[]{this, fluidInstanceConfig, spsVar});
                    return;
                }
                if (slm.a(spsVar.d, spsVar.c)) {
                    b.a(TrackService.access$000(TrackService.this), TrackService.this.getPageUtProperties());
                }
                if (fluidInstanceConfig.getUtCallback() != null) {
                    TrackService.access$102(TrackService.this, fluidInstanceConfig.getUtCallback());
                }
                spz.c(TrackService.TAG, "onSceneConfigChanged 设置mUtCallback = " + TrackService.access$100(TrackService.this));
            }
        });
        this.mCommonTrackManager.a(this.mFluidContext);
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        pil.a(this.mFluidContext.getContext(), spj.j(this.mFluidContext), pio.GG_VIDEOTAB_PAGE_INIT);
        pio.a(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_NEW);
        spz.c(TAG, "DefaultFluidInstance()初始化 PickPreloadController初始化 ");
        b.a(getActiveCardCommonTrack(), d.b(this.mFluidContext));
        pio.b(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_NEW);
        addCommonTrackChangedListener(new jup() { // from class: com.taobao.android.fluid.business.usertrack.TrackService.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jup
            public void a(final Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                if (son.i()) {
                    b.a(TrackService.this.getPageUtProperties(), map);
                } else {
                    b.a(TrackService.access$000(TrackService.this), TrackService.this.getPageUtProperties());
                }
                spz.c(TrackService.TAG, "更新2001，mUtCallback = " + TrackService.access$100(TrackService.this));
                if (TrackService.access$100(TrackService.this) != null) {
                    TrackService.access$100(TrackService.this).a(TrackService.this.getPageUtProperties(), map);
                }
                Runnable runnable = new Runnable() { // from class: com.taobao.android.fluid.business.usertrack.TrackService.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (son.i()) {
                            b.a(TrackService.this.getPageUtProperties(), map);
                        } else {
                            b.a(TrackService.access$000(TrackService.this), TrackService.this.getPageUtProperties());
                        }
                        if (TrackService.access$100(TrackService.this) == null) {
                            return;
                        }
                        TrackService.access$100(TrackService.this).a(TrackService.this.getPageUtProperties(), map);
                    }
                };
                if (son.H()) {
                    ihi.a(runnable, 3001, ihi.a(300), "valuespace_common_track");
                } else {
                    runnable.run();
                }
            }
        });
        this.mCardService.addCardLifecycleListener(new shm.a() { // from class: com.taobao.android.fluid.business.usertrack.TrackService.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == -1294174408) {
                    super.onDisActive((psw) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.shm.a, tb.shm
            public void onActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                    return;
                }
                Set<String> c = ((ICardService) TrackService.access$000(TrackService.this).getService(ICardService.class)).getConfig().c();
                if (c != null && pswVar.D() != null) {
                    c.add(pswVar.D().hashCode() + pswVar.D().g());
                    int size = c.size() - 1;
                    int access$200 = TrackService.access$200(TrackService.this);
                    if (access$200 == 0) {
                        TrackService.access$202(TrackService.this, size);
                    } else if (access$200 < size) {
                        TrackService.access$202(TrackService.this, size);
                    }
                    Runnable runnable = new Runnable() { // from class: com.taobao.android.fluid.business.usertrack.TrackService.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put(b.PROPERTY_MAX_INDEX_NORMAL, String.valueOf(oec.a((Object) Integer.valueOf(TrackService.access$200(TrackService.this)), 0)));
                            if (son.i()) {
                                b.a(TrackService.this.getPageUtProperties(), hashMap);
                            } else {
                                b.a(TrackService.access$000(TrackService.this), TrackService.this.getPageUtProperties());
                            }
                            spz.c(TrackService.TAG, "更新2001，mUtCallback = " + TrackService.access$100(TrackService.this));
                            if (TrackService.access$100(TrackService.this) == null) {
                                return;
                            }
                            TrackService.access$100(TrackService.this).a(TrackService.this.getPageUtProperties(), hashMap);
                        }
                    };
                    if (son.H()) {
                        ihi.a(runnable, 3001, ihi.a(300), "valuespace_max_slide_index");
                    } else {
                        runnable.run();
                    }
                }
                Map<String, String> thisCardCommonTrack = TrackService.this.getThisCardCommonTrack(pswVar);
                b.a(thisCardCommonTrack, pswVar.v().a(), ((IDataService) TrackService.access$000(TrackService.this).getService(IDataService.class)).isTab3CacheEnable());
                TrackService.access$302(TrackService.this, SystemClock.uptimeMillis());
                b.a(TrackService.access$000(TrackService.this), thisCardCommonTrack);
                ljq.a(pswVar);
                ljq.e(pswVar, "active");
            }

            @Override // tb.shm.a, tb.shm
            public void onDisActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
                    return;
                }
                super.onDisActive(pswVar);
                long uptimeMillis = SystemClock.uptimeMillis() - TrackService.access$300(TrackService.this);
                if (TrackService.access$300(TrackService.this) <= 0) {
                    uptimeMillis = 0;
                }
                b.a(pswVar, TrackService.this.getActiveCardCommonTrack(), uptimeMillis);
                ljq.e(pswVar, "disactive");
            }

            @Override // tb.shm.a, tb.shm
            public void onAppear(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
                    return;
                }
                b.a(TrackService.this.getThisCardCommonTrack(pswVar), pswVar.v().a(), ((IDataService) TrackService.access$000(TrackService.this).getService(IDataService.class)).isTab3CacheEnable());
                a.a(TrackService.access$000(TrackService.this), pswVar.G().getAdapterPosition());
                ljq.a(pswVar, pswVar.D().H(), pswVar.w(), pswVar.j());
                ljq.e(pswVar, "appear");
            }

            @Override // tb.shm.a, tb.shm
            public void onDisAppear(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("733d6747", new Object[]{this, pswVar});
                    return;
                }
                ljq.e(pswVar, "disappear");
                ljq.b(pswVar, pswVar.j());
            }

            @Override // tb.shm.a, tb.shm
            public void onWillActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
                } else {
                    ljq.e(pswVar, "willActive");
                }
            }

            @Override // tb.shm.a, tb.shm
            public void onWillDisActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
                } else {
                    ljq.e(pswVar, "willDisactive");
                }
            }
        });
        this.mContainerService.addFirstCardRenderListener(new ska() { // from class: com.taobao.android.fluid.business.usertrack.TrackService.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ska
            public void onFirstCardRenderFailed(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9d76177", new Object[]{this, pswVar});
                }
            }

            @Override // tb.ska
            public void onFirstCardRenderSuccess(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7ed75eef", new Object[]{this, pswVar});
                    return;
                }
                FluidContext access$000 = TrackService.access$000(TrackService.this);
                if (pswVar != null) {
                    i = pswVar.v().a();
                }
                ljm.a(access$000, 1, i);
            }
        });
    }

    public void reportTintInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771de9a4", new Object[]{this});
            return;
        }
        t trackTint = ((ITrackService) this.mFluidContext.getService(ITrackService.class)).getTrackTint();
        if (trackTint == null) {
            return;
        }
        CustomEventLogger.builder("tab2", "tintInfo").setData(trackTint.a()).log();
    }

    public void uploadPreDWLeaveUT(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c213fd", new Object[]{this, snvVar});
        } else if (!juo.b(this.fluidInstance) || this.mHasUploadUT) {
        } else {
            this.mHasUploadUT = true;
            spz.c(TAG, "PickPreloadController，uploadPreDWLeaveUT");
            HashMap hashMap = new HashMap();
            Object uTObject = ((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface() != null ? ((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface().getUTObject() : this.mFluidContext.getContext();
            if (uTObject instanceof Activity) {
                Map<String, String> pageAllProperties = FluidSDK.getUTAdapter().withFluidContext(this.mFluidContext).getPageAllProperties((Activity) uTObject);
                if (!ogv.a(pageAllProperties)) {
                    hashMap.putAll(pageAllProperties);
                }
            }
            hashMap.put(b.PROPERTY_IS_FINISH, ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).isFinish() ? "1" : "0");
            String str = ((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).getmPrePlayerVideoId();
            boolean isLocalOrCacheVideo = ((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).isLocalOrCacheVideo(snvVar);
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            HashMap<String, String> a2 = com.taobao.android.fluid.framework.preload.dwinstance.a.a(str, ((ISceneConfigService) this.fluidInstance.getService(ISceneConfigService.class)).getSessionExtParams().b(), isLocalOrCacheVideo);
            Map<? extends String, ? extends String> a3 = com.taobao.android.fluid.framework.preload.dwinstance.a.a(isLocalOrCacheVideo);
            long tab3LauncherPrePlayerStartTime = ((IUsePreloadService) this.fluidInstance.getService(IUsePreloadService.class)).getTab3LauncherPrePlayerStartTime();
            if (tab3LauncherPrePlayerStartTime > 0) {
                long currentTimeMillis = System.currentTimeMillis() - tab3LauncherPrePlayerStartTime;
                spz.c(TAG, "PickPreloadController，pause上报埋点，起播到dw销毁的时间：" + currentTimeMillis);
                a3.put("duration", Long.valueOf(currentTimeMillis));
                a3.put("duration_time", Long.valueOf(currentTimeMillis));
                a3.put("playTime", Long.valueOf(currentTimeMillis));
            }
            a3.put("play_token", ((IUsePreloadService) this.fluidInstance.getService(IUsePreloadService.class)).getPlayerPlayToken());
            a2.putAll(hashMap);
            a2.putAll(a3);
            pio.a(pio.GG_VIDEOTAB_VIDEO_PLAY_END_UT, a2);
            pio.a(pio.GG_VIDEOTAB_VIDEO_LEAVE_UT, hashMap);
        }
    }

    private boolean isEnableTab3CorrectStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("303813db", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableTab3CorrectStartTime", true);
    }
}

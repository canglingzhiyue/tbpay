package com.taobao.android.fluid.framework.preload;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.preload.dwinstance.c;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.fscrmid.nav.ShotVideoNavProcessor;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.obu;
import tb.oec;
import tb.ohd;
import tb.sjq;
import tb.sjs;
import tb.snv;
import tb.sop;
import tb.soq;
import tb.sor;
import tb.sox;
import tb.spj;
import tb.spz;

/* loaded from: classes5.dex */
public class UsePreloadService implements IUsePreloadService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IPreloadService";
    private static final String TAG = "PreloadService";
    private final FluidContext mFluidContext;
    private String mPlayerPlayToken;
    private String mPrePlayerVideoId;
    private long mTab3LauncherPrePlayerStartTime;
    private sox preLoadManager;
    private boolean mEnableTab3UseCacheData = false;
    private boolean mTab3QuickRender = false;
    private boolean mIsLaunchCodeRequest = false;
    private boolean pauseCalled = false;
    private HashMap<String, String> mTab3CacheTrackParams = new HashMap<>();
    private final soq mPreloadServiceConfig = new soq();

    static {
        kge.a(301353764);
        kge.a(374380857);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void preloadDetailDataInBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e7c1de", new Object[]{this});
        }
    }

    public UsePreloadService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public soq getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (soq) ipChange.ipc$dispatch("febcb7f2", new Object[]{this}) : this.mPreloadServiceConfig;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        resetDetailPrefetchFlag();
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.mEnableTab3UseCacheData = initTab3CacheConfig();
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.pauseCalled) {
        } else {
            spz.c(TAG, "onResume preCreatedDWInstance");
            snv findPreAttachedDWInstance = findPreAttachedDWInstance();
            if (findPreAttachedDWInstance == null) {
                return;
            }
            spz.c(TAG, "resume preCreatedDWInstance");
            findPreAttachedDWInstance.b();
            findPreAttachedDWInstance.a(f.g(this.mFluidContext));
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.pauseCalled = true;
        snv findPreAttachedDWInstance = findPreAttachedDWInstance();
        if (findPreAttachedDWInstance == null) {
            return;
        }
        boolean isFinish = ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).isFinish();
        spz.c(TAG, "pause preCreated DWInstance, isFinish " + isFinish);
        findPreAttachedDWInstance.c();
        findPreAttachedDWInstance.j();
        if (!isFinish) {
            return;
        }
        findPreAttachedDWInstance.d();
        b.c();
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        removePreAttachedDWInstance(false);
        removePreAttachedWeexInstance();
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        IPreloadService iPreloadService = (IPreloadService) this.mFluidContext.getService(IPreloadService.class);
        com.taobao.android.fluid.framework.preload.dwinstance.b preloadVideoTrackerManager = iPreloadService != null ? iPreloadService.getPreloadVideoTrackerManager() : null;
        if (enableTab3UseCacheData() && preloadVideoTrackerManager != null && preloadVideoTrackerManager.a() != null) {
            preloadVideoTrackerManager.a((VideoTracker) null);
        }
        stopPreloadVideo();
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setTab3LauncherPrePlayerStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac20412", new Object[]{this, new Long(j)});
        } else {
            this.mTab3LauncherPrePlayerStartTime = j;
        }
    }

    private boolean initTab3CacheConfig() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbb1a1", new Object[]{this})).booleanValue();
        }
        if (isDefaultTab3(this.mFluidContext)) {
            z2 = soq.a();
            z = true;
        } else {
            spz.c(TAG, "initTab3CacheConfig PickPreloadController非默认进tab3");
            z = false;
            z2 = false;
        }
        boolean b = soq.b(this.mFluidContext);
        if (!z && !b) {
            z3 = false;
        }
        spz.c(TAG, "PickPreloadController,initTab3CacheConfig，enable:" + z3 + "，tab3：" + spj.d(this.mFluidContext) + "，默认tab3：" + ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f() + ",mEnableTab3PreloadVideoOpt:" + z2 + ",launcherCanSaveUnexposedDetail:" + b);
        return z3;
    }

    private boolean isDefaultTab3(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56da60d2", new Object[]{this, fluidContext})).booleanValue() : spj.d(fluidContext) && ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f();
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void quickRenderFetchContentDetail(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621b506b", new Object[]{this, map});
            return;
        }
        this.mTab3QuickRender = true;
        this.mIsLaunchCodeRequest = i.e();
        ((IContainerService) this.mFluidContext.getService(IContainerService.class)).refresh(map, true, false, false);
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void moveVideoToList(sor sorVar) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ed23a4", new Object[]{this, sorVar});
            return;
        }
        snv snvVar = null;
        if (sorVar != null) {
            snvVar = sorVar.f33778a;
            str = sorVar.b;
        } else {
            str = null;
        }
        if (snvVar == null) {
            spz.c(TAG, "moveVideoToList,instance null");
            return;
        }
        ViewGroup f = snvVar.f();
        c.b(f);
        spz.c(TAG, "moveVideoToList:" + f);
        if (f == null || !sorVar.c(this.mFluidContext.getContext())) {
            spz.c(TAG, "moveVideoToList ignore, preloadedVideo is " + sorVar);
            return;
        }
        this.mPrePlayerVideoId = str;
        this.mTab3LauncherPrePlayerStartTime = oec.a(f.getTag(R.id.fluid_sdk_tag_play_start_time), System.currentTimeMillis());
        this.mPlayerPlayToken = snvVar.h();
        if (sorVar.f33778a != null && !TextUtils.isEmpty(sorVar.b)) {
            boolean z2 = sorVar.p;
            if (sorVar.s && z2) {
                z = true;
            }
            if (sorVar.k || z) {
                ((IContainerService) this.mFluidContext.getService(IContainerService.class)).showTab3CacheHadExposedLoading(true);
                ((IDataService) this.mFluidContext.getService(IDataService.class)).setTab3CacheDataRefreshShowLoading(true);
            }
        }
        ((IFeedsListService) this.mFluidContext.getService(IFeedsListService.class)).renderCacheVideo(sorVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public sjq setVideoCommentSizeObject(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjq) ipChange.ipc$dispatch("d2f9127", new Object[]{this, view});
        }
        int f = ohd.f(this.mFluidContext.getContext());
        int a2 = obu.a(this.mFluidContext.getContext(), spj.d(this.mFluidContext));
        sjq a3 = sjs.a(this.mFluidContext.getContext(), view, spj.d(this.mFluidContext), sop.a().b().b());
        return a3 == null ? new sjq(f, a2) : a3;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setPlayerPlayToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95c993", new Object[]{this, str});
        } else {
            this.mPlayerPlayToken = str;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public String getPlayerPlayToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("985620ab", new Object[]{this}) : this.mPlayerPlayToken;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public long getTab3LauncherPrePlayerStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("372a6da", new Object[]{this})).longValue() : this.mTab3LauncherPrePlayerStartTime;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public sox getPreLoadManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sox) ipChange.ipc$dispatch("daa3a789", new Object[]{this}) : this.preLoadManager;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void startPreloadVideo(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d56452", new Object[]{this, aVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.preLoadManager == null) {
            this.preLoadManager = new sox(this.mFluidContext);
        }
        if (obu.i()) {
            spz.c(TAG, "低端机优化，不预下载视频。return。");
        } else {
            this.preLoadManager.a(aVar, i, i2, i3);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void stopPreloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bd579b", new Object[]{this});
            return;
        }
        sox soxVar = this.preLoadManager;
        if (soxVar == null) {
            return;
        }
        soxVar.a();
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean enableTab3UseCacheData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9fb9411", new Object[]{this})).booleanValue() : this.mEnableTab3UseCacheData;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean ismTab3QuickRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7a0c4d", new Object[]{this})).booleanValue() : this.mTab3QuickRender;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void resetDetailPrefetchFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac7dbaa", new Object[]{this});
        } else {
            ShotVideoNavProcessor.f17201a = false;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public sor findPreAttachedPreloadedVideo() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sor) ipChange.ipc$dispatch("d635428", new Object[]{this});
        }
        try {
            ViewGroup animLayout = ((IContainerService) this.mFluidContext.getService(IContainerService.class)).getAnimLayout();
            if (animLayout != null && (findViewById = animLayout.findViewById(R.id.fluid_sdk_preattach_videoview)) != null) {
                return (sor) findViewById.getTag(R.id.fluid_sdk_tag_preloadVideo);
            }
            return null;
        } catch (Throwable th) {
            spz.c(TAG, "findPreAttachedPreloadedVideo " + th.getMessage());
            return null;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public String getmPrePlayerVideoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43b2c1b0", new Object[]{this}) : this.mPrePlayerVideoId;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public snv findPreAttachedDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snv) ipChange.ipc$dispatch("cb4c3d8e", new Object[]{this});
        }
        sor findPreAttachedPreloadedVideo = findPreAttachedPreloadedVideo();
        if (findPreAttachedPreloadedVideo == null) {
            return null;
        }
        return findPreAttachedPreloadedVideo.f33778a;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void removePreAttachedDWInstance(boolean z) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7dec942", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            ViewGroup animLayout = ((IContainerService) this.mFluidContext.getService(IContainerService.class)).getAnimLayout();
            if (animLayout != null && (findViewById = animLayout.findViewById(R.id.fluid_sdk_preattach_videoview)) != null) {
                animLayout.removeView(findViewById);
                sor sorVar = (sor) findViewById.getTag(R.id.fluid_sdk_tag_preloadVideo);
                if (sorVar != null) {
                    sorVar.a(z);
                }
            }
            sor preloadVideoData = ((IFeedsListService) this.mFluidContext.getService(IFeedsListService.class)).getPreloadVideoData();
            if (preloadVideoData == null) {
                return;
            }
            preloadVideoData.a(z);
        } catch (Throwable th) {
            spz.c(TAG, "removePreAttachedDWInstance " + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void removePreAttachedWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517f55a0", new Object[]{this});
            return;
        }
        try {
            IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) this.mFluidContext.getService(IPreloadWeexService.class);
            spz.c(TAG, "removePreAttachedWeexInstance IPreloadWeexService:" + iPreloadWeexService);
            if (iPreloadWeexService == null) {
                return;
            }
            iPreloadWeexService.removePreAttachedWeexInstance();
        } catch (Throwable th) {
            spz.c(TAG, "removePreAttachedWeexInstance " + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean isLocalOrCacheVideo(snv snvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87b5b87d", new Object[]{this, snvVar})).booleanValue() : c.a(snvVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean isLaunchCodeRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f866e430", new Object[]{this})).booleanValue() : this.mIsLaunchCodeRequest;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setIsLaunchCodeRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44faeaa", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLaunchCodeRequest = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public HashMap<String, String> getTab3CacheTrackParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("67cc178d", new Object[]{this}) : this.mTab3CacheTrackParams;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setTab3CacheTrackParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ae983d", new Object[]{this, hashMap});
        } else {
            this.mTab3CacheTrackParams.putAll(hashMap);
        }
    }
}

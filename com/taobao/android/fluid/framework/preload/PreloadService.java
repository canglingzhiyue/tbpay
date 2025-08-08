package com.taobao.android.fluid.framework.preload;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.android.fluid.framework.preload.data.PreloadWeexData;
import com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance;
import com.taobao.android.fluid.framework.preload.dwinstance.b;
import com.taobao.android.fluid.framework.preload.task.IPreloadTask;
import com.taobao.android.fluid.framework.preload.task.d;
import com.taobao.android.fluid.framework.preload.task.f;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.weex.c;
import com.taobao.android.weex.e;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.taobaoavsdk.cache.library.i;
import java.util.HashMap;
import tb.gvw;
import tb.kge;
import tb.occ;
import tb.oeb;
import tb.oec;
import tb.ogh;
import tb.ogt;
import tb.oyw;
import tb.pil;
import tb.sjq;
import tb.snv;
import tb.son;
import tb.soo;
import tb.sop;
import tb.soq;
import tb.sor;
import tb.spz;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes5.dex */
public class PreloadService implements IPreloadService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INACTIVE_CROWD = "inactive_crowd";
    private static final String TAG = "PreloadInstanceService";
    private boolean cancelPreload;
    private IPreloadTask mCurrentInactivePreloadTask;
    private IPreloadTask mCurrentPreloadTask;
    private final FluidContext mFluidContext;
    private PreRenderDWInstance mPreRenderDWInstance;
    private sor mPreloadVideoData;
    private boolean weexInitted;
    private soo mPreloadABConfig = new soo(null);
    public long preloadPlayerCacheElapsedTime = -1;
    public boolean isPlayerCacheValid = false;
    private String preloadTaskHistroy = "";
    private com.taobao.android.fluid.core.a<sor> cancelCallback = new com.taobao.android.fluid.core.a<sor>() { // from class: com.taobao.android.fluid.framework.preload.PreloadService.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            PreloadService.this = this;
        }

        @Override // com.taobao.android.fluid.core.a
        public void a(sor sorVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff234182", new Object[]{this, sorVar});
            } else {
                PreloadService.access$002(PreloadService.this, sorVar);
            }
        }
    };
    private b mPreloadVideoTracker = new b();

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(328892603);
        kge.a(-906497338);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ sor access$002(PreloadService preloadService, sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sor) ipChange.ipc$dispatch("2c8e5be9", new Object[]{preloadService, sorVar});
        }
        preloadService.mPreloadVideoData = sorVar;
        return sorVar;
    }

    public PreloadService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void setPreloadABConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc67f", new Object[]{this, jSONObject});
            return;
        }
        this.mPreloadABConfig = new soo(jSONObject);
        sop.a().a(jSONObject);
    }

    public soo getPreloadABConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (soo) ipChange.ipc$dispatch("d6a2f596", new Object[]{this}) : this.mPreloadABConfig;
    }

    public void resetPreloadTaskHistroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e70f22", new Object[]{this});
        } else {
            this.preloadTaskHistroy = "";
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void doPreload(FluidInstance fluidInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760d483d", new Object[]{this, fluidInstance, context, jSONObject});
            return;
        }
        spz.c(TAG, "[preloadvideo]execute preload task " + this.mCurrentPreloadTask);
        this.mPreloadVideoTracker.a(this.mFluidContext);
        if (context != null && jSONObject != null) {
            if ((getPreloadABConfig().f33774a || oec.a(jSONObject.get("type"), 1) == 10) && !this.cancelPreload) {
                IPreloadTask iPreloadTask = this.mCurrentPreloadTask;
                if (iPreloadTask != null) {
                    if (iPreloadTask.a(jSONObject)) {
                        spz.c(TAG, "same preloadArgs return");
                        return;
                    }
                    this.mCurrentPreloadTask.a(this.mPreloadVideoData, this.cancelCallback);
                }
                this.mCurrentPreloadTask = createPreloadTask(fluidInstance, context, jSONObject);
                if (this.mCurrentPreloadTask != null) {
                    pil.a(context, null, "gg_pickpreload_type");
                    this.preloadTaskHistroy += this.mCurrentPreloadTask.e() + "_" + System.currentTimeMillis() + "-";
                    this.mCurrentPreloadTask.b(new com.taobao.android.fluid.core.a<sor>() { // from class: com.taobao.android.fluid.framework.preload.PreloadService.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            PreloadService.this = this;
                        }

                        @Override // com.taobao.android.fluid.core.a
                        public void a(sor sorVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ff234182", new Object[]{this, sorVar});
                            } else {
                                PreloadService.access$002(PreloadService.this, sorVar);
                            }
                        }
                    });
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", Integer.valueOf(this.mCurrentPreloadTask.e()));
                    hashMap.put("redpointExpired", Boolean.valueOf(oec.a(jSONObject.get("isRedPointExpired"), false)));
                    hashMap.put("preloadTaskHistory", this.preloadTaskHistroy);
                    pil.a(context, null, "gg_pickpreload_type", hashMap);
                } else {
                    FluidException.throwException(this.mFluidContext, com.taobao.android.fluid.core.b.PRELOAD_SERVICE_CREATE_PRELOAD_TASK_IS_NULL);
                }
                spz.c(TAG, "[preloadvideo]execute preload task " + this.mCurrentPreloadTask);
            }
        }
        preloadWeex(context);
    }

    private void preloadWeex(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb11fb7", new Object[]{this, context});
        } else if (this.weexInitted || !oeb.a("ShortVideo.enableInitWeex", true)) {
        } else {
            this.weexInitted = true;
            e.a().a((Application) context.getApplicationContext(), (c.a) null);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void doPreloadForInactive(FluidInstance fluidInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abac9c5", new Object[]{this, fluidInstance, context, jSONObject});
            return;
        }
        occ.a(context, "inactive_crowd", true);
        if (context == null || jSONObject == null || !soq.a(context)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", (Object) 4);
        this.mCurrentInactivePreloadTask = createPreloadTask(fluidInstance, context, jSONObject);
        if (this.mCurrentInactivePreloadTask != null) {
            pil.a(context, null, "gg_pickpreload_type");
            this.mCurrentInactivePreloadTask.b(new com.taobao.android.fluid.core.a<sor>() { // from class: com.taobao.android.fluid.framework.preload.PreloadService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    PreloadService.this = this;
                }

                @Override // com.taobao.android.fluid.core.a
                public void a(sor sorVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ff234182", new Object[]{this, sorVar});
                    } else {
                        PreloadService.access$002(PreloadService.this, sorVar);
                    }
                }
            });
            HashMap hashMap = new HashMap(1);
            hashMap.put("type", Integer.valueOf(this.mCurrentPreloadTask.e()));
            pil.a(context, null, "gg_pickpreload_type", hashMap);
        }
        spz.c(TAG, "PickPreloadControllerNew，track inactive preload task " + this.mCurrentInactivePreloadTask);
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public PreRenderDWInstance getPreRenderDWInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreRenderDWInstance) ipChange.ipc$dispatch("77063b7a", new Object[]{this}) : this.mPreRenderDWInstance;
    }

    private boolean isVideoTab(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20a119a1", new Object[]{this, fluidContext})).booleanValue();
        }
        String tab3CardType = fluidContext.getInstanceConfig().getTab3CardType();
        spz.c(TAG, "attachGlobalVCH5 tab3CardType=" + tab3CardType + ",hashcode=" + hashCode());
        return "video".equalsIgnoreCase(tab3CardType);
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public sor getPreloadedVideo(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sor) ipChange.ipc$dispatch("690c744e", new Object[]{this, fluidContext});
        }
        if (!isVideoTab(fluidContext)) {
            return null;
        }
        return this.mPreloadVideoData;
    }

    public snv getPreloadDWInstance(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snv) ipChange.ipc$dispatch("ef517257", new Object[]{this, fluidContext});
        }
        sor preloadedVideo = getPreloadedVideo(fluidContext);
        if (preloadedVideo == null) {
            return null;
        }
        return preloadedVideo.f33778a;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void startWarmUp(FluidInstance fluidInstance, final Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c48210", new Object[]{this, fluidInstance, context, uri});
            return;
        }
        spz.c(TAG, "start warm up");
        if (fluidInstance instanceof DefaultFluidInstance) {
            spz.c(TAG, "预创建fluid实例、服务");
            ((DefaultFluidInstance) fluidInstance).tryCreateRemoteService();
        }
        if (!FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableWarmUpInPreload", true)) {
            return;
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.-$$Lambda$PreloadService$lP6AixbLdhmhLLZj7ZsSkHhjjQA
            @Override // java.lang.Runnable
            public final void run() {
                PreloadService.lambda$startWarmUp$0(context);
            }
        });
    }

    public static /* synthetic */ void lambda$startWarmUp$0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a012dd0", new Object[]{context});
            return;
        }
        if (son.a(PerfConst.FEATURE_WARMUP_PLAYER_SO, false)) {
            TaobaoMediaPlayer.loadLibrariesOnce(null);
            spz.c(TAG, "warm up player so");
        }
        if (!son.a(PerfConst.FEATURE_WARMUP_PLAYER_CACHE_SERVER, false)) {
            return;
        }
        oyw.a(context);
        spz.c(TAG, "warm up player cache server");
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public JSONObject startRender(FluidInstance fluidInstance, final Context context, TNodeView tNodeView, Uri uri, String str, boolean z) {
        sor sorVar;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("45a6aa23", new Object[]{this, fluidInstance, context, tNodeView, uri, str, new Boolean(z)});
        }
        spz.c(TAG, "[preloadvideo][stagecost]PreloadService startRender. beforeStartRenderCost=" + (System.currentTimeMillis() - ogt.f32045a) + " tabId=" + str + " isColdLaunch=" + z + " uri=" + uri + ", tnodeView=" + tNodeView);
        pil.a(context, null, "gg_videoMutiTab_startRender");
        long currentTimeMillis = System.currentTimeMillis();
        ogh.a("startRender");
        this.mPreloadVideoTracker.a(this.mFluidContext);
        if (StringUtils.equals("video", str)) {
            if (soq.a(soq.AB_KEY_OPT_VIDEO_PRELOADCACHE)) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.PreloadService.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        PreloadService.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        spz.c(PreloadService.TAG, "[preloadvideo]startRender  preloadPlayerCache startPreloadCacherTime=" + uptimeMillis);
                        i a2 = oyw.a(context);
                        if (a2 != null) {
                            PreloadService.this.isPlayerCacheValid = a2.a();
                        }
                        PreloadService.this.preloadPlayerCacheElapsedTime = SystemClock.uptimeMillis() - uptimeMillis;
                        spz.c(PreloadService.TAG, "[preloadvideo][stagecost]proxyCacheServer cost=" + PreloadService.this.preloadPlayerCacheElapsedTime + "; isPlayerCacheValid=" + PreloadService.this.isPlayerCacheValid);
                    }
                });
                z2 = true;
            } else {
                z2 = false;
            }
            sorVar = doPreRender(fluidInstance, context, tNodeView, uri, z);
            this.mPreloadVideoData = sorVar;
            IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) fluidInstance.getService(IPreloadWeexService.class);
            if (iPreloadWeexService != null) {
                sor sorVar2 = this.mPreloadVideoData;
                com.taobao.android.fluid.framework.data.datamodel.a aVar = (sorVar2 == null || !sorVar2.s || this.mPreloadVideoData.u == null) ? null : this.mPreloadVideoData.u;
                iPreloadWeexService.getPreloadWeexData().a(PreloadWeexData.OUTSIDE_PRELOAD);
                iPreloadWeexService.startRender(context, tNodeView, aVar);
            }
        } else {
            sorVar = null;
            z2 = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.taobao.tao.infoflow.multitab.e.KEY_TAB_ID, str);
        if (sorVar == null) {
            z3 = false;
        }
        hashMap.put("hasPreloadVideoView", Boolean.valueOf(z3));
        hashMap.put("enablePreloadPlayerCache", Boolean.valueOf(z2));
        hashMap.put("preloadPlayerCacheElapsedTime", Long.valueOf(this.preloadPlayerCacheElapsedTime));
        hashMap.put("isPlayerCacheValid", Boolean.valueOf(this.isPlayerCacheValid));
        pil.a(context, null, "gg_videoMutiTab_startRender", hashMap);
        spz.c(TAG, "[preloadvideo][stagecost]startRender cost=" + (System.currentTimeMillis() - currentTimeMillis));
        resetPreloadTaskHistroy();
        if (sorVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(gvw.RENDER_RESULT_HAS_DW_INSTANCE, (Object) Boolean.valueOf(sorVar.d()));
            ogh.b();
            return jSONObject;
        }
        ogh.b();
        return null;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void clearPreloadTaskForContext(FluidInstance fluidInstance, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c580fc", new Object[]{this, fluidInstance, context});
            return;
        }
        IPreloadTask iPreloadTask = this.mCurrentPreloadTask;
        if (iPreloadTask != null && iPreloadTask.a() == context) {
            spz.c(TAG, "clearPreloadTaskForContext: " + this.mCurrentPreloadTask);
            this.mCurrentPreloadTask.a(this.mPreloadVideoData, this.cancelCallback);
            this.mCurrentPreloadTask = null;
            this.mPreloadVideoData = null;
        }
        IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) fluidInstance.getService(IPreloadWeexService.class);
        if (iPreloadWeexService == null) {
            return;
        }
        iPreloadWeexService.onDestroyService();
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void clearMemoryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a16ff", new Object[]{this});
            return;
        }
        spz.c(TAG, "clearMemoryData");
        if (soq.m()) {
            return;
        }
        this.mPreloadVideoData = null;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public boolean isInactiveUnexposedCacheVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b3012f6", new Object[]{this})).booleanValue() : this.mCurrentInactivePreloadTask instanceof com.taobao.android.fluid.framework.preload.task.e;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public boolean isPreloadedVideoAdded(FluidContext fluidContext) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e3fc980", new Object[]{this, fluidContext})).booleanValue();
        }
        snv preloadDWInstance = getPreloadDWInstance(fluidContext);
        return (preloadDWInstance == null || (f = preloadDWInstance.f()) == null || com.taobao.android.fluid.framework.preload.dwinstance.c.a(f.getParent()) == null) ? false : true;
    }

    private sor doPreRender(FluidInstance fluidInstance, Context context, TNodeView tNodeView, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sor) ipChange.ipc$dispatch("c0ea0a79", new Object[]{this, fluidInstance, context, tNodeView, uri, new Boolean(z)});
        }
        if ((context instanceof Activity) && uri != null) {
            cancelCurrentPreloadTask();
            this.mPreRenderDWInstance = new PreRenderDWInstance.a().a(context).a(z).a(tNodeView).a(uri).a(getPreloadABConfig()).a(this.mPreloadVideoData).a(fluidInstance).a();
            return this.mPreRenderDWInstance.executePreRender();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("createDWInstance执行完executePreRender后preloadVideoData:");
        sor sorVar = this.mPreloadVideoData;
        sb.append(sorVar != null ? sorVar.toString() : null);
        spz.c(TAG, sb.toString());
        return null;
    }

    private void cancelCurrentPreloadTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92aac516", new Object[]{this});
            return;
        }
        IPreloadTask iPreloadTask = this.mCurrentPreloadTask;
        if (iPreloadTask != null && !(iPreloadTask instanceof com.taobao.android.fluid.framework.preload.task.b) && iPreloadTask.b() == null) {
            this.mCurrentPreloadTask.a(this.mPreloadVideoData, this.cancelCallback);
        }
        this.cancelPreload = true;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public IPreloadTask getCurrentPreloadTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPreloadTask) ipChange.ipc$dispatch("f76ee773", new Object[]{this}) : this.mCurrentPreloadTask;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public sor getPreloadVideoData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("1fb0e7d7", new Object[]{this}) : this.mPreloadVideoData;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public sjq getPreLoadVideoCommentSizeObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjq) ipChange.ipc$dispatch("dda6d10e", new Object[]{this});
        }
        PreRenderDWInstance preRenderDWInstance = this.mPreRenderDWInstance;
        if (preRenderDWInstance == null) {
            return null;
        }
        return preRenderDWInstance.getVideoCommentSizeObject();
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public b getPreloadVideoTrackerManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c872712b", new Object[]{this}) : this.mPreloadVideoTracker;
    }

    private IPreloadTask createPreloadTask(FluidInstance fluidInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPreloadTask) ipChange.ipc$dispatch("30a70d9c", new Object[]{this, fluidInstance, context, jSONObject});
        }
        int a2 = oec.a(jSONObject.get("type"), 1);
        if (a2 == 0) {
            return new com.taobao.android.fluid.framework.preload.task.b(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (a2 == 1) {
            return new f(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (a2 == 3) {
            return new d(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (a2 == 4) {
            return new com.taobao.android.fluid.framework.preload.task.e(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (a2 == 10) {
            return new com.taobao.android.fluid.framework.preload.task.c(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        return null;
    }
}

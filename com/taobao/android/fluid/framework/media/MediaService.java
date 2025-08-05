package com.taobao.android.fluid.framework.media;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.renderscript.RenderScript;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.containerframe.IContainerFrameService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.b;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.media.miniwindow.c;
import com.taobao.avplayer.DWVideoScreenType;
import java.util.Map;
import tb.hjl;
import tb.hnh;
import tb.hni;
import tb.kge;
import tb.oec;
import tb.psw;
import tb.psy;
import tb.sii;
import tb.sij;
import tb.skl;
import tb.sns;
import tb.snv;
import tb.snz;
import tb.sob;
import tb.sod;
import tb.spz;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class MediaService implements IMediaService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_PREFIX_MEDIA_LIFECYCLE = "[Media Lifecycle]卡片：";
    private static final String LOG_PREFIX_MEDIA_LISTENER = "[Media Listener]卡片: ";
    private static final String SERVICE_NAME = "IMediaService";
    private static final String TAG = "MediaService";
    private final c currentPlayVideoMgrComponent;
    private ICardService mCardService;
    private IContainerFrameService mContainerFrameService;
    private IContainerService mContainerService;
    private IDataService mDataService;
    private final FluidContext mFluidContext;
    private final sob mMediaLifecycleManager;
    private final sod mMediaListenersManager;
    private RenderScript mRenderScript;
    private boolean mUseDefaultValueCreateDW;
    private boolean mFirstFrameSuccess = false;
    private final sns mMediaServiceConfig = new sns();

    static {
        kge.a(510917253);
        kge.a(-1901094042);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public MediaService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mMediaLifecycleManager = new sob(this.mFluidContext);
        this.mMediaListenersManager = new sod(this.mFluidContext);
        this.currentPlayVideoMgrComponent = new c(this.mFluidContext);
    }

    public void addMediaPlayerListener(hnh hnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe9a5ed", new Object[]{this, hnhVar});
        } else {
            this.mMediaListenersManager.a(hnhVar);
        }
    }

    public void removeMediaPlayerListener(hnh hnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf8e9aa", new Object[]{this, hnhVar});
        } else {
            this.mMediaListenersManager.b(hnhVar);
        }
    }

    public void addLivePlayerListener(hjl hjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a0ea4f", new Object[]{this, hjlVar});
        } else {
            this.mMediaListenersManager.a(hjlVar);
        }
    }

    public void addLivePlayerListener(hjl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e48ab2", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.a(aVar);
        }
    }

    public void addVideoPlayerListener(hni hniVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f6a023", new Object[]{this, hniVar});
        } else {
            this.mMediaListenersManager.a(hniVar);
        }
    }

    @Override // tb.hna
    public void addVideoPlayerListener(hni.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a41b86", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.addVideoPlayerListener(aVar);
        }
    }

    public void removeLivePlayerListener(hjl hjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfebbaf2", new Object[]{this, hjlVar});
        } else {
            this.mMediaListenersManager.b(hjlVar);
        }
    }

    public void removeLivePlayerListener(hjl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bdbe95", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.b(aVar);
        }
    }

    public void removeVideoPlayerListener(hni hniVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb05e3e0", new Object[]{this, hniVar});
        } else {
            this.mMediaListenersManager.b(hniVar);
        }
    }

    public void removeVideoPlayerListener(hni.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff16403", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.a(aVar);
        }
    }

    public void addMediaLifecycleListener(snz snzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec9b653", new Object[]{this, snzVar});
        } else {
            this.mMediaLifecycleManager.a(snzVar);
        }
    }

    public void addMediaLifecycleListener(snz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520a65b6", new Object[]{this, aVar});
        } else {
            this.mMediaLifecycleManager.a(aVar);
        }
    }

    public void removeMediaLifecycleListener(snz snzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e257d76", new Object[]{this, snzVar});
        } else {
            this.mMediaLifecycleManager.b(snzVar);
        }
    }

    public void removeMediaLifecycleListener(snz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1990f019", new Object[]{this, aVar});
        } else {
            this.mMediaLifecycleManager.b(aVar);
        }
    }

    public int getVideoState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue() : this.mMediaListenersManager.b();
    }

    @Override // tb.hnh
    public boolean hook(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3ed3d4a", new Object[]{this, pswVar})).booleanValue() : this.mMediaListenersManager.hook(pswVar);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public boolean isFirstFrameSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b53f8b27", new Object[]{this})).booleanValue() : this.mFirstFrameSuccess;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setFirstFrameSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae908149", new Object[]{this, new Boolean(z)});
        } else {
            this.mFirstFrameSuccess = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public sns getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sns) ipChange.ipc$dispatch("febcb46f", new Object[]{this}) : this.mMediaServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public snv getCurrentPlayInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("a45e25b8", new Object[]{this}) : this.currentPlayVideoMgrComponent.a();
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setCurrentPlayInstance(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b274dc", new Object[]{this, snvVar});
        } else {
            this.currentPlayVideoMgrComponent.a(snvVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public RenderScript getRenderScript() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderScript) ipChange.ipc$dispatch("39c196a0", new Object[]{this}) : this.mRenderScript;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setRenderScript(RenderScript renderScript) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4333468", new Object[]{this, renderScript});
        } else {
            this.mRenderScript = renderScript;
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public int getVideoLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72dc8105", new Object[]{this})).intValue();
        }
        psy activeMediaCard = getActiveMediaCard();
        if (activeMediaCard == null) {
            spz.c("MediaService", "getVideoLength, the current card is null");
            return 0;
        } else if (!(activeMediaCard instanceof sii)) {
            spz.c("MediaService", "getVideoLength, the current card is not ShortVideoCard");
            return 0;
        } else {
            return ((sii) activeMediaCard).k().h();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public int getVideoProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbd9778c", new Object[]{this})).intValue();
        }
        psy activeMediaCard = getActiveMediaCard();
        if (activeMediaCard == null) {
            spz.c("MediaService", "getVideoProgress, the current card is null");
            return 0;
        }
        return ((sii) activeMediaCard).k().i();
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public boolean isUseDefaultValueCreateDW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83694c87", new Object[]{this})).booleanValue() : this.mUseDefaultValueCreateDW;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setUseDefaultValueCreateDW(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f021e9", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseDefaultValueCreateDW = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void pauseCurrentVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b01c1f", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.g();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void resumeCurrentVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a07056", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.i();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setNeedFloatWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18425979", new Object[]{this, new Boolean(z)});
        } else {
            this.currentPlayVideoMgrComponent.a(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setOnStateChangeFromSmallWindowToNormal(IMediaService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0e8d02", new Object[]{this, aVar});
        } else {
            this.currentPlayVideoMgrComponent.a(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public boolean shouldVideoStay() {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1c8b90c", new Object[]{this})).booleanValue();
        }
        boolean isShareContentContainerShowing = FluidSDK.getShareAdapter().isShareContentContainerShowing();
        boolean isGoodListShowing = this.mContainerFrameService.isGoodListShowing();
        boolean isAlbumDetailFrameShowing = this.mContainerFrameService.isAlbumDetailFrameShowing();
        boolean z = (this.mFluidContext.getContext() instanceof FragmentActivity) && (findFragmentByTag = ((FragmentActivity) this.mFluidContext.getContext()).getSupportFragmentManager().findFragmentByTag("share_video_download_loading")) != null && findFragmentByTag.isAdded();
        psw activeCard = this.mCardService.getActiveCard();
        return isShareContentContainerShowing || isGoodListShowing || this.mContainerService.getConfig().e() || getConfig().g() || this.mCardService.getConfig().f() || this.mContainerService.getConfig().f() || z || isAlbumDetailFrameShowing || getConfig().h() || (activeCard instanceof sii ? ((sii) activeCard).p().c().c() : false) || checkAutoSlideXCardAndStayInCurrentPosition(this.mDataService.getCurrentMediaPosition());
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
            return;
        }
        psy activeMediaCard = getActiveMediaCard();
        if (activeMediaCard == null) {
            spz.c("MediaService", "update12003UtParams, the current card is null");
        } else {
            activeMediaCard.a(map);
        }
    }

    @Override // tb.hjl
    public void onCompletion(psw pswVar, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f520420", new Object[]{this, pswVar, iMediaPlayer});
        } else {
            this.mMediaListenersManager.onCompletion(pswVar, iMediaPlayer);
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (!(this.mFluidContext.getContext() instanceof Activity)) {
        } else {
            this.currentPlayVideoMgrComponent.a((Activity) this.mFluidContext.getContext());
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.d();
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.c();
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.b();
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.e();
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        if (this.mFluidContext.getContext() instanceof Activity) {
            this.currentPlayVideoMgrComponent.b((Activity) this.mFluidContext.getContext());
        }
        RenderScript renderScript = this.mRenderScript;
        if (renderScript == null) {
            return;
        }
        renderScript.destroy();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        this.mDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        this.mCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        this.mContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        this.mContainerFrameService = (IContainerFrameService) this.mFluidContext.getService(IContainerFrameService.class);
    }

    @Override // tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onDataUpdate 回调");
        this.mMediaLifecycleManager.onDataUpdate(pswVar);
    }

    @Override // tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onPauseMedia 回调");
        this.mMediaLifecycleManager.onPauseMedia(pswVar);
    }

    @Override // tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onRecyclePlayer 回调");
        this.mMediaLifecycleManager.onRecyclePlayer(pswVar, z);
    }

    @Override // tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onRequestMediaPlayer 回调");
        this.mMediaLifecycleManager.onRequestMediaPlayer(pswVar);
    }

    @Override // tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onShowCover 回调");
        this.mMediaLifecycleManager.onShowCover(pswVar);
    }

    @Override // tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onShowFirstCover 回调");
        this.mMediaLifecycleManager.onShowFirstCover(pswVar, i, i2, drawable, str);
    }

    @Override // tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onStartMedia 回调");
        this.mMediaLifecycleManager.onStartMedia(pswVar, z, z2);
    }

    @Override // tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onStopMedia 回调");
        this.mMediaLifecycleManager.onStopMedia(pswVar);
    }

    @Override // tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + pswVar + "触发 onUTPairsUpdate 回调");
        this.mMediaLifecycleManager.onUTPairsUpdate(pswVar);
    }

    @Override // tb.hjl
    public boolean onError(psw pswVar, IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("193dfed2", new Object[]{this, pswVar, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onError 回调");
        FluidContext fluidContext = this.mFluidContext;
        b bVar = new b(b.PREFIX_FLUID_MEDIA_SERVICE_LIVE + i, "直播播放错误");
        FluidException.throwException(fluidContext, bVar, "直播播放错误，错误码：" + i + "，错误信息：" + i2);
        this.mContainerService.onFirstCardRenderFailed(pswVar);
        this.mContainerService.onCardRenderFailed(pswVar);
        return this.mMediaListenersManager.onError(pswVar, iMediaPlayer, i, i2);
    }

    @Override // tb.hjl
    public boolean onInfo(psw pswVar, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e7af9b2", new Object[]{this, pswVar, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onInfo 回调");
        if (3 == j) {
            this.mContainerService.onFirstCardRenderSuccess(pswVar);
            this.mContainerService.onCardRenderSuccess(pswVar);
        }
        return this.mMediaListenersManager.onInfo(pswVar, iMediaPlayer, j, j2, j3, obj);
    }

    @Override // tb.hni
    public void onLoopCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0caff82", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onLoopCompletion 回调");
        this.mMediaListenersManager.onLoopCompletion(pswVar);
    }

    @Override // tb.hni
    public void onPreCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9060abe3", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onPreCompletion 回调");
        this.mMediaListenersManager.onPreCompletion(pswVar);
    }

    @Override // tb.hjl
    public void onPrepared(psw pswVar, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4c7581", new Object[]{this, pswVar, iMediaPlayer});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onPrepared 回调");
        this.mMediaListenersManager.onPrepared(pswVar, iMediaPlayer);
    }

    @Override // tb.hni
    public void onVideoStart(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef89", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoStart 回调");
        this.mMediaListenersManager.onVideoStart(pswVar);
    }

    @Override // tb.hni
    public void onVideoPause(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoPause 回调");
        this.mMediaListenersManager.onVideoPause(pswVar, z);
    }

    @Override // tb.hni
    public void onVideoPlay(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoPlay 回调");
        this.mMediaListenersManager.onVideoPlay(pswVar);
    }

    @Override // tb.hni
    public void onVideoSeekTo(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoSeekTo 回调");
        this.mMediaListenersManager.onVideoSeekTo(pswVar, i);
    }

    @Override // tb.hni
    public void onVideoPrepared(psw pswVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoPrepared 回调");
        this.mMediaListenersManager.onVideoPrepared(pswVar, obj);
    }

    @Override // tb.hni
    public void onVideoError(psw pswVar, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoError 回调");
        FluidContext fluidContext = this.mFluidContext;
        b bVar = new b(b.PREFIX_FLUID_MEDIA_SERVICE_VIDEO + i, "视频播放错误");
        FluidException.throwException(fluidContext, bVar, "视频播放错误，错误码：" + i + "，错误信息：" + i2);
        this.mContainerService.onFirstCardRenderFailed(pswVar);
        this.mContainerService.onCardRenderFailed(pswVar);
        this.mMediaListenersManager.onVideoError(pswVar, obj, i, i2);
    }

    @Override // tb.hni
    public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoInfo 回调");
        if (3 == j) {
            this.mContainerService.onFirstCardRenderSuccess(pswVar);
            this.mContainerService.onCardRenderSuccess(pswVar);
        }
        this.mMediaListenersManager.onVideoInfo(pswVar, obj, j, j2, j3, obj2);
    }

    @Override // tb.hni
    public void onVideoComplete(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6169a058", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoComplete 回调");
        this.mMediaListenersManager.onVideoComplete(pswVar);
    }

    @Override // tb.hni
    public void onVideoClose(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c366581f", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoClose 回调");
        this.mMediaListenersManager.onVideoClose(pswVar);
    }

    @Override // tb.hni
    public void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ff74ca", new Object[]{this, pswVar, dWVideoScreenType});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoScreenChanged 回调");
        this.mMediaListenersManager.onVideoScreenChanged(pswVar, dWVideoScreenType);
    }

    @Override // tb.hni
    public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.mMediaListenersManager.onVideoProgressChanged(pswVar, i, i2, i3);
        }
    }

    @Override // tb.hni
    public void onVideoStateChanged(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400dd041", new Object[]{this, pswVar, new Integer(i)});
            return;
        }
        spz.c("MediaService", LOG_PREFIX_MEDIA_LISTENER + pswVar + "触发 onVideoStateChanged 回调");
        this.mMediaListenersManager.onVideoStateChanged(pswVar, i);
    }

    private boolean checkAutoSlideXCardAndStayInCurrentPosition(int i) {
        boolean z;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00c7085", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int a2 = sij.a();
        spz.c("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition 用户设置过，返回用户设置过的值 autoNextVideoState=" + a2);
        if (a2 != 0) {
            return false;
        }
        skl j = this.mDataService.getConfig().j();
        int i2 = Integer.MAX_VALUE;
        if (j != null && j.am != null) {
            if (j.ap != null) {
                map = (Map) j.ap.get("autoSlideXCard");
                spz.c("PickPreloadControllerNew", "下滑 新协议。autoSlideXCard=" + map);
            } else {
                map = j.am.get("autoSlideXCard");
            }
            spz.c("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition, autoSlideXCard=" + map);
            if (map != null) {
                z = oec.a(map.get("enableAutoSlideXCard"), false);
                i2 = oec.a(map.get("autoSlideCount"), Integer.MAX_VALUE);
                boolean a3 = sij.a(this.mDataService.getConfig().j().q);
                spz.c("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition 用户未设置过，开关打开，服务端可下滑，前X坑 currentPosition=" + i + ",shouldNext=" + a3 + ",xCellNum=" + i2 + "，enable=" + z);
                return !a3 && z && i >= i2;
            }
        }
        z = false;
        boolean a32 = sij.a(this.mDataService.getConfig().j().q);
        spz.c("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition 用户未设置过，开关打开，服务端可下滑，前X坑 currentPosition=" + i + ",shouldNext=" + a32 + ",xCellNum=" + i2 + "，enable=" + z);
        if (!a32) {
        }
    }

    private psy getActiveMediaCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psy) ipChange.ipc$dispatch("66fea291", new Object[]{this});
        }
        psw activeCard = this.mCardService.getActiveCard();
        if (!(activeCard instanceof psy)) {
            spz.c("MediaService", "获取当前 Active 的卡片，卡片类型不是 MediaCard: " + activeCard);
            return null;
        }
        return (psy) activeCard;
    }
}

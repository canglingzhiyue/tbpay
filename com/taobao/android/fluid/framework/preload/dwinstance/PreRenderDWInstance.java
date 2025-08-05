package com.taobao.android.fluid.framework.preload.dwinstance;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.util.f;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.dde;
import tb.kge;
import tb.oec;
import tb.ohd;
import tb.pio;
import tb.sjq;
import tb.sjs;
import tb.snv;
import tb.soo;
import tb.soq;
import tb.sor;
import tb.spz;

/* loaded from: classes5.dex */
public class PreRenderDWInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FIRST_FRAME_VIEW_TOP_LEVEL = 51;
    private static final String TAG = "PickPreloadController_PreRenderDWInstance_PreloadVideoModule";
    public static final int VIDEO_VIEW_TOP_LEVEL = 50;
    private boolean isFromLauncher;
    private boolean mColdStartGetCacheFlag;
    private Context mContext;
    private FluidInstance mFluidInstance;
    private soo mPreloadABConfig;
    private sor mPreloadVideoData;
    private TNodeView mTNodeView;
    private Uri mUri;
    private sjq mVideoCommentSizeObject;

    static {
        kge.a(1920097481);
    }

    public static /* synthetic */ sor access$700(PreRenderDWInstance preRenderDWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("1d379056", new Object[]{preRenderDWInstance}) : preRenderDWInstance.mPreloadVideoData;
    }

    public static /* synthetic */ TNodeView access$800(PreRenderDWInstance preRenderDWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("b3cefe16", new Object[]{preRenderDWInstance}) : preRenderDWInstance.mTNodeView;
    }

    public static /* synthetic */ FluidInstance access$900(PreRenderDWInstance preRenderDWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidInstance) ipChange.ipc$dispatch("2d47e42", new Object[]{preRenderDWInstance}) : preRenderDWInstance.mFluidInstance;
    }

    private PreRenderDWInstance(a aVar) {
        this.mContext = a.a(aVar);
        this.mTNodeView = a.b(aVar);
        this.mUri = a.c(aVar);
        this.isFromLauncher = a.d(aVar);
        this.mPreloadABConfig = a.e(aVar);
        this.mPreloadVideoData = a.f(aVar);
        this.mFluidInstance = a.g(aVar);
    }

    public sjq getVideoCommentSizeObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjq) ipChange.ipc$dispatch("d103580b", new Object[]{this}) : this.mVideoCommentSizeObject;
    }

    public sor executePreRender() {
        boolean renderCacheVideo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sor) ipChange.ipc$dispatch("c9889ca5", new Object[]{this});
        }
        if (this.mPreloadVideoData != null) {
            renderCacheVideo = renderPreloadDWInstance();
            if (this.mPreloadVideoData.g) {
                com.taobao.android.fluid.framework.preload.cache.b.b().a(this.mPreloadVideoData.b);
            }
        } else if (this.isFromLauncher) {
            pio.a(pio.GG_VIDEOTAB_VIDEO_CREATE_DW_INSTANCE);
            boolean renderCacheVideo2 = renderCacheVideo(true);
            pio.b(pio.GG_VIDEOTAB_VIDEO_CREATE_DW_INSTANCE);
            renderCacheVideo = renderCacheVideo2;
        } else {
            renderCacheVideo = renderCacheVideo(false);
        }
        if (!renderCacheVideo) {
            return null;
        }
        return this.mPreloadVideoData;
    }

    private String getCacheType(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd26dd83", new Object[]{this, detailCacheData});
        }
        if (detailCacheData == null || detailCacheData.sceneName == null) {
            return "none";
        }
        String str = detailCacheData.sceneName;
        char c = 65535;
        switch (str.hashCode()) {
            case -1367604453:
                if (str.equals(IDetailCache.SCENE_NAME_ICON_STREAM_PRELOAD_VIDEO)) {
                    c = 3;
                    break;
                }
                break;
            case -534425733:
                if (str.equals(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED)) {
                    c = 1;
                    break;
                }
                break;
            case 1723827248:
                if (str.equals(IDetailCache.SCENE_NAME_SHORT_VIDEO_PRECACHE_UNEXPOSED)) {
                    c = 2;
                    break;
                }
                break;
            case 1792813058:
                if (str.equals(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED)) {
                    c = 0;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? "none" : "preload" : "download_unexposed" : MergeUtil.KEY_EXPOSED : "unexposed";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.sor buildPreloadVideoIfCacheData(android.content.Context r22, com.taobao.tao.flexbox.layoutmanager.core.TNodeView r23, boolean r24, android.net.Uri r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance.buildPreloadVideoIfCacheData(android.content.Context, com.taobao.tao.flexbox.layoutmanager.core.TNodeView, boolean, android.net.Uri):tb.sor");
    }

    private void trackCacheVideo(sor sorVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae3790f", new Object[]{this, sorVar, new Boolean(z)});
            return;
        }
        if (!this.mColdStartGetCacheFlag) {
            this.mColdStartGetCacheFlag = true;
            z2 = true;
        }
        IPreloadService iPreloadService = (IPreloadService) this.mFluidInstance.getService(IPreloadService.class);
        if (iPreloadService == null || iPreloadService.getPreloadVideoTrackerManager() == null) {
            return;
        }
        iPreloadService.getPreloadVideoTrackerManager().a(sorVar, getPreloadABConfig(), z, z2);
    }

    private static DetailCacheData getValidCacheVideoData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("a9b8b256", new Object[0]);
        }
        DetailCacheData b = com.taobao.android.fluid.framework.preload.cache.b.b().b();
        if (b != null && b.isValid) {
            return b;
        }
        DetailCacheData b2 = com.taobao.android.fluid.framework.preload.cache.b.a().b();
        if (b2 == null) {
            return null;
        }
        return b2;
    }

    private soo getPreloadABConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (soo) ipChange.ipc$dispatch("d6a2f596", new Object[]{this});
        }
        soo sooVar = this.mPreloadABConfig;
        return sooVar == null ? new soo(null) : sooVar;
    }

    private boolean renderPreloadDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49c89126", new Object[]{this})).booleanValue();
        }
        spz.c(TAG, "[preloadvideo]renderPreloadDWInstance, mPreloadedVideo: " + this.mPreloadVideoData);
        boolean tryAddVideoViewToContainerAndStart = tryAddVideoViewToContainerAndStart(true);
        final snv snvVar = this.mPreloadVideoData.f33778a;
        if (tryAddVideoViewToContainerAndStart && isDWInstanceRecycled(snvVar)) {
            if (!soq.f()) {
                return true;
            }
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        spz.c(PreRenderDWInstance.TAG, "[preloadvideo]start pause/playVideo in hot launch");
                        snvVar.c();
                        snvVar.b();
                    } catch (Throwable th) {
                        spz.c(PreRenderDWInstance.TAG, "pause/playVideo:" + th.getMessage());
                    }
                }
            });
        }
        return tryAddVideoViewToContainerAndStart;
    }

    private boolean isDWInstanceRecycled(snv snvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6128c963", new Object[]{this, snvVar})).booleanValue() : snvVar.k();
    }

    private boolean tryAddVideoViewToContainerAndStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a7e7c3a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        spz.c(TAG, "try add video view to container, mPreloadedVideo: " + this.mPreloadVideoData);
        boolean addVideoViewToContainerAndStart = addVideoViewToContainerAndStart(z);
        if (addVideoViewToContainerAndStart) {
            detachVideoViewFromContainerSafely();
        }
        return addVideoViewToContainerAndStart;
    }

    private void detachVideoViewFromContainerSafely() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6906e8b", new Object[]{this});
        } else if (this.mPreloadVideoData == null) {
        } else {
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (PreRenderDWInstance.access$700(PreRenderDWInstance.this).f33778a != null) {
                        ViewGroup f = PreRenderDWInstance.access$700(PreRenderDWInstance.this).f33778a.f();
                        if (PreRenderDWInstance.access$800(PreRenderDWInstance.this) != null && f != null && PreRenderDWInstance.access$800(PreRenderDWInstance.this).containView(f)) {
                            spz.c(PreRenderDWInstance.TAG, "detachVideoViewFromContainerSafely");
                            PreRenderDWInstance.access$800(PreRenderDWInstance.this).removeUpperView(f);
                        }
                    }
                    TUrlImageView tUrlImageView = PreRenderDWInstance.access$700(PreRenderDWInstance.this).o;
                    if (tUrlImageView == null || !(tUrlImageView.getParent() instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) tUrlImageView.getParent()).removeView(tUrlImageView);
                    PreRenderDWInstance.access$700(PreRenderDWInstance.this).o = null;
                    spz.c(PreRenderDWInstance.TAG, "PickPreloadControllerNew,detachVideoViewFromContainerSafely,firstFrameImagerView移除清空");
                }
            }, 5000L);
        }
    }

    private boolean addVideoViewToContainerAndStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd8c7df", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        sor sorVar = this.mPreloadVideoData;
        if (sorVar == null) {
            spz.c(TAG, "[preloadvideo]addVideoViewToContainer return for preloadVideoData is null");
            return false;
        }
        snv snvVar = sorVar.f33778a;
        if (snvVar == null) {
            spz.c(TAG, "[preloadvideo]addVideoViewToContainer return for instance is null");
            return false;
        }
        final ViewGroup f = snvVar.f();
        c.b(f);
        Context context = this.mTNodeView.getContext();
        if (f == null || f.getParent() != null || !isPreloadVideoValid(this.mPreloadVideoData) || !this.mPreloadVideoData.a(context)) {
            spz.c(TAG, "[preloadvideo]addVideoViewToContainer return for videoView is not valid");
            return false;
        }
        f.setTag(R.id.fluid_sdk_tag_preloadVideo, this.mPreloadVideoData);
        f.setTag(R.id.fluid_sdk_tag_video_precreated, Boolean.valueOf(z));
        f.setId(R.id.fluid_sdk_preattach_videoview);
        f.setTag(R.id.fluid_sdk_tag_tnodeView, this.mTNodeView);
        sjq a2 = sjs.a(context, (View) f, true, getPreloadABConfig().b());
        this.mVideoCommentSizeObject = a2;
        snvVar.a(a2.d, a2.c);
        snvVar.a(DWInstanceType.VIDEO);
        spz.c(TAG, "[画幅] " + a2);
        final long currentTimeMillis = System.currentTimeMillis();
        snvVar.a(new dde() { // from class: com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dde
            public long getStartTime() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : currentTimeMillis;
            }
        });
        final HashMap hashMap = new HashMap();
        hashMap.put("networkQuality", String.valueOf(NetworkQualityMonitor.getGlobalNetworkQuality()));
        hashMap.put("networkStatus", String.valueOf(NetworkStatusHelper.getStatus() != null ? NetworkStatusHelper.getStatus().getType() : "none"));
        hashMap.put("netLowPowerMode", String.valueOf(NetworkStatusHelper.getLowPowerMode()));
        hashMap.put("netSavePower", String.valueOf(NetworkStatusHelper.isSavePower()));
        hashMap.put("netSpeed", String.valueOf(f.a()));
        f.setTag(R.id.fluid_sdk_tag_preload_netinfo, hashMap);
        long currentTimeMillis2 = System.currentTimeMillis();
        f.setTag(R.id.fluid_sdk_tag_play_before_start_time, String.valueOf(currentTimeMillis2));
        snvVar.a();
        long currentTimeMillis3 = System.currentTimeMillis();
        spz.c(TAG, "[preloadvideo][stagecost]预创建播放器start, cost=" + (currentTimeMillis3 - currentTimeMillis2) + ";videostate:" + snvVar.e() + " ,preCreated=" + z + ", preloadedVideo=" + this.mPreloadVideoData);
        f.setTag(R.id.fluid_sdk_tag_play_start_time, Long.valueOf(currentTimeMillis3));
        pio.a(context, snvVar, (FluidContext) null);
        ViewTreeObserver viewTreeObserver = f.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    if (f.getViewTreeObserver() != null) {
                        f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    int width = f.getWidth();
                    int height = f.getHeight();
                    hashMap.put("videoAttachTs", String.valueOf(System.currentTimeMillis()));
                    hashMap.put("videoAttachWidth", String.valueOf(width));
                    hashMap.put("videoAttachHeight", String.valueOf(height));
                    spz.c(PreRenderDWInstance.TAG, "[preloadvideo] videoview surface onGlobalLayout Width: " + width + ", Height: " + height);
                }
            });
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2.d, a2.c);
        layoutParams.topMargin = a2.e + ohd.h(this.mTNodeView.getContext());
        layoutParams.bottomMargin = 0;
        layoutParams.width = a2.d;
        layoutParams.height = a2.c;
        spz.c(TAG, "[画幅]bottomMargin=0,width=" + a2.d + "; height=" + a2.c);
        final boolean[] zArr = {false};
        TNodeView.a aVar = new TNodeView.a() { // from class: com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.a
            public void a(TNodeView tNodeView, View view) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cec5caad", new Object[]{this, tNodeView, view});
                    return;
                }
                try {
                    zArr[0] = true;
                    if (view == null) {
                        return;
                    }
                    sor sorVar2 = (sor) view.getTag(R.id.fluid_sdk_tag_preloadVideo);
                    snv snvVar2 = sorVar2 != null ? sorVar2.f33778a : null;
                    if (snvVar2 == null) {
                        return;
                    }
                    Activity g = oec.g(tNodeView.getContext());
                    if (g == null || !g.isFinishing()) {
                        z2 = false;
                    }
                    spz.c(PreRenderDWInstance.TAG, "pause preCreated DWInstance when at container, isFinish " + z2);
                    snvVar2.c();
                    snvVar2.j();
                    if (!z2) {
                        return;
                    }
                    snvVar2.d();
                    com.taobao.android.fluid.business.usertrack.track.b.c();
                } catch (Exception e) {
                    FluidException.throwException(PreRenderDWInstance.access$900(PreRenderDWInstance.this), com.taobao.android.fluid.core.b.ADD_VIDEO_VIEW_TO_CONTAINER_PAUSE_ERROR, e);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.a
            public void b(TNodeView tNodeView, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf94492e", new Object[]{this, tNodeView, view});
                } else if (view == null) {
                } else {
                    try {
                        if (!zArr[0]) {
                            return;
                        }
                        sor sorVar2 = (sor) view.getTag(R.id.fluid_sdk_tag_preloadVideo);
                        snv snvVar2 = sorVar2 != null ? sorVar2.f33778a : null;
                        if (snvVar2 == null) {
                            return;
                        }
                        snvVar2.b();
                    } catch (Exception e) {
                        FluidException.throwException(PreRenderDWInstance.access$900(PreRenderDWInstance.this), com.taobao.android.fluid.core.b.ADD_VIDEO_VIEW_TO_CONTAINER_RESUME_ERROR, e);
                    }
                }
            }
        };
        this.mTNodeView.addUpperView(f, layoutParams, 50, aVar);
        spz.c(TAG, "[preloadvideo] videoview surface addUpperView... ");
        if (this.mPreloadVideoData.n != null || (!TextUtils.isEmpty(this.mPreloadVideoData.m) && z)) {
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            if (this.mPreloadVideoData.n != null) {
                tUrlImageView.setImageDrawable(this.mPreloadVideoData.n);
            } else {
                tUrlImageView.setImageUrl(this.mPreloadVideoData.m);
            }
            tUrlImageView.setLayoutParams(layoutParams);
            tUrlImageView.setScaleType(a2.g);
            this.mTNodeView.addUpperView(tUrlImageView, layoutParams, 51, aVar);
            this.mPreloadVideoData.o = tUrlImageView;
            spz.c(TAG, "PickPreloadControllerNew,addVideoViewToContainer,首帧图加载到container上:" + this.mPreloadVideoData.o);
        }
        this.mPreloadVideoData.a(0);
        return true;
    }

    private boolean renderCacheVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5382842", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        spz.c(TAG, "renderCacheVideo, fromLauncher=" + z);
        this.mPreloadVideoData = buildPreloadVideoIfCacheData(this.mContext, this.mTNodeView, z, this.mUri);
        boolean tryAddVideoViewToContainerAndStart = tryAddVideoViewToContainerAndStart(false);
        if (!tryAddVideoViewToContainerAndStart) {
            spz.c(TAG, "renderCacheVideo return for added is false");
            TNodeView tNodeView = this.mTNodeView;
            if (tNodeView != null) {
                tNodeView.setSuspendLayoutState(false);
            }
        }
        return tryAddVideoViewToContainerAndStart;
    }

    private boolean isPreloadVideoValid(sor sorVar) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("539039c5", new Object[]{this, sorVar})).booleanValue() : (sorVar == null || sorVar.f33778a == null || (f = sorVar.f33778a.f()) == null || oec.a(f.getTag(R.id.fluid_sdk_tag_video_error), false)) ? false : true;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f12633a;
        private TNodeView b;
        private Uri c;
        private boolean d;
        private sor e;
        private soo f;
        private FluidInstance g;

        static {
            kge.a(-289908064);
        }

        public static /* synthetic */ Context a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3b6817cb", new Object[]{aVar}) : aVar.f12633a;
        }

        public static /* synthetic */ TNodeView b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("a7a4fb4f", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Uri c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("74ff9d48", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd138034", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ soo e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (soo) ipChange.ipc$dispatch("44cafa24", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ sor f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("2dd2bf82", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ FluidInstance g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FluidInstance) ipChange.ipc$dispatch("b8dba2f7", new Object[]{aVar}) : aVar.g;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2be1f90b", new Object[]{this, context});
            }
            this.f12633a = context;
            return this;
        }

        public a a(TNodeView tNodeView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ec9ffb30", new Object[]{this, tNodeView});
            }
            this.b = tNodeView;
            return this;
        }

        public a a(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7ca65c0a", new Object[]{this, uri});
            }
            this.c = uri;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c26dd617", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a a(sor sorVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e409232d", new Object[]{this, sorVar});
            }
            this.e = sorVar;
            return this;
        }

        public a a(soo sooVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a2ef190", new Object[]{this, sooVar});
            }
            this.f = sooVar;
            return this;
        }

        public a a(FluidInstance fluidInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5a62fd", new Object[]{this, fluidInstance});
            }
            this.g = fluidInstance;
            return this;
        }

        public PreRenderDWInstance a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PreRenderDWInstance) ipChange.ipc$dispatch("1e425b70", new Object[]{this}) : new PreRenderDWInstance(this);
        }
    }
}

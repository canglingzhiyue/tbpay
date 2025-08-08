package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.FrameManager;
import com.taobao.taobao.R;
import com.taobao.taolive.room.minilive.TaoLiveMiniLiveController;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.room.utils.w;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.utils.u;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.ddw;
import tb.iao;
import tb.ibt;
import tb.kge;
import tb.mto;
import tb.obw;
import tb.pkm;
import tb.pmd;
import tb.pnn;
import tb.poy;
import tb.poz;
import tb.ppa;
import tb.ppb;
import tb.pqj;

/* loaded from: classes8.dex */
public class TaoLiveShopCardController extends TaoLiveSingleRoomController implements com.alibaba.triver.triver_shop.container.shopLoft.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private static boolean globalInited;
    public FrameLayout frameLayout;
    private b.c mCallback;
    private boolean mIsStopped;
    private boolean mMute;
    public Runnable mRunnable;
    private int mSeqId;
    private TaoLiveMiniLiveController mTaoLiveMiniLiveController;
    public String videoViewToken;
    private boolean isShopCardPaused = false;
    public double aspectRatio = mto.a.GEO_NOT_SUPPORT;
    public boolean hasInitRoom = false;
    public boolean ignorePV = true;
    private BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.taobao.taolive.room.controller2.TaoLiveShopCardController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ab.c(TaoLiveShopCardController.access$000(), iao.NEXT_TAG_RECEIVER);
            if (!StringUtils.equals(intent.getAction(), "com.taobao.live.room.init")) {
                return;
            }
            long intExtra = intent.getIntExtra("seqId", -1);
            if (intExtra != -1 && intExtra != TaoLiveShopCardController.access$100(TaoLiveShopCardController.this)) {
                TaoLiveShopCardController.access$200(TaoLiveShopCardController.this, intent.getBooleanExtra("hasPlayerViewToken", false), false);
            }
            TaoLiveShopCardController taoLiveShopCardController = TaoLiveShopCardController.this;
            taoLiveShopCardController.hasInitRoom = true;
            taoLiveShopCardController.ignorePV = false;
        }
    };

    public static /* synthetic */ Object ipc$super(TaoLiveShopCardController taoLiveShopCardController, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1257959318) {
            super.onDidDisappear();
            return null;
        } else if (hashCode == -236809011) {
            super.onWillAppear();
            return null;
        } else if (hashCode != -159515158) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.createVideoFrame();
        }
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public String curLiveScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca9f8259", new Object[]{this}) : "shopCardLive";
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public void fetchCDNLiveInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb65f4", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    public static /* synthetic */ int access$100(TaoLiveShopCardController taoLiveShopCardController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("435dcba5", new Object[]{taoLiveShopCardController})).intValue() : taoLiveShopCardController.mSeqId;
    }

    public static /* synthetic */ void access$200(TaoLiveShopCardController taoLiveShopCardController, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657ab691", new Object[]{taoLiveShopCardController, new Boolean(z), new Boolean(z2)});
        } else {
            taoLiveShopCardController.internalDestroy(z, z2);
        }
    }

    static {
        kge.a(794155319);
        kge.a(-563039837);
        TAG = TaoLiveShopCardController.class.getSimpleName();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        String str = TAG;
        ab.c(str, "initWithData " + this);
        this.mContext = context;
        this.mCallback = cVar;
        initParams(jSONObject);
        this.itemView = LayoutInflater.from(context).inflate(R.layout.taolive_vh_livecard, (ViewGroup) null, false);
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.ATYPE, false, context);
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.BTYPE, false, context);
        init();
        changeLayoutParams(jSONObject);
    }

    private void changeLayoutParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e21e29", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("paddingBottom");
            this.frameLayout = (FrameLayout) this.itemView.findViewById(R.id.taolive_minilive_layout);
            if (StringUtils.isEmpty(string) || this.frameLayout == null) {
                return;
            }
            ((RelativeLayout.LayoutParams) this.frameLayout.getLayoutParams()).setMargins(0, 0, 0, v.a(string, 0));
        } catch (Exception unused) {
        }
    }

    private void initParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229e7e53", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.mRecModel = new TBLiveRecEngineV2.RecModel(true, this.mFrameContext.y());
            this.mFrameContext.a(this.mRecModel);
            this.mRecModel.liveId = jSONObject.getString("id");
            this.mRecModel.accountId = jSONObject.getString("userId");
            this.mRecModel.imageUrl = jSONObject.getString("coverPicUrl");
            this.mRecModel.initParams = new HashMap();
            this.mRecModel.initParams.put("id", this.mRecModel.liveId);
            this.mRecModel.initParams.put("userId", this.mRecModel.accountId);
            this.mRecModel.initParams.put(aw.PARAM_EMBED_VIEW_VISIBLE, "true");
            this.mRecModel.initParams.put("newShopCard", "true");
            this.aspectRatio = jSONObject.getDoubleValue(com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.ASPECT_RATIO);
        }
    }

    private void sendLiveBroadCast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76ba594", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        this.mSeqId = hashCode();
        intent.putExtra("seqId", this.mSeqId);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mGlobalContext = new com.taobao.taolive.sdk.controller.e(this.mContext);
        this.mGlobalContext.a(this.mContext);
        this.mGlobalContext.b(generateGlobalUnique());
        this.mFrameContext.a(this.mGlobalContext);
        this.mFrameContext.a((ppa) new ppb());
        if (!globalInited) {
            sendLiveBroadCast(this.mContext);
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
            com.taobao.taolive.room.dx.b.c().a(this.mContext);
            globalInited = true;
        }
        poz.Y(ai.d(this.mFrameContext), this.mGlobalContext);
        poz.a(this.mGlobalContext, new com.taobao.taolive.room.service.d());
        poz.f(true, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.h(false, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.b(false, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.q("shop_card2021", this.mGlobalContext);
        poz.p(true, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.q(true, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.U(null, this.mGlobalContext);
        checkDisplayCutout();
        this.mComponentManager = new FrameManager(this.mContext);
        this.mHandler = new com.taobao.taolive.sdk.model.f(this);
        this.mPerfomenceTrackManager = new pkm(true);
        this.mPerfomenceTrackManager.a(this.mFrameContext);
        initVideo();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(pmd.a().u().c());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.live.room.init");
        localBroadcastManager.registerReceiver(this.mReceiver, intentFilter);
        onWillAppear();
        onDidAppear();
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, new ISmallWindowStrategy() { // from class: com.taobao.taolive.room.controller2.TaoLiveShopCardController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
            public void a(View view, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
                } else {
                    com.taobao.taolive.room.utils.s.a(TaoLiveShopCardController.this.mContext, com.taobao.taolive.room.utils.c.a(str2), null, 67108864, false);
                }
            }
        });
        updateExpParams();
    }

    private String generateGlobalUnique() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23e54330", new Object[]{this});
        }
        String valueOf = !StringUtils.isEmpty(this.mRequestLiveId) ? String.valueOf(this.mRequestLiveId.hashCode()) : "";
        Random random = new Random();
        return valueOf + "_" + System.currentTimeMillis() + random.nextInt(1000);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public VideoFrame2 createVideoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame2) ipChange.ipc$dispatch("f67dfdea", new Object[]{this});
        }
        VideoFrame2 createVideoFrame = super.createVideoFrame();
        createVideoFrame.setOutControlGlobalMute(true);
        createVideoFrame.setVideoViewToken(com.taobao.taolive.sdk.ui.media.g.b());
        return createVideoFrame;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        String str = TAG;
        ab.c(str, "willAppear " + this);
        if (!u.av() || !this.hasInitRoom) {
            return;
        }
        ddw.a().a("com.taobao.taolive.room.shop.card.subScribe", null, this.mFrameContext != null ? this.mFrameContext.G() : null);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        String str = TAG;
        ab.c(str, "didAppear " + this);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        String str = TAG;
        ab.c(str, "willDisappear " + this);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        String str = TAG;
        ab.c(str, "didDisappear " + this);
        super.onDidDisappear();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        TaoLiveMiniLiveController taoLiveMiniLiveController;
        TaoLiveMiniLiveController taoLiveMiniLiveController2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        if (aa.bz() && this.mContext != null) {
            String a2 = w.a(this.mContext);
            ComponentName componentName = ((Activity) this.mContext).getComponentName();
            if (componentName != null) {
                String className = componentName.getClassName();
                if (!StringUtils.isEmpty(a2) && !StringUtils.isEmpty(className) && !a2.contains(className)) {
                    ab.c(TAG, "play not top Activity");
                    return;
                }
            }
        }
        this.isShopCardPaused = false;
        String str = TAG;
        ab.c(str, "play " + this);
        if (this.mIsDestroyed) {
            this.mIsDestroyed = false;
            init();
            if (this.mVideoFrame != null) {
                this.mComponentManager.addComponent(this.mVideoFrame);
                if (aa.aZ()) {
                    this.mVideoFrame.setVideoViewToken(com.taobao.taolive.sdk.ui.media.g.b());
                }
            }
            willAppear();
            didAppear();
            if (aa.bP() && (taoLiveMiniLiveController2 = this.mTaoLiveMiniLiveController) != null) {
                taoLiveMiniLiveController2.a(this.isShopCardPaused);
            }
        } else {
            if (aa.bP() && (taoLiveMiniLiveController = this.mTaoLiveMiniLiveController) != null) {
                taoLiveMiniLiveController.a(this.isShopCardPaused);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("status", "PLAY");
            ddw.a().a("com.taobao.taolive.room.minilive.video.status.from.embedview", hashMap, this.frameContextUnique);
        }
        if (this.mHandler == null || this.mRunnable == null || this.hasInitRoom) {
            return;
        }
        this.mHandler.postDelayed(this.mRunnable, 3000L);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        TaoLiveMiniLiveController taoLiveMiniLiveController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        String str = TAG;
        ab.c(str, "pause " + this);
        if (this.mHandler != null && this.mRunnable != null) {
            this.mHandler.removeCallbacks(this.mRunnable);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", "PAUSE");
        ddw.a().a("com.taobao.taolive.room.minilive.video.status.from.embedview", hashMap, this.frameContextUnique);
        this.isShopCardPaused = true;
        if (!aa.bP() || (taoLiveMiniLiveController = this.mTaoLiveMiniLiveController) == null) {
            return;
        }
        taoLiveMiniLiveController.a(this.isShopCardPaused);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        ab.c(TAG, "mute");
        this.mMute = z;
        ddw.a().a("com.taobao.taolive.room.minilive.video.mute.from.embedview", Boolean.valueOf(z), this.frameContextUnique);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else {
            ab.c(TAG, "startAnimation");
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        } else {
            ab.c(TAG, "endAnimation");
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        String str = TAG;
        ab.c(str, "onDestroyed " + this);
        internalDestroy(false, true);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        if (this.mFrameContext != null) {
            String str = "";
            String str2 = this.mRecModel != null ? this.mRecModel.liveId : str;
            if (this.mGlobalContext != null) {
                str = this.mGlobalContext.i();
            }
            String str3 = System.currentTimeMillis() + "_" + str2;
            if (!StringUtils.isEmpty(str)) {
                str3 = str + "_" + System.currentTimeMillis() + "_" + str2;
            }
            this.mFrameContext.c(str3);
        }
        if (this.mFrameContext == null || this.mFrameContext.B() == null) {
            return;
        }
        this.mFrameContext.B().c("LiveCard_Shop");
    }

    private void internalDestroy(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c21a04", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        onDestroy(z);
        TaoLiveMiniLiveController taoLiveMiniLiveController = this.mTaoLiveMiniLiveController;
        if (taoLiveMiniLiveController != null) {
            taoLiveMiniLiveController.c();
            this.mTaoLiveMiniLiveController = null;
        }
        if (!z2 || this.mIsStopped) {
            com.taobao.taolive.room.dx.b.c().b();
        }
        LocalBroadcastManager.getInstance(pmd.a().u().c()).unregisterReceiver(this.mReceiver);
        globalInited = false;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        ab.c(TAG, "onActivityResume");
        TaoLiveMiniLiveController taoLiveMiniLiveController = this.mTaoLiveMiniLiveController;
        if (taoLiveMiniLiveController != null) {
            taoLiveMiniLiveController.a();
        }
        this.mIsStopped = false;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        ab.c(TAG, "onActivityPause");
        TaoLiveMiniLiveController taoLiveMiniLiveController = this.mTaoLiveMiniLiveController;
        if (taoLiveMiniLiveController == null) {
            return;
        }
        taoLiveMiniLiveController.b();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        ab.c(TAG, "onActivityStop");
        this.mIsStopped = true;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.itemView;
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController, tb.ppq.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
            return;
        }
        String str2 = TAG;
        ab.c(str2, "onGetFandomInfoSuccess " + this);
        if (this.mTaoLiveMiniLiveController == null) {
            this.mTaoLiveMiniLiveController = new TaoLiveMiniLiveController((Activity) this.mContext, (ViewGroup) this.itemView, this.mRecModel.liveId, this.mRecModel.accountId, this.mRecModel.initParams, this.mFrameContext);
        }
        if (this.mVideoFrame != null) {
            this.mTaoLiveMiniLiveController.a(this.mVideoFrame, poy.ae(this.mFrameContext));
        }
        this.mTaoLiveMiniLiveController.a(9, (Object) null);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController, tb.ppq.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        TaoLiveMiniLiveController taoLiveMiniLiveController;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            return;
        }
        String str2 = TAG;
        ab.c(str2, "onGetVideoInfoSuccess " + this);
        if (this.mIsDestroyed || videoInfo == null || videoInfo.broadCaster == null || !(this.mContext instanceof Activity)) {
            return;
        }
        if (videoInfo.roomType == 13 || poy.b(videoInfo, this.mFrameContext)) {
            z = true;
        }
        if (!z && (StringUtils.isEmpty(this.mRequestLiveId) || (!StringUtils.isEmpty(videoInfo.liveId) && !videoInfo.liveId.equals(this.mRequestLiveId) && !StringUtils.isEmpty(videoInfo.topic) && !videoInfo.topic.equals(this.mRequestLiveId)))) {
            if (StringUtils.isEmpty(this.mRequestAccountId)) {
                return;
            }
            if (!StringUtils.isEmpty(videoInfo.broadCaster.accountId) && !videoInfo.broadCaster.accountId.equals(this.mRequestAccountId)) {
                return;
            }
        }
        final ibt ibtVar = null;
        this.mRequestLiveId = null;
        this.mRequestAccountId = null;
        this.mFrameContext.a(videoInfo);
        if (StringUtils.isEmpty(this.mRecModel.liveId)) {
            this.mRecModel.liveId = videoInfo.liveId;
        }
        if (StringUtils.isEmpty(this.mRecModel.accountId)) {
            this.mRecModel.accountId = videoInfo.broadCaster.accountId;
        }
        if (StringUtils.isEmpty(this.mRecModel.actionUrl)) {
            this.mRecModel.actionUrl = com.taobao.taolive.room.utils.c.d(videoInfo.nativeFeedDetailUrl, ag.SOURCE_UPDOWNSWITCH);
            String O = poy.O(this.mFrameContext);
            if (!StringUtils.isEmpty(O)) {
                String queryParameter = Uri.parse(O).getQueryParameter("liveAdParams");
                if (!StringUtils.isEmpty(queryParameter)) {
                    TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
                    recModel.actionUrl = this.mRecModel.actionUrl + "&liveAdParams=" + Uri.encode(queryParameter);
                }
            }
        }
        this.mLiveDataModel = new TBLiveBizDataModel();
        this.mLiveDataModel.mViewItemId = this.mRecModel.getViewItemId();
        this.mLiveDataModel.mVideoInfo = videoInfo;
        this.mLiveDataModel.mFandomInfo = null;
        this.mLiveDataModel.mRoomInfo = new ChatRoomInfo();
        this.mLiveDataModel.mRoomInfo.roomId = videoInfo.topic;
        this.mLiveDataModel.mRawData = str;
        this.mLiveDataModel.mInitParams = new HashMap();
        this.mLiveDataModel.mInitParams.putAll(this.mRecModel.initParams);
        this.mFrameContext.a(this.mRecModel.initParams);
        this.mLiveDataModel.mActionUrl = this.mRecModel.actionUrl;
        this.mLiveDataModel.perfomenceTrackManager = this.mPerfomenceTrackManager;
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this.mLiveDataModel);
        if (this.mLiveDataModel != null) {
            poy.a(this.mLiveDataModel, this.mLiveDataModel.mVideoInfo, this.mFrameContext);
        }
        if (this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) {
            ibtVar = this.mFrameContext.y().aJ_().a();
        }
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, new pnn() { // from class: com.taobao.taolive.room.controller2.TaoLiveShopCardController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnn
            public Map<String, String> getHeartParams() {
                JSONObject b;
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("ab918d32", new Object[]{this});
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(ai.d(TaoLiveShopCardController.this.mFrameContext, TaoLiveShopCardController.this.mContext));
                if (TaoLiveShopCardController.this.mLiveDataModel != null && TaoLiveShopCardController.this.mLiveDataModel.mInitParams != null && !StringUtils.isEmpty(TaoLiveShopCardController.this.mLiveDataModel.mInitParams.get(aw.PARAM_IGNORE_PV))) {
                    hashMap.put(aw.PARAM_IGNORE_PV, TaoLiveShopCardController.this.mLiveDataModel.mInitParams.get(aw.PARAM_IGNORE_PV));
                }
                if (TaoLiveShopCardController.this.mLiveDataModel != null && TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo != null && TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.broadCaster != null) {
                    hashMap.put("account_id", TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
                    hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.status));
                    hashMap.put("feed_id", TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.liveId);
                    hashMap.put("liveServerParams", TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.trackInfo);
                    hashMap.put("roomType", String.valueOf(TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.roomType));
                    hashMap.put("newRoomType", String.valueOf(TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.newRoomType));
                    hashMap.put("roomStatus", TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.roomStatus);
                    hashMap.put("streamStatus", TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.streamStatus);
                }
                ibt ibtVar2 = ibtVar;
                String str3 = "";
                String c = ibtVar2 != null ? ibtVar2.c() : str3;
                if (aa.az() && "tpp_88".equals(poz.p(com.taobao.taolive.room.utils.n.b(TaoLiveShopCardController.this.mFrameContext))) && !StringUtils.isEmpty(poy.Y(TaoLiveShopCardController.this.mFrameContext)) && (b = pqj.b(Uri.decode(poy.Y(TaoLiveShopCardController.this.mFrameContext)))) != null && b.getString("trackInfo") != null) {
                    c = b.getString("trackInfo");
                }
                hashMap.put("trackInfo", c);
                hashMap.put("clickid", poy.m(TaoLiveShopCardController.this.mFrameContext));
                hashMap.put("livesource", poz.p(com.taobao.taolive.room.utils.n.b(TaoLiveShopCardController.this.mFrameContext)));
                hashMap.put("entry_source", poy.R(TaoLiveShopCardController.this.mFrameContext));
                if ((!hashMap.containsKey("spm-url") || StringUtils.isEmpty((CharSequence) hashMap.get("spm-url"))) && (TaoLiveShopCardController.this.mFrameContext instanceof com.taobao.taolive.sdk.core.e)) {
                    hashMap.put("spm-url", TaoLiveShopCardController.this.mFrameContext.y().aJ_().a().b());
                }
                hashMap.put("isAD", String.valueOf(poy.w(TaoLiveShopCardController.this.mFrameContext) ? 1 : 0));
                hashMap.put("liveAdParams", Uri.encode(poy.Z(TaoLiveShopCardController.this.mFrameContext)));
                if (poy.q(TaoLiveShopCardController.this.mFrameContext) != null) {
                    i = 1;
                }
                hashMap.put("isAdTransParams", String.valueOf(i));
                hashMap.put("isChatRoom", String.valueOf(poy.b(TaoLiveShopCardController.this.mLiveDataModel, TaoLiveShopCardController.this.mFrameContext) ? 1 : 0));
                if (TaoLiveShopCardController.this.mLiveDataModel != null && TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo != null && TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.timeMovingPlayUrl != null) {
                    hashMap.put("scene", !StringUtils.isEmpty(TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.timeMovingPlayUrl) ? "smartpoint" : "default");
                }
                hashMap.put("kandianid", poy.ay(TaoLiveShopCardController.this.mFrameContext) + "_" + poy.C(TaoLiveShopCardController.this.mFrameContext));
                ibt ibtVar3 = ibtVar;
                hashMap.put(aw.PARAM_PVID, ibtVar3 != null ? ibtVar3.e() : str3);
                hashMap.put("watchid", poy.z(TaoLiveShopCardController.this.mFrameContext));
                if (com.taobao.taolive.sdk.utils.o.L() && TaoLiveShopCardController.this.mFrameContext != null) {
                    hashMap.put("liveToken", TaoLiveShopCardController.this.mFrameContext.j());
                }
                if (aa.ch()) {
                    hashMap.put("entryspm", "a2141.7631565.livecard2021.0");
                    hashMap.put("entryLiveSource", "shop_card2022");
                    hashMap.put("spm-url", "a2141.7631565.livecard2021.0");
                    hashMap.put("livesource", "shop_card2022");
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("spm-url", "a2141.7631565.livecard2021.0");
                hashMap2.put("clickid", poy.m(TaoLiveShopCardController.this.mFrameContext));
                hashMap2.put("livesource", "shop_card2022");
                hashMap2.put("isAD", String.valueOf(poy.w(TaoLiveShopCardController.this.mFrameContext) ? 1 : 0));
                hashMap2.put("entryLiveSource", "shop_card2022");
                hashMap2.put("entryspm", "a2141.7631565.livecard2021.0");
                hashMap2.put("watchid", poy.z(TaoLiveShopCardController.this.mFrameContext));
                ibt ibtVar4 = ibtVar;
                if (ibtVar4 != null) {
                    str3 = ibtVar4.e();
                }
                hashMap2.put(aw.PARAM_PVID, str3);
                hashMap2.put("kandianid", poy.ay(TaoLiveShopCardController.this.mFrameContext) + "_" + poy.C(TaoLiveShopCardController.this.mFrameContext));
                hashMap.put("liveClientParams", hashMap2.toString());
                return hashMap;
            }
        });
        this.mComponentManager.onBindData(this.mLiveDataModel);
        if (this.mTaoLiveMiniLiveController == null) {
            this.mTaoLiveMiniLiveController = new TaoLiveMiniLiveController((Activity) this.mContext, (ViewGroup) this.itemView, this.mRecModel.liveId, this.mRecModel.accountId, this.mRecModel.initParams, this.mFrameContext);
        }
        if (aa.bP() && (taoLiveMiniLiveController = this.mTaoLiveMiniLiveController) != null) {
            taoLiveMiniLiveController.a(this.isShopCardPaused);
        }
        if (this.mVideoFrame != null) {
            this.mTaoLiveMiniLiveController.a(this.mVideoFrame, poy.ae(this.mFrameContext));
            this.mTaoLiveMiniLiveController.b(this.mMute);
        }
        this.mTaoLiveMiniLiveController.a(1, this.mLiveDataModel);
        if (this.mVideoFrame != null && videoInfo.liveConfigForStream != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("__livePushControlInfo", videoInfo.liveConfigForStream);
            this.mVideoFrame.callWithMsg(hashMap);
        }
        this.mRunnable = new Runnable() { // from class: com.taobao.taolive.room.controller2.TaoLiveShopCardController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TaoLiveShopCardController.this.mLiveDataModel == null || TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo == null) {
                } else {
                    if (TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.status != 4 && TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.status != 0 && TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.status != 3 && TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.status != 1) {
                        return;
                    }
                    com.taobao.taolive.sdk.core.j.a(TaoLiveShopCardController.this.mFrameContext, LiveEmbedType.SHOP_CARD);
                    if (!u.av() || TaoLiveShopCardController.this.aspectRatio <= aa.aL() || TaoLiveShopCardController.this.hasInitRoom) {
                        return;
                    }
                    if (TaoLiveShopCardController.this.mFrameContext != null) {
                        com.taobao.taolive.sdk.core.j.a(TaoLiveShopCardController.this.mFrameContext, TaoLiveShopCardController.this.mFrameContext.j(), TaoLiveShopCardController.this.mLiveDataModel);
                    }
                    try {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("feed_id", TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.liveId);
                        hashMap2.put("account_id", TaoLiveShopCardController.this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
                        hashMap2.put("spm-url", "a2141.7631565.livecard2021.0");
                        hashMap2.put("clickid", poy.m(TaoLiveShopCardController.this.mFrameContext));
                        hashMap2.put("livesource", "shop_card2022");
                        poz.L("shop_card2022", TaoLiveShopCardController.this.mGlobalContext);
                        if (poy.w(TaoLiveShopCardController.this.mFrameContext)) {
                            i = 1;
                        }
                        hashMap2.put("isAD", String.valueOf(i));
                        hashMap2.put("entryLiveSource", "shop_card2022");
                        hashMap2.put("entryspm", "a2141.7631565.livecard2021.0");
                        hashMap2.put("watchid", poy.z(TaoLiveShopCardController.this.mFrameContext));
                        hashMap2.put(aw.PARAM_PVID, ibtVar != null ? ibtVar.e() : "");
                        hashMap2.put("kandianid", poy.ay(TaoLiveShopCardController.this.mFrameContext) + "_" + poy.C(TaoLiveShopCardController.this.mFrameContext));
                        hashMap2.put("cardsize", String.valueOf(TaoLiveShopCardController.this.aspectRatio));
                        ai.a((com.taobao.alilive.aliliveframework.frame.a) TaoLiveShopCardController.this.mFrameContext, "shoplivecard_show_android", (HashMap<String, String>) hashMap2);
                    } catch (Exception unused) {
                    }
                }
            }
        };
        if (this.mHandler == null || this.mRunnable == null || this.hasInitRoom) {
            return;
        }
        this.mHandler.postDelayed(this.mRunnable, 3000L);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController, tb.ppq.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
            return;
        }
        ab.c(TAG, "onGetVideoInfoFail");
        if (this.mTaoLiveMiniLiveController == null) {
            this.mTaoLiveMiniLiveController = new TaoLiveMiniLiveController((Activity) this.mContext, (ViewGroup) this.itemView, this.mRecModel.liveId, this.mRecModel.accountId, this.mRecModel.initParams, this.mFrameContext);
        }
        if (this.mVideoFrame != null) {
            this.mTaoLiveMiniLiveController.a(this.mVideoFrame, poy.ae(this.mFrameContext));
        }
        this.mTaoLiveMiniLiveController.a(2, (Object) null);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public void preloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637f4f79", new Object[]{this});
        } else if (!aa.bl()) {
        } else {
            setVideoCoverDelay();
        }
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController, tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.minilive.video.rendering.start", "com.taobao.taolive.room.minilive.video.pause", "com.taobao.taolive.room.minilive.video.error", "com.taobao.taolive.room.minilive.video.end", "com.taobao.taolive.room.minilive.video.leave", "com.taobao.taolive.room.minilive.data.error", "com.taobao.taolive.room.shop.card.subScribe"};
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController, tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.minilive.video.rendering.start".equals(str)) {
            b.c cVar = this.mCallback;
            if (cVar == null) {
                return;
            }
            cVar.a("onPlay", null);
            this.videoViewToken = (String) obj;
            if (StringUtils.isEmpty(this.videoViewToken)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_HOME_LIVE_ROOM_STATUS);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playerViewToken", (Object) this.videoViewToken);
            jSONObject.put("params", (Object) jSONObject2);
            this.mCallback.a(b.c.EVENT_ON_MESSAGE, jSONObject);
        } else if ("com.taobao.taolive.room.minilive.video.pause".equals(str)) {
            b.c cVar2 = this.mCallback;
            if (cVar2 == null) {
                return;
            }
            cVar2.a("onPause", null);
        } else if ("com.taobao.taolive.room.minilive.video.error".equals(str)) {
            b.c cVar3 = this.mCallback;
            if (cVar3 == null) {
                return;
            }
            cVar3.a("onError", null);
        } else if ("com.taobao.taolive.room.minilive.video.end".equals(str)) {
            b.c cVar4 = this.mCallback;
            if (cVar4 == null) {
                return;
            }
            cVar4.a("onFinish", null);
        } else if ("com.taobao.taolive.room.minilive.video.leave".equals(str)) {
            if (this.mCallback == null) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_HOME_LIVE_ROOM_STATUS);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("status", (Object) com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_LEAVE);
            jSONObject3.put("params", (Object) jSONObject4);
            this.mCallback.a(b.c.EVENT_ON_MESSAGE, jSONObject3);
        } else if ("com.taobao.taolive.room.minilive.data.error".equals(str)) {
            if (this.mCallback == null) {
                return;
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("name", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_HOME_LIVE_ROOM_STATUS);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("status", (Object) "DATAERROR");
            jSONObject5.put("params", (Object) jSONObject6);
            this.mCallback.a(b.c.EVENT_ON_MESSAGE, jSONObject5);
        } else if (!"com.taobao.taolive.room.shop.card.subScribe".equals(str) || this.mCallback == null) {
        } else {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("name", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_HOME_LIVE_ROOM_STATUS);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put(aw.PARAM_IGNORE_PV, (Object) Boolean.valueOf(this.ignorePV));
            jSONObject8.put("playerViewToken", (Object) this.videoViewToken);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("liveTransParams", (Object) jSONObject8);
            jSONObject7.put("params", (Object) jSONObject9);
            this.mCallback.a(b.c.EVENT_ON_MESSAGE, jSONObject7);
        }
    }

    private void updateExpParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b0b6c1", new Object[]{this});
            return;
        }
        String R = poy.R(this.mFrameContext) != null ? poy.R(this.mFrameContext) : "";
        if (this.mVideoFrame == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = "entryLiveSource=" + R + ",videoActionType=init,vod_scenario=bigCard";
        if (pmd.a().m() != null) {
            pmd.a().m().a("updatePlayExValue", "shop2F updatePlayExValue = " + str);
        }
        hashMap.put(obw.KEY_VIDEO_UPDATE_PARAMS, str);
        this.mVideoFrame.callWithMsg(hashMap);
    }
}

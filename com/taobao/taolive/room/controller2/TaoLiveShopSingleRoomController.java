package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.FrameManager;
import com.taobao.alilive.aliliveframework.frame.IComponent;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taobao.R;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ak;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.w;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.v;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.kge;
import tb.obw;
import tb.pkm;
import tb.pmd;
import tb.poy;
import tb.poz;
import tb.ppa;
import tb.ppb;
import tb.sst;
import tb.xkw;

/* loaded from: classes8.dex */
public class TaoLiveShopSingleRoomController extends TaoLiveSingleRoomController implements com.alibaba.triver.triver_shop.container.shopLoft.b, g.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private static boolean globalInited;
    private boolean isLiveMute;
    private b.c mCallback;
    public boolean mEnableLifeCycle;
    private boolean mIsAnchorInfoShowing;
    private boolean mIsGoodsListShowing;
    private boolean mIsStopped;
    private JSONObject mJsonObject;
    private Map<String, String> mPageProperties;
    private TBLiveRecEngineV2.RecModel mRecModelOld;
    private BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.taobao.taolive.room.controller2.TaoLiveShopSingleRoomController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!TextUtils.equals(intent.getAction(), "com.taobao.live.room.init")) {
            } else {
                long intExtra = intent.getIntExtra("seqId", -1);
                if (intExtra == -1 || intExtra == TaoLiveShopSingleRoomController.access$000(TaoLiveShopSingleRoomController.this)) {
                    return;
                }
                TaoLiveShopSingleRoomController.access$100(TaoLiveShopSingleRoomController.this, false);
            }
        }
    };
    private int mSeqId;
    private String mVideoViewToken;

    public static /* synthetic */ Object ipc$super(TaoLiveShopSingleRoomController taoLiveShopSingleRoomController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case -159515158:
                return super.createVideoFrame();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public String curLiveScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca9f8259", new Object[]{this}) : "shop2fLive";
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "Page_TaobaoLiveWatch";
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    public static /* synthetic */ int access$000(TaoLiveShopSingleRoomController taoLiveShopSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c810ae73", new Object[]{taoLiveShopSingleRoomController})).intValue() : taoLiveShopSingleRoomController.mSeqId;
    }

    public static /* synthetic */ void access$100(TaoLiveShopSingleRoomController taoLiveShopSingleRoomController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad452d5", new Object[]{taoLiveShopSingleRoomController, new Boolean(z)});
        } else {
            taoLiveShopSingleRoomController.internalDestroy(z);
        }
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("682607c7", new Object[0]) : TAG;
    }

    static {
        kge.a(1595921258);
        kge.a(-563039837);
        kge.a(-609918999);
        TAG = TaoLiveShopSingleRoomController.class.getSimpleName();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        ab.c(TAG, com.taobao.android.weex_framework.adapter.e.RECORD_INIT_WITH_DATA);
        this.mContext = context;
        this.mCallback = cVar;
        this.mJsonObject = jSONObject;
        initParams(jSONObject);
        this.itemView = LayoutInflater.from(context).inflate(R.layout.taolive_vh_liveroom, (ViewGroup) null, false);
        this.mRoomLayout = (ViewGroup) this.itemView.findViewById(R.id.taolive_room_layout);
        init();
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
        this.mGlobalContext.a(this.isLiveMute, true);
        this.mGlobalContext.a(this);
        this.mFrameContext.a(this.mGlobalContext);
        this.mFrameContext.a((ppa) new ppb());
        poz.Y(ai.d(this.mFrameContext), this.mGlobalContext);
        String str = this.mRecModel.initParams != null ? this.mRecModel.initParams.get(aw.PARAM_PLAY_VIEW_TOKEN) : null;
        if (!TextUtils.isEmpty(str) && !com.taobao.taolive.sdk.ui.media.g.a().d(str)) {
            str = null;
        }
        this.mVideoViewToken = str;
        if (!globalInited) {
            h.a(this.mContext);
            this.mEnableLifeCycle = v.b.a("goodlist", "shopLoftCycle", true);
            if ((this.mContext instanceof FragmentActivity) && this.mEnableLifeCycle) {
                ab.c(TAG, "init, initUltronServerConfig.");
                ((FragmentActivity) this.mContext).getLifecycle().addObserver(new ShopLoftLifeCycle((FragmentActivity) this.mContext));
            }
            if (!aa.bK()) {
                sendLiveBroadCast(this.mContext, !TextUtils.isEmpty(str));
            }
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
            com.taobao.taolive.room.dx.b.c().a(this.mContext);
            resetDisplayCutout();
            checkDisplayCutout();
            globalInited = true;
        }
        poz.a(this.mGlobalContext, new com.taobao.taolive.room.service.d());
        poz.T(null, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        poz.b(true, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        poz.f(true, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.h(false, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.p(true, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.q(true, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        poz.U(null, this.mGlobalContext);
        this.mComponentManager = new FrameManager(this.mContext);
        this.mHandler = new com.taobao.taolive.sdk.model.f(this);
        this.mPerfomenceTrackManager = new pkm(true);
        this.mPerfomenceTrackManager.a(this.mFrameContext);
        initVideo();
        if (!TextUtils.isEmpty(str) && this.mVideoFrame != null) {
            this.mVideoFrame.setVideoViewToken(str);
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(pmd.a().u().c());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.live.room.init");
        localBroadcastManager.registerReceiver(this.mReceiver, intentFilter);
        updateExpParams();
        if (!as.f() || !(this.mContext instanceof Activity) || ((Activity) this.mContext).getWindow() == null) {
            return;
        }
        ((Activity) this.mContext).getWindow().addFlags(128);
    }

    @Override // com.taobao.taolive.sdk.core.g.a
    public void onGlobalLiveRoomMuteChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isLiveMute = z;
        if (this.mCallback == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isMuted", (Object) Boolean.valueOf(z));
        this.mCallback.a(b.c.EVENT_ON_MUTE_STATUS_CHANGED, jSONObject);
    }

    private void resetDisplayCutout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a1a126", new Object[]{this});
        } else if (!aa.bM()) {
        } else {
            poz.m(false, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
            poz.b(0, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
            poz.c(0, (com.taobao.taolive.sdk.core.g) this.mGlobalContext);
        }
    }

    private String generateGlobalUnique() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23e54330", new Object[]{this});
        }
        String valueOf = !TextUtils.isEmpty(this.mRequestLiveId) ? String.valueOf(this.mRequestLiveId.hashCode()) : "";
        Random random = new Random();
        return valueOf + "_" + System.currentTimeMillis() + random.nextInt(1000);
    }

    private void sendLiveBroadCast(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4609bfc0", new Object[]{this, context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        this.mSeqId = hashCode();
        intent.putExtra("seqId", this.mSeqId);
        intent.putExtra("hasPlayerViewToken", z);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
    }

    private void initParams(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229e7e53", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.mRecModel = new TBLiveRecEngineV2.RecModel(true, this.mFrameContext.y());
            this.mFrameContext.a(this.mRecModel);
            this.mRecModel.liveId = jSONObject.getString("id");
            this.mRecModel.accountId = jSONObject.getString("sellerId");
            this.mRecModel.imageUrl = jSONObject.getString("coverPicUrl");
            this.mRecModel.initParams = new HashMap();
            this.mRecModel.initParams.put("id", this.mRecModel.liveId);
            this.mRecModel.initParams.put("userId", this.mRecModel.accountId);
            this.mRecModel.initParams.put(aw.PARAM_PLAY_VIEW_TOKEN, jSONObject.getString("playerViewToken"));
            this.mRecModel.initParams.put("timeMoveId", jSONObject.getString("timeMoveId"));
            this.mRecModel.initParams.put(aw.PARAM_ITEM_HOLD_TYPE, jSONObject.getString(aw.PARAM_ITEM_HOLD_TYPE));
            this.mRecModel.initParams.put(aw.PARAM_ITEM_IDS, jSONObject.getString(aw.PARAM_ITEM_IDS));
            this.mRecModel.initParams.put(aw.PARAM_CATEGORY_ID, jSONObject.getString(aw.PARAM_CATEGORY_ID));
            this.isLiveMute = com.taobao.taolive.room.utils.v.e(jSONObject.getString("initMuteStatus"));
            if (u.av() && (jSONObject2 = jSONObject.getJSONObject("liveTransParams")) != null) {
                this.mRecModel.initParams.put(aw.PARAM_IGNORE_PV, jSONObject2.getString(aw.PARAM_IGNORE_PV));
            }
            String string = jSONObject.getString("livesource");
            if (TextUtils.isEmpty(string)) {
                string = "shop2F";
            }
            this.mRecModel.initParams.put("livesource", string);
            String string2 = jSONObject.getString("roomStatus");
            String string3 = jSONObject.getString("itemId");
            if (TextUtils.isEmpty(string3)) {
                return;
            }
            if (aa.aC()) {
                this.mRecModel.initParams.put(aw.PARAM_SJSD_ITEM_ID, string3);
            } else if ("1".equals(string2)) {
                this.mRecModel.initParams.put(aw.PARAM_SJSD_ITEM_ID, string3);
            } else if (!"2".equals(string2)) {
            } else {
                this.mRecModel.initParams.put(aw.PARAM_TIMEMOVING_ITEM_ID, string3);
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        ab.c(TAG, "willAppear");
        if (this.mContext == null) {
            return;
        }
        if (aa.bK() && (jSONObject2 = this.mJsonObject) != null && jSONObject2.getIntValue("nativeIndex") == 0) {
            sendLiveBroadCast(this.mContext, true ^ TextUtils.isEmpty(this.mVideoViewToken));
        }
        if (aa.bm()) {
            this.mIsDestroyed = false;
        }
        if (this.mComponentManager.getComponentByName(this.mVideoFrame.getClass().getSimpleName()) == null && this.mVideoFrame != null && aa.bn()) {
            this.mComponentManager.addComponent(this.mVideoFrame);
        }
        if (aa.by() && this.mRecModel != null) {
            this.mRecModel.supportPreLoad = 0;
        }
        super.onWillAppear();
        if (aa.bu() && (jSONObject = this.mJsonObject) != null && jSONObject.getIntValue("nativeIndex") == 0) {
            poz.a(ag.SPM_TAOLIVE_WATCH_4_SHOPCARD, this.mGlobalContext);
        }
        JSONObject jSONObject3 = this.mJsonObject;
        if (jSONObject3 != null) {
            String str = null;
            if (jSONObject3.getJSONObject("spmParams") != null && this.mJsonObject.getJSONObject("spmParams").getJSONObject("args") != null) {
                str = this.mJsonObject.getJSONObject("spmParams").getJSONObject("args").getString("entryBizScene");
            }
            this.mRecModel.initParams.put("livePointTab3", str);
            if ("livePointTab3".equals(str)) {
                poz.a("a2141.b60453322", this.mGlobalContext);
                this.mRecModel.initParams.put("spm", "a2141.b60453322");
                if (this.mJsonObject.getString("liveShopUrl") != null) {
                    this.mRecModel.initParams.put("shop2fSkipTab3Url", this.mJsonObject.getString("liveShopUrl"));
                }
            }
        }
        com.taobao.taolive.movehighlight.utils.f.a().a(System.currentTimeMillis());
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, new ISmallWindowStrategy() { // from class: com.taobao.taolive.room.controller2.TaoLiveShopSingleRoomController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
            public void a(View view, String str2, String str3, String str4) {
                String str5;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str2, str3, str4});
                    return;
                }
                if (TaoLiveShopSingleRoomController.this.mRecModel == null || TextUtils.isEmpty(TaoLiveShopSingleRoomController.this.mRecModel.liveId)) {
                    str5 = null;
                } else {
                    str5 = com.taobao.taolive.room.utils.c.a(TaoLiveShopSingleRoomController.this.mRecModel.liveId);
                    if (TaoLiveShopSingleRoomController.this.mRecModel.initParams != null) {
                        String str6 = TaoLiveShopSingleRoomController.this.mRecModel.initParams.get(aw.PARAM_SJSD_ITEM_ID);
                        if (!TextUtils.isEmpty(str6)) {
                            str5 = str5 + "&" + aw.PARAM_SJSD_ITEM_ID + "=" + str6 + "&productType = timemove";
                        }
                    }
                }
                if (!aa.bo() || TextUtils.isEmpty(str5)) {
                    com.taobao.taolive.room.utils.s.a(TaoLiveShopSingleRoomController.this.mContext, com.taobao.taolive.room.utils.c.a(str3), null, 67108864, false);
                } else {
                    com.taobao.taolive.room.utils.s.a(TaoLiveShopSingleRoomController.this.mContext, str5, null, 67108864, false);
                }
            }
        });
        if (this.mVideoFrame == null) {
            return;
        }
        this.mVideoFrame.reattach(this.mContext);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        ab.c(TAG, "didAppear");
        super.onDidAppear();
        JSONObject jSONObject2 = this.mJsonObject;
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("livesource");
            if (TextUtils.isEmpty(string)) {
                string = "shop2F";
            }
            if (com.taobao.taolive.sdk.utils.o.l()) {
                poz.s(this.mJsonObject.getString("entrySpm"), this.mGlobalContext);
                poz.q(string, this.mGlobalContext);
            } else {
                poz.q("shop2F", this.mGlobalContext);
            }
            JSONObject jSONObject3 = this.mJsonObject.getJSONObject("spmParams");
            if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("args")) != null) {
                Integer integer = jSONObject.getInteger("cardnum");
                String string2 = this.mJsonObject.getString(aw.PARAM_PRODUCT_TYPE);
                if (integer != null && integer.intValue() == 0 && RecModel.MEDIA_TYPE_TIMEMOVE.equals(string2)) {
                    this.entryByShop2F = true;
                }
            }
        }
        if (this.mContext == null) {
            return;
        }
        ViewGroup a2 = poz.a(this.mContext, this.mGlobalContext);
        if (a2 != null && a2.getParent() != null) {
            ((ViewGroup) a2.getParent()).removeView(a2);
        }
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        frameLayout.setId(R.id.taolive_global_layout);
        ((FrameLayout) this.itemView).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        ab.c(TAG, "willDisappear");
        this.mPageProperties = ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, (Object) this.mContext, (String) null, (String) null, (String) null, (String) null, true, false);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        ab.c(TAG, "didDisappear");
        super.onDidDisappear();
        if (this.mRecModel == null || this.mRecModelOld == null) {
            return;
        }
        this.mRecModel.liveId = this.mRecModelOld.liveId;
        this.mRecModel.initParams = new HashMap();
        this.mRecModel.initParams.putAll(this.mRecModelOld.initParams);
        this.mRecModelOld = null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isLiveMute = z;
        if (sst.a()) {
            if (this.mFrameContext.M() == null) {
                return;
            }
            this.mFrameContext.M().a(this.isLiveMute);
        } else if (this.mFrameContext.A() == null || this.mFrameContext.A().e() == null) {
        } else {
            this.mFrameContext.A().e().a(this.isLiveMute);
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        String a2 = w.a(this.mContext);
        String str = TAG;
        ab.c(str, "onActivityResume:" + a2);
        if ((com.taobao.taolive.room.utils.v.f(a2) || !a2.contains("ShopLoftActivity")) && !aa.bx()) {
            return;
        }
        if (this.mIsDestroyed) {
            this.mIsDestroyed = false;
            init();
            if (this.mVideoFrame != null) {
                this.mComponentManager.addComponent(this.mVideoFrame);
            }
            willAppear();
            didAppear();
        }
        onResume();
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
        this.mPageProperties = ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, (Object) this.mContext, (String) null, (String) null, (String) null, (String) null, true, false);
        onPause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        ab.c(TAG, "onActivityStop");
        if (this.mIsDestroyed) {
            return;
        }
        onStop();
        this.mIsStopped = true;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16970404", new Object[]{this}) : this.mPageProperties;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        this.mPageProperties = ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, (Object) this.mContext, (String) null, (String) null, (String) null, (String) null, true, false);
        ab.c(TAG, "onDestroyed");
        internalDestroy(true);
        this.mGlobalContext.c();
        this.mContext = null;
        this.mCallback = null;
    }

    private void internalDestroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41dcf2d0", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mVideoFrame != null) {
            this.mVideoFrame.onDidDisappear();
        }
        this.mGlobalContext.b(this);
        onDestroy();
        LocalBroadcastManager.getInstance(pmd.a().u().c()).unregisterReceiver(this.mReceiver);
        if (!z || this.mIsStopped) {
            com.taobao.taolive.room.dx.b.c().b();
            globalInited = false;
        }
        if (!as.f() || !(this.mContext instanceof Activity) || ((Activity) this.mContext).getWindow() == null) {
            return;
        }
        ((Activity) this.mContext).getWindow().clearFlags(128);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mIsGoodsListShowing = false;
        this.mIsAnchorInfoShowing = false;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.itemView;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        VideoInfo videoInfo = this.mLiveDataModel != null ? this.mLiveDataModel.mVideoInfo : null;
        if (videoInfo == null || videoInfo.broadCaster == null || videoInfo.shareUrlDO == null || !(this.mContext instanceof Activity)) {
            return null;
        }
        String str = videoInfo.broadCaster.accountName;
        return (ShareContent) pmd.a().p().b((Activity) this.mContext, TextUtils.isEmpty(aa.ae()) ? this.mContext.getString(R.string.taolive_share_live, str, videoInfo.title) : String.format(aa.ae(), str, videoInfo.title), TextUtils.isEmpty(videoInfo.shareUrlDO.bgImgUrl) ? videoInfo.coverImg : videoInfo.shareUrlDO.bgImgUrl, videoInfo.liveId, videoInfo.topic, false, videoInfo.shareUrlDO.shareUrl, videoInfo.shareUrlDO.shareCardUrl, "zhibo", null);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController, tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, xkw.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, "com.taobao.taolive.room.addcart_for_showcase", "com.taobao.taolive.room.mediaplatform_switch_room", "com.taobao.taolive.room.enable_updown_switch", "com.taobao.taolive.room.disable_updown_switch", "com.taobao.taolive.room.goods_list_showing", FullScreenFrame.EVENT_BACK_TO_LIVE, "com.taobao.taolive.room.replay_backToLive", xkw.EVENT_NEW_PROFILE__IS_SHOWING, "com.taobao.taolive.room.enter_ut_track"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController, tb.ddv
    public void onEvent(String str, Object obj) {
        b.c cVar;
        b.c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.goods_list_showing".equals(str)) {
            if (!(obj instanceof Boolean)) {
                return;
            }
            this.mIsGoodsListShowing = ((Boolean) obj).booleanValue();
        } else if (xkw.EVENT_NEW_PROFILE__IS_SHOWING.equals(str)) {
            if (!(obj instanceof Boolean) || !aa.bA()) {
                return;
            }
            this.mIsAnchorInfoShowing = ((Boolean) obj).booleanValue();
            String str2 = TAG;
            com.taobao.taolive.sdk.utils.q.b(str2, "赋值 mIsProfilePageShowing：" + this.mIsAnchorInfoShowing);
        } else if ("com.taobao.taolive.room.enable_updown_switch".equals(str)) {
            if (this.mIsGoodsListShowing || this.mIsAnchorInfoShowing || (cVar2 = this.mCallback) == null) {
                return;
            }
            cVar2.a(b.c.EVENT_ON_SCROLL_ENABLE, null);
        } else if ("com.taobao.taolive.room.disable_updown_switch".equals(str)) {
            b.c cVar3 = this.mCallback;
            if (cVar3 == null) {
                return;
            }
            cVar3.a(b.c.EVENT_ON_SCROLL_DISABLE, null);
        } else if ("com.taobao.taolive.room.mediaplatform_switch_room".equals(str)) {
            if (!(obj instanceof Map)) {
                return;
            }
            Map map = (Map) obj;
            String str3 = (String) map.get("url");
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            Map<String, String> b = ak.b(Uri.parse(str3));
            if (aa.cA() && (cVar = this.mCallback) != null) {
                cVar.a(b.c.EVENT_ON_SCROLL_ENABLE, null);
            }
            if (b == 0) {
                return;
            }
            if (aa.bb()) {
                onDidDisappear();
            } else {
                onDestroy();
                com.taobao.taolive.sdk.ui.media.d e = com.taobao.taolive.sdk.playcontrol.c.e(this.mFrameContext);
                if (e != null) {
                    e.o();
                }
            }
            if (aa.bw()) {
                b.put("highlightSignByRePlay", map.get("highlightSignByRePlay"));
            }
            this.mIsDestroyed = false;
            this.mRecModel = new TBLiveRecEngineV2.RecModel(true, this.mFrameContext.y());
            this.mRecModel.initParams = b;
            this.mRecModel.liveId = this.mRecModel.initParams.get("id");
            this.mRecModel.accountId = this.mRecModel.initParams.get("userId");
            if (!aa.bb() && this.mVideoFrame != null) {
                this.mComponentManager.addComponent(this.mVideoFrame);
            }
            willAppear();
            didAppear();
            procInnerPageTrack();
        } else if (FullScreenFrame.EVENT_BACK_TO_LIVE.equals(str)) {
            backToLive(null);
            ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, ag.CALCK_SHIFTTIME, (String) null);
        } else if ("com.taobao.taolive.room.replay_backToLive".equals(str)) {
            if (!(obj instanceof String)) {
                return;
            }
            backToLive((String) obj);
        } else if ("com.taobao.taolive.room.enter_ut_track".equals(str)) {
            this.mPageProperties = ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, (Object) this.mContext, (String) null, (String) null, (String) null, (String) null, true, false);
        } else {
            super.onEvent(str, obj);
        }
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public VideoFrame2 createVideoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame2) ipChange.ipc$dispatch("f67dfdea", new Object[]{this});
        }
        VideoFrame2 createVideoFrame = super.createVideoFrame();
        if (!aa.bF()) {
            createVideoFrame.setOutControlGlobalMute(true);
        }
        return createVideoFrame;
    }

    private void backToLive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0cb1df", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
        if (com.taobao.taolive.sdk.core.j.d(this.mFrameContext)) {
            return;
        }
        if (aa.ar()) {
            procInnerPageTrack();
        }
        if (aa.bb()) {
            onDidDisappear();
        } else {
            onDestroy();
            com.taobao.taolive.sdk.ui.media.d e = com.taobao.taolive.sdk.playcontrol.c.e(this.mFrameContext);
            if (e != null) {
                e.o();
            }
        }
        this.mIsDestroyed = false;
        this.mRecModelOld = new TBLiveRecEngineV2.RecModel(true, this.mFrameContext.y());
        this.mRecModelOld.liveId = this.mRecModel.liveId;
        this.mRecModelOld.initParams = new HashMap();
        this.mRecModelOld.initParams.putAll(this.mRecModel.initParams);
        if (!TextUtils.isEmpty(str)) {
            this.mRecModel.liveId = str;
        }
        if (this.mRecModel.initParams != null) {
            this.mRecModel.initParams.put(aw.PARAM_BACK_TO_LIVE, "true");
            this.mRecModel.initParams.remove("bubbleGoodInfoJson");
            this.mRecModel.initParams.remove(aw.PARAM_SJSD_ITEM_ID);
            this.mRecModel.initParams.remove(aw.PARAM_TIMEMOVING_ITEM_ID);
            this.mRecModel.initParams.remove(aw.PARAM_TIMEMOVE_KEYPOINTID);
            this.mRecModel.initParams.remove("timePointPlayUrl");
            this.mRecModel.initParams.remove(aw.PARAM_CUSTOM_PLAY_CTRL);
            this.mRecModel.initParams.remove(aw.PARAM_PLAY_VIEW_TOKEN);
            if (!TextUtils.isEmpty(str)) {
                this.mRecModel.initParams.put("id", str);
            }
            this.mRecModel.initParams.remove("timeMovingSpfPlayVideo");
            this.mRecModel.initParams.remove("timeMovingPcmIdParam");
            this.mRecModel.initParams.remove(aw.PARAM_PRODUCT_TYPE);
            this.mRecModel.initParams.remove("highlightSignByRePlay");
            if (aa.aD()) {
                this.mRecModel.liveUrlList = null;
            }
        }
        if (!aa.bb() && this.mVideoFrame != null) {
            this.mComponentManager.addComponent(this.mVideoFrame);
        }
        willAppear();
        didAppear();
    }

    private void procInnerPageTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7966d9c3", new Object[]{this});
            return;
        }
        ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, (Object) this.mContext, "Page_TaobaoLiveWatch");
        ai.b(this.mFrameContext, this.mContext);
        ai.c(this.mFrameContext, this.mContext);
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public void showWidgets(String str) {
        b.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b199de03", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            if (this.mRoomLayout == null) {
                return;
            }
            this.mRoomLayout.setVisibility(0);
        } else if ("close".equals(str) && (cVar = this.mCallback) != null) {
            cVar.a(b.c.EVENT_ON_SHOW_BAR, null);
        } else {
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.show();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName == null) {
                return;
            }
            viewByName.setVisibility(0);
        }
    }

    @Override // com.taobao.taolive.room.controller2.TaoLiveSingleRoomController
    public void hideWidgets(String str) {
        b.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df605dde", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            if (this.mRoomLayout == null) {
                return;
            }
            this.mRoomLayout.setVisibility(8);
        } else if ("close".equals(str) && (cVar = this.mCallback) != null) {
            cVar.a(b.c.EVENT_ON_HIDE_BAR, null);
        } else {
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.hide();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName == null) {
                return;
            }
            viewByName.setVisibility(4);
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
            pmd.a().m().a("updatePlayExValue", "shop2fLive updatePlayExValue = " + str);
        }
        hashMap.put(obw.KEY_VIDEO_UPDATE_PARAMS, str);
        this.mVideoFrame.callWithMsg(hashMap);
    }

    /* loaded from: classes8.dex */
    public static class ShopLoftLifeCycle implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private FragmentActivity f21575a;

        static {
            kge.a(-813763959);
            kge.a(2139684418);
        }

        public ShopLoftLifeCycle(FragmentActivity fragmentActivity) {
            this.f21575a = fragmentActivity;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onActivityFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8226c848", new Object[]{this});
                return;
            }
            com.taobao.android.live.plugin.proxy.f.m().activityDestroy();
            ab.c(TaoLiveShopSingleRoomController.access$200(), "onActivityFinish, remove LifeCycle.");
            FragmentActivity fragmentActivity = this.f21575a;
            if (fragmentActivity == null) {
                return;
            }
            fragmentActivity.getLifecycle().removeObserver(this);
        }
    }
}

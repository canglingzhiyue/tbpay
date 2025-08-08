package com.taobao.taolive.sdk.playcontrol.card;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.litecreator.comprehension.f;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.playcontrol.d;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.utils.aa;
import com.taobao.taolive.sdk.utils.ab;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.uikit.api.a;
import com.taobao.taolive.uikit.api.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.uc.webview.export.media.MessageID;
import tb.kge;
import tb.prc;
import tb.prw;
import tb.pry;
import tb.psb;
import tb.psc;

/* loaded from: classes8.dex */
public class TBLiveMediaCardView extends RelativeLayout implements b, pry.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LIVE_STATUS_KANDIAN = 1;
    private static final int LIVE_STATUS_LIVE = 0;
    private static final int LIVE_STATUS_VIDEO = 2;
    private static final String TAG = "TBLiveOpenCardView";
    private static boolean isLiveInit;
    public boolean closeSkipPlaySwitch;
    private boolean isMute;
    private boolean isPlayerWarm;
    private boolean isPlayerWarmSucc;
    private boolean isPlayerWarmUsed;
    private int mAnimateTime;
    private a mCallback;
    private prw mCardPlayPerformanceTracker;
    private TUrlImageView mCover;
    private DinamicXEngine mDinamicXEngine;
    private boolean mEnableConsumePlayer;
    private boolean mEnableCoverFade;
    private boolean mEnableKeepLastFrame;
    private boolean mIsLiveVideo;
    private boolean mIsPlaying;
    private String mLifeCycleSyncViewUserIds;
    private pry mLiveCardPlayer;
    private int mLiveStatus;
    private Object mPageID;
    private DXWidgetNode mParentRootView;
    private int mPlayDuration;
    private String mPlayUrl;
    private boolean mPlayVideo;
    private b mPlayerCallback;
    private JSONObject mPlayerDataJSON;
    private RelativeLayout mRootView;
    private String mSubBusinessType;
    private FrameLayout mVideoContainer;
    private boolean mVideoLoop;
    private TUrlImageView mVideoPlaceHolder;
    private String mViewId;

    /* loaded from: classes8.dex */
    public static class SpfPlayVideo implements INetDataObject {
        public String playInfo;
        public String videoType;

        static {
            kge.a(-23938893);
            kge.a(-540945145);
        }
    }

    public static /* synthetic */ Object ipc$super(TBLiveMediaCardView tBLiveMediaCardView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void pageDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c4d85b", new Object[]{this});
        }
    }

    @Deprecated
    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Deprecated
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ boolean access$000(TBLiveMediaCardView tBLiveMediaCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c51daddf", new Object[]{tBLiveMediaCardView})).booleanValue() : tBLiveMediaCardView.mIsPlaying;
    }

    public static /* synthetic */ void access$100(TBLiveMediaCardView tBLiveMediaCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618baa3a", new Object[]{tBLiveMediaCardView});
        } else {
            tBLiveMediaCardView.dismissImgView();
        }
    }

    public static /* synthetic */ TUrlImageView access$200(TBLiveMediaCardView tBLiveMediaCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("2995a0c3", new Object[]{tBLiveMediaCardView}) : tBLiveMediaCardView.mCover;
    }

    static {
        kge.a(1308281839);
        kge.a(1771574164);
        kge.a(-905470315);
        isLiveInit = false;
    }

    public TBLiveMediaCardView(Context context) {
        super(context);
        this.mLiveStatus = 0;
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = true;
        this.mEnableConsumePlayer = false;
        this.mEnableCoverFade = false;
        this.closeSkipPlaySwitch = false;
        this.mEnableKeepLastFrame = false;
        this.mPageID = "unKnownPage";
        this.mSubBusinessType = "homepageLiveCard";
        this.isMute = true;
        this.isPlayerWarm = false;
        this.isPlayerWarmUsed = false;
        this.isPlayerWarmSucc = false;
        this.mPlayDuration = 0;
        this.mViewId = ab.a();
        initView(context);
        initLive();
    }

    public TBLiveMediaCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLiveStatus = 0;
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = true;
        this.mEnableConsumePlayer = false;
        this.mEnableCoverFade = false;
        this.closeSkipPlaySwitch = false;
        this.mEnableKeepLastFrame = false;
        this.mPageID = "unKnownPage";
        this.mSubBusinessType = "homepageLiveCard";
        this.isMute = true;
        this.isPlayerWarm = false;
        this.isPlayerWarmUsed = false;
        this.isPlayerWarmSucc = false;
        this.mPlayDuration = 0;
        this.mViewId = ab.a();
        initView(context);
        initLive();
    }

    public TBLiveMediaCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLiveStatus = 0;
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = true;
        this.mEnableConsumePlayer = false;
        this.mEnableCoverFade = false;
        this.closeSkipPlaySwitch = false;
        this.mEnableKeepLastFrame = false;
        this.mPageID = "unKnownPage";
        this.mSubBusinessType = "homepageLiveCard";
        this.isMute = true;
        this.isPlayerWarm = false;
        this.isPlayerWarmUsed = false;
        this.isPlayerWarmSucc = false;
        this.mPlayDuration = 0;
        this.mViewId = ab.a();
        initView(context);
        initLive();
    }

    public void setAnimateTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd97b50", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimateTime = i;
        }
    }

    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
        } else {
            this.mPageID = obj;
        }
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
        } else {
            this.mPlayVideo = z;
        }
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
        } else {
            this.mPlayUrl = str;
        }
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoLoop = z;
        }
    }

    public void setCloseSkipPlaySwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddf5290", new Object[]{this, new Boolean(z)});
        } else {
            this.closeSkipPlaySwitch = z;
        }
    }

    public void setEnableKeepLastFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b948960", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableKeepLastFrame = z;
        }
    }

    public void setEnableCoverFade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be301c1f", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableCoverFade = z;
        }
    }

    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayDuration = i;
        }
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue() : this.mPlayVideo;
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
            return;
        }
        this.mPlayerDataJSON = jSONObject;
        if (this.mPlayerDataJSON.getJSONObject("queryParams") != null || this.mPlayerDataJSON.getJSONObject("queryParam") == null) {
            return;
        }
        JSONObject jSONObject2 = this.mPlayerDataJSON;
        jSONObject2.put("queryParams", (Object) jSONObject2.getJSONObject("queryParam"));
    }

    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
        } else {
            this.mSubBusinessType = str;
        }
    }

    public void setEnableConsumePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9960b5", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableConsumePlayer = z;
        }
    }

    public void setEnableReport(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc620b4", new Object[]{this, new Boolean(z)});
            return;
        }
        prw prwVar = this.mCardPlayPerformanceTracker;
        if (prwVar == null) {
            return;
        }
        prwVar.a(z);
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue() : this.mIsPlaying;
    }

    public TUrlImageView getCover() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("e99e40f4", new Object[]{this}) : this.mCover;
    }

    public void warmVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e127767d", new Object[]{this});
            return;
        }
        log("warmVideo mPlayVideo = " + this.mPlayVideo);
        if (!this.mPlayVideo || this.mVideoContainer == null || getContext() == null) {
            log("warmVideo cannot play");
            return;
        }
        psc parsePlayData = parsePlayData();
        if (parsePlayData == null) {
            callError(-90001);
            return;
        }
        boxPlayData(parsePlayData);
        warmPlayer(parsePlayData);
    }

    public void refreshTemplateView(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703b550e", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            this.mDinamicXEngine.a(dXWidgetNode, 0, new DXWidgetRefreshOption.a().a(1).a(true).b(false).a());
        }
    }

    public void refreshComponentViews(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7649f381", new Object[]{this, new Boolean(z)});
        } else if (this.mDinamicXEngine != null && this.mParentRootView != null && !l.e(this.mLifeCycleSyncViewUserIds)) {
            String[] split = this.mLifeCycleSyncViewUserIds.split(",");
            if (split.length <= 0) {
                return;
            }
            try {
                for (String str : split) {
                    if (!l.e(str)) {
                        DXWidgetNode queryWidgetNodeByUserId = this.mParentRootView.queryWidgetNodeByUserId(str);
                        JSONObject e = this.mParentRootView.getDXRuntimeContext().e();
                        if (e != null && ((e.getBoolean("hidden") == null && z) || (e.getBoolean("hidden") != null && e.getBoolean("hidden").booleanValue() != z))) {
                            this.mParentRootView.getDXRuntimeContext().e().put("hidden", (Object) Boolean.valueOf(z));
                            refreshTemplateView(queryWidgetNodeByUserId);
                        }
                    }
                }
            } catch (Exception e2) {
                TLog.loge(TAG, "refreshComponentViews：" + e2.getMessage());
            }
        }
    }

    public void setViewInfoLifeCycleSyncOpenCard(DinamicXEngine dinamicXEngine, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be9097", new Object[]{this, dinamicXEngine, dXWidgetNode, str});
            return;
        }
        this.mDinamicXEngine = dinamicXEngine;
        this.mParentRootView = dXWidgetNode;
        this.mLifeCycleSyncViewUserIds = str;
    }

    public boolean playVideo(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e07e99", new Object[]{this, aVar, bVar})).booleanValue();
        }
        log("playVideo mPlayVideo = " + this.mPlayVideo);
        if (!this.mPlayVideo || this.mVideoContainer == null || getContext() == null) {
            log("playVideo cannot play");
            return false;
        } else if (!aa.a(getContext()) && !this.closeSkipPlaySwitch) {
            log("playVideo cannot play");
            return false;
        } else {
            this.mCallback = aVar;
            this.mPlayerCallback = bVar;
            psc parsePlayData = parsePlayData();
            if (parsePlayData == null) {
                callError(-90001);
                return false;
            }
            boxPlayData(parsePlayData);
            startPlayer(parsePlayData);
            this.mIsPlaying = true;
            liveStartBroadcast();
            refreshComponentViews(true);
            return true;
        }
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            stopVideo(true);
        }
    }

    private void stopVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a38934", new Object[]{this, new Boolean(z)});
            return;
        }
        log("stopVideo");
        stopPlayer(z);
        recoverImgView();
        this.mIsPlaying = false;
        refreshComponentViews(false);
    }

    public void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
            return;
        }
        prw prwVar = this.mCardPlayPerformanceTracker;
        if (prwVar == null) {
            return;
        }
        prwVar.b();
    }

    public prw getCardPlayPerformanceTracker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (prw) ipChange.ipc$dispatch("7732fc68", new Object[]{this}) : this.mCardPlayPerformanceTracker;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        log("destroy");
        stopVideo(true);
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isMute = z;
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar == null) {
            return;
        }
        pryVar.a(z);
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar != null) {
            return pryVar.c();
        }
        return this.isMute;
    }

    public Bitmap getCurrentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar == null) {
            return null;
        }
        return pryVar.i();
    }

    public String getPlayerSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9b7f9a", new Object[]{this});
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar == null) {
            return null;
        }
        return pryVar.e();
    }

    public ViewGroup getPlayerRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bcf1150", new Object[]{this});
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar == null) {
            return null;
        }
        return pryVar.g();
    }

    public String getPlayerToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar == null) {
            return null;
        }
        return pryVar.d();
    }

    public String getRecycleToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7687add", new Object[]{this});
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar == null) {
            return null;
        }
        return pryVar.l();
    }

    @Override // tb.pry.a
    public void onRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2145010", new Object[]{this});
            return;
        }
        log("onRetry");
        callEvent(100001);
    }

    @Override // tb.pry.a
    public void onRevoked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb850c6", new Object[]{this});
            return;
        }
        log("onRevoked");
        stopVideo(false);
        callEvent(100002);
    }

    @Override // tb.pry.a
    public void onClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989a503f", new Object[]{this, new Boolean(z)});
            return;
        }
        log("onClear");
        stopVideo(z);
    }

    @Override // tb.pry.a
    public void onReuse() {
        pry pryVar;
        Bitmap i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7958ddc", new Object[]{this});
            return;
        }
        log("onReuse");
        if (o.A() && this.mEnableKeepLastFrame && (pryVar = this.mLiveCardPlayer) != null && (i = pryVar.i()) != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), i);
            this.mVideoPlaceHolder.setVisibility(0);
            this.mVideoPlaceHolder.setImageDrawable(bitmapDrawable);
            stopPlayer(true);
            this.mIsPlaying = false;
            z = false;
        }
        if (z) {
            stopVideo(false);
        }
        callEvent(100004);
    }

    @Override // tb.pry.a
    public void onPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc853dc3", new Object[]{this});
            return;
        }
        log(MessageID.onPrepared);
        callEvent(100007);
    }

    @Override // tb.pry.a
    public void onFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
            return;
        }
        log("onFirstFrame");
        if (this.mCover != null) {
            if (this.mEnableCoverFade) {
                startCoverViewFadeAnimation();
            } else {
                delayDismissCover();
            }
        }
        prw prwVar = this.mCardPlayPerformanceTracker;
        if (prwVar != null) {
            pry pryVar = this.mLiveCardPlayer;
            if (pryVar != null) {
                prwVar.f(pryVar.d());
                this.mCardPlayPerformanceTracker.h(getVideoType(this.mLiveCardPlayer.f()));
            }
            this.mCardPlayPerformanceTracker.c();
        }
        callEvent(com.alibaba.android.ultron.engine.template.b.ERROR_TEMPLATE_INIT_FAILED);
    }

    @Override // tb.pry.a
    public void onNotInstallPlayError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f1674", new Object[]{this});
        } else {
            log("onNotInstallPlayError");
        }
    }

    @Override // tb.pry.a
    public void onInstallReadyRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68affaa8", new Object[]{this});
        } else {
            log("onInstallReadyRetry");
        }
    }

    @Override // tb.pry.a
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        log("onComplete");
        stopVideo(false);
        callEvent(100003);
    }

    @Override // tb.pry.a
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        log("onError errCode = " + i);
        callError(i);
        stopVideo(false);
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        log("onError what = " + i);
        b bVar = this.mPlayerCallback;
        if (bVar != null) {
            bVar.onMediaError(i, i2);
        }
        stopVideo(false);
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        b bVar = this.mPlayerCallback;
        if (bVar != null) {
            bVar.onMediaInfo(j, j2, j3, obj);
        }
        int i = (int) j;
        if (i != 3) {
            if (i != 12000) {
                return;
            }
            this.isPlayerWarmSucc = true;
            log("onInfo isPlayerWarmSucc");
            return;
        }
        log("onInfo MEDIA_INFO_VIDEO_RENDERING_START isPlayerWarmUsed = " + this.isPlayerWarmUsed + " isPlayerWarmSucc = " + this.isPlayerWarmSucc);
    }

    private void dismissImgView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5048a5", new Object[]{this});
            return;
        }
        log("dismissImgView");
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(4);
    }

    private void recoverImgView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba3618b", new Object[]{this});
            return;
        }
        log("recoverImgView");
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        }
        TUrlImageView tUrlImageView2 = this.mVideoPlaceHolder;
        if (tUrlImageView2 == null) {
            return;
        }
        tUrlImageView2.setVisibility(8);
    }

    private psc parsePlayData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psc) ipChange.ipc$dispatch("476953ee", new Object[]{this});
        }
        psc pscVar = new psc();
        if (this.mPlayerDataJSON == null) {
            log("parsePlayData mPlayerDataJSON == null");
            return null;
        }
        if (o.M()) {
            if (this.mPlayerDataJSON.containsKey("videoInfoType") && "video".equals(this.mPlayerDataJSON.getString("videoInfoType"))) {
                this.mIsLiveVideo = false;
                this.mLiveStatus = 2;
            } else if (this.mPlayerDataJSON.containsKey("isTimeMove") && l.d(this.mPlayerDataJSON.getString("isTimeMove"))) {
                this.mIsLiveVideo = false;
                this.mLiveStatus = 1;
            } else {
                this.mIsLiveVideo = true;
                this.mLiveStatus = 0;
            }
        } else if (this.mPlayerDataJSON.containsKey("isTimeMove")) {
            this.mIsLiveVideo = !l.d(this.mPlayerDataJSON.getString("isTimeMove"));
        } else {
            this.mIsLiveVideo = true;
        }
        log("parsePlayData mIsLiveVideo = " + this.mIsLiveVideo);
        prw prwVar = this.mCardPlayPerformanceTracker;
        if (prwVar != null) {
            prwVar.g(this.mIsLiveVideo ? "live" : RecModel.MEDIA_TYPE_TIMEMOVE);
        }
        pscVar.f32848a = this.mIsLiveVideo;
        if (this.mPlayerDataJSON.getJSONObject("queryParams") != null) {
            pscVar.h = this.mPlayerDataJSON.getJSONObject("queryParams").getString("feedId");
        }
        pscVar.k = this.mPlayerDataJSON.getString("liveConfigForStream");
        if (parseMediaData(pscVar)) {
            return pscVar;
        }
        return null;
    }

    private void warmPlayer(psc pscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5960b5fd", new Object[]{this, pscVar});
            return;
        }
        this.mLiveCardPlayer = new pry(getContext());
        this.mLiveCardPlayer.a((b) this);
        this.mLiveCardPlayer.a((pry.a) this);
        this.mLiveCardPlayer.a(pscVar);
        this.mLiveCardPlayer.a(this.mVideoContainer);
        if (com.taobao.live.timemove.weex.a.a().a(this.mPageID)) {
            return;
        }
        this.mLiveCardPlayer.k();
        this.isPlayerWarm = true;
        log("warmup");
        com.taobao.live.timemove.weex.a.a().a(this.mPageID, true);
    }

    private void startPlayer(psc pscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c00a9a", new Object[]{this, pscVar});
            return;
        }
        if (!this.isPlayerWarm) {
            stopPlayer(false);
            this.mLiveCardPlayer = new pry(getContext());
            this.mLiveCardPlayer.a((b) this);
            this.mLiveCardPlayer.a((pry.a) this);
            this.mLiveCardPlayer.a(pscVar);
            this.mLiveCardPlayer.a(this.mVideoContainer);
        } else {
            com.taobao.live.timemove.weex.a.a().a(this.mPageID, false);
            this.isPlayerWarmUsed = true;
        }
        setPlayModel();
        this.mLiveCardPlayer.j();
        this.mLiveCardPlayer.a(this.isMute);
        prw prwVar = this.mCardPlayPerformanceTracker;
        if (prwVar != null) {
            prwVar.a();
        }
        psb.a().a(this.mPageID, this.mLiveCardPlayer);
        callEvent(100006);
    }

    private void stopPlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b38a", new Object[]{this, new Boolean(z)});
            return;
        }
        prw prwVar = this.mCardPlayPerformanceTracker;
        if (prwVar != null) {
            prwVar.b(this.isPlayerWarmUsed);
            this.mCardPlayPerformanceTracker.d();
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar != null) {
            pryVar.b(z);
            psb.a().b(this.mPageID, this.mLiveCardPlayer);
            this.mLiveCardPlayer = null;
        }
        if (this.isPlayerWarm) {
            com.taobao.live.timemove.weex.a.a().a(this.mPageID, false);
        }
        this.isPlayerWarm = false;
        this.isPlayerWarmUsed = false;
        this.isPlayerWarmSucc = false;
    }

    private psc boxPlayData(psc pscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psc) ipChange.ipc$dispatch("b28d5426", new Object[]{this, pscVar});
        }
        pscVar.b = this.mPlayUrl;
        if (!this.mIsLiveVideo) {
            pscVar.j = this.mVideoLoop;
        }
        pscVar.f = this.mPlayDuration;
        pscVar.l = this.mEnableConsumePlayer;
        pscVar.g = this.mSubBusinessType;
        return pscVar;
    }

    private void callEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76801600", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onInfo(i);
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        TLog.loge(TAG, this.mViewId + " " + str);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mRootView = new RelativeLayout(context);
        this.mRootView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.mVideoPlaceHolder = new TUrlImageView(context);
        this.mVideoPlaceHolder.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.mVideoPlaceHolder.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mVideoPlaceHolder.setVisibility(8);
        this.mVideoContainer = new FrameLayout(context);
        this.mVideoContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.mCover = new TUrlImageView(context);
        this.mCover.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        layoutParams.leftMargin = prc.a(context, 8.0f);
        layoutParams.rightMargin = prc.a(context, 8.0f);
        this.mRootView.addView(this.mVideoPlaceHolder);
        this.mRootView.addView(this.mVideoContainer);
        this.mRootView.addView(this.mCover);
        addView(this.mRootView);
    }

    private void initLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8b98a3", new Object[]{this});
            return;
        }
        if (!isLiveInit) {
            log("initLive");
            c.a("com.taobao.taolive", null);
            isLiveInit = true;
        }
        this.mCardPlayPerformanceTracker = new prw();
    }

    private MediaData parseLiveMediaData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaData) ipChange.ipc$dispatch("c5e9d056", new Object[]{this}) : com.taobao.taolive.sdk.model.common.a.a(this.mPlayerDataJSON.getJSONObject("queryParams"));
    }

    private boolean parseMediaData(psc pscVar) {
        JSONObject jSONObject;
        SpfPlayVideo spfPlayVideo;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8251ecf6", new Object[]{this, pscVar})).booleanValue();
        }
        MediaData mediaData = null;
        if (this.mIsLiveVideo) {
            if (!this.mPlayerDataJSON.containsKey("queryParams")) {
                str = null;
                str2 = null;
            } else if (this.mPlayerDataJSON.getIntValue("roomStatus") != l.a("1", 1)) {
                return false;
            } else {
                MediaData parseLiveMediaData = parseLiveMediaData();
                log("parseMediaData mIsLiveVideo = " + this.mIsLiveVideo + "mediaInfo = " + parseLiveMediaData);
                if (parseLiveMediaData == null) {
                    return false;
                }
                str2 = null;
                mediaData = parseLiveMediaData;
                str = null;
            }
        } else {
            if (o.M() && this.mLiveStatus == 2) {
                JSONObject jSONObject2 = this.mPlayerDataJSON.getJSONObject("videoInfo");
                if (jSONObject2 == null) {
                    return false;
                }
                jSONObject = jSONObject2.getJSONObject("spfVideoInfo");
            } else {
                JSONObject jSONObject3 = this.mPlayerDataJSON.getJSONObject("componentTimeMovingDTO");
                if (jSONObject3 == null) {
                    return false;
                }
                jSONObject = jSONObject3.getJSONObject("spfPlayVideo");
            }
            if (jSONObject == null || (spfPlayVideo = (SpfPlayVideo) JSONObject.toJavaObject(jSONObject, SpfPlayVideo.class)) == null) {
                return false;
            }
            if (StringUtils.isEmpty(spfPlayVideo.playInfo)) {
                str = null;
                str2 = null;
            } else if (f.FILE_TYPE_VIDEO_MP4.equals(spfPlayVideo.videoType)) {
                str = spfPlayVideo.playInfo;
                str2 = null;
            } else {
                str2 = spfPlayVideo.playInfo;
                str = null;
            }
            log("parseMediaData mIsLiveVideo = " + this.mIsLiveVideo + " mLiveStatus = " + this.mLiveStatus + " mVideoID = " + str + " m3u8Url = " + str2);
        }
        pscVar.c = mediaData;
        pscVar.e = str;
        pscVar.d = str2;
        return true;
    }

    private void callError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5a2b52", new Object[]{this, new Integer(i)});
            return;
        }
        log("callError errParseData = " + i);
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onError(i);
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(str);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setScaleType(scaleType);
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setPlaceHoldImageResId(i);
    }

    public void setPlayerCover(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d31c7e", new Object[]{this, str, new Integer(i)});
            return;
        }
        pry pryVar = this.mLiveCardPlayer;
        if (pryVar == null) {
            return;
        }
        pryVar.a(str, i);
    }

    public AbsFeature<? super ImageView> findFeature(Class<? extends AbsFeature<? super ImageView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return null;
        }
        return tUrlImageView.findFeature(cls);
    }

    public boolean addFeature(AbsFeature<? super ImageView> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return false;
        }
        return tUrlImageView.addFeature(absFeature);
    }

    public void setColorFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca662803", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setColorFilter(i);
    }

    private void liveStartBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e759c992", new Object[]{this});
            return;
        }
        Intent intent = new Intent(d.ON_LIVE_CARD_START_ACTION);
        intent.putExtra("isMute", isMute());
        intent.putExtra("SubBusinessType", this.mSubBusinessType);
        if (getContext() == null) {
            return;
        }
        getContext().sendBroadcast(intent);
    }

    private void delayDismissCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2b64f7", new Object[]{this});
        } else {
            this.mCover.postDelayed(new Runnable() { // from class: com.taobao.taolive.sdk.playcontrol.card.TBLiveMediaCardView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!TBLiveMediaCardView.access$000(TBLiveMediaCardView.this)) {
                    } else {
                        TBLiveMediaCardView.access$100(TBLiveMediaCardView.this);
                    }
                }
            }, 300L);
        }
    }

    private void startCoverViewFadeAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e71355", new Object[]{this});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int i = this.mAnimateTime;
        alphaAnimation.setDuration(i > 0 ? i : 300L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.taolive.sdk.playcontrol.card.TBLiveMediaCardView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else if (!TBLiveMediaCardView.access$000(TBLiveMediaCardView.this)) {
                } else {
                    if (TBLiveMediaCardView.access$200(TBLiveMediaCardView.this) != null) {
                        TBLiveMediaCardView.access$200(TBLiveMediaCardView.this).setAlpha(1.0f);
                    }
                    TBLiveMediaCardView.access$100(TBLiveMediaCardView.this);
                }
            }
        });
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.startAnimation(alphaAnimation);
    }

    private static String getVideoType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85db75b0", new Object[]{str});
        }
        if (str != null) {
            if (str.contains("flv")) {
                return "flv";
            }
            if (str.contains("artc")) {
                return "artc";
            }
            if (str.contains(f.FILE_TYPE_VIDEO_MP4)) {
                return f.FILE_TYPE_VIDEO_MP4;
            }
            if (str.contains("m3u8")) {
                return "m3u8";
            }
        }
        return "";
    }

    private void setPlayModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c960d51a", new Object[]{this});
            return;
        }
        prw prwVar = this.mCardPlayPerformanceTracker;
        if (prwVar == null) {
            return;
        }
        if (this.isPlayerWarmSucc) {
            prwVar.c("warmuped");
        } else if (this.isPlayerWarm) {
            prwVar.c("warmuping");
        } else {
            prwVar.c("defaultInit");
        }
    }
}

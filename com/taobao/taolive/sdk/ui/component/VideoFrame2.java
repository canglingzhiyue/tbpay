package com.taobao.taolive.sdk.ui.component;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.d;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.t;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;
import tb.obw;
import tb.phq;
import tb.phr;
import tb.pmd;
import tb.ppr;
import tb.pqf;

/* loaded from: classes8.dex */
public class VideoFrame2 extends VideoFrame implements pqf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoFrame2";
    private View mCurVideoView;
    private boolean mHasPreloaded;
    private ArrayList<ppr> mListeners;

    static {
        kge.a(1095130396);
        kge.a(472311370);
    }

    public static /* synthetic */ Object ipc$super(VideoFrame2 videoFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1801045031:
                super.onWillDisappear();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1305262276:
                super.reAddFloatViewToLiveRoom();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 267248023:
                super.init();
                return null;
            case 588897590:
                super.onVideoStatusChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ ArrayList access$000(VideoFrame2 videoFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("aea78568", new Object[]{videoFrame2}) : videoFrame2.mListeners;
    }

    public VideoFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mListeners = new ArrayList<>();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onStatusChange mLiveContextKey = " + this.mLiveContextKey + " status = " + i);
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        setupView();
    }

    @Override // com.taobao.taolive.sdk.ui.component.VideoFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        this.isActive = true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        m.a(TAG, "BaseFrame lifeCycle onDidAppear mLiveContextKey = " + this.mLiveContextKey);
        if (!(this.mFrameContext instanceof phq)) {
            return;
        }
        ((phq) this.mFrameContext).a((phr) this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onWillDisappear mLiveContextKey = " + this.mLiveContextKey);
        super.onWillDisappear();
        removeVideoView();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onDidDisappear mLiveContextKey = " + this.mLiveContextKey);
        super.onDidDisappear();
        removeVideoView();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onDestroy mLiveContextKey = " + this.mLiveContextKey);
        super.onDestroy();
        destroy();
        ArrayList<ppr> arrayList = this.mListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onVideoStatusChanged mLiveContextKey = " + this.mLiveContextKey + " status = " + i);
        super.onVideoStatusChanged(i);
        if (i != 5) {
            return;
        }
        changeStatus(1);
    }

    @Override // com.taobao.taolive.sdk.ui.component.VideoFrame
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        m.a(TAG, "lifeCycle init mLiveContextKey = " + this.mLiveContextKey);
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mSubBusinessType);
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mDeviceLevel);
    }

    @Override // com.taobao.taolive.sdk.ui.component.VideoFrame
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        m.a(TAG, "lifeCycle destroy mLiveContextKey = " + this.mLiveContextKey);
        this.mHasPreloaded = false;
        this.mVideoViewToken = null;
        this.highlightCurrentPlay = null;
        this.mIsPlayError = false;
        this.isActive = false;
        super.destroy();
    }

    @Override // com.taobao.taolive.sdk.ui.component.VideoFrame
    public void reAddFloatViewToLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b233473c", new Object[]{this});
            return;
        }
        super.reAddFloatViewToLiveRoom();
        addVideoView();
    }

    private void addVideoView() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33893726", new Object[]{this});
            return;
        }
        m.a(TAG, "MediaPlay Control addVideoView mLiveContextKey = " + this.mLiveContextKey);
        if (this.mTaoVideoView == null || (viewGroup = (ViewGroup) this.mTaoVideoView.G().getParent()) == this.mContentView) {
            return;
        }
        View view = this.mCurVideoView;
        if (view != null && view.getParent() == this.mContentView) {
            this.mContentView.removeView(this.mCurVideoView);
        }
        this.mCurVideoView = this.mTaoVideoView.G();
        if (viewGroup != null) {
            viewGroup.removeView(this.mCurVideoView);
        }
        this.mContentView.addView(this.mCurVideoView, 0, new FrameLayout.LayoutParams(-1, -1));
        bindListener();
    }

    private void removeVideoView() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388fe023", new Object[]{this});
            return;
        }
        m.a(TAG, "MediaPlay Control removeVideoView mLiveContextKey = " + this.mLiveContextKey);
        if (this.mTaoVideoView == null) {
            return;
        }
        ViewGroup G = this.mTaoVideoView.G();
        if (G != null && (viewGroup = (ViewGroup) G.getParent()) != null) {
            viewGroup.removeView(G);
        }
        View view = this.mCurVideoView;
        if (view != null && view.getParent() == this.mContentView) {
            this.mContentView.removeView(this.mCurVideoView);
        }
        this.mCurVideoView = null;
        this.mTaoVideoView.i();
        this.mTaoVideoView.H();
    }

    @Override // com.taobao.taolive.sdk.ui.component.VideoFrame
    public void createVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fcbaab", new Object[]{this});
            return;
        }
        m.a(TAG, "MediaPlay Control createVideoView mLiveContextKey = " + this.mLiveContextKey);
        this.mTaoVideoView = com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mContext, this.mSubBusinessType, this.mDeviceLevel, this.mVideoViewToken);
        addVideoView();
    }

    public void reattach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a117dde9", new Object[]{this, context});
            return;
        }
        m.a(TAG, "MediaPlay Control reattach mLiveContextKey = " + this.mLiveContextKey);
        if (this.mTaoVideoView == null) {
            return;
        }
        this.mTaoVideoView.b(context);
    }

    public boolean hasPreloaded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb285479", new Object[]{this})).booleanValue() : this.mHasPreloaded;
    }

    public void updateUrlListAndSwitch(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f338cd5f", new Object[]{this, videoInfo});
            return;
        }
        MediaData a2 = com.taobao.taolive.sdk.model.common.a.a(videoInfo);
        if (a2 == null || a2.liveUrlList == null) {
            return;
        }
        this.mTaoVideoView.a(a2.liveUrlList, IMediaPlayer.UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION);
    }

    public boolean isPreloadedFailed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("846a0f46", new Object[]{this})).booleanValue() : this.mIsPlayError;
    }

    public void getPreloadVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba20734", new Object[]{this});
            return;
        }
        m.a(TAG, "MediaPlay Control getPreloadVideoView mLiveContextKey = " + this.mLiveContextKey);
        this.mTaoVideoView = com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mContext, (String) null);
        configPlayer();
        if (!o.s() || this.mTaoVideoView == null) {
            return;
        }
        addVideoView();
    }

    public void preloadVideoByToken(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89f0d9d", new Object[]{this, new Boolean(z)});
            return;
        }
        m.a(TAG, "MediaPlay Control preloadVideoByToken mLiveContextKey = " + this.mLiveContextKey + " mVideoViewToken = " + this.mVideoViewToken);
        this.mTaoVideoView = com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mContext, this.mVideoViewToken);
        configPlayer();
        if (this.mTaoVideoView == null) {
            return;
        }
        addVideoView();
        mTaoLiveRoomPlayer_start();
        this.mIsPlayError = false;
        if (!o.z()) {
            this.mTaoVideoView.a(z);
        } else {
            this.mTaoVideoView.a(true);
        }
        this.mHasPreloaded = true;
        HashMap hashMap = new HashMap();
        hashMap.put("switchScene", "liveRoom");
        this.mTaoVideoView.a((Map<String, String>) hashMap);
    }

    public void preloadVideo(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5275b97", new Object[]{this, mediaData});
        } else {
            preloadVideo(mediaData, false);
        }
    }

    public void preloadVideo(MediaData mediaData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc4ca1d", new Object[]{this, mediaData, new Boolean(z)});
            return;
        }
        m.a(TAG, "MediaPlay Control preloadVideo mLiveContextKey = " + this.mLiveContextKey);
        setVideoUrl(mediaData, null);
        if (this.mTaoVideoView == null) {
            return;
        }
        this.mTaoVideoView.h(this.mToken);
        configPlayer(z);
        mTaoLiveRoomPlayer_startByToken();
        this.mIsPlayError = false;
        this.mTaoVideoView.a(true);
        this.mToken = null;
        this.mHasPreloaded = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void playVideoCDN(com.taobao.taolive.sdk.ui.media.MediaData r6, boolean r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.sdk.ui.component.VideoFrame2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            r1[r3] = r6
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r7)
            r1[r2] = r6
            java.lang.String r6 = "c9a09331"
            r0.ipc$dispatch(r6, r1)
            return
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MediaPlay Control preloadVideoCDN mLiveContextKey = "
            r0.append(r1)
            java.lang.String r1 = r5.mLiveContextKey
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoFrame2"
            com.taobao.taolive.sdk.utils.m.a(r1, r0)
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            if (r0 == 0) goto Lbe
            r5.addVideoView()
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            r0.q()
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            boolean r1 = com.taobao.taolive.sdk.utils.u.D()
            r0.d(r1)
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            boolean r1 = com.taobao.taolive.sdk.utils.u.E()
            r0.e(r1)
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            boolean r1 = com.taobao.taolive.sdk.utils.u.F()
            r0.f(r1)
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            r0.j(r4)
            boolean r0 = com.taobao.taolive.sdk.utils.o.y()
            if (r0 == 0) goto L85
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            int r0 = r0.J()
            if (r0 == r2) goto L71
            r0 = 1
            goto L72
        L71:
            r0 = 0
        L72:
            com.taobao.taolive.sdk.ui.media.d r1 = r5.mTaoVideoView
            com.taobao.taolive.sdk.ui.media.IMediaPlayer$WarmState r1 = r1.h()
            com.taobao.taolive.sdk.ui.media.IMediaPlayer$WarmState r2 = com.taobao.taolive.sdk.ui.media.IMediaPlayer.WarmState.NORMAL
            if (r1 == r2) goto L7e
            r1 = 1
            goto L7f
        L7e:
            r1 = 0
        L7f:
            if (r0 == 0) goto L85
            if (r1 == 0) goto L85
            r0 = 0
            goto L86
        L85:
            r0 = 1
        L86:
            r1 = 0
            if (r0 == 0) goto L8e
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            r0.a(r6, r1)
        L8e:
            com.taobao.taolive.sdk.ui.media.d r6 = r5.mTaoVideoView
            r6.d(r4)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r0 = "liveActionType"
            java.lang.String r2 = "updownSwitch"
            r6.put(r0, r2)
            com.taobao.taolive.sdk.ui.media.d r0 = r5.mTaoVideoView
            r0.a(r6)
            com.taobao.taolive.sdk.ui.media.d r6 = r5.mTaoVideoView
            java.lang.String r0 = r5.mToken
            r6.h(r0)
            r5.configPlayer(r7)
            r5.mTaoLiveRoomPlayer_startByToken()
            r5.mIsPlayError = r4
            com.taobao.taolive.sdk.ui.media.d r6 = r5.mTaoVideoView
            r6.a(r3)
            r5.mToken = r1
            r5.mHasPreloaded = r3
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.ui.component.VideoFrame2.playVideoCDN(com.taobao.taolive.sdk.ui.media.MediaData, boolean):void");
    }

    public void preloadVideoByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cdb2d7", new Object[]{this, str});
            return;
        }
        m.a(TAG, "MediaPlay Control preloadVideoByUrl mLiveContextKey = " + this.mLiveContextKey);
        setVideoUrl(null, str);
        if (this.mTaoVideoView == null) {
            return;
        }
        this.mTaoVideoView.h(this.mToken);
        configPlayer();
        mTaoLiveRoomPlayer_startByToken();
        this.mIsPlayError = false;
        this.mTaoVideoView.a(true);
        this.mToken = null;
        this.mHasPreloaded = true;
    }

    private void setVideoUrl(MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1109d", new Object[]{this, mediaData, str});
            return;
        }
        m.a(TAG, "MediaPlay Control setVideoUrl mLiveContextKey = " + this.mLiveContextKey + " mediaLiveInfo = " + mediaData + " url = " + str);
        this.mTaoVideoView = com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mContext, (String) null, mediaData, str);
        if (this.mTaoVideoView == null) {
            return;
        }
        addVideoView();
        this.mTaoVideoView.q();
        this.mTaoVideoView.d(u.D());
        this.mTaoVideoView.e(u.E());
        this.mTaoVideoView.f(u.F());
        this.mTaoVideoView.j(false);
        if (o.y()) {
            boolean z2 = this.mTaoVideoView.J() != 2;
            boolean z3 = this.mTaoVideoView.h() != IMediaPlayer.WarmState.NORMAL;
            if (z2 && z3) {
                z = false;
            }
        }
        if (z) {
            this.mTaoVideoView.a(mediaData, str);
        }
        this.mTaoVideoView.d(0);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("liveActionType", obw.VIDEO_ACTION_TYPE_UPDOWNSWITCH);
        this.mTaoVideoView.a(hashMap);
    }

    public void preloadHighlight(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204ef7fd", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        this.mTaoVideoView = com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mContext, (String) null);
        configPlayer(false, false);
        if (this.mTaoVideoView == null) {
            return;
        }
        addVideoView();
        directPlayHighlight(str, str2, i);
        this.mHasPreloaded = true;
        this.mIsPlayError = false;
    }

    public void directPlayHighlight(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0cf3b1", new Object[]{this, str, str2, new Integer(i)});
        } else if (this.mTaoVideoView == null) {
        } else {
            boolean z = !TextUtils.isEmpty(str2) && !str2.equals(this.highlightCurrentPlay);
            boolean z2 = TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !str.equals(this.highlightCurrentPlay);
            if (!z && !z2 && (this.mTaoVideoView.l() || this.mHasPreloaded)) {
                return;
            }
            this.mTaoVideoView.q();
            this.mTaoVideoView.o();
            this.mTaoVideoView.d("TimeMovingPlay");
            if (o.g() && i > 0) {
                this.mTaoVideoView.e(i);
            }
            if (!TextUtils.isEmpty(str2)) {
                setMediaId(str2);
                this.highlightCurrentPlay = str2;
            } else {
                addCustomParams(str);
                this.mTaoVideoView.a((MediaData) null, str);
                this.highlightCurrentPlay = str;
            }
            VideoInfo videoInfo = getVideoInfo();
            if (videoInfo != null && videoInfo.timeMovingPlayInfo != null && videoInfo.timeMovingPlayInfo.isSpeaking) {
                this.mTaoVideoView.d(0);
                if (pmd.a().e() != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("timeMovingPlayInfo", JSON.toJSONString(videoInfo.timeMovingPlayInfo));
                    pmd.a().e().a("Page_TaobaoLiveWatch", 19999, "HighlightScenarioLive", "", "0", hashMap);
                }
            } else {
                this.mTaoVideoView.d(2);
            }
            this.mTaoVideoView.c(1);
            this.mTaoVideoView.a(20132, 1L);
            this.mTaoVideoView.b(this.mIsOpen);
            configPlayer(false, false);
            mTaoLiveRoomPlayer_startByToken();
            this.mIsPlayError = false;
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", 19999, "HighlightTimeMovingPlayVV", "", "0", null);
        }
    }

    public void registerListener(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e7623c", new Object[]{this, pprVar});
            return;
        }
        ArrayList<ppr> arrayList = this.mListeners;
        if (arrayList == null || pprVar == null || arrayList.contains(pprVar)) {
            return;
        }
        this.mListeners.add(pprVar);
    }

    public void unRegisterListener(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9051575", new Object[]{this, pprVar});
            return;
        }
        ArrayList<ppr> arrayList = this.mListeners;
        if (arrayList == null || pprVar == null || !arrayList.contains(pprVar)) {
            return;
        }
        this.mListeners.remove(pprVar);
    }

    private void bindListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d54d418", new Object[]{this});
            return;
        }
        this.mTaoVideoView.a(new IMediaPlayer.i() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
                    return;
                }
                m.a(VideoFrame2.TAG, "mediaPlayer: onPrepared");
                if (VideoFrame2.access$000(VideoFrame2.this) == null || VideoFrame2.access$000(VideoFrame2.this).size() <= 0) {
                    return;
                }
                Iterator it = VideoFrame2.access$000(VideoFrame2.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).b();
                }
            }
        });
        this.mTaoVideoView.a(new IMediaPlayer.e() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                m.a(VideoFrame2.TAG, "mediaPlayer: onError what---" + i + "  extra---" + i2);
                VideoFrame2 videoFrame2 = VideoFrame2.this;
                videoFrame2.mIsPlayError = true;
                if ((videoFrame2.mFrameContext instanceof e) && ((e) VideoFrame2.this.mFrameContext).B() != null) {
                    ((e) VideoFrame2.this.mFrameContext).B().a(i);
                }
                if (VideoFrame2.access$000(VideoFrame2.this) != null && VideoFrame2.access$000(VideoFrame2.this).size() > 0) {
                    for (int i3 = 0; i3 < VideoFrame2.access$000(VideoFrame2.this).size(); i3++) {
                        ((ppr) VideoFrame2.access$000(VideoFrame2.this).get(i3)).a(iMediaPlayer, i, i2);
                    }
                }
                return false;
            }
        });
        this.mTaoVideoView.a(new IMediaPlayer.g() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ea, code lost:
                if (com.taobao.taolive.sdk.utils.o.U() != false) goto L36;
             */
            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onInfo(com.taobao.taolive.sdk.ui.media.IMediaPlayer r15, long r16, long r18, long r20, java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 350
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.ui.component.VideoFrame2.AnonymousClass3.onInfo(com.taobao.taolive.sdk.ui.media.IMediaPlayer, long, long, long, java.lang.Object):boolean");
            }
        });
        this.mTaoVideoView.a(new IMediaPlayer.d() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
                    return;
                }
                m.a(VideoFrame2.TAG, "mediaPlayer: onCompletion");
                if (VideoFrame2.access$000(VideoFrame2.this) == null || VideoFrame2.access$000(VideoFrame2.this).size() <= 0) {
                    return;
                }
                for (int i = 0; i < VideoFrame2.access$000(VideoFrame2.this).size(); i++) {
                    ((ppr) VideoFrame2.access$000(VideoFrame2.this).get(i)).c(iMediaPlayer);
                }
            }
        });
        this.mTaoVideoView.a(new IMediaPlayer.j() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
                    return;
                }
                m.a(VideoFrame2.TAG, "mediaPlayer:  onStart");
                if (VideoFrame2.access$000(VideoFrame2.this) == null || VideoFrame2.access$000(VideoFrame2.this).size() <= 0) {
                    return;
                }
                Iterator it = VideoFrame2.access$000(VideoFrame2.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).a(iMediaPlayer);
                }
            }
        });
        this.mTaoVideoView.a(new IMediaPlayer.h() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
                    return;
                }
                m.a(VideoFrame2.TAG, "mediaPlayer: onPause");
                if (VideoFrame2.access$000(VideoFrame2.this) == null || VideoFrame2.access$000(VideoFrame2.this).size() <= 0) {
                    return;
                }
                Iterator it = VideoFrame2.access$000(VideoFrame2.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).b(iMediaPlayer);
                }
            }
        });
        this.mTaoVideoView.a(new AudioManager.OnAudioFocusChangeListener() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
                } else if (i == -3) {
                } else {
                    if (i != -2 && i != -1) {
                        if (i != 1) {
                        }
                    } else if (!t.a() || !t.b() || !com.taobao.taolive.sdk.playcontrol.c.k(VideoFrame2.this.mFrameContext)) {
                    } else {
                        VideoFrame2.this.pause();
                    }
                }
            }
        });
        this.mTaoVideoView.a(new d.a() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame2.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                m.a(VideoFrame2.TAG, "mediaPlayer: onNotInstallPlayError");
                VideoFrame2.this.mIsPlayError = true;
            }

            @Override // com.taobao.taolive.sdk.ui.media.d.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                m.a(VideoFrame2.TAG, "mediaPlayer: onInstallReadyRetry");
                VideoFrame2.this.mIsPlayError = false;
            }
        });
    }
}

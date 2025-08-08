package com.taobao.avplayer.embed;

import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioError;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.i;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.mediaplay.player.e;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.util.b;
import java.util.HashMap;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes6.dex */
public class MyTBLiveEmbedView extends BaseEmbedView implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "H5live";
    private static String END = null;
    private static final String Event_State = "changeState";
    private static final String Event_error = "error";
    private static String FIRST_FRAME = null;
    private static String LOADING = null;
    public static final String NAME = "wvlivevideo";
    private static String PAUSED;
    private static String PLAYING;
    private Context mContext;
    private MediaPlayCenter mMediaPlayCenter;
    private String mPlayScenes;
    private FrameLayout mComponentHostView = null;
    private String mSrc = null;
    private int mScenarioType = 0;
    private MediaType mMediaType = MediaType.LIVE;
    private boolean mAutoPlay = false;
    private boolean mMuted = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
    private MediaAspectRatio mObjectFit = MediaAspectRatio.DW_CENTER_CROP;
    private String mBizCode = null;
    private String mSubBizCode = null;
    private String mFeedId = null;
    public boolean mUsePlayerManager = false;
    private String mLiveUrlResources = null;
    private int mWidth = 0;
    private int mHeight = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum EmbedProperties {
        src { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.1
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$100(myTBLiveEmbedView, String.valueOf(obj));
                return true;
            }
        },
        muted { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.2
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$200(myTBLiveEmbedView, Boolean.parseBoolean(String.valueOf(obj)), z);
                return true;
            }
        },
        autoplay { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.3
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$300(myTBLiveEmbedView, Boolean.parseBoolean(String.valueOf(obj)));
                return true;
            }
        },
        autoPlay { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.4
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$300(myTBLiveEmbedView, Boolean.parseBoolean(String.valueOf(obj)));
                return true;
            }
        },
        scenarioType { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.5
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                int i = 0;
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                try {
                    i = Integer.valueOf(String.valueOf(obj)).intValue();
                } catch (Throwable unused) {
                }
                myTBLiveEmbedView.setScenarioType(i);
                return true;
            }
        },
        objectFit { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.6
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setObjectFit(String.valueOf(obj));
                return true;
            }
        },
        bizCode { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.7
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setBizCode(String.valueOf(obj));
                return true;
            }
        },
        subBizCode { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.8
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setSubBizCode(String.valueOf(obj));
                return true;
            }
        },
        from { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.9
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setSubBizCode(String.valueOf(obj));
                return true;
            }
        },
        videoPlayScenes { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.10
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setPlayScenes(String.valueOf(obj));
                return true;
            }
        },
        feedId { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.11
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setFeedId(String.valueOf(obj));
                return true;
            }
        },
        usePlayerManager { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.12
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setUsePlayerManager(Boolean.parseBoolean(obj.toString()));
                return true;
            }
        },
        liveUrlResources { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.13
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                String valueOf = String.valueOf(obj);
                if (StringUtils.isEmpty(valueOf)) {
                    return true;
                }
                myTBLiveEmbedView.setLiveUrlResources(valueOf, z);
                return true;
            }
        };

        public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
            return (obj == null || myTBLiveEmbedView == null) ? false : true;
        }
    }

    /* loaded from: classes6.dex */
    private enum JSMethod {
        setMuted { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.1
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                JSONObject parseObject;
                if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
                    return true;
                }
                MyTBLiveEmbedView.access$500(myTBLiveEmbedView, Boolean.TRUE.equals(parseObject.getBoolean(MusLiveVideo.ATTR_MUTE)));
                if (wVCallBackContext == null) {
                    return true;
                }
                wVCallBackContext.success();
                return true;
            }
        },
        play { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.2
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (!super.doSomething(myTBLiveEmbedView, str, wVCallBackContext) && wVCallBackContext != null) {
                    wVCallBackContext.error();
                }
                MyTBLiveEmbedView.access$600(myTBLiveEmbedView);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                    return true;
                }
                return true;
            }
        },
        pause { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.3
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (!super.doSomething(myTBLiveEmbedView, str, wVCallBackContext) && wVCallBackContext != null) {
                    wVCallBackContext.error();
                }
                MyTBLiveEmbedView.access$700(myTBLiveEmbedView);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                    return true;
                }
                return true;
            }
        },
        seekTo { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.4
            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                JSONObject parseObject;
                if (!super.doSomething(myTBLiveEmbedView, str, wVCallBackContext) && wVCallBackContext != null) {
                    wVCallBackContext.error();
                }
                boolean z = false;
                if (!StringUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                    try {
                        MyTBLiveEmbedView.access$800(myTBLiveEmbedView, Integer.parseInt(parseObject.getString("time")) * 1000);
                        z = true;
                    } catch (Throwable unused) {
                    }
                }
                if (z && wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        };

        public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
            return !StringUtils.isEmpty(str) && wVCallBackContext != null;
        }
    }

    public static /* synthetic */ Object ipc$super(MyTBLiveEmbedView myTBLiveEmbedView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126948911:
                return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
            case 797441118:
                super.onPause();
                return null;
            case 2111529549:
                super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : NAME;
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ void access$100(MyTBLiveEmbedView myTBLiveEmbedView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339ba257", new Object[]{myTBLiveEmbedView, str});
        } else {
            myTBLiveEmbedView.setSrc(str);
        }
    }

    public static /* synthetic */ void access$200(MyTBLiveEmbedView myTBLiveEmbedView, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661d0bac", new Object[]{myTBLiveEmbedView, new Boolean(z), new Boolean(z2)});
        } else {
            myTBLiveEmbedView.setMuted(z, z2);
        }
    }

    public static /* synthetic */ void access$300(MyTBLiveEmbedView myTBLiveEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8843dda9", new Object[]{myTBLiveEmbedView, new Boolean(z)});
        } else {
            myTBLiveEmbedView.setAutoPlay(z);
        }
    }

    public static /* synthetic */ void access$500(MyTBLiveEmbedView myTBLiveEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b940ab", new Object[]{myTBLiveEmbedView, new Boolean(z)});
        } else {
            myTBLiveEmbedView.mute(z);
        }
    }

    public static /* synthetic */ void access$600(MyTBLiveEmbedView myTBLiveEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7b75a8", new Object[]{myTBLiveEmbedView});
        } else {
            myTBLiveEmbedView.play();
        }
    }

    public static /* synthetic */ void access$700(MyTBLiveEmbedView myTBLiveEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed541007", new Object[]{myTBLiveEmbedView});
        } else {
            myTBLiveEmbedView.pause();
        }
    }

    public static /* synthetic */ void access$800(MyTBLiveEmbedView myTBLiveEmbedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a69155d", new Object[]{myTBLiveEmbedView, new Integer(i)});
        } else {
            myTBLiveEmbedView.seekTo(i);
        }
    }

    static {
        kge.a(1477494588);
        kge.a(-613305621);
        PLAYING = "2004";
        PAUSED = "2005";
        FIRST_FRAME = "2006";
        LOADING = com.taobao.themis.canvas.canvas.a.FCANVAS_ERROR_OPEN_GL;
        END = "2008";
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        this.mContext = context;
        parseParam();
        return genVideoView();
    }

    private void parseParam() {
        EmbedProperties[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55ed21", new Object[]{this});
            return;
        }
        setWidth(this.params.mWidth, false);
        setHeight(this.params.mHeight, false);
        for (EmbedProperties embedProperties : EmbedProperties.values()) {
            Object obj = this.params.mObjectParam.get(embedProperties.name());
            if (obj != null) {
                embedProperties.setValue(this, obj, false);
            }
        }
    }

    private void setHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbeb8461", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mHeight = i;
        }
    }

    private void setWidth(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cb1a7c", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mWidth = i;
        }
    }

    private View genVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc8b6559", new Object[]{this});
        }
        if (this.mComponentHostView == null) {
            this.mComponentHostView = new FrameLayout(this.mContext) { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 1389530587) {
                        super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.view.View
                public void onSizeChanged(int i, int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                        return;
                    }
                    super.onSizeChanged(i, i2, i3, i4);
                    if (i4 != i3 || i4 == 0) {
                    }
                }
            };
        }
        this.mMediaPlayCenter = new MediaPlayCenter(this.mContext);
        this.mMediaPlayCenter.setUsingInterface(COMPONENT_NAME);
        if (!StringUtils.isEmpty(this.mLiveUrlResources)) {
            MediaLiveInfo mediaLiveInfo = null;
            try {
                mediaLiveInfo = (MediaLiveInfo) JSONObject.parseObject(this.mLiveUrlResources, MediaLiveInfo.class);
            } catch (Exception e) {
                AVSDKLog.e("AVDSK", "parseObject MediaLiveInfo error " + e.toString());
            }
            if (mediaLiveInfo != null && mediaLiveInfo.liveUrlList != null && mediaLiveInfo.liveUrlList.size() > 0) {
                this.mMediaPlayCenter.updateLiveMediaInfoData(mediaLiveInfo);
            }
        }
        if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "useRtcliveByDefaultH5", "true"))) {
            this.mMediaPlayCenter.setUseBfrtc(true);
            this.mMediaPlayCenter.setUseRtcLive(true);
            this.mMediaPlayCenter.setAutoDegradedWhenError(true);
        }
        this.mMediaPlayCenter.setMediaUrl(this.mSrc);
        this.mMediaPlayCenter.setScenarioType(this.mScenarioType);
        this.mMediaPlayCenter.setMediaType(this.mMediaType);
        this.mMediaPlayCenter.setMute(this.mMuted);
        MediaAspectRatio mediaAspectRatio = this.mObjectFit;
        if (mediaAspectRatio != null) {
            this.mMediaPlayCenter.setMediaAspectRatio(mediaAspectRatio);
        }
        if (!StringUtils.isEmpty(this.mBizCode)) {
            this.mMediaPlayCenter.setBusinessId(this.mBizCode);
        }
        if (!StringUtils.isEmpty(this.mSubBizCode)) {
            this.mMediaPlayCenter.setBizCode(this.mSubBizCode);
        }
        if (!StringUtils.isEmpty(this.mPlayScenes)) {
            this.mMediaPlayCenter.setPlayScenes(this.mPlayScenes);
        }
        if (!StringUtils.isEmpty(this.mFeedId)) {
            this.mMediaPlayCenter.setMediaId(this.mFeedId);
        }
        this.mMediaPlayCenter.setConfigGroup("MediaLive");
        this.mMediaPlayCenter.hideController();
        this.mMediaPlayCenter.setNeedPlayControlView(false);
        this.mMediaPlayCenter.setMediaLifecycleListener(this);
        this.mMediaPlayCenter.setPlayerType(3);
        this.mMediaPlayCenter.setup();
        if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enFixWVLiveSize", "true"))) {
            this.mComponentHostView.addView(this.mMediaPlayCenter.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        } else {
            this.mComponentHostView.addView(this.mMediaPlayCenter.getView(), this.mWidth, this.mHeight);
        }
        if (this.mAutoPlay) {
            fireEvent(Event_State, LOADING);
            this.mMediaPlayCenter.start();
        }
        log("init EmbedLive View");
        return this.mComponentHostView;
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else {
            fireEvent(Event_State, PLAYING);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        } else {
            fireEvent(Event_State, PAUSED);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            fireEvent(Event_State, PLAYING);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else {
            fireEvent("error", Integer.valueOf((-400 <= i || i <= -500) ? (-500 < i || i <= -600) ? i == -5 ? 1008 : (i == -10006 || i == -10000) ? 3002 : i == -10205 ? 1024 : 1023 : i.ACTIONBAR_MENU_LIST : i.ACTIONBAR_MENU_RIGHT));
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (j != 3) {
        } else {
            fireEvent(Event_State, FIRST_FRAME);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        } else {
            fireEvent(Event_State, END);
        }
    }

    public void setLiveUrlResources(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34da0df", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mLiveUrlResources = str;
        }
    }

    private void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.mSrc = str;
        }
    }

    private void setMuted(boolean z, boolean z2) {
        MediaPlayCenter mediaPlayCenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d188b0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mMuted = z;
        AVSDKLog.e(c.MODULE_SDK_PAGE, "MyTBLiveEmbedView Builder, sbt=" + this.mSubBizCode + ", setMute=" + this.mMuted);
        if (!z2 || (mediaPlayCenter = this.mMediaPlayCenter) == null) {
            return;
        }
        mediaPlayCenter.setMute(z);
        this.mMediaPlayCenter.mute(z);
    }

    private void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoPlay = z;
        }
    }

    public void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else if (StringUtils.equals(str, com.taobao.android.weex_framework.util.a.ATOM_EXT_fill)) {
            this.mObjectFit = MediaAspectRatio.DW_CENTER_CROP;
        } else {
            this.mObjectFit = MediaAspectRatio.DW_FIT_CENTER;
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mBizCode = str;
        }
    }

    public void setSubBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659b3253", new Object[]{this, str});
        } else {
            this.mSubBizCode = str;
        }
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mPlayScenes = str;
        }
    }

    public void setUsePlayerManager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cc6bc6", new Object[]{this, new Boolean(z)});
        } else {
            this.mUsePlayerManager = z;
        }
    }

    public void setScenarioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
        } else {
            this.mScenarioType = i;
        }
    }

    public void setFeedId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
        } else {
            this.mFeedId = str;
        }
    }

    private synchronized void destroyInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f9103", new Object[]{this});
        } else if (this.mMediaPlayCenter == null) {
        } else {
            try {
                log("Embed Video destroy");
                this.mMediaPlayCenter.release();
                this.mMediaPlayCenter.destroy();
                this.mMediaPlayCenter = null;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroyInner();
    }

    private void fireEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b3b231", new Object[]{this, str, obj});
            return;
        }
        log("firent " + str + ":" + String.valueOf(obj));
        HashMap hashMap = new HashMap(1);
        hashMap.put("code", obj);
        a.a(this.webView, this.id, str, JSON.toJSONString(hashMap));
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSMethod jSMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            jSMethod = JSMethod.valueOf(str);
        } catch (Throwable unused) {
            jSMethod = null;
        }
        if (jSMethod != null) {
            return jSMethod.doSomething(this, str2, wVCallBackContext);
        }
        return super.execute(str, str2, wVCallBackContext);
    }

    private void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.mute(z);
    }

    private void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.seekTo(i);
    }

    private void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        if (this.mScenarioType < 2) {
            mediaPlayCenter.setup();
            fireEvent(Event_State, Integer.valueOf((int) BioError.RESULT_FAIL_EXIT));
        }
        this.mMediaPlayCenter.start();
    }

    private void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        if (this.mScenarioType < 2) {
            mediaPlayCenter.release();
            fireEvent(Event_State, PAUSED);
            return;
        }
        mediaPlayCenter.pause();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        EmbedProperties embedProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        super.onParamChanged(strArr, strArr2);
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return;
        }
        String str = strArr[0];
        String str2 = strArr2[0];
        try {
            embedProperties = EmbedProperties.valueOf(str);
        } catch (Throwable unused) {
            embedProperties = null;
        }
        if (embedProperties == null) {
            return;
        }
        log("onParamChanged key:" + str + " Value : " + String.valueOf(str2));
        embedProperties.setValue(this, str2, true);
    }

    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            AVSDKLog.d(NAME, str);
        }
    }
}

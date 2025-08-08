package com.taobao.media;

import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioError;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.browser.utils.i;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.mediaplay.player.e;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kge;
import tb.oyw;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class TriverEmbedLiveView extends BaseEmbedView implements e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "avtriverlive";
    public static final String TYPE = "live-player";
    private WeakReference<Context> mContextRef;
    public String mFrom;
    public MediaPlayCenter mMediaPlayCenter;
    public String mPlayScenes;
    public FrameLayout mRootView;
    public String mSrc;
    public String mMode = "live";
    public boolean mAutoplay = false;
    public boolean mMuted = false;
    public String mOrientation = "vertical";
    public String mObjectFit = "contain";
    public float mMinCache = 1.0f;
    public float mMaxCache = 3.0f;

    static {
        kge.a(1427422932);
        kge.a(-613305621);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(TriverEmbedLiveView triverEmbedLiveView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1664325763) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Map) objArr[0]);
            return null;
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : TYPE;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
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
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        PageContext pageContext = this.mOuterPage.getPageContext();
        if (pageContext == null) {
            return;
        }
        this.mContextRef = new WeakReference<>(pageContext.getActivity());
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        if (this.mRootView == null) {
            this.mRootView = new FrameLayout(this.mContextRef.get());
        }
        parseParams(map);
        return this.mRootView;
    }

    private void parseParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79431965", new Object[]{this, map});
        } else if (map == null || map.size() <= 0) {
        } else {
            if (!StringUtils.isEmpty(map.get("src"))) {
                this.mSrc = map.get("src");
            }
            if (!StringUtils.isEmpty(map.get("mode"))) {
                this.mMode = map.get("mode");
            }
            if (!StringUtils.isEmpty(map.get("orientation"))) {
                this.mOrientation = map.get("orientation");
            }
            if (!StringUtils.isEmpty(map.get(a.ATOM_EXT_UDL_object_fit))) {
                this.mObjectFit = map.get(a.ATOM_EXT_UDL_object_fit);
            }
            if (!StringUtils.isEmpty(map.get("from"))) {
                this.mFrom = map.get("from");
            }
            if (!StringUtils.isEmpty(map.get(oyw.VIDEO_PLAY_SCENES))) {
                this.mPlayScenes = map.get(oyw.VIDEO_PLAY_SCENES);
            }
            try {
                if (!StringUtils.isEmpty(map.get(MusLiveVideo.ATTR_MUTE))) {
                    this.mMuted = Boolean.parseBoolean(map.get(MusLiveVideo.ATTR_MUTE));
                }
                if (!StringUtils.isEmpty(map.get("autoplay"))) {
                    this.mAutoplay = Boolean.parseBoolean(map.get("autoplay"));
                }
            } catch (Exception unused) {
            }
            try {
                if (!StringUtils.isEmpty(map.get("min-cache"))) {
                    this.mMinCache = Float.parseFloat(map.get("min-cache"));
                }
                if (StringUtils.isEmpty(map.get("max-cache"))) {
                    return;
                }
                this.mMaxCache = Float.parseFloat(map.get("max-cache"));
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        try {
            if (this.mMediaPlayCenter == null) {
                return;
            }
            if ("play".equals(str)) {
                this.mMediaPlayCenter.setup();
                sendState(BioError.RESULT_FAIL_EXIT);
                this.mMediaPlayCenter.start();
            } else if ("pause".equals(str)) {
                this.mMediaPlayCenter.release();
                sendState(2005);
            } else if ("resume".equals(str)) {
                this.mMediaPlayCenter.setup();
                this.mMediaPlayCenter.start();
            } else if ("stop".equals(str)) {
                this.mMediaPlayCenter.release();
                sendState(2006);
            } else if ("mute".equals(str) && jSONObject != null && jSONObject.size() > 0) {
                this.mMediaPlayCenter.mute(jSONObject.getBooleanValue("ison"));
            } else if (!"requestFullScreen".equals(str) || jSONObject == null || jSONObject.size() <= 0) {
            } else {
                if (jSONObject != null && jSONObject.containsKey("direction") && "-90".equals(jSONObject.getString("direction"))) {
                    this.mMediaPlayCenter.setRequestFullScreen(true);
                    this.mMediaPlayCenter.toggleScreen();
                } else if (jSONObject == null || !jSONObject.containsKey("direction") || !"0".equals(jSONObject.getString("direction"))) {
                } else {
                    this.mMediaPlayCenter.setRequestFullScreen(false);
                    this.mMediaPlayCenter.toggleScreen();
                }
            }
        } catch (Throwable th) {
            AVSDKLog.e("AriverLiveComp", "onReceivedMessage Error = " + th.getMessage());
            th.printStackTrace();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("fail", "true");
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    private void sendState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e69cf13", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) String.valueOf(i));
        sendEvent("onChangeState", jSONObject, new IEmbedCallback() { // from class: com.taobao.media.TriverEmbedLiveView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                }
            }
        });
    }

    private void sendFullScreenChange(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7398da1a", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            if (z) {
                jSONObject.put("direction", Constants.Value.HORIZONTAL);
            } else {
                jSONObject.put("direction", "vertical");
            }
            jSONObject.put("fullScreen", (Object) true);
        } else {
            jSONObject.put("direction", "vertical");
            jSONObject.put("fullScreen", (Object) false);
        }
        sendEvent("onFullScreenChange", jSONObject, new IEmbedCallback() { // from class: com.taobao.media.TriverEmbedLiveView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                }
            }
        });
    }

    private void sendError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8093fc", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        sendEvent("onChangeState", jSONObject, new IEmbedCallback() { // from class: com.taobao.media.TriverEmbedLiveView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                } else {
                    AVSDKLog.d("EmbedLiveView", "sendError");
                }
            }
        });
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, final IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
        } else if (this.mOuterPage == null) {
            throw new IllegalStateException("You should call super.onCreate first!!!");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (!str.equals(RVEvents.ON_TO_WEBVIEW_MESSAGE)) {
                str = "nbcomponent." + getType() + "." + str;
            }
            if (jSONObject != null) {
                jSONObject.put(BindingXConstants.KEY_ELEMENT, (Object) this.mViewId);
                jSONObject2.put("data", (Object) jSONObject);
            }
            Render render = this.mOuterPage.getRender();
            EngineUtils.sendToRender(render, render.getEngine().getEngineRouter().getWorkerById(EngineUtils.getWorkerId(render)), str, jSONObject2, new SendToRenderCallback() { // from class: com.taobao.media.TriverEmbedLiveView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
                public void onCallBack(JSONObject jSONObject3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject3});
                        return;
                    }
                    IEmbedCallback iEmbedCallback2 = iEmbedCallback;
                    if (iEmbedCallback2 == null) {
                        return;
                    }
                    iEmbedCallback2.onResponse(jSONObject3);
                }
            });
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        } else if (jSONObject == null || jSONObject.size() == 0) {
        } else {
            parseVideoParams(jSONObject);
            if (!StringUtils.isEmpty(this.mSrc) && this.mMediaPlayCenter == null) {
                initPlayer();
            }
            MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
            if (mediaPlayCenter == null || mediaPlayCenter.getView().getParent() != null) {
                return;
            }
            this.mRootView.addView(this.mMediaPlayCenter.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    private void parseVideoParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21706db", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (!StringUtils.isEmpty(jSONObject.getString("src"))) {
                this.mSrc = jSONObject.getString("src");
            }
            if (!StringUtils.isEmpty(jSONObject.getString("mode"))) {
                this.mMode = jSONObject.getString("mode");
            }
            if (!StringUtils.isEmpty(jSONObject.getString("orientation"))) {
                this.mOrientation = jSONObject.getString("orientation");
            }
            if (!StringUtils.isEmpty(jSONObject.getString(a.ATOM_EXT_UDL_object_fit)) || !StringUtils.isEmpty(jSONObject.getString("objectFit"))) {
                this.mObjectFit = StringUtils.isEmpty(jSONObject.getString(a.ATOM_EXT_UDL_object_fit)) ? jSONObject.getString("objectFit") : jSONObject.getString(a.ATOM_EXT_UDL_object_fit);
            }
            if (!StringUtils.isEmpty(jSONObject.getString(MusLiveVideo.ATTR_MUTE))) {
                this.mMuted = Boolean.parseBoolean(jSONObject.getString(MusLiveVideo.ATTR_MUTE));
            }
            if (!StringUtils.isEmpty(jSONObject.getString("autoplay"))) {
                this.mAutoplay = Boolean.parseBoolean(jSONObject.getString("autoplay"));
            }
            if (!StringUtils.isEmpty(jSONObject.getString("min-cache")) || !StringUtils.isEmpty(jSONObject.getString("minCache"))) {
                this.mMinCache = Float.parseFloat(StringUtils.isEmpty(jSONObject.getString("min-cache")) ? jSONObject.getString("minCache") : jSONObject.getString("min-cache"));
            }
            if (StringUtils.isEmpty(jSONObject.getString("max-cache")) && StringUtils.isEmpty(jSONObject.getString("maxCache"))) {
                return;
            }
            this.mMaxCache = Float.parseFloat(StringUtils.isEmpty(jSONObject.getString("max-cache")) ? jSONObject.getString("maxCache") : jSONObject.getString("max-cache"));
        } catch (Exception unused) {
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.release();
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.release();
        this.mMediaPlayCenter.destroy();
    }

    private void initPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36df418", new Object[]{this});
        } else if (this.mMediaPlayCenter != null) {
        } else {
            this.mMediaPlayCenter = new MediaPlayCenter(this.mContextRef.get());
            this.mMediaPlayCenter.setUsingInterface(COMPONENT_NAME);
            if (!StringUtils.isEmpty(this.mFrom)) {
                this.mMediaPlayCenter.setBizCode(this.mFrom);
            }
            if (!StringUtils.isEmpty(this.mPlayScenes)) {
                this.mMediaPlayCenter.setPlayScenes(this.mPlayScenes);
            }
            this.mMediaPlayCenter.setMediaUrl(this.mSrc);
            if (a.ATOM_EXT_fill.equals(this.mObjectFit)) {
                this.mMediaPlayCenter.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
            } else {
                this.mMediaPlayCenter.setMediaAspectRatio(MediaAspectRatio.DW_FIT_CENTER);
            }
            this.mMediaPlayCenter.setPlayerType(3);
            this.mMediaPlayCenter.setScenarioType(0);
            this.mMediaPlayCenter.setEmbedLivePlay(true);
            this.mMediaPlayCenter.setNeedPlayControlView(false);
            this.mMediaPlayCenter.setConfigGroup("MediaLive");
            this.mMediaPlayCenter.setBusinessId("TBEmbedLive");
            this.mMediaPlayCenter.hideController();
            this.mMediaPlayCenter.setup();
            if (Constants.Value.HORIZONTAL.equals(this.mOrientation)) {
                this.mMediaPlayCenter.toggleScreen();
            }
            if (this.mAutoplay) {
                this.mMediaPlayCenter.start();
                sendState(BioError.RESULT_FAIL_EXIT);
            }
            this.mMediaPlayCenter.setMediaLifecycleListener(this);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else {
            sendState(2004);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            sendState(2004);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else if (-400 > i && i > -500) {
            sendError(i.ACTIONBAR_MENU_RIGHT);
        } else if (-500 >= i && i > -600) {
            sendError(i.ACTIONBAR_MENU_LIST);
        } else if (i == -5) {
            sendError(1008);
        } else {
            sendError(1023);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        } else if (mediaPlayScreenType == MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) {
            sendFullScreenChange(true, true);
        } else if (mediaPlayScreenType == MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
            sendFullScreenChange(false, true);
        } else if (mediaPlayScreenType != MediaPlayScreenType.NORMAL) {
        } else {
            sendFullScreenChange(false, false);
        }
    }

    public void setRequestHeader(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39f9d24", new Object[]{this, map});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setRequestHeader(map);
    }
}

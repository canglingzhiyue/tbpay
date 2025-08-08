package com.taobao.search.musie.livevideo.video;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class MusLiveVideo extends UINode implements p.b, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_AUTO_PLAY = "autoplay";
    public static final String ATTR_BIZ_FROM = "bizFrom";
    public static final String ATTR_CONTENT_ID = "contentId";
    public static final String ATTR_CONTROLS = "controls";
    public static final String ATTR_CONTROL_BY_LIST = "controlByList";
    public static final String ATTR_LOOP = "loop";
    public static final String ATTR_MUTE = "muted";
    public static final String ATTR_OBJECT_FIT = "objectFit";
    public static final String ATTR_PLAY_SCENES = "playScenes";
    public static final String ATTR_POSTER = "poster";
    public static final String ATTR_SHOW_CENTER_PLAY_BTN = "showCenterPlayBtn";
    public static final String ATTR_SHOW_FULLSCREEN_BTN = "showFullscreenBtn";
    public static final String ATTR_SHOW_MUTE_BTN = "showMuteBtn";
    public static final String ATTR_SHOW_PLAY_BTN = "showPlayBtn";
    public static final String ATTR_SRC = "src";
    public static final String ATTR_UT_PARAMS = "utParams";
    public static final String ATTR_VIDEO_ID = "videoId";
    private static final String EVENT_ENDED = "ended";
    private static final String EVENT_ERROR = "error";
    private static final String EVENT_PAUSE = "pause";
    private static final String EVENT_PLAY = "play";
    private static final String EVENT_TIME_UPDATE = "timeupdate";
    private static String KEY_CURRENT_TIME = null;
    private static String KEY_DETAIL = null;
    private static String KEY_VIDEO_DURATION = null;
    public static final String STATUS_FINISH = "finish";
    public static final String STATUS_PLAY = "play";
    public static final String STATUS_START = "start";
    public static final String STATUS_STOP = "stop";
    public static final String VIDEO_CALLBACK = "videocallback";
    public static final String VIDEO_STATUS = "videostatus";
    public static final String VISIBILITY_STATUS = "visibility";
    private boolean autoplayed;
    public boolean controlByList;
    private String currState;
    private boolean needRemount;
    private boolean paused;

    public static /* synthetic */ Object ipc$super(MusLiveVideo musLiveVideo, String str, Object... objArr) {
        if (str.hashCode() == -370110026) {
            super.collectBatchTasks((List) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(MusLiveVideo musLiveVideo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9edf2bb6", new Object[]{musLiveVideo})).booleanValue() : musLiveVideo.mounted;
    }

    public static /* synthetic */ boolean access$100(MusLiveVideo musLiveVideo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5954cc37", new Object[]{musLiveVideo})).booleanValue() : musLiveVideo.needRemount;
    }

    public static /* synthetic */ boolean access$102(MusLiveVideo musLiveVideo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd4d03c3", new Object[]{musLiveVideo, new Boolean(z)})).booleanValue();
        }
        musLiveVideo.needRemount = z;
        return z;
    }

    static {
        kge.a(-680940684);
        kge.a(-1349479784);
        kge.a(1810451999);
        KEY_DETAIL = "detail";
        KEY_VIDEO_DURATION = "videoDuration";
        KEY_CURRENT_TIME = "currentTime";
    }

    public MusLiveVideo(int i) {
        super(i);
        this.paused = true;
        this.autoplayed = false;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @MUSNodeProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }

    @MUSNodeProp(name = "src", refresh = true)
    public void setSrcRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea1cc2a", new Object[]{this, str});
            return;
        }
        if (this.mounted) {
            this.needRemount = true;
        }
        this.autoplayed = false;
    }

    @MUSNodeProp(name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("loop", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = ATTR_MUTE)
    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(ATTR_MUTE, Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = ATTR_MUTE, refresh = true)
    public void setMuteRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9e026d", new Object[]{this, new Boolean(z)});
        } else if (!this.mounted) {
        } else {
            ((MUSLiveVideoView) getMountContent()).mute(z);
        }
    }

    @MUSNodeProp(name = "controls")
    public void setControls(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78a5cf5", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("controls", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "autoplay")
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "videoId")
    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            setAttribute("videoId", str);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = ATTR_CONTROL_BY_LIST)
    public void setControlByList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908be11d", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(ATTR_CONTROL_BY_LIST, Boolean.valueOf(z));
        }
    }

    public boolean isControlByList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4805bcd3", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute(ATTR_CONTROL_BY_LIST);
        return bool == null || bool.booleanValue();
    }

    @MUSNodeProp(name = ATTR_PLAY_SCENES)
    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            setAttribute(ATTR_PLAY_SCENES, str);
        }
    }

    @MUSNodeProp(name = "bizFrom")
    public void setBizFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4dd4ec", new Object[]{this, str});
        } else {
            setAttribute("bizFrom", str);
        }
    }

    @MUSNodeProp(name = "contentId")
    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            setAttribute("contentId", str);
        }
    }

    @MUSNodeProp(name = "utParams")
    public void setUtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fabc22", new Object[]{this, jSONObject});
        } else {
            setAttribute("utParams", jSONObject);
        }
    }

    @MUSNodeProp(name = ATTR_POSTER)
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        } else {
            setAttribute(ATTR_POSTER, str);
        }
    }

    @MUSNodeProp(name = "objectFit")
    public void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else {
            setAttribute("objectFit", str);
        }
    }

    @MUSNodeProp(name = ATTR_SHOW_FULLSCREEN_BTN)
    public void setShowFullscreenBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fe940b", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(ATTR_SHOW_FULLSCREEN_BTN, Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = ATTR_SHOW_PLAY_BTN)
    public void setShowPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6dedc4", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(ATTR_SHOW_PLAY_BTN, Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = ATTR_SHOW_CENTER_PLAY_BTN)
    public void setShowCenterPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8aa6379", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(ATTR_SHOW_CENTER_PLAY_BTN, Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = ATTR_SHOW_MUTE_BTN)
    public void setShowMuteBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7dffa9", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(ATTR_SHOW_MUTE_BTN, Boolean.valueOf(z));
        }
    }

    @MUSMethod(uiThread = true)
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView == null) {
            return;
        }
        mUSLiveVideoView.play();
    }

    @MUSMethod(uiThread = true)
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView == null) {
            return;
        }
        mUSLiveVideoView.pause();
    }

    @MUSMethod(uiThread = true)
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView == null) {
            return;
        }
        mUSLiveVideoView.seekTo(i);
    }

    @MUSMethod(uiThread = true)
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView == null) {
            return;
        }
        mUSLiveVideoView.stop();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new MUSLiveVideoView(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        registerNativeStateListener("videostatus", this);
        registerNativeStateListener("visibility", this);
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) obj;
        mUSLiveVideoView.mount(this, mUSDKInstance, this, getContentWidth(), getContentHeight(), getPadding());
        autoPlayVideo(mUSLiveVideoView);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void collectBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        super.collectBatchTasks(arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        list.addAll(arrayList);
        list.add(new o() { // from class: com.taobao.search.musie.livevideo.video.MusLiveVideo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (MusLiveVideo.access$000(MusLiveVideo.this) && MusLiveVideo.access$100(MusLiveVideo.this)) {
                    MusLiveVideo musLiveVideo = MusLiveVideo.this;
                    musLiveVideo.onMount(musLiveVideo.getInstance(), MusLiveVideo.this.getMountContent());
                }
                MusLiveVideo.access$102(MusLiveVideo.this, false);
            }
        });
    }

    public void autoPlayVideo(MUSLiveVideoView mUSLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6c8995", new Object[]{this, mUSLiveVideoView});
            return;
        }
        this.controlByList = isControlByList();
        this.currState = getInstance().getNativeState("videostatus");
        if (isNativeStateDisappear()) {
            return;
        }
        if (this.controlByList) {
            if (StringUtils.equals(this.currState, "play")) {
                mUSLiveVideoView.play();
            } else {
                stop();
            }
        } else if (!isAutoPlay() || this.autoplayed) {
        } else {
            this.autoplayed = true;
            mUSLiveVideoView.play();
        }
    }

    public boolean isAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("autoplay");
        return bool != null && bool.booleanValue();
    }

    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute(ATTR_MUTE);
        return bool != null && bool.booleanValue();
    }

    public boolean isLoop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57340079", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("loop");
        return bool != null && bool.booleanValue();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        unregisterNativeStateListener("videostatus", this);
        unregisterNativeStateListener("visibility", this);
        ((MUSLiveVideoView) obj).unmount(mUSDKInstance);
        if (this.paused) {
            return;
        }
        this.paused = true;
        if (!hasEvent("pause")) {
            return;
        }
        fireEvent("pause", null);
    }

    @Override // com.taobao.search.musie.livevideo.video.a
    public void onVideoProgressChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115f132", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (hasEvent(EVENT_TIME_UPDATE)) {
            fireEvent(EVENT_TIME_UPDATE, assembleEvent(i2, i));
        }
        if (getInstance() == null || getInstance().isDestroyed() || getMountContent() == null) {
            return;
        }
        ((MUSLiveVideoView) getMountContent()).hidePoster();
    }

    private JSONObject assembleEvent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a09182f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(KEY_CURRENT_TIME, (Object) Float.valueOf(i2 / 1000.0f));
        jSONObject2.put(KEY_VIDEO_DURATION, (Object) Float.valueOf(i / 1000.0f));
        jSONObject.put(KEY_DETAIL, (Object) jSONObject2);
        return jSONObject;
    }

    @Override // com.taobao.search.musie.livevideo.video.a
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView != null) {
            mUSLiveVideoView.onPlayed();
        }
        if (this.paused) {
            this.paused = false;
            if (hasEvent("play")) {
                fireEvent("play", null);
            }
        }
        getInstance().fireNativeEvent("videocallback", "start");
    }

    @Override // com.taobao.search.musie.livevideo.video.a
    public void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
        } else if (this.paused) {
        } else {
            this.paused = true;
            if (!hasEvent("pause")) {
                return;
            }
            fireEvent("pause", null);
        }
    }

    @Override // com.taobao.search.musie.livevideo.video.a
    public void onVideoFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d2b296", new Object[]{this});
        } else if (isLoop()) {
        } else {
            stop();
            fireVideoFinish();
        }
    }

    public void fireVideoFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce68315f", new Object[]{this});
            return;
        }
        if (!this.paused) {
            this.paused = true;
            if (hasEvent(EVENT_ENDED)) {
                fireEvent(EVENT_ENDED, null);
            }
        }
        getInstance().fireNativeEvent("videocallback", "finish");
    }

    @Override // com.taobao.search.musie.livevideo.video.a
    public void onVideoFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4f4ea1", new Object[]{this});
            return;
        }
        g.f("Video", "Video Play Error");
        if (m.c()) {
            g.e("Video Play Error");
        }
        if (!hasEvent("error")) {
            return;
        }
        fireEvent("error", null);
    }

    @Override // com.taobao.android.weex_framework.p.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (StringUtils.equals(str, "visibility")) {
            if ("disappear".equals(str2)) {
                stop();
                onVideoStop();
                return;
            }
            tryControlByListByState(getInstance().getNativeState("videostatus"));
        } else if (isNativeStateDisappear()) {
        } else {
            this.currState = str2;
            tryControlByListByState(str2);
        }
    }

    private void tryControlByListByState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a4b174", new Object[]{this, str});
        } else if (!isControlByList()) {
        } else {
            if (StringUtils.equals(str, "play")) {
                play();
            } else if (!StringUtils.equals(str, "stop")) {
            } else {
                stop();
                onVideoStop();
            }
        }
    }

    private boolean isNativeStateDisappear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("761df15e", new Object[]{this})).booleanValue() : "disappear".equals(getInstance().getNativeState("visibility"));
    }
}

package com.taobao.livephoto.weex;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.JSSetter;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.livephoto.LivePhotoView;
import com.taobao.livephoto.c;
import com.taobao.livephoto.d;
import com.taobao.tlog.adapter.AdapterForTLog;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class LivePhotoWeexView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROP_BIZ_CODE = "bizCode";
    private static final String PROP_CONTENT_MODE = "contentMode";
    private static final String PROP_CURRENT_IMAGE = "currentImage";
    private static final String PROP_HIDE_ICON = "hideIcon";
    private static final String PROP_ICON_FRAME = "iconFrame";
    private static final String PROP_IMAGE_URL = "imageUrl";
    private static final String PROP_IS_PLAYING = "isPlaying";
    private static final String PROP_LIVE_PHOTO_INFO = "livePhotoInfo";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_VIDEO_URL = "videoUrl";
    private static final String TAG = "WeexLivePhotoView";
    private int contentMode;
    private b gmGetVideoPathCallback;
    private boolean isMuted;
    private b mGetImagePathCallback;
    private LivePhotoView mLivePhotoView;

    static {
        kge.a(-1662155782);
    }

    public static /* synthetic */ Object ipc$super(LivePhotoWeexView livePhotoWeexView, String str, Object... objArr) {
        if (str.hashCode() == -346507292) {
            super.onUpdateAttrs((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(LivePhotoWeexView livePhotoWeexView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b2621d", new Object[]{livePhotoWeexView, new Integer(i), str});
        } else {
            livePhotoWeexView.sendEvent(i, str);
        }
    }

    public static /* synthetic */ b access$100(LivePhotoWeexView livePhotoWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c534c4be", new Object[]{livePhotoWeexView}) : livePhotoWeexView.mGetImagePathCallback;
    }

    public static /* synthetic */ b access$102(LivePhotoWeexView livePhotoWeexView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f53a04c9", new Object[]{livePhotoWeexView, bVar});
        }
        livePhotoWeexView.mGetImagePathCallback = bVar;
        return bVar;
    }

    public static /* synthetic */ b access$200(LivePhotoWeexView livePhotoWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ed7b04ff", new Object[]{livePhotoWeexView}) : livePhotoWeexView.gmGetVideoPathCallback;
    }

    public static /* synthetic */ b access$202(LivePhotoWeexView livePhotoWeexView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bff1a78a", new Object[]{livePhotoWeexView, bVar});
        }
        livePhotoWeexView.gmGetVideoPathCallback = bVar;
        return bVar;
    }

    public static /* synthetic */ void access$300(LivePhotoWeexView livePhotoWeexView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345901b3", new Object[]{livePhotoWeexView, str, obj});
        } else {
            livePhotoWeexView.fireEvent(str, obj);
        }
    }

    public LivePhotoWeexView(Context context, int i) {
        super(context, i);
        this.contentMode = 2;
        this.isMuted = true;
        this.gmGetVideoPathCallback = null;
        this.mGetImagePathCallback = null;
        this.mLivePhotoView = new LivePhotoView(context);
        this.mLivePhotoView.addListener(createLivePhotoListener());
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        AdapterForTLog.loge(TAG, "getView");
        return this.mLivePhotoView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.destroy();
        this.mLivePhotoView = null;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onUpdateAttrs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb58b7e4", new Object[]{this, map});
            return;
        }
        super.onUpdateAttrs(map);
        AdapterForTLog.loge(TAG, "onUpdateAttrs ： " + map);
        setLivePhotoInfo(map.get(PROP_LIVE_PHOTO_INFO));
        if (map.get("bizCode") != null) {
            setBizCode(map.get("bizCode"));
        }
        if (map.get("imageUrl") != null) {
            setImageUrl(map.get("imageUrl"));
        }
        if (map.get("videoUrl") != null) {
            setVideoUrl(map.get("videoUrl"));
        }
        if (map.get(PROP_ICON_FRAME) != null) {
            setIconFrame(map.get(PROP_ICON_FRAME));
        }
        if (map.get("muted") != null) {
            setIsMuted(Boolean.parseBoolean(map.get("muted")));
        }
        if (map.get(PROP_HIDE_ICON) != null) {
            setHideIcon(Boolean.parseBoolean(map.get(PROP_HIDE_ICON)));
        }
        if (map.get(PROP_CONTENT_MODE) == null) {
            return;
        }
        try {
            setContentMode(Integer.parseInt(map.get(PROP_CONTENT_MODE)));
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "onUpdateAttrs setContentMode error: ", e);
        }
    }

    @JSSetter(name = PROP_LIVE_PHOTO_INFO)
    public void setLivePhotoInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecedf243", new Object[]{this, str});
        } else if (this.mLivePhotoView == null || StringUtils.isEmpty(str)) {
        } else {
            try {
                this.mLivePhotoView.setLivePhotoInfo(new JSONObject(str));
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "setLivePhotoInfo error: ", e);
            }
        }
    }

    @JSSetter(name = "bizCode")
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.setBizCode(str);
    }

    @JSSetter(name = "imageUrl")
    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.setImageUrl(str);
    }

    @JSSetter(name = "videoUrl")
    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.setVideoUrl(str);
    }

    @JSSetter(name = PROP_HIDE_ICON)
    public void setHideIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95995f0", new Object[]{this, new Boolean(z)});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.setLiveIconVisible(!z);
    }

    @JSSetter(name = PROP_ICON_FRAME)
    public void setIconFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c313b43", new Object[]{this, str});
        } else if (this.mLivePhotoView == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("x");
                int optInt2 = jSONObject.optInt("y");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(jSONObject.optInt("width"), jSONObject.optInt("height"));
                layoutParams.leftMargin = optInt;
                layoutParams.topMargin = optInt2;
                this.mLivePhotoView.setLiveIconLayoutParams(layoutParams);
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "setIconFrame error: ", e);
            }
        }
    }

    @JSSetter(name = "muted")
    public void setIsMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5082ee", new Object[]{this, new Boolean(z)});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.setIsMute(z);
        this.isMuted = z;
    }

    @JSSetter(name = PROP_CONTENT_MODE)
    public void setContentMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ecab3a2", new Object[]{this, new Integer(i)});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        if (i == 1) {
            livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_FIT_CENTER);
            this.contentMode = 1;
        } else if (i == 2) {
            livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_CENTER_CROP);
            this.contentMode = 2;
        } else if (i != 3) {
        } else {
            livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_FIT_X_Y);
            this.contentMode = 3;
        }
    }

    @JSGetter(name = "muted")
    public boolean getMuted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44bd39c0", new Object[]{this})).booleanValue() : this.isMuted;
    }

    @JSGetter(name = PROP_IS_PLAYING)
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return false;
        }
        return livePhotoView.isPlaying();
    }

    @JSGetter(name = "imageUrl")
    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        return livePhotoView != null ? livePhotoView.getCoverPath() : "";
    }

    @JSGetter(name = PROP_CURRENT_IMAGE)
    public String getCurrentImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("849e3421", new Object[]{this});
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        return livePhotoView != null ? livePhotoView.getCoverPath() : "";
    }

    @JSGetter(name = "videoUrl")
    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        return livePhotoView != null ? livePhotoView.getVideoPath() : "";
    }

    @JSGetter(name = PROP_CONTENT_MODE)
    public int getContentMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fd51600", new Object[]{this})).intValue() : this.contentMode;
    }

    @JSMethod
    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.prepare();
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        AdapterForTLog.logd(TAG, "play()");
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        try {
            livePhotoView.start();
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "mLivePhotoView start error: ", th);
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.stop();
    }

    @JSMethod
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.stop();
    }

    @JSMethod
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        livePhotoView.destroy();
        this.contentMode = 2;
        this.isMuted = true;
    }

    @JSMethod
    public void updateLivePhotoInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52eda47c", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        try {
            livePhotoView.setLivePhotoInfo(new JSONObject(str));
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "setLivePhotoInfo error: ", e);
        }
    }

    @JSMethod
    public void getLocalImagePath(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9c8609", new Object[]{this, bVar});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        String coverPath = livePhotoView.getCoverPath();
        if (!StringUtils.isEmpty(coverPath)) {
            HashMap hashMap = new HashMap();
            hashMap.put("path", coverPath);
            bVar.a(MUSValue.ofJSON(hashMap));
            return;
        }
        this.mGetImagePathCallback = bVar;
        this.mLivePhotoView.loadVideoAndImagePath();
    }

    @JSMethod
    public void getLocalVideoPath(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f58a129", new Object[]{this, bVar});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        String videoPath = livePhotoView.getVideoPath();
        if (!StringUtils.isEmpty(videoPath)) {
            HashMap hashMap = new HashMap();
            hashMap.put("path", videoPath);
            bVar.a(MUSValue.ofJSON(hashMap));
            return;
        }
        this.gmGetVideoPathCallback = bVar;
        this.mLivePhotoView.loadVideoAndImagePath();
    }

    private d createLivePhotoListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("14167638", new Object[]{this}) : new c() { // from class: com.taobao.livephoto.weex.LivePhotoWeexView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.livephoto.c, com.taobao.avplayer.bn
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                LivePhotoWeexView.access$000(LivePhotoWeexView.this, 0, str);
                if (LivePhotoWeexView.access$100(LivePhotoWeexView.this) == null || StringUtils.isEmpty(str)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("path", str);
                LivePhotoWeexView.access$100(LivePhotoWeexView.this).a(MUSValue.ofJSON(hashMap));
                LivePhotoWeexView.access$102(LivePhotoWeexView.this, null);
            }

            @Override // com.taobao.livephoto.c, com.taobao.avplayer.bn
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                } else if (LivePhotoWeexView.access$200(LivePhotoWeexView.this) == null || StringUtils.isEmpty(str)) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("path", str);
                    LivePhotoWeexView.access$200(LivePhotoWeexView.this).a(MUSValue.ofJSON(hashMap));
                    LivePhotoWeexView.access$202(LivePhotoWeexView.this, null);
                }
            }

            @Override // com.taobao.livephoto.c, com.taobao.avplayer.aw
            public void onVideoPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                } else {
                    LivePhotoWeexView.access$000(LivePhotoWeexView.this, 1, "");
                }
            }

            @Override // com.taobao.livephoto.c, com.taobao.avplayer.aw
            public void onVideoComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                } else {
                    LivePhotoWeexView.access$000(LivePhotoWeexView.this, 4, "");
                }
            }

            @Override // com.taobao.livephoto.c, com.taobao.avplayer.aw
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                LivePhotoWeexView livePhotoWeexView = LivePhotoWeexView.this;
                LivePhotoWeexView.access$000(livePhotoWeexView, 5, "what: " + i + ", extra: " + i2);
            }
        };
    }

    private void sendEvent(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2d11f4", new Object[]{this, new Integer(i), str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.livephoto.weex.LivePhotoWeexView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event", i);
                        jSONObject.put("info", str);
                        LivePhotoWeexView.access$300(LivePhotoWeexView.this, "eventCallback", jSONObject);
                        AdapterForTLog.logd(LivePhotoWeexView.TAG, "fireEvent: " + i + ", " + str);
                    } catch (JSONException e) {
                        AdapterForTLog.loge(LivePhotoWeexView.TAG, "onCoverImgSavedCompleted error: ", e);
                    }
                }
            });
        }
    }
}

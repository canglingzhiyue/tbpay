package com.taobao.android.detail.core.standard.mainpic.weex;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.m;
import com.taobao.android.detail.core.standard.video.n;
import com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar;
import com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBarTouchLayout;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.ArrayList;
import java.util.List;
import tb.arc;
import tb.ard;
import tb.bay;
import tb.elq;
import tb.elr;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryLightOffVideoComponent extends WXComponent<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLAZZ_NAME = "lightOffVideo";
    private static final int DISMISS_VIDEO_CONTROLLER_UI = 1;
    public static final String KEY_ATTACHED_BY_LIGHT_OFF = "attachedByLightOff";
    public static final String KEY_LAST_VIDEO_CONTAINER = "lastVideoContainer";
    public static final String KEY_LAST_VIDEO_FROM_MINI_WINDOW = "lastVideoFromMiniWindow";
    private static final int WEEX_STANDARD_WIDTH = 750;
    private ViewGroup mLastVideoContainer;
    private int mLastVideoHeight;
    private List<AbsPicGalleryVideoPlayer.b> mLastVideoUserBehaviorListeners;
    private int mLastVideoWidth;
    private String mLightOffToken;
    private FrameLayout mLightOffVideoContainer;
    private PicGalleryProgressBar mLightOffVideoControllerProgressBar;
    private FrameLayout mLightOffVideoControllerUI;
    private ProgressBar mLightOffVideoMiniProgressBar;
    private ImageButton mLightOffVideoPlayBtn;
    private FrameLayout mLightOffVideoPlayerLayout;
    private AbsPicGalleryVideoPlayer.a mLightOffVideoStatusChangeListener;
    private AbsPicGalleryVideoPlayer.b mLightOffVideoUserBehaviorListener;
    private Handler mUIHandler;
    private String mUrl;
    private int mVideoHeight;
    private String mVideoId;
    private String mVideoThumbnailUrl;
    private int mVideoWidth;
    private boolean mbLastVideoMute;

    static {
        kge.a(518591526);
    }

    public static /* synthetic */ Object ipc$super(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$1000(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ca35b5", new Object[]{picGalleryLightOffVideoComponent});
        } else {
            picGalleryLightOffVideoComponent.showVideoControllerUI();
        }
    }

    public static /* synthetic */ AbsPicGalleryVideoPlayer access$1100(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("2a14600e", new Object[]{picGalleryLightOffVideoComponent}) : picGalleryLightOffVideoComponent.findVideoPlayer();
    }

    public static /* synthetic */ void access$1200(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224a9cf3", new Object[]{picGalleryLightOffVideoComponent});
        } else {
            picGalleryLightOffVideoComponent.delayHideVideoControllerUI();
        }
    }

    public static /* synthetic */ void access$200(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef8f702", new Object[]{picGalleryLightOffVideoComponent});
        } else {
            picGalleryLightOffVideoComponent.hideVideoControllerUI();
        }
    }

    public static /* synthetic */ ImageButton access$500(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageButton) ipChange.ipc$dispatch("12c270e4", new Object[]{picGalleryLightOffVideoComponent}) : picGalleryLightOffVideoComponent.mLightOffVideoPlayBtn;
    }

    public static /* synthetic */ String access$600(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff301ae2", new Object[]{picGalleryLightOffVideoComponent}) : picGalleryLightOffVideoComponent.mVideoId;
    }

    public static /* synthetic */ PicGalleryProgressBar access$700(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PicGalleryProgressBar) ipChange.ipc$dispatch("a8519cd1", new Object[]{picGalleryLightOffVideoComponent}) : picGalleryLightOffVideoComponent.mLightOffVideoControllerProgressBar;
    }

    public static /* synthetic */ ProgressBar access$800(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("b716d0ce", new Object[]{picGalleryLightOffVideoComponent}) : picGalleryLightOffVideoComponent.mLightOffVideoMiniProgressBar;
    }

    public static /* synthetic */ FrameLayout access$900(PicGalleryLightOffVideoComponent picGalleryLightOffVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("870f479e", new Object[]{picGalleryLightOffVideoComponent}) : picGalleryLightOffVideoComponent.mLightOffVideoControllerUI;
    }

    public PicGalleryLightOffVideoComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mLastVideoUserBehaviorListeners = new ArrayList();
        this.mLightOffVideoStatusChangeListener = new a();
        this.mLightOffVideoUserBehaviorListener = new b();
        this.mUIHandler = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffVideoComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (message.what != 1) {
                } else {
                    PicGalleryLightOffVideoComponent.access$200(PicGalleryLightOffVideoComponent.this);
                }
            }
        };
        initLayout(wXSDKInstance.O());
        emu.a("com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffVideoComponent");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView */
    public View mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context});
        }
        if (this.mLightOffVideoPlayerLayout.getParent() != null) {
            ((ViewGroup) this.mLightOffVideoPlayerLayout.getParent()).removeView(this.mLightOffVideoPlayerLayout);
        }
        return this.mLightOffVideoPlayerLayout;
    }

    @WXComponentProp(name = "lightOffToken")
    public void setLightOffToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6e27cf", new Object[]{this, str});
        } else {
            this.mLightOffToken = str;
        }
    }

    @WXComponentProp(name = "videoId")
    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            this.mVideoId = str;
        }
    }

    @WXComponentProp(name = "dimension")
    public void setDimension(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98026b5", new Object[]{this, str});
            return;
        }
        float f = 1.0f;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split(":");
                f = Float.parseFloat(split[0]) / Float.parseFloat(split[1]);
            } catch (Exception unused) {
                ard a2 = arc.a();
                a2.c("PicGalleryLightOffVideoComponent", "setDimension", "parse dimension failed:" + str);
            }
        }
        this.mVideoWidth = bay.b() * (getViewPortWidth() / 750);
        this.mVideoHeight = (int) (this.mVideoWidth / f);
    }

    @WXComponentProp(name = "url")
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.mUrl = str;
        }
    }

    @WXComponentProp(name = "videoThumbnailUrl")
    public void setVideoThumbnailUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa38264d", new Object[]{this, str});
        } else {
            this.mVideoThumbnailUrl = str;
        }
    }

    @JSMethod
    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        ard a2 = arc.a();
        String str = this.mVideoId;
        if (str == null) {
            str = "";
        }
        a2.a("PicGalleryLightOffVideoComponent", Constants.Event.SLOT_LIFECYCLE.ATTACH, str);
        AbsPicGalleryVideoPlayer findVideoPlayer = findVideoPlayer();
        if (findVideoPlayer == null) {
            findVideoPlayer = generateVideoPlayer();
        }
        attachVideoPlayer(findVideoPlayer);
    }

    @JSMethod
    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        ard a2 = arc.a();
        String str = this.mVideoId;
        if (str == null) {
            str = "";
        }
        a2.a("PicGalleryLightOffVideoComponent", "detach", str);
        detachVideoPlayer(findVideoPlayer());
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        ard a2 = arc.a();
        String str = this.mVideoId;
        if (str == null) {
            str = "";
        }
        a2.a("PicGalleryLightOffVideoComponent", "play", str);
        AbsPicGalleryVideoPlayer findVideoPlayer = findVideoPlayer();
        if (findVideoPlayer == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "play", "videoPlayer is null");
        } else {
            findVideoPlayer.a();
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ard a2 = arc.a();
        String str = this.mVideoId;
        if (str == null) {
            str = "";
        }
        a2.a("PicGalleryLightOffVideoComponent", "pause", str);
        AbsPicGalleryVideoPlayer findVideoPlayer = findVideoPlayer();
        if (findVideoPlayer == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "pause", "videoPlayer is null");
        } else {
            findVideoPlayer.b();
        }
    }

    private void initLayout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f77307", new Object[]{this, context});
            return;
        }
        this.mLightOffVideoPlayerLayout = (FrameLayout) View.inflate(context, R.layout.pic_gallery_light_off_video_player_layout, null);
        this.mLightOffVideoContainer = (FrameLayout) this.mLightOffVideoPlayerLayout.findViewById(R.id.lightOffVideoContainer);
        this.mLightOffVideoMiniProgressBar = (ProgressBar) this.mLightOffVideoPlayerLayout.findViewById(R.id.lightOffVideoMiniProgressBar);
        this.mLightOffVideoControllerUI = (FrameLayout) this.mLightOffVideoPlayerLayout.findViewById(R.id.lightOffVideoControllerUI);
        this.mLightOffVideoPlayBtn = (ImageButton) this.mLightOffVideoPlayerLayout.findViewById(R.id.lightOffVideoPlayBtn);
        this.mLightOffVideoPlayBtn.setOnClickListener(new d());
        this.mLightOffVideoControllerProgressBar = (PicGalleryProgressBar) this.mLightOffVideoPlayerLayout.findViewById(R.id.lightOffVideoControllerProgressBar);
        this.mLightOffVideoControllerProgressBar.setShowVideoProgressBarWhenTouchDown(true);
        this.mLightOffVideoControllerProgressBar.setContinueShowVideoProgressBarWhenTouchUp(true);
        this.mLightOffVideoControllerProgressBar.setProgressBarSlideListener(new c());
        resizeProgressBar();
        hideVideoControllerUI();
    }

    private void showVideoControllerUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68258b55", new Object[]{this});
            return;
        }
        this.mLightOffVideoControllerUI.setVisibility(0);
        this.mLightOffVideoMiniProgressBar.setVisibility(8);
        delayHideVideoControllerUI();
    }

    private void hideVideoControllerUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108b1630", new Object[]{this});
            return;
        }
        this.mLightOffVideoControllerUI.setVisibility(8);
        this.mLightOffVideoMiniProgressBar.setVisibility(0);
        this.mUIHandler.removeMessages(1);
    }

    private void delayHideVideoControllerUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1865ed", new Object[]{this});
            return;
        }
        this.mUIHandler.removeMessages(1);
        this.mUIHandler.sendEmptyMessageDelayed(1, 3000L);
    }

    private void resizeProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e168d4d9", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.mLightOffVideoControllerProgressBar.findViewById(R.id.frameProgressBarContainer);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.bottomMargin = bay.a(15.0f);
        linearLayout.setLayoutParams(layoutParams);
        SeekBar seekBar = (SeekBar) this.mLightOffVideoControllerProgressBar.findViewById(R.id.videoProgressBar);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) seekBar.getLayoutParams();
        layoutParams2.bottomMargin = bay.a(15.0f);
        seekBar.setLayoutParams(layoutParams2);
        PicGalleryProgressBarTouchLayout picGalleryProgressBarTouchLayout = (PicGalleryProgressBarTouchLayout) this.mLightOffVideoControllerProgressBar.findViewById(R.id.progressBarTouchArea);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) picGalleryProgressBarTouchLayout.getLayoutParams();
        layoutParams3.height = bay.a(36.0f);
        picGalleryProgressBarTouchLayout.setLayoutParams(layoutParams3);
        TextView textView = (TextView) this.mLightOffVideoControllerProgressBar.findViewById(R.id.videoProgressTimeTv);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams4.bottomMargin = bay.a(34.0f);
        textView.setLayoutParams(layoutParams4);
    }

    private com.taobao.android.detail.core.standard.video.d findVideoManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.standard.video.d) ipChange.ipc$dispatch("3268a6a0", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mLightOffToken) || TextUtils.isEmpty(this.mVideoId)) {
            arc.a().c("PicGalleryLightOffVideoComponent", "findVideoManager", "mLightOffToken or mVideoId is empty");
            return null;
        }
        elq a2 = elr.a(this.mLightOffToken);
        if (a2 == null) {
            ard a3 = arc.a();
            a3.c("PicGalleryLightOffVideoComponent", "findVideoManager", "can't find picGalleryAuraPresenter,token:" + this.mLightOffToken);
            return null;
        }
        return a2.h();
    }

    private AbsPicGalleryVideoPlayer findVideoPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("8d5df5d8", new Object[]{this});
        }
        com.taobao.android.detail.core.standard.video.d findVideoManager = findVideoManager();
        if (findVideoManager == null) {
            ard a2 = arc.a();
            StringBuilder sb = new StringBuilder();
            sb.append("can't find picGalleryVideoManager,token:");
            String str = this.mLightOffToken;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            a2.c("PicGalleryLightOffVideoComponent", "findVideoPlayer", sb.toString());
            return null;
        }
        return findVideoManager.a(this.mVideoId);
    }

    private AbsPicGalleryVideoPlayer generateVideoPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("a55d8094", new Object[]{this});
        }
        m a2 = n.a(this.mVideoId, this.mUrl, this.mVideoThumbnailUrl, this.mVideoWidth, this.mVideoHeight);
        if (a2 == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "generateVideoPlayer", "can't generate video model");
            return null;
        }
        com.taobao.android.detail.core.standard.video.d findVideoManager = findVideoManager();
        if (findVideoManager == null) {
            ard a3 = arc.a();
            StringBuilder sb = new StringBuilder();
            sb.append("can't find picGalleryVideoManager,token:");
            String str = this.mLightOffToken;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            a3.c("PicGalleryLightOffVideoComponent", "generateVideoPlayer", sb.toString());
            return null;
        }
        return findVideoManager.a(a2);
    }

    private void attachVideoPlayer(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c8378a", new Object[]{this, absPicGalleryVideoPlayer});
        } else if (absPicGalleryVideoPlayer == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "attachVideoPlayer", "videoPlayer is null");
        } else {
            View o = absPicGalleryVideoPlayer.o();
            if (o == null) {
                arc.a().c("PicGalleryLightOffVideoComponent", "attachVideoPlayer", "playerView is null");
                return;
            }
            ViewParent parent = o.getParent();
            if (parent == this.mLightOffVideoContainer) {
                return;
            }
            storeLastVideoStatus(absPicGalleryVideoPlayer);
            if (parent != null) {
                ((ViewGroup) parent).removeView(o);
            }
            int i = this.mVideoWidth;
            if (i <= 0) {
                i = bay.b();
            }
            float d2 = absPicGalleryVideoPlayer.n().d() <= 0.0f ? 1.0f : absPicGalleryVideoPlayer.n().d();
            int i2 = this.mVideoHeight;
            if (i2 <= 0) {
                i2 = (int) (i / d2);
            }
            absPicGalleryVideoPlayer.a(i, i2);
            o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.mLightOffVideoContainer.addView(o);
            setupVideoStatusForLightOff(absPicGalleryVideoPlayer);
            o.setTag(R.id.standard_detail_gallery_weex_video, this);
        }
    }

    private void detachVideoPlayer(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9087e67c", new Object[]{this, absPicGalleryVideoPlayer});
        } else if (absPicGalleryVideoPlayer == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "detachVideoPlayer", "videoPlayer is null");
        } else {
            View o = absPicGalleryVideoPlayer.o();
            if (o == null) {
                arc.a().c("PicGalleryLightOffVideoComponent", "detachVideoPlayer", "playerView is null");
            } else if (o.getParent() != this.mLightOffVideoContainer) {
                arc.a().c("PicGalleryLightOffVideoComponent", "detachVideoPlayer", "playerView current is not add to mLightOffVideoContainer");
            } else {
                revertVideoStatusForLightOff(absPicGalleryVideoPlayer);
                this.mLightOffVideoContainer.removeView(o);
                if (this.mLastVideoContainer == null) {
                    this.mLastVideoContainer = (ViewGroup) absPicGalleryVideoPlayer.a(KEY_LAST_VIDEO_CONTAINER);
                    ViewGroup viewGroup = this.mLastVideoContainer;
                    if (viewGroup != null) {
                        this.mLastVideoWidth = viewGroup.getWidth();
                        this.mLastVideoHeight = this.mLastVideoContainer.getHeight();
                    }
                }
                if (this.mLastVideoContainer == null) {
                    return;
                }
                absPicGalleryVideoPlayer.a(this.mLastVideoWidth, this.mLastVideoHeight);
                o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.mLastVideoContainer.addView(o);
            }
        }
    }

    private void storeLastVideoStatus(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81715e09", new Object[]{this, absPicGalleryVideoPlayer});
        } else if (absPicGalleryVideoPlayer == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "storeLastVideoStatus", "videoPlayer is null");
        } else {
            View o = absPicGalleryVideoPlayer.o();
            if (o == null) {
                arc.a().c("PicGalleryLightOffVideoComponent", "storeLastVideoStatus", "playerView is null");
                return;
            }
            this.mLastVideoContainer = (ViewGroup) o.getParent();
            this.mLastVideoWidth = absPicGalleryVideoPlayer.u();
            this.mLastVideoHeight = absPicGalleryVideoPlayer.v();
            this.mbLastVideoMute = absPicGalleryVideoPlayer.g();
            this.mLastVideoUserBehaviorListeners.clear();
            com.taobao.android.detail.core.standard.video.d findVideoManager = findVideoManager();
            if (findVideoManager != null && findVideoManager.f() != null) {
                for (AbsPicGalleryVideoPlayer.b bVar : findVideoManager.f()) {
                    if (!(bVar instanceof b)) {
                        this.mLastVideoUserBehaviorListeners.add(bVar);
                    }
                }
            }
            absPicGalleryVideoPlayer.a(KEY_ATTACHED_BY_LIGHT_OFF, (Object) true);
        }
    }

    private void setupVideoStatusForLightOff(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce98f005", new Object[]{this, absPicGalleryVideoPlayer});
        } else if (absPicGalleryVideoPlayer == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "setupVideoStatusForLightOff", "videoPlayer is null");
        } else {
            absPicGalleryVideoPlayer.f();
            absPicGalleryVideoPlayer.l();
            this.mLightOffVideoControllerProgressBar.setVideoTime(absPicGalleryVideoPlayer.r());
            if (TextUtils.equals(absPicGalleryVideoPlayer.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
                this.mLightOffVideoPlayBtn.setImageResource(R.drawable.pic_gallery_video_player_pause_bg);
            } else {
                this.mLightOffVideoPlayBtn.setImageResource(R.drawable.pic_gallery_video_player_play_bg);
            }
            com.taobao.android.detail.core.standard.video.d findVideoManager = findVideoManager();
            if (findVideoManager == null) {
                return;
            }
            for (AbsPicGalleryVideoPlayer.b bVar : this.mLastVideoUserBehaviorListeners) {
                if (!(bVar instanceof b)) {
                    findVideoManager.b(bVar);
                }
            }
            findVideoManager.a(this.mLightOffVideoUserBehaviorListener);
            findVideoManager.a(this.mLightOffVideoStatusChangeListener);
        }
    }

    private void revertVideoStatusForLightOff(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ec4dac", new Object[]{this, absPicGalleryVideoPlayer});
        } else if (absPicGalleryVideoPlayer == null) {
            arc.a().c("PicGalleryLightOffVideoComponent", "revertVideoStatusForLightOff", "videoPlayer is null");
        } else {
            absPicGalleryVideoPlayer.b();
            if (this.mbLastVideoMute) {
                absPicGalleryVideoPlayer.e();
            }
            absPicGalleryVideoPlayer.k();
            com.taobao.android.detail.core.standard.video.d findVideoManager = findVideoManager();
            if (findVideoManager != null) {
                for (AbsPicGalleryVideoPlayer.b bVar : this.mLastVideoUserBehaviorListeners) {
                    findVideoManager.a(bVar);
                }
                findVideoManager.b(this.mLightOffVideoUserBehaviorListener);
                findVideoManager.b(this.mLightOffVideoStatusChangeListener);
            }
            absPicGalleryVideoPlayer.a(KEY_ATTACHED_BY_LIGHT_OFF, (Object) false);
        }
    }

    /* loaded from: classes4.dex */
    public class a implements AbsPicGalleryVideoPlayer.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1880134240);
            kge.a(-764126303);
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8fd815", new Object[]{this, absPicGalleryVideoPlayer, mVar, str, str2});
            }
        }

        private a() {
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            } else {
                PicGalleryLightOffVideoComponent.access$500(PicGalleryLightOffVideoComponent.this).setImageResource(R.drawable.pic_gallery_video_player_pause_bg);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            } else {
                PicGalleryLightOffVideoComponent.access$500(PicGalleryLightOffVideoComponent.this).setImageResource(R.drawable.pic_gallery_video_player_play_bg);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acda7ebf", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            } else {
                PicGalleryLightOffVideoComponent.access$500(PicGalleryLightOffVideoComponent.this).setImageResource(R.drawable.pic_gallery_video_player_play_bg);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
            } else if (!TextUtils.equals(mVar.a(), PicGalleryLightOffVideoComponent.access$600(PicGalleryLightOffVideoComponent.this))) {
            } else {
                if (PicGalleryLightOffVideoComponent.access$700(PicGalleryLightOffVideoComponent.this).getVideoTime() <= 0) {
                    PicGalleryLightOffVideoComponent.access$700(PicGalleryLightOffVideoComponent.this).setVideoTime(absPicGalleryVideoPlayer.r());
                }
                PicGalleryLightOffVideoComponent.access$800(PicGalleryLightOffVideoComponent.this).setProgress((int) (100.0f * f));
                PicGalleryLightOffVideoComponent.access$700(PicGalleryLightOffVideoComponent.this).setVideoProgress(f);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements AbsPicGalleryVideoPlayer.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(182967387);
            kge.a(1833674140);
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85c1373", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Boolean(z)});
            }
        }

        private b() {
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            } else if (!TextUtils.equals(mVar.a(), PicGalleryLightOffVideoComponent.access$600(PicGalleryLightOffVideoComponent.this))) {
            } else {
                if (PicGalleryLightOffVideoComponent.access$900(PicGalleryLightOffVideoComponent.this).getVisibility() == 0) {
                    PicGalleryLightOffVideoComponent.access$200(PicGalleryLightOffVideoComponent.this);
                } else {
                    PicGalleryLightOffVideoComponent.access$1000(PicGalleryLightOffVideoComponent.this);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2050208649);
            kge.a(-1201612728);
        }

        private d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            AbsPicGalleryVideoPlayer access$1100 = PicGalleryLightOffVideoComponent.access$1100(PicGalleryLightOffVideoComponent.this);
            if (access$1100 == null) {
                arc.a().c("PicGalleryLightOffVideoComponent", "InnerVideoPlayBtnClickListener.onClick", "videoPlayer is null");
                return;
            }
            if (TextUtils.equals(access$1100.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
                access$1100.b();
            } else {
                access$1100.a();
            }
            PicGalleryLightOffVideoComponent.access$1200(PicGalleryLightOffVideoComponent.this);
        }
    }

    /* loaded from: classes4.dex */
    public class c implements PicGalleryProgressBar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float b;

        static {
            kge.a(425137854);
            kge.a(583460123);
        }

        private c() {
        }

        @Override // com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            AbsPicGalleryVideoPlayer access$1100 = PicGalleryLightOffVideoComponent.access$1100(PicGalleryLightOffVideoComponent.this);
            if (access$1100 == null) {
                arc.a().c("PicGalleryLightOffVideoComponent", "InnerVideoControllerProgressBarSlideListener.onProgressBarSlideStart", "videoPlayer is null");
                return;
            }
            if (TextUtils.equals(access$1100.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
                access$1100.b();
            }
            this.b = -1.0f;
            PicGalleryLightOffVideoComponent.access$1200(PicGalleryLightOffVideoComponent.this);
        }

        @Override // com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.a
        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                return;
            }
            this.b = f;
            PicGalleryLightOffVideoComponent.access$700(PicGalleryLightOffVideoComponent.this).setVideoProgress(this.b);
            PicGalleryLightOffVideoComponent.access$1200(PicGalleryLightOffVideoComponent.this);
        }

        @Override // com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            AbsPicGalleryVideoPlayer access$1100 = PicGalleryLightOffVideoComponent.access$1100(PicGalleryLightOffVideoComponent.this);
            if (access$1100 == null) {
                arc.a().c("PicGalleryLightOffVideoComponent", "InnerVideoControllerProgressBarSlideListener.onProgressBarSlideEnd", "videoPlayer is null");
                return;
            }
            access$1100.a();
            access$1100.a(this.b);
            PicGalleryLightOffVideoComponent.access$1200(PicGalleryLightOffVideoComponent.this);
        }
    }
}

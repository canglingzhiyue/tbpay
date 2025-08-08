package com.taobao.android.dinamicx.widget.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.ai;
import com.taobao.avplayer.ak;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.c;
import com.taobao.avplayer.e;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.fuw;

/* loaded from: classes5.dex */
public class DXVideoView extends FrameLayout implements Application.ActivityLifecycleCallbacks, aw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TSSingletonVideoView";
    private String bizId;
    private int coverImageScaleType;
    private TUrlImageView coverImageView;
    private DWInstance dwInstance;
    private DWInstance.a dwInstanceBuilder;
    private boolean enablePlayControl;
    public Handler handler;
    private boolean hideIconOnStop;
    private String instanceIdentifier;
    private boolean isAttachedToWindow;
    private boolean isLoop;
    private TUrlImageView ivPlayButton;
    public FrameLayout.LayoutParams layoutParams;
    private boolean mAutoControl;
    private boolean mCanPlay;
    private Context mContext;
    private DXWidgetNode mCustomerPlayIcon;
    private boolean mMuted;
    private int mScaleType;
    private String mVideoId;
    private String mVideoUrl;
    private boolean manualPause;
    private String passOnTrack;
    private boolean playIgnoreNetwork;
    private int progressInterval;
    private long startTime;
    private String subBusinessId;
    private b tsVideoStatusCallback;
    private int videoHeight;
    private int videoWidth;
    private boolean viewEnable;

    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z, boolean z2);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void b();
    }

    private boolean hasPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9549414", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(DXVideoView dXVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public static /* synthetic */ long access$000(DXVideoView dXVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d3b077da", new Object[]{dXVideoView})).longValue() : dXVideoView.startTime;
    }

    public static /* synthetic */ DWInstance access$100(DXVideoView dXVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("e20cd870", new Object[]{dXVideoView}) : dXVideoView.dwInstance;
    }

    public static /* synthetic */ TUrlImageView access$200(DXVideoView dXVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("b065f214", new Object[]{dXVideoView}) : dXVideoView.coverImageView;
    }

    public DXVideoView(Context context) {
        super(context);
        this.isLoop = false;
        this.mMuted = false;
        this.mCanPlay = true;
        this.mAutoControl = true;
        this.hideIconOnStop = false;
        this.mScaleType = 1;
        this.coverImageScaleType = 1;
        this.viewEnable = true;
        this.enablePlayControl = false;
        this.layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.handler = new Handler(Looper.getMainLooper());
        this.startTime = 0L;
        this.progressInterval = -1;
        init(context);
    }

    public DXVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLoop = false;
        this.mMuted = false;
        this.mCanPlay = true;
        this.mAutoControl = true;
        this.hideIconOnStop = false;
        this.mScaleType = 1;
        this.coverImageScaleType = 1;
        this.viewEnable = true;
        this.enablePlayControl = false;
        this.layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.handler = new Handler(Looper.getMainLooper());
        this.startTime = 0L;
        this.progressInterval = -1;
        init(context);
    }

    public DXVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLoop = false;
        this.mMuted = false;
        this.mCanPlay = true;
        this.mAutoControl = true;
        this.hideIconOnStop = false;
        this.mScaleType = 1;
        this.coverImageScaleType = 1;
        this.viewEnable = true;
        this.enablePlayControl = false;
        this.layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.handler = new Handler(Looper.getMainLooper());
        this.startTime = 0L;
        this.progressInterval = -1;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        try {
            ((Application) this.mContext.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            fuw.a(TAG, "registerActivityLifecycleCallbacks", th);
        }
        addVideoSurfaceView();
        initDWInstanceBuilder();
    }

    public void setClickListenerControlPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab860d6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.viewEnable = z;
        if (z) {
            setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.video.DXVideoView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        DXVideoView.this.responseOnClick();
                    }
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    private void addVideoSurfaceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0708bf", new Object[]{this});
            return;
        }
        this.coverImageView = new TUrlImageView(getContext());
        this.coverImageView.setWhenNullClearImg(true);
        this.coverImageView.setAutoRelease(false);
        this.coverImageView.enableSizeInLayoutParams(true);
        validateCoverImageScaleType();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dx_video_view_extend, (ViewGroup) this, false);
        this.ivPlayButton = (TUrlImageView) inflate.findViewById(R.id.iv_play_btn);
        addView(this.coverImageView, this.layoutParams);
        addView(inflate, this.layoutParams);
        this.ivPlayButton.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.video.DXVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    DXVideoView.this.responseOnClick();
                }
            }
        });
    }

    private void validateCoverImageScaleType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2252b1", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView == null) {
            return;
        }
        int i = this.coverImageScaleType;
        if (i == 0) {
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i == 2) {
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    private void initDWInstanceBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea26402a", new Object[]{this});
            return;
        }
        this.dwInstanceBuilder = new DWInstance.a((Activity) this.mContext);
        this.dwInstanceBuilder.a(false);
        this.dwInstanceBuilder.D(false);
        this.dwInstanceBuilder.q(true);
        this.dwInstanceBuilder.r(true);
        this.dwInstanceBuilder.s(true);
        this.dwInstanceBuilder.u(true);
        this.dwInstanceBuilder.v(true);
        this.dwInstanceBuilder.w(true);
        this.dwInstanceBuilder.y(true);
        this.dwInstanceBuilder.t(true);
        this.dwInstanceBuilder.x(true);
        this.dwInstanceBuilder.a(new ak());
        this.dwInstanceBuilder.a(new ai());
        this.dwInstanceBuilder.a(new e());
        this.dwInstanceBuilder.a(new c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0102, code lost:
        if (r1.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0117, code lost:
        if (r1.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0119, code lost:
        r1.put("passOnTrack", r4.passOnTrack);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011e, code lost:
        r4.dwInstance.addUtParams(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void makeDWInstance() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.video.DXVideoView.makeDWInstance():void");
    }

    private DWAspectRatio changeAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("3fc44930", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return DWAspectRatio.DW_FIT_X_Y;
        }
        if (i == 2) {
            return DWAspectRatio.DW_CENTER_CROP;
        }
        return DWAspectRatio.DW_FIT_CENTER;
    }

    public void setCustomerPlayIcon(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9903eb5b", new Object[]{this, dXWidgetNode});
            return;
        }
        this.mCustomerPlayIcon = dXWidgetNode;
        if (this.mCustomerPlayIcon != null) {
            this.ivPlayButton.setVisibility(8);
        } else {
            this.ivPlayButton.setVisibility(0);
        }
    }

    private View getCustomerPlayIconView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46d6560f", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.mCustomerPlayIcon;
        if (dXWidgetNode == null) {
            return null;
        }
        View v = dXWidgetNode.getDXRuntimeContext().v();
        if (this.viewEnable && v != null && !v.hasOnClickListeners()) {
            v.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.video.DXVideoView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        DXVideoView.this.responseOnClick();
                    }
                }
            });
        }
        return v;
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(this.mVideoUrl) && !this.mVideoUrl.equals(str) && this.manualPause) {
            this.manualPause = false;
        }
        this.mVideoUrl = str;
    }

    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue() : this.mMuted;
    }

    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            this.mVideoId = str;
        }
    }

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.animate().cancel();
        this.coverImageView.setAlpha(1.0f);
        this.coverImageView.setVisibility(0);
        this.coverImageView.setImageUrl(str);
    }

    public void setCoverImageScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43ef5be", new Object[]{this, new Integer(i)});
            return;
        }
        this.coverImageScaleType = i;
        validateCoverImageScaleType();
    }

    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        this.ivPlayButton = (TUrlImageView) findViewById(R.id.iv_play_btn);
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(str);
    }

    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
        } else {
            this.isLoop = z;
        }
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.mute(this.mMuted);
    }

    public void setAutoControl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eea4bc1", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoControl = z;
        }
    }

    public void canPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609d7e89", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
        }
    }

    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.mScaleType = i;
        }
    }

    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.videoWidth = i;
        this.videoHeight = i2;
    }

    public void setPassOnTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bc16a", new Object[]{this, str});
        } else {
            this.passOnTrack = str;
        }
    }

    public void setITSVideoStatusCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473d2ae4", new Object[]{this, bVar});
            return;
        }
        this.tsVideoStatusCallback = bVar;
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance == null || dWInstance.getView() == null) {
            return;
        }
        this.dwInstance.getView().setTag(R.id.dx_video_player_control, bVar);
    }

    public void triggerPlayEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13592ff", new Object[]{this, new Boolean(z)});
            return;
        }
        Object tag = getTag(R.id.dx_video_player_event);
        if (!(tag instanceof a)) {
            return;
        }
        ((a) tag).a(hasPermission(), z);
    }

    public void validateInstanceIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc11d5b", new Object[]{this});
        } else if (!StringUtils.isEmpty(this.mVideoId)) {
            this.instanceIdentifier = this.mVideoId;
        } else {
            String str = this.mVideoUrl;
            if (str == null) {
                return;
            }
            this.instanceIdentifier = String.valueOf(str.hashCode());
        }
    }

    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            playVideo(false);
        }
    }

    public void playVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4535e6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.startTime = System.currentTimeMillis();
        validateInstanceIdentifier();
        if (!this.mCanPlay || StringUtils.isEmpty(this.instanceIdentifier) || this.manualPause) {
            showPlayerBtn();
            showCoverImageView();
            pauseVideo();
            return;
        }
        prepareInstance();
        if (!this.isAttachedToWindow) {
            return;
        }
        if (z && !hasPermission()) {
            this.dwInstance.preDownload(1);
            return;
        }
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance == null || dWInstance.getVideoState() == 1) {
            return;
        }
        if (this.dwInstance.getVideoState() == 2) {
            hideCoverImageView();
            hidePlayerBtn();
            this.dwInstance.playVideo();
            triggerPlayEvent(true);
            return;
        }
        this.dwInstance.start();
        triggerPlayEvent(false);
    }

    private void prepareInstance() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb0d543", new Object[]{this});
            return;
        }
        validateInstanceIdentifier();
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance == null || dWInstance.getView() == null) {
            z = true;
        }
        if (!z && !this.instanceIdentifier.equals(this.dwInstance.getView().getTag(R.id.dx_video_player_instance_identifier))) {
            if (isPlaying()) {
                this.dwInstance.pauseVideo();
            }
            removeView(this.dwInstance.getView());
            showCoverImageView();
            this.dwInstance.destroy();
            z = true;
        }
        if (!z) {
            return;
        }
        makeDWInstance();
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance != null) {
            dWInstance.pauseVideo();
        }
        showPlayerBtn();
    }

    public void destroyVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545abca8", new Object[]{this});
            return;
        }
        showPlayerBtn();
        showCoverImageView();
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance == null) {
            return;
        }
        if (dWInstance.getView() != null) {
            removeView(this.dwInstance.getView());
        }
        this.dwInstance.destroy();
        this.dwInstance = null;
    }

    public void responseOnClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5093ef", new Object[]{this});
        } else if (isPlaying()) {
            this.manualPause = true;
            pauseVideo();
        } else {
            this.manualPause = false;
            playVideo();
        }
    }

    public void showPlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc57ac5", new Object[]{this});
            return;
        }
        View customerPlayIconView = getCustomerPlayIconView();
        if (customerPlayIconView == null) {
            customerPlayIconView = this.ivPlayButton;
        }
        if (customerPlayIconView == null || customerPlayIconView.getVisibility() == 0) {
            return;
        }
        if (!this.manualPause && this.hideIconOnStop) {
            customerPlayIconView.setVisibility(8);
        } else {
            customerPlayIconView.setVisibility(0);
        }
    }

    public void hidePlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0510a0", new Object[]{this});
            return;
        }
        View customerPlayIconView = getCustomerPlayIconView();
        if (customerPlayIconView == null) {
            customerPlayIconView = this.ivPlayButton;
        }
        if (customerPlayIconView == null || customerPlayIconView.getVisibility() == 8) {
            return;
        }
        customerPlayIconView.setVisibility(8);
    }

    public void setHideIconOnStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ccc5af", new Object[]{this, new Boolean(z)});
            return;
        }
        this.hideIconOnStop = z;
        if (!this.hideIconOnStop) {
            return;
        }
        hidePlayerBtn();
    }

    private void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.animate().cancel();
        this.coverImageView.setAlpha(1.0f);
        this.handler.removeCallbacksAndMessages(null);
        this.coverImageView.setVisibility(0);
    }

    private void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView == null || tUrlImageView.getVisibility() == 8) {
            return;
        }
        this.coverImageView.animate().alpha(0.0f).setDuration(300L).setListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.dinamicx.widget.video.DXVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (DXVideoView.access$200(DXVideoView.this) == null) {
                } else {
                    DXVideoView.access$200(DXVideoView.this).setVisibility(8);
                }
            }
        }).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (!this.mAutoControl || !hasPermission() || this.enablePlayControl) {
            return;
        }
        playVideo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        if (!this.mAutoControl || this.enablePlayControl) {
            return;
        }
        pauseVideo();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        if (this.mContext != activity) {
            if (!StringUtils.equals(TBMainHost.a().getSimpleName(), activity.getLocalClassName())) {
                return;
            }
            Context context = this.mContext;
            if (context != context.getApplicationContext()) {
                return;
            }
        }
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance != null) {
            dWInstance.destroy();
        }
        try {
            ((Application) this.mContext.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        DWInstance dWInstance = this.dwInstance;
        return dWInstance != null && dWInstance.getVideoState() == 1;
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else {
            showPlayerBtn();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        showCoverImageView();
        showPlayerBtn();
        pauseVideo();
        b bVar = this.tsVideoStatusCallback;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else if (j != 12100) {
        } else {
            hideCoverImageView();
            hidePlayerBtn();
            if (!DinamicXEngine.j()) {
                return;
            }
            Log.e("dx_video_cost", "cost:" + (System.currentTimeMillis() - this.startTime));
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance != null && dWInstance.getVideoState() == 4) {
            showCoverImageView();
            showPlayerBtn();
        }
        b bVar = this.tsVideoStatusCallback;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        DXVideoViewWidgetNode dXVideoViewWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Object tag = getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (!(tag instanceof DXWidgetNode)) {
            return;
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) tag;
        if (!(dXWidgetNode instanceof DXVideoViewWidgetNode) || (dXVideoViewWidgetNode = (DXVideoViewWidgetNode) dXWidgetNode.getReferenceNode()) == null) {
            return;
        }
        dXVideoViewWidgetNode.onVideoProgressChanged(i, i2, i3);
    }

    public void setPlayIgnoreNetwork(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fa2e07", new Object[]{this, new Boolean(z)});
        } else {
            this.playIgnoreNetwork = z;
        }
    }

    public void setEnablePlayControl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b600f3e9", new Object[]{this, new Boolean(z)});
        } else {
            this.enablePlayControl = z;
        }
    }

    public void preRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4294ea20", new Object[]{this});
        } else {
            prepareInstance();
        }
    }

    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.prepareToFirstFrame();
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        DWInstance dWInstance = this.dwInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.seekTo(i);
    }

    public void setSubBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804f77ea", new Object[]{this, str});
        } else {
            this.subBusinessId = str;
        }
    }

    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.bizId = str;
        }
    }

    public void setProgressInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f657148", new Object[]{this, new Integer(i)});
        } else {
            this.progressInterval = i;
        }
    }
}

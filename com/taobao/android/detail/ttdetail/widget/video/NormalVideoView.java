package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.n;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.taobao.R;
import java.text.DecimalFormat;
import tb.eyx;
import tb.eyy;
import tb.ezc;
import tb.ezg;
import tb.kge;

/* loaded from: classes5.dex */
public class NormalVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_THUMBNAIL_URL = "thumbnailUrl";
    private static final String KEY_VIDEO_ID = "videoId";
    private static final String KEY_VIDEO_URL = "videoUrl";
    private static final String TAG_VIDEO_MUTE_STATE = "video_mute_state";
    private ImageView mCoverImageView;
    private TTImageUrlView.a mCoverVisibilityChangeListener;
    private Runnable mDelayHideControllerUi;
    private eyx mDetailContext;
    private FrameLayout mExtraView;
    private boolean mHasMaskBg;
    private boolean mIsOnUserSeeking;
    private ImageView mMaskImageView;
    private ProgressBar mMiniProgressBar;
    private a mOnUserClickPlay;
    private ImageView mPlayBtn;
    private ViewGroup mSeekBarContainer;
    private VideoView.b mSimpleVideoLifecycleListener;
    private String mThumbnailUrl;
    private Handler mUIHandler;
    private ImageView mUnMuteBtn;
    private VideoView.b mVideoLifecycleListener;
    private VideoView.d mVideoOnClickListener;
    private TextView mVideoProgressTimeTv;
    private SeekBar mVideoSeekBar;
    private VideoView mVideoView;
    private VideoView.a mVideoViewChangeListener;
    private VideoView.d mVideoViewOnClickListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a(NormalVideoView normalVideoView, boolean z);
    }

    static {
        kge.a(312180461);
    }

    public static /* synthetic */ Object ipc$super(NormalVideoView normalVideoView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f36fb121", new Object[]{normalVideoView})).booleanValue() : normalVideoView.mHasMaskBg;
    }

    public static /* synthetic */ String access$100(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc90c624", new Object[]{normalVideoView}) : normalVideoView.mThumbnailUrl;
    }

    public static /* synthetic */ void access$1000(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a61ce", new Object[]{normalVideoView});
        } else {
            normalVideoView.hideSeekBarGroup();
        }
    }

    public static /* synthetic */ eyx access$1100(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("56099175", new Object[]{normalVideoView}) : normalVideoView.mDetailContext;
    }

    public static /* synthetic */ boolean access$1200(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b12fcb90", new Object[]{normalVideoView})).booleanValue() : normalVideoView.isVideoMute();
    }

    public static /* synthetic */ void access$1300(NormalVideoView normalVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd63fc9", new Object[]{normalVideoView, new Boolean(z)});
        } else {
            normalVideoView.setMuteState(z);
        }
    }

    public static /* synthetic */ void access$1400(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c5354a", new Object[]{normalVideoView});
        } else {
            normalVideoView.hideControlButtonAndSeekBar();
        }
    }

    public static /* synthetic */ VideoView access$1500(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoView) ipChange.ipc$dispatch("2ccf4106", new Object[]{normalVideoView}) : normalVideoView.mVideoView;
    }

    public static /* synthetic */ void access$1600(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5a9f08", new Object[]{normalVideoView});
        } else {
            normalVideoView.syncControllerState();
        }
    }

    public static /* synthetic */ VideoView.b access$1700(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoView.b) ipChange.ipc$dispatch("4739d606", new Object[]{normalVideoView}) : normalVideoView.mVideoLifecycleListener;
    }

    public static /* synthetic */ ProgressBar access$1800(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("3f01be84", new Object[]{normalVideoView}) : normalVideoView.mMiniProgressBar;
    }

    public static /* synthetic */ VideoView.d access$1900(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoView.d) ipChange.ipc$dispatch("5870df02", new Object[]{normalVideoView}) : normalVideoView.mVideoOnClickListener;
    }

    public static /* synthetic */ ImageView access$200(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("6da0c115", new Object[]{normalVideoView}) : normalVideoView.mMaskImageView;
    }

    public static /* synthetic */ boolean access$2000(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73a648d3", new Object[]{normalVideoView})).booleanValue() : normalVideoView.isControlButtonAndSeekBarShowing();
    }

    public static /* synthetic */ void access$2100(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f0fdae", new Object[]{normalVideoView});
        } else {
            normalVideoView.showControlButtonAndSeekBar();
        }
    }

    public static /* synthetic */ void access$300(NormalVideoView normalVideoView, String str, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23994dbe", new Object[]{normalVideoView, str, imageView});
        } else {
            normalVideoView.loadBgMask(str, imageView);
        }
    }

    public static /* synthetic */ void access$400(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9a8499", new Object[]{normalVideoView});
        } else {
            normalVideoView.onPlayButtonClicked();
        }
    }

    public static /* synthetic */ ImageView access$500(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("fcc65d18", new Object[]{normalVideoView}) : normalVideoView.mPlayBtn;
    }

    public static /* synthetic */ void access$600(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12fee57", new Object[]{normalVideoView});
        } else {
            normalVideoView.showSeekBarGroup();
        }
    }

    public static /* synthetic */ boolean access$700(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("837aa33a", new Object[]{normalVideoView})).booleanValue() : normalVideoView.mIsOnUserSeeking;
    }

    public static /* synthetic */ boolean access$702(NormalVideoView normalVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b231dce4", new Object[]{normalVideoView, new Boolean(z)})).booleanValue();
        }
        normalVideoView.mIsOnUserSeeking = z;
        return z;
    }

    public static /* synthetic */ void access$800(NormalVideoView normalVideoView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e6124b", new Object[]{normalVideoView, new Float(f)});
        } else {
            normalVideoView.updateProgressIndicator(f);
        }
    }

    public static /* synthetic */ void access$900(NormalVideoView normalVideoView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f1f94c", new Object[]{normalVideoView, new Float(f)});
        } else {
            normalVideoView.seekTo(f);
        }
    }

    public NormalVideoView(Context context) {
        super(context);
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mDelayHideControllerUi = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NormalVideoView.access$1400(NormalVideoView.this);
                }
            }
        };
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i)});
                } else if (!NormalVideoView.access$1500(NormalVideoView.this).isVideoViewAttached()) {
                } else {
                    if (i == 8 || i == 4) {
                        NormalVideoView.this.hideCoverImage();
                    } else if (i != 0) {
                    } else {
                        NormalVideoView.this.showCoverImage();
                    }
                }
            }
        };
        this.mVideoViewChangeListener = new VideoView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.a
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else if (!NormalVideoView.access$1500(NormalVideoView.this).isVideoViewAttached()) {
                } else {
                    NormalVideoView.access$1600(NormalVideoView.this);
                }
            }
        };
        this.mSimpleVideoLifecycleListener = new VideoView.b() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPlayUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoStart();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                    return;
                }
                NormalVideoView.this.switchToPauseUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoPause(z);
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPlayUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoPlay();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoSeekTo(i);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoPrepared(obj);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoError(obj, i, i2);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                if (i == 12100) {
                    NormalVideoView.this.switchToPlayUI();
                    NormalVideoView.this.hideCoverImage();
                }
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoInfo(obj, i, i2);
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPauseUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoComplete();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoClose();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoFullScreen();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoNormalScreen();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                float f = i / i3;
                NormalVideoView.access$1800(NormalVideoView.this).setProgress((int) (100.0f * f));
                if (!NormalVideoView.access$700(NormalVideoView.this)) {
                    NormalVideoView.access$800(NormalVideoView.this, f);
                }
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoProgressChanged(i, i2, i3);
            }
        };
        this.mVideoViewOnClickListener = new VideoView.d() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d
            public boolean a(VideoView videoView) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a8b91589", new Object[]{this, videoView})).booleanValue();
                }
                if (NormalVideoView.access$1900(NormalVideoView.this) == null || !NormalVideoView.access$1900(NormalVideoView.this).a(videoView)) {
                    if (NormalVideoView.access$2000(NormalVideoView.this)) {
                        NormalVideoView.access$1400(NormalVideoView.this);
                    } else {
                        NormalVideoView.access$2100(NormalVideoView.this);
                    }
                }
                return true;
            }
        };
        initControllerUI();
    }

    public NormalVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mDelayHideControllerUi = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NormalVideoView.access$1400(NormalVideoView.this);
                }
            }
        };
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i)});
                } else if (!NormalVideoView.access$1500(NormalVideoView.this).isVideoViewAttached()) {
                } else {
                    if (i == 8 || i == 4) {
                        NormalVideoView.this.hideCoverImage();
                    } else if (i != 0) {
                    } else {
                        NormalVideoView.this.showCoverImage();
                    }
                }
            }
        };
        this.mVideoViewChangeListener = new VideoView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.a
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else if (!NormalVideoView.access$1500(NormalVideoView.this).isVideoViewAttached()) {
                } else {
                    NormalVideoView.access$1600(NormalVideoView.this);
                }
            }
        };
        this.mSimpleVideoLifecycleListener = new VideoView.b() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPlayUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoStart();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                    return;
                }
                NormalVideoView.this.switchToPauseUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoPause(z);
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPlayUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoPlay();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoSeekTo(i);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoPrepared(obj);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoError(obj, i, i2);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                if (i == 12100) {
                    NormalVideoView.this.switchToPlayUI();
                    NormalVideoView.this.hideCoverImage();
                }
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoInfo(obj, i, i2);
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPauseUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoComplete();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoClose();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoFullScreen();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoNormalScreen();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                float f = i / i3;
                NormalVideoView.access$1800(NormalVideoView.this).setProgress((int) (100.0f * f));
                if (!NormalVideoView.access$700(NormalVideoView.this)) {
                    NormalVideoView.access$800(NormalVideoView.this, f);
                }
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoProgressChanged(i, i2, i3);
            }
        };
        this.mVideoViewOnClickListener = new VideoView.d() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d
            public boolean a(VideoView videoView) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a8b91589", new Object[]{this, videoView})).booleanValue();
                }
                if (NormalVideoView.access$1900(NormalVideoView.this) == null || !NormalVideoView.access$1900(NormalVideoView.this).a(videoView)) {
                    if (NormalVideoView.access$2000(NormalVideoView.this)) {
                        NormalVideoView.access$1400(NormalVideoView.this);
                    } else {
                        NormalVideoView.access$2100(NormalVideoView.this);
                    }
                }
                return true;
            }
        };
        initControllerUI();
    }

    public NormalVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mDelayHideControllerUi = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NormalVideoView.access$1400(NormalVideoView.this);
                }
            }
        };
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i2)});
                } else if (!NormalVideoView.access$1500(NormalVideoView.this).isVideoViewAttached()) {
                } else {
                    if (i2 == 8 || i2 == 4) {
                        NormalVideoView.this.hideCoverImage();
                    } else if (i2 != 0) {
                    } else {
                        NormalVideoView.this.showCoverImage();
                    }
                }
            }
        };
        this.mVideoViewChangeListener = new VideoView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.a
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else if (!NormalVideoView.access$1500(NormalVideoView.this).isVideoViewAttached()) {
                } else {
                    NormalVideoView.access$1600(NormalVideoView.this);
                }
            }
        };
        this.mSimpleVideoLifecycleListener = new VideoView.b() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPlayUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoStart();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                    return;
                }
                NormalVideoView.this.switchToPauseUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoPause(z);
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPlayUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoPlay();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoSeekTo(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoSeekTo(i2);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoPrepared(obj);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoError(Object obj, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i22)});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoError(obj, i2, i22);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i2), new Integer(i22)});
                    return;
                }
                if (i2 == 12100) {
                    NormalVideoView.this.switchToPlayUI();
                    NormalVideoView.this.hideCoverImage();
                }
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoInfo(obj, i2, i22);
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                NormalVideoView.this.switchToPauseUI();
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoComplete();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoClose();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoFullScreen();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                } else if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                } else {
                    NormalVideoView.access$1700(NormalVideoView.this).onVideoNormalScreen();
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoProgressChanged(int i2, int i22, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i22), new Integer(i3)});
                    return;
                }
                float f = i2 / i3;
                NormalVideoView.access$1800(NormalVideoView.this).setProgress((int) (100.0f * f));
                if (!NormalVideoView.access$700(NormalVideoView.this)) {
                    NormalVideoView.access$800(NormalVideoView.this, f);
                }
                if (NormalVideoView.access$1700(NormalVideoView.this) == null) {
                    return;
                }
                NormalVideoView.access$1700(NormalVideoView.this).onVideoProgressChanged(i2, i22, i3);
            }
        };
        this.mVideoViewOnClickListener = new VideoView.d() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d
            public boolean a(VideoView videoView) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a8b91589", new Object[]{this, videoView})).booleanValue();
                }
                if (NormalVideoView.access$1900(NormalVideoView.this) == null || !NormalVideoView.access$1900(NormalVideoView.this).a(videoView)) {
                    if (NormalVideoView.access$2000(NormalVideoView.this)) {
                        NormalVideoView.access$1400(NormalVideoView.this);
                    } else {
                        NormalVideoView.access$2100(NormalVideoView.this);
                    }
                }
                return true;
            }
        };
        initControllerUI();
    }

    private String getVideoDimension(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("addb3ecd", new Object[]{this, eyyVar});
        }
        if (eyyVar == null || !(eyyVar instanceof ezc)) {
            return null;
        }
        return ((ezc) eyyVar).k();
    }

    private void setVideoData(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0955395", new Object[]{this, eyyVar});
        } else if (eyyVar == null) {
        } else {
            JSONObject d = eyyVar.d();
            ezg a2 = eyyVar.a();
            if (d != null) {
                String string = d.getString("videoId");
                String string2 = d.getString("videoUrl");
                String string3 = d.getString(KEY_THUMBNAIL_URL);
                this.mVideoView.setVideoData(string, string2, string3, getVideoDimension(a2), n.a(this.mDetailContext.a()));
                this.mThumbnailUrl = string3;
            }
            this.mHasMaskBg = hasMaskBg(a2);
        }
    }

    public void bindData(eyy eyyVar, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fefb45", new Object[]{this, eyyVar, eyxVar});
            return;
        }
        this.mDetailContext = eyxVar;
        setVideoData(eyyVar);
        q.a(this.mCoverImageView, this.mThumbnailUrl);
        ImageView imageView = this.mCoverImageView;
        if (!this.mHasMaskBg) {
            i = -1;
        }
        imageView.setBackgroundColor(i);
        this.mMaskImageView.post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!NormalVideoView.access$000(NormalVideoView.this)) {
                    q.a(NormalVideoView.access$200(NormalVideoView.this), (String) null);
                } else {
                    NormalVideoView normalVideoView = NormalVideoView.this;
                    NormalVideoView.access$300(normalVideoView, NormalVideoView.access$100(normalVideoView), NormalVideoView.access$200(NormalVideoView.this));
                }
            }
        });
    }

    private void loadBgMask(final String str, final ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5862e262", new Object[]{this, str, imageView});
        } else if (StringUtils.isEmpty(str)) {
            i.a("VideoView", "loadBgMask url is empty");
        } else {
            bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    q.a(imageView);
                    com.taobao.phenix.intf.b.h().a(q.e(imageView, str)).bitmapProcessors(new com.taobao.phenix.compat.effects.b(NormalVideoView.this.getContext(), 25)).schedulePriority(4).limitSize(imageView).into(imageView);
                }
            });
        }
    }

    public static String getThumbnailUrl(eyy eyyVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5767295", new Object[]{eyyVar});
        }
        if (eyyVar != null && (d = eyyVar.d()) != null) {
            return d.getString(KEY_THUMBNAIL_URL);
        }
        return null;
    }

    public String getThumbnailUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38969940", new Object[]{this}) : this.mThumbnailUrl;
    }

    public static String getVideoUrl(eyy eyyVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1aa6f24", new Object[]{eyyVar});
        }
        if (eyyVar != null && (d = eyyVar.d()) != null) {
            return d.getString("videoUrl");
        }
        return null;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this}) : this.mVideoView.getVideoUrl();
    }

    public static String getVideoId(eyy eyyVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70aa908e", new Object[]{eyyVar});
        }
        if (eyyVar != null && (d = eyyVar.d()) != null) {
            return d.getString("videoId");
        }
        return null;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this}) : this.mVideoView.getVideoId();
    }

    public boolean attachDwInstanceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c0cc63d", new Object[]{this})).booleanValue();
        }
        boolean attachDwInstanceView = this.mVideoView.attachDwInstanceView();
        setMuteState(isVideoMute());
        return attachDwInstanceView;
    }

    private void syncControllerState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdddc1", new Object[]{this});
            return;
        }
        if (isVideoPlaying()) {
            switchToPlayUI();
        } else {
            switchToPauseUI();
        }
        if (isBuildInCoverVisible()) {
            showCoverImage();
        } else {
            hideCoverImage();
        }
    }

    private void setMuteState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85048537", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.mUnMuteBtn.setContentDescription(getResources().getString(R.string.tt_detail_content_description_unmute));
            this.mUnMuteBtn.setImageResource(R.drawable.tt_detail_video_player_mute_bg);
        } else {
            this.mUnMuteBtn.setContentDescription(getResources().getString(R.string.tt_detail_content_description_mute));
            this.mUnMuteBtn.setImageResource(R.drawable.tt_detail_video_player_unmute_bg);
        }
        this.mVideoView.setMute(z);
        eyx eyxVar = this.mDetailContext;
        if (eyxVar == null) {
            return;
        }
        eyxVar.e().a(TAG_VIDEO_MUTE_STATE, Boolean.valueOf(z));
    }

    public void setOnUserClickPlay(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f93800", new Object[]{this, aVar});
        } else {
            this.mOnUserClickPlay = aVar;
        }
    }

    private void onPlayButtonClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53b0d29", new Object[]{this});
            return;
        }
        boolean z = !isVideoPlaying();
        com.taobao.android.detail.ttdetail.widget.video.a.a().a(y.a(this), z);
        a aVar = this.mOnUserClickPlay;
        if (aVar != null) {
            aVar.a(this, z);
        }
        if (z) {
            play();
        } else {
            pause();
        }
    }

    public ImageView getCoverImageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("307a7faa", new Object[]{this}) : this.mCoverImageView;
    }

    private void initControllerUI() {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6503ece7", new Object[]{this});
            return;
        }
        d a2 = d.a(y.a(this));
        if (a2 != null) {
            inflate = a2.a(y.a(this), R.layout.tt_detail_video_controller, this, true);
        } else {
            inflate = LayoutInflater.from(y.a(this)).inflate(R.layout.tt_detail_video_controller, (ViewGroup) this, false);
        }
        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        this.mVideoView = (VideoView) inflate.findViewById(R.id.vv_actually_video_view);
        this.mVideoView.setVideoLifecycleListener(this.mSimpleVideoLifecycleListener);
        this.mVideoView.setVideoViewOnClickListener(this.mVideoViewOnClickListener);
        this.mVideoView.setVideoViewChangeListener(this.mVideoViewChangeListener);
        this.mVideoView.setVisibilityChangeListener(this.mCoverVisibilityChangeListener);
        this.mCoverImageView = (ImageView) inflate.findViewById(R.id.tiv_cover);
        this.mMaskImageView = (ImageView) inflate.findViewById(R.id.tiv_mask);
        this.mPlayBtn = (ImageView) inflate.findViewById(R.id.iv_play_btn);
        this.mPlayBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    NormalVideoView.access$400(NormalVideoView.this);
                }
            }
        });
        inflate.findViewById(R.id.view_pause_video_interceptor).setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final Rect b = new Rect();
            private boolean c = false;

            private boolean a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                NormalVideoView.access$500(NormalVideoView.this).getHitRect(this.b);
                int visibility = NormalVideoView.access$500(NormalVideoView.this).getVisibility();
                return this.b.contains(i, i2) && (visibility == 8 || visibility == 4);
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int x = (int) (motionEvent.getX() + view.getScrollX());
                int y = (int) (motionEvent.getY() + view.getScrollY());
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.c = false;
                    this.b.setEmpty();
                    if (a(x, y)) {
                        this.c = true;
                    }
                } else if (action == 1 && this.c && a(x, y)) {
                    NormalVideoView.access$400(NormalVideoView.this);
                }
                return this.c;
            }
        });
        this.mMiniProgressBar = (ProgressBar) inflate.findViewById(R.id.pb_mini_progress);
        this.mSeekBarContainer = (ViewGroup) inflate.findViewById(R.id.ll_seek_container);
        this.mExtraView = (FrameLayout) inflate.findViewById(R.id.extra_view);
        this.mVideoSeekBar = (SeekBar) inflate.findViewById(R.id.sb_drag_progress);
        inflate.findViewById(R.id.seek_touch_container).setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b;
            private float c;
            private float d;
            private int e;

            {
                this.b = ViewConfiguration.get(y.a(NormalVideoView.this)).getScaledTouchSlop();
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
                if (r0 != 3) goto L11;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.AnonymousClass5.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 3
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    if (r1 == 0) goto L1f
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    r1[r4] = r6
                    r1[r5] = r7
                    r1[r3] = r8
                    java.lang.String r7 = "d4aa3aa4"
                    java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    return r7
                L1f:
                    android.view.ViewParent r0 = r7.getParent()
                    r0.requestDisallowInterceptTouchEvent(r5)
                    int r0 = r8.getAction()
                    if (r0 == 0) goto L9c
                    if (r0 == r5) goto L69
                    if (r0 == r3) goto L34
                    if (r0 == r2) goto L69
                    goto Laf
                L34:
                    float r7 = r8.getX()
                    r6.d = r7
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    boolean r8 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$700(r7)
                    float r0 = r6.d
                    float r1 = r6.c
                    float r0 = r0 - r1
                    float r0 = java.lang.Math.abs(r0)
                    int r1 = r6.b
                    float r1 = (float) r1
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L51
                    r4 = 1
                L51:
                    r8 = r8 | r4
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$702(r7, r8)
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    boolean r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$700(r7)
                    if (r7 == 0) goto Laf
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    float r8 = r6.d
                    int r0 = r6.e
                    float r0 = (float) r0
                    float r8 = r8 / r0
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$800(r7, r8)
                    goto Laf
                L69:
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    boolean r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$700(r7)
                    if (r7 == 0) goto L7c
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    float r8 = r6.d
                    int r0 = r6.e
                    float r0 = (float) r0
                    float r8 = r8 / r0
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$900(r7, r8)
                L7c:
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$702(r7, r4)
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$1000(r7)
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    tb.eyx r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$1100(r7)
                    tb.eyz r7 = r7.a()
                    com.alibaba.fastjson.JSONObject r7 = com.taobao.android.detail.ttdetail.utils.m.a(r7)
                    r8 = 2101(0x835, float:2.944E-42)
                    java.lang.String r0 = "ProgressBar_industry"
                    com.taobao.android.detail.ttdetail.utils.m.a(r8, r0, r7)
                    goto Laf
                L9c:
                    float r8 = r8.getX()
                    r6.c = r8
                    r6.d = r8
                    int r7 = r7.getWidth()
                    r6.e = r7
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView r7 = com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.this
                    com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.access$600(r7)
                Laf:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.AnonymousClass5.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        this.mVideoProgressTimeTv = (TextView) inflate.findViewById(R.id.tv_video_progress_time);
        this.mUnMuteBtn = (ImageView) inflate.findViewById(R.id.iv_mute_btn);
        this.mUnMuteBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    NormalVideoView.access$1300(NormalVideoView.this, !NormalVideoView.access$1200(NormalVideoView.this));
                }
            }
        });
    }

    private void showSeekBarGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6666068", new Object[]{this});
            return;
        }
        this.mSeekBarContainer.setVisibility(0);
        this.mMiniProgressBar.setVisibility(8);
    }

    private void hideSeekBarGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e638ad", new Object[]{this});
            return;
        }
        this.mSeekBarContainer.setVisibility(4);
        this.mMiniProgressBar.setVisibility(0);
    }

    public void showCoverImage() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837d3ac8", new Object[]{this});
        } else if (this.mCoverImageView.getVisibility() == 0) {
        } else {
            this.mCoverImageView.setVisibility(0);
            ImageView imageView = this.mMaskImageView;
            if (!this.mHasMaskBg) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    private boolean hasMaskBg(ezg ezgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("938fa374", new Object[]{this, ezgVar})).booleanValue();
        }
        if (ezgVar == null) {
            return false;
        }
        return "true".equals(ezgVar.e().getString("enableBgMask"));
    }

    public void hideCoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f30604d", new Object[]{this});
        } else if (this.mCoverImageView.getVisibility() == 8) {
        } else {
            this.mCoverImageView.setVisibility(8);
            this.mMaskImageView.setVisibility(8);
        }
    }

    private boolean isControlButtonAndSeekBarShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac864da7", new Object[]{this})).booleanValue() : this.mMiniProgressBar.getVisibility() == 8;
    }

    private void showControlButtonAndSeekBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b616bd", new Object[]{this});
            return;
        }
        this.mMiniProgressBar.setVisibility(8);
        this.mSeekBarContainer.setVisibility(0);
        this.mPlayBtn.setVisibility(0);
        this.mUIHandler.postDelayed(this.mDelayHideControllerUi, 3000L);
    }

    private void hideControlButtonAndSeekBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc40d158", new Object[]{this});
            return;
        }
        this.mUIHandler.removeCallbacks(this.mDelayHideControllerUi);
        this.mMiniProgressBar.setVisibility(0);
        this.mSeekBarContainer.setVisibility(4);
        this.mPlayBtn.setVisibility(8);
    }

    public boolean isBuildInCoverVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60a9d8f", new Object[]{this})).booleanValue() : this.mVideoView.isBuildInCoverVisible();
    }

    public boolean attachVideoLastFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79e6c3ec", new Object[]{this})).booleanValue() : this.mVideoView.attachDwInstanceLastFrame();
    }

    public FrameLayout getExtraView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ba27f7f3", new Object[]{this}) : this.mExtraView;
    }

    public void hideAttachedVideoLastFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2db6469", new Object[]{this});
        } else {
            this.mVideoView.hideAttachedDwInstanceLastFrame();
        }
    }

    public boolean isVideoPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a32d388", new Object[]{this})).booleanValue() : this.mVideoView.isVideoPlaying();
    }

    public boolean play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue();
        }
        attachDwInstanceView();
        boolean play = this.mVideoView.play();
        syncControllerState();
        return play;
    }

    public void switchToPlayUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324ea37e", new Object[]{this});
            return;
        }
        this.mPlayBtn.setImageResource(R.drawable.tt_detail_video_player_pause_bg);
        this.mPlayBtn.setVisibility(8);
    }

    public boolean pause() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue() : this.mVideoView.pause();
    }

    public void switchToPauseUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cc9642", new Object[]{this});
            return;
        }
        this.mPlayBtn.setImageResource(R.drawable.tt_detail_video_player_play_bg);
        this.mPlayBtn.setVisibility(0);
    }

    private boolean isVideoMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a50746b5", new Object[]{this})).booleanValue();
        }
        eyx eyxVar = this.mDetailContext;
        if (eyxVar == null) {
            return true;
        }
        Object a2 = eyxVar.e().a(TAG_VIDEO_MUTE_STATE);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return this.mVideoView.isMute();
    }

    private void seekTo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49644ce6", new Object[]{this, new Float(f)});
        } else {
            this.mVideoView.seekTo(f);
        }
    }

    private long getVideoDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3db6f774", new Object[]{this})).longValue() : this.mVideoView.getVideoDuration();
    }

    private void updateProgressIndicator(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03d1b20", new Object[]{this, new Float(f)});
        } else if (this.mSeekBarContainer.getVisibility() != 0) {
        } else {
            this.mVideoSeekBar.setProgress((int) (100.0f * f));
            long videoDuration = getVideoDuration();
            int i = (int) (videoDuration / 3600000);
            int i2 = (int) ((videoDuration % 3600000) / 60000);
            int i3 = (int) ((videoDuration % 60000) / 1000);
            long j = f * ((float) videoDuration);
            int i4 = (int) (j / 3600000);
            int i5 = (int) ((j % 3600000) / 60000);
            int i6 = (int) ((j % 60000) / 1000);
            DecimalFormat decimalFormat = new DecimalFormat("00");
            StringBuilder sb = new StringBuilder();
            if (i4 > 0) {
                sb.append(i4);
                sb.append(":");
            }
            sb.append(decimalFormat.format(i5));
            sb.append(":");
            sb.append(decimalFormat.format(i6));
            sb.append(" / ");
            if (i > 0) {
                sb.append(i);
                sb.append(":");
            }
            sb.append(decimalFormat.format(i2));
            sb.append(":");
            sb.append(decimalFormat.format(i3));
            this.mVideoProgressTimeTv.setText(sb.toString());
        }
    }

    public void setVideoLifecycleListener(VideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8e1fa3", new Object[]{this, bVar});
        } else {
            this.mVideoLifecycleListener = bVar;
        }
    }

    public void setVideoOnClickListener(VideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53adbe02", new Object[]{this, dVar});
        } else {
            this.mVideoOnClickListener = dVar;
        }
    }
}

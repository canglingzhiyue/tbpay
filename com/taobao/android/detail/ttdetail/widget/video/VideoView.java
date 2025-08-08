package com.taobao.android.detail.ttdetail.widget.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.video.a;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.common.z;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class VideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_CODE = "DETAILMAIN";
    private static final String SOURCE_CODE = "TBVideo";
    private static final String VIEW_TAG_PLAYER = "player_view";
    private boolean isMute;
    private TTImageUrlView.a mCoverVisibilityChangeListener;
    private av mDWVideoLifecycleListener;
    private volatile bk mDwInstance;
    private volatile a.C0436a mDwInstanceWrapper;
    private int[] mFixedWidthHeight;
    private volatile boolean mHasSetVideoData;
    private z mIDWRootViewClickListener;
    private volatile boolean mIsLayoutRequested;
    private ImageView mPlaceHolder;
    private int mPlaceHolderHideSkipFrames;
    private String mThumbnailUrl;
    private HashMap<String, String> mUtArgs;
    private int mVideoHeight;
    private String mVideoId;
    private b mVideoLifecycleListener;
    private String mVideoUrl;
    private a mVideoViewChangeListener;
    private d mVideoViewOnClickListener;
    private int mVideoWidth;
    private TTImageUrlView.a mVisibilityChangeListener;
    private float mWidthHeightRatio;
    private boolean showNotWifiHint;

    /* loaded from: classes5.dex */
    public interface a {
        void a(View view);
    }

    /* loaded from: classes5.dex */
    public static class b implements av {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(548350725);
            kge.a(688755897);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        boolean a(VideoView videoView);
    }

    static {
        kge.a(243717908);
    }

    public static /* synthetic */ Object ipc$super(VideoView videoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int access$000(VideoView videoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a20b8509", new Object[]{videoView})).intValue() : videoView.mPlaceHolderHideSkipFrames;
    }

    public static /* synthetic */ TTImageUrlView.a access$100(VideoView videoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTImageUrlView.a) ipChange.ipc$dispatch("9c4d7702", new Object[]{videoView}) : videoView.mVisibilityChangeListener;
    }

    public static /* synthetic */ b access$200(VideoView videoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c554edf3", new Object[]{videoView}) : videoView.mVideoLifecycleListener;
    }

    public static /* synthetic */ boolean access$300(VideoView videoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e09a1d77", new Object[]{videoView})).booleanValue() : videoView.mIsLayoutRequested;
    }

    public static /* synthetic */ bk access$400(VideoView videoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("3bebea04", new Object[]{videoView}) : videoView.mDwInstance;
    }

    public static /* synthetic */ d access$500(VideoView videoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9eead50e", new Object[]{videoView}) : videoView.mVideoViewOnClickListener;
    }

    public VideoView(Context context) {
        super(context);
        this.mUtArgs = new HashMap<>(0);
        this.mFixedWidthHeight = new int[2];
        this.showNotWifiHint = true;
        this.isMute = true;
        this.mWidthHeightRatio = 1.0f;
        this.mPlaceHolderHideSkipFrames = 1;
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i)});
                } else if (VideoView.access$100(VideoView.this) == null) {
                } else {
                    VideoView.access$100(VideoView.this).a(tTImageUrlView, i);
                }
            }
        };
        this.mDWVideoLifecycleListener = new av() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoStart();
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPause(z);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPlay();
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoSeekTo(i);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPrepared(obj);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoError(obj, i, i2);
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoInfo(obj, i, i2);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                if (VideoView.access$400(VideoView.this) != null) {
                    VideoView.access$400(VideoView.this).setDWLifecycleType(DWLifecycleType.BEFORE);
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoComplete();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoClose();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoFullScreen();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoNormalScreen();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoProgressChanged(i, i2, i3);
                }
            }
        };
        this.mIDWRootViewClickListener = new z() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.z
            public boolean hook() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue() : VideoView.access$500(VideoView.this) != null && VideoView.access$500(VideoView.this).a(VideoView.this);
            }
        };
        initView(context);
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUtArgs = new HashMap<>(0);
        this.mFixedWidthHeight = new int[2];
        this.showNotWifiHint = true;
        this.isMute = true;
        this.mWidthHeightRatio = 1.0f;
        this.mPlaceHolderHideSkipFrames = 1;
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i)});
                } else if (VideoView.access$100(VideoView.this) == null) {
                } else {
                    VideoView.access$100(VideoView.this).a(tTImageUrlView, i);
                }
            }
        };
        this.mDWVideoLifecycleListener = new av() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoStart();
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPause(z);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPlay();
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoSeekTo(i);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPrepared(obj);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoError(obj, i, i2);
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoInfo(obj, i, i2);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                if (VideoView.access$400(VideoView.this) != null) {
                    VideoView.access$400(VideoView.this).setDWLifecycleType(DWLifecycleType.BEFORE);
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoComplete();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoClose();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoFullScreen();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoNormalScreen();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoProgressChanged(i, i2, i3);
                }
            }
        };
        this.mIDWRootViewClickListener = new z() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.z
            public boolean hook() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue() : VideoView.access$500(VideoView.this) != null && VideoView.access$500(VideoView.this).a(VideoView.this);
            }
        };
        initView(context);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUtArgs = new HashMap<>(0);
        this.mFixedWidthHeight = new int[2];
        this.showNotWifiHint = true;
        this.isMute = true;
        this.mWidthHeightRatio = 1.0f;
        this.mPlaceHolderHideSkipFrames = 1;
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i2)});
                } else if (VideoView.access$100(VideoView.this) == null) {
                } else {
                    VideoView.access$100(VideoView.this).a(tTImageUrlView, i2);
                }
            }
        };
        this.mDWVideoLifecycleListener = new av() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoStart();
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPause(z);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPlay();
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoSeekTo(i2);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoPrepared(obj);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i22)});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoError(obj, i2, i22);
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i2), new Integer(i22)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoInfo(obj, i2, i22);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                if (VideoView.access$400(VideoView.this) != null) {
                    VideoView.access$400(VideoView.this).setDWLifecycleType(DWLifecycleType.BEFORE);
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoComplete();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoClose();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoFullScreen();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                    return;
                }
                if (VideoView.access$200(VideoView.this) != null) {
                    VideoView.access$200(VideoView.this).onVideoNormalScreen();
                }
                if (!VideoView.access$300(VideoView.this)) {
                    return;
                }
                VideoView.this.requestLayout();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i2, int i22, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i22), new Integer(i3)});
                } else if (VideoView.access$200(VideoView.this) == null) {
                } else {
                    VideoView.access$200(VideoView.this).onVideoProgressChanged(i2, i22, i3);
                }
            }
        };
        this.mIDWRootViewClickListener = new z() { // from class: com.taobao.android.detail.ttdetail.widget.video.VideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.z
            public boolean hook() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue() : VideoView.access$500(VideoView.this) != null && VideoView.access$500(VideoView.this).a(VideoView.this);
            }
        };
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mPlaceHolder = new ImageView(context);
        this.mPlaceHolder.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.mPlaceHolder, 0, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private bk buildDWInstance(TTImageUrlView tTImageUrlView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bk) ipChange.ipc$dispatch("6842f71b", new Object[]{this, tTImageUrlView});
        }
        bk.a aVar = new bk.a((Activity) y.a(this));
        aVar.e(BIZ_CODE);
        aVar.c("TBVideo");
        aVar.f(this.isMute);
        aVar.q(true);
        aVar.g(false);
        aVar.H(false);
        aVar.B(false);
        aVar.r(true);
        aVar.x(true);
        aVar.N(false);
        aVar.a(DWAspectRatio.DW_FIT_CENTER);
        aVar.b(this.mVideoId);
        aVar.a(this.mVideoUrl);
        aVar.v(false);
        aVar.w(false);
        aVar.t(false);
        aVar.R(true);
        aVar.S(true);
        aVar.i(true);
        com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
        tTImageUrlView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tTImageUrlView.setBackgroundColor(0);
        aVar2.a(tTImageUrlView);
        aVar.a(aVar2);
        bk c2 = aVar.c();
        c2.hideController();
        c2.hideMiniProgressBar();
        c2.setVideoBackgroundColor(0);
        c2.orientationDisable();
        c2.setShowNotWifiHint(this.showNotWifiHint);
        c2.addUtParams(this.mUtArgs);
        return c2;
    }

    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.showNotWifiHint = z;
        if (!isVideoViewAttached()) {
            return;
        }
        this.mDwInstance.setShowNotWifiHint(this.showNotWifiHint);
    }

    public synchronized void setVideoData(String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14db0ac1", new Object[]{this, str, str2, str3, str4, hashMap});
            return;
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            a.C0436a a2 = com.taobao.android.detail.ttdetail.widget.video.a.a().a(y.a(this), this.mVideoUrl);
            if (a2 != null && !StringUtils.equals(str2, this.mVideoUrl)) {
                a2.b().unregisterVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            }
            this.mVideoId = str;
            this.mVideoUrl = str2;
            this.mThumbnailUrl = str3;
            this.mWidthHeightRatio = f.a(str4);
            if (hashMap != null && !hashMap.isEmpty()) {
                this.mUtArgs.putAll(hashMap);
            }
            if (!StringUtils.equals(str2, this.mVideoUrl)) {
                resetDwInstance();
            }
            this.mDwInstanceWrapper = com.taobao.android.detail.ttdetail.widget.video.a.a().a(y.a(this), this.mVideoUrl);
            this.mDwInstance = this.mDwInstanceWrapper != null ? this.mDwInstanceWrapper.a() : null;
            if (isVideoViewAttached()) {
                this.mDwInstanceWrapper.b().registerVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            }
            this.mHasSetVideoData = true;
        }
    }

    private void resetDwInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d147d5fe", new Object[]{this});
            return;
        }
        this.mDwInstanceWrapper = null;
        this.mDwInstance = null;
    }

    private boolean ensureDwInstanceCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7cde6d", new Object[]{this})).booleanValue();
        }
        if (!this.mHasSetVideoData) {
            return false;
        }
        this.mDwInstanceWrapper = com.taobao.android.detail.ttdetail.widget.video.a.a().a(y.a(this), this.mVideoUrl);
        this.mDwInstance = this.mDwInstanceWrapper != null ? this.mDwInstanceWrapper.a() : null;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mDwInstance == null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            TTImageUrlView tTImageUrlView = new TTImageUrlView(y.a(this));
            tTImageUrlView.registerVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            this.mDwInstance = buildDWInstance(tTImageUrlView);
            this.mDwInstanceWrapper = new a.C0436a(this.mDwInstance, tTImageUrlView);
            com.taobao.android.detail.ttdetail.widget.video.a.a().a(y.a(this), this.mVideoUrl, this.mDwInstanceWrapper);
            long currentTimeMillis3 = System.currentTimeMillis();
            Log.e("TTDetailPerTag", "buildDWInstance(): " + (currentTimeMillis3 - currentTimeMillis2));
        }
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis4 > 0) {
            com.taobao.android.detail.ttdetail.utils.av.b(y.a(this), "playerInit", currentTimeMillis4);
        }
        return true;
    }

    public boolean isBuildInCoverVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60a9d8f", new Object[]{this})).booleanValue();
        }
        ensureDwInstanceCreated();
        if (this.mDwInstanceWrapper == null) {
            return true;
        }
        return this.mDwInstanceWrapper.b().isViewVisible();
    }

    public boolean attachDwInstanceLastFrame() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ffd415", new Object[]{this})).booleanValue();
        }
        BitmapDrawable captureVideo = captureVideo();
        if (captureVideo == null) {
            z = false;
        }
        if (captureVideo != null) {
            this.mPlaceHolder.setVisibility(0);
            this.mPlaceHolder.setImageDrawable(captureVideo);
        } else {
            this.mPlaceHolder.setVisibility(4);
            this.mPlaceHolder.setImageDrawable(null);
        }
        invalidate();
        return z;
    }

    public void hideAttachedDwInstanceLastFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5105c30", new Object[]{this});
        } else {
            post(new c(this.mPlaceHolder));
        }
    }

    public boolean isVideoViewAttached() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ad75305", new Object[]{this})).booleanValue() : (this.mDwInstance == null || this.mDwInstance.getView() == null || this.mDwInstance.getView().getParent() != this) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
            return;
        }
        super.onViewAdded(view);
        if (this.mDwInstance == null || this.mDwInstance.getView() != view) {
            return;
        }
        this.mDwInstanceWrapper.b().registerVisibilityChangeListener(this.mCoverVisibilityChangeListener);
        this.mDwInstance.setVideoLifecycleListener(this.mDWVideoLifecycleListener);
        this.mDwInstance.setRootViewClickListener(this.mIDWRootViewClickListener);
        setShowNotWifiHint(this.showNotWifiHint);
        setMute(this.isMute);
        a aVar = this.mVideoViewChangeListener;
        if (aVar != null) {
            aVar.a(view);
        }
        post(new c(this.mPlaceHolder));
    }

    public boolean attachDwInstanceView() {
        ViewGroup view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c0cc63d", new Object[]{this})).booleanValue();
        }
        if (this.mDwInstance == null || (view = this.mDwInstance.getView()) == null || view.getParent() == this) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        View findViewWithTag = findViewWithTag(VIEW_TAG_PLAYER);
        if (findViewWithTag != null) {
            Object tag = findViewWithTag.getTag(R.id.tt_detail_video_dwinstance_id);
            if (tag instanceof bk) {
                ((bk) tag).pauseVideo();
            }
            removeView(findViewWithTag);
        }
        view.setTag(R.id.tt_detail_video_dwinstance_id, this.mDwInstance);
        view.setTag(VIEW_TAG_PLAYER);
        addView(view, 0, new FrameLayout.LayoutParams(this.mVideoWidth, this.mVideoHeight, 17));
        this.mDwInstance.setFrame(this.mVideoWidth, this.mVideoHeight);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    public void setPlaceHolderHideSkipFrames(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe7ce44", new Object[]{this, new Integer(i)});
        } else {
            this.mPlaceHolderHideSkipFrames = i;
        }
    }

    /* loaded from: classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private ImageView c;

        static {
            kge.a(-1742933103);
            kge.a(-1390502639);
        }

        public c(ImageView imageView) {
            this.b = VideoView.access$000(VideoView.this);
            this.c = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b > 0) {
                VideoView.this.post(this);
                this.b--;
            } else {
                this.c.setVisibility(4);
                this.c.setImageDrawable(null);
            }
        }
    }

    private BitmapDrawable captureVideo() {
        TextureView findTextureView;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("6942202f", new Object[]{this});
        }
        if (this.mDwInstance == null) {
            return null;
        }
        ViewGroup view = this.mDwInstance.getView();
        if (view instanceof TextureView) {
            findTextureView = (TextureView) view;
        } else {
            findTextureView = view instanceof ViewGroup ? findTextureView(view) : null;
        }
        if (findTextureView != null && (bitmap = findTextureView.getBitmap()) != null && bitmap.getByteCount() > 0) {
            return new BitmapDrawable(y.a(findTextureView).getResources(), bitmap);
        }
        return null;
    }

    private TextureView findTextureView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("4d19f8c2", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                return findTextureView((ViewGroup) childAt);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        if (this.mDwInstance == null || this.mDwInstance.getView() != view) {
            return;
        }
        this.mDwInstanceWrapper.b().unregisterVisibilityChangeListener(this.mCoverVisibilityChangeListener);
        this.mDwInstance.setVideoLifecycleListener(null);
        this.mDwInstance.setRootViewClickListener(null);
        post(new c(this.mPlaceHolder));
    }

    public void detachDwInstanceView() {
        ViewGroup view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7297807", new Object[]{this});
        } else if (this.mDwInstance == null || (view = this.mDwInstance.getView()) == null || view.getParent() != this) {
        } else {
            removeView(view);
            this.mDwInstance.pauseVideo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = (int) (size / this.mWidthHeightRatio);
        if (size2 > i3 || size2 <= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
        updateVideoFrame(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        updateVideoFrame(getWidth(), getHeight());
    }

    private void updateVideoFrame(int i, int i2) {
        ViewGroup view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afff5642", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mVideoWidth;
        if (i3 != 0 && this.mVideoHeight != 0 && Math.abs(i3 - i) <= 1 && Math.abs(this.mVideoHeight - i2) <= 1) {
            return;
        }
        f.a(i, i2, this.mWidthHeightRatio, this.mFixedWidthHeight);
        int i4 = this.mVideoWidth;
        int[] iArr = this.mFixedWidthHeight;
        if (i4 == iArr[0] && this.mVideoHeight == iArr[1]) {
            return;
        }
        int[] iArr2 = this.mFixedWidthHeight;
        this.mVideoWidth = iArr2[0];
        this.mVideoHeight = iArr2[1];
        Log.e("VideoView", "updateVideoFrame vWidth: " + this.mVideoWidth + " vHeight: " + this.mVideoHeight);
        if (this.mDwInstance == null || (view = this.mDwInstance.getView()) == null || view.getParent() != this) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = this.mVideoWidth;
        layoutParams.height = this.mVideoHeight;
        view.requestLayout();
        this.mDwInstance.setFrame(this.mVideoWidth, this.mVideoHeight);
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this}) : this.mVideoId;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this}) : this.mVideoUrl;
    }

    public String getThumbnailUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38969940", new Object[]{this}) : this.mThumbnailUrl;
    }

    public boolean isVideoPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a32d388", new Object[]{this})).booleanValue() : isVideoViewAttached() && this.mDwInstance.getVideoState() == 1;
    }

    public boolean play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue();
        }
        ensureDwInstanceCreated();
        if (this.mDwInstance == null) {
            return false;
        }
        if (!attachDwInstanceView()) {
            hideAttachedDwInstanceLastFrame();
        }
        int videoState = this.mDwInstance.getVideoState();
        if (videoState == 0 || videoState == 6 || videoState == 4) {
            this.mDwInstance.start();
            return true;
        } else if (videoState == 1) {
            return false;
        } else {
            this.mDwInstance.playVideo();
            return true;
        }
    }

    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        if (!isVideoViewAttached() || 1 != this.mDwInstance.getVideoState()) {
            return false;
        }
        this.mDwInstance.pauseVideo();
        return true;
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue() : this.isMute;
    }

    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isMute = z;
        if (!isVideoViewAttached()) {
            return;
        }
        this.mDwInstance.mute(this.isMute);
    }

    public void seekTo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49644ce6", new Object[]{this, new Float(f)});
        } else if (!isVideoViewAttached()) {
        } else {
            this.mDwInstance.seekTo((int) (f * ((float) this.mDwInstance.getDuration())));
        }
    }

    public long getVideoDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3db6f774", new Object[]{this})).longValue();
        }
        if (!isVideoViewAttached()) {
            return 0L;
        }
        return this.mDwInstance.getDuration();
    }

    public void setVisibilityChangeListener(TTImageUrlView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a3ff40", new Object[]{this, aVar});
        } else {
            this.mVisibilityChangeListener = aVar;
        }
    }

    public void setVideoViewChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b250d47", new Object[]{this, aVar});
        } else {
            this.mVideoViewChangeListener = aVar;
        }
    }

    public void setVideoLifecycleListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8e1fa3", new Object[]{this, bVar});
        } else {
            this.mVideoLifecycleListener = bVar;
        }
    }

    public void setVideoViewOnClickListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f575647", new Object[]{this, dVar});
        } else {
            this.mVideoViewOnClickListener = dVar;
        }
    }
}

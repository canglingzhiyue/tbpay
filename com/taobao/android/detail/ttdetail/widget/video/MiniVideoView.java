package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.n;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.RatioFrameLayout;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.emh;
import tb.eyy;
import tb.ezc;
import tb.kge;

/* loaded from: classes5.dex */
public class MiniVideoView extends AbsMiniVideoView<ezc> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_THUMBNAIL_URL = "thumbnailUrl";
    private static final String KEY_VIDEO_ID = "videoId";
    private static final String KEY_VIDEO_TYPE = "videoType";
    private static final String KEY_VIDEO_URL = "videoUrl";
    private View mClickMask;
    private View mCloseBtn;
    private boolean mCoverHiding;
    private ImageView mCoverImageView;
    private TTImageUrlView.a mCoverVisibilityChangeListener;
    private View mGradientView;
    private RatioFrameLayout mLayout;
    private String mRealDimensionRatio;
    private ConstraintLayout mRootLayout;
    private VideoView.b mSimpleVideoLifecycleListener;
    private TextView mTvVideoType;
    private List<a> mVideoDataList;
    private VideoView mVideoView;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f11059a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        static {
            kge.a(-2026596825);
        }

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f11059a = str;
            this.b = str2;
            this.e = str3;
            this.c = str4;
            this.d = str5;
        }
    }

    static {
        kge.a(-1541997955);
    }

    public static /* synthetic */ Object ipc$super(MiniVideoView miniVideoView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ VideoView access$000(MiniVideoView miniVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoView) ipChange.ipc$dispatch("a1deedea", new Object[]{miniVideoView}) : miniVideoView.mVideoView;
    }

    public static /* synthetic */ a access$100(MiniVideoView miniVideoView, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("84137eed", new Object[]{miniVideoView, str}) : miniVideoView.getCurrentVideoData(str);
    }

    public static /* synthetic */ ImageView access$200(MiniVideoView miniVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("85c73ca5", new Object[]{miniVideoView}) : miniVideoView.mCoverImageView;
    }

    public static /* synthetic */ void access$300(MiniVideoView miniVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdd9dea", new Object[]{miniVideoView});
        } else {
            miniVideoView.hideCoverImage();
        }
    }

    public static /* synthetic */ a access$400(MiniVideoView miniVideoView, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2d715b8a", new Object[]{miniVideoView, str}) : miniVideoView.getNextVideoData(str);
    }

    public static /* synthetic */ void access$500(MiniVideoView miniVideoView, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3a4b5f", new Object[]{miniVideoView, aVar});
        } else {
            miniVideoView.setMiniVideoData(aVar);
        }
    }

    public MiniVideoView(Context context) {
        super(context);
        this.mVideoDataList = new ArrayList(0);
        this.mRealDimensionRatio = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO;
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i)});
                } else if (i != 8 && i != 4) {
                } else {
                    MiniVideoView.access$300(MiniVideoView.this);
                }
            }
        };
        this.mSimpleVideoLifecycleListener = new VideoView.b() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -742210244) {
                    super.onVideoComplete();
                    return null;
                } else if (hashCode != 1266309869) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onVideoInfo(objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                super.onVideoComplete();
                MiniVideoView miniVideoView = MiniVideoView.this;
                a access$400 = MiniVideoView.access$400(miniVideoView, MiniVideoView.access$000(miniVideoView).getVideoUrl());
                if (access$400 != null) {
                    MiniVideoView.access$500(MiniVideoView.this, access$400);
                }
                MiniVideoView.access$000(MiniVideoView.this).play();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onVideoInfo(obj, i, i2);
                if (i != 12100) {
                    return;
                }
                MiniVideoView.access$300(MiniVideoView.this);
            }
        };
        initViews();
    }

    public MiniVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mVideoDataList = new ArrayList(0);
        this.mRealDimensionRatio = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO;
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i)});
                } else if (i != 8 && i != 4) {
                } else {
                    MiniVideoView.access$300(MiniVideoView.this);
                }
            }
        };
        this.mSimpleVideoLifecycleListener = new VideoView.b() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -742210244) {
                    super.onVideoComplete();
                    return null;
                } else if (hashCode != 1266309869) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onVideoInfo(objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                super.onVideoComplete();
                MiniVideoView miniVideoView = MiniVideoView.this;
                a access$400 = MiniVideoView.access$400(miniVideoView, MiniVideoView.access$000(miniVideoView).getVideoUrl());
                if (access$400 != null) {
                    MiniVideoView.access$500(MiniVideoView.this, access$400);
                }
                MiniVideoView.access$000(MiniVideoView.this).play();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onVideoInfo(obj, i, i2);
                if (i != 12100) {
                    return;
                }
                MiniVideoView.access$300(MiniVideoView.this);
            }
        };
        initViews();
    }

    public MiniVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVideoDataList = new ArrayList(0);
        this.mRealDimensionRatio = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO;
        this.mCoverVisibilityChangeListener = new TTImageUrlView.a() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
            public void a(TTImageUrlView tTImageUrlView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c401517d", new Object[]{this, tTImageUrlView, new Integer(i2)});
                } else if (i2 != 8 && i2 != 4) {
                } else {
                    MiniVideoView.access$300(MiniVideoView.this);
                }
            }
        };
        this.mSimpleVideoLifecycleListener = new VideoView.b() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -742210244) {
                    super.onVideoComplete();
                    return null;
                } else if (hashCode != 1266309869) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onVideoInfo(objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                super.onVideoComplete();
                MiniVideoView miniVideoView = MiniVideoView.this;
                a access$400 = MiniVideoView.access$400(miniVideoView, MiniVideoView.access$000(miniVideoView).getVideoUrl());
                if (access$400 != null) {
                    MiniVideoView.access$500(MiniVideoView.this, access$400);
                }
                MiniVideoView.access$000(MiniVideoView.this).play();
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i2), new Integer(i22)});
                    return;
                }
                super.onVideoInfo(obj, i2, i22);
                if (i2 != 12100) {
                    return;
                }
                MiniVideoView.access$300(MiniVideoView.this);
            }
        };
        initViews();
    }

    private void initViews() {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        d a2 = d.a(y.a(this));
        if (a2 != null) {
            inflate = a2.a(y.a(this), R.layout.tt_detail_mini_video_container, this, true);
        } else {
            inflate = LayoutInflater.from(y.a(this)).inflate(R.layout.tt_detail_mini_video_container, (ViewGroup) this, false);
        }
        addView(inflate, new FrameLayout.LayoutParams(-1, -2));
        this.mRootLayout = (ConstraintLayout) inflate.findViewById(R.id.cl_root_container);
        this.mLayout = (RatioFrameLayout) inflate.findViewById(R.id.rfl_constraint_container);
        this.mLayout.setWHRatio(this.mRealDimensionRatio);
        this.mCoverImageView = (ImageView) inflate.findViewById(R.id.tiv_cover);
        this.mCoverImageView.setBackgroundColor(0);
        this.mVideoView = (VideoView) inflate.findViewById(R.id.vv_actually_video_view);
        this.mGradientView = inflate.findViewById(R.id.v_video_view_bg_gradient);
        this.mVideoView.setVideoLifecycleListener(this.mSimpleVideoLifecycleListener);
        this.mVideoView.setVisibilityChangeListener(this.mCoverVisibilityChangeListener);
        this.mVideoView.setShowNotWifiHint(false);
        this.mVideoView.setMute(true);
        this.mCloseBtn = inflate.findViewById(R.id.view_close);
        this.mClickMask = inflate.findViewById(R.id.view_click_mask);
        this.mTvVideoType = (TextView) inflate.findViewById(R.id.tv_video_type);
        this.mCloseBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (MiniVideoView.this.mOnMiniVideoListener == null) {
                } else {
                    MiniVideoView.this.mOnMiniVideoListener.a(view);
                }
            }
        });
        this.mClickMask.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (MiniVideoView.this.mOnMiniVideoListener == null) {
                } else {
                    MiniVideoView miniVideoView = MiniVideoView.this;
                    a access$100 = MiniVideoView.access$100(miniVideoView, MiniVideoView.access$000(miniVideoView).getVideoUrl());
                    MiniVideoView.this.mOnMiniVideoListener.a(MiniVideoView.this, access$100 != null ? access$100.d : null);
                }
            }
        });
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public Rect getContentScreenRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f682b1e3", new Object[]{this});
        }
        int[] iArr = new int[2];
        this.mVideoView.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + this.mVideoView.getWidth(), iArr[1] + this.mVideoView.getHeight());
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void setVideoData(List<ezc> list) {
        eyy h;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a80b87b", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            String str = this.mRealDimensionRatio;
            this.mVideoDataList.clear();
            for (ezc ezcVar : list) {
                if (ezcVar != null && (h = ezcVar.h()) != null && (d = h.d()) != null && !d.isEmpty()) {
                    String string = d.getString("videoId");
                    String string2 = d.getString("videoUrl");
                    String string3 = d.getString("videoType");
                    String string4 = d.getString(KEY_THUMBNAIL_URL);
                    String b = ezcVar.b();
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        this.mVideoDataList.add(new a(string, string2, string3, string4, b));
                    }
                    str = ezcVar.k();
                    this.mRealDimensionRatio = str;
                }
            }
            if (emh.sDefaultDimension.equalsIgnoreCase(this.mRealDimensionRatio) || TextUtils.isEmpty(this.mRealDimensionRatio)) {
                str = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO;
            }
            this.mLayout.setWHRatio(str);
        }
    }

    private void setVideoTypeText(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9551e71", new Object[]{this, str});
            return;
        }
        this.mTvVideoType.setText(TextUtils.isEmpty(str) ? "" : str);
        View view = this.mGradientView;
        if (TextUtils.isEmpty(str)) {
            i = 4;
        }
        view.setVisibility(i);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void attachVideoLastFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba09c3b2", new Object[]{this, str});
            return;
        }
        a currentVideoData = getCurrentVideoData(str);
        if (currentVideoData == null) {
            return;
        }
        setMiniVideoData(currentVideoData);
        this.mVideoView.attachDwInstanceLastFrame();
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean pause() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue() : this.mVideoView.pause();
    }

    public boolean play() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue() : play(null);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean play(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f858a6c9", new Object[]{this, str})).booleanValue();
        }
        if (this.mVideoDataList.isEmpty()) {
            return false;
        }
        closeGlobalLiveVideoView();
        if (!TextUtils.isEmpty(str) || !this.mVideoView.isVideoPlaying()) {
            if (TextUtils.isEmpty(str)) {
                setMiniVideoData(this.mVideoDataList.get(0));
            } else if (!TextUtils.equals(str, this.mVideoView.getVideoUrl())) {
                Iterator<a> it = this.mVideoDataList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    a next = it.next();
                    if (TextUtils.equals(str, next.b)) {
                        setMiniVideoData(next);
                        z = true;
                        break;
                    }
                }
                if (!z && !this.mVideoView.isVideoPlaying()) {
                    setMiniVideoData(this.mVideoDataList.get(0));
                }
            }
        }
        this.mVideoView.setMute(true);
        return this.mVideoView.play();
    }

    private void setMiniVideoData(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb0ca74", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>(0);
            if (this.mDetailContext != null) {
                hashMap = n.a(this.mDetailContext.a());
            }
            this.mVideoView.setVideoData(aVar.f11059a, aVar.b, aVar.c, this.mRealDimensionRatio, hashMap);
            setVideoTypeText(aVar.e);
            if (this.mCoverHiding || this.mCoverImageView.getVisibility() != 0) {
                return;
            }
            if (!this.mVideoView.isBuildInCoverVisible()) {
                hideCoverImage();
            } else {
                q.a(this.mCoverImageView, this.mVideoView.getThumbnailUrl(), true);
            }
        }
    }

    private void hideCoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f30604d", new Object[]{this});
        } else if (this.mCoverHiding || this.mCoverImageView.getVisibility() == 8) {
        } else {
            this.mCoverHiding = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(168L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.MiniVideoView.3
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
                    } else {
                        MiniVideoView.access$200(MiniVideoView.this).setVisibility(8);
                    }
                }
            });
            this.mCoverImageView.startAnimation(alphaAnimation);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public Map<String, String> getVideoInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dece48cf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("videoId", this.mVideoView.getVideoId());
        hashMap.put("videoUrl", this.mVideoView.getVideoUrl());
        return hashMap;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void detachVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d239f174", new Object[]{this});
        } else {
            this.mVideoView.detachDwInstanceView();
        }
    }

    private a getCurrentVideoData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f0d9654a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.mVideoDataList.isEmpty()) {
            return null;
        }
        for (a aVar : this.mVideoDataList) {
            if (TextUtils.equals(aVar.b, str)) {
                return aVar;
            }
        }
        return null;
    }

    private a getNextVideoData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3da3d664", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.mVideoDataList.isEmpty()) {
            return null;
        }
        int size = this.mVideoDataList.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(this.mVideoDataList.get(i).b, str)) {
                int i2 = i + 1;
                if (i2 < size) {
                    return this.mVideoDataList.get(i2);
                }
                return this.mVideoDataList.get(0);
            }
        }
        return null;
    }
}

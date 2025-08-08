package com.taobao.android.miniLive.smallwindow;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.android.miniLive.smallwindow.FloatingVideoView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.ddw;
import tb.hub;
import tb.hud;
import tb.hue;
import tb.huf;
import tb.kge;

/* loaded from: classes6.dex */
public class FloatingVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView benefitImageView;
    private View favorView;
    private boolean isClickPlay;
    private boolean isDestroy;
    private String mAlgParams;
    private String mBizCode;
    private OnJumpLiveRoomListener mClickListener;
    private View.OnClickListener mCloseBtnClickListener;
    private a mFloatingVideoViewLifeCycleCallback;
    private Handler mHandler;
    private boolean mIsMute;
    private int mMaxHeight;
    private int mScreenHeight;
    private int mScreenWidth;
    private float mTouchX;
    private float mTouchY;
    private int mVideoHeight;
    private int mVideoWidth;
    private WindowManager.LayoutParams mWM;
    private int mWidth;
    private int margin;
    private IMediaPlayer mediaPlayer;
    private View playBtn;
    private SimpleLiveInfo simpleLiveInfo;
    private int statusBarHeight;
    private com.taobao.android.miniLive.ui.b tbLiveConfig;
    private boolean userAllowed;
    private TUrlImageView videoCover;
    private WindowManager windowManager;
    private float x;
    private float y;

    /* loaded from: classes6.dex */
    public interface OnJumpLiveRoomListener {
        void a(View view);
    }

    /* loaded from: classes6.dex */
    public interface a {
    }

    static {
        kge.a(812149065);
    }

    public static /* synthetic */ Object ipc$super(FloatingVideoView floatingVideoView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b00cac5", new Object[]{floatingVideoView})).booleanValue() : floatingVideoView.isDestroy;
    }

    public static /* synthetic */ View access$100(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1a13f322", new Object[]{floatingVideoView}) : floatingVideoView.playBtn;
    }

    public static /* synthetic */ TUrlImageView access$200(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("e186e9d", new Object[]{floatingVideoView}) : floatingVideoView.videoCover;
    }

    public static /* synthetic */ boolean access$300(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a98f6322", new Object[]{floatingVideoView})).booleanValue() : floatingVideoView.isClickPlay;
    }

    public static /* synthetic */ boolean access$302(FloatingVideoView floatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23dca37c", new Object[]{floatingVideoView, new Boolean(z)})).booleanValue();
        }
        floatingVideoView.isClickPlay = z;
        return z;
    }

    public static /* synthetic */ String access$400(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a914b03", new Object[]{floatingVideoView}) : floatingVideoView.mBizCode;
    }

    public static /* synthetic */ boolean access$500(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7dee7360", new Object[]{floatingVideoView})).booleanValue() : floatingVideoView.userAllowed;
    }

    public static /* synthetic */ boolean access$502(FloatingVideoView floatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5f9afe", new Object[]{floatingVideoView, new Boolean(z)})).booleanValue();
        }
        floatingVideoView.userAllowed = z;
        return z;
    }

    public static /* synthetic */ String access$600(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7988fe85", new Object[]{floatingVideoView}) : floatingVideoView.mAlgParams;
    }

    public static /* synthetic */ View.OnClickListener access$700(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("96d2d083", new Object[]{floatingVideoView}) : floatingVideoView.mCloseBtnClickListener;
    }

    public static /* synthetic */ void access$800(FloatingVideoView floatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7d0bb9", new Object[]{floatingVideoView});
        } else {
            floatingVideoView.sendMiniLiveStatus();
        }
    }

    public FloatingVideoView(Context context, String str, String str2) {
        super(context);
        this.windowManager = (WindowManager) getContext().getApplicationContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        this.mIsMute = true;
        this.statusBarHeight = 0;
        this.isClickPlay = false;
        this.isDestroy = false;
        this.userAllowed = false;
        this.mBizCode = str;
        this.mAlgParams = str2;
        this.statusBarHeight = hub.c(context);
        int b = com.taobao.taolive.sdk.utils.b.b(context);
        int c = com.taobao.taolive.sdk.utils.b.c(context);
        if (c > b) {
            this.mScreenWidth = b;
            this.mScreenHeight = c;
        } else {
            this.mScreenWidth = c;
            this.mScreenHeight = b;
        }
        this.margin = com.taobao.taolive.sdk.utils.b.a(context, 12.0f);
        this.mMaxHeight = this.mScreenHeight - (this.margin * 6);
    }

    public void setFloatingVideoViewLifeCycleCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d8d5fd", new Object[]{this, aVar});
        } else {
            this.mFloatingVideoViewLifeCycleCallback = aVar;
        }
    }

    public void startPlay(SimpleLiveInfo simpleLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4714801", new Object[]{this, simpleLiveInfo});
        } else if (this.mediaPlayer == null) {
            hue.a("TBMiniLiveFloating", "mediaPlayer is null");
        } else {
            this.simpleLiveInfo = simpleLiveInfo;
            playStreamUrl(simpleLiveInfo, com.taobao.android.miniLive.model.c.b(), com.taobao.android.miniLive.model.c.c(), com.taobao.android.miniLive.model.c.a(), true);
        }
    }

    public void playStreamUrl(SimpleLiveInfo simpleLiveInfo, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac01e86", new Object[]{this, simpleLiveInfo, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
        } else if (this.mediaPlayer == null) {
        } else {
            hue.a("TBLiveService", "playStreamUrl");
            this.mediaPlayer.q();
            this.mediaPlayer.o();
            this.mediaPlayer.e(z);
            this.mediaPlayer.d(z2);
            this.mediaPlayer.f(z3);
            MediaData a2 = com.taobao.android.miniLive.model.a.a(simpleLiveInfo);
            if (a2 != null && !z4) {
                a2.h265 = false;
            }
            this.mediaPlayer.a(a2, (String) null);
            if (simpleLiveInfo != null) {
                this.mediaPlayer.b(simpleLiveInfo.pushFeature);
            }
            this.mediaPlayer.j(hud.e());
            this.mediaPlayer.h(true);
            this.mediaPlayer.g();
            this.mediaPlayer.a(this.mIsMute);
        }
    }

    public void setVideoCover(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae36720f", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.videoCover;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(str);
    }

    public void init(Context context, SimpleLiveInfo simpleLiveInfo, IMediaPlayer iMediaPlayer, WindowManager.LayoutParams layoutParams, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b63bdf5", new Object[]{this, context, simpleLiveInfo, iMediaPlayer, layoutParams, new Boolean(z), new Boolean(z2)});
        } else if (iMediaPlayer == null) {
        } else {
            hue.a("TBLiveService", "TBMiniLiveFloatingVideoView init");
            this.mediaPlayer = iMediaPlayer;
            this.mWM = layoutParams;
            this.mIsMute = z2;
            initView(context, simpleLiveInfo, iMediaPlayer, z);
        }
    }

    private void initView(Context context, final SimpleLiveInfo simpleLiveInfo, final IMediaPlayer iMediaPlayer, boolean z) {
        View inflate;
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3275cae", new Object[]{this, context, simpleLiveInfo, iMediaPlayer, new Boolean(z)});
        } else if (iMediaPlayer.r() == null) {
        } else {
            if (hud.c(this.mBizCode)) {
                inflate = LayoutInflater.from(context).inflate(R.layout.taolive_mini_floatvideo_layout_new, (ViewGroup) this, false);
            } else if (z) {
                inflate = LayoutInflater.from(context).inflate(R.layout.taolive_mini_floatvideo_land_layout, (ViewGroup) this, false);
            } else {
                inflate = LayoutInflater.from(context).inflate(R.layout.taolive_mini_floatvideo_layout, (ViewGroup) this, false);
            }
            addView(inflate);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_weex_video_favor_anim);
            if (tUrlImageView != null) {
                tUrlImageView.setSkipAutoSize(true);
                tUrlImageView.setImageUrl(hud.a());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById(R.id.taolive_mini_living_tip);
            tUrlImageView2.setSkipAutoSize(true);
            tUrlImageView2.setImageUrl(hud.b());
            com.taobao.android.miniLive.ui.b bVar = this.tbLiveConfig;
            if (bVar != null && !bVar.e) {
                tUrlImageView2.setVisibility(8);
            } else {
                tUrlImageView2.setVisibility(0);
            }
            this.playBtn = findViewById(R.id.taolive_mini_video_play);
            this.playBtn.setVisibility(8);
            this.playBtn.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$FloatingVideoView$sOeErMNAhNWuxPJTcgtShmDgbj0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return FloatingVideoView.this.lambda$initView$4$FloatingVideoView(iMediaPlayer, simpleLiveInfo, view, motionEvent);
                }
            });
            TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById(R.id.taolive_mini_video_play_icon);
            if (tUrlImageView3 != null) {
                tUrlImageView3.setSkipAutoSize(true);
                tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01c7sTJQ24jcGFAI5xj_!!6000000007427-54-tps-72-72.apng");
            }
            final TUrlImageView tUrlImageView4 = (TUrlImageView) findViewById(R.id.taolive_mini_mute_btn);
            if (tUrlImageView4 != null) {
                if (this.mediaPlayer != null) {
                    tUrlImageView4.setImageUrl(this.mIsMute ? "https://img.alicdn.com/imgextra/i2/O1CN01NR6Eq01YCZzKbGroz_!!6000000003023-2-tps-100-100.png" : "https://img.alicdn.com/imgextra/i3/O1CN01f42nlW1DdVLAgzBSi_!!6000000000239-2-tps-100-100.png");
                }
                tUrlImageView4.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$FloatingVideoView$O3Be3TFOBZXEAk9zQtA4TxbtED4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FloatingVideoView.this.lambda$initView$5$FloatingVideoView(tUrlImageView4, r3, r4, view);
                    }
                });
            }
            if (simpleLiveInfo != null && simpleLiveInfo.item != null && (viewStub = (ViewStub) findViewById(R.id.taolive_mini_showcase_viewstub)) != null) {
                viewStub.setLayoutResource(R.layout.taolive_mini_showcase);
                View inflate2 = viewStub.inflate();
                ((TextView) inflate2.findViewById(R.id.tv_index_new)).setText(String.valueOf(simpleLiveInfo.item.index));
                ((TUrlImageView) inflate2.findViewById(R.id.taolive_showcase_item_icon)).setImageUrl(simpleLiveInfo.item.coverImage);
                ((TextView) inflate2.findViewById(R.id.taolive_showcase_item_tip_text)).setText(simpleLiveInfo.item.tips);
            }
            this.videoCover = (TUrlImageView) findViewById(R.id.taolive_mini_video_cover);
            iMediaPlayer.a(new AnonymousClass2());
            iMediaPlayer.a(new AnonymousClass3(context, iMediaPlayer, simpleLiveInfo));
            this.benefitImageView = (TUrlImageView) findViewById(R.id.taolive_mini_bottom_tips);
            this.favorView = findViewById(R.id.taolive_weex_favor_layout);
            if (this.benefitImageView != null) {
                boolean p = hud.p();
                if (simpleLiveInfo != null) {
                    if (p && simpleLiveInfo.benefits != null && simpleLiveInfo.benefits.get(0) != null) {
                        com.taobao.android.miniLive.model.b bVar2 = simpleLiveInfo.benefits.get(0);
                        if (!StringUtils.isEmpty(bVar2.f14331a) && bVar2.b > 0) {
                            this.benefitImageView.setImageUrl(bVar2.f14331a);
                            if (this.mHandler == null) {
                                this.mHandler = new Handler(Looper.getMainLooper());
                            }
                            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$FloatingVideoView$swywQOOfjVqN4ITHU6zVbARaI8Y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FloatingVideoView.this.lambda$initView$8$FloatingVideoView(simpleLiveInfo);
                                }
                            }, bVar2.b * 1000);
                        }
                    } else if (!StringUtils.isEmpty(simpleLiveInfo.defaultImageUrl)) {
                        this.benefitImageView.setImageUrl(simpleLiveInfo.defaultImageUrl);
                    } else if (StringUtils.isEmpty(simpleLiveInfo.defaultImageUrl)) {
                        this.benefitImageView.setImageUrl("https://gw.alicdn.com/tfs/TB10l6bbz39YK4jSZPcXXXrUFXa-324-96.png");
                    }
                    this.benefitImageView.setVisibility(0);
                } else {
                    com.taobao.android.miniLive.ui.b bVar3 = this.tbLiveConfig;
                    if (bVar3 != null && !bVar3.f) {
                        this.benefitImageView.setVisibility(8);
                    } else {
                        this.benefitImageView.setImageUrl("https://gw.alicdn.com/tfs/TB10l6bbz39YK4jSZPcXXXrUFXa-324-96.png");
                        this.benefitImageView.setVisibility(0);
                    }
                }
            }
            if (this.favorView != null) {
                com.taobao.android.miniLive.ui.b bVar4 = this.tbLiveConfig;
                if (bVar4 != null && bVar4.b) {
                    if (!this.tbLiveConfig.f) {
                        ((FrameLayout.LayoutParams) this.favorView.getLayoutParams()).bottomMargin = com.taobao.taolive.sdk.utils.b.a(getContext(), 12.0f);
                    }
                } else {
                    com.taobao.android.miniLive.ui.b bVar5 = this.tbLiveConfig;
                    if (bVar5 != null && !bVar5.b) {
                        this.favorView.setVisibility(8);
                    }
                }
            }
            int j = iMediaPlayer.j();
            int k = iMediaPlayer.k();
            int i = z ? 156 : 93;
            int i2 = z ? 90 : 169;
            if (hud.c(this.mBizCode)) {
                i = z ? 175 : 130;
                i2 = z ? 129 : 228;
            }
            this.mVideoWidth = com.taobao.taolive.sdk.utils.b.a(getContext(), i);
            if (j > 0 && k > 0) {
                this.mVideoHeight = (this.mVideoWidth * k) / j;
            } else {
                this.mVideoHeight = com.taobao.taolive.sdk.utils.b.a(getContext(), i2);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.taolive_weex_video_layout);
            if (iMediaPlayer.r() != null && (iMediaPlayer.r().getParent() instanceof ViewGroup)) {
                ((ViewGroup) iMediaPlayer.r().getParent()).removeView(iMediaPlayer.r());
            }
            if (iMediaPlayer.r() != null) {
                viewGroup.addView(iMediaPlayer.r(), 0, new FrameLayout.LayoutParams(-1, -1, 1));
            }
            findViewById(R.id.taolive_mini_close_layout).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.smallwindow.FloatingVideoView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    FloatingVideoView.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (FloatingVideoView.access$700(FloatingVideoView.this) == null) {
                    } else {
                        FloatingVideoView.access$700(FloatingVideoView.this).onClick(view);
                    }
                }
            });
            if (simpleLiveInfo == null) {
                return;
            }
            huf.a(simpleLiveInfo, "Show-Close", this.mBizCode, this.mAlgParams);
        }
    }

    public /* synthetic */ boolean lambda$initView$4$FloatingVideoView(final IMediaPlayer iMediaPlayer, final SimpleLiveInfo simpleLiveInfo, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b57216a8", new Object[]{this, iMediaPlayer, simpleLiveInfo, view, motionEvent})).booleanValue() : onTouchEvent(motionEvent, new OnJumpLiveRoomListener() { // from class: com.taobao.android.miniLive.smallwindow.FloatingVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                FloatingVideoView.this = this;
            }

            @Override // com.taobao.android.miniLive.smallwindow.FloatingVideoView.OnJumpLiveRoomListener
            public void a(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view2});
                    return;
                }
                FloatingVideoView.access$502(FloatingVideoView.this, true);
                IMediaPlayer iMediaPlayer2 = iMediaPlayer;
                if (iMediaPlayer2 != null) {
                    iMediaPlayer2.g();
                }
                if (FloatingVideoView.access$100(FloatingVideoView.this) != null) {
                    FloatingVideoView.access$100(FloatingVideoView.this).setVisibility(8);
                }
                FloatingVideoView.access$302(FloatingVideoView.this, true);
                FloatingVideoView.access$800(FloatingVideoView.this);
                huf.b(simpleLiveInfo, "FloatWindowPlay", FloatingVideoView.access$400(FloatingVideoView.this), FloatingVideoView.access$600(FloatingVideoView.this));
            }
        });
    }

    public /* synthetic */ void lambda$initView$5$FloatingVideoView(TUrlImageView tUrlImageView, String str, String str2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1379902e", new Object[]{this, tUrlImageView, str, str2, view});
            return;
        }
        IMediaPlayer iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer == null) {
            return;
        }
        this.mIsMute = !this.mIsMute;
        iMediaPlayer.a(this.mIsMute);
        if (com.taobao.taolive.sdk.ui.media.mute.b.a(null)) {
            com.taobao.taolive.sdk.ui.media.mute.b.a(null, this.mIsMute);
        }
        if (tUrlImageView != null) {
            if (!this.mIsMute) {
                str = str2;
            }
            tUrlImageView.setImageUrl(str);
        }
        sendMiniLiveStatus();
    }

    /* renamed from: com.taobao.android.miniLive.smallwindow.FloatingVideoView$2 */
    /* loaded from: classes6.dex */
    public class AnonymousClass2 implements IMediaPlayer.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$w71_FXnxQLhnyFwpn2jkTAezKK8(AnonymousClass2 anonymousClass2) {
            anonymousClass2.a();
        }

        public AnonymousClass2() {
            FloatingVideoView.this = r1;
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
        public void onPause(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
            } else if (FloatingVideoView.access$000(FloatingVideoView.this) || FloatingVideoView.access$100(FloatingVideoView.this) == null) {
            } else {
                FloatingVideoView.access$100(FloatingVideoView.this).post(new Runnable() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$FloatingVideoView$2$w71_FXnxQLhnyFwpn2jkTAezKK8
                    {
                        FloatingVideoView.AnonymousClass2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FloatingVideoView.AnonymousClass2.lambda$w71_FXnxQLhnyFwpn2jkTAezKK8(FloatingVideoView.AnonymousClass2.this);
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (FloatingVideoView.access$100(FloatingVideoView.this) != null) {
                FloatingVideoView.access$100(FloatingVideoView.this).setVisibility(0);
            }
            if (FloatingVideoView.access$200(FloatingVideoView.this) == null) {
                return;
            }
            FloatingVideoView.access$200(FloatingVideoView.this).setVisibility(0);
        }
    }

    /* renamed from: com.taobao.android.miniLive.smallwindow.FloatingVideoView$3 */
    /* loaded from: classes6.dex */
    public class AnonymousClass3 implements IMediaPlayer.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ IMediaPlayer c;
        public final /* synthetic */ SimpleLiveInfo d;

        /* renamed from: lambda$ly9e6rh1H-ohpHpeD7HiOt7OIeA */
        public static /* synthetic */ void m1003lambda$ly9e6rh1HohpHpeD7HiOt7OIeA(AnonymousClass3 anonymousClass3, Context context, IMediaPlayer iMediaPlayer, SimpleLiveInfo simpleLiveInfo) {
            anonymousClass3.a(context, iMediaPlayer, simpleLiveInfo);
        }

        public AnonymousClass3(Context context, IMediaPlayer iMediaPlayer, SimpleLiveInfo simpleLiveInfo) {
            FloatingVideoView.this = r1;
            this.b = context;
            this.c = iMediaPlayer;
            this.d = simpleLiveInfo;
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
        public void onStart(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
            } else if (FloatingVideoView.access$000(FloatingVideoView.this) || FloatingVideoView.access$100(FloatingVideoView.this) == null) {
            } else {
                View access$100 = FloatingVideoView.access$100(FloatingVideoView.this);
                final Context context = this.b;
                final IMediaPlayer iMediaPlayer2 = this.c;
                final SimpleLiveInfo simpleLiveInfo = this.d;
                access$100.post(new Runnable() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$FloatingVideoView$3$ly9e6rh1H-ohpHpeD7HiOt7OIeA
                    @Override // java.lang.Runnable
                    public final void run() {
                        FloatingVideoView.AnonymousClass3.m1003lambda$ly9e6rh1HohpHpeD7HiOt7OIeA(FloatingVideoView.AnonymousClass3.this, context, iMediaPlayer2, simpleLiveInfo);
                    }
                });
            }
        }

        public /* synthetic */ void a(Context context, IMediaPlayer iMediaPlayer, SimpleLiveInfo simpleLiveInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94b8c75a", new Object[]{this, context, iMediaPlayer, simpleLiveInfo});
            } else if (!FloatingVideoView.access$300(FloatingVideoView.this) && !StringUtils.equals(FloatingVideoView.access$400(FloatingVideoView.this), "zoom") && !hud.c(context) && !FloatingVideoView.access$500(FloatingVideoView.this)) {
                if (iMediaPlayer == null) {
                    return;
                }
                iMediaPlayer.i();
                huf.a(simpleLiveInfo, "Show-FloatWindowPlay", FloatingVideoView.access$400(FloatingVideoView.this), FloatingVideoView.access$600(FloatingVideoView.this));
            } else {
                if (FloatingVideoView.access$200(FloatingVideoView.this) != null) {
                    FloatingVideoView.access$200(FloatingVideoView.this).setVisibility(8);
                }
                if (FloatingVideoView.access$100(FloatingVideoView.this) == null) {
                    return;
                }
                FloatingVideoView.access$100(FloatingVideoView.this).setVisibility(8);
            }
        }
    }

    public /* synthetic */ void lambda$initView$8$FloatingVideoView(SimpleLiveInfo simpleLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c80fd71", new Object[]{this, simpleLiveInfo});
        } else if (simpleLiveInfo == null || simpleLiveInfo.defaultImageUrl == null) {
        } else {
            this.benefitImageView.setImageUrl(simpleLiveInfo.defaultImageUrl);
        }
    }

    public void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556e415c", new Object[]{this, onClickListener});
        } else {
            this.mCloseBtnClickListener = onClickListener;
        }
    }

    public void setTbLiveConfig(com.taobao.android.miniLive.ui.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7403ab4", new Object[]{this, bVar});
        } else {
            this.tbLiveConfig = bVar;
        }
    }

    public void setOnViewClickListener(OnJumpLiveRoomListener onJumpLiveRoomListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89d7c9", new Object[]{this, onJumpLiveRoomListener});
        } else {
            this.mClickListener = onJumpLiveRoomListener;
        }
    }

    public void updateMuteView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4cc346", new Object[]{this, new Boolean(z)});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_mini_mute_btn);
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(z ? "https://img.alicdn.com/imgextra/i2/O1CN01NR6Eq01YCZzKbGroz_!!6000000003023-2-tps-100-100.png" : "https://img.alicdn.com/imgextra/i3/O1CN01f42nlW1DdVLAgzBSi_!!6000000000239-2-tps-100-100.png");
    }

    private void pullToBoundary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58d6771", new Object[]{this});
            return;
        }
        final WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int i = layoutParams.x + (this.mWidth / 2);
        int i2 = this.mScreenWidth;
        ValueAnimator ofInt = ValueAnimator.ofInt(layoutParams.x, i >= i2 / 2 ? (i2 - this.margin) - this.mVideoWidth : this.margin);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$FloatingVideoView$h3KqiGSqXHZeTqg2Ibnd2F75c3Y
            {
                FloatingVideoView.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FloatingVideoView.this.lambda$pullToBoundary$9$FloatingVideoView(layoutParams, valueAnimator);
            }
        });
        ofInt.start();
    }

    public /* synthetic */ void lambda$pullToBoundary$9$FloatingVideoView(WindowManager.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42556057", new Object[]{this, layoutParams, valueAnimator});
        } else {
            updateViewPosition(((Integer) valueAnimator.getAnimatedValue()).intValue(), layoutParams.y);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.mWidth = i3 - i;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : onTouchEvent(motionEvent, this.mClickListener);
    }

    public boolean onTouchEvent(MotionEvent motionEvent, OnJumpLiveRoomListener onJumpLiveRoomListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29b21666", new Object[]{this, motionEvent, onJumpLiveRoomListener})).booleanValue();
        }
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        this.x = motionEvent.getRawX();
        this.y = motionEvent.getRawY() - (rect.top - 48);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mTouchX = motionEvent.getX();
            this.mTouchY = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2 && (Math.abs(motionEvent.getX() - this.mTouchX) > 10.0f || Math.abs(motionEvent.getY() - this.mTouchY) > 10.0f)) {
                updateViewPosition();
            }
        } else {
            if (Math.abs(motionEvent.getX() - this.mTouchX) >= 10.0f || Math.abs(motionEvent.getY() - this.mTouchY) >= 10.0f) {
                pullToBoundary();
            } else if (onJumpLiveRoomListener != null) {
                onJumpLiveRoomListener.a(this);
            }
            this.mTouchY = 0.0f;
            this.mTouchX = 0.0f;
        }
        return true;
    }

    private void updateViewPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f517eb5e", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.mWM;
        if (layoutParams == null || this.windowManager == null) {
            return;
        }
        layoutParams.x = (int) (this.x - this.mTouchX);
        layoutParams.y = (int) (this.y - this.mTouchY);
        if (layoutParams.x < 0) {
            this.mWM.x = this.margin;
        }
        int i = this.mWM.x;
        int i2 = this.mVideoWidth;
        int i3 = i + i2;
        int i4 = this.mScreenWidth;
        if (i3 > i4) {
            this.mWM.x = (i4 - this.margin) - i2;
        }
        if (this.mWM.y < 0) {
            this.mWM.y = 0;
        }
        int i5 = this.mWM.y;
        int i6 = this.mVideoHeight;
        int i7 = i5 + i6;
        int i8 = this.mMaxHeight;
        if (i7 > i8) {
            this.mWM.y = i8 - i6;
        }
        try {
            this.windowManager.updateViewLayout(this, this.mWM);
        } catch (Exception unused) {
        }
    }

    private void updateViewPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ec3e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        layoutParams.x = i;
        layoutParams.y = i2;
        try {
            this.windowManager.updateViewLayout(this, layoutParams);
        } catch (Exception e) {
            hue.a("TBMiniLiveFloating", e.getMessage());
        }
    }

    public void updateViewPositionOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a63d71", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            Rect rect = new Rect(layoutParams.x, layoutParams.y + this.statusBarHeight, layoutParams.width + layoutParams.x, layoutParams.y + layoutParams.height + this.statusBarHeight);
            hue.a("TBMiniLiveFloating", "rect = " + rect + " top = " + i2 + " lp.y = " + (layoutParams.y + this.statusBarHeight));
            if (rect.contains(i, i2)) {
                int i3 = layoutParams.y;
                layoutParams.y = ((i2 - layoutParams.height) - this.statusBarHeight) - com.taobao.taolive.sdk.utils.b.a(getContext(), 10.0f);
                if (layoutParams.y > i3) {
                    layoutParams.y = i3;
                }
                this.windowManager.updateViewLayout(this, layoutParams);
            } else if (layoutParams.y <= i2) {
            } else {
                layoutParams.y = ((i2 - layoutParams.height) - this.statusBarHeight) - com.taobao.taolive.sdk.utils.b.a(getContext(), 10.0f);
                this.windowManager.updateViewLayout(this, layoutParams);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.isDestroy = true;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            return;
        }
        try {
            windowManager.removeView(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMiniLiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f72764", new Object[]{this});
        } else if (this.mediaPlayer == null || !hud.z()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("mute", this.mediaPlayer.x() ? "MUTE" : "NONMUTE");
            hashMap.put("playType", this.isClickPlay ? "CLICK" : "AUTO");
            ddw.a().a("com.taobao.taolive.minilive.mediaplatform_video_mute", hashMap);
        }
    }

    public void setClickPlay(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4e5cd3", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.isClickPlay && !z) {
            z2 = false;
        }
        this.isClickPlay = z2;
    }

    public void switchLower() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6db8a34", new Object[]{this});
            return;
        }
        IMediaPlayer iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.k(true);
    }

    public boolean canSwitchLower() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ce32848", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.mediaPlayer;
        return iMediaPlayer != null && iMediaPlayer.z();
    }
}

package com.taobao.android.miniLive.sdk;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.android.miniLive.ui.b;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.ddw;
import tb.hub;
import tb.hud;
import tb.hue;
import tb.huf;
import tb.kge;

/* loaded from: classes6.dex */
public class TBMiniLiveFloatingVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView benefitImageView;
    private View favorView;
    private boolean isClickPlay;
    private boolean isDestroy;
    private String mAlgParams;
    private String mBizCode;
    private OnJumpLiveRoomListener mClickListener;
    private View.OnClickListener mCloseBtnClickListener;
    private RelativeLayout mCloseSwitchTipLayout;
    private a mFloatingVideoViewLifeCycleCallback;
    private Handler mHandler;
    private boolean mIsMute;
    private int mMaxHeight;
    private int mScreenHeight;
    private int mScreenWidth;
    private TUrlImageView mSwitchTipCloseBtn;
    private float mTouchX;
    private float mTouchY;
    private int mVideoHeight;
    private int mVideoWidth;
    private WindowManager.LayoutParams mWM;
    private int mWidth;
    private int margin;
    private IMediaPlayer mediaPlayer;
    private View playBtn;
    private int statusBarHeight;
    private b tbLiveConfig;
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
        void a();

        void a(boolean z);
    }

    static {
        kge.a(385465659);
    }

    public static /* synthetic */ Object ipc$super(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -349229044) {
            super.onConfigurationChanged((Configuration) objArr[0]);
            return null;
        } else if (hashCode != -244855388) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
    }

    public static /* synthetic */ boolean access$000(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e10fa913", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue() : tBMiniLiveFloatingVideoView.userAllowed;
    }

    public static /* synthetic */ boolean access$002(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f869232b", new Object[]{tBMiniLiveFloatingVideoView, new Boolean(z)})).booleanValue();
        }
        tBMiniLiveFloatingVideoView.userAllowed = z;
        return z;
    }

    public static /* synthetic */ View access$100(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d0f2fe30", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.playBtn;
    }

    public static /* synthetic */ TUrlImageView access$1000(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("77c4c1bc", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.videoCover;
    }

    public static /* synthetic */ TUrlImageView access$1100(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("518e8efd", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.benefitImageView;
    }

    public static /* synthetic */ View.OnClickListener access$1200(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("2ce0c6e7", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.mCloseBtnClickListener;
    }

    public static /* synthetic */ void access$1300(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4a4c7d", new Object[]{tBMiniLiveFloatingVideoView, new Integer(i), new Integer(i2)});
        } else {
            tBMiniLiveFloatingVideoView.updateViewPosition(i, i2);
        }
    }

    public static /* synthetic */ boolean access$200(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19eba1d1", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue() : tBMiniLiveFloatingVideoView.isClickPlay;
    }

    public static /* synthetic */ boolean access$202(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db0c422d", new Object[]{tBMiniLiveFloatingVideoView, new Boolean(z)})).booleanValue();
        }
        tBMiniLiveFloatingVideoView.isClickPlay = z;
        return z;
    }

    public static /* synthetic */ void access$300(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6599e2c", new Object[]{tBMiniLiveFloatingVideoView});
        } else {
            tBMiniLiveFloatingVideoView.sendMiniLiveStatus();
        }
    }

    public static /* synthetic */ String access$400(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a8f6175", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.mBizCode;
    }

    public static /* synthetic */ String access$500(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("327bcef6", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.mAlgParams;
    }

    public static /* synthetic */ IMediaPlayer access$600(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer) ipChange.ipc$dispatch("41fb4a23", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.mediaPlayer;
    }

    public static /* synthetic */ boolean access$700(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28118fac", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue() : tBMiniLiveFloatingVideoView.mIsMute;
    }

    public static /* synthetic */ boolean access$702(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91a40fb2", new Object[]{tBMiniLiveFloatingVideoView, new Boolean(z)})).booleanValue();
        }
        tBMiniLiveFloatingVideoView.mIsMute = z;
        return z;
    }

    public static /* synthetic */ a access$800(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b2508740", new Object[]{tBMiniLiveFloatingVideoView}) : tBMiniLiveFloatingVideoView.mFloatingVideoViewLifeCycleCallback;
    }

    public static /* synthetic */ boolean access$900(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60ed886a", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue() : tBMiniLiveFloatingVideoView.isDestroy;
    }

    public TBMiniLiveFloatingVideoView(Context context, String str, String str2) {
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
        this.margin = com.taobao.taolive.sdk.utils.b.a(context, 12.0f);
    }

    public void setFloatingVideoViewLifeCycleCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef6e68b", new Object[]{this, aVar});
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
            updateScreenSize(context);
            initView(context, simpleLiveInfo, iMediaPlayer, z);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        hue.a("TBLiveService", "TBMiniLiveFloatingVideoView onConfigurationChanged");
        updateScreenSize(getContext());
        if (y.c(getContext())) {
            return;
        }
        pullToBoundary();
    }

    private void initView(final Context context, final SimpleLiveInfo simpleLiveInfo, final IMediaPlayer iMediaPlayer, boolean z) {
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
            b bVar = this.tbLiveConfig;
            if (bVar != null && !bVar.e) {
                tUrlImageView2.setVisibility(8);
            } else {
                tUrlImageView2.setVisibility(0);
            }
            this.mCloseSwitchTipLayout = (RelativeLayout) findViewById(R.id.taolive_close_switch_tip_layout);
            this.mSwitchTipCloseBtn = (TUrlImageView) findViewById(R.id.taolive_close_switch_tip_btn);
            this.playBtn = findViewById(R.id.taolive_mini_video_play);
            this.playBtn.setVisibility(8);
            this.playBtn.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue() : TBMiniLiveFloatingVideoView.this.onTouchEvent(motionEvent, new OnJumpLiveRoomListener() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
                        public void a(View view2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("9501e36a", new Object[]{this, view2});
                                return;
                            }
                            TBMiniLiveFloatingVideoView.access$002(TBMiniLiveFloatingVideoView.this, true);
                            if (iMediaPlayer != null) {
                                iMediaPlayer.g();
                            }
                            if (TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) != null) {
                                TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).setVisibility(8);
                            }
                            TBMiniLiveFloatingVideoView.access$202(TBMiniLiveFloatingVideoView.this, true);
                            TBMiniLiveFloatingVideoView.access$300(TBMiniLiveFloatingVideoView.this);
                            huf.b(simpleLiveInfo, "FloatWindowPlay", TBMiniLiveFloatingVideoView.access$400(TBMiniLiveFloatingVideoView.this), TBMiniLiveFloatingVideoView.access$500(TBMiniLiveFloatingVideoView.this));
                        }
                    });
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
                if ("mBizCode".equals(this.mBizCode)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tUrlImageView4.getLayoutParams();
                    layoutParams.topMargin = com.taobao.taolive.sdk.utils.b.a(context, 30.0f);
                    tUrlImageView4.setLayoutParams(layoutParams);
                }
                tUrlImageView4.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (TBMiniLiveFloatingVideoView.access$600(TBMiniLiveFloatingVideoView.this) == null) {
                        } else {
                            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = TBMiniLiveFloatingVideoView.this;
                            TBMiniLiveFloatingVideoView.access$702(tBMiniLiveFloatingVideoView, !TBMiniLiveFloatingVideoView.access$700(tBMiniLiveFloatingVideoView));
                            if (com.taobao.taolive.sdk.ui.media.mute.b.a(null)) {
                                com.taobao.taolive.sdk.ui.media.mute.b.a(null, TBMiniLiveFloatingVideoView.access$700(TBMiniLiveFloatingVideoView.this));
                            }
                            TBMiniLiveFloatingVideoView.access$600(TBMiniLiveFloatingVideoView.this).a(TBMiniLiveFloatingVideoView.access$700(TBMiniLiveFloatingVideoView.this));
                            TUrlImageView tUrlImageView5 = tUrlImageView4;
                            if (tUrlImageView5 != null) {
                                tUrlImageView5.setImageUrl(TBMiniLiveFloatingVideoView.access$700(TBMiniLiveFloatingVideoView.this) ? "https://img.alicdn.com/imgextra/i2/O1CN01NR6Eq01YCZzKbGroz_!!6000000003023-2-tps-100-100.png" : "https://img.alicdn.com/imgextra/i3/O1CN01f42nlW1DdVLAgzBSi_!!6000000000239-2-tps-100-100.png");
                            }
                            if (TBMiniLiveFloatingVideoView.access$800(TBMiniLiveFloatingVideoView.this) != null) {
                                TBMiniLiveFloatingVideoView.access$800(TBMiniLiveFloatingVideoView.this).a(TBMiniLiveFloatingVideoView.access$700(TBMiniLiveFloatingVideoView.this));
                            }
                            TBMiniLiveFloatingVideoView.access$300(TBMiniLiveFloatingVideoView.this);
                        }
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
            iMediaPlayer.a(new IMediaPlayer.h() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
                public void onPause(IMediaPlayer iMediaPlayer2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer2});
                    } else if (TBMiniLiveFloatingVideoView.access$900(TBMiniLiveFloatingVideoView.this) || TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) == null) {
                    } else {
                        TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).post(new Runnable() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) != null) {
                                    TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).setVisibility(0);
                                }
                                if (TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this) == null) {
                                    return;
                                }
                                TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this).setVisibility(0);
                            }
                        });
                    }
                }
            });
            iMediaPlayer.a(new IMediaPlayer.j() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
                public void onStart(IMediaPlayer iMediaPlayer2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer2});
                    } else if (TBMiniLiveFloatingVideoView.access$900(TBMiniLiveFloatingVideoView.this) || TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) == null) {
                    } else {
                        TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).post(new Runnable() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (!TBMiniLiveFloatingVideoView.access$200(TBMiniLiveFloatingVideoView.this) && !TextUtils.equals(TBMiniLiveFloatingVideoView.access$400(TBMiniLiveFloatingVideoView.this), "zoom") && !hud.c(context) && !TBMiniLiveFloatingVideoView.access$000(TBMiniLiveFloatingVideoView.this)) {
                                    if (iMediaPlayer == null) {
                                        return;
                                    }
                                    iMediaPlayer.i();
                                    huf.a(simpleLiveInfo, "Show-FloatWindowPlay", TBMiniLiveFloatingVideoView.access$400(TBMiniLiveFloatingVideoView.this), TBMiniLiveFloatingVideoView.access$500(TBMiniLiveFloatingVideoView.this));
                                } else {
                                    if (TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this) != null) {
                                        TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this).setVisibility(8);
                                    }
                                    if (TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) == null) {
                                        return;
                                    }
                                    TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).setVisibility(8);
                                }
                            }
                        });
                    }
                }
            });
            this.benefitImageView = (TUrlImageView) findViewById(R.id.taolive_mini_bottom_tips);
            this.favorView = findViewById(R.id.taolive_weex_favor_layout);
            if (this.benefitImageView != null) {
                boolean p = hud.p();
                if (simpleLiveInfo != null) {
                    if (p && simpleLiveInfo.benefits != null && simpleLiveInfo.benefits.get(0) != null) {
                        com.taobao.android.miniLive.model.b bVar2 = simpleLiveInfo.benefits.get(0);
                        if (!TextUtils.isEmpty(bVar2.f14331a) && bVar2.b > 0) {
                            this.benefitImageView.setImageUrl(bVar2.f14331a);
                            if (this.mHandler == null) {
                                this.mHandler = new Handler(Looper.getMainLooper());
                            }
                            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.5
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    SimpleLiveInfo simpleLiveInfo2 = simpleLiveInfo;
                                    if (simpleLiveInfo2 == null || simpleLiveInfo2.defaultImageUrl == null) {
                                        return;
                                    }
                                    TBMiniLiveFloatingVideoView.access$1100(TBMiniLiveFloatingVideoView.this).setImageUrl(simpleLiveInfo.defaultImageUrl);
                                }
                            }, bVar2.b * 1000);
                        }
                    } else if (!TextUtils.isEmpty(simpleLiveInfo.defaultImageUrl)) {
                        this.benefitImageView.setImageUrl(simpleLiveInfo.defaultImageUrl);
                    } else if (TextUtils.isEmpty(simpleLiveInfo.defaultImageUrl)) {
                        this.benefitImageView.setImageUrl("https://gw.alicdn.com/tfs/TB10l6bbz39YK4jSZPcXXXrUFXa-324-96.png");
                    }
                    this.benefitImageView.setVisibility(0);
                } else {
                    b bVar3 = this.tbLiveConfig;
                    if (bVar3 != null && !bVar3.f) {
                        this.benefitImageView.setVisibility(8);
                    } else {
                        this.benefitImageView.setImageUrl("https://gw.alicdn.com/tfs/TB10l6bbz39YK4jSZPcXXXrUFXa-324-96.png");
                        this.benefitImageView.setVisibility(0);
                    }
                }
            }
            if (this.favorView != null) {
                b bVar4 = this.tbLiveConfig;
                if (bVar4 != null && bVar4.b) {
                    if (!this.tbLiveConfig.f) {
                        ((FrameLayout.LayoutParams) this.favorView.getLayoutParams()).bottomMargin = com.taobao.taolive.sdk.utils.b.a(getContext(), 12.0f);
                    }
                } else {
                    b bVar5 = this.tbLiveConfig;
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
            findViewById(R.id.taolive_mini_close_layout).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (TBMiniLiveFloatingVideoView.access$1200(TBMiniLiveFloatingVideoView.this) == null) {
                    } else {
                        TBMiniLiveFloatingVideoView.access$1200(TBMiniLiveFloatingVideoView.this).onClick(view);
                    }
                }
            });
            if (simpleLiveInfo != null) {
                huf.a(simpleLiveInfo, "Show-Close", this.mBizCode, this.mAlgParams);
            }
            hue.a("TBMiniLiveFloating", "mVideoWidth = " + this.mVideoWidth + " mVideoHeight = " + this.mVideoHeight);
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

    public void showCloseSwitchTips(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9758248b", new Object[]{this, onClickListener});
            return;
        }
        RelativeLayout relativeLayout = this.mCloseSwitchTipLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        TUrlImageView tUrlImageView = this.mSwitchTipCloseBtn;
        if (tUrlImageView != null) {
            tUrlImageView.setOnClickListener(onClickListener);
        }
        View findViewById = findViewById(R.id.taolive_mini_close_layout);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setTbLiveConfig(b bVar) {
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
            ipChange.ipc$dispatch("45ad403b", new Object[]{this, onJumpLiveRoomListener});
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
            return ((Boolean) ipChange.ipc$dispatch("76c03c98", new Object[]{this, motionEvent, onJumpLiveRoomListener})).booleanValue();
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
                if (!y.c(getContext())) {
                    pullToBoundary();
                }
            } else if (onJumpLiveRoomListener != null) {
                onJumpLiveRoomListener.a(this);
            }
            this.mTouchY = 0.0f;
            this.mTouchX = 0.0f;
        }
        return true;
    }

    private void updateViewPosition() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f517eb5e", new Object[]{this});
        } else if (this.mWM == null || this.windowManager == null) {
        } else {
            boolean c = y.c(getContext());
            int i2 = (int) (this.x - this.mTouchX);
            int i3 = (int) (this.y - this.mTouchY);
            if (!c) {
                int max = Math.max(this.margin, i2);
                int max2 = Math.max(this.margin, i3);
                int i4 = this.mScreenWidth - this.mVideoWidth;
                int i5 = this.margin;
                i = Math.min(i4 - i5, max);
                i3 = Math.min((this.mMaxHeight - this.mVideoHeight) - i5, max2);
            } else {
                i = i2;
            }
            WindowManager.LayoutParams layoutParams = this.mWM;
            layoutParams.x = i;
            layoutParams.y = i3;
            try {
                this.windowManager.updateViewLayout(this, layoutParams);
            } catch (Exception e) {
                hue.a("TBMiniLiveFloating", "Unable to update view layout: " + e.getMessage());
            }
            hue.a("TBMiniLiveFloating", "updateViewPosition 2 newX = " + i + " newY = " + i3);
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
        if (this.windowManager == null) {
            return;
        }
        try {
            if (this.mFloatingVideoViewLifeCycleCallback != null) {
                this.mFloatingVideoViewLifeCycleCallback.a();
            }
            this.windowManager.removeView(this);
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
            com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
            String str = null;
            if (a2 != null) {
                str = a2.G();
            }
            ddw.a().a("com.taobao.taolive.minilive.mediaplatform_video_mute", hashMap, str);
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
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    TBMiniLiveFloatingVideoView.access$1300(TBMiniLiveFloatingVideoView.this, ((Integer) valueAnimator.getAnimatedValue()).intValue(), layoutParams.y);
                }
            }
        });
        ofInt.start();
    }

    private void updateScreenSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c8a4ab", new Object[]{this, context});
        } else if (context == null) {
        } else {
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = this.windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
                point.x = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
                point.y = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
            } else {
                this.windowManager.getDefaultDisplay().getSize(point);
            }
            this.mScreenWidth = point.x;
            this.mScreenHeight = point.y;
            this.mMaxHeight = this.mScreenHeight - (this.margin * 6);
            hue.a("TBMiniLiveFloating", "updateScreenSize mScreenWidth = " + this.mScreenWidth + " mScreenHeight = " + this.mScreenHeight);
        }
    }
}

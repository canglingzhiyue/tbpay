package com.taobao.taolive.sdk.ui.media.playercontrol;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.y;
import java.util.Locale;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class PlayerController2 implements Handler.Callback, SeekBar.OnSeekBarChangeListener, IMediaPlayer.d, IMediaPlayer.e, IMediaPlayer.f, IMediaPlayer.h, IMediaPlayer.i, IMediaPlayer.j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_UPDATE_SEEKBAR_PROGRESS = 1;
    private static final float[] PLAY_RATE_ARRAY;
    public static final int SHOW_ALL = 1;
    public static final int SHOW_FULL_SCREEN_BTN = 3;
    public static final int SHOW_NONE = 4;
    public static final int SHOW_PLAY_CONTROLLER = 2;
    public static final int STEP = 15000;
    private static final String TAG = "PlayerController";
    private static final int UPDATE_PROGRESS_TIME = 500;
    public String defaultPlayRateViewText;
    private Context mContext;
    private com.taobao.taolive.sdk.ui.media.playercontrol.a mControllerHolder;
    private View mDefaultControllerView;
    public com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private Handler mHandler;
    private com.taobao.taolive.sdk.ui.media.playercontrol.b mPlayForwardListener;
    private a mPlayOrPauseButtonListener;
    private b mPlayProgressListener;
    private com.taobao.taolive.sdk.ui.media.playercontrol.c mPlayRateControlListener;
    private c mPlayStartOrCompletionListener;
    private e mSeekStopTrackingListener;
    private f mToggleScreenListener;
    private com.taobao.taolive.sdk.ui.media.d mVideoView;
    public d playerStatusListener;
    private boolean mIsSeekBarOnChange = false;
    private boolean mIsDefaultController = false;
    private int mShowType = 1;
    private int mPlayRateIndex = 0;
    private boolean mIsDestroyed = false;
    private boolean mIsFullScreen = false;
    private long newPosition = 0;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onPlayProgress(long j);
    }

    /* loaded from: classes8.dex */
    public interface c {
        void a();

        void b();
    }

    /* loaded from: classes8.dex */
    public interface d {
    }

    /* loaded from: classes8.dex */
    public interface e {
        void onStopTrackingTouch(boolean z);

        void onStopTrackingTouch(boolean z, long j);
    }

    /* loaded from: classes8.dex */
    public interface f {
        boolean a();

        boolean b();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
        }
    }

    public static /* synthetic */ com.taobao.taolive.sdk.ui.media.d access$000(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("71c97c8f", new Object[]{playerController2}) : playerController2.mVideoView;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.ui.media.playercontrol.a access$100(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.playercontrol.a) ipChange.ipc$dispatch("8a393ca4", new Object[]{playerController2}) : playerController2.mControllerHolder;
    }

    public static /* synthetic */ a access$200(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8f1a9bf2", new Object[]{playerController2}) : playerController2.mPlayOrPauseButtonListener;
    }

    public static /* synthetic */ int access$300(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a29c38d5", new Object[]{playerController2})).intValue() : playerController2.mPlayRateIndex;
    }

    public static /* synthetic */ int access$302(PlayerController2 playerController2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7742bcd6", new Object[]{playerController2, new Integer(i)})).intValue();
        }
        playerController2.mPlayRateIndex = i;
        return i;
    }

    public static /* synthetic */ float[] access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("7d6f9bc6", new Object[0]) : PLAY_RATE_ARRAY;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.ui.media.playercontrol.c access$500(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.playercontrol.c) ipChange.ipc$dispatch("7f8a85e", new Object[]{playerController2}) : playerController2.mPlayRateControlListener;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.ui.media.playercontrol.b access$600(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.playercontrol.b) ipChange.ipc$dispatch("6768831e", new Object[]{playerController2}) : playerController2.mPlayForwardListener;
    }

    static {
        kge.a(1887692485);
        kge.a(-1967544404);
        kge.a(-1043440182);
        kge.a(-553593734);
        kge.a(120490142);
        kge.a(1292720338);
        kge.a(-2089353637);
        kge.a(-140290219);
        kge.a(-1982836436);
        kge.a(305979072);
        PLAY_RATE_ARRAY = new float[]{1.0f, 1.5f, 2.0f};
    }

    public com.taobao.taolive.sdk.ui.media.d getmVideoView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("6429033a", new Object[]{this}) : this.mVideoView;
    }

    public void setmPlayOrPauseButtonListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1832fe", new Object[]{this, aVar});
        } else {
            this.mPlayOrPauseButtonListener = aVar;
        }
    }

    public void setmPlayStartOrCompletionListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8165800", new Object[]{this, cVar});
        } else {
            this.mPlayStartOrCompletionListener = cVar;
        }
    }

    public PlayerController2(Context context, com.taobao.taolive.sdk.ui.media.d dVar) {
        this.mContext = context;
    }

    public void bindListener(com.taobao.taolive.sdk.ui.media.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f4b102", new Object[]{this, dVar});
            return;
        }
        this.mVideoView = dVar;
        this.mVideoView.a((IMediaPlayer.d) this);
        this.mVideoView.a((IMediaPlayer.f) this);
        this.mVideoView.a((IMediaPlayer.e) this);
        this.mVideoView.a((IMediaPlayer.i) this);
        this.mVideoView.a((IMediaPlayer.j) this);
        this.mVideoView.a((IMediaPlayer.h) this);
    }

    public void setControllerHolder(com.taobao.taolive.sdk.ui.media.playercontrol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c774b6ff", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            removeControllerView();
            this.mControllerHolder = aVar;
            this.mIsDefaultController = false;
            init();
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (this.mControllerHolder.c != null) {
            this.mControllerHolder.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (PlayerController2.access$000(PlayerController2.this).l()) {
                        PlayerController2.access$000(PlayerController2.this).i();
                        PlayerController2.access$100(PlayerController2.this).c.setImageResource(PlayerController2.access$100(PlayerController2.this).i);
                        if (PlayerController2.access$200(PlayerController2.this) == null) {
                            return;
                        }
                        PlayerController2.access$200(PlayerController2.this).b();
                    } else {
                        PlayerController2.access$000(PlayerController2.this).g();
                        PlayerController2.access$100(PlayerController2.this).c.setImageResource(PlayerController2.access$100(PlayerController2.this).j);
                        if (PlayerController2.access$200(PlayerController2.this) == null) {
                            return;
                        }
                        PlayerController2.access$200(PlayerController2.this).a();
                    }
                }
            });
            if (this.mVideoView.l()) {
                this.mControllerHolder.c.setImageResource(this.mControllerHolder.j);
            } else {
                this.mControllerHolder.c.setImageResource(this.mControllerHolder.i);
            }
        }
        if (this.mControllerHolder.h != null) {
            this.mControllerHolder.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        r4 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.AnonymousClass2.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L15
                        java.lang.Object[] r1 = new java.lang.Object[r2]
                        r2 = 0
                        r1[r2] = r4
                        r1[r3] = r5
                        java.lang.String r5 = "8dfcefe2"
                        r0.ipc$dispatch(r5, r1)
                        return
                    L15:
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        int r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$300(r5)
                        int r5 = r5 + r3
                        float[] r0 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$400()
                        int r0 = r0.length
                        int r5 = r5 % r0
                        float[] r0 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$400()
                        r0 = r0[r5]
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r1 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.d r1 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$000(r1)
                        if (r1 == 0) goto L85
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r1 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.d r1 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$000(r1)
                        r1.a(r0)
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r0 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$302(r0, r5)
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        int r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$300(r5)
                        if (r5 == 0) goto L61
                        if (r5 == r3) goto L56
                        if (r5 == r2) goto L4b
                        goto L6e
                    L4b:
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.playercontrol.a r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$100(r5)
                        android.widget.TextView r5 = r5.h
                        int r0 = com.taobao.taobao.R.string.taolive_mediaplay_playrate_uphigh
                        goto L6b
                    L56:
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.playercontrol.a r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$100(r5)
                        android.widget.TextView r5 = r5.h
                        int r0 = com.taobao.taobao.R.string.taolive_mediaplay_playrate_high
                        goto L6b
                    L61:
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.playercontrol.a r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$100(r5)
                        android.widget.TextView r5 = r5.h
                        int r0 = com.taobao.taobao.R.string.taolive_mediaplay_playrate_normal
                    L6b:
                        r5.setText(r0)
                    L6e:
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.playercontrol.c r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$500(r5)
                        if (r5 == 0) goto L85
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        com.taobao.taolive.sdk.ui.media.playercontrol.c r5 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$500(r5)
                        com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2 r0 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.this
                        int r0 = com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.access$300(r0)
                        r5.a(r0)
                    L85:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.AnonymousClass2.onClick(android.view.View):void");
                }
            });
        }
        if (this.mControllerHolder.g != null) {
            this.mControllerHolder.g.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        PlayerController2.this.toggleScreen(false);
                    }
                }
            });
        }
        if (this.mControllerHolder.f != null) {
            this.mControllerHolder.f.setOnSeekBarChangeListener(this);
            this.mControllerHolder.f.setMax(1000);
        }
        if (this.mControllerHolder.e != null) {
            this.mControllerHolder.e.setText(this.mContext.getString(R.string.taolive_mediaplayer_defaulttime));
        }
        if (this.mControllerHolder.d != null) {
            this.mControllerHolder.d.setText(this.mContext.getString(R.string.taolive_mediaplayer_defaulttime));
        }
        if (this.mControllerHolder.n != null) {
            this.mControllerHolder.n.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.taobao.taolive.sdk.ui.media.d access$000;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    long m = PlayerController2.access$000(PlayerController2.this).m() + 15000;
                    if (m <= PlayerController2.access$000(PlayerController2.this).n()) {
                        access$000 = PlayerController2.access$000(PlayerController2.this);
                    } else {
                        access$000 = PlayerController2.access$000(PlayerController2.this);
                        m = PlayerController2.access$000(PlayerController2.this).n();
                    }
                    access$000.a(m);
                    if (PlayerController2.access$600(PlayerController2.this) == null) {
                        return;
                    }
                    PlayerController2.access$600(PlayerController2.this).a();
                }
            });
        }
        if (this.mControllerHolder.m != null) {
            this.mControllerHolder.m.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    long m = PlayerController2.access$000(PlayerController2.this).m() - 15000;
                    if (m >= 0) {
                        PlayerController2.access$000(PlayerController2.this).a(m);
                    } else {
                        PlayerController2.access$000(PlayerController2.this).a(0L);
                    }
                    if (PlayerController2.access$600(PlayerController2.this) == null) {
                        return;
                    }
                    PlayerController2.access$600(PlayerController2.this).b();
                }
            });
        }
        watchTimer();
        showController();
    }

    public void setIPlayForwardListener(com.taobao.taolive.sdk.ui.media.playercontrol.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef033aa", new Object[]{this, bVar});
        } else {
            this.mPlayForwardListener = bVar;
        }
    }

    public void setPlayRateListener(com.taobao.taolive.sdk.ui.media.playercontrol.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3393351d", new Object[]{this, cVar});
        } else {
            this.mPlayRateControlListener = cVar;
        }
    }

    public void setToggleScreenListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cebdfd", new Object[]{this, fVar});
        } else {
            this.mToggleScreenListener = fVar;
        }
    }

    public void setSeekStopTrackingListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7befed", new Object[]{this, eVar});
        } else {
            this.mSeekStopTrackingListener = eVar;
        }
    }

    public void setPlayProgressListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a30d9c0", new Object[]{this, bVar});
        } else {
            this.mPlayProgressListener = bVar;
        }
    }

    public void setDefaultControllerHolder(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c31077", new Object[]{this, aVar});
            return;
        }
        this.mFrameContext = aVar;
        setDefaultControllerHolder();
    }

    public void setDefaultControllerHolder() {
        com.taobao.taolive.sdk.ui.media.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da06e70e", new Object[]{this});
            return;
        }
        if (!this.mIsDefaultController) {
            RecyclerView D = this.mFrameContext.z().D();
            if (D != null && (D.getTag(R.id.taolive_player_controller_recycled) instanceof View)) {
                this.mDefaultControllerView = (View) D.getTag(R.id.taolive_player_controller_recycled);
                if (this.mDefaultControllerView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.mDefaultControllerView.getParent()).removeView(this.mDefaultControllerView);
                }
            } else {
                this.mDefaultControllerView = LayoutInflater.from(this.mContext.getApplicationContext()).inflate(R.layout.taolive_video_bottom_controller, (ViewGroup) null, false);
                if (D != null) {
                    D.setTag(R.id.taolive_player_controller_recycled, this.mDefaultControllerView);
                }
            }
            this.mControllerHolder = new com.taobao.taolive.sdk.ui.media.playercontrol.a();
            this.mControllerHolder.f21955a = this.mDefaultControllerView.findViewById(R.id.video_controller_layout);
            this.mControllerHolder.b = this.mDefaultControllerView.findViewById(R.id.video_controller_play_layout);
            this.mControllerHolder.c = (ImageView) this.mDefaultControllerView.findViewById(R.id.video_controller_play_btn);
            this.mControllerHolder.e = (TextView) this.mDefaultControllerView.findViewById(R.id.video_controller_current_time);
            this.mControllerHolder.d = (TextView) this.mDefaultControllerView.findViewById(R.id.video_controller_total_time);
            this.mControllerHolder.f = (SeekBar) this.mDefaultControllerView.findViewById(R.id.video_controller_seekBar);
            this.mControllerHolder.g = (ImageView) this.mDefaultControllerView.findViewById(R.id.video_controller_fullscreen);
            this.mControllerHolder.h = (TextView) this.mDefaultControllerView.findViewById(R.id.video_controller_playrate_icon);
            if (!pmd.a().a("videoRate")) {
                this.mControllerHolder.h.setVisibility(8);
            }
            if (!pmd.a().a("changeLandscapeBtn")) {
                this.mControllerHolder.g.setVisibility(8);
            }
            this.mControllerHolder.j = R.drawable.taolive_video_pause;
            this.mControllerHolder.i = R.drawable.taolive_video_play;
            this.mControllerHolder.k = R.drawable.taolive_video_fullscreen;
            this.mControllerHolder.l = R.drawable.taolive_video_unfullscreen;
            this.mVideoView.G().addView(this.mDefaultControllerView, new FrameLayout.LayoutParams(-1, -1));
            this.mIsDefaultController = true;
            init();
        } else {
            View view = this.mDefaultControllerView;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.mDefaultControllerView);
                }
                this.mVideoView.G().addView(this.mDefaultControllerView, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (!(aVar instanceof com.taobao.taolive.sdk.core.e) || ((com.taobao.taolive.sdk.core.e) aVar).o() == null || ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o().abilityCompontent == null || ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate) || (dVar = this.mVideoView) == null || dVar.G() == null) {
            return;
        }
        this.mVideoView.G().post(new Runnable() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PlayerController2.access$100(PlayerController2.this).g.setVisibility(8);
                }
            }
        });
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        return (aVar == null || aVar.f21955a == null || this.mControllerHolder.f21955a.getVisibility() != 0) ? false : true;
    }

    public void removeControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c96c0c", new Object[]{this});
        } else if (!this.mIsDefaultController || this.mDefaultControllerView == null) {
        } else {
            this.mVideoView.G().removeView(this.mDefaultControllerView);
        }
    }

    public void setPlayRateViewShow(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a777a015", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null || aVar.h == null || !pmd.a().a("videoRate")) {
            return;
        }
        TextView textView = this.mControllerHolder.h;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void addControllerView() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692cfee9", new Object[]{this});
        } else if (!this.mIsDefaultController || (view = this.mDefaultControllerView) == null || view.getParent() != null) {
        } else {
            this.mVideoView.G().addView(this.mDefaultControllerView, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void setFullScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3d7370", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFullScreen = z;
        }
    }

    public void refreshController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59867dde", new Object[]{this});
        } else if (this.mControllerHolder == null) {
        } else {
            if (this.mVideoView.l()) {
                if (this.mControllerHolder.c != null) {
                    this.mControllerHolder.c.setImageResource(this.mControllerHolder.j);
                }
            } else if (this.mControllerHolder.c != null) {
                this.mControllerHolder.c.setImageResource(this.mControllerHolder.i);
            }
            if (this.mIsFullScreen) {
                if (this.mControllerHolder.g == null) {
                    return;
                }
                this.mControllerHolder.g.setImageResource(this.mControllerHolder.l);
            } else if (this.mControllerHolder.g == null) {
            } else {
                this.mControllerHolder.g.setImageResource(this.mControllerHolder.k);
            }
        }
    }

    public void showController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null) {
            return;
        }
        if (aVar.f21955a != null) {
            this.mControllerHolder.f21955a.setVisibility(0);
        }
        if (!y.a() || !y.e(this.mContext) || this.mControllerHolder.g == null) {
            return;
        }
        this.mControllerHolder.g.setVisibility(8);
    }

    public void showController(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2ce083", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null) {
            return;
        }
        if (aVar.f21955a != null) {
            this.mControllerHolder.f21955a.setVisibility(0);
        }
        this.mShowType = i;
        if (i == 1) {
            if (this.mControllerHolder.b != null) {
                this.mControllerHolder.b.setVisibility(0);
            }
            if (this.mControllerHolder.h != null) {
                this.mControllerHolder.h.setVisibility(pmd.a().a("videoRate") ? 0 : 8);
            }
            if (this.mControllerHolder.g != null) {
                ImageView imageView = this.mControllerHolder.g;
                if (!pmd.a().a("changeLandscapeBtn")) {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
            }
            if (this.mIsDefaultController && this.mControllerHolder.f21955a != null) {
                this.mControllerHolder.f21955a.setBackgroundResource(R.drawable.taolive_video_play_bg);
            }
        } else if (i == 2) {
            if (this.mControllerHolder.b != null) {
                this.mControllerHolder.b.setVisibility(0);
            }
            if (this.mControllerHolder.g != null) {
                this.mControllerHolder.g.setVisibility(8);
            }
        } else if (i == 3) {
            if (this.mControllerHolder.b != null) {
                this.mControllerHolder.b.setVisibility(4);
            }
            if (this.mControllerHolder.g != null) {
                this.mControllerHolder.g.setVisibility(pmd.a().a("changeLandscapeBtn") ? 0 : 8);
            }
            if (this.mIsDefaultController && this.mControllerHolder.f21955a != null) {
                this.mControllerHolder.f21955a.setBackgroundResource(0);
            }
            if (this.mIsDefaultController && this.mControllerHolder.f21955a != null) {
                this.mControllerHolder.f21955a.setBackgroundResource(0);
            }
        } else if (i == 4) {
            if (this.mControllerHolder.b != null) {
                this.mControllerHolder.b.setVisibility(4);
            }
            if (this.mControllerHolder.g != null) {
                this.mControllerHolder.g.setVisibility(8);
            }
            if (this.mIsDefaultController && this.mControllerHolder.f21955a != null) {
                this.mControllerHolder.f21955a.setBackgroundResource(0);
            }
            if (this.mControllerHolder.h != null) {
                this.mControllerHolder.h.setVisibility(8);
            }
        }
        if (!y.a() || !y.e(this.mContext) || this.mControllerHolder.g == null) {
            return;
        }
        this.mControllerHolder.g.setVisibility(8);
    }

    public void hideController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null || aVar.f21955a == null) {
            return;
        }
        this.mControllerHolder.f21955a.setVisibility(8);
    }

    private void updateSeekBarProgress() {
        com.taobao.taolive.sdk.ui.media.d dVar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3830bec6", new Object[]{this});
        } else if (this.mControllerHolder == null || (dVar = this.mVideoView) == null || this.mHandler == null) {
        } else {
            long m = dVar.m();
            if (!this.mIsSeekBarOnChange && m != this.newPosition) {
                this.newPosition = m;
                long n = this.mVideoView.n();
                if (n > 0) {
                    i = (int) Math.ceil(((((float) m) * 1.0f) / ((float) n)) * 1000.0f);
                }
                if (this.mControllerHolder.d != null) {
                    this.mControllerHolder.d.setText(stringForTime(n));
                }
                if (this.mControllerHolder.e != null) {
                    this.mControllerHolder.e.setText(stringForTime(m));
                }
                if (this.mControllerHolder.f != null) {
                    this.mControllerHolder.f.setProgress(i);
                }
                b bVar = this.mPlayProgressListener;
                if (bVar != null) {
                    bVar.onPlayProgress(m);
                }
            }
            try {
                this.mHandler.sendEmptyMessageDelayed(1, 500L);
            } catch (Exception unused) {
            }
        }
    }

    public void toggleScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691bb24d", new Object[]{this, new Boolean(z)});
        } else {
            toggleScreen(z, !this.mIsFullScreen);
        }
    }

    public void toggleScreen(boolean z, boolean z2) {
        f fVar;
        f fVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5b4a27", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.mControllerHolder == null) {
        } else {
            if (z2) {
                if (!z && (fVar2 = this.mToggleScreenListener) != null) {
                    fVar2.a();
                }
            } else if (!z && (fVar = this.mToggleScreenListener) != null) {
                fVar.b();
            }
            this.mIsFullScreen = z2;
            if (this.mIsFullScreen) {
                if (this.mControllerHolder.g == null) {
                    return;
                }
                this.mControllerHolder.g.setImageResource(this.mControllerHolder.l);
            } else if (this.mControllerHolder.g == null) {
            } else {
                this.mControllerHolder.g.setImageResource(this.mControllerHolder.k);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
        } else if (!z) {
        } else {
            this.mIsSeekBarOnChange = true;
            this.newPosition = (int) (((float) this.mVideoView.n()) * (i / 1000.0f));
            if (this.mControllerHolder.e == null) {
                return;
            }
            this.mControllerHolder.e.setText(stringForTime(this.newPosition));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        long n = this.mVideoView.n();
        if (n <= 0 || this.newPosition <= n) {
            this.mVideoView.a(this.newPosition);
        }
        e eVar = this.mSeekStopTrackingListener;
        if (eVar != null) {
            eVar.onStopTrackingTouch(this.mIsSeekBarOnChange);
            this.mSeekStopTrackingListener.onStopTrackingTouch(this.mIsSeekBarOnChange, this.newPosition);
        }
        this.mIsSeekBarOnChange = false;
    }

    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1bdc3a", new Object[]{this, iMediaPlayer, new Integer(i)});
            return;
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null || this.mVideoView == null || this.mHandler == null || this.mIsDestroyed || aVar.f == null) {
            return;
        }
        this.mControllerHolder.f.setSecondaryProgress(i * 10);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
        } else {
            resetViewState();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.f
    public void onHighLightLoopCompletion(IMediaPlayer iMediaPlayer) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79317ef2", new Object[]{this, iMediaPlayer});
        } else if (this.mControllerHolder == null || this.mIsDestroyed || (cVar = this.mPlayStartOrCompletionListener) == null) {
        } else {
            cVar.b();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        resetViewState();
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
        } else if (this.mControllerHolder == null || this.mIsDestroyed) {
        } else {
            resetViewState();
            long n = this.mVideoView.n();
            if (n < 0 || this.mControllerHolder.d == null) {
                return;
            }
            this.mControllerHolder.d.setText(stringForTime(n));
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
            return;
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null || this.mIsDestroyed) {
            return;
        }
        if (aVar.c != null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            PlayerController2.access$100(PlayerController2.this).c.setImageResource(PlayerController2.access$100(PlayerController2.this).j);
                        }
                    }
                });
                c cVar = this.mPlayStartOrCompletionListener;
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
        watchTimer();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
    public void onPause(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
            return;
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null || this.mIsDestroyed) {
            return;
        }
        if (aVar.c != null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            PlayerController2.access$100(PlayerController2.this).c.setImageResource(PlayerController2.access$100(PlayerController2.this).i);
                        }
                    }
                });
            }
        }
        stopTimer();
    }

    public void resetViewState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1264", new Object[]{this});
        } else if (this.mControllerHolder == null || this.mIsDestroyed) {
        } else {
            stopTimer();
            this.newPosition = 0L;
            if (this.mControllerHolder.c != null) {
                this.mControllerHolder.c.setImageResource(this.mControllerHolder.i);
            }
            if (this.mControllerHolder.e != null) {
                this.mControllerHolder.e.setText(stringForTime(0L));
            }
            if (this.mControllerHolder.f == null) {
                return;
            }
            this.mControllerHolder.f.setProgress(0);
            this.mControllerHolder.f.setSecondaryProgress(0);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1) {
            updateSeekBarProgress();
        }
        return false;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestroyed = true;
        stopTimer();
        if (this.mControllerHolder == null) {
            return;
        }
        if (this.mIsDefaultController && this.mDefaultControllerView != null) {
            this.mVideoView.G().removeView(this.mDefaultControllerView);
        } else {
            hideController();
        }
    }

    public void setPlayerStatusListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33806b8c", new Object[]{this, dVar});
        } else {
            this.playerStatusListener = dVar;
        }
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.mHandler = null;
    }

    private void watchTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2710b53d", new Object[]{this});
        } else if (this.mHandler != null) {
        } else {
            this.mHandler = new Handler(this);
            this.mHandler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    private String stringForTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a47bf48", new Object[]{this, new Long(j)});
        }
        long j2 = j / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        if (j5 <= 0 && !pmd.a().a("showHour")) {
            return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j4), Long.valueOf(j3));
        }
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3));
    }

    public void setPlayRateDefalut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32fe400", new Object[]{this});
            return;
        }
        this.mPlayRateIndex = 0;
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null || aVar.h == null) {
            return;
        }
        this.mControllerHolder.h.setText(TextUtils.isEmpty(this.defaultPlayRateViewText) ? "倍速" : this.defaultPlayRateViewText);
    }
}

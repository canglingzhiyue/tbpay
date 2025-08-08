package com.taobao.android.miniLive.ui;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.services.e;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.core.f;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.htx;
import tb.huf;
import tb.kge;
import tb.pmd;
import tb.ppr;
import tb.sii;

/* loaded from: classes6.dex */
public class TBLiveVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout favorLayout;
    private int index;
    private boolean isArtp;
    private boolean isMute;
    private boolean isTbTv;
    private TUrlImageView mCoverImageView;
    private TUrlImageView mFavorAnimView;
    private String mPlayUrl;
    private String mSource;
    private VideoInfo mVideoInfo;
    private htx mVideoView;
    private ImageView muteBtn;
    private ImageView playBtnView;
    private ppr statusListener;
    private b tbLiveConfig;
    public boolean useH264;

    static {
        kge.a(-173317660);
    }

    public static /* synthetic */ Object ipc$super(TBLiveVideoView tBLiveVideoView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        }
    }

    public static /* synthetic */ htx access$000(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htx) ipChange.ipc$dispatch("b652a318", new Object[]{tBLiveVideoView}) : tBLiveVideoView.mVideoView;
    }

    public static /* synthetic */ boolean access$100(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33447307", new Object[]{tBLiveVideoView})).booleanValue() : tBLiveVideoView.isMute;
    }

    public static /* synthetic */ int access$1000(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8da50e4", new Object[]{tBLiveVideoView})).intValue() : tBLiveVideoView.index;
    }

    public static /* synthetic */ boolean access$102(TBLiveVideoView tBLiveVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69819d73", new Object[]{tBLiveVideoView, new Boolean(z)})).booleanValue();
        }
        tBLiveVideoView.isMute = z;
        return z;
    }

    public static /* synthetic */ TUrlImageView access$1100(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("191a848a", new Object[]{tBLiveVideoView}) : tBLiveVideoView.mCoverImageView;
    }

    public static /* synthetic */ ImageView access$200(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("e3bccbcc", new Object[]{tBLiveVideoView}) : tBLiveVideoView.muteBtn;
    }

    public static /* synthetic */ void access$300(TBLiveVideoView tBLiveVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e09d00f", new Object[]{tBLiveVideoView, str});
        } else {
            tBLiveVideoView.trackClick(str);
        }
    }

    public static /* synthetic */ VideoInfo access$400(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("94c7dfc3", new Object[]{tBLiveVideoView}) : tBLiveVideoView.mVideoInfo;
    }

    public static /* synthetic */ String access$500(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65ea5b79", new Object[]{tBLiveVideoView}) : tBLiveVideoView.mSource;
    }

    public static /* synthetic */ ImageView access$600(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("5b8a6348", new Object[]{tBLiveVideoView}) : tBLiveVideoView.playBtnView;
    }

    public static /* synthetic */ String access$700(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7fc537", new Object[]{tBLiveVideoView}) : tBLiveVideoView.mPlayUrl;
    }

    public static /* synthetic */ boolean access$800(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5492c7ce", new Object[]{tBLiveVideoView})).booleanValue() : tBLiveVideoView.isArtp;
    }

    public static /* synthetic */ boolean access$900(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7de71d0f", new Object[]{tBLiveVideoView})).booleanValue() : tBLiveVideoView.isTbTv;
    }

    public TBLiveVideoView(Context context) {
        super(context);
        this.index = -1;
        this.isMute = true;
        this.statusListener = new ppr() { // from class: com.taobao.android.miniLive.ui.TBLiveVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ppr
            public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
                }
                return true;
            }

            @Override // tb.ppr
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // tb.ppr
            public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (i < 0 && i >= -132) {
                    if (com.taobao.taolive.sdk.utils.b.e(TBLiveVideoView.this.getContext())) {
                        TBLiveVideoView.this.start();
                    } else {
                        if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                            TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                        }
                        if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                            TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                        }
                    }
                } else {
                    if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                        TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                    }
                    if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                        TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                    }
                }
                return false;
            }

            @Override // tb.ppr
            public void a(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(8);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_pause);
            }

            @Override // tb.ppr
            public void b(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53e8cb9f", new Object[]{this, iMediaPlayer});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }

            @Override // tb.ppr
            public void c(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
                } else if (TBLiveVideoView.access$1100(TBLiveVideoView.this) == null) {
                } else {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
            }

            @Override // tb.ppr
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (TBLiveVideoView.access$1100(TBLiveVideoView.this) == null) {
                } else {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
            }

            @Override // tb.ppr
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }

            @Override // tb.ppr
            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }
        };
    }

    public TBLiveVideoView(Context context, htx htxVar) {
        super(context);
        this.index = -1;
        this.isMute = true;
        this.statusListener = new ppr() { // from class: com.taobao.android.miniLive.ui.TBLiveVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ppr
            public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
                }
                return true;
            }

            @Override // tb.ppr
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // tb.ppr
            public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (i < 0 && i >= -132) {
                    if (com.taobao.taolive.sdk.utils.b.e(TBLiveVideoView.this.getContext())) {
                        TBLiveVideoView.this.start();
                    } else {
                        if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                            TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                        }
                        if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                            TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                        }
                    }
                } else {
                    if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                        TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                    }
                    if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                        TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                    }
                }
                return false;
            }

            @Override // tb.ppr
            public void a(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(8);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_pause);
            }

            @Override // tb.ppr
            public void b(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53e8cb9f", new Object[]{this, iMediaPlayer});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }

            @Override // tb.ppr
            public void c(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
                } else if (TBLiveVideoView.access$1100(TBLiveVideoView.this) == null) {
                } else {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
            }

            @Override // tb.ppr
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (TBLiveVideoView.access$1100(TBLiveVideoView.this) == null) {
                } else {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
            }

            @Override // tb.ppr
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }

            @Override // tb.ppr
            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) == null) {
                    return;
                }
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }
        };
        this.mVideoView = htxVar;
        init(context);
    }

    public void setViewConfig(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aecdf", new Object[]{this, bVar});
            return;
        }
        this.tbLiveConfig = bVar;
        this.mSource = bVar.g;
    }

    public void setVideoView(htx htxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3cd9e09", new Object[]{this, htxVar});
        } else {
            this.mVideoView = htxVar;
        }
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        htx htxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2da7f", new Object[]{this, videoInfo});
            return;
        }
        this.mVideoInfo = videoInfo;
        if (videoInfo == null || (htxVar = this.mVideoView) == null) {
            return;
        }
        htxVar.b(videoInfo.pushFeature);
        if (this.playBtnView == null || this.mVideoInfo.status == 0) {
            return;
        }
        this.playBtnView.setImageResource(R.drawable.taolive_mini_live_play);
    }

    public void setVideoCover(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae36720f", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.mCoverImageView;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(str);
    }

    public void playStreamUrl(String str, boolean z, boolean z2, int i, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf0dfd", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Integer(i), new Boolean(z3)});
        } else if (this.mVideoView == null || StringUtils.isEmpty(str)) {
        } else {
            this.mPlayUrl = str;
            this.isArtp = z;
            this.isTbTv = z2;
            this.index = i;
            this.useH264 = z3;
            this.mVideoView.q();
            this.mVideoView.o();
            this.mVideoView.d(z);
            this.mVideoView.g(z3);
            VideoInfo videoInfo = com.taobao.android.miniLive.services.c.a().d() != null ? com.taobao.android.miniLive.services.c.a().d().mVideoInfo : null;
            if (z2) {
                this.mVideoView.a((MediaData) null, str);
            } else if (i >= 0) {
                this.mVideoView.a(i);
            } else {
                MediaData a2 = com.taobao.taolive.sdk.model.common.a.a(videoInfo);
                if (a2 != null && !z3) {
                    a2.h265 = false;
                }
                this.mVideoView.a(a2, (String) null);
            }
            if (videoInfo != null) {
                this.mVideoView.b(videoInfo.pushFeature);
            }
            this.mVideoView.b(false);
            this.mVideoView.g();
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        htx htxVar = this.mVideoView;
        if (htxVar == null) {
            return;
        }
        htxVar.b(false);
        this.mVideoView.g();
        this.mVideoView.a(this.isMute);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        htx htxVar = this.mVideoView;
        if (htxVar == null) {
            return;
        }
        htxVar.o();
    }

    public void setCoverImageVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e233", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.mCoverImageView;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(0);
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        htx htxVar = this.mVideoView;
        if (htxVar == null) {
            return false;
        }
        return htxVar.l();
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        htx htxVar = this.mVideoView;
        if (htxVar == null) {
            return;
        }
        htxVar.a(z);
        this.isMute = z;
        this.muteBtn.setImageResource(this.isMute ? R.drawable.taolive_mini_live_mute : R.drawable.taolive_mini_live_voice);
    }

    public void init(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        htx htxVar = this.mVideoView;
        if (htxVar == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) htxVar.a().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.mVideoView.a());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_mini_video_layout, (ViewGroup) this, false);
        addView(inflate, layoutParams);
        ((FrameLayout) findViewById(R.id.taolive_weex_video_layout)).addView(this.mVideoView.a(), 0, layoutParams);
        this.muteBtn = (ImageView) findViewById(R.id.taolive_weex_video_mute);
        this.muteBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.ui.TBLiveVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TBLiveVideoView.access$000(TBLiveVideoView.this) == null) {
                } else {
                    TBLiveVideoView tBLiveVideoView = TBLiveVideoView.this;
                    TBLiveVideoView.access$102(tBLiveVideoView, !TBLiveVideoView.access$100(tBLiveVideoView));
                    TBLiveVideoView.access$000(TBLiveVideoView.this).a(TBLiveVideoView.access$100(TBLiveVideoView.this));
                    TBLiveVideoView.access$200(TBLiveVideoView.this).setImageResource(TBLiveVideoView.access$100(TBLiveVideoView.this) ? R.drawable.taolive_mini_live_mute : R.drawable.taolive_mini_live_voice);
                    TBLiveVideoView.access$300(TBLiveVideoView.this, "mute");
                }
            }
        });
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.ui.TBLiveVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TBLiveVideoView.access$400(TBLiveVideoView.this) == null) {
                } else {
                    String str = "http://h5.m.taobao.com/taolive/video.html?liveSource=miniLive&id=" + TBLiveVideoView.access$400(TBLiveVideoView.this).liveId + "&entrySource=" + TBLiveVideoView.access$500(TBLiveVideoView.this);
                    if (pmd.a().r() != null) {
                        Nav.from(context).withFlags(67108864).toUri(str);
                    }
                    TBLiveVideoView.access$300(TBLiveVideoView.this, "Card");
                }
            }
        });
        trackShow("Show-Card");
        this.favorLayout = (RelativeLayout) findViewById(R.id.taolive_weex_favor_layout);
        this.mCoverImageView = (TUrlImageView) findViewById(R.id.taolive_mini_video_cover);
        this.playBtnView = (ImageView) findViewById(R.id.taolive_weex_video_pause);
        this.playBtnView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.ui.TBLiveVideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ImageView access$600;
                int i;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TBLiveVideoView.access$000(TBLiveVideoView.this) == null) {
                } else {
                    if (TBLiveVideoView.access$000(TBLiveVideoView.this).l()) {
                        TBLiveVideoView.access$300(TBLiveVideoView.this, sii.CARD_MISS_VIDEO_STATUS_PAUSE);
                        TBLiveVideoView.access$000(TBLiveVideoView.this).o();
                        TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                        return;
                    }
                    if (StringUtils.isEmpty(TBLiveVideoView.access$000(TBLiveVideoView.this).e()) && !StringUtils.isEmpty(TBLiveVideoView.access$700(TBLiveVideoView.this))) {
                        TBLiveVideoView tBLiveVideoView = TBLiveVideoView.this;
                        tBLiveVideoView.playStreamUrl(TBLiveVideoView.access$700(tBLiveVideoView), TBLiveVideoView.access$800(TBLiveVideoView.this), TBLiveVideoView.access$900(TBLiveVideoView.this), TBLiveVideoView.access$1000(TBLiveVideoView.this), TBLiveVideoView.this.useH264);
                    } else if (StringUtils.isEmpty(TBLiveVideoView.access$000(TBLiveVideoView.this).e())) {
                        if (TBLiveVideoView.access$400(TBLiveVideoView.this) != null) {
                            if (TBLiveVideoView.access$400(TBLiveVideoView.this).status != 0) {
                                Toast.makeText(f.a().b(), "主播暂时离开一会哦", 1).show();
                            }
                            access$600 = TBLiveVideoView.access$600(TBLiveVideoView.this);
                            i = R.drawable.taolive_mini_live_play;
                            access$600.setImageResource(i);
                        }
                        TBLiveVideoView.access$300(TBLiveVideoView.this, "Play");
                    } else {
                        TBLiveVideoView.this.start();
                    }
                    access$600 = TBLiveVideoView.access$600(TBLiveVideoView.this);
                    i = R.drawable.taolive_mini_live_pause;
                    access$600.setImageResource(i);
                    TBLiveVideoView.access$300(TBLiveVideoView.this, "Play");
                }
            }
        });
        b bVar = this.tbLiveConfig;
        if (bVar != null) {
            if (bVar.c) {
                this.playBtnView.setVisibility(0);
                trackShow("Show-Pause");
            } else {
                this.playBtnView.setVisibility(8);
            }
            if (this.tbLiveConfig.f14390a) {
                this.muteBtn.setVisibility(0);
                trackShow("Show-mute");
            } else {
                this.muteBtn.setVisibility(8);
            }
            if (this.tbLiveConfig.b) {
                this.favorLayout.setVisibility(0);
                this.mFavorAnimView = (TUrlImageView) findViewById(R.id.taolive_weex_video_favor_anim);
                this.mFavorAnimView.setSkipAutoSize(true);
                this.mFavorAnimView.setImageUrl("https://gw.alicdn.com/tfs/TB1ace.u1bviK0jSZFNXXaApXXa-164-380.png");
                trackShow("Show-Favor");
            } else {
                this.favorLayout.setVisibility(8);
            }
        }
        this.mVideoView.h(true);
        e.a().a(this.statusListener);
    }

    public void setVideoDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc14fd", new Object[]{this, str});
            return;
        }
        htx htxVar = this.mVideoView;
        if (htxVar == null) {
            return;
        }
        htxVar.a(str);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        htx htxVar = this.mVideoView;
        if (htxVar != null) {
            htxVar.o();
            this.mVideoView.c();
        }
        e.a().b(this.statusListener);
        e.a().g();
    }

    private void trackShow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69083f79", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        VideoInfo videoInfo = this.mVideoInfo;
        if (videoInfo != null) {
            hashMap.put("feedId", videoInfo.liveId);
            if (this.mVideoInfo.broadCaster != null) {
                hashMap.put("accountId", this.mVideoInfo.broadCaster.accountId);
            }
        }
        hashMap.put("mute", this.isMute ? "true" : "false");
        hashMap.put("source", this.mSource);
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        huf.b(null, str, hashMap);
    }

    private void trackClick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361d29ce", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        VideoInfo videoInfo = this.mVideoInfo;
        if (videoInfo != null) {
            hashMap.put("feedId", videoInfo.liveId);
            if (this.mVideoInfo.broadCaster != null) {
                hashMap.put("accountId", this.mVideoInfo.broadCaster.accountId);
            }
        } else if (!StringUtils.isEmpty(com.taobao.android.miniLive.services.c.a().c())) {
            hashMap.put("feedId", com.taobao.android.miniLive.services.c.a().c());
        }
        hashMap.put("mute", this.isMute ? "true" : "false");
        hashMap.put("source", this.mSource);
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        huf.a(null, str, hashMap);
    }
}

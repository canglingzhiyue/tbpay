package com.taobao.android.detail.core.detail.ext.view.widget.main;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.view.TBCircularProgress;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class TaoVideoView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CANCEL = 1002;
    public static final int ERROR_CANTPLAY = 1001;
    public static final int ERROR_NET = 1000;
    private Context context;
    private RelativeLayout imgPause;
    private DetailImageView imgPlay;
    private TBCircularProgress imgWatting;
    private a listener;
    private VideoView video;

    /* loaded from: classes4.dex */
    public interface a {
    }

    static {
        kge.a(-1342863636);
    }

    public static /* synthetic */ Object ipc$super(TaoVideoView taoVideoView, String str, Object... objArr) {
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

    public static /* synthetic */ a access$000(TaoVideoView taoVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e64ad666", new Object[]{taoVideoView}) : taoVideoView.listener;
    }

    public static /* synthetic */ VideoView access$100(TaoVideoView taoVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoView) ipChange.ipc$dispatch("cabfea73", new Object[]{taoVideoView}) : taoVideoView.video;
    }

    public static /* synthetic */ void access$200(TaoVideoView taoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd417e7c", new Object[]{taoVideoView});
        } else {
            taoVideoView.pause();
        }
    }

    public static /* synthetic */ DetailImageView access$300(TaoVideoView taoVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("8c46825c", new Object[]{taoVideoView}) : taoVideoView.imgPlay;
    }

    public static /* synthetic */ Context access$400(TaoVideoView taoVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6a681b32", new Object[]{taoVideoView}) : taoVideoView.context;
    }

    public static /* synthetic */ RelativeLayout access$500(TaoVideoView taoVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("85a6db69", new Object[]{taoVideoView}) : taoVideoView.imgPause;
    }

    public static /* synthetic */ TBCircularProgress access$600(TaoVideoView taoVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgress) ipChange.ipc$dispatch("d53815c1", new Object[]{taoVideoView}) : taoVideoView.imgWatting;
    }

    public TaoVideoView(Context context) {
        super(context);
        this.listener = null;
        this.context = context;
        init();
    }

    public TaoVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.listener = null;
        this.context = context;
        init();
    }

    public TaoVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.listener = null;
        this.context = context;
        init();
    }

    public void setOnVideoStateListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf57d86", new Object[]{this, aVar});
        } else {
            this.listener = aVar;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        emu.a("com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView");
        LayoutInflater.from(this.context).inflate(R.layout.x_detail_widge_videoview, (ViewGroup) this, true);
        this.video = (VideoView) findViewById(R.id.videoTao);
        this.video.setKeepScreenOn(true);
        this.video.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (i != -110) {
                    new Handler().postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (TaoVideoView.access$000(TaoVideoView.this) == null) {
                            } else {
                                TaoVideoView.access$000(TaoVideoView.this);
                            }
                        }
                    }, 2000L);
                } else if (TaoVideoView.access$000(TaoVideoView.this) != null) {
                    TaoVideoView.access$000(TaoVideoView.this);
                }
                return true;
            }
        });
        this.video.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f14887b7", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (i != 1 && i != 700 && i != 800) {
                    return false;
                }
                if (TaoVideoView.access$000(TaoVideoView.this) != null) {
                    TaoVideoView.access$000(TaoVideoView.this);
                }
                return true;
            }
        });
        this.imgPlay = (DetailImageView) findViewById(R.id.img_play);
        this.imgPlay.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TaoVideoView.access$100(TaoVideoView.this) == null || TaoVideoView.access$100(TaoVideoView.this).isPlaying()) {
                } else {
                    TaoVideoView.this.play();
                }
            }
        });
        this.imgPlay.setVisibility(8);
        this.imgPause = (RelativeLayout) findViewById(R.id.img_pause);
        this.imgPause.setBackgroundColor(this.context.getResources().getColor(R.color.detail_black));
        this.imgPause.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TaoVideoView.access$100(TaoVideoView.this) != null && TaoVideoView.access$100(TaoVideoView.this).isPlaying()) {
                    TaoVideoView.access$200(TaoVideoView.this);
                } else if (TaoVideoView.access$000(TaoVideoView.this) == null) {
                } else {
                    TaoVideoView.access$000(TaoVideoView.this);
                }
            }
        });
        this.video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
                    return;
                }
                TaoVideoView.access$300(TaoVideoView.this).setVisibility(0);
                TaoVideoView.access$300(TaoVideoView.this).bringToFront();
                if (TaoVideoView.access$000(TaoVideoView.this) == null) {
                    return;
                }
                TaoVideoView.access$000(TaoVideoView.this);
            }
        });
        this.video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aa6fc624", new Object[]{this, mediaPlayer});
                    return;
                }
                new Handler().postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.6.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TaoVideoView.access$500(TaoVideoView.this).setBackgroundColor(TaoVideoView.access$400(TaoVideoView.this).getResources().getColor(R.color.detail_transparent));
                        TaoVideoView.access$600(TaoVideoView.this).setVisibility(8);
                    }
                }, 250L);
                if (TaoVideoView.access$000(TaoVideoView.this) == null) {
                    return;
                }
                TaoVideoView.access$000(TaoVideoView.this);
            }
        });
        this.imgWatting = (TBCircularProgress) findViewById(R.id.img_watting);
        this.imgWatting.setProgressText("视频加载中");
        this.imgWatting.setVisibility(0);
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

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        this.imgPlay.setVisibility(8);
        this.video.requestFocus();
        this.video.start();
    }

    public void setVideoUri(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e19040d", new Object[]{this, uri});
        } else if (NetworkUtils.a(this.context)) {
            this.video.setVideoURI(uri);
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.main.TaoVideoView.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TaoVideoView.access$000(TaoVideoView.this) == null) {
                    } else {
                        TaoVideoView.access$000(TaoVideoView.this);
                    }
                }
            }, 2000L);
        }
    }

    public void videoPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443fa542", new Object[]{this});
        } else {
            this.video.pause();
        }
    }

    private void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.video.pause();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        this.imgPlay.setVisibility(8);
        this.video.requestFocus();
        this.video.resume();
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.video.stopPlayback();
        this.imgPause.setBackgroundColor(this.context.getResources().getColor(R.color.detail_black));
        this.imgWatting.setVisibility(0);
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.video.stopPlayback();
        this.video.setMediaController(null);
        this.video = null;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue() : this.video.isPlaying();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }
}

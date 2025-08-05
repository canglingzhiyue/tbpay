package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.ut.device.UTDevice;
import java.util.HashMap;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.ldk;
import tb.lja;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class PlayControlVideoView extends FrameLayout implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NON_AUTOMATIC_PLAY_AFTER_DISCONNECT_ENABLE = "nonAutomaticPlayAfterDisconnectEnable";
    private static final String OPEN_PRE_DOWNLOAD_VIDEO = "openPreDownloadVideo";
    public static final String S_BIZ_CODE = "sectionBizCode";
    private static final String TAG = "PlayControlVideoView";
    public static final String VIDEO_COUNT_MAIN_BIZ = "Page_Home_VideoPlayer_Count";
    public static final String VIDEO_FEATURE_TYPE = "video";
    public static final String VIDEO_MAIN_BIZ = "Page_Home_VideoPlayer";
    private static final String VIDEO_SUFFIX = ".mp4";
    private boolean isPlayButPreDownload;
    private boolean isUsePreDownloadVideo;
    private boolean mCanPlay;
    private JSONObject mCurrentData;
    private final IMediaPlayer.OnErrorListener mErrorListener;
    private boolean mIsAttachedToWindow;
    private boolean mIsNeedWaitSeekComplete;
    private boolean mIsPlayerInError;
    private String mItemId;
    private long mMediaStartTime;
    private final IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private boolean mOnFirstFrame;
    private final IMediaPlayer.OnInfoListener mOnInfoListener;
    private final TaoLiveVideoView.a mOnPauseListener;
    private final IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private final TaoLiveVideoView.b mOnStartListener;
    private long mPlayControlStartTime;
    private String mPlayId;
    private long mPlayStartTime;
    private long mPlayerCreateTime;
    private e mPreVideoDownLoadListener;
    private String mScm;
    private String mSectionBizCode;
    private int mSeekTime;
    private g mStatusListener;
    private final String mUserId;
    private final String mUttId;
    private e mVideoDownLoadListener;
    private String mVideoId;
    private h mVideoUIController;
    private String mVideoUrl;
    private TaoLiveVideoView mVideoView;
    private final IMediaPlayer.OnSeekCompletionListener seekCompletionListener;

    static {
        kge.a(-1110298101);
        kge.a(-322278169);
    }

    public static /* synthetic */ Object ipc$super(PlayControlVideoView playControlVideoView, String str, Object... objArr) {
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

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void setVideoPlayInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f1ceac", new Object[]{this, str});
        }
    }

    public static /* synthetic */ boolean access$000(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5482f2bf", new Object[]{playControlVideoView})).booleanValue() : playControlVideoView.mIsPlayerInError;
    }

    public static /* synthetic */ boolean access$002(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcdfa73b", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.mIsPlayerInError = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("843a26c0", new Object[]{playControlVideoView})).booleanValue() : playControlVideoView.mIsNeedWaitSeekComplete;
    }

    public static /* synthetic */ String access$1000(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea55b2b6", new Object[]{playControlVideoView}) : playControlVideoView.getItemID();
    }

    public static /* synthetic */ boolean access$102(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40ef35a", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.mIsNeedWaitSeekComplete = z;
        return z;
    }

    public static /* synthetic */ String access$1100(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5fee0d5", new Object[]{playControlVideoView}) : playControlVideoView.mVideoUrl;
    }

    public static /* synthetic */ void access$1200(PlayControlVideoView playControlVideoView, int i, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7ec549", new Object[]{playControlVideoView, new Integer(i), str, str2, new Boolean(z)});
        } else {
            playControlVideoView.callbackStatus(i, str, str2, z);
        }
    }

    public static /* synthetic */ boolean access$1302(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7a8d109", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.mOnFirstFrame = z;
        return z;
    }

    public static /* synthetic */ long access$1400(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cddd8b22", new Object[]{playControlVideoView})).longValue() : playControlVideoView.mPlayStartTime;
    }

    public static /* synthetic */ long access$1500(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd94bf23", new Object[]{playControlVideoView})).longValue() : playControlVideoView.mPlayControlStartTime;
    }

    public static /* synthetic */ String access$1600(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("504cc770", new Object[]{playControlVideoView}) : playControlVideoView.getEndUtArgs();
    }

    public static /* synthetic */ JSONObject access$1700(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7d30ce51", new Object[]{playControlVideoView}) : playControlVideoView.mCurrentData;
    }

    public static /* synthetic */ boolean access$1802(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb954da4", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.isUsePreDownloadVideo = z;
        return z;
    }

    public static /* synthetic */ boolean access$1900(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc718f37", new Object[]{playControlVideoView})).booleanValue() : playControlVideoView.isPlayButPreDownload;
    }

    public static /* synthetic */ int access$200(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3f15ab0", new Object[]{playControlVideoView})).intValue() : playControlVideoView.mSeekTime;
    }

    public static /* synthetic */ e access$2000(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("73584b29", new Object[]{playControlVideoView}) : playControlVideoView.mVideoDownLoadListener;
    }

    public static /* synthetic */ int access$202(PlayControlVideoView playControlVideoView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b3dff97", new Object[]{playControlVideoView, new Integer(i)})).intValue();
        }
        playControlVideoView.mSeekTime = i;
        return i;
    }

    public static /* synthetic */ TaoLiveVideoView access$300(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveVideoView) ipChange.ipc$dispatch("c2c0f24a", new Object[]{playControlVideoView}) : playControlVideoView.mVideoView;
    }

    public static /* synthetic */ long access$400(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("135fc2b3", new Object[]{playControlVideoView})).longValue() : playControlVideoView.mPlayerCreateTime;
    }

    public static /* synthetic */ long access$500(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4316f6b4", new Object[]{playControlVideoView})).longValue() : playControlVideoView.mMediaStartTime;
    }

    public static /* synthetic */ long access$502(PlayControlVideoView playControlVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0cbe7b6", new Object[]{playControlVideoView, new Long(j)})).longValue();
        }
        playControlVideoView.mMediaStartTime = j;
        return j;
    }

    public static /* synthetic */ String access$602(PlayControlVideoView playControlVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57018df3", new Object[]{playControlVideoView, str});
        }
        playControlVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$700(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8e9b21e", new Object[]{playControlVideoView}) : playControlVideoView.mUttId;
    }

    public static /* synthetic */ String access$800(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a492e03d", new Object[]{playControlVideoView}) : playControlVideoView.mVideoId;
    }

    public static /* synthetic */ String access$900(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("603c0e5c", new Object[]{playControlVideoView}) : playControlVideoView.getStartUtArgs();
    }

    public PlayControlVideoView(Context context, boolean z) {
        super(context);
        this.mOnFirstFrame = false;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mMediaStartTime = 0L;
        this.mPlayStartTime = 0L;
        this.mPlayerCreateTime = 0L;
        this.mPlayControlStartTime = 0L;
        this.mScm = "";
        this.mItemId = "";
        this.mSeekTime = 0;
        this.mOnPreparedListener = new IMediaPlayer.OnPreparedListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
                    return;
                }
                ldf.d(PlayControlVideoView.TAG, "mOnPreparedListener");
                if (PlayControlVideoView.access$000(PlayControlVideoView.this)) {
                    PlayControlVideoView.access$002(PlayControlVideoView.this, false);
                    ldf.d(PlayControlVideoView.TAG, "mOnPreparedListener seekToPause");
                    PlayControlVideoView.access$102(PlayControlVideoView.this, false);
                    PlayControlVideoView.access$300(PlayControlVideoView.this).seekToPause(PlayControlVideoView.access$200(PlayControlVideoView.this), false, true);
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$400(PlayControlVideoView.this)));
                ldk.a("video", "video_playerPreparedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
            }
        };
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                    return;
                }
                PlayControlVideoView.access$502(PlayControlVideoView.this, System.currentTimeMillis());
                PlayControlVideoView playControlVideoView = PlayControlVideoView.this;
                PlayControlVideoView.access$602(playControlVideoView, PlayControlVideoView.access$700(PlayControlVideoView.this) + PlayControlVideoView.access$500(PlayControlVideoView.this));
                TBS.Ext.commitEvent("cnxh_special", 12002, PlayControlVideoView.access$800(PlayControlVideoView.this), null, null, PlayControlVideoView.access$900(PlayControlVideoView.this));
                ldk.a("video", "video_mediaStartPlay", "", "Page_Home_VideoPlayer_Count", "", null);
            }
        };
        this.mErrorListener = new IMediaPlayer.OnErrorListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                PlayControlVideoView.this.showCoverImageView();
                PlayControlVideoView.this.pauseVideo();
                PlayControlVideoView.access$1200(PlayControlVideoView.this, 2, "player_play_error", "播放错误：, itemID:" + PlayControlVideoView.access$1000(PlayControlVideoView.this) + ", what:" + i + ", extra:" + i2 + ", videoUrl:" + PlayControlVideoView.access$1100(PlayControlVideoView.this), true);
                return false;
            }
        };
        this.mOnInfoListener = new IMediaPlayer.OnInfoListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3) {
                    PlayControlVideoView.access$1302(PlayControlVideoView.this, true);
                    if (!PlayControlVideoView.access$100(PlayControlVideoView.this)) {
                        ldf.d(PlayControlVideoView.TAG, "mOnInfoListener 不用等待seek 隐藏cover");
                        PlayControlVideoView.this.hideCoverImageView();
                    }
                    ldk.a("video", "video_firstFrameRendered", "", "Page_Home_VideoPlayer_Count", "", null);
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$1400(PlayControlVideoView.this)));
                    ldk.a("video", "video_startPlayCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                    ldk.a("video", "video_playerFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$1500(PlayControlVideoView.this)));
                    ldk.a("video", "video_playControlFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap2);
                    HashMap hashMap3 = new HashMap(2);
                    hashMap3.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$500(PlayControlVideoView.this)));
                    ldk.a("video", "video_startMediaPlayCost", "", "Page_Home_VideoPlayer_Count", "", hashMap3);
                }
                return true;
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (TextUtils.isEmpty(PlayControlVideoView.access$800(PlayControlVideoView.this))) {
                } else {
                    PlayControlVideoView.access$1200(PlayControlVideoView.this, 5, null, null, true);
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, PlayControlVideoView.access$800(PlayControlVideoView.this), null, null, PlayControlVideoView.access$1600(PlayControlVideoView.this));
                }
            }
        };
        this.seekCompletionListener = new IMediaPlayer.OnSeekCompletionListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                    return;
                }
                if (PlayControlVideoView.access$200(PlayControlVideoView.this) > 0) {
                    ldf.d(PlayControlVideoView.TAG, "seekTo onSeekComplete 隐藏封面");
                    PlayControlVideoView.access$202(PlayControlVideoView.this, 0);
                    PlayControlVideoView.this.hideCoverImageView();
                }
                if (!PlayControlVideoView.access$100(PlayControlVideoView.this)) {
                    return;
                }
                if (PlayControlVideoView.access$300(PlayControlVideoView.this).isPlaying()) {
                    ldf.d(PlayControlVideoView.TAG, "seekTo onSeekComplete pauseVideo");
                    PlayControlVideoView.access$300(PlayControlVideoView.this).pause();
                }
                PlayControlVideoView.access$102(PlayControlVideoView.this, false);
                ldf.d(PlayControlVideoView.TAG, "seekTo onSeekComplete playVideo");
                PlayControlVideoView.this.playVideo();
            }
        };
        this.mOnCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                    return;
                }
                PlayControlVideoView.this.stopVideo();
                PlayControlVideoView.access$1200(PlayControlVideoView.this, 1, "play_complete", "播放完毕, itemId : " + PlayControlVideoView.access$1000(PlayControlVideoView.this) + ", VideoUrl : " + PlayControlVideoView.access$1100(PlayControlVideoView.this), true);
            }
        };
        init(context, z);
    }

    private void init(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        initView(context);
        initVideoConfig(z);
        registerListeners(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mPlayerCreateTime = System.currentTimeMillis();
        this.mVideoView = new TaoLiveVideoView(context);
        this.mVideoUIController = new h(context, this, this.mVideoView);
        this.mVideoView.disableAutoPlayForBackground();
    }

    private void initVideoConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5f06e0", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mVideoView.setMuted(true);
        com.taobao.taobaoavsdk.widget.media.c cVar = new com.taobao.taobaoavsdk.widget.media.c("HomePage");
        cVar.b = 2;
        cVar.c = 2;
        cVar.d = 0;
        this.mVideoView.setConfigAdapter(new com.taobao.taolive.uikit.livecard.d());
        this.mVideoView.initConfig(cVar);
        this.mVideoView.setLooping(z);
        if (ldj.a(NON_AUTOMATIC_PLAY_AFTER_DISCONNECT_ENABLE, true)) {
            this.mVideoView.setAutoPlayAfterDisconnect(false);
        }
        setControlParams(this.mVideoView);
    }

    private void setControlParams(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e275c0fa", new Object[]{this, taoLiveVideoView});
        } else if (!ldj.a("enableVideoScreenSleep", true)) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
            taoLiveVideoView.setControlParams(hashMap);
        }
    }

    public void setPlayEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36fc262", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mIsAttachedToWindow = true;
        this.mVideoView.setRenderType(2);
        ldk.a("video", "video_exposure", "", "Page_Home_VideoPlayer_Count", "", null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        release();
    }

    private void registerListeners(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60f8fc5", new Object[]{this, context});
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.b(context, this.mVideoView));
        this.mVideoView.registerOnErrorListener(this.mErrorListener);
        this.mVideoView.registerOnInfoListener(this.mOnInfoListener);
        this.mVideoView.registerOnStartListener(this.mOnStartListener);
        this.mVideoView.registerOnSeekCompletionListener(this.seekCompletionListener);
        this.mVideoView.registerOnPreparedListener(this.mOnPreparedListener);
        this.mVideoView.registerOnPauseListener(this.mOnPauseListener);
        this.mVideoView.registerOnCompletionListener(this.mOnCompletionListener);
    }

    private void callbackStatus(int i, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4660723b", new Object[]{this, new Integer(i), str, str2, new Boolean(z)});
            return;
        }
        g gVar = this.mStatusListener;
        if (gVar != null && z) {
            gVar.a(i, str, str2);
        }
        ldf.d(TAG, "callbackStatus", "status:" + i + " msg:" + str2);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
        } else {
            this.mVideoUIController.d(str);
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        if (str != null && str.endsWith(".mp4")) {
            this.mVideoUrl = str;
        } else {
            this.mVideoUrl = "";
        }
        ldf.d(TAG, "setVideoUrl. selfId:" + hashCode() + ", videoUrl=" + this.mVideoUrl);
        preDownloadVideo(this.mVideoUrl);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mOnFirstFrame = false;
        showCoverImageView();
        this.mVideoView.release();
        callbackStatus(7, null, null, true);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setDurationTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f4be54", new Object[]{this, str});
        } else {
            this.mVideoUIController.e(str);
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void updateData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d03316", new Object[]{this, jSONObject});
            return;
        }
        this.mCurrentData = jSONObject;
        this.mSectionBizCode = jSONObject == null ? "" : jSONObject.getString("sectionBizCode");
        this.mVideoId = getVideoId();
        ldf.d(TAG, "updateData. currentData = " + getCurrentData());
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void registerVideoStatusListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84650b49", new Object[]{this, gVar});
        } else {
            this.mStatusListener = gVar;
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void canPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609d7e89", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else if (this.mVideoView == null || i <= 0 || this.mSeekTime > 0) {
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("seekTo mVideoView null ");
            if (this.mVideoView != null) {
                z = false;
            }
            sb.append(z);
            sb.append(",time ");
            sb.append(i);
            sb.append(",already mSeekTime :");
            sb.append(this.mSeekTime);
            strArr[0] = sb.toString();
            ldf.d(TAG, strArr);
        } else {
            this.mSeekTime = i;
            ldf.d(TAG, "seekTo time :" + i);
            showCoverImageView();
            if (!this.mVideoView.isInPlaybackState()) {
                ldf.d(TAG, "seekTo 播放器实例异常 ");
                this.mIsPlayerInError = true;
                return;
            }
            if (this.mVideoView.isPlaying()) {
                ldf.d(TAG, "seekTo do pause");
                this.mVideoView.pause();
            }
            ldf.d(TAG, "seekTo seekToPause");
            this.mIsNeedWaitSeekComplete = true;
            this.mVideoView.seekToPause(this.mSeekTime, false, true);
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
        } else {
            this.mVideoUIController.a(str);
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
        } else {
            this.mVideoUIController.b(str);
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setIconSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
        } else {
            this.mVideoUIController.c(str);
        }
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        this.mVideoUIController.a();
        ldf.d(TAG, "show CoverImage:", this.mSectionBizCode);
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        this.mVideoUIController.b();
        ldf.d(TAG, "hide CoverImage:", this.mSectionBizCode);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.a(i);
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setCoverScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
        } else {
            this.mVideoUIController.a(scaleType);
        }
    }

    public void setCoverBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.b(i);
        }
    }

    public void setVideoViewForeGroundBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f9ff", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.c(i);
        }
    }

    public void setIvVideoVideoFakeBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.d(i);
        }
    }

    public void setCoverImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
        } else {
            this.mVideoUIController.a(drawable);
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        showCoverImageView();
        if (!this.mVideoView.isPlaying()) {
            return;
        }
        ldf.d(TAG, "pause video:", this.mSectionBizCode);
        this.mVideoView.pause();
        callbackStatus(5, null, null, true);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.b
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (!checkPlayEnable()) {
        } else {
            if (!this.mIsAttachedToWindow) {
                callbackStatus(2, "view_not_attach_to_window", "播放失败， mIsAttachedToWindow:false, itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
            } else if (this.mIsNeedWaitSeekComplete) {
                showCoverImageView();
                ldf.d(TAG, "seekTo playVideo 等待seek complete");
            } else if (this.mVideoView.isPlaying()) {
                h hVar = this.mVideoUIController;
                if (hVar != null && hVar.d()) {
                    addVideoPlayAbnormalStatistics();
                }
                hideCoverImageView();
                callbackStatus(2, "video_is_playing", "播放失败， mVideoView.isPlaying(), itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
            } else {
                this.mPlayControlStartTime = System.currentTimeMillis();
                String a2 = f.a().a(this.mVideoUrl);
                if (a2 != null) {
                    this.isPlayButPreDownload = false;
                    String mediaPlayUrl = this.mVideoView.getMediaPlayUrl();
                    if (!TextUtils.equals(mediaPlayUrl, a2)) {
                        this.mVideoView.release();
                        ldf.d(TAG, "playVideo do release, : " + this.mVideoView);
                        this.mVideoView.setVideoPath(a2);
                        if (!checkNeedPlay()) {
                            showCoverImageView();
                            ldf.d(TAG, "playVideo selfId:" + hashCode() + " enableVideoScrollControl: false; checkNeedPlay: false; lastPath:" + mediaPlayUrl + " localPath: " + a2 + " videoUrl:" + this.mVideoUrl);
                            return;
                        }
                    }
                    ldf.d(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + a2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.mVideoUrl);
                    if (this.mVideoView.isPlaying() || !TextUtils.equals(a2, this.mVideoView.getMediaPlayUrl())) {
                        return;
                    }
                    innerPlayVideo();
                    if (!this.isUsePreDownloadVideo) {
                        return;
                    }
                    UmbrellaTracker.commitSuccessStability("dataProcess", TAG, "1.0", "Page_Home_VideoPlayer", TAG, null);
                    return;
                }
                this.isPlayButPreDownload = true;
                downloadVideo();
            }
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.b
    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            pauseVideo();
        }
    }

    private void addVideoPlayAbnormalStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994686e0", new Object[]{this});
            return;
        }
        ldf.d(TAG, "video_stop_abnormal，sectionBizCode" + this.mSectionBizCode);
        ldk.a("video", "video_stop_abnormal", "", "Page_Home_VideoPlayer_Count", "", null);
    }

    private boolean checkPlayEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67e06a0a", new Object[]{this})).booleanValue();
        }
        boolean a2 = i.a(getContext());
        if (this.mCanPlay && !TextUtils.isEmpty(this.mVideoUrl) && a2) {
            return true;
        }
        showCoverImageView();
        this.mVideoView.release();
        this.mVideoView.setTag("");
        callbackStatus(2, "business_logic_validation_failed", "mCanPlay：" + this.mCanPlay + ",playEnable: " + a2 + ",mVideoUrl: " + this.mVideoUrl, true);
        return false;
    }

    private void downloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65d53da", new Object[]{this});
            return;
        }
        showCoverImageView();
        if (this.mCurrentData == null) {
            ldf.d(TAG, "download error mCurrentData is null");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.mVideoDownLoadListener = new e() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final JSONObject f17426a;

            {
                this.f17426a = PlayControlVideoView.access$1700(PlayControlVideoView.this);
            }

            @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.e
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ldf.d(PlayControlVideoView.TAG, "downLoadFinish playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + PlayControlVideoView.access$1100(PlayControlVideoView.this) + " downLoadUrl:" + str);
                HashMap hashMap = new HashMap(2);
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                ldk.a("video", "video_fetchCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                if (this.f17426a != PlayControlVideoView.access$1700(PlayControlVideoView.this) || !TextUtils.equals(PlayControlVideoView.access$1100(PlayControlVideoView.this), str)) {
                    return;
                }
                ldf.d(PlayControlVideoView.TAG, "downLoadFinish playVideo  data == currentData;");
                PlayControlVideoView.this.playVideo();
                PlayControlVideoView.access$1200(PlayControlVideoView.this, 3, "download_success", "下载成功,itemID:" + PlayControlVideoView.access$1000(PlayControlVideoView.this) + ",videoUrl : " + PlayControlVideoView.access$1100(PlayControlVideoView.this), true);
            }

            @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                PlayControlVideoView.access$1200(PlayControlVideoView.this, 4, "normal_download_failed", "下载失败,itemID:" + PlayControlVideoView.access$1000(PlayControlVideoView.this) + ",videoUrl : " + PlayControlVideoView.access$1100(PlayControlVideoView.this), true);
            }
        };
        f.a().a(this.mVideoUrl, this.mVideoDownLoadListener);
    }

    private String getCurrentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb9dd58c", new Object[]{this});
        }
        JSONObject jSONObject = this.mCurrentData;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    private void innerPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adea2ff8", new Object[]{this});
        } else if (this.mVideoView.getCurrentState() < 0) {
            UmbrellaTracker.commitFailureStability("dataProcess", TAG, "1.0", "Page_Home_VideoPlayer", TAG, null, "url not correct", "");
            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView url error", "");
            ldf.d(TAG, "url not correct: cur url：" + this.mVideoView.getMediaPlayUrl() + ", target url:" + this.mVideoUrl + ", cur play state:" + this.mVideoView.getCurrentState() + " selfId:" + hashCode());
        } else {
            this.mPlayStartTime = System.currentTimeMillis();
            ldk.a("video", "video_startPlay", "", "Page_Home_VideoPlayer_Count", "", null);
            this.mVideoView.start();
            callbackStatus(6, null, null, true);
            ldf.d(TAG, "startPlay mOnFirstFrame:" + this.mOnFirstFrame + ",mSeekTime:" + this.mSeekTime);
            if (this.mOnFirstFrame && this.mSeekTime <= 0) {
                ldf.d(TAG, "start hideCoverImageView");
                hideCoverImageView();
            }
            ldf.d(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.mVideoUrl + "video isPlaying:" + this.mVideoView.isPlaying() + "sectionBizCode:" + this.mSectionBizCode);
        }
    }

    private boolean checkNeedPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27e0399d", new Object[]{this})).booleanValue() : getVisibility() == 0;
    }

    private String getStartUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92025e11", new Object[]{this});
        }
        return "userId=" + this.mUserId + "," + com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID + "=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",scm=" + getScm() + ",item_id=" + getItemID();
    }

    private String getEndUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d81fb78", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mMediaStartTime;
        return "userId=" + this.mUserId + "," + com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID + "=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",type=end,duration_time=" + currentTimeMillis + ",item_id=" + getItemID();
    }

    private String getScm() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mScm) && (jSONObject = this.mCurrentData) != null && (jSONObject2 = jSONObject.getJSONObject("args")) != null) {
            this.mScm = jSONObject2.getString("scm");
        }
        return this.mScm;
    }

    private String getItemID() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edfaa715", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mItemId) && (jSONObject = this.mCurrentData) != null) {
            Object a2 = lja.a("item.0.clickParam.itemId", jSONObject);
            if (a2 instanceof String) {
                this.mItemId = (String) a2;
            }
        }
        return this.mItemId;
    }

    private String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        this.mVideoId = "";
        JSONObject jSONObject = this.mCurrentData;
        if (jSONObject != null && jSONObject.getJSONObject("item") != null && this.mCurrentData.getJSONObject("item").getJSONObject("0") != null && this.mCurrentData.getJSONObject("item").getJSONObject("0").getJSONObject("content") != null) {
            this.mVideoId = this.mCurrentData.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString(com.etao.feimagesearch.util.h.KEY_VIDEO_ID);
        }
        return this.mVideoId;
    }

    private void preDownloadVideo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f364f581", new Object[]{this, str});
        } else if (!ldj.a(OPEN_PRE_DOWNLOAD_VIDEO, true) || TextUtils.isEmpty(str)) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mPreVideoDownLoadListener = new e() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.e
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    PlayControlVideoView.access$1802(PlayControlVideoView.this, true);
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    ldk.a("video", "video_downloadCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                    if (!PlayControlVideoView.access$1900(PlayControlVideoView.this)) {
                        return;
                    }
                    PlayControlVideoView.access$2000(PlayControlVideoView.this).a(str2);
                }

                @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    PlayControlVideoView.access$1802(PlayControlVideoView.this, false);
                    PlayControlVideoView.access$1200(PlayControlVideoView.this, 4, "pre_download_failed", "预下载失败,itemID:" + PlayControlVideoView.access$1000(PlayControlVideoView.this) + ",videoUrl : " + PlayControlVideoView.access$1100(PlayControlVideoView.this), true);
                }
            };
            f.a().a(str, this.mPreVideoDownLoadListener);
        }
    }
}

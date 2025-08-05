package com.taobao.android.home.component.view.video;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.h;
import com.taobao.android.home.component.utils.j;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.ut.device.UTDevice;
import java.util.HashMap;
import tb.gmu;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class HVideoViewV2 extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HVideoViewV2";
    private static final String VIDEO_SUFFIX = ".mp4";
    private boolean isUsePreDownloadVideo;
    private boolean mCanPlay;
    private JSONObject mCurrentData;
    private b mDownLoadVideoLoadListener;
    private final IMediaPlayer.OnErrorListener mErrorListener;
    private boolean mIsAttachedToWindow;
    private boolean mIsResponsePlayControl;
    private String mItemId;
    private final IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private boolean mOnFirstFrame;
    private final IMediaPlayer.OnInfoListener mOnInfoListener;
    private final TaoLiveVideoView.a mOnPauseListener;
    private final TaoLiveVideoView.b mOnStartListener;
    private String mPlayId;
    private b mPreDownLoadVideoLoadListener;
    private String mScm;
    private String mSectionBizCode;
    private long mStartTime;
    private d mStatusListener;
    private final String mUserId;
    private final String mUttId;
    private String mVideoId;
    private e mVideoUIController;
    private String mVideoUrl;
    private TaoLiveVideoView mVideoView;

    static {
        kge.a(-1605553149);
        kge.a(-1645591486);
    }

    public static /* synthetic */ Object ipc$super(HVideoViewV2 hVideoViewV2, String str, Object... objArr) {
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

    public static /* synthetic */ long access$000(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9cc44dbb", new Object[]{hVideoViewV2})).longValue() : hVideoViewV2.mStartTime;
    }

    public static /* synthetic */ long access$002(HVideoViewV2 hVideoViewV2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9744d1d3", new Object[]{hVideoViewV2, new Long(j)})).longValue();
        }
        hVideoViewV2.mStartTime = j;
        return j;
    }

    public static /* synthetic */ JSONObject access$1000(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d07d6258", new Object[]{hVideoViewV2}) : hVideoViewV2.mCurrentData;
    }

    public static /* synthetic */ String access$102(HVideoViewV2 hVideoViewV2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85bd77f2", new Object[]{hVideoViewV2, str});
        }
        hVideoViewV2.mPlayId = str;
        return str;
    }

    public static /* synthetic */ boolean access$1102(HVideoViewV2 hVideoViewV2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("274a6e63", new Object[]{hVideoViewV2, new Boolean(z)})).booleanValue();
        }
        hVideoViewV2.isUsePreDownloadVideo = z;
        return z;
    }

    public static /* synthetic */ String access$200(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a57c13b", new Object[]{hVideoViewV2}) : hVideoViewV2.mUttId;
    }

    public static /* synthetic */ String access$300(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1d39afc", new Object[]{hVideoViewV2}) : hVideoViewV2.mVideoId;
    }

    public static /* synthetic */ String access$400(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("994f74bd", new Object[]{hVideoViewV2}) : hVideoViewV2.getStartUtArgs();
    }

    public static /* synthetic */ String access$500(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40cb4e7e", new Object[]{hVideoViewV2}) : hVideoViewV2.getItemID();
    }

    public static /* synthetic */ String access$600(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e847283f", new Object[]{hVideoViewV2}) : hVideoViewV2.mVideoUrl;
    }

    public static /* synthetic */ void access$700(HVideoViewV2 hVideoViewV2, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fe6907", new Object[]{hVideoViewV2, new Integer(i), str, new Boolean(z)});
        } else {
            hVideoViewV2.callbackStatus(i, str, z);
        }
    }

    public static /* synthetic */ boolean access$802(HVideoViewV2 hVideoViewV2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7550ebfb", new Object[]{hVideoViewV2, new Boolean(z)})).booleanValue();
        }
        hVideoViewV2.mOnFirstFrame = z;
        return z;
    }

    public static /* synthetic */ String access$900(HVideoViewV2 hVideoViewV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("debab582", new Object[]{hVideoViewV2}) : hVideoViewV2.getEndUtArgs();
    }

    public HVideoViewV2(Context context) {
        super(context);
        this.mOnFirstFrame = false;
        this.mIsResponsePlayControl = true;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemId = "";
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                    return;
                }
                HVideoViewV2.access$002(HVideoViewV2.this, System.currentTimeMillis());
                HVideoViewV2 hVideoViewV2 = HVideoViewV2.this;
                HVideoViewV2.access$102(hVideoViewV2, HVideoViewV2.access$200(HVideoViewV2.this) + HVideoViewV2.access$000(HVideoViewV2.this));
                TBS.Ext.commitEvent("cnxh_special", 12002, HVideoViewV2.access$300(HVideoViewV2.this), null, null, HVideoViewV2.access$400(HVideoViewV2.this));
            }
        };
        this.mErrorListener = new IMediaPlayer.OnErrorListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                HVideoViewV2.this.showCoverImageView();
                HVideoViewV2.this.pauseVideo();
                HVideoViewV2.access$700(HVideoViewV2.this, 2, "播放错误：, itemID:" + HVideoViewV2.access$500(HVideoViewV2.this) + ", what:" + i + ", extra:" + i2 + ", videoUrl:" + HVideoViewV2.access$600(HVideoViewV2.this), true);
                return false;
            }
        };
        this.mOnInfoListener = new IMediaPlayer.OnInfoListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3) {
                    HVideoViewV2.access$802(HVideoViewV2.this, true);
                    HVideoViewV2.this.hideCoverImageView();
                }
                return true;
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (TextUtils.isEmpty(HVideoViewV2.access$300(HVideoViewV2.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoViewV2.access$300(HVideoViewV2.this), null, null, HVideoViewV2.access$900(HVideoViewV2.this));
                }
            }
        };
        this.mOnCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                    return;
                }
                HVideoViewV2.this.stopVideo();
                HVideoViewV2.access$700(HVideoViewV2.this, 1, "播放完毕, itemId : " + HVideoViewV2.access$500(HVideoViewV2.this) + ", VideoUrl : " + HVideoViewV2.access$600(HVideoViewV2.this), true);
            }
        };
        init(context);
    }

    public HVideoViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnFirstFrame = false;
        this.mIsResponsePlayControl = true;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemId = "";
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                    return;
                }
                HVideoViewV2.access$002(HVideoViewV2.this, System.currentTimeMillis());
                HVideoViewV2 hVideoViewV2 = HVideoViewV2.this;
                HVideoViewV2.access$102(hVideoViewV2, HVideoViewV2.access$200(HVideoViewV2.this) + HVideoViewV2.access$000(HVideoViewV2.this));
                TBS.Ext.commitEvent("cnxh_special", 12002, HVideoViewV2.access$300(HVideoViewV2.this), null, null, HVideoViewV2.access$400(HVideoViewV2.this));
            }
        };
        this.mErrorListener = new IMediaPlayer.OnErrorListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                HVideoViewV2.this.showCoverImageView();
                HVideoViewV2.this.pauseVideo();
                HVideoViewV2.access$700(HVideoViewV2.this, 2, "播放错误：, itemID:" + HVideoViewV2.access$500(HVideoViewV2.this) + ", what:" + i + ", extra:" + i2 + ", videoUrl:" + HVideoViewV2.access$600(HVideoViewV2.this), true);
                return false;
            }
        };
        this.mOnInfoListener = new IMediaPlayer.OnInfoListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3) {
                    HVideoViewV2.access$802(HVideoViewV2.this, true);
                    HVideoViewV2.this.hideCoverImageView();
                }
                return true;
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (TextUtils.isEmpty(HVideoViewV2.access$300(HVideoViewV2.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoViewV2.access$300(HVideoViewV2.this), null, null, HVideoViewV2.access$900(HVideoViewV2.this));
                }
            }
        };
        this.mOnCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                    return;
                }
                HVideoViewV2.this.stopVideo();
                HVideoViewV2.access$700(HVideoViewV2.this, 1, "播放完毕, itemId : " + HVideoViewV2.access$500(HVideoViewV2.this) + ", VideoUrl : " + HVideoViewV2.access$600(HVideoViewV2.this), true);
            }
        };
        init(context);
    }

    public HVideoViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnFirstFrame = false;
        this.mIsResponsePlayControl = true;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemId = "";
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                    return;
                }
                HVideoViewV2.access$002(HVideoViewV2.this, System.currentTimeMillis());
                HVideoViewV2 hVideoViewV2 = HVideoViewV2.this;
                HVideoViewV2.access$102(hVideoViewV2, HVideoViewV2.access$200(HVideoViewV2.this) + HVideoViewV2.access$000(HVideoViewV2.this));
                TBS.Ext.commitEvent("cnxh_special", 12002, HVideoViewV2.access$300(HVideoViewV2.this), null, null, HVideoViewV2.access$400(HVideoViewV2.this));
            }
        };
        this.mErrorListener = new IMediaPlayer.OnErrorListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i22)})).booleanValue();
                }
                HVideoViewV2.this.showCoverImageView();
                HVideoViewV2.this.pauseVideo();
                HVideoViewV2.access$700(HVideoViewV2.this, 2, "播放错误：, itemID:" + HVideoViewV2.access$500(HVideoViewV2.this) + ", what:" + i2 + ", extra:" + i22 + ", videoUrl:" + HVideoViewV2.access$600(HVideoViewV2.this), true);
                return false;
            }
        };
        this.mOnInfoListener = new IMediaPlayer.OnInfoListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3) {
                    HVideoViewV2.access$802(HVideoViewV2.this, true);
                    HVideoViewV2.this.hideCoverImageView();
                }
                return true;
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (TextUtils.isEmpty(HVideoViewV2.access$300(HVideoViewV2.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoViewV2.access$300(HVideoViewV2.this), null, null, HVideoViewV2.access$900(HVideoViewV2.this));
                }
            }
        };
        this.mOnCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                    return;
                }
                HVideoViewV2.this.stopVideo();
                HVideoViewV2.access$700(HVideoViewV2.this, 1, "播放完毕, itemId : " + HVideoViewV2.access$500(HVideoViewV2.this) + ", VideoUrl : " + HVideoViewV2.access$600(HVideoViewV2.this), true);
            }
        };
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        initView(context);
        initVideoConfig();
        registerListeners(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mVideoView = new TaoLiveVideoView(context);
        this.mVideoUIController = new e(context, this, this.mVideoView);
        this.mVideoView.disableAutoPlayForBackground();
    }

    private void initVideoConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc0fa74", new Object[]{this});
            return;
        }
        this.mVideoView.setMuted(true);
        com.taobao.taobaoavsdk.widget.media.c cVar = new com.taobao.taobaoavsdk.widget.media.c("HomePage");
        cVar.b = 2;
        cVar.c = 2;
        cVar.d = 0;
        this.mVideoView.initConfig(cVar);
        if (!this.mIsResponsePlayControl) {
            this.mVideoView.setLooping(false);
        } else {
            this.mVideoView.setLooping(true);
        }
        if (j.a("nonAutomaticPlayAfterDisconnectEnable", true)) {
            this.mVideoView.setAutoPlayAfterDisconnect(false);
        }
        setControlParams(this.mVideoView);
    }

    private void setControlParams(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e275c0fa", new Object[]{this, taoLiveVideoView});
        } else if (!j.a("enableVideoScreenSleep", true)) {
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
        if (this.mIsResponsePlayControl) {
            return;
        }
        playVideo();
        com.taobao.android.home.component.utils.e.e("HVideoView2", "不响应播控，在onAttachedToWindow时播放起来");
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
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new gmu(context, this.mVideoView));
        this.mVideoView.registerOnErrorListener(this.mErrorListener);
        this.mVideoView.registerOnInfoListener(this.mOnInfoListener);
        this.mVideoView.registerOnStartListener(this.mOnStartListener);
        this.mVideoView.registerOnPauseListener(this.mOnPauseListener);
        this.mVideoView.registerOnCompletionListener(this.mOnCompletionListener);
    }

    private void callbackStatus(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498e2d05", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        com.taobao.android.home.component.utils.e.e(TAG, "callbackStatus", "status:" + i + " msg:" + str);
    }

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
        } else {
            this.mVideoUIController.d(str);
        }
    }

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
        com.taobao.android.home.component.utils.e.e(TAG, "setVideoUrl. selfId:" + hashCode() + ", videoUrl=" + this.mVideoUrl);
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
    }

    public void setDurationTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f4be54", new Object[]{this, str});
        } else {
            this.mVideoUIController.e(str);
        }
    }

    public void updateData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d03316", new Object[]{this, jSONObject});
            return;
        }
        this.mCurrentData = jSONObject;
        this.mSectionBizCode = jSONObject == null ? "" : jSONObject.getString("sectionBizCode");
        this.mVideoId = getVideoId();
        com.taobao.android.home.component.utils.e.e(TAG, "updateData. currentData = " + getCurrentData());
    }

    public void registerVideoStatusListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b75df", new Object[]{this, dVar});
        } else {
            this.mStatusListener = dVar;
        }
    }

    public void setResponsePlayControl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b60ee27", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsResponsePlayControl = z;
        }
    }

    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
        } else {
            this.mVideoUIController.a(str);
        }
    }

    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
        } else {
            this.mVideoUIController.b(str);
        }
    }

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
        this.mVideoView.setVisibility(8);
        this.mVideoUIController.a();
        com.taobao.android.home.component.utils.e.e(TAG, "show CoverImage:", this.mSectionBizCode);
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        this.mVideoView.setVisibility(0);
        this.mVideoUIController.b();
        com.taobao.android.home.component.utils.e.e(TAG, "hide CoverImage:", this.mSectionBizCode);
    }

    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.a(i);
        }
    }

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
        com.taobao.android.home.component.utils.e.e(TAG, "pause video:", this.mSectionBizCode);
        this.mVideoView.pause();
    }

    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (!checkPlayEnable()) {
        } else {
            if (!this.mIsAttachedToWindow) {
                callbackStatus(2, "播放失败， mIsAttachedToWindow:false, itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
            } else if (this.mVideoView.isPlaying()) {
                callbackStatus(2, "播放失败， mVideoView.isPlaying(), itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
            } else {
                String a2 = c.a().a(this.mVideoUrl);
                if (a2 != null) {
                    String mediaPlayUrl = this.mVideoView.getMediaPlayUrl();
                    if (!TextUtils.equals(mediaPlayUrl, a2)) {
                        this.mVideoView.release();
                        this.mVideoView.setVideoPath(a2);
                        if (!checkNeedPlay()) {
                            showCoverImageView();
                            com.taobao.android.home.component.utils.e.e(TAG, "playVideo selfId:" + hashCode() + " enableVideoScrollControl: false; checkNeedPlay: false; lastPath:" + mediaPlayUrl + " localPath: " + a2 + " videoUrl:" + this.mVideoUrl);
                            return;
                        }
                    }
                    com.taobao.android.home.component.utils.e.e(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + a2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.mVideoUrl);
                    if (this.mVideoView.isPlaying() || !TextUtils.equals(a2, this.mVideoView.getMediaPlayUrl())) {
                        return;
                    }
                    innerPlayVideo();
                    if (!this.isUsePreDownloadVideo) {
                        return;
                    }
                    UmbrellaTracker.commitSuccessStability("dataProcess", TAG, "1.0", "Page_Home", TAG, null);
                    return;
                }
                downloadVideo();
            }
        }
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            pauseVideo();
        }
    }

    private boolean checkPlayEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67e06a0a", new Object[]{this})).booleanValue();
        }
        boolean a2 = f.a(getContext());
        if (this.mCanPlay && !TextUtils.isEmpty(this.mVideoUrl) && a2) {
            return true;
        }
        showCoverImageView();
        this.mVideoView.release();
        this.mVideoView.setTag("");
        callbackStatus(2, "mCanPlay：" + this.mCanPlay + ",playEnable: " + a2 + ",mVideoUrl: " + this.mVideoUrl, true);
        return false;
    }

    private void downloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65d53da", new Object[]{this});
            return;
        }
        showCoverImageView();
        this.mDownLoadVideoLoadListener = new b() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final JSONObject f12759a;

            {
                this.f12759a = HVideoViewV2.access$1000(HVideoViewV2.this);
            }

            @Override // com.taobao.android.home.component.view.video.b
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                com.taobao.android.home.component.utils.e.e(HVideoViewV2.TAG, "downLoadFinish playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + HVideoViewV2.access$600(HVideoViewV2.this) + " downLoadUrl:" + str);
                if (this.f12759a != HVideoViewV2.access$1000(HVideoViewV2.this) || !TextUtils.equals(HVideoViewV2.access$600(HVideoViewV2.this), str)) {
                    return;
                }
                com.taobao.android.home.component.utils.e.e(HVideoViewV2.TAG, "downLoadFinish playVideo  data == currentData;");
                HVideoViewV2.this.playVideo();
                HVideoViewV2.access$700(HVideoViewV2.this, 3, "下载成功,itemID:" + HVideoViewV2.access$500(HVideoViewV2.this) + ",videoUrl : " + HVideoViewV2.access$600(HVideoViewV2.this), true);
            }

            @Override // com.taobao.android.home.component.view.video.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                HVideoViewV2.access$700(HVideoViewV2.this, 4, "下载失败,itemID:" + HVideoViewV2.access$500(HVideoViewV2.this) + ",videoUrl : " + HVideoViewV2.access$600(HVideoViewV2.this), true);
            }
        };
        c.a().a(this.mVideoUrl, this.mDownLoadVideoLoadListener);
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
            UmbrellaTracker.commitFailureStability("dataProcess", TAG, "1.0", "Page_Home", TAG, null, "url not correct", "");
            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView url error", "");
            com.taobao.android.home.component.utils.e.e(TAG, "url not correct: cur url：" + this.mVideoView.getMediaPlayUrl() + ", target url:" + this.mVideoUrl + ", cur play state:" + this.mVideoView.getCurrentState() + " selfId:" + hashCode());
        } else {
            this.mVideoView.setVisibility(0);
            this.mVideoView.start();
            if (this.mOnFirstFrame) {
                hideCoverImageView();
            }
            com.taobao.android.home.component.utils.e.e(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.mVideoUrl + "video isPlaying:" + this.mVideoView.isPlaying() + "sectionBizCode:" + this.mSectionBizCode);
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
        long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
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
        if (TextUtils.isEmpty(this.mItemId) && (jSONObject = this.mCurrentData) != null && jSONObject.getJSONObject("item") != null && this.mCurrentData.getJSONObject("item").getJSONObject("0") != null && this.mCurrentData.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") != null) {
            this.mItemId = this.mCurrentData.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
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
            this.mVideoId = this.mCurrentData.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString(h.KEY_VIDEO_ID);
        }
        return this.mVideoId;
    }

    private void preDownloadVideo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f364f581", new Object[]{this, str});
        } else if (!j.a("openPreDownloadVideo", true) || TextUtils.isEmpty(str)) {
        } else {
            this.mPreDownLoadVideoLoadListener = new b() { // from class: com.taobao.android.home.component.view.video.HVideoViewV2.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.home.component.view.video.b
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        HVideoViewV2.access$1102(HVideoViewV2.this, true);
                    }
                }

                @Override // com.taobao.android.home.component.view.video.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        HVideoViewV2.access$1102(HVideoViewV2.this, false);
                    }
                }
            };
            c.a().a(str, this.mPreDownLoadVideoLoadListener);
        }
    }
}

package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.AbsLocalBroadcastReceiver;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.b;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.e;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.f;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.g;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.h;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.i;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.taobaoavsdk.widget.media.c;
import com.ut.device.UTDevice;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.keu;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.lja;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes7.dex */
public class HVideoView extends FrameLayout implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_PAUSE_VIDEO = "pause";
    public static final String EVENT_TYPE_PLAY_VIDEO = "play";
    public static final String EVENT_TYPE_RELEASE_VIDEO = "release";
    public static final String HAS_ENQUEUE_KEY = "enqueued";
    private static final String H_VIDEO_VIEW_SHOW_COVER_IMAGE_DETACH_WINDOW_ENABLE = "showCoverImageViewDetachWindow";
    private static final String IMMEDIATELY_HIDE_COVER_VIEW_ENABLE = "immediatelyHideCoverViewEnable";
    public static final String S_BIZ_CODE = "sectionBizCode";
    private static final String TAG = "HVideoView";
    public static final String VIDEOVIEW_COVER_URL = "hCoverURL";
    public static final String VIDEOVIEW_DURATION_TEXT = "hDuration";
    public static final String VIDEOVIEW_DURITION_TEXT = "hDurition";
    public static final String VIDEOVIEW_ICON_OFFSETY = "hIconOffsetY";
    public static final String VIDEOVIEW_ICON_URL = "hIconURL";
    public static final String VIDEOVIEW_VIDEO_CAN_PLAY = "hCanPlay";
    public static final String VIDEOVIEW_VIDEO_SCALE_TYPE = "hScaleType";
    public static final String VIDEOVIEW_VIDEO_URL = "hVideoURL";
    public JSONObject currentData;
    private boolean isAttachedToWindow;
    private boolean mCanPlay;
    private Context mContext;
    private String mItemID;
    private boolean mNeedAutoPlay;
    private TaoLiveVideoView.a mOnPauseListener;
    private TaoLiveVideoView.b mOnStartListener;
    private String mPlayId;
    private RecyclerViewStateReceiver mRecyclerViewStateReceiver;
    private String mScm;
    private long mStartTime;
    private String mUserId;
    private String mUttId;
    private e mVideoDownLoadListener;
    private String mVideoId;
    private h mVideoUIController;
    private TaoLiveVideoView mVideoView;
    private String sectionBizCode;
    public g statusListener;
    private String videoUrl;

    static {
        kge.a(-1527639144);
        kge.a(-322278169);
    }

    public static /* synthetic */ Object ipc$super(HVideoView hVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
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
    public void registerVideoStatusListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84650b49", new Object[]{this, gVar});
        }
    }

    public void setPlayEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36fc262", new Object[]{this, new Boolean(z)});
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

    public static /* synthetic */ String access$000(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ba64d52", new Object[]{hVideoView}) : hVideoView.videoUrl;
    }

    public static /* synthetic */ void access$100(HVideoView hVideoView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee8be1e", new Object[]{hVideoView, new Integer(i), str});
        } else {
            hVideoView.callbackStatus(i, str);
        }
    }

    public static /* synthetic */ String access$200(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("378a8f7d", new Object[]{str}) : getVideoFilePath(str);
    }

    public static /* synthetic */ TaoLiveVideoView access$300(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveVideoView) ipChange.ipc$dispatch("30f35e57", new Object[]{hVideoView}) : hVideoView.mVideoView;
    }

    public static /* synthetic */ String access$400(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5aa71bce", new Object[]{hVideoView}) : hVideoView.mVideoId;
    }

    public static /* synthetic */ long access$500(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9d51d87", new Object[]{hVideoView})).longValue() : hVideoView.mStartTime;
    }

    public static /* synthetic */ long access$502(HVideoView hVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4fd6643", new Object[]{hVideoView, new Long(j)})).longValue();
        }
        hVideoView.mStartTime = j;
        return j;
    }

    public static /* synthetic */ String access$602(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7825cec0", new Object[]{hVideoView, str});
        }
        hVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$700(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9e7b6ab", new Object[]{hVideoView}) : hVideoView.mUttId;
    }

    public static /* synthetic */ String access$800(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99a7ea4a", new Object[]{hVideoView}) : hVideoView.getStartUtArgs();
    }

    public static /* synthetic */ String access$900(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69681de9", new Object[]{hVideoView}) : hVideoView.getEndUtArgs();
    }

    public HVideoView(Context context) {
        super(context);
        this.mCanPlay = true;
        this.mNeedAutoPlay = false;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    HVideoView.access$502(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$602(hVideoView, HVideoView.access$700(HVideoView.this) + HVideoView.access$500(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$800(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$900(HVideoView.this));
                }
            }
        };
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanPlay = true;
        this.mNeedAutoPlay = false;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    HVideoView.access$502(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$602(hVideoView, HVideoView.access$700(HVideoView.this) + HVideoView.access$500(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$800(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$900(HVideoView.this));
                }
            }
        };
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCanPlay = true;
        this.mNeedAutoPlay = false;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    HVideoView.access$502(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$602(hVideoView, HVideoView.access$700(HVideoView.this) + HVideoView.access$500(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$800(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$900(HVideoView.this));
                }
            }
        };
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mCanPlay = true;
        this.mNeedAutoPlay = false;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    HVideoView.access$502(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$602(hVideoView, HVideoView.access$700(HVideoView.this) + HVideoView.access$500(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$800(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$900(HVideoView.this));
                }
            }
        };
        init(context);
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
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.seekTo(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        this.mVideoView.setRenderType(2);
        ldf.d(TAG, "onAttachedToWindow playVideo  selfId:" + hashCode() + " localPath:" + this.videoUrl);
        playVideo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        if (ldj.a(H_VIDEO_VIEW_SHOW_COVER_IMAGE_DETACH_WINDOW_ENABLE, true)) {
            showCoverImageView();
        }
        this.mVideoView.release();
        this.mVideoId = "";
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        initView(context);
        initVideoConfig();
        ((Application) this.mContext.getApplicationContext()).registerActivityLifecycleCallbacks(new b(this.mContext, this.mVideoView));
        this.mVideoView.registerOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                HVideoView.this.showCoverImageView();
                HVideoView.this.pauseVideo();
                ldf.d(HVideoView.TAG, "videoView OnErrorListener", "" + i);
                HVideoView hVideoView = HVideoView.this;
                HVideoView.access$100(hVideoView, 2, "播放错误 " + HVideoView.access$000(HVideoView.this));
                return false;
            }
        });
        this.mVideoView.registerOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (3 == j) {
                    boolean z = iMediaPlayer instanceof MonitorMediaPlayer;
                    String playUrl = z ? ((MonitorMediaPlayer) iMediaPlayer).getPlayUrl() : "";
                    String access$200 = HVideoView.access$200(HVideoView.access$000(HVideoView.this));
                    ldf.d(HVideoView.TAG, "HVideoView start play. selfId:" + hashCode() + ", playUrl=" + playUrl + ", localPathUrl=" + access$200 + ", videoUrl=" + HVideoView.access$000(HVideoView.this));
                    if (z && !StringUtils.equals(playUrl, access$200)) {
                        TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView path error", "");
                        try {
                            HVideoView.access$300(HVideoView.this).pause();
                            ldf.d(HVideoView.TAG, "selfId:" + hashCode() + ",path error: expect:url:" + HVideoView.access$000(HVideoView.this) + "，actualUrl:" + HVideoView.access$300(HVideoView.this).getMediaPlayUrl() + ",data:" + JSON.toJSONString(iMediaPlayer));
                        } catch (Throwable th) {
                            ldf.a(HVideoView.TAG, "HVideoView pause error", th);
                        }
                        return true;
                    } else if (ldj.a(HVideoView.IMMEDIATELY_HIDE_COVER_VIEW_ENABLE, true)) {
                        HVideoView.this.hideCoverImageView();
                    } else {
                        HVideoView.this.postDelayed(new Runnable() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    HVideoView.this.hideCoverImageView();
                                }
                            }
                        }, 1200L);
                    }
                }
                return true;
            }
        });
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.mVideoView = new TaoLiveVideoView(context);
        this.mVideoUIController = new h(context, this, this.mVideoView);
    }

    private void initVideoConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc0fa74", new Object[]{this});
            return;
        }
        this.mVideoView.setMuted(true);
        c cVar = new c("HomePage");
        cVar.b = 2;
        cVar.c = 2;
        cVar.d = 0;
        this.mVideoView.initConfig(cVar);
        this.mVideoView.setLooping(true);
        this.mVideoView.disableAutoPlayForBackground();
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

    private void callbackStatus(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb1fbaf", new Object[]{this, new Integer(i), str});
            return;
        }
        g gVar = this.statusListener;
        if (gVar != null) {
            gVar.a(i, "", str);
        }
        ldf.d(TAG, "callbackStatus", "status:" + i + " msg:" + str);
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
        String str2 = "";
        if (str != null && str.endsWith(keu.SUFFIX_MP4)) {
            this.videoUrl = str;
        } else {
            this.videoUrl = str2;
        }
        if (StringUtils.isEmpty(this.videoUrl)) {
            str2 = " , original Url = " + str;
        }
        ldf.d(TAG, "setVideoUrl. selfId:" + hashCode() + ", videoUrl=" + this.videoUrl + str2);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        showCoverImageView();
        this.mVideoView.release();
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
        this.currentData = jSONObject;
        this.sectionBizCode = jSONObject == null ? "" : jSONObject.getString("sectionBizCode");
        this.mVideoId = getVideoId();
        ldf.d(TAG, "updateData. currentData = " + getCurrentData());
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
        ldf.d(TAG, "show CoverImage:", this.sectionBizCode);
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        this.mVideoUIController.b();
        ldf.d(TAG, "hide CoverImage:", this.sectionBizCode);
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

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.b
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        boolean newCanPlayVideo = newCanPlayVideo(getContext());
        ldf.d(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " videoUrl:" + this.videoUrl);
        if (!this.mCanPlay || StringUtils.isEmpty(this.videoUrl) || !newCanPlayVideo) {
            showCoverImageView();
            this.mVideoView.release();
            this.mVideoView.setTag("");
            ldf.d(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " status_play_error videoUrl:" + this.videoUrl);
            callbackStatus(2, "播放错误 ：canplay " + this.mCanPlay + " playEnable: " + newCanPlayVideo + " videourl " + this.videoUrl);
        } else if (!this.isAttachedToWindow) {
            callbackStatus(2, " 播放错误 ： 未上屏");
            ldf.d(TAG, "playVideo  selfId:" + hashCode() + " isAttachedToWindow: false status_play_error videoUrl:" + this.videoUrl);
        } else {
            String a2 = f.a().a(this.videoUrl);
            String mediaPlayUrl = this.mVideoView.getMediaPlayUrl();
            if (this.mVideoView.isPlaying()) {
                if (StringUtils.equals(a2, mediaPlayUrl)) {
                    ldf.d(TAG, "playVideo  selfId:" + hashCode() + " 当前videoView isPlaying videoUrl:" + this.videoUrl);
                    return;
                }
                this.mVideoView.pause();
            }
            if (a2 != null) {
                ldf.d(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + a2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (!StringUtils.equals(mediaPlayUrl, a2)) {
                    this.mVideoView.release();
                    this.mVideoView.setVideoPath(a2);
                    if (!checkNeedPlay()) {
                        showCoverImageView();
                        ldf.d(TAG, "playVideo selfId:" + hashCode() + " enableVideoScrollControl: false; checkNeedPlay: false; lastPath:" + mediaPlayUrl + " localPath: " + a2 + " videoUrl:" + this.videoUrl);
                        return;
                    }
                }
                ldf.d(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + a2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (!StringUtils.equals(a2, this.mVideoView.getMediaPlayUrl())) {
                    return;
                }
                innerPlayVideo();
                return;
            }
            showCoverImageView();
            ldf.d(TAG, "playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.mVideoView.isPlaying());
            this.mVideoDownLoadListener = new e() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final JSONObject f17413a;

                {
                    this.f17413a = HVideoView.this.currentData;
                }

                @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.e
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    ldf.d(HVideoView.TAG, "downLoadFinish playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + HVideoView.access$000(HVideoView.this) + " downLoadUrl:" + str);
                    if (this.f17413a != HVideoView.this.currentData || !StringUtils.equals(HVideoView.access$000(HVideoView.this), str)) {
                        return;
                    }
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$100(hVideoView, 3, "下载成功 " + HVideoView.access$000(HVideoView.this));
                    HVideoView.this.playVideo();
                }

                @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$100(hVideoView, 4, "下载失败 ： " + HVideoView.access$000(HVideoView.this));
                }
            };
            f.a().a(this.videoUrl, this.mVideoDownLoadListener);
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

    private String getCurrentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb9dd58c", new Object[]{this});
        }
        JSONObject jSONObject = this.currentData;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    private void innerPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adea2ff8", new Object[]{this});
        } else if (this.mVideoView.getCurrentState() < 0) {
            UmbrellaTracker.commitFailureStability("dataProcess", TAG, "1.0", "Page_Home", TAG, null, "url not correct", "");
            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView url error", "");
            ldf.d(TAG, "url not correct: cur url：" + this.mVideoView.getMediaPlayUrl() + ", target url:" + this.videoUrl + ", cur play state:" + this.mVideoView.getCurrentState() + " selfId:" + hashCode());
        } else {
            this.mVideoView.start();
            ldf.d(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.mVideoView.isPlaying() + "sectionBizCode:" + this.sectionBizCode);
            if (StringUtils.isEmpty(this.mVideoId)) {
                return;
            }
            this.mVideoView.registerOnStartListener(this.mOnStartListener);
            this.mVideoView.registerOnPauseListener(this.mOnPauseListener);
        }
    }

    private boolean checkNeedPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27e0399d", new Object[]{this})).booleanValue() : getVisibility() == 0 && this.mRecyclerViewStateReceiver.f17416a == 0;
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else if (!this.mVideoView.isPlaying()) {
        } else {
            ldf.d(TAG, "pause video:", this.sectionBizCode);
            this.mVideoView.pause();
        }
    }

    private static String getVideoFileRootPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c00032d1", new Object[0]);
        }
        return StorageUtils.getIndividualCacheDirectory(Globals.getApplication()).getAbsolutePath() + File.separator;
    }

    private static String getVideoFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3848e5c9", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String str2 = getVideoFileRootPath() + i.b(str);
        if (StringUtils.isEmpty(str2)) {
            ldf.d(TAG, "getVideoFilePath empty");
        }
        return str2;
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
        if (StringUtils.isEmpty(this.mScm) && (jSONObject = this.currentData) != null && (jSONObject2 = jSONObject.getJSONObject("args")) != null) {
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
        if (StringUtils.isEmpty(this.mItemID) && (jSONObject = this.currentData) != null) {
            Object a2 = lja.a("item.0.clickParam.itemId", jSONObject);
            if (a2 instanceof String) {
                this.mItemID = (String) a2;
            }
        }
        return this.mItemID;
    }

    private String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        this.mVideoId = "";
        JSONObject jSONObject = this.currentData;
        if (jSONObject != null && jSONObject.getJSONObject("item") != null && this.currentData.getJSONObject("item").getJSONObject("0") != null && this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("content") != null) {
            this.mVideoId = this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString(com.etao.feimagesearch.util.h.KEY_VIDEO_ID);
        }
        return this.mVideoId;
    }

    private static boolean newCanPlayVideo(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("708b530e", new Object[]{context})).booleanValue() : i.a(context);
    }

    /* loaded from: classes7.dex */
    public static class RecyclerViewStateReceiver extends AbsLocalBroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17416a;
        public IntentFilter b;
        private final WeakReference<HVideoView> c;

        static {
            kge.a(1737848400);
        }

        public RecyclerViewStateReceiver(HVideoView hVideoView) {
            super(hVideoView);
            this.f17416a = 0;
            this.b = new IntentFilter("recyclerViewState");
            this.c = new WeakReference<>(hVideoView);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            this.f17416a = intent.getIntExtra("recyclerViewState", 0);
            ldf.d(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: mCurrentRecyclerViewState" + this.f17416a);
            if (this.f17416a != 0) {
                return;
            }
            HVideoView hVideoView = this.c.get();
            if (hVideoView == null) {
                ldf.d(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: hVideo == null");
                c();
            } else if (!StringUtils.isEmpty(HVideoView.access$000(hVideoView)) && HVideoView.access$300(hVideoView).getCurrentState() == 0) {
                hVideoView.playVideo();
            }
            if (hVideoView == null) {
                return;
            }
            ldf.d(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: videoUrl:" + HVideoView.access$000(hVideoView) + " videoView.getCurrentState:" + HVideoView.access$300(hVideoView).getCurrentState());
        }

        @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.AbsLocalBroadcastReceiver
        public IntentFilter a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IntentFilter) ipChange.ipc$dispatch("1d6bc313", new Object[]{this}) : this.b;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (!this.mNeedAutoPlay) {
            return;
        }
        if (i == 0) {
            playVideo();
        } else {
            pauseVideo();
        }
    }

    public void setNeedAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aaa52", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedAutoPlay = z;
        }
    }
}

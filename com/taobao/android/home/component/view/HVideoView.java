package com.taobao.android.home.component.view;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.AbsLocalBroadcastReceiver;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.j;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.device.UTDevice;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import tb.fpr;
import tb.gmu;
import tb.keu;
import tb.kge;
import tb.ksz;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes5.dex */
public class HVideoView extends FrameLayout implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_PAUSE_VIDEO = "pause";
    public static final String EVENT_TYPE_PLAY_VIDEO = "play";
    public static final String EVENT_TYPE_RELEASE_VIDEO = "release";
    public static final String HAS_ENQUEUE_KEY = "enqueued";
    private static final String TAG = "HVideoView";
    private HImageView coverImageView;
    public JSONObject currentData;
    private boolean enableQueue;
    private int iconOffsetY;
    private int iconSize;
    private boolean isAttachedToWindow;
    private TUrlImageView ivPlayButton;
    private ImageView ivVideoVideoFakeBackground;
    private boolean mCanPlay;
    private Context mContext;
    private d mDownLoadVideoLoadListener;
    private String mItemID;
    private boolean mNeedAutoPlay;
    private TaoLiveVideoView.a mOnPauseListener;
    private TaoLiveVideoView.b mOnStartListener;
    private String mPlayId;
    private final BroadcastReceiver mReceiver;
    private final BroadcastReceiver mReceiver2;
    private RecyclerViewStateReceiver mRecyclerViewStateReceiver;
    private String mScm;
    private long mStartTime;
    private String mUserId;
    private String mUttId;
    private String mVideoId;
    public IMediaPlayer.OnCompletionListener onCompletionListener;
    private String sectionBizCode;
    public c statusListener;
    private TextView tvDurationTime;
    private String videoUrl;
    private TaoLiveVideoView videoView;
    private ImageView videoViewForeGroundImageView;

    /* loaded from: classes5.dex */
    public interface c {
        public static final int STATUS_DOWNLOAD_ERROR = 4;
        public static final int STATUS_DOWNLOAD_SUCCESS = 3;
        public static final int STATUS_PLAY_COMPLETE = 1;
        public static final int STATUS_PLAY_ERROR = 2;
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a();

        void a(String str);
    }

    static {
        kge.a(1610222931);
        kge.a(-1894394539);
    }

    private void callbackStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc6f125", new Object[]{this, new Integer(i)});
        }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ boolean access$000(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df6a347b", new Object[]{hVideoView})).booleanValue() : hVideoView.enableQueue;
    }

    public static /* synthetic */ void access$100(HVideoView hVideoView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e929a2d", new Object[]{hVideoView, new Integer(i)});
        } else {
            hVideoView.callbackStatus(i);
        }
    }

    public static /* synthetic */ long access$1000(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7847edc", new Object[]{hVideoView})).longValue() : hVideoView.mStartTime;
    }

    public static /* synthetic */ long access$1002(HVideoView hVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8433e6d2", new Object[]{hVideoView, new Long(j)})).longValue();
        }
        hVideoView.mStartTime = j;
        return j;
    }

    public static /* synthetic */ String access$1102(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("646e9e31", new Object[]{hVideoView, str});
        }
        hVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$1200(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6312783a", new Object[]{hVideoView}) : hVideoView.mUttId;
    }

    public static /* synthetic */ String access$1300(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96c0a2fb", new Object[]{hVideoView}) : hVideoView.getStartUtArgs();
    }

    public static /* synthetic */ String access$1400(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca6ecdbc", new Object[]{hVideoView}) : hVideoView.getEndUtArgs();
    }

    public static /* synthetic */ void access$200(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94462b5", new Object[]{hVideoView});
        } else {
            hVideoView.hideCoverImageView();
        }
    }

    public static /* synthetic */ String access$300(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87d8dd4c", new Object[]{hVideoView}) : hVideoView.videoUrl;
    }

    public static /* synthetic */ String access$400(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4654f9bb", new Object[]{str}) : getVideoFilePath(str);
    }

    public static /* synthetic */ TaoLiveVideoView access$500(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveVideoView) ipChange.ipc$dispatch("bea10576", new Object[]{hVideoView}) : hVideoView.videoView;
    }

    public static /* synthetic */ BroadcastReceiver access$600(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("111ba6e8", new Object[]{hVideoView}) : hVideoView.mReceiver;
    }

    public static /* synthetic */ BroadcastReceiver access$700(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("10423647", new Object[]{hVideoView}) : hVideoView.mReceiver2;
    }

    public static /* synthetic */ String access$800() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("502f6101", new Object[0]) : getVideoFileRootPath();
    }

    public static /* synthetic */ String access$900(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bdedddd2", new Object[]{hVideoView}) : hVideoView.mVideoId;
    }

    public HVideoView(Context context) {
        super(context);
        this.iconOffsetY = 0;
        this.iconSize = 0;
        this.mNeedAutoPlay = false;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.enableQueue = false;
        this.onCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.android.home.component.view.HVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                } else if (!HVideoView.access$000(HVideoView.this)) {
                } else {
                    HVideoView.this.release();
                    HVideoView.access$100(HVideoView.this, 1);
                }
            }
        };
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    HVideoView.this.pauseVideo();
                } else if (!"android.intent.action.USER_PRESENT".equals(action) || !HVideoView.this.isShown()) {
                } else {
                    e.e(HVideoView.TAG, "BroadcastReceiver onReceive intent action:" + action);
                    HVideoView.this.playVideo();
                }
            }
        };
        this.mReceiver2 = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                HVideoView.this.pauseVideo();
                try {
                    HVideoView.this.getContext().unregisterReceiver(HVideoView.access$600(HVideoView.this));
                } catch (Throwable unused) {
                }
                try {
                    context2.unregisterReceiver(HVideoView.access$700(HVideoView.this));
                } catch (Throwable unused2) {
                }
            }
        };
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.android.home.component.view.HVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    HVideoView.access$1002(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$1102(hVideoView, HVideoView.access$1200(HVideoView.this) + HVideoView.access$1000(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1300(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.android.home.component.view.HVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1400(HVideoView.this));
                }
            }
        };
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.iconOffsetY = 0;
        this.iconSize = 0;
        this.mNeedAutoPlay = false;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.enableQueue = false;
        this.onCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.android.home.component.view.HVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                } else if (!HVideoView.access$000(HVideoView.this)) {
                } else {
                    HVideoView.this.release();
                    HVideoView.access$100(HVideoView.this, 1);
                }
            }
        };
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    HVideoView.this.pauseVideo();
                } else if (!"android.intent.action.USER_PRESENT".equals(action) || !HVideoView.this.isShown()) {
                } else {
                    e.e(HVideoView.TAG, "BroadcastReceiver onReceive intent action:" + action);
                    HVideoView.this.playVideo();
                }
            }
        };
        this.mReceiver2 = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                HVideoView.this.pauseVideo();
                try {
                    HVideoView.this.getContext().unregisterReceiver(HVideoView.access$600(HVideoView.this));
                } catch (Throwable unused) {
                }
                try {
                    context2.unregisterReceiver(HVideoView.access$700(HVideoView.this));
                } catch (Throwable unused2) {
                }
            }
        };
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.android.home.component.view.HVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    HVideoView.access$1002(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$1102(hVideoView, HVideoView.access$1200(HVideoView.this) + HVideoView.access$1000(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1300(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.android.home.component.view.HVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1400(HVideoView.this));
                }
            }
        };
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iconOffsetY = 0;
        this.iconSize = 0;
        this.mNeedAutoPlay = false;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.enableQueue = false;
        this.onCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.android.home.component.view.HVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                } else if (!HVideoView.access$000(HVideoView.this)) {
                } else {
                    HVideoView.this.release();
                    HVideoView.access$100(HVideoView.this, 1);
                }
            }
        };
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    HVideoView.this.pauseVideo();
                } else if (!"android.intent.action.USER_PRESENT".equals(action) || !HVideoView.this.isShown()) {
                } else {
                    e.e(HVideoView.TAG, "BroadcastReceiver onReceive intent action:" + action);
                    HVideoView.this.playVideo();
                }
            }
        };
        this.mReceiver2 = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                HVideoView.this.pauseVideo();
                try {
                    HVideoView.this.getContext().unregisterReceiver(HVideoView.access$600(HVideoView.this));
                } catch (Throwable unused) {
                }
                try {
                    context2.unregisterReceiver(HVideoView.access$700(HVideoView.this));
                } catch (Throwable unused2) {
                }
            }
        };
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.android.home.component.view.HVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    HVideoView.access$1002(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$1102(hVideoView, HVideoView.access$1200(HVideoView.this) + HVideoView.access$1000(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1300(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.android.home.component.view.HVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1400(HVideoView.this));
                }
            }
        };
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.iconOffsetY = 0;
        this.iconSize = 0;
        this.mNeedAutoPlay = false;
        this.mCanPlay = true;
        this.mVideoId = "";
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mStartTime = 0L;
        this.mScm = "";
        this.mItemID = "";
        this.mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
        this.enableQueue = false;
        this.onCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.android.home.component.view.HVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                } else if (!HVideoView.access$000(HVideoView.this)) {
                } else {
                    HVideoView.this.release();
                    HVideoView.access$100(HVideoView.this, 1);
                }
            }
        };
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    HVideoView.this.pauseVideo();
                } else if (!"android.intent.action.USER_PRESENT".equals(action) || !HVideoView.this.isShown()) {
                } else {
                    e.e(HVideoView.TAG, "BroadcastReceiver onReceive intent action:" + action);
                    HVideoView.this.playVideo();
                }
            }
        };
        this.mReceiver2 = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                HVideoView.this.pauseVideo();
                try {
                    HVideoView.this.getContext().unregisterReceiver(HVideoView.access$600(HVideoView.this));
                } catch (Throwable unused) {
                }
                try {
                    context2.unregisterReceiver(HVideoView.access$700(HVideoView.this));
                } catch (Throwable unused2) {
                }
            }
        };
        this.mOnStartListener = new TaoLiveVideoView.b() { // from class: com.taobao.android.home.component.view.HVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    HVideoView.access$1002(HVideoView.this, System.currentTimeMillis());
                    HVideoView hVideoView = HVideoView.this;
                    HVideoView.access$1102(hVideoView, HVideoView.access$1200(HVideoView.this) + HVideoView.access$1000(HVideoView.this));
                    TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1300(HVideoView.this));
                }
            }
        };
        this.mOnPauseListener = new TaoLiveVideoView.a() { // from class: com.taobao.android.home.component.view.HVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (StringUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                } else {
                    TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1400(HVideoView.this));
                }
            }
        };
        init(context);
    }

    public void setEnableQueue(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8fdf21", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enableQueue = z;
        if (z) {
            this.videoView.setLooping(false);
            this.videoView.setOnCompletionListener(this.onCompletionListener);
            return;
        }
        this.videoView.setLooping(true);
        this.videoView.setOnCompletionListener(null);
    }

    public void canPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609d7e89", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
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
        if (this.enableQueue) {
            return;
        }
        if (j.k() && !this.mNeedAutoPlay) {
            return;
        }
        if (i == 0) {
            e.e(TAG, "onWindowVisibilityChanged visible playVideo selfId:" + hashCode() + " localPath:" + this.videoUrl);
            playVideo();
            return;
        }
        pauseVideo();
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
        if (this.enableQueue) {
            return;
        }
        this.videoView.setRenderType(2);
        try {
            getContext().unregisterReceiver(this.mReceiver);
        } catch (Throwable unused) {
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            getContext().registerReceiver(this.mReceiver, intentFilter);
        } catch (Throwable unused2) {
        }
        try {
            getContext().unregisterReceiver(this.mReceiver2);
        } catch (Throwable unused3) {
        }
        try {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(h.ACTION_ACTIVITY_STOP);
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.mReceiver2, intentFilter2);
        } catch (Throwable unused4) {
        }
        e.e(TAG, "onAttachedToWindow playVideo  selfId:" + hashCode() + " localPath:" + this.videoUrl);
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
        if (this.enableQueue) {
            return;
        }
        try {
            getContext().unregisterReceiver(this.mReceiver);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this.mReceiver2);
        } catch (Throwable unused2) {
        }
        if (j.a("showCoverImageViewDetachWindow", true)) {
            showCoverImageView();
        }
        this.videoView.release();
        this.mVideoId = "";
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        try {
            ((Application) this.mContext.getApplicationContext()).registerActivityLifecycleCallbacks(new gmu(this.mContext, this.videoView));
        } catch (Throwable unused) {
        }
        this.videoView = new TaoLiveVideoView(getContext());
        this.coverImageView = new HImageView(getContext());
        this.videoViewForeGroundImageView = new ImageView(getContext());
        this.ivVideoVideoFakeBackground = new ImageView(getContext());
        if (j.k()) {
            this.coverImageView.setWhenNullClearImg(true);
        }
        View view = null;
        if (this.videoView instanceof ViewGroup) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.homepage_video_view_extend, (ViewGroup) this.videoView, false);
        }
        this.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.videoViewForeGroundImageView.setImageResource(R.color.video_view_white_overlay);
        this.ivVideoVideoFakeBackground.setImageResource(17170443);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.videoView, 0, layoutParams);
        addView(this.ivVideoVideoFakeBackground, 1, layoutParams);
        addView(this.videoViewForeGroundImageView, 2, layoutParams);
        addView(this.coverImageView, 3, layoutParams);
        addView(view, 4, layoutParams);
        this.videoView.setMuted(true);
        com.taobao.taobaoavsdk.widget.media.c cVar = new com.taobao.taobaoavsdk.widget.media.c("HomePage");
        cVar.b = 2;
        cVar.c = 2;
        cVar.d = 0;
        this.videoView.initConfig(cVar);
        this.videoView.setLooping(true);
        this.videoView.disableAutoPlayForBackground();
        setControlParams(this.videoView);
        this.videoView.registerOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: com.taobao.android.home.component.view.HVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                HVideoView.this.showCoverImageView();
                HVideoView.this.pauseVideo();
                e.e(HVideoView.TAG, "videoView OnErrorListener", "" + i);
                HVideoView.access$100(HVideoView.this, 2);
                return false;
            }
        });
        this.videoView.registerOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.taobao.android.home.component.view.HVideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (((int) j) == 3) {
                    if (!HVideoView.access$000(HVideoView.this)) {
                        boolean z = iMediaPlayer instanceof MonitorMediaPlayer;
                        String playUrl = z ? ((MonitorMediaPlayer) iMediaPlayer).getPlayUrl() : "";
                        String access$400 = HVideoView.access$400(HVideoView.access$300(HVideoView.this));
                        e.e(HVideoView.TAG, "HVideoView start play. selfId:" + hashCode() + ", playUrl=" + playUrl + ", localPathUrl=" + access$400 + ", videoUrl=" + HVideoView.access$300(HVideoView.this));
                        if (j.k() && z && !StringUtils.equals(playUrl, access$400)) {
                            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView path error", "");
                            try {
                                HVideoView.access$500(HVideoView.this).pause();
                                e.e(HVideoView.TAG, "selfId:" + hashCode() + ",path error: expect:url:" + HVideoView.access$300(HVideoView.this) + "，actualUrl:" + HVideoView.access$500(HVideoView.this).getMediaPlayUrl() + ",data:" + JSON.toJSONString(iMediaPlayer));
                            } catch (Throwable th) {
                                e.a(HVideoView.TAG, "HVideoView pause error", th);
                            }
                        } else if (!j.a("immediatelyHideCoverViewEnable", true)) {
                            HVideoView.this.postDelayed(new Runnable() { // from class: com.taobao.android.home.component.view.HVideoView.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        HVideoView.access$200(HVideoView.this);
                                    }
                                }
                            }, 1200L);
                        }
                    }
                    HVideoView.access$200(HVideoView.this);
                }
                return true;
            }
        });
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

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        if (this.enableQueue && !StringUtils.isEmpty(str)) {
            showCoverImageView();
        }
        this.coverImageView.setImageUrl(str);
    }

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
        e.e(TAG, "setVideoUrl. selfId:" + hashCode() + ", videoUrl=" + this.videoUrl + str2);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        if (this.enableQueue) {
            showCoverImageView();
        }
        this.videoView.release();
    }

    public void setDurationTime(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5469ae", new Object[]{this, charSequence});
            return;
        }
        this.tvDurationTime = (TextView) findViewById(R.id.tv_duration);
        TextView textView = this.tvDurationTime;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void updateData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d03316", new Object[]{this, jSONObject});
            return;
        }
        this.currentData = jSONObject;
        this.sectionBizCode = jSONObject == null ? "" : jSONObject.getString("sectionBizCode");
        this.mVideoId = getVideoId();
        e.e(TAG, "updateData. currentData = " + getCurrentData());
    }

    public void registerVideoStatusListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcd15ca", new Object[]{this, cVar});
        } else {
            this.statusListener = cVar;
        }
    }

    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        this.ivPlayButton = (TUrlImageView) findViewById(R.id.iv_play_btn);
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(str);
    }

    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
            return;
        }
        if (this.ivPlayButton == null) {
            this.ivPlayButton = (TUrlImageView) findViewById(R.id.iv_play_btn);
        }
        if (!StringUtils.isEmpty(str)) {
            this.iconOffsetY = fpr.a(getContext(), str, 0);
        } else {
            this.iconOffsetY = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ivPlayButton.getLayoutParams();
        layoutParams.topMargin = this.iconOffsetY;
        this.ivPlayButton.setLayoutParams(layoutParams);
    }

    public void setIconSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
            return;
        }
        if (this.ivPlayButton == null) {
            this.ivPlayButton = (TUrlImageView) findViewById(R.id.iv_play_btn);
        }
        if (this.ivPlayButton == null || StringUtils.isEmpty(str)) {
            return;
        }
        this.iconSize = fpr.a(getContext(), str, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ivPlayButton.getLayoutParams();
        int i = this.iconSize;
        layoutParams.width = i;
        layoutParams.height = i;
        this.ivPlayButton.setLayoutParams(layoutParams);
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        this.videoView.setVisibility(8);
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        }
        ImageView imageView = this.videoViewForeGroundImageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.ivVideoVideoFakeBackground;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        HImageView hImageView = this.coverImageView;
        if (hImageView != null) {
            hImageView.setVisibility(0);
        }
        e.e(TAG, "show CoverImage:", this.sectionBizCode);
    }

    private void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        this.videoView.setVisibility(0);
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
        ImageView imageView = this.videoViewForeGroundImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.ivVideoVideoFakeBackground;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        HImageView hImageView = this.coverImageView;
        if (hImageView != null) {
            hImageView.setVisibility(8);
        }
        e.e(TAG, "hide CoverImage:", this.sectionBizCode);
    }

    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.videoView.setAspectRatio(i);
        }
    }

    public void setCoverScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
        } else {
            this.coverImageView.setScaleType(scaleType);
        }
    }

    public void setCoverBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i)});
        } else {
            this.coverImageView.setBackgroundColor(i);
        }
    }

    public void setVideoViewForeGroundBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f9ff", new Object[]{this, new Integer(i)});
        } else {
            this.videoViewForeGroundImageView.setImageResource(i);
        }
    }

    public void setIvVideoVideoFakeBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i)});
        } else {
            this.ivVideoVideoFakeBackground.setImageResource(i);
        }
    }

    public void setCoverImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
        } else {
            this.coverImageView.setImageDrawable(drawable);
        }
    }

    public void playVideo() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        if (this.enableQueue && (jSONObject = this.currentData) != null) {
            String string = jSONObject.getString("enqueued");
            if (this.enableQueue && StringUtils.isEmpty(string)) {
                callbackStatus(2);
                return;
            }
        }
        boolean newCanPlayVideo = newCanPlayVideo(getContext());
        e.e(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " videoUrl:" + this.videoUrl);
        if (!this.mCanPlay || StringUtils.isEmpty(this.videoUrl) || !newCanPlayVideo) {
            showCoverImageView();
            this.videoView.release();
            this.videoView.setTag("");
            e.e(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " status_play_error videoUrl:" + this.videoUrl);
            callbackStatus(2);
        } else if (!this.isAttachedToWindow) {
            callbackStatus(2);
            e.e(TAG, "playVideo  selfId:" + hashCode() + " isAttachedToWindow: false status_play_error videoUrl:" + this.videoUrl);
        } else {
            boolean k = j.k();
            String a2 = b.a().a(this.videoUrl);
            String mediaPlayUrl = this.videoView.getMediaPlayUrl();
            if (this.videoView.isPlaying()) {
                if (!isForcePause() || StringUtils.equals(a2, mediaPlayUrl)) {
                    e.e(TAG, "playVideo  selfId:" + hashCode() + " 当前videoView isPlaying videoUrl:" + this.videoUrl);
                    return;
                }
                this.videoView.pause();
            }
            if (a2 != null) {
                e.e(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + a2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (!StringUtils.equals(mediaPlayUrl, a2)) {
                    this.videoView.release();
                    this.videoView.setVideoPath(a2);
                    if (k && !checkNeedPlay()) {
                        showCoverImageView();
                        e.e(TAG, "playVideo selfId:" + hashCode() + " enableVideoScrollControl: false; checkNeedPlay: false; lastPath:" + mediaPlayUrl + " localPath: " + a2 + " videoUrl:" + this.videoUrl);
                        return;
                    }
                }
                e.e(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + a2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (isForcePause()) {
                    if (!StringUtils.equals(a2, this.videoView.getMediaPlayUrl())) {
                        return;
                    }
                    innerPlayVideo();
                    return;
                } else if (this.videoView.isPlaying() || !StringUtils.equals(a2, this.videoView.getMediaPlayUrl())) {
                    return;
                } else {
                    innerPlayVideo();
                    return;
                }
            }
            showCoverImageView();
            e.e(TAG, "playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.videoView.isPlaying());
            this.mDownLoadVideoLoadListener = new d() { // from class: com.taobao.android.home.component.view.HVideoView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public JSONObject f12741a;

                {
                    this.f12741a = HVideoView.this.currentData;
                }

                @Override // com.taobao.android.home.component.view.HVideoView.d
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    e.e(HVideoView.TAG, "downLoadFinish playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + HVideoView.access$300(HVideoView.this) + " downLoadUrl:" + str);
                    if (this.f12741a != HVideoView.this.currentData || !StringUtils.equals(HVideoView.access$300(HVideoView.this), str)) {
                        return;
                    }
                    e.e(HVideoView.TAG, "downLoadFinish playVideo  data == currentData;");
                    HVideoView.this.playVideo();
                    HVideoView.access$100(HVideoView.this, 3);
                }

                @Override // com.taobao.android.home.component.view.HVideoView.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    e.e(HVideoView.TAG, "HVideoView video download 失败");
                    HVideoView.access$100(HVideoView.this, 4);
                }
            };
            b.a().a(this.videoUrl, this.mDownLoadVideoLoadListener);
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
        } else if (this.videoView.getCurrentState() < 0) {
            UmbrellaTracker.commitFailureStability("dataProcess", TAG, "1.0", "Page_Home", TAG, null, "url not correct", "");
            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView url error", "");
            e.e(TAG, "url not correct: cur url：" + this.videoView.getMediaPlayUrl() + ", target url:" + this.videoUrl + ", cur play state:" + this.videoView.getCurrentState() + " selfId:" + hashCode());
        } else {
            this.videoView.setVisibility(0);
            this.videoView.start();
            e.e(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.videoView.isPlaying() + "sectionBizCode:" + this.sectionBizCode);
            if (StringUtils.isEmpty(this.mVideoId)) {
                return;
            }
            this.videoView.registerOnStartListener(this.mOnStartListener);
            this.videoView.registerOnPauseListener(this.mOnPauseListener);
        }
    }

    private boolean checkNeedPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27e0399d", new Object[]{this})).booleanValue() : getVisibility() == 0 && this.mRecyclerViewStateReceiver.f12746a == 0;
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        if (this.enableQueue) {
            showCoverImageView();
        }
        if (!this.videoView.isPlaying()) {
            return;
        }
        e.e(TAG, "pause video:", this.sectionBizCode);
        this.videoView.pause();
    }

    private static String getVideoFileRootPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c00032d1", new Object[0]);
        }
        if (j.k()) {
            return StorageUtils.getIndividualCacheDirectory(Globals.getApplication()).getAbsolutePath() + File.separator;
        }
        try {
            String absolutePath = Globals.getApplication().getExternalCacheDir().getAbsolutePath();
            if (!StringUtils.isEmpty(absolutePath)) {
                return absolutePath + "/recommend/";
            }
        } catch (Throwable unused) {
        }
        String a2 = com.taobao.android.home.component.utils.d.a(Globals.getApplication());
        return a2 + "/recommendVideo/";
    }

    private static String getVideoFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3848e5c9", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String str2 = getVideoFileRootPath() + i.a(str);
        if (StringUtils.isEmpty(str2)) {
            e.e(TAG, "getVideoFilePath empty");
        }
        return str2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        if (this.mContext != activity) {
            if (!StringUtils.equals(TBMainHost.a().getSimpleName(), activity.getLocalClassName())) {
                return;
            }
            Context context = this.mContext;
            if (context != context.getApplicationContext()) {
                return;
            }
        }
        this.videoView.release();
        try {
            ((Application) this.mContext.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        } catch (Throwable unused) {
        }
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f12748a;
        private Set<String> b = new HashSet();
        private a c;

        static {
            kge.a(564613763);
        }

        private b() {
        }

        public static b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f1b0ba68", new Object[0]);
            }
            if (f12748a == null) {
                f12748a = new b();
            }
            return f12748a;
        }

        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            String access$400 = HVideoView.access$400(str);
            if (!new File(access$400).exists()) {
                return null;
            }
            this.b.remove(str);
            return access$400;
        }

        public void a(String str, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("776d021c", new Object[]{this, str, dVar});
            } else if (this.b.add(str)) {
                this.c = new a(dVar, str);
                this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            } else {
                a aVar = this.c;
                if (aVar == null || aVar.getStatus() != AsyncTask.Status.FINISHED || dVar == null) {
                    return;
                }
                dVar.a();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends AsyncTask<String, Void, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<d> f12747a;
        private String b;

        static {
            kge.a(-1335491641);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Boolean doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, bool});
            } else {
                a(bool);
            }
        }

        public a(d dVar, String str) {
            this.f12747a = new WeakReference<>(dVar);
            this.b = str;
        }

        public Boolean a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("af9a174", new Object[]{this, strArr});
            }
            Response syncSend = new DegradableNetwork(null).syncSend(new RequestImpl(this.b), null);
            if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
                try {
                    String access$400 = HVideoView.access$400(this.b);
                    boolean a2 = com.taobao.android.home.component.utils.d.a(access$400, syncSend.getBytedata());
                    e.e(HVideoView.TAG, "DownloadVideoTask downLoadVideo saveResult:" + a2 + " isEnableHVideoViewOptimise:" + j.k() + " filePath:" + access$400 + " success; url:" + this.b);
                    if (!j.k()) {
                        com.taobao.android.trade.template.db.b bVar = new com.taobao.android.trade.template.db.b(Globals.getApplication(), new File(HVideoView.access$800()), "video", 20971520L);
                        if (a2) {
                            bVar.a(access$400, new File(access$400));
                        }
                    } else if (!a2) {
                        File file = new File(access$400);
                        if (file.exists()) {
                            e.e(HVideoView.TAG, "DownloadVideoTask", "ErrorDownloadFile");
                            TBS.Ext.commitEvent("Page_Home", 19999, "ErrorDownloadFile", "");
                            file.delete();
                        }
                    }
                    return Boolean.valueOf(a2);
                } catch (Throwable th) {
                    e.a(HVideoView.TAG, "DownloadVideoTask", th);
                }
            }
            return false;
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                return;
            }
            super.onPostExecute(bool);
            e.e(HVideoView.TAG, "DownloadVideoTask onPostExecute ret:" + bool + "  url:" + this.b);
            d dVar = this.f12747a.get();
            if (dVar == null) {
                e.e(HVideoView.TAG, "DownloadVideoTask listener is null");
            } else if (bool.booleanValue()) {
                dVar.a(this.b);
            } else {
                dVar.a();
            }
        }
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
        if (StringUtils.isEmpty(this.mItemID) && (jSONObject = this.currentData) != null && jSONObject.getJSONObject("item") != null && this.currentData.getJSONObject("item").getJSONObject("0") != null && this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") != null) {
            this.mItemID = this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
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
        com.taobao.global.setting.c a2;
        ksz b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("708b530e", new Object[]{context})).booleanValue();
        }
        if (j.a(context) && (a2 = com.taobao.global.setting.c.a(context, "homepage")) != null && (b2 = a2.b()) != null) {
            return b2.a(context);
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public static class RecyclerViewStateReceiver extends AbsLocalBroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12746a;
        public IntentFilter b;
        private final WeakReference<HVideoView> c;

        static {
            kge.a(-1889571765);
        }

        public RecyclerViewStateReceiver(HVideoView hVideoView) {
            super(hVideoView);
            this.f12746a = 0;
            this.b = new IntentFilter("recyclerViewState");
            this.c = new WeakReference<>(hVideoView);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!j.k()) {
            } else {
                this.f12746a = intent.getIntExtra("recyclerViewState", 0);
                e.e(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: mCurrentRecyclerViewState" + this.f12746a);
                if (this.f12746a != 0) {
                    return;
                }
                HVideoView hVideoView = this.c.get();
                if (hVideoView == null) {
                    e.e(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: hVideo == null");
                    b();
                } else if (!StringUtils.isEmpty(HVideoView.access$300(hVideoView)) && HVideoView.access$500(hVideoView).getCurrentState() == 0) {
                    hVideoView.playVideo();
                }
                if (hVideoView == null) {
                    return;
                }
                e.e(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: videoUrl:" + HVideoView.access$300(hVideoView) + " videoView.getCurrentState:" + HVideoView.access$500(hVideoView).getCurrentState());
            }
        }

        @Override // com.taobao.android.home.component.utils.AbsLocalBroadcastReceiver
        public IntentFilter c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IntentFilter) ipChange.ipc$dispatch("97ab4b51", new Object[]{this}) : this.b;
        }
    }

    private boolean isForcePause() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b2ff4a0", new Object[]{this})).booleanValue() : Boolean.parseBoolean(j.a("hVideoViewForcePause", "true"));
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

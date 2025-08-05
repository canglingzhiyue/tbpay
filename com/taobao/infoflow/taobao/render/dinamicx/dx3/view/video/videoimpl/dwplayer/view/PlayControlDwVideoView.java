package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.dwplayer.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.bl;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.g;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.i;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.ldk;
import tb.ldl;
import tb.lja;
import tb.lme;
import tb.lmf;
import tb.lmg;
import tb.sku;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class PlayControlDwVideoView extends FrameLayout implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DwPlayControlVideoView";
    public static final String VIDEO_COUNT_MAIN_BIZ = "Page_Home_VideoPlayer_Count";
    public static final String VIDEO_FEATURE_TYPE = "video";
    public static final String VIDEO_MAIN_BIZ = "Page_Home_VideoPlayer";
    private static final String VIDEO_PLAY_FROM = "recmd";
    private static final String VIDEO_SUFFIX = ".mp4";
    private boolean isNeedSetWidthAndHeight;
    public boolean isPlayByVideoInfo;
    private boolean mCanPlay;
    private JSONObject mCurrentData;
    private boolean mIsAttachedToWindow;
    private String mItemId;
    private long mMediaStartTime;
    private boolean mOnFirstFrame;
    private String mPlayId;
    private long mPlayStartTime;
    private long mPlayerCreateTime;
    private String mScm;
    private String mSectionBizCode;
    private g mStatusListener;
    private final String mUserId;
    private final String mUttId;
    private String mVideoId;
    private lmf mVideoUIController;
    private String mVideoUrl;
    private bl mVideoView;
    private String videoPlayInfo;

    static {
        kge.a(282933575);
        kge.a(-322278169);
    }

    public static /* synthetic */ Object ipc$super(PlayControlDwVideoView playControlDwVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
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

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ long access$000(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("890e55f3", new Object[]{playControlDwVideoView})).longValue() : playControlDwVideoView.mMediaStartTime;
    }

    public static /* synthetic */ long access$002(PlayControlDwVideoView playControlDwVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4d53457", new Object[]{playControlDwVideoView, new Long(j)})).longValue();
        }
        playControlDwVideoView.mMediaStartTime = j;
        return j;
    }

    public static /* synthetic */ void access$1000(PlayControlDwVideoView playControlDwVideoView, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52fd157", new Object[]{playControlDwVideoView, map});
        } else {
            playControlDwVideoView.addVideoPlayStyleParams(map);
        }
    }

    public static /* synthetic */ String access$102(PlayControlDwVideoView playControlDwVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df89d454", new Object[]{playControlDwVideoView, str});
        }
        playControlDwVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$1100(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa90ce11", new Object[]{playControlDwVideoView}) : playControlDwVideoView.mVideoUrl;
    }

    public static /* synthetic */ String access$200(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a38e9cbf", new Object[]{playControlDwVideoView}) : playControlDwVideoView.mUttId;
    }

    public static /* synthetic */ String access$300(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("37adacde", new Object[]{playControlDwVideoView}) : playControlDwVideoView.mVideoId;
    }

    public static /* synthetic */ String access$400(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cbccbcfd", new Object[]{playControlDwVideoView}) : playControlDwVideoView.getStartUtArgs();
    }

    public static /* synthetic */ long access$500(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6baff8", new Object[]{playControlDwVideoView})).longValue() : playControlDwVideoView.mPlayerCreateTime;
    }

    public static /* synthetic */ String access$600(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f40add3b", new Object[]{playControlDwVideoView}) : playControlDwVideoView.getItemID();
    }

    public static /* synthetic */ void access$700(PlayControlDwVideoView playControlDwVideoView, int i, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc02a3", new Object[]{playControlDwVideoView, new Integer(i), str, str2, new Boolean(z)});
        } else {
            playControlDwVideoView.callbackStatus(i, str, str2, z);
        }
    }

    public static /* synthetic */ boolean access$802(PlayControlDwVideoView playControlDwVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("921ee16f", new Object[]{playControlDwVideoView, new Boolean(z)})).booleanValue();
        }
        playControlDwVideoView.mOnFirstFrame = z;
        return z;
    }

    public static /* synthetic */ long access$900(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d84ff7fc", new Object[]{playControlDwVideoView})).longValue() : playControlDwVideoView.mPlayStartTime;
    }

    public PlayControlDwVideoView(Context context) {
        super(context);
        this.videoPlayInfo = null;
        this.mVideoId = null;
        this.mOnFirstFrame = false;
        this.isNeedSetWidthAndHeight = false;
        this.mCanPlay = true;
        this.mUttId = UTDevice.getUtdid(Globals.getApplication());
        this.mPlayId = "";
        this.mUserId = Login.getOldUserId();
        this.mMediaStartTime = 0L;
        this.mPlayStartTime = 0L;
        this.mPlayerCreateTime = 0L;
        this.mScm = "";
        this.mItemId = "";
        this.isPlayByVideoInfo = false;
    }

    public void init(Context context, boolean z, DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7471ca84", new Object[]{this, context, new Boolean(z), dWAspectRatio});
            return;
        }
        initView(context, dWAspectRatio);
        initVideoConfig(z);
        registerListeners(context);
    }

    private void initView(Context context, DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf89db5b", new Object[]{this, context, dWAspectRatio});
            return;
        }
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            ldk.a("video", "video_acInitError", "", "Page_Home_VideoPlayer_Count", "", null);
            return;
        }
        bl.a aVar = new bl.a(activityFromContext);
        String str = this.videoPlayInfo;
        if (str == null || str.isEmpty()) {
            aVar.d(sku.VALUE_TB_VIDEO_URL);
            aVar.a(this.mVideoUrl);
            aVar.b((String) null);
            aVar.a((org.json.JSONObject) null);
            this.isPlayByVideoInfo = false;
        } else {
            aVar.d("TBVideo");
            aVar.b(this.mVideoId);
            try {
                if (this.videoPlayInfo != null && !this.videoPlayInfo.isEmpty()) {
                    aVar.a(new org.json.JSONObject(this.videoPlayInfo));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.isPlayByVideoInfo = true;
        }
        aVar.n(true);
        aVar.g(true);
        aVar.e(false);
        aVar.d(true);
        aVar.f("recmd");
        aVar.k("cnxh");
        aVar.a(dWAspectRatio);
        this.mVideoView = aVar.c();
        this.mPlayerCreateTime = System.currentTimeMillis();
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar != null) {
            lmfVar.c();
        }
        this.mVideoUIController = new lmf(context, this, this.mVideoView, this.isPlayByVideoInfo);
        this.isNeedSetWidthAndHeight = true;
    }

    private void initVideoConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5f06e0", new Object[]{this, new Boolean(z)});
            return;
        }
        bl blVar = this.mVideoView;
        if (blVar == null) {
            return;
        }
        blVar.a(z);
        if (!ldj.a("enableVideoScreenSleep", true)) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
        this.mVideoView.f(hashMap);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        bl blVar = this.mVideoView;
        if (blVar == null || !this.isNeedSetWidthAndHeight) {
            return;
        }
        this.isNeedSetWidthAndHeight = false;
        blVar.a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* loaded from: classes7.dex */
    public final class a implements aw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-529869024);
            kge.a(-123403623);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        private a() {
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            PlayControlDwVideoView.access$002(PlayControlDwVideoView.this, System.currentTimeMillis());
            PlayControlDwVideoView playControlDwVideoView = PlayControlDwVideoView.this;
            PlayControlDwVideoView.access$102(playControlDwVideoView, PlayControlDwVideoView.access$200(PlayControlDwVideoView.this) + PlayControlDwVideoView.access$000(PlayControlDwVideoView.this));
            ldl.a("cnxh_special", 12002, PlayControlDwVideoView.access$300(PlayControlDwVideoView.this), null, null, PlayControlDwVideoView.access$400(PlayControlDwVideoView.this));
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", "dwplayer");
            ldk.a("video", "video_mediaStartPlay", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                PlayControlDwVideoView.this.pauseVideo();
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlDwVideoView.access$500(PlayControlDwVideoView.this)));
            hashMap.put("player_type", "dwplayer");
            ldk.a("video", "video_playerPreparedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            PlayControlDwVideoView.this.showCoverImageView();
            PlayControlDwVideoView.this.pauseVideo();
            PlayControlDwVideoView.access$700(PlayControlDwVideoView.this, 2, "player_play_error", "播放错误：, itemID:" + PlayControlDwVideoView.access$600(PlayControlDwVideoView.this) + ", what:" + i + ", extra:" + i2 + ", videoID:" + PlayControlDwVideoView.access$300(PlayControlDwVideoView.this), true);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            } else if (j != 3) {
            } else {
                PlayControlDwVideoView.access$802(PlayControlDwVideoView.this, true);
                PlayControlDwVideoView.this.hideCoverImageView();
                ldk.a("video", "video_firstFrameRendered", "", "Page_Home_VideoPlayer_Count", "", null);
                HashMap hashMap = new HashMap(2);
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlDwVideoView.access$900(PlayControlDwVideoView.this)));
                hashMap.put("player_type", "dwplayer");
                PlayControlDwVideoView.access$1000(PlayControlDwVideoView.this, hashMap);
                ldk.a("video", "video_playerFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlDwVideoView.access$000(PlayControlDwVideoView.this)));
                hashMap2.put("player_type", "dwplayer");
                ldk.a("video", "video_startMediaPlayCost", "", "Page_Home_VideoPlayer_Count", "", hashMap2);
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            PlayControlDwVideoView.this.stopVideo();
            PlayControlDwVideoView.access$700(PlayControlDwVideoView.this, 1, "play_complete", "播放完毕, itemId : " + PlayControlDwVideoView.access$600(PlayControlDwVideoView.this) + ", VideoUrl : " + PlayControlDwVideoView.access$1100(PlayControlDwVideoView.this), true);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                ldf.d(PlayControlDwVideoView.TAG, "onVideoClose");
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            ldf.d(PlayControlDwVideoView.TAG, "onVideoProgressChanged");
            if (i2 + 1 >= i3) {
                lme.a().c(PlayControlDwVideoView.this.getContext());
            } else {
                lme.a().a(PlayControlDwVideoView.this.getContext());
            }
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
        if (this.mVideoId != null && this.mVideoUrl != null) {
            lme.a().a(getContext(), new lmg(this.mVideoUrl, this.mVideoId));
        }
        this.videoPlayInfo = null;
        this.mVideoId = null;
        callbackStatus(7, null, null, true);
    }

    private void registerListeners(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60f8fc5", new Object[]{this, context});
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.a(context, this.mVideoView));
        bl blVar = this.mVideoView;
        if (blVar == null) {
            return;
        }
        blVar.a(new a());
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
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.d(str);
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
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.mVideoId = str;
        }
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d
    public void setVideoPlayInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f1ceac", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.videoPlayInfo = str;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mOnFirstFrame = false;
        bl blVar = this.mVideoView;
        if (blVar == null) {
            return;
        }
        blVar.m();
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setDurationTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f4be54", new Object[]{this, str});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.e(str);
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
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        bl blVar = this.mVideoView;
        if (blVar == null) {
            return;
        }
        blVar.e(i);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.a(str);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.b(str);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setIconSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.c(str);
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            ldf.d(TAG, "UIControl为空: showCoverImageView Failed");
            return;
        }
        lmfVar.a();
        ldf.d(TAG, "show CoverImage:", this.mSectionBizCode);
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            ldf.d(TAG, "UIControl为空: hideCoverImageView Failed");
            return;
        }
        lmfVar.b();
        ldf.d(TAG, "hide CoverImage:", this.mSectionBizCode);
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.c
    public void setCoverScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.a(scaleType);
    }

    public void setCoverBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i)});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.a(i);
    }

    public void setVideoViewForeGroundBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f9ff", new Object[]{this, new Integer(i)});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.b(i);
    }

    public void setIvVideoVideoFakeBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i)});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.c(i);
    }

    public void setCoverImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
            return;
        }
        lmf lmfVar = this.mVideoUIController;
        if (lmfVar == null) {
            return;
        }
        lmfVar.a(drawable);
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        if (i.a(this.mVideoView)) {
            this.mVideoView.f();
        }
        showCoverImageView();
        callbackStatus(5, null, null, true);
        ldl.a("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, this.mVideoId, null, null, getEndUtArgs());
    }

    @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.b
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (this.mVideoView == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", "dwplayer");
            hashMap.put("msg", "videoView为空");
            ldk.a("video", "video_buildError", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        } else if (!checkPlayEnable()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("player_type", "dwplayer");
            hashMap2.put("msg", "checkPlayEnable false");
            ldk.a("video", "video_buildError", "", "Page_Home_VideoPlayer_Count", "", hashMap2);
        } else if (!this.mIsAttachedToWindow) {
            callbackStatus(2, "view_not_attach_to_window", "播放失败， mIsAttachedToWindow:false, itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
        } else if (i.a(this.mVideoView)) {
            callbackStatus(2, "video_is_playing", "播放失败， mVideoView.isPlaying(), itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
        } else {
            ldf.d(TAG, "playVideo  selfId:" + hashCode() + " videoID:" + this.mVideoId);
            innerPlayVideo();
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

    private boolean checkPlayEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67e06a0a", new Object[]{this})).booleanValue();
        }
        boolean a2 = i.a(getContext());
        if (this.mCanPlay && ((!TextUtils.isEmpty(this.mVideoUrl) || !TextUtils.isEmpty(this.videoPlayInfo)) && a2)) {
            return true;
        }
        showCoverImageView();
        this.mVideoView.g();
        callbackStatus(2, "business_logic_validation_failed", "mCanPlay：" + this.mCanPlay + ",playEnable: " + a2 + ",mVideoUrl: " + this.mVideoUrl, true);
        return false;
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
            return;
        }
        bl blVar = this.mVideoView;
        if (blVar == null) {
            return;
        }
        if (blVar.i() < 0) {
            UmbrellaTracker.commitFailureStability("dataProcess", TAG, "1.0", "Page_Home_VideoPlayer", TAG, null, "url not correct", "");
            ldl.a("Page_Home", 19999, "HVideoView url error", "", "", "");
            ldf.d(TAG, "url not correct: cur url：, target url:" + this.mVideoUrl + ", cur play state:" + this.mVideoView.i() + " selfId:" + hashCode());
            return;
        }
        this.mPlayStartTime = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("player_type", "dwplayer");
        addVideoPlayStyleParams(hashMap);
        ldk.a("video", "video_startPlay", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        if (i.b(this.mVideoView)) {
            this.mVideoView.e();
        } else {
            this.mVideoView.c();
        }
        callbackStatus(6, null, null, true);
        if (this.mOnFirstFrame) {
            hideCoverImageView();
        }
        ldf.d(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.mVideoUrl + "video isPlaying:" + i.a(this.mVideoView) + "sectionBizCode:" + this.mSectionBizCode);
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
        return "userId=" + this.mUserId + "," + b.PROPERTY_VIDEO_ID + "=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",scm=" + getScm() + ",item_id=" + getItemID();
    }

    private String getEndUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d81fb78", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mMediaStartTime;
        return "userId=" + this.mUserId + "," + b.PROPERTY_VIDEO_ID + "=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",type=end,duration_time=" + currentTimeMillis + ",item_id=" + getItemID();
    }

    public static Activity getActivityFromContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        ldk.a("video", "video_acInitError", "", "Page_Home_VideoPlayer_Count", "", null);
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        return null;
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

    private void addVideoPlayStyleParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fad2275", new Object[]{this, map});
        } else if (this.isPlayByVideoInfo) {
            map.put("player_data_style", "videoInfo");
        } else {
            map.put("player_data_style", "dwVideoUrl");
        }
    }

    public String getVideoID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e096c59", new Object[]{this}) : this.mVideoId;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this}) : this.mVideoUrl;
    }
}

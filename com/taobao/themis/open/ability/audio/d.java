package com.taobao.themis.open.ability.audio;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.kernel.utils.r;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.t;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qpt;
import tb.toh;
import tb.toj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b5\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001yB\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010)J\u0010\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0007H\u0002J\u001a\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020\u00072\b\b\u0002\u0010D\u001a\u00020EH\u0002J\u0018\u0010F\u001a\u00020>2\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020EH\u0002J\u0006\u0010G\u001a\u00020EJ\u000e\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0017J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0011H\u0002J\u000e\u0010L\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0017J\u0018\u0010M\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u0010?\u001a\u00020)H\u0002J\u000e\u0010N\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0017J\u000e\u0010O\u001a\u00020>2\u0006\u0010P\u001a\u00020\u0017J\u000e\u0010Q\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0017J\u000e\u0010R\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0017J\"\u0010S\u001a\u00020>2\u0006\u0010T\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\u00072\b\u0010V\u001a\u0004\u0018\u00010\u0007H\u0002J\u000e\u0010W\u001a\u00020>2\u0006\u0010P\u001a\u00020\u0017J\u0010\u0010X\u001a\u00020>2\b\u0010P\u001a\u0004\u0018\u00010\u0017J\u0018\u0010Y\u001a\u00020>2\u0006\u0010*\u001a\u00020+2\u0006\u0010Z\u001a\u00020\u0011H\u0016J\u0010\u0010[\u001a\u00020>2\u0006\u0010*\u001a\u00020+H\u0016J \u0010\\\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010]\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\u0011H\u0016J\u0010\u0010_\u001a\u00020>2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010`\u001a\u00020>2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010a\u001a\u00020>2\b\u0010P\u001a\u0004\u0018\u00010\u0017J\u000e\u0010b\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0017J\b\u0010c\u001a\u00020>H\u0002J\u0006\u0010d\u001a\u00020>J\u0006\u0010e\u001a\u00020>J\u0006\u0010f\u001a\u00020>J\b\u0010g\u001a\u00020>H\u0002J\u0016\u0010h\u001a\u00020>2\u0006\u0010i\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u0017J\u0016\u0010j\u001a\u00020>2\u0006\u0010P\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010k\u001a\u00020>2\u0006\u0010l\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0017J\u0016\u0010m\u001a\u00020>2\u0006\u0010'\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0017J0\u0010n\u001a\u00020>2\u0006\u00104\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00172\u0006\u0010o\u001a\u00020\n2\b\u0010p\u001a\u0004\u0018\u00010\u00072\u0006\u0010?\u001a\u00020)J\u0016\u0010q\u001a\u00020>2\u0006\u00105\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u0017J\u0016\u0010r\u001a\u00020>2\u0006\u0010;\u001a\u00020<2\u0006\u0010I\u001a\u00020\u0017J\b\u0010s\u001a\u00020>H\u0002J\u0010\u0010t\u001a\u00020>2\b\u0010P\u001a\u0004\u0018\u00010\u0017J\b\u0010u\u001a\u00020>H\u0002J\b\u0010v\u001a\u00020>H\u0002J\b\u0010w\u001a\u00020>H\u0002J\b\u0010x\u001a\u00020>H\u0002R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u000e\u0010#\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u000e\u0010%\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006z"}, d2 = {"Lcom/taobao/themis/open/ability/audio/PlayerInstance;", "Landroid/media/MediaPlayer$OnBufferingUpdateListener;", "Landroid/media/MediaPlayer$OnSeekCompleteListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "playerId", "", "(Ljava/lang/String;)V", "alreadyPrepared", "", "getAlreadyPrepared", "()Z", "setAlreadyPrepared", "(Z)V", Constants.Name.AUTO_PLAY, "bufferedProgress", "", "getBufferedProgress", "()I", "setBufferedProgress", "(I)V", "contextRecord", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "currentPosition", "", CommandID.getCurrentPosition, "()J", "duration", "getDuration", "enableOnEndedAutoRefreshPauseStatus", "enableSingleTimer", "hasError", "isLocalAudio", "setLocalAudio", "isLocalAudioCached", "isPlaying", "isRecordAudioPlayState", "isStop", "loop", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "onTimeUpdateRunnable", "Ljava/lang/Runnable;", "onTimeUpdateTask", "Ljava/util/TimerTask;", "paused", "shouldIgnoreWhenPlayAgain", "src", "startTime", "startToPrepared", "supportPlayLocalAudio", "timeUpdaterTimer", "Ljava/util/Timer;", "userRequestToPlay", Constant.PROP_TTS_VOLUME, "", "addMonitors", "", "page", "broadcastErrorEvent", "errorMessage", "broadcastEvent", "eventName", "data", "Lcom/alibaba/fastjson/JSONObject;", "broadcastEventDefault", "genResultJsonObj", "getAutoPlay", "callback", "getErrorMsg", "type", "getIsRecordPlayState", "getLocalPathIfNecessary", "getLoop", "getSrc", com.taobao.android.msoa.c.TAG, "getStartTime", "getVolume", "notifyAttr", "context", "key", "value", "notifyInvalidParam", "notifySuccess", MessageID.onBufferingUpdate, q.MSGTYPE_INTERVAL, MessageID.onCompletion, "onError", "what", "extra", MessageID.onPrepared, MessageID.onSeekComplete, "pause", "play", "postOnTimeUpdate", "releaseMediaPlayer", "removeMonitors", "resetPlayer", "resetPlayerStates", "seek", "position", "setAutoPlay", "setIsRecordPlayState", "isRecordPlayState", "setLoop", "setSrc", "needPermissionCheck", "appXDomain", "setStartTime", CommandID.setVolume, "startOnTimeUpdate", "stop", "stopOnTimeUpdate", "stopOnTimeUpdateRunnable", "tryToPlay", "tryToPrepare", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final HandlerThread A;
    public static final String ATTR_RECORD_PLAY_STATE = "isRecordAudioPlayState";
    private static final Handler B;
    public static final a Companion;
    public static final String ERROR_URL_NOT_IN_WHITE_LIST = "please insure your video source is in domain whitelist";

    /* renamed from: a  reason: collision with root package name */
    private BridgeCallback f22618a;
    private ITMSPage b;
    private String c;
    private boolean d;
    private boolean e;
    private volatile boolean f;
    private boolean g;
    private boolean h;
    private float i;
    private long j;
    private int k;
    private final MediaPlayer l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private volatile boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private Timer v;
    private final boolean w;
    private final TimerTask x;
    private final Runnable y;
    private final String z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            kotlin.jvm.internal.q.b(data, "data");
            if (data.d()) {
                IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
                if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.AUDIO)) == null) {
                    return;
                }
                executor.execute(new Runnable() { // from class: com.taobao.themis.open.ability.audio.d.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d.d(d.this, true);
                        try {
                            if (d.b(d.this)) {
                                d.f(d.this);
                            } else if (!d.c(d.this)) {
                            } else {
                                d.f(d.this);
                                d.a(d.this, false);
                            }
                        } catch (Throwable th) {
                            TMSLogger.b("TMSPlayerInstance", "can not play audio", th);
                            d dVar = d.this;
                            d.a(dVar, "can not play audio: " + th.getMessage());
                        }
                    }
                });
                return;
            }
            TMSLogger.d("TMSPlayerInstance", "cache local audio failed: " + this.b);
            d dVar = d.this;
            d.a(dVar, "cache local audio failed:" + this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MediaPlayer b;

        public c(MediaPlayer mediaPlayer) {
            this.b = mediaPlayer;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d.this.a(true);
                d.a(d.this, "onForegroundAudioCanPlay", (JSONObject) null, 2, (Object) null);
                if (!d.b(d.this) && !d.c(d.this)) {
                    return;
                }
                d.a(d.this, false);
                if (this.b.isPlaying()) {
                    return;
                }
                if (d.d(d.this) != 0) {
                    this.b.seekTo((int) d.d(d.this));
                }
                this.b.start();
                d.b(d.this, false);
                d.c(d.this, false);
                d.a(d.this, "onForegroundAudioPlay", (JSONObject) null, 2, (Object) null);
                d.e(d.this);
            } catch (Exception e) {
                TMSLogger.b("TMSPlayerInstance", e.getMessage(), e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.ability.audio.d$d  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class RunnableC0953d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0953d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, "onForegroundAudioSeeked", (JSONObject) null, 2, (Object) null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long i = d.this.i();
                long h = d.this.h();
                d dVar = d.this;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "currentTime", (String) Float.valueOf(((float) i) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) h) / 1000.0f));
                t tVar = t.INSTANCE;
                d.a(dVar, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.b("TMSPlayerInstance", e.getMessage(), e);
            }
            d.g(d.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/open/ability/audio/PlayerInstance$onTimeUpdateTask$1", "Ljava/util/TimerTask;", "run", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long i = d.this.i();
                long h = d.this.h();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "currentTime", (String) Float.valueOf(((float) i) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) h) / 1000.0f));
                d.a(d.this, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.b("TMSPlayerInstance", e.getMessage(), e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/open/ability/audio/PlayerInstance$startOnTimeUpdate$1", "Ljava/util/TimerTask;", "run", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class g extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this).run();
            }
        }
    }

    public d(String playerId) {
        kotlin.jvm.internal.q.d(playerId, "playerId");
        this.z = playerId;
        this.i = 1.0f;
        this.l = new MediaPlayer();
        this.m = true;
        this.n = true;
        this.o = true;
        this.w = n.S();
        this.l.setAudioStreamType(3);
        if (Build.VERSION.SDK_INT >= 21) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(14);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setFlags(256);
            }
            builder.setContentType(2);
            builder.setLegacyStreamType(3);
            this.l.setAudioAttributes(builder.build());
        }
        if (!this.w) {
            this.v = new Timer("Themis-Audio-Time-Update-Timer");
        }
        this.x = new f();
        this.y = new e();
    }

    public static final /* synthetic */ TimerTask a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimerTask) ipChange.ipc$dispatch("83658847", new Object[]{dVar}) : dVar.x;
    }

    public static final /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a80faa", new Object[]{dVar, str});
        } else {
            dVar.a(str);
        }
    }

    public static final /* synthetic */ void a(d dVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9c4886", new Object[]{dVar, str, jSONObject});
        } else {
            dVar.b(str, jSONObject);
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9d0f4", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.r = z;
        }
    }

    public static final /* synthetic */ void b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be715e93", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.d = z;
        }
    }

    public static final /* synthetic */ boolean b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60fb6065", new Object[]{dVar})).booleanValue() : dVar.f;
    }

    public static final /* synthetic */ void c(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e8ec32", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.e = z;
        }
    }

    public static final /* synthetic */ boolean c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb9c22e6", new Object[]{dVar})).booleanValue() : dVar.r;
    }

    public static final /* synthetic */ long d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("963ce557", new Object[]{dVar})).longValue() : dVar.j;
    }

    public static final /* synthetic */ void d(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316079d1", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.p = z;
        }
    }

    public static final /* synthetic */ void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30dda7e4", new Object[]{dVar});
        } else {
            dVar.q();
        }
    }

    public static final /* synthetic */ void f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7e6a65", new Object[]{dVar});
        } else {
            dVar.s();
        }
    }

    public static final /* synthetic */ void g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661f2ce6", new Object[]{dVar});
        } else {
            dVar.o();
        }
    }

    public static final /* synthetic */ Handler l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8427fcf3", new Object[0]) : B;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.k;
    }

    public final MediaPlayer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaPlayer) ipChange.ipc$dispatch("aaeb5420", new Object[]{this}) : this.l;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.q;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.s;
    }

    public final void a(BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2b45d4", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        if (TextUtils.isEmpty(this.c)) {
            a("src is null , can not play");
            e(callback);
        } else if (e()) {
            if (!this.n) {
                this.l.pause();
                this.d = true;
            }
            d(callback);
        } else {
            if (this.u) {
                g();
            }
            if (this.d) {
                this.l.start();
                this.d = false;
                this.e = false;
                a(this, "onForegroundAudioPlay", (JSONObject) null, 2, (Object) null);
                q();
            } else {
                try {
                    if (!this.q) {
                        m();
                    } else if (this.m && this.p) {
                        m();
                    } else {
                        this.r = true;
                    }
                } catch (Exception e2) {
                    TMSLogger.b("TMSPlayerInstance", e2.getMessage(), e2);
                }
            }
            d(callback);
            this.f22618a = callback;
        }
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.s) {
            long j = this.j;
            if (j != 0) {
                this.l.seekTo((int) j);
            }
            this.l.start();
            this.d = false;
            this.e = false;
            a(this, "onForegroundAudioPlay", (JSONObject) null, 2, (Object) null);
            q();
        } else {
            this.r = true;
            s();
        }
    }

    public final void b(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b994233", new Object[]{this, bridgeCallback});
        } else if (e()) {
            MediaPlayer mediaPlayer = this.l;
            kotlin.jvm.internal.q.a(mediaPlayer);
            mediaPlayer.pause();
            this.d = true;
            d(bridgeCallback);
            a(this, "onForegroundAudioPause", (JSONObject) null, 2, (Object) null);
            r();
        } else {
            d(bridgeCallback);
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
            return this.l.isPlaying();
        } catch (Exception e2) {
            TMSLogger.b("TMSPlayerInstance", e2.getMessage(), e2);
            return false;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            this.l.release();
        } catch (Exception e2) {
            TMSLogger.b("TMSPlayerInstance", e2.getMessage(), e2);
        }
        r();
        this.r = false;
        n();
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.s = false;
        this.t = false;
        this.e = false;
        this.d = false;
        this.u = false;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            this.l.reset();
        } catch (Throwable th) {
            TMSLogger.b("TMSPlayerInstance", "resetPlayer error :" + th.getMessage(), th);
        }
        n();
    }

    public final void c(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8073e92", new Object[]{this, bridgeCallback});
        } else if (this.e) {
            d(bridgeCallback);
        } else {
            try {
                this.l.stop();
                this.d = false;
                this.e = true;
                this.s = false;
                this.t = false;
                this.r = false;
                this.j = 0L;
                d(bridgeCallback);
                this.f22618a = bridgeCallback;
                a(this, "onForegroundAudioStop", (JSONObject) null, 2, (Object) null);
            } catch (IllegalStateException e2) {
                d(bridgeCallback);
                TMSLogger.b("TMSPlayerInstance", e2.getMessage(), e2);
            }
            r();
        }
    }

    public final void a(int i, BridgeCallback c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec10441", new Object[]{this, new Integer(i), c2});
            return;
        }
        kotlin.jvm.internal.q.d(c2, "c");
        if (this.e) {
            a("call seek only support in play or paused status ,not stop");
            e(c2);
        } else if (!this.s) {
            TMSLogger.d("TMSPlayerInstance", "call not seek before onCanPlay");
            e(c2);
        } else {
            try {
                this.l.seekTo(i * 1000);
                d(c2);
                a(this, "onForegroundAudioSeeking", (JSONObject) null, 2, (Object) null);
            } catch (Exception e2) {
                TMSLogger.b("TMSPlayerInstance", e2.getMessage(), e2);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "success", (String) false);
                jSONObject2.put((JSONObject) "errorCode", (String) (-1));
                jSONObject2.put((JSONObject) "audioPlayerID", this.z);
                c2.sendJSONResponse(jSONObject);
            }
        }
    }

    public final long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue();
        }
        if (this.s) {
            return this.l.getDuration();
        }
        return 0L;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue();
        }
        if (this.s) {
            return this.l.getCurrentPosition();
        }
        return 0L;
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            B.postDelayed(this.y, 500L);
        }
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        try {
            B.removeCallbacks(this.y);
        } catch (Throwable th) {
            TMSLogger.b("TMSPlayerInstance", th.getMessage(), th);
        }
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        try {
            r();
            if (this.w) {
                o();
                return;
            }
            this.v = new Timer("Themis-Audio-Time-Update-Timer");
            this.x.cancel();
            Timer timer = this.v;
            if (timer == null) {
                return;
            }
            timer.schedule(new g(), 100L, 500L);
        } catch (Throwable th) {
            TMSLogger.b("TMSPlayerInstance", "onTimeUpdate failed : " + th.getMessage(), th);
        }
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        try {
            if (this.w) {
                p();
                return;
            }
            Timer timer = this.v;
            if (timer == null) {
                return;
            }
            timer.cancel();
        } catch (Throwable th) {
            TMSLogger.b("TMSPlayerInstance", "stopOnTimeUpdate failed : " + th.getMessage(), th);
        }
    }

    public final void d(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94753af1", new Object[]{this, bridgeCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) true);
        jSONObject2.put((JSONObject) "audioPlayerID", this.z);
        if (bridgeCallback == null) {
            return;
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    private final void a(BridgeCallback bridgeCallback, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990b20e8", new Object[]{this, bridgeCallback, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) true);
        jSONObject2.put((JSONObject) "audioPlayerID", this.z);
        jSONObject2.put((JSONObject) str, str2);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    public final void e(BridgeCallback c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e33750", new Object[]{this, c2});
            return;
        }
        kotlin.jvm.internal.q.d(c2, "c");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) false);
        jSONObject2.put((JSONObject) "errorCode", "INVALID_PARAM");
        jSONObject2.put((JSONObject) "errorMessage", "INVALID_PARAM");
        c2.sendJSONResponse(jSONObject);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae0494f", new Object[]{this, mediaPlayer, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        this.k = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        if (this.o) {
            this.d = true;
        }
        a(this, "onForegroundAudioEnded", (JSONObject) null, 2, (Object) null);
        r();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        String a2 = a(i);
        String a3 = a(i2);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "what", a2);
        jSONObject2.put((JSONObject) "extra", a3);
        String jSONString = jSONObject.toJSONString();
        kotlin.jvm.internal.q.b(jSONString, "errorInfo.toJSONString()");
        a(jSONString);
        this.u = true;
        return true;
    }

    private final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        if (i == -1010) {
            return "ERROR_UNSUPPORTED";
        }
        if (i == -1007) {
            return "ERROR_MALFORMED";
        }
        if (i == -1004) {
            return "IO_ERROR";
        }
        if (i == -110) {
            return "TIMED_OUT_ERROR";
        }
        if (i == 1) {
            return "UNKNOWN_ERROR";
        }
        if (i == 100) {
            return "SERVER_DIED";
        }
        if (i == 200) {
            return "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK";
        }
        return "" + i;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6fc624", new Object[]{this, mediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.AUDIO)) == null) {
            return;
        }
        executor.execute(new c(mediaPlayer));
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0048390", new Object[]{this, mediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.AUDIO)) == null) {
            return;
        }
        executor.execute(new RunnableC0953d());
    }

    public static /* synthetic */ void a(d dVar, String str, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5011b5d9", new Object[]{dVar, str, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        dVar.a(str, jSONObject);
    }

    private final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        TMSLogger.d("TMSPlayerInstance", "broadcastEvent id=" + this.z + ",event = " + str);
        b(str, jSONObject);
    }

    private final void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        jSONObject.put((JSONObject) "audioPlayerID", this.z);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        ITMSPage iTMSPage = this.b;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.a(str, jSONObject2);
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TMSLogger.d("TMSPlayerInstance", "broadcastError id=" + this.z + ",error = " + str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "audioPlayerID", this.z);
        jSONObject2.put((JSONObject) "error", str);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "data", (String) jSONObject);
        ITMSPage iTMSPage = this.b;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.a("onForegroundAudioError", jSONObject3);
    }

    public final void a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, iTMSPage});
            return;
        }
        this.l.setOnPreparedListener(this);
        this.l.setOnBufferingUpdateListener(this);
        this.l.setOnErrorListener(this);
        this.l.setOnSeekCompleteListener(this);
        this.l.setOnCompletionListener(this);
        this.b = iTMSPage;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.l.setOnPreparedListener(null);
        this.l.setOnBufferingUpdateListener(null);
        this.l.setOnErrorListener(null);
        this.l.setOnSeekCompleteListener(null);
        this.l.setOnCompletionListener(null);
    }

    public final void f(BridgeCallback c2) {
        ITMSPage iTMSPage;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5133af", new Object[]{this, c2});
            return;
        }
        kotlin.jvm.internal.q.d(c2, "c");
        TMSLogger.b("TMSPlayerInstance", "getSrc: " + this.c + " id=" + this.z);
        String str = this.c;
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (!z && !kotlin.text.n.b(str, "http", false, 2, (Object) null) && (iTMSPage = this.b) != null) {
            kotlin.jvm.internal.q.a(iTMSPage);
            str = toh.b(o.e(iTMSPage.b()), str, ApPathType.AP_PATH_TYPE_TEMP);
        }
        a(c2, "src", str);
        this.f22618a = c2;
    }

    public final void a(String src, BridgeCallback c2, boolean z, String str, ITMSPage page) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbbec3f", new Object[]{this, src, c2, new Boolean(z), str, page});
            return;
        }
        kotlin.jvm.internal.q.d(src, "src");
        kotlin.jvm.internal.q.d(c2, "c");
        kotlin.jvm.internal.q.d(page, "page");
        TMSLogger.b("TMSPlayerInstance", "setSrc: " + src + " id=" + this.z);
        if (!TextUtils.isEmpty(this.c)) {
            a("src can not change after setting");
            e(c2);
            return;
        }
        g();
        this.q = false;
        this.p = false;
        try {
            if (this.m) {
                src = a(src, page);
            }
        } catch (Throwable th) {
            TMSLogger.b("TMSPlayerInstance", "setSrc Error: " + src + " id=" + this.z, th);
        }
        if (src.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            if (kotlin.text.n.b(src, r.PATH_PREFIX, false, 2, (Object) null)) {
                src = toh.a(o.e(page.b()), src, ApPathType.AP_PATH_TYPE_TEMP);
                if (src == null) {
                    src = "";
                }
            } else if (z && !this.q && !TMSPermissionManager.INSTANCE.a(page.b(), src, TMSPermissionManager.SpecialConfigType.RESOURCE)) {
                a(ERROR_URL_NOT_IN_WHITE_LIST);
                e(c2);
                return;
            }
        }
        this.c = src;
        try {
            this.l.setDataSource(this.c);
        } catch (Throwable th2) {
            TMSLogger.b("TMSPlayerInstance", th2.getMessage(), th2);
            a(this, "onForegroundAudioError", (JSONObject) null, 2, (Object) null);
        }
        a(this, "onForegroundAudioWaiting", (JSONObject) null, 2, (Object) null);
        if (this.f) {
            TMSLogger.b("TMSPlayerInstance", "OnAutoPlay true,call play when setSrc = " + src);
            if (!this.q) {
                s();
            } else if (this.m && this.p) {
                s();
            }
        } else if (this.q) {
            if (this.p) {
                s();
            }
        } else {
            s();
        }
        d(c2);
        this.f22618a = c2;
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.s || this.t) {
        } else {
            this.l.prepareAsync();
            this.t = true;
        }
    }

    private final String a(String str, ITMSPage iTMSPage) {
        String str2;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c4eaa63", new Object[]{this, str, iTMSPage});
        }
        String str3 = str;
        if (TextUtils.isEmpty(str3)) {
            return str;
        }
        ITMSPage iTMSPage2 = this.b;
        ApPathType a2 = iTMSPage2 != null ? toh.a(str, iTMSPage2.b()) : null;
        if (a2 == ApPathType.AP_PATH_TYPE_USR) {
            this.q = true;
            this.p = true;
            String a3 = toh.a(o.e(iTMSPage.b()), str, a2);
            return a3 == null ? "" : a3;
        } else if (kotlin.text.n.b(str, k.HTTPS_PREFIX, false, 2, (Object) null) || kotlin.text.n.b(str, k.HTTP_PREFIX, false, 2, (Object) null)) {
            return str;
        } else {
            String h = iTMSPage.b().h();
            if (h == null || h.length() == 0) {
                TMSLogger.d("TMSPlayerInstance", "page or app is invalid");
                return str;
            }
            byte[] b2 = toj.b(str, iTMSPage.b());
            if (b2 == null) {
                return str;
            }
            String a4 = com.taobao.themis.utils.io.e.a(com.taobao.themis.utils.io.g.a(b2));
            if (a4.length() == 0) {
                return str;
            }
            this.q = true;
            int b3 = kotlin.text.n.b((CharSequence) str3, ".", 0, false, 6, (Object) null);
            if (b3 == -1) {
                str2 = ".mp3";
            } else if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } else {
                str2 = str.substring(b3);
                kotlin.jvm.internal.q.b(str2, "(this as java.lang.String).substring(startIndex)");
            }
            String e2 = o.e(iTMSPage.b());
            String a5 = toh.a(e2, "https://tmp/audio/" + a4 + str2, ApPathType.AP_PATH_TYPE_TEMP);
            String str4 = a5;
            if (str4 == null || str4.length() == 0) {
                return str;
            }
            File file = new File(a5);
            if (file.exists() && file.length() == b2.length) {
                this.p = true;
                String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.q.b(absolutePath, "file.absolutePath");
                return absolutePath;
            }
            try {
                File parentFile2 = file.getParentFile();
                if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = file.getParentFile()) != null) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (Exception e3) {
                TMSLogger.b("TMSPlayerInstance", "create local audio file failed: " + a5 + ", " + e3.getMessage(), e3);
            }
            this.p = false;
            com.taobao.themis.open.ability.file.a aVar = com.taobao.themis.open.ability.file.a.INSTANCE;
            com.taobao.themis.kernel.f b4 = iTMSPage.b();
            ByteBuffer wrap = ByteBuffer.wrap(b2);
            kotlin.jvm.internal.q.b(wrap, "ByteBuffer.wrap(audioData)");
            aVar.a(b4, a5, wrap, "ArrayBuffer", new b(str));
            String absolutePath2 = file.getAbsolutePath();
            kotlin.jvm.internal.q.b(absolutePath2, "file.absolutePath");
            return absolutePath2;
        }
    }

    public final void a(boolean z, BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be90e50", new Object[]{this, new Boolean(z), callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        this.h = z;
        e(callback);
    }

    public final void g(BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bf300e", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "getIsRecordPlayState: " + this.j + " id=" + this.z);
        JSONObject k = k();
        k.put((JSONObject) "isRecordAudioPlayState", (String) Boolean.valueOf(this.h));
        callback.sendJSONResponse(k);
        this.f22618a = callback;
    }

    public final void h(BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d2c6d", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "getStartTime: " + (((float) this.j) / 1000.0f) + " id=" + this.z);
        JSONObject k = k();
        k.put((JSONObject) "startTime", (String) Float.valueOf(((float) this.j) / 1000.0f));
        callback.sendJSONResponse(k);
        this.f22618a = callback;
    }

    public final void b(int i, BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801293c2", new Object[]{this, new Integer(i), callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "setStartTime: " + i + " id=" + this.z);
        if (this.s || this.e) {
            a("startTime can not change after setting");
            e(callback);
            return;
        }
        this.j = i * 1000;
        d(callback);
        this.f22618a = callback;
    }

    public final void a(float f2, BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50326be4", new Object[]{this, new Float(f2), callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "setVolume: " + f2 + " id=" + this.z);
        if (f2 < 0 || f2 > 1) {
            TMSLogger.b("TMSPlayerInstance", "setVolume invalid param.");
            e(callback);
            return;
        }
        this.i = f2;
        this.l.setVolume(f2, f2);
        d(callback);
        this.f22618a = callback;
    }

    public final void i(BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29b28cc", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "getVolume: " + this.i + " id=" + this.z);
        JSONObject k = k();
        k.put((JSONObject) Constant.PROP_TTS_VOLUME, (String) Float.valueOf(this.i));
        callback.sendJSONResponse(k);
        this.f22618a = callback;
    }

    public final void b(boolean z, BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3a9dd1", new Object[]{this, new Boolean(z), callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "setLoop: " + z + " id=" + this.z);
        this.g = z;
        this.l.setLooping(this.g);
        d(callback);
        this.f22618a = callback;
    }

    public final void j(BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f09252b", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "getLoop: " + this.g + " id=" + this.z);
        JSONObject k = k();
        k.put((JSONObject) "loop", (String) Boolean.valueOf(this.g));
        callback.sendJSONResponse(k);
        this.f22618a = callback;
    }

    public final void k(BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db77218a", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        TMSLogger.b("TMSPlayerInstance", "getAutoPlay: " + this.f + " id=" + this.z);
        JSONObject k = k();
        k.put((JSONObject) "autoplay", (String) Boolean.valueOf(this.f));
        callback.sendJSONResponse(k);
        this.f22618a = callback;
    }

    public final void a(BridgeCallback c2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263e2780", new Object[]{this, c2, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(c2, "c");
        TMSLogger.b("TMSPlayerInstance", "setAutoPlay: " + z + " id=" + this.z);
        if (this.s || this.e) {
            a("autoPlay can not change after setting");
            e(c2);
            return;
        }
        this.f = z;
        d(c2);
        this.f22618a = c2;
        if (this.c == null) {
            return;
        }
        if (this.s) {
            this.l.start();
        } else {
            s();
        }
    }

    public final JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) true);
        jSONObject2.put((JSONObject) "audioPlayerID", this.z);
        return jSONObject;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/open/ability/audio/PlayerInstance$Companion;", "", "()V", "ATTR_RECORD_PLAY_STATE", "", "ERROR_URL_NOT_IN_WHITE_LIST", "KEY_AUDIO_PLAYER_ID", "ON_CAN_PLAY", "ON_ENDED", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, "ON_PAUSE", "ON_PLAY", "ON_SEEKED", "ON_SEEKING", "ON_STOP", "ON_TIME_UPDATE", "ON_WAITING", RPCDataItems.SWITCH_TAG_LOG, "timerHandler", "Landroid/os/Handler;", "getTimerHandler", "()Landroid/os/Handler;", "timerThread", "Landroid/os/HandlerThread;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1500505771);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final Handler a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : d.l();
        }
    }

    static {
        kge.a(947735331);
        kge.a(780529206);
        kge.a(-1016690258);
        kge.a(-631130887);
        kge.a(2016666867);
        kge.a(-29101414);
        Companion = new a(null);
        HandlerThread handlerThread = new HandlerThread("themis-audio-timer");
        handlerThread.start();
        A = handlerThread;
        B = new Handler(A.getLooper());
    }
}

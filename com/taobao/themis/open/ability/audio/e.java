package com.taobao.themis.open.ability.audio;

import android.app.Activity;
import android.app.Application;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.a;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.kernel.utils.r;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001zB\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010@\u001a\u00020AJ\u0010\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\bH\u0002J\u001a\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020\b2\b\b\u0002\u0010F\u001a\u00020GH\u0002J\u0018\u0010H\u001a\u00020A2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010I\u001a\u00020AH\u0016J\u0006\u0010J\u001a\u00020\rJ\b\u0010K\u001a\u00020\u0016H\u0016J\b\u0010L\u001a\u00020?H\u0016J\b\u0010\u001c\u001a\u00020?H\u0016J\u0010\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u0016H\u0002J\u0006\u0010O\u001a\u00020\rJ\u0018\u0010P\u001a\u00020\b2\u0006\u00107\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\nH\u0002J\u0006\u0010R\u001a\u00020\rJ\u0006\u0010S\u001a\u00020\bJ\u0006\u0010T\u001a\u00020?J\u0006\u0010U\u001a\u00020?J\b\u0010V\u001a\u00020\rH\u0016J\u0010\u0010W\u001a\u00020A2\b\u0010X\u001a\u0004\u0018\u00010YJ\u0018\u0010Z\u001a\u00020A2\u0006\u0010-\u001a\u00020.2\u0006\u0010[\u001a\u00020\u0016H\u0016J\u0010\u0010\\\u001a\u00020A2\u0006\u0010-\u001a\u00020.H\u0016J \u0010]\u001a\u00020\r2\u0006\u0010-\u001a\u00020.2\u0006\u0010^\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u0016H\u0016J\u0010\u0010`\u001a\u00020A2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010a\u001a\u00020A2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010b\u001a\u00020\rH\u0016J\b\u0010c\u001a\u00020\rH\u0016J\b\u0010d\u001a\u00020AH\u0002J\u0006\u0010e\u001a\u00020AJ\u0006\u0010f\u001a\u00020AJ\u0006\u0010g\u001a\u00020AJ\b\u0010h\u001a\u00020AH\u0002J\u0010\u0010i\u001a\u00020\r2\u0006\u0010j\u001a\u00020\u0016H\u0016J\u0010\u0010k\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010l\u001a\u00020\r2\u0006\u0010m\u001a\u00020\rH\u0016J\u0010\u0010n\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rH\u0016J\u0010\u0010o\u001a\u00020\r2\u0006\u0010p\u001a\u00020\rH\u0016J\u0012\u0010q\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010r\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0016H\u0016J\u0010\u0010s\u001a\u00020\r2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010t\u001a\u00020AH\u0002J\b\u0010u\u001a\u00020\rH\u0016J\b\u0010v\u001a\u00020AH\u0002J\b\u0010w\u001a\u00020AH\u0002J\b\u0010x\u001a\u00020AH\u0002J\b\u0010y\u001a\u00020AH\u0002R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R\u000e\u0010(\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b)\u0010\u000fR\u000e\u0010*\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lcom/taobao/themis/open/ability/audio/TMSNewPlayerInstance;", "Landroid/media/MediaPlayer$OnBufferingUpdateListener;", "Landroid/media/MediaPlayer$OnSeekCompleteListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Lcom/taobao/themis/kernel/adapter/ITMSAudioContext;", "mPlayerId", "", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Ljava/lang/String;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "alreadyPrepared", "", "getAlreadyPrepared", "()Z", "setAlreadyPrepared", "(Z)V", "appLifeCycle", "Landroid/app/Application$ActivityLifecycleCallbacks;", Constants.Name.AUTO_PLAY, "bufferedProgress", "", "currentPosition", "", CommandID.getCurrentPosition, "()J", "duration", "getDuration", "enableOnEndedAutoRefreshPauseStatus", "enableSingleTimer", "fireEventInvoker", "Lcom/taobao/themis/kernel/adapter/ITMSAudioContext$FireEventInvoker;", "getFireEventInvoker", "()Lcom/taobao/themis/kernel/adapter/ITMSAudioContext$FireEventInvoker;", "setFireEventInvoker", "(Lcom/taobao/themis/kernel/adapter/ITMSAudioContext$FireEventInvoker;)V", "hasError", "isLocalAudio", "setLocalAudio", "isLocalAudioCached", "isPlaying", "isRecordAudioPlayState", "isStop", "loop", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "onTimeUpdateRunnable", "Ljava/lang/Runnable;", "onTimeUpdateTask", "Ljava/util/TimerTask;", "paused", "shouldIgnoreWhenPlayAgain", "src", "startTime", "startToPrepared", "supportPlayLocalAudio", "timeUpdaterTimer", "Ljava/util/Timer;", "userRequestToPlay", Constant.PROP_TTS_VOLUME, "", "addMonitors", "", "broadcastErrorEvent", "errorMessage", "broadcastEvent", "eventName", "data", "Lcom/alibaba/fastjson/JSONObject;", "broadcastEventDefault", "destroy", "getAutoPlay", "getBufferd", "getCurrentTime", "getErrorMsg", "type", "getIsRecordPlayState", "getLocalPathIfNecessary", "page", "getLoop", "getSrc", "getStartTime", "getVolume", "isPaused", "notifySuccess", com.taobao.android.msoa.c.TAG, "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", MessageID.onBufferingUpdate, q.MSGTYPE_INTERVAL, MessageID.onCompletion, "onError", "what", "extra", MessageID.onPrepared, MessageID.onSeekComplete, "pause", "play", "postOnTimeUpdate", "releaseMediaPlayer", "removeMonitors", "resetPlayer", "resetPlayerStates", "seek", "position", "setAutoPlay", "setIsRecordPlayState", "isRecordPlayState", "setLoop", "setObeyMuteSwitch", "obeyMuteSwitch", "setSrc", "setStartTime", CommandID.setVolume, "startOnTimeUpdate", "stop", "stopOnTimeUpdate", "stopOnTimeUpdateRunnable", "tryToPlay", "tryToPrepare", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, com.taobao.themis.kernel.adapter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final HandlerThread A;
    public static final String ATTR_RECORD_PLAY_STATE = "isRecordAudioPlayState";
    private static final Handler B;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f22626a;
    private a.InterfaceC0940a b;
    private String c;
    private boolean d;
    private boolean e;
    private volatile boolean f;
    private boolean g;
    private float h;
    private long i;
    private int j;
    private final MediaPlayer k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private volatile boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private Timer u;
    private final boolean v;
    private final TimerTask w;
    private final Runnable x;
    private final String y;
    private final ITMSPage z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
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
                executor.execute(new Runnable() { // from class: com.taobao.themis.open.ability.audio.e.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        e.d(e.this, true);
                        try {
                            if (e.b(e.this)) {
                                e.f(e.this);
                            } else if (!e.c(e.this)) {
                            } else {
                                e.f(e.this);
                                e.a(e.this, false);
                            }
                        } catch (Throwable th) {
                            TMSLogger.b("TMSNewPlayerInstance", "can not play audio", th);
                            e eVar = e.this;
                            e.a(eVar, "can not play audio: " + th.getMessage());
                        }
                    }
                });
                return;
            }
            TMSLogger.d("TMSNewPlayerInstance", "cache local audio failed: " + this.b);
            e eVar = e.this;
            e.a(eVar, "cache local audio failed:" + this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MediaPlayer b;

        public d(MediaPlayer mediaPlayer) {
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
                e.this.e(true);
                e.a(e.this, "onForegroundAudioCanPlay", null, 2, null);
                if (!e.b(e.this) && !e.c(e.this)) {
                    return;
                }
                e.a(e.this, false);
                if (this.b.isPlaying()) {
                    return;
                }
                if (e.d(e.this) != 0) {
                    this.b.seekTo((int) e.d(e.this));
                }
                this.b.start();
                e.b(e.this, false);
                e.c(e.this, false);
                e.a(e.this, "onForegroundAudioPlay", null, 2, null);
                e.e(e.this);
            } catch (Exception e) {
                TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.ability.audio.e$e  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class RunnableC0954e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0954e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.a(e.this, "onForegroundAudioSeeked", null, 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long n = e.this.n();
                long m = e.this.m();
                e eVar = e.this;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "currentTime", (String) Float.valueOf(((float) n) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) m) / 1000.0f));
                t tVar = t.INSTANCE;
                e.a(eVar, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
            }
            e.g(e.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/open/ability/audio/TMSNewPlayerInstance$onTimeUpdateTask$1", "Ljava/util/TimerTask;", "run", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
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
                return;
            }
            try {
                long n = e.this.n();
                long m = e.this.m();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "currentTime", (String) Float.valueOf(((float) n) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) m) / 1000.0f));
                e.a(e.this, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/open/ability/audio/TMSNewPlayerInstance$startOnTimeUpdate$1", "Ljava/util/TimerTask;", "run", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class h extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.a(e.this).run();
            }
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public e(String mPlayerId, ITMSPage mPage) {
        Application applicationContext;
        kotlin.jvm.internal.q.d(mPlayerId, "mPlayerId");
        kotlin.jvm.internal.q.d(mPage, "mPage");
        this.y = mPlayerId;
        this.z = mPage;
        this.f22626a = new b();
        this.h = 1.0f;
        this.k = new MediaPlayer();
        this.l = true;
        this.m = true;
        this.n = true;
        this.v = n.S();
        this.k.setAudioStreamType(3);
        if (Build.VERSION.SDK_INT >= 21) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(14);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setFlags(256);
            }
            builder.setContentType(2);
            builder.setLegacyStreamType(3);
            this.k.setAudioAttributes(builder.build());
        }
        if (!this.v) {
            this.u = new Timer("Themis-Audio-Time-Update-Timer");
        }
        o();
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        if (iEnvironmentService != null && (applicationContext = iEnvironmentService.getApplicationContext()) != null) {
            applicationContext.registerActivityLifecycleCallbacks(this.f22626a);
        }
        this.w = new g();
        this.x = new f();
    }

    public static final /* synthetic */ TimerTask a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimerTask) ipChange.ipc$dispatch("7f671726", new Object[]{eVar}) : eVar.w;
    }

    public static final /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202dca49", new Object[]{eVar, str});
        } else {
            eVar.b(str);
        }
    }

    public static final /* synthetic */ void a(e eVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f09dc7", new Object[]{eVar, str, jSONObject});
        } else {
            eVar.b(str, jSONObject);
        }
    }

    public static final /* synthetic */ void a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507e875", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.q = z;
        }
    }

    public static final /* synthetic */ void b(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7f7614", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.d = z;
        }
    }

    public static final /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60fbd4c4", new Object[]{eVar})).booleanValue() : eVar.f;
    }

    public static final /* synthetic */ void c(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f703b3", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.e = z;
        }
    }

    public static final /* synthetic */ boolean c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb9c9745", new Object[]{eVar})).booleanValue() : eVar.q;
    }

    public static final /* synthetic */ long d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("963d59b6", new Object[]{eVar})).longValue() : eVar.i;
    }

    public static final /* synthetic */ void d(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316e9152", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.o = z;
        }
    }

    public static final /* synthetic */ void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30de1c43", new Object[]{eVar});
        } else {
            eVar.u();
        }
    }

    public static final /* synthetic */ void f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7edec4", new Object[]{eVar});
        } else {
            eVar.w();
        }
    }

    public static final /* synthetic */ void g(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661fa145", new Object[]{eVar});
        } else {
            eVar.s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/taobao/themis/open/ability/audio/TMSNewPlayerInstance$appLifeCycle$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                kotlin.jvm.internal.q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                kotlin.jvm.internal.q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                kotlin.jvm.internal.q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
                return;
            }
            kotlin.jvm.internal.q.d(activity, "activity");
            kotlin.jvm.internal.q.d(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                kotlin.jvm.internal.q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                kotlin.jvm.internal.q.d(activity, "activity");
            }
        }

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            kotlin.jvm.internal.q.d(activity, "activity");
            try {
                e.this.b();
            } catch (Throwable th) {
                TMSLogger.b("TMSNewPlayerInstance", "onActivityPaused, pause player error: " + th.getMessage(), th);
            }
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public void a(a.InterfaceC0940a interfaceC0940a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd82bb5", new Object[]{this, interfaceC0940a});
        } else {
            this.b = interfaceC0940a;
        }
    }

    public a.InterfaceC0940a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0940a) ipChange.ipc$dispatch("93e62af3", new Object[]{this}) : this.b;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.c)) {
            b("src is null , can not play");
            return false;
        } else if (j()) {
            if (!this.m) {
                this.k.pause();
                this.d = true;
            }
            return true;
        } else {
            if (this.t) {
                l();
            }
            if (this.d) {
                this.k.start();
                this.d = false;
                this.e = false;
                a(this, "onForegroundAudioPlay", null, 2, null);
                u();
            } else {
                try {
                    if (!this.p) {
                        q();
                    } else if (this.l && this.o) {
                        q();
                    } else {
                        this.q = true;
                    }
                } catch (Exception e) {
                    TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
                }
            }
            return true;
        }
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.r) {
            long j = this.i;
            if (j != 0) {
                this.k.seekTo((int) j);
            }
            this.k.start();
            this.d = false;
            this.e = false;
            a(this, "onForegroundAudioPlay", null, 2, null);
            u();
        } else {
            this.q = true;
            w();
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (j()) {
            MediaPlayer mediaPlayer = this.k;
            kotlin.jvm.internal.q.a(mediaPlayer);
            mediaPlayer.pause();
            this.d = true;
            a(this, "onForegroundAudioPause", null, 2, null);
            v();
        }
        return true;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        try {
            return this.k.isPlaying();
        } catch (Exception e) {
            TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
            return false;
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            this.k.release();
        } catch (Exception e) {
            TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
        }
        v();
        this.q = false;
        r();
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public void d() {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c();
        k();
        p();
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        if (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) {
            return;
        }
        applicationContext.unregisterActivityLifecycleCallbacks(this.f22626a);
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.r = false;
        this.s = false;
        this.e = false;
        this.d = false;
        this.t = false;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            this.k.reset();
        } catch (Throwable th) {
            TMSLogger.b("TMSNewPlayerInstance", "resetPlayer error :" + th.getMessage(), th);
        }
        r();
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.e) {
            return true;
        }
        try {
            this.k.stop();
            this.d = false;
            this.e = true;
            this.r = false;
            this.s = false;
            this.q = false;
            this.i = 0L;
            a(this, "onForegroundAudioStop", null, 2, null);
            v();
            return true;
        } catch (IllegalStateException e) {
            TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
            return true;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.e) {
            b("call seek only support in play or paused status ,not stop");
            return false;
        } else if (!this.r) {
            TMSLogger.d("TMSNewPlayerInstance", "call not seek before onCanPlay");
            return false;
        } else {
            try {
                this.k.seekTo(i * 1000);
                a(this, "onForegroundAudioSeeking", null, 2, null);
                return true;
            } catch (Exception e) {
                TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
                b("Exception happened when audio.seek");
                return false;
            }
        }
    }

    public final long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        if (this.r) {
            return this.k.getDuration();
        }
        return 0L;
    }

    public final long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue();
        }
        if (this.r) {
            return this.k.getCurrentPosition();
        }
        return 0L;
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            B.postDelayed(this.x, 500L);
        }
    }

    private final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        try {
            B.removeCallbacks(this.x);
        } catch (Throwable th) {
            TMSLogger.b("TMSNewPlayerInstance", th.getMessage(), th);
        }
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        try {
            v();
            if (this.v) {
                s();
                return;
            }
            this.u = new Timer("Themis-Audio-Time-Update-Timer");
            this.w.cancel();
            Timer timer = this.u;
            if (timer == null) {
                return;
            }
            timer.schedule(new h(), 100L, 500L);
        } catch (Throwable th) {
            TMSLogger.b("TMSNewPlayerInstance", "onTimeUpdate failed : " + th.getMessage(), th);
        }
    }

    private final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        try {
            if (this.v) {
                t();
                return;
            }
            Timer timer = this.u;
            if (timer == null) {
                return;
            }
            timer.cancel();
        } catch (Throwable th) {
            TMSLogger.b("TMSNewPlayerInstance", "stopOnTimeUpdate failed : " + th.getMessage(), th);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae0494f", new Object[]{this, mediaPlayer, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        this.j = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        if (this.n) {
            this.d = true;
        }
        a(this, "onForegroundAudioEnded", null, 2, null);
        v();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        kotlin.jvm.internal.q.d(mediaPlayer, "mediaPlayer");
        String c2 = c(i);
        String c3 = c(i2);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "what", c2);
        jSONObject2.put((JSONObject) "extra", c3);
        String jSONString = jSONObject.toJSONString();
        kotlin.jvm.internal.q.b(jSONString, "errorInfo.toJSONString()");
        b(jSONString);
        this.t = true;
        return true;
    }

    private final String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{this, new Integer(i)});
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
        executor.execute(new d(mediaPlayer));
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
        executor.execute(new RunnableC0954e());
    }

    public static /* synthetic */ void a(e eVar, String str, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a82aef8", new Object[]{eVar, str, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        eVar.a(str, jSONObject);
    }

    private final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        TMSLogger.d("TMSNewPlayerInstance", "broadcastEvent id=" + this.y + ",event = " + str);
        b(str, jSONObject);
    }

    private final void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put((JSONObject) "audioPlayerID", this.y);
        t tVar = t.INSTANCE;
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        if (i() != null) {
            a.InterfaceC0940a i = i();
            if (i == null) {
                return;
            }
            i.a(str, jSONObject2);
            return;
        }
        this.z.a(str, jSONObject2);
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TMSLogger.d("TMSNewPlayerInstance", "broadcastError id=" + this.y + ",error = " + str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "audioPlayerID", this.y);
        jSONObject3.put((JSONObject) "error", str);
        t tVar = t.INSTANCE;
        jSONObject.put((JSONObject) "data", (String) jSONObject2);
        if (i() != null) {
            a.InterfaceC0940a i = i();
            if (i == null) {
                return;
            }
            i.a("onForegroundAudioError", jSONObject);
            return;
        }
        this.z.a("onForegroundAudioError", jSONObject);
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            b("src can not be null");
            return false;
        }
        kotlin.jvm.internal.q.a((Object) str);
        TMSLogger.b("TMSNewPlayerInstance", "setSrc: " + str + " id=" + this.y);
        if (!TextUtils.isEmpty(this.c)) {
            b("src can not change after setting");
            return false;
        }
        l();
        this.p = false;
        this.o = false;
        try {
            if (this.l) {
                str = a(str, this.z);
            }
        } catch (Throwable th) {
            TMSLogger.b("TMSNewPlayerInstance", "setSrc Error: " + str + " id=" + this.y, th);
        }
        if (kotlin.text.n.b(str, r.PATH_PREFIX, false, 2, (Object) null) && (str = toh.a(o.e(this.z.b()), str, ApPathType.AP_PATH_TYPE_TEMP)) == null) {
            str = "";
        }
        this.c = str;
        try {
            this.k.setDataSource(this.c);
        } catch (Throwable th2) {
            TMSLogger.b("TMSNewPlayerInstance", th2.getMessage(), th2);
            a(this, "onForegroundAudioError", null, 2, null);
        }
        a(this, "onForegroundAudioWaiting", null, 2, null);
        if (this.f) {
            TMSLogger.b("TMSNewPlayerInstance", "OnAutoPlay true,call play when setSrc = " + str);
            if (!this.p) {
                w();
            } else if (this.l && this.o) {
                w();
            }
        } else if (this.p) {
            if (this.o) {
                w();
            }
        } else {
            w();
        }
        return true;
    }

    private final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.r || this.s) {
        } else {
            try {
                this.k.prepareAsync();
            } catch (Exception e) {
                TMSLogger.b("TMSNewPlayerInstance", e.getMessage(), e);
            }
            this.s = true;
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
        ITMSPage iTMSPage2 = this.z;
        ApPathType a2 = iTMSPage2 != null ? toh.a(str, iTMSPage2.b()) : null;
        if (a2 == ApPathType.AP_PATH_TYPE_USR) {
            this.p = true;
            this.o = true;
            String a3 = toh.a(o.e(iTMSPage.b()), str, a2);
            return a3 == null ? "" : a3;
        } else if (kotlin.text.n.b(str, k.HTTPS_PREFIX, false, 2, (Object) null) || kotlin.text.n.b(str, k.HTTP_PREFIX, false, 2, (Object) null)) {
            return str;
        } else {
            String h2 = iTMSPage.b().h();
            if (h2 == null || h2.length() == 0) {
                TMSLogger.d("TMSNewPlayerInstance", "page or app is invalid");
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
            this.p = true;
            int b3 = kotlin.text.n.b((CharSequence) str3, ".", 0, false, 6, (Object) null);
            if (b3 == -1) {
                str2 = ".mp3";
            } else if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } else {
                str2 = str.substring(b3);
                kotlin.jvm.internal.q.b(str2, "(this as java.lang.String).substring(startIndex)");
            }
            String e = o.e(iTMSPage.b());
            String a5 = toh.a(e, "https://tmp/audio/" + a4 + str2, ApPathType.AP_PATH_TYPE_TEMP);
            String str4 = a5;
            if (str4 == null || str4.length() == 0) {
                return str;
            }
            File file = new File(a5);
            if (file.exists() && file.length() == b2.length) {
                this.o = true;
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
            } catch (Exception e2) {
                TMSLogger.b("TMSNewPlayerInstance", "create local audio file failed: " + a5 + ", " + e2.getMessage(), e2);
            }
            this.o = false;
            com.taobao.themis.open.ability.file.a aVar = com.taobao.themis.open.ability.file.a.INSTANCE;
            com.taobao.themis.kernel.f b4 = iTMSPage.b();
            ByteBuffer wrap = ByteBuffer.wrap(b2);
            kotlin.jvm.internal.q.b(wrap, "ByteBuffer.wrap(audioData)");
            aVar.a(b4, a5, wrap, "ArrayBuffer", new c(str));
            String absolutePath2 = file.getAbsolutePath();
            kotlin.jvm.internal.q.b(absolutePath2, "file.absolutePath");
            return absolutePath2;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TMSLogger.b("TMSNewPlayerInstance", "setStartTime: " + i + " id=" + this.y);
        if (this.r || this.e) {
            b("startTime can not change after setting");
            return false;
        }
        this.i = i * 1000;
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f2)})).booleanValue();
        }
        TMSLogger.b("TMSNewPlayerInstance", "setVolume: " + f2 + " id=" + this.y);
        if (f2 < 0 || f2 > 1) {
            TMSLogger.b("TMSNewPlayerInstance", "setVolume invalid param.");
            b("setVolume invalid param.");
            return false;
        }
        this.h = f2;
        this.k.setVolume(f2, f2);
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        TMSLogger.b("TMSNewPlayerInstance", "setLoop: " + z + " id=" + this.y);
        this.g = z;
        this.k.setLooping(this.g);
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        TMSLogger.b("TMSNewPlayerInstance", "setAutoPlay: " + z + " id=" + this.y);
        boolean z2 = this.r;
        if (z2 || this.e) {
            b("autoPlay can not change after setting");
            return false;
        }
        this.f = z;
        if (this.c != null) {
            if (z2) {
                this.k.start();
            } else {
                w();
            }
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : ((float) m()) / 1000.0f;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : ((float) n()) / 1000.0f;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : !j();
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.j;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.k.setOnPreparedListener(this);
        this.k.setOnBufferingUpdateListener(this);
        this.k.setOnErrorListener(this);
        this.k.setOnSeekCompleteListener(this);
        this.k.setOnCompletionListener(this);
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.k.setOnPreparedListener(null);
        this.k.setOnBufferingUpdateListener(null);
        this.k.setOnErrorListener(null);
        this.k.setOnSeekCompleteListener(null);
        this.k.setOnCompletionListener(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/open/ability/audio/TMSNewPlayerInstance$Companion;", "", "()V", "ATTR_RECORD_PLAY_STATE", "", "ERROR_URL_NOT_IN_WHITE_LIST", "KEY_AUDIO_PLAYER_ID", "ON_CAN_PLAY", "ON_ENDED", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, "ON_PAUSE", "ON_PLAY", "ON_SEEKED", "ON_SEEKING", "ON_STOP", "ON_TIME_UPDATE", "ON_WAITING", RPCDataItems.SWITCH_TAG_LOG, "timerHandler", "Landroid/os/Handler;", "getTimerHandler", "()Landroid/os/Handler;", "timerThread", "Landroid/os/HandlerThread;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1426616625);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    static {
        kge.a(-343792343);
        kge.a(780529206);
        kge.a(-1016690258);
        kge.a(-631130887);
        kge.a(2016666867);
        kge.a(-29101414);
        kge.a(1332146726);
        Companion = new a(null);
        HandlerThread handlerThread = new HandlerThread("themis-audio-timer");
        handlerThread.start();
        A = handlerThread;
        B = new Handler(A.getLooper());
    }
}

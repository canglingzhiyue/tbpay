package com.taobao.themis.open.ability.audio;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.themis.kernel.adapter.a;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qqa;
import tb.toh;
import tb.toj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u0000 U2\u00020\u0001:\u0004UVWXB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u001a\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020$H\u0016J\u0006\u0010+\u001a\u00020\bJ\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\"H\u0016J\b\u0010.\u001a\u00020\"H\u0016J\u0006\u0010/\u001a\u00020\bJ\u0006\u00100\u001a\u00020\u0003J\u0006\u00101\u001a\u00020\nJ\u0006\u00102\u001a\u00020\"J\u0018\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0005H\u0002J\b\u00106\u001a\u00020\bH\u0016J\b\u00107\u001a\u00020\bH\u0016J\b\u00108\u001a\u00020$H\u0002J\b\u00109\u001a\u00020\bH\u0016J\u001a\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\nH\u0002J\u001a\u0010=\u001a\u00020$2\u0006\u0010;\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\bH\u0002J\b\u0010?\u001a\u00020$H\u0002J\u0010\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\nH\u0016J\u0010\u0010B\u001a\u00020$2\u0006\u0010A\u001a\u00020\nH\u0002J\u0010\u0010C\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0016J\u0010\u0010F\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010G\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020\bH\u0002J\u0010\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\bH\u0016J\u0010\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020\bH\u0002J\u0012\u0010N\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010O\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010P\u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010Q\u001a\u00020$2\u0006\u0010!\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020\bH\u0016J\b\u0010T\u001a\u00020$H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance;", "Lcom/taobao/themis/kernel/adapter/ITMSAudioContext;", "mPlayerId", "", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Ljava/lang/String;Lcom/taobao/themis/kernel/page/ITMSPage;)V", Constants.Name.AUTO_PLAY, "", "currentPosition", "", "duration", "enableMonitor", "getEnableMonitor", "()Z", "setEnableMonitor", "(Z)V", "fireEventInvoker", "Lcom/taobao/themis/kernel/adapter/ITMSAudioContext$FireEventInvoker;", "getFireEventInvoker", "()Lcom/taobao/themis/kernel/adapter/ITMSAudioContext$FireEventInvoker;", "setFireEventInvoker", "(Lcom/taobao/themis/kernel/adapter/ITMSAudioContext$FireEventInvoker;)V", "isLocalAudio", "isSeeking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loop", "mPlayerStateMachine", "Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance$PlayerStateMachine;", "mSrc", "startTime", "traceId", "userRequestToPlay", Constant.PROP_TTS_VOLUME, "", "broadcastErrorEvent", "", "errorMessage", "broadcastEvent", "eventName", "data", "Lcom/alibaba/fastjson/JSONObject;", "destroy", "getAutoPlay", "getBufferd", "getCurrentTime", "getDuration", "getLoop", "getSrc", "getStartTime", "getVolume", "handlePkgPath", "path", "page", "isPaused", "pause", "pauseByMega", "play", "playByMega", "src", "startPosition", "prepareByMega", "shouldLoop", "resumeByMega", "seek", "position", "seekByMega", "setAutoPlay", "setIsRecordPlayState", "isRecordPlayState", "setLoop", "setLoopByMega", "setMutedByMega", MusLiveVideo.ATTR_MUTE, "setObeyMuteSwitch", "obeyMuteSwitch", "setPauseInBackground", "enable", "setSrc", "setStartTime", CommandID.setVolume, "setVolumeByMega", "", "stop", "stopByMega", "Companion", "MegaPropertiesCallback", "PlayerState", "PlayerStateMachine", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class MegaPlayerInstance implements com.taobao.themis.kernel.adapter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0940a f22609a;
    private boolean b;
    private final String c;
    private String d;
    private boolean e;
    private volatile boolean f;
    private volatile boolean g;
    private boolean h;
    private float i;
    private int j;
    private int k;
    private int l;
    private final b m;
    private final AtomicBoolean n;
    private final String o;
    private final ITMSPage p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.ability.audio.MegaPlayerInstance$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static final class AnonymousClass1 implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // tb.qox
        public final void a(qoy qoyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance$PlayerState;", "", "(Ljava/lang/String;I)V", "INIT", "START_PREPARE", "PREPARED", "PLAYING", "PAUSED", "ENDED", "STOP", "ERROR", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public enum PlayerState {
        INIT,
        START_PREPARE,
        PREPARED,
        PLAYING,
        PAUSED,
        ENDED,
        STOP,
        ERROR
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // tb.qox
        public final void a(qoy qoyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                MegaPlayerInstance.g(MegaPlayerInstance.this).a(PlayerState.START_PREPARE);
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "cache local audio failed: " + this.b);
            MegaPlayerInstance megaPlayerInstance = MegaPlayerInstance.this;
            MegaPlayerInstance.b(megaPlayerInstance, "cache local audio failed:" + this.b);
        }
    }

    static {
        kge.a(170421685);
        kge.a(1332146726);
        Companion = new a(null);
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

    @Override // com.taobao.themis.kernel.adapter.a
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        return 100;
    }

    public MegaPlayerInstance(String mPlayerId, ITMSPage mPage) {
        q.d(mPlayerId, "mPlayerId");
        q.d(mPage, "mPage");
        this.o = mPlayerId;
        this.p = mPage;
        this.b = true;
        this.c = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(this.p));
        this.i = 1.0f;
        this.j = 3;
        this.m = new b();
        this.n = new AtomicBoolean(false);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str = this.c;
        String str2 = this.o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "Audio");
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str, str2, MUSMonitor.MODULE_DIM_ABILITY, "create", jSONObject, AnonymousClass1.INSTANCE);
        g(false);
        com.taobao.themis.kernel.ability.a.a().a(this.p.b(), TMSCalendarBridge.namespace, this.c, this.o, "AudioContext", "setEventListener", new JSONObject(), new qox() { // from class: com.taobao.themis.open.ability.audio.MegaPlayerInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qox
            public final void a(qoy abilityResponse, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, abilityResponse, new Boolean(z)});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("event listener: ");
                q.b(abilityResponse, "abilityResponse");
                sb.append(abilityResponse.a());
                TMSLogger.b("MegaPlayerInstance", sb.toString());
                if (!abilityResponse.d()) {
                    TMSLogger.d("MegaPlayerInstance", "mega fail! " + abilityResponse.a());
                    MegaPlayerInstance.g(MegaPlayerInstance.this).a(PlayerState.ERROR);
                    MegaPlayerInstance megaPlayerInstance = MegaPlayerInstance.this;
                    String c2 = abilityResponse.c();
                    if (c2 == null) {
                        c2 = "";
                    }
                    q.b(c2, "abilityResponse.errorMsg ?: \"\"");
                    MegaPlayerInstance.b(megaPlayerInstance, c2);
                } else if (!MegaPlayerInstance.this.j()) {
                } else {
                    Object obj = abilityResponse.a().get("type");
                    String obj2 = obj != null ? obj.toString() : null;
                    if (obj2 == null) {
                        return;
                    }
                    switch (obj2.hashCode()) {
                        case -1842374802:
                            if (obj2.equals("onWaiting")) {
                            }
                            return;
                        case -1340212393:
                            if (!obj2.equals("onPause")) {
                                return;
                            }
                            return;
                        case -1338265852:
                            if (!obj2.equals("onReady")) {
                                return;
                            }
                            JSONObject jSONObject2 = abilityResponse.a().getJSONObject("data");
                            Object obj3 = jSONObject2 != null ? jSONObject2.get("currentTime") : null;
                            if (!(obj3 instanceof Integer)) {
                                obj3 = null;
                            }
                            Integer num = (Integer) obj3;
                            Object obj4 = jSONObject2 != null ? jSONObject2.get("duration") : null;
                            if (!(obj4 instanceof Integer)) {
                                obj4 = null;
                            }
                            Integer num2 = (Integer) obj4;
                            if (num == null || num2 == null) {
                                TMSLogger.d("MegaPlayerInstance", "mega on time update currentTime or duration is null");
                                return;
                            }
                            MegaPlayerInstance.c(MegaPlayerInstance.this, num.intValue());
                            MegaPlayerInstance.d(MegaPlayerInstance.this, num2.intValue());
                            MegaPlayerInstance.g(MegaPlayerInstance.this).a(PlayerState.PREPARED);
                            return;
                        case -1013169885:
                            if (!obj2.equals("onLoop")) {
                                return;
                            }
                            MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioPlay", null, 2, null);
                            return;
                        case -1013054029:
                            if (!obj2.equals("onPlay") || MegaPlayerInstance.g(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) < 0) {
                                return;
                            }
                            MegaPlayerInstance.g(MegaPlayerInstance.this).a(PlayerState.PLAYING);
                            return;
                        case -1012956543:
                            if (!obj2.equals(MessageID.onStop) || MegaPlayerInstance.g(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) < 0) {
                                return;
                            }
                            MegaPlayerInstance.g(MegaPlayerInstance.this).a(PlayerState.STOP);
                            return;
                        case -986867829:
                            if (!obj2.equals("onSeeking")) {
                                return;
                            }
                            return;
                        case -800580979:
                            if (!obj2.equals("onWaitingEnd")) {
                                return;
                            }
                            return;
                        case -503449776:
                            if (!obj2.equals(MessageID.onSeekComplete) || MegaPlayerInstance.g(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) < 0 || !MegaPlayerInstance.h(MegaPlayerInstance.this).get()) {
                                return;
                            }
                            MegaPlayerInstance.h(MegaPlayerInstance.this).set(false);
                            MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioSeeked", null, 2, null);
                            return;
                        case -107951819:
                            if (!obj2.equals("onTimeUpdate")) {
                                return;
                            }
                            JSONObject jSONObject3 = abilityResponse.a().getJSONObject("data");
                            Object obj5 = jSONObject3 != null ? jSONObject3.get("currentTime") : null;
                            if (!(obj5 instanceof Integer)) {
                                obj5 = null;
                            }
                            Integer num3 = (Integer) obj5;
                            Object obj6 = jSONObject3 != null ? jSONObject3.get("duration") : null;
                            if (!(obj6 instanceof Integer)) {
                                obj6 = null;
                            }
                            Integer num4 = (Integer) obj6;
                            if (num3 == null || num4 == null) {
                                TMSLogger.d("MegaPlayerInstance", "mega on time update currentTime or duration is null");
                                return;
                            }
                            MegaPlayerInstance.c(MegaPlayerInstance.this, num3.intValue());
                            MegaPlayerInstance megaPlayerInstance2 = MegaPlayerInstance.this;
                            JSONObject jSONObject4 = new JSONObject();
                            JSONObject jSONObject5 = jSONObject4;
                            jSONObject5.put((JSONObject) "currentTime", (String) Float.valueOf(num3.intValue() / 1000.0f));
                            jSONObject5.put((JSONObject) "duration", (String) Float.valueOf(num4.intValue() / 1000.0f));
                            t tVar2 = t.INSTANCE;
                            MegaPlayerInstance.a(megaPlayerInstance2, "onForegroundAudioTimeUpdate", jSONObject4);
                            return;
                        case 105857660:
                            if (!obj2.equals("onEnd")) {
                                return;
                            }
                            if (MegaPlayerInstance.b(MegaPlayerInstance.this)) {
                                MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioEnded", null, 2, null);
                                return;
                            } else {
                                MegaPlayerInstance.g(MegaPlayerInstance.this).a(PlayerState.ENDED);
                                return;
                            }
                        case 1463983852:
                            if (!obj2.equals("onResume") || MegaPlayerInstance.g(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) < 0) {
                                return;
                            }
                            MegaPlayerInstance.g(MegaPlayerInstance.this).a(PlayerState.PLAYING);
                            return;
                        default:
                            return;
                    }
                }
            }
        });
        this.p.a(new qqa.b() { // from class: com.taobao.themis.open.ability.audio.MegaPlayerInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean b;

            @Override // tb.qqa.b
            public void c(ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("30961715", new Object[]{this, page});
                    return;
                }
                q.d(page, "page");
                qqa.b.a.c(this, page);
            }

            @Override // tb.qqa.b
            public void d(ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cb36d996", new Object[]{this, page});
                    return;
                }
                q.d(page, "page");
                qqa.b.a.d(this, page);
            }

            @Override // tb.qqa.b
            public void e(ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("65d79c17", new Object[]{this, page});
                    return;
                }
                q.d(page, "page");
                qqa.b.a.a(this, page);
            }

            @Override // tb.qqa.b
            public void f(ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("785e98", new Object[]{this, page});
                    return;
                }
                q.d(page, "page");
                qqa.b.a.b(this, page);
            }

            @Override // tb.qqa.b
            public void a(ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
                    return;
                }
                q.d(page, "page");
                if (!this.b) {
                    return;
                }
                MegaPlayerInstance.this.a();
                this.b = false;
            }

            @Override // tb.qqa.b
            public void b(ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
                    return;
                }
                q.d(page, "page");
                if (MegaPlayerInstance.this.g()) {
                    return;
                }
                this.b = true;
                MegaPlayerInstance.this.b();
            }
        });
        TMSLogger.b("MegaPlayerInstance", "MegaPlayerInstance: mPlayerId=" + this.o);
    }

    public static final /* synthetic */ String a(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7871d9c", new Object[]{megaPlayerInstance});
        }
        String str = megaPlayerInstance.d;
        if (str == null) {
            q.b("mSrc");
        }
        return str;
    }

    public static final /* synthetic */ void a(MegaPlayerInstance megaPlayerInstance, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9857013a", new Object[]{megaPlayerInstance, new Double(d2)});
        } else {
            megaPlayerInstance.a(d2);
        }
    }

    public static final /* synthetic */ void a(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985713ff", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.l = i2;
        }
    }

    public static final /* synthetic */ void a(MegaPlayerInstance megaPlayerInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1d204e", new Object[]{megaPlayerInstance, str});
        } else {
            megaPlayerInstance.d = str;
        }
    }

    public static final /* synthetic */ void a(MegaPlayerInstance megaPlayerInstance, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7062dc62", new Object[]{megaPlayerInstance, str, jSONObject});
        } else {
            megaPlayerInstance.a(str, jSONObject);
        }
    }

    public static final /* synthetic */ void a(MegaPlayerInstance megaPlayerInstance, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35879c46", new Object[]{megaPlayerInstance, str, new Boolean(z)});
        } else {
            megaPlayerInstance.a(str, z);
        }
    }

    public static final /* synthetic */ void a(MegaPlayerInstance megaPlayerInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985753d0", new Object[]{megaPlayerInstance, new Boolean(z)});
        } else {
            megaPlayerInstance.f(z);
        }
    }

    public static final /* synthetic */ void b(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be69840", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.c(i2);
        }
    }

    public static final /* synthetic */ void b(MegaPlayerInstance megaPlayerInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c10862d", new Object[]{megaPlayerInstance, str});
        } else {
            megaPlayerInstance.b(str);
        }
    }

    public static final /* synthetic */ void b(MegaPlayerInstance megaPlayerInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be6d811", new Object[]{megaPlayerInstance, new Boolean(z)});
        } else {
            megaPlayerInstance.g(z);
        }
    }

    public static final /* synthetic */ boolean b(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e51bf27", new Object[]{megaPlayerInstance})).booleanValue() : megaPlayerInstance.h;
    }

    public static final /* synthetic */ float c(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d2902eb2", new Object[]{megaPlayerInstance})).floatValue() : megaPlayerInstance.i;
    }

    public static final /* synthetic */ void c(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f761c81", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.k = i2;
        }
    }

    public static final /* synthetic */ void c(MegaPlayerInstance megaPlayerInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f765c52", new Object[]{megaPlayerInstance, new Boolean(z)});
        } else {
            megaPlayerInstance.g = z;
        }
    }

    public static final /* synthetic */ int d(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66ce9e54", new Object[]{megaPlayerInstance})).intValue() : megaPlayerInstance.l;
    }

    public static final /* synthetic */ void d(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7305a0c2", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.j = i2;
        }
    }

    public static final /* synthetic */ boolean e(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb0d0e04", new Object[]{megaPlayerInstance})).booleanValue() : megaPlayerInstance.f;
    }

    public static final /* synthetic */ boolean f(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f4b7da3", new Object[]{megaPlayerInstance})).booleanValue() : megaPlayerInstance.g;
    }

    public static final /* synthetic */ b g(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c07c919c", new Object[]{megaPlayerInstance}) : megaPlayerInstance.m;
    }

    public static final /* synthetic */ AtomicBoolean h(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("f9496ddd", new Object[]{megaPlayerInstance}) : megaPlayerInstance.n;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public void a(a.InterfaceC0940a interfaceC0940a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd82bb5", new Object[]{this, interfaceC0940a});
        } else {
            this.f22609a = interfaceC0940a;
        }
    }

    public a.InterfaceC0940a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0940a) ipChange.ipc$dispatch("93e62af3", new Object[]{this}) : this.f22609a;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r0 == null) goto L39;
     */
    @Override // com.taobao.themis.kernel.adapter.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.open.ability.audio.MegaPlayerInstance.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r6
            r1[r3] = r7
            java.lang.String r7 = "f3a64c36"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            r0 = r6
            com.taobao.themis.open.ability.audio.MegaPlayerInstance r0 = (com.taobao.themis.open.ability.audio.MegaPlayerInstance) r0
            java.lang.String r0 = r0.d
            if (r0 == 0) goto L2a
            java.lang.String r7 = "src can not change after setting"
            r6.b(r7)
            return r4
        L2a:
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L38
            int r0 = r0.length()
            if (r0 != 0) goto L36
            goto L38
        L36:
            r0 = 0
            goto L39
        L38:
            r0 = 1
        L39:
            if (r0 == 0) goto L43
            com.taobao.themis.open.ability.audio.MegaPlayerInstance$b r7 = r6.m
            com.taobao.themis.open.ability.audio.MegaPlayerInstance$PlayerState r0 = com.taobao.themis.open.ability.audio.MegaPlayerInstance.PlayerState.ERROR
            r7.a(r0)
            return r4
        L43:
            com.taobao.themis.kernel.page.ITMSPage r0 = r6.p
            com.taobao.themis.kernel.f r0 = r0.b()
            com.taobao.themis.open.utils.ApPathType r0 = tb.toh.a(r7, r0)
            int[] r1 = com.taobao.themis.open.ability.audio.c.$EnumSwitchMapping$0
            int r5 = r0.ordinal()
            r1 = r1[r5]
            if (r1 == r3) goto L93
            if (r1 == r2) goto L93
            r0 = 3
            if (r1 == r0) goto L7c
            r0 = 4
            if (r1 == r0) goto L7c
            r0 = 5
            if (r1 != r0) goto L76
            com.taobao.themis.kernel.page.ITMSPage r0 = r6.p
            java.lang.String r0 = r6.a(r7, r0)
            boolean r7 = kotlin.jvm.internal.q.a(r0, r7)
            if (r7 == 0) goto La6
            com.taobao.themis.open.ability.audio.MegaPlayerInstance$b r7 = r6.m
            com.taobao.themis.open.ability.audio.MegaPlayerInstance$PlayerState r0 = com.taobao.themis.open.ability.audio.MegaPlayerInstance.PlayerState.ERROR
            r7.a(r0)
            return r4
        L76:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L7c:
            com.taobao.themis.open.permission.check.TMSPermissionManager r0 = com.taobao.themis.open.permission.check.TMSPermissionManager.INSTANCE
            com.taobao.themis.kernel.page.ITMSPage r1 = r6.p
            com.taobao.themis.kernel.f r1 = r1.b()
            com.taobao.themis.open.permission.check.TMSPermissionManager$SpecialConfigType r2 = com.taobao.themis.open.permission.check.TMSPermissionManager.SpecialConfigType.RESOURCE
            boolean r0 = r0.a(r1, r7, r2)
            if (r0 != 0) goto La5
            java.lang.String r7 = "please insure your video source is in domain whitelist"
            r6.b(r7)
            return r4
        L93:
            r6.e = r3
            com.taobao.themis.kernel.page.ITMSPage r1 = r6.p
            com.taobao.themis.kernel.f r1 = r1.b()
            java.lang.String r1 = com.taobao.themis.kernel.utils.o.e(r1)
            java.lang.String r0 = tb.toh.a(r1, r7, r0)
            if (r0 != 0) goto La6
        La5:
            r0 = r7
        La6:
            r6.d = r0
            com.taobao.themis.open.ability.audio.MegaPlayerInstance$b r7 = r6.m
            com.taobao.themis.open.ability.audio.MegaPlayerInstance$PlayerState r0 = com.taobao.themis.open.ability.audio.MegaPlayerInstance.PlayerState.START_PREPARE
            r7.a(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.audio.MegaPlayerInstance.a(java.lang.String):boolean");
    }

    public final String k() {
        String b2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        String str = this.d;
        if (str == null) {
            q.b("mSrc");
        }
        int i2 = com.taobao.themis.open.ability.audio.c.$EnumSwitchMapping$1[toh.a(str).ordinal()];
        if (i2 == 1) {
            String e2 = o.e(this.p.b());
            String str2 = this.d;
            if (str2 == null) {
                q.b("mSrc");
            }
            b2 = toh.b(e2, str2, ApPathType.AP_PATH_TYPE_USR);
        } else if (i2 == 2) {
            String e3 = o.e(this.p.b());
            String str3 = this.d;
            if (str3 == null) {
                q.b("mSrc");
            }
            b2 = toh.b(e3, str3, ApPathType.AP_PATH_TYPE_TEMP);
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            b2 = this.d;
            if (b2 == null) {
                q.b("mSrc");
            }
        }
        if (b2 == null) {
            b2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getSrc: mSrc:");
        String str4 = this.d;
        if (str4 == null) {
            q.b("mSrc");
        }
        sb.append(str4);
        sb.append(", src:");
        sb.append(b2);
        TMSLogger.b("MegaPlayerInstance", sb.toString());
        if (b2.length() == 0) {
            z = true;
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getSrc error: mSrc:");
            String str5 = this.d;
            if (str5 == null) {
                q.b("mSrc");
            }
            sb2.append(str5);
            sb2.append(", src is empty");
            TMSLogger.d("MegaPlayerInstance", sb2.toString());
        }
        return b2;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        TMSLogger.b("MegaPlayerInstance", "getAutoPlay: playerId:" + this.o + " autoPlay:" + this.f);
        return this.f;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.m.a().compareTo(PlayerState.PREPARED) > 0) {
            b("autoPlay can not change after setting");
            return false;
        }
        this.f = z;
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        TMSLogger.b("MegaPlayerInstance", "setLoop: " + z + " id=" + this.o);
        this.h = z;
        f(z);
        return true;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        TMSLogger.b("MegaPlayerInstance", "getLoop: " + this.h + " id=" + this.o);
        return this.h;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        TMSLogger.b("MegaPlayerInstance", "getStartTime: " + (this.l / 1000.0f) + " id=" + this.o);
        return this.l / 1000;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.m.a().compareTo(PlayerState.PREPARED) > 0) {
            b("startTime can not change after setting");
            return false;
        }
        this.l = i2 * 1000;
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (f2 < 0 || f2 > 1) {
            TMSLogger.d("MegaPlayerInstance", "setVolume invalid param.");
            return false;
        }
        this.i = f2;
        a(f2);
        return true;
    }

    public final float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b566", new Object[]{this})).floatValue();
        }
        TMSLogger.b("MegaPlayerInstance", "getVolume: " + this.i + " id=" + this.o);
        return this.i;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        if (this.m.a().compareTo(PlayerState.PREPARED) >= 0) {
            return this.j / 1000.0f;
        }
        return 0.0f;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue();
        }
        if (this.m.a().compareTo(PlayerState.PREPARED) >= 0) {
            return this.k / 1000.0f;
        }
        return 0.0f;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.m.a() != PlayerState.PLAYING;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.taobao.themis.kernel.adapter.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        switch (com.taobao.themis.open.ability.audio.c.$EnumSwitchMapping$2[this.m.a().ordinal()]) {
            case 1:
                b("src is null , can not play");
                return false;
            case 2:
                this.e = false;
                this.g = true;
                return true;
            case 3:
                String str = this.d;
                if (str == null) {
                    q.b("mSrc");
                }
                a(str, this.l);
                return true;
            case 4:
                this.l = 0;
                q();
                return true;
            case 5:
                String str2 = this.d;
                if (str2 == null) {
                    q.b("mSrc");
                }
                a(str2, 0);
                this.m.a(PlayerState.PLAYING);
                return true;
            case 6:
                break;
            case 7:
                q();
                break;
            case 8:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        int i2 = com.taobao.themis.open.ability.audio.c.$EnumSwitchMapping$3[this.m.a().ordinal()];
        if (i2 == 1) {
            b("src is null , can not pause");
            return false;
        } else if (i2 != 2) {
            return false;
        } else {
            p();
            this.m.a(PlayerState.PAUSED);
            return true;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        int i3 = com.taobao.themis.open.ability.audio.c.$EnumSwitchMapping$4[this.m.a().ordinal()];
        if (i3 == 1) {
            b("call seek only support in play or paused status ,not stop");
            return false;
        } else if (i3 == 2 || i3 == 3) {
            b("can not seek before onCanPlay");
            return false;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                this.k = i2;
                c(i2 * 1000);
                return true;
            }
            c(i2 * 1000);
            return true;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        int i2 = com.taobao.themis.open.ability.audio.c.$EnumSwitchMapping$5[this.m.a().ordinal()];
        if (i2 == 1) {
            b("src is null , can not stop");
            return false;
        }
        if (i2 != 2) {
            r();
            this.m.a(PlayerState.STOP);
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.adapter.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        r();
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str = this.c;
        String str2 = this.o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "audio");
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str, str2, "AudioContext", "destroy", jSONObject, c.INSTANCE);
    }

    private final String a(String str, ITMSPage iTMSPage) {
        String str2;
        File parentFile;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c4eaa63", new Object[]{this, str, iTMSPage});
        }
        byte[] b2 = toj.b(str, iTMSPage.b());
        if (b2 == null) {
            return str;
        }
        String a2 = com.taobao.themis.utils.io.e.a(com.taobao.themis.utils.io.g.a(b2));
        if (a2.length() == 0) {
            return str;
        }
        this.e = true;
        int b3 = n.b((CharSequence) str, ".", 0, false, 6, (Object) null);
        if (b3 == -1) {
            str2 = ".mp3";
        } else if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else {
            str2 = str.substring(b3);
            q.b(str2, "(this as java.lang.String).substring(startIndex)");
        }
        String e2 = o.e(iTMSPage.b());
        String a3 = toh.a(e2, "https://tmp/audio/" + a2 + str2, ApPathType.AP_PATH_TYPE_TEMP);
        String str3 = a3;
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        if (z) {
            return str;
        }
        File file = new File(a3);
        if (file.exists() && file.length() == b2.length) {
            String absolutePath = file.getAbsolutePath();
            q.b(absolutePath, "file.absolutePath");
            return absolutePath;
        }
        try {
            File parentFile2 = file.getParentFile();
            if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = file.getParentFile()) != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        } catch (Exception e3) {
            TMSLogger.b("MegaPlayerInstance", "create local audio file failed: " + a3 + ", " + e3.getMessage(), e3);
        }
        com.taobao.themis.open.ability.file.a aVar = com.taobao.themis.open.ability.file.a.INSTANCE;
        com.taobao.themis.kernel.f b4 = iTMSPage.b();
        ByteBuffer wrap = ByteBuffer.wrap(b2);
        q.b(wrap, "ByteBuffer.wrap(audioData)");
        aVar.a(b4, a3, wrap, "ArrayBuffer", new d(a3));
        String absolutePath2 = file.getAbsolutePath();
        q.b(absolutePath2, "file.absolutePath");
        return absolutePath2;
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TMSLogger.d("MegaPlayerInstance", "broadcastError id=" + this.o + " ,error = " + str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "audioPlayerID", this.o);
        jSONObject3.put((JSONObject) "error", str);
        t tVar = t.INSTANCE;
        jSONObject.put((JSONObject) "data", (String) jSONObject2);
        if (i() != null) {
            a.InterfaceC0940a i2 = i();
            if (i2 == null) {
                return;
            }
            i2.a("onForegroundAudioError", jSONObject);
            return;
        }
        this.p.a("onForegroundAudioError", jSONObject);
    }

    public static /* synthetic */ void a(MegaPlayerInstance megaPlayerInstance, String str, JSONObject jSONObject, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b87c7d", new Object[]{megaPlayerInstance, str, jSONObject, new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            jSONObject = new JSONObject();
        }
        megaPlayerInstance.a(str, jSONObject);
    }

    private final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put((JSONObject) "audioPlayerID", this.o);
        t tVar = t.INSTANCE;
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        if (i() != null) {
            a.InterfaceC0940a i2 = i();
            if (i2 == null) {
                return;
            }
            i2.a(str, jSONObject2);
            return;
        }
        this.p.a(str, jSONObject2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance$PlayerStateMachine;", "", "(Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance;)V", "state", "Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance$PlayerState;", "getState", "switchState", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private PlayerState b = PlayerState.INIT;

        static {
            kge.a(-857397402);
        }

        public b() {
        }

        public final void a(PlayerState state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69c10698", new Object[]{this, state});
                return;
            }
            q.d(state, "state");
            if (state == this.b) {
                return;
            }
            this.b = state;
            switch (com.taobao.themis.open.ability.audio.b.$EnumSwitchMapping$0[state.ordinal()]) {
                case 1:
                default:
                    return;
                case 2:
                    MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioWaiting", null, 2, null);
                    MegaPlayerInstance megaPlayerInstance = MegaPlayerInstance.this;
                    MegaPlayerInstance.a(megaPlayerInstance, MegaPlayerInstance.a(megaPlayerInstance), MegaPlayerInstance.b(MegaPlayerInstance.this));
                    return;
                case 3:
                    MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioCanPlay", null, 2, null);
                    MegaPlayerInstance megaPlayerInstance2 = MegaPlayerInstance.this;
                    MegaPlayerInstance.a(megaPlayerInstance2, MegaPlayerInstance.b(megaPlayerInstance2));
                    MegaPlayerInstance megaPlayerInstance3 = MegaPlayerInstance.this;
                    MegaPlayerInstance.a(megaPlayerInstance3, MegaPlayerInstance.c(megaPlayerInstance3));
                    MegaPlayerInstance.b(MegaPlayerInstance.this, false);
                    if (MegaPlayerInstance.d(MegaPlayerInstance.this) > 0) {
                        MegaPlayerInstance megaPlayerInstance4 = MegaPlayerInstance.this;
                        MegaPlayerInstance.b(megaPlayerInstance4, MegaPlayerInstance.d(megaPlayerInstance4));
                    }
                    if (!MegaPlayerInstance.e(MegaPlayerInstance.this) && !MegaPlayerInstance.f(MegaPlayerInstance.this)) {
                        return;
                    }
                    com.taobao.themis.kernel.utils.a.a(new MegaPlayerInstance$PlayerStateMachine$switchState$1(this), 0L, 2, null);
                    return;
                case 4:
                    MegaPlayerInstance.c(MegaPlayerInstance.this, false);
                    MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioPlay", null, 2, null);
                    return;
                case 5:
                    MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioPause", null, 2, null);
                    return;
                case 6:
                    MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioEnded", null, 2, null);
                    return;
                case 7:
                    MegaPlayerInstance.c(MegaPlayerInstance.this, false);
                    MegaPlayerInstance.a(MegaPlayerInstance.this, 0);
                    MegaPlayerInstance.c(MegaPlayerInstance.this, 0);
                    MegaPlayerInstance.a(MegaPlayerInstance.this, "onForegroundAudioStop", null, 2, null);
                    return;
            }
        }

        public final PlayerState a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PlayerState) ipChange.ipc$dispatch("70918418", new Object[]{this}) : this.b;
        }
    }

    private final void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "prepareByMega: " + str + ", " + z);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str2 = this.c;
        String str3 = this.o;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "src", str);
        jSONObject2.put((JSONObject) "shouldLoop", (String) Boolean.valueOf(z));
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str2, str3, "AudioContext", "prepare", jSONObject, g.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class g implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final g INSTANCE = new g();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void a(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i2)});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "playByMega: " + str + ", " + i2);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str2 = this.c;
        String str3 = this.o;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "src", str);
        jSONObject2.put((JSONObject) "startPosition", (String) Integer.valueOf(i2));
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str2, str3, "AudioContext", "play", jSONObject, f.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final f INSTANCE = new f();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "pauseByMega");
        com.taobao.themis.kernel.ability.a.a().a(this.p.b(), TMSCalendarBridge.namespace, this.c, this.o, "AudioContext", "pause", new JSONObject(), e.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "resumeByMega");
        com.taobao.themis.kernel.ability.a.a().a(this.p.b(), TMSCalendarBridge.namespace, this.c, this.o, "AudioContext", "play", new JSONObject(), h.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class h implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final h INSTANCE = new h();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "stopByMega");
        com.taobao.themis.kernel.ability.a.a().a(this.p.b(), TMSCalendarBridge.namespace, this.c, this.o, "AudioContext", "stop", new JSONObject(), m.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class m implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final m INSTANCE = new m();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "seekByMega id=" + this.o + " ,position = " + i2);
        this.n.set(true);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str = this.c;
        String str2 = this.o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "position", (String) Integer.valueOf(i2));
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str, str2, "AudioContext", "seek", jSONObject, i.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class i implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final i INSTANCE = new i();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void a(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d2)});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "setVolumeByMega: " + d2);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str = this.c;
        String str2 = this.o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "value", (String) Double.valueOf(d2));
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str, str2, "AudioContext", CommandID.setVolume, jSONObject, l.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class l implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final l INSTANCE = new l();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "setLoopByMega: " + z);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str = this.c;
        String str2 = this.o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "value", (String) Boolean.valueOf(z));
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str, str2, "AudioContext", "setLoop", jSONObject, j.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class j implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final j INSTANCE = new j();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    private final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "setPauseInBackground: " + z);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        com.taobao.themis.kernel.f b2 = this.p.b();
        String str = this.c;
        String str2 = this.o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "value", (String) Boolean.valueOf(z));
        t tVar = t.INSTANCE;
        a2.a(b2, TMSCalendarBridge.namespace, str, str2, "AudioContext", "setPauseInBackground", jSONObject, k.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class k implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final k INSTANCE = new k();

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                return;
            }
            TMSLogger.d("MegaPlayerInstance", "mega fail! " + data.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance$Companion;", "", "()V", "ON_CAN_PLAY", "", "ON_ENDED", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, "ON_PAUSE", "ON_PLAY", "ON_SEEKED", "ON_SEEKING", "ON_STOP", "ON_TIME_UPDATE", "ON_WAITING", RPCDataItems.SWITCH_TAG_LOG, "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1685685571);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}

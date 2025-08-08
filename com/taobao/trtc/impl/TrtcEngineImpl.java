package com.taobao.trtc.impl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.j3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.ACCSClient;
import com.taobao.artc.internal.ArtcEngineEventProxy;
import com.taobao.common.inspector.SystemProperties;
import com.taobao.trtc.api.ITrtcCallInterface;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.ITrtcOutputStream;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcException;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.api.TrtcVideoDevice;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.impl.b;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.TrtcPhoneStats;
import com.taobao.trtc.video.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.NativeLibrary;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoFrame;
import org.webrtc.audio.WebRtcExtProcessAudioFrame;
import tb.kge;
import tb.kgj;
import tb.qvb;
import tb.qvc;

/* loaded from: classes9.dex */
public class TrtcEngineImpl extends com.taobao.trtc.api.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.trtc.utils.f b;
    private TrtcDefines.TrtcWorkMode e;
    private l f;
    private a g;
    private e h;
    private TrtcPhoneStats i;
    private f j;
    private final com.taobao.trtc.utils.i k;
    private final k n;
    private c o;
    private TrtcDefines.h q;
    private TrtcInnerDefines.TrtcMakeCallParams r;
    private TrtcInnerDefines.TrtcAnswerCallParams s;
    private TrtcDefines.g t;
    private String w;
    private TrtcStreamProcessorImpl y;
    private final TrtcInnerConfig c = new TrtcInnerConfig();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicLong l = new AtomicLong(0);
    private volatile boolean m = false;
    private TrtcDefines.TrtcMixMode p = TrtcDefines.TrtcMixMode.MIX_LOCAL;
    private final AtomicBoolean u = new AtomicBoolean(false);
    private qvc v = null;
    private com.taobao.trtc.video.e x = null;
    private final Handler z = new Handler(Looper.getMainLooper()) { // from class: com.taobao.trtc.impl.TrtcEngineImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            TrtcEngineImpl.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                TrtcEngineImpl.a(TrtcEngineImpl.this);
            } else if (i == 1) {
                if (TrtcEngineImpl.b(TrtcEngineImpl.this) == null) {
                    return;
                }
                TrtcEngineImpl.b(TrtcEngineImpl.this).a((Handler) null);
            } else if (i == 2) {
                if (TrtcEngineImpl.b(TrtcEngineImpl.this) == null) {
                    return;
                }
                TrtcEngineImpl.b(TrtcEngineImpl.this).b((Handler) null);
            } else if (i != 3) {
            } else {
                AtomicBoolean d = TrtcEngineImpl.d(TrtcEngineImpl.this);
                if (TrtcEngineImpl.c(TrtcEngineImpl.this).get() != 0) {
                    z = true;
                }
                d.set(z);
                com.taobao.trtc.utils.h.a("TrtcEngine", "trtc natiave initialize done, native engine: 0x" + Long.toHexString(TrtcEngineImpl.c(TrtcEngineImpl.this).get()));
                TrtcEngineImpl.a(TrtcEngineImpl.this, new TrtcPhoneStats(h.f23132a, TrtcEngineImpl.e(TrtcEngineImpl.this)));
                TrtcEngineImpl.f(TrtcEngineImpl.this).a();
                if (TrtcEngineImpl.g(TrtcEngineImpl.this) == null) {
                    return;
                }
                TrtcEngineImpl.g(TrtcEngineImpl.this).a(TrtcEngineImpl.d(TrtcEngineImpl.this).get());
            }
        }
    };

    static {
        kge.a(1086617167);
    }

    public static /* synthetic */ Object ipc$super(TrtcEngineImpl trtcEngineImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$DJu5wcw2T8JC3bttw3JAAMWDTHw(TrtcEngineImpl trtcEngineImpl, String str, String str2, String str3) {
        trtcEngineImpl.c(str, str2, str3);
    }

    public static /* synthetic */ void lambda$KsXICK0J_g7LMpUw0slLsz14bPs(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams) {
        trtcEngineImpl.b(trtcCancelCallParams);
    }

    /* renamed from: lambda$MGrDAtqprx_0a-F9WW1lD9GmTJU */
    public static /* synthetic */ void m1545lambda$MGrDAtqprx_0aF9WW1lD9GmTJU(TrtcEngineImpl trtcEngineImpl, boolean z, String str) {
        trtcEngineImpl.a(z, str);
    }

    public static /* synthetic */ void lambda$PHr1lXDhLwvCaJVy25VslWNEipM(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        trtcEngineImpl.b(trtcVideoLayoutParams);
    }

    /* renamed from: lambda$_hymOHg-XxW1nydguYPepVXbxos */
    public static /* synthetic */ void m1546lambda$_hymOHgXxW1nydguYPepVXbxos(TrtcEngineImpl trtcEngineImpl, String str) {
        trtcEngineImpl.k(str);
    }

    public static /* synthetic */ void lambda$amcqWPTXWlNZpb_WeMfHIXfLEMs(TrtcEngineImpl trtcEngineImpl, boolean z) {
        trtcEngineImpl.h(z);
    }

    /* renamed from: lambda$baE-EpO8zsM70EM8oZHVQRi4k2w */
    public static /* synthetic */ void m1547lambda$baEEpO8zsM70EM8oZHVQRi4k2w(TrtcEngineImpl trtcEngineImpl, Map map) {
        trtcEngineImpl.b(map);
    }

    public static /* synthetic */ void lambda$fq6GK1hwiNnYmnTL02cQj4hMV1Q(TrtcEngineImpl trtcEngineImpl, String str, String str2, String str3, String str4) {
        trtcEngineImpl.b(str, str2, str3, str4);
    }

    public static /* synthetic */ void lambda$k_NmX6vdikiw0GQu4F4mMxn4j2g(TrtcEngineImpl trtcEngineImpl, ArrayList arrayList, boolean z, boolean z2) {
        trtcEngineImpl.b(arrayList, z, z2);
    }

    public static /* synthetic */ void lambda$zoHko4AjAzp_HmsnxbDQpowV8Kg(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo) {
        trtcEngineImpl.b(trtcLocalVideoFreezeInfo);
    }

    private native void nativeAnswerCall(TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams);

    private native void nativeCancelCall(TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams);

    private native String nativeCreateChannelId(String str);

    private native void nativeCustomUt(String str, boolean z, boolean z2);

    private native String nativeGetVersion();

    private native void nativeHangUpCall(TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams);

    private native long nativeInitialize(TrtcInnerConfig trtcInnerConfig, int i, long j);

    private native void nativeJoinChannel(TrtcInnerDefines.TrtcJoinChannelParams trtcJoinChannelParams);

    private native void nativeLeaveChannel(String str, int i, String str2);

    private native void nativeMakeCall(TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams);

    private native void nativeMuteAudio(boolean z, boolean z2, String str, String str2);

    private native void nativeMuteRemoteAudio(ArrayList<String> arrayList, boolean z, boolean z2);

    private native void nativeNotifyChannel(String str, String str2, int i, boolean z, boolean z2, String str3);

    private native void nativeSendChannelBroadcastMsg(String str, String str2, String str3);

    private native void nativeSendCustomMessage(String str, String str2, String str3, String str4);

    private native void nativeSendData(String str, byte[] bArr, int i);

    private native void nativeSetLocalVideoFreeze(TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo);

    private native void nativeSetRemoteVideoFreeze(TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams);

    private native void nativeSetVideoLayout(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams);

    private native int nativeStartLive(TrtcInnerDefines.StartLiveParams startLiveParams);

    private native String nativeStartStreamProcess(TrtcInnerDefines.TrtcStreamProcessParams trtcStreamProcessParams);

    private native void nativeStopLive();

    private native void nativeStopStreamProcess(String str, String str2, String str3);

    private native void nativeUnInitialize();

    private native void nativeUpdateAudioProcessConfig(boolean z, boolean z2, int i);

    private native void nativeUpdateStream(TrtcInnerDefines.TrtcUpdateStreamParams trtcUpdateStreamParams);

    public static /* synthetic */ int a(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.StartLiveParams startLiveParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac3c44eb", new Object[]{trtcEngineImpl, startLiveParams})).intValue() : trtcEngineImpl.nativeStartLive(startLiveParams);
    }

    public static /* synthetic */ long a(TrtcEngineImpl trtcEngineImpl, TrtcInnerConfig trtcInnerConfig, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a838f5c3", new Object[]{trtcEngineImpl, trtcInnerConfig, new Integer(i), new Long(j)})).longValue() : trtcEngineImpl.nativeInitialize(trtcInnerConfig, i, j);
    }

    public static /* synthetic */ TrtcPhoneStats a(TrtcEngineImpl trtcEngineImpl, TrtcPhoneStats trtcPhoneStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcPhoneStats) ipChange.ipc$dispatch("2b6016ec", new Object[]{trtcEngineImpl, trtcPhoneStats});
        }
        trtcEngineImpl.i = trtcPhoneStats;
        return trtcPhoneStats;
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("699c7b2a", new Object[]{trtcEngineImpl});
        } else {
            trtcEngineImpl.A();
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e331d35", new Object[]{trtcEngineImpl, trtcAnswerCallParams});
        } else {
            trtcEngineImpl.nativeAnswerCall(trtcAnswerCallParams);
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f491e2a6", new Object[]{trtcEngineImpl, trtcHangUpCallParams});
        } else {
            trtcEngineImpl.nativeHangUpCall(trtcHangUpCallParams);
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcJoinChannelParams trtcJoinChannelParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d3835a", new Object[]{trtcEngineImpl, trtcJoinChannelParams});
        } else {
            trtcEngineImpl.nativeJoinChannel(trtcJoinChannelParams);
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb43fcc5", new Object[]{trtcEngineImpl, trtcMakeCallParams});
        } else {
            trtcEngineImpl.nativeMakeCall(trtcMakeCallParams);
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcUpdateStreamParams trtcUpdateStreamParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b585a8", new Object[]{trtcEngineImpl, trtcUpdateStreamParams});
        } else {
            trtcEngineImpl.nativeUpdateStream(trtcUpdateStreamParams);
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac837719", new Object[]{trtcEngineImpl, str, new Integer(i), str2});
        } else {
            trtcEngineImpl.nativeLeaveChannel(str, i, str2);
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, String str, String str2, int i, boolean z, boolean z2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6575e74f", new Object[]{trtcEngineImpl, str, str2, new Integer(i), new Boolean(z), new Boolean(z2), str3});
        } else {
            trtcEngineImpl.nativeNotifyChannel(str, str2, i, z, z2, str3);
        }
    }

    public static /* synthetic */ void a(TrtcEngineImpl trtcEngineImpl, boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b962519", new Object[]{trtcEngineImpl, new Boolean(z), new Boolean(z2), new Integer(i)});
        } else {
            trtcEngineImpl.nativeUpdateAudioProcessConfig(z, z2, i);
        }
    }

    public static /* synthetic */ a b(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1a07323b", new Object[]{trtcEngineImpl}) : trtcEngineImpl.g;
    }

    public static /* synthetic */ AtomicLong c(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("854439ca", new Object[]{trtcEngineImpl}) : trtcEngineImpl.l;
    }

    public static /* synthetic */ AtomicBoolean d(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("99c47707", new Object[]{trtcEngineImpl}) : trtcEngineImpl.d;
    }

    public static /* synthetic */ f e(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3459ad9", new Object[]{trtcEngineImpl}) : trtcEngineImpl.j;
    }

    public static /* synthetic */ TrtcPhoneStats f(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcPhoneStats) ipChange.ipc$dispatch("675472d5", new Object[]{trtcEngineImpl}) : trtcEngineImpl.i;
    }

    public static /* synthetic */ e g(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9ec48abc", new Object[]{trtcEngineImpl}) : trtcEngineImpl.h;
    }

    public static /* synthetic */ k h(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("ec840377", new Object[]{trtcEngineImpl}) : trtcEngineImpl.n;
    }

    public static /* synthetic */ TrtcInnerConfig i(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcInnerConfig) ipChange.ipc$dispatch("33c8a478", new Object[]{trtcEngineImpl}) : trtcEngineImpl.c;
    }

    public static /* synthetic */ l j(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("8802f398", new Object[]{trtcEngineImpl}) : trtcEngineImpl.f;
    }

    public static /* synthetic */ Handler k(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a8dcc466", new Object[]{trtcEngineImpl}) : trtcEngineImpl.z;
    }

    public static /* synthetic */ void l(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5c37f", new Object[]{trtcEngineImpl});
        } else {
            trtcEngineImpl.z();
        }
    }

    public static /* synthetic */ com.taobao.trtc.utils.i m(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.trtc.utils.i) ipChange.ipc$dispatch("fbefeeb3", new Object[]{trtcEngineImpl}) : trtcEngineImpl.k;
    }

    public static /* synthetic */ void n(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c02dbd", new Object[]{trtcEngineImpl});
        } else {
            trtcEngineImpl.nativeStopLive();
        }
    }

    public static /* synthetic */ TrtcDefines.g o(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcDefines.g) ipChange.ipc$dispatch("390edf63", new Object[]{trtcEngineImpl}) : trtcEngineImpl.t;
    }

    public TrtcEngineImpl(Context context) throws TrtcException {
        com.taobao.trtc.utils.b.a("context is null", context);
        com.taobao.trtc.utils.b.a("Trtc engine create");
        TrtcLog.d("TrtcEngine", "new trtcEngine, " + this);
        this.n = new k(this.z);
        h.f23132a = context.getApplicationContext();
        this.k = new com.taobao.trtc.utils.i();
        this.b = new com.taobao.trtc.utils.f();
        this.b.a(h.f23132a, (com.taobao.common.inspector.c) null);
    }

    public static void a(Context context, boolean z, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb31df85", new Object[]{context, new Boolean(z), str, str2, new Integer(i), str3});
            return;
        }
        if (!str3.isEmpty()) {
            com.taobao.trtc.accs.a.a(str3);
        }
        com.taobao.trtc.accs.a.b(str2);
        com.taobao.trtc.accs.a.a(i);
        com.taobao.trtc.accs.a.a(context, (ArtcEngineEventProxy) null, z);
        TrtcSignalChannel.a(TrtcSignalChannel.f23181a, str);
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        com.taobao.trtc.accs.a.b();
        TrtcSignalChannel.a();
    }

    public void c(TrtcConfig trtcConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ca3b26", new Object[]{this, trtcConfig});
            return;
        }
        com.taobao.trtc.utils.c cVar = new com.taobao.trtc.utils.c();
        cVar.d = trtcConfig.getAppKey();
        cVar.b = trtcConfig.getUserId();
        cVar.c = trtcConfig.getDeviceId();
        try {
            if (NativeLibrary.isLoaded()) {
                cVar.e = nativeGetVersion();
            }
        } catch (Throwable th) {
            TrtcLog.a("TrtcEngine", "native load error: " + th.getMessage());
            cVar.e = "unkown";
        }
        cVar.f = trtcConfig.getServerName();
        com.taobao.trtc.utils.h.a(cVar);
    }

    public static void onLogCallback(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963aaa9c", new Object[]{new Integer(i), str});
        } else {
            TrtcLog.a(i, str);
        }
    }

    public void onNativeEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cad8842", new Object[]{this, new Integer(i), str});
            return;
        }
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.a(i, str);
    }

    public Object[] onGetIPFromHttpDns(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("ed5656eb", new Object[]{this, str}) : com.taobao.trtc.utils.d.a(str);
    }

    public void onAudioFrame(WebRtcExtProcessAudioFrame webRtcExtProcessAudioFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffaf422", new Object[]{this, webRtcExtProcessAudioFrame});
            return;
        }
        a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.a(webRtcExtProcessAudioFrame);
    }

    public void onVideoFrame(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37b7b36", new Object[]{this, str, videoFrame});
            return;
        }
        l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.a(str, videoFrame);
    }

    public void onSei(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa76013", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("TrtcEngine", "recv sei, id: " + str + ", len: " + str2.length());
        l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.a(str, str2);
    }

    public void onData(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543e2ce2", new Object[]{this, str, bArr, new Integer(i)});
            return;
        }
        l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.a(str, bArr, i);
    }

    public TrtcInnerConfig i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcInnerConfig) ipChange.ipc$dispatch("76afd8ea", new Object[]{this}) : this.c;
    }

    public c j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4ed285d1", new Object[]{this});
        }
        if (this.o == null) {
            this.o = new c();
        }
        return this.o;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TrtcLog.d("TrtcEngine", "updateAudioProcessConfig ");
                    TrtcEngineImpl trtcEngineImpl = TrtcEngineImpl.this;
                    TrtcEngineImpl.a(trtcEngineImpl, TrtcEngineImpl.b(trtcEngineImpl).e(), TrtcEngineImpl.b(TrtcEngineImpl.this).d(), TrtcEngineImpl.b(TrtcEngineImpl.this).c());
                }
            });
        }
    }

    public void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.g == null) {
            TrtcLog.a("TrtcEngine", "mute local audio error");
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "mute local: " + z);
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$amcqWPTXWlNZpb_WeMfHIXfLEMs
            {
                TrtcEngineImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TrtcEngineImpl.lambda$amcqWPTXWlNZpb_WeMfHIXfLEMs(TrtcEngineImpl.this, z);
            }
        });
    }

    public /* synthetic */ void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            nativeMuteAudio(true, z, "", "");
        }
    }

    public void a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (this.g == null) {
            TrtcLog.a("TrtcEngine", "mute remote audio error");
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "mute remote id: " + str + ", mute: " + z);
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$MGrDAtqprx_0a-F9WW1lD9GmTJU
            {
                TrtcEngineImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TrtcEngineImpl.m1545lambda$MGrDAtqprx_0aF9WW1lD9GmTJU(TrtcEngineImpl.this, z, str);
            }
        });
    }

    public /* synthetic */ void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else {
            nativeMuteAudio(false, z, "", str);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    public synchronized void a(TrtcDefines.i iVar, TrtcDefines.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580bb423", new Object[]{this, iVar, nVar});
            return;
        }
        if (this.f != null) {
            this.f.a(iVar, nVar);
        }
    }

    public void a(TrtcDefines.TrtcMixMode trtcMixMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c4b2a4", new Object[]{this, trtcMixMode});
            return;
        }
        this.p = trtcMixMode;
        l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.a(trtcMixMode);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.u.set(z);
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.u.get();
    }

    public TrtcStreamProcessorImpl m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcStreamProcessorImpl) ipChange.ipc$dispatch("25a7c4ac", new Object[]{this}) : this.y;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.u.get();
    }

    public void b(String str, boolean z) {
        ITrtcInputStream iTrtcInputStream;
        TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "Call setup, remote user id: " + str + ", mixMode: " + this.p);
        this.u.set(true);
        j().a(str, TrtcInnerDefines.CallState.E_CALL_SETUP);
        l lVar = this.f;
        if (lVar != null) {
            lVar.d(str);
            this.f.a(this.p);
        }
        if (z && (trtcMakeCallParams = this.r) != null) {
            iTrtcInputStream = trtcMakeCallParams.inputStream;
        } else {
            TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams = this.s;
            if (trtcAnswerCallParams != null) {
                iTrtcInputStream = trtcAnswerCallParams.inputStream;
            } else {
                TrtcLog.a("TrtcEngine", "Call setup , but can not get cached call params");
                return;
            }
        }
        f fVar = this.j;
        if (fVar == null) {
            return;
        }
        String streamId = iTrtcInputStream.streamId();
        if (this.p == TrtcDefines.TrtcMixMode.MIX_LOCAL) {
            z2 = true;
        }
        fVar.a(streamId, z2);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "Call destory, remote user id: " + str);
        this.u.set(false);
        this.p = TrtcDefines.TrtcMixMode.MIX_LOCAL;
        j().a(str);
        l lVar = this.f;
        if (lVar != null) {
            lVar.stopSubCapture();
        }
        i(str);
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        if (this.d.get()) {
            return true;
        }
        com.taobao.trtc.utils.h.b("TrtcEngine", "trtc engine need initialize first, api: " + str);
        return false;
    }

    public static TrtcInnerDefines.LocalMediaConfig a(ITrtcInputStream iTrtcInputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInnerDefines.LocalMediaConfig) ipChange.ipc$dispatch("7d7f3cd6", new Object[]{iTrtcInputStream});
        }
        TrtcInnerDefines.LocalMediaConfig localMediaConfig = new TrtcInnerDefines.LocalMediaConfig();
        if (iTrtcInputStream != null) {
            TrtcStreamConfig streamConfig = iTrtcInputStream.streamConfig();
            if (streamConfig != null) {
                localMediaConfig.videoMaxHeight = streamConfig.getVideoHeight();
                localMediaConfig.videoMaxWidth = streamConfig.getVideoWidth();
                localMediaConfig.videoMaxFps = streamConfig.getVideoFps();
                localMediaConfig.audioEnable = streamConfig.isAudioEnable();
                localMediaConfig.videoEnable = streamConfig.isVideoEnable();
                localMediaConfig.dataEnable = streamConfig.isDataEnable();
            }
        } else {
            localMediaConfig.videoEnable = false;
            localMediaConfig.dataEnable = false;
            localMediaConfig.audioEnable = true;
        }
        return localMediaConfig;
    }

    @Override // com.taobao.trtc.api.e
    public void b() throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - unInitiaEngine");
        com.taobao.trtc.utils.b.a("unInitiaEngine()");
        d(true);
    }

    @Override // com.taobao.trtc.api.e
    public boolean a(TrtcConfig trtcConfig) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c7a9428", new Object[]{this, trtcConfig})).booleanValue();
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - initialize");
        com.taobao.trtc.utils.b.a("initialize()");
        if (trtcConfig != null && k.a(this, trtcConfig.getServerName())) {
            d(this.n.c(this.c.config.getServerName()));
        }
        return a(trtcConfig, false);
    }

    private synchronized boolean a(final TrtcConfig trtcConfig, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22d8a334", new Object[]{this, trtcConfig, new Boolean(z)})).booleanValue();
        }
        if (h.f23132a != null && trtcConfig != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.d.get()) {
                TrtcLog.a("TrtcEngine", "engine already initialized");
            }
            com.taobao.artc.utils.a.c();
            qvc.a();
            c(trtcConfig);
            qvb.a(qvc.a(h.TRTC_ORANGE_DEF_BOOL_ENABLE_AVCODEC_REMOTE_CHECK, true));
            PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(h.f23132a).setNativeLibraryName("artc_engine").createInitializationOptions());
            if (!NativeLibrary.isLoaded()) {
                com.taobao.trtc.utils.h.a("TrtcEngine", "artc native library load error");
                return false;
            }
            this.b.a();
            d(trtcConfig);
            com.taobao.trtc.utils.h.a("TrtcEngine", " trtc initialize with config: " + trtcConfig.ToString());
            this.j = new f(trtcConfig.getEngineObserver(), trtcConfig.getChannelEventObserver(), trtcConfig.getCallEventObserver(), trtcConfig.getEventHandler());
            if (this.h == null) {
                this.h = new e(this, this.j);
            }
            this.g = new a(this, this.j);
            this.g.a();
            this.g.a(true);
            TrtcLog.d("TrtcEngine", "trtc audio device init done");
            this.w = trtcConfig.getUserId();
            this.f = new l(this, this.j);
            this.f.b();
            TrtcLog.d("TrtcEngine", "trtc video device init done");
            this.u.set(false);
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AtomicLong c = TrtcEngineImpl.c(TrtcEngineImpl.this);
                    TrtcEngineImpl trtcEngineImpl = TrtcEngineImpl.this;
                    c.set(TrtcEngineImpl.a(trtcEngineImpl, TrtcEngineImpl.i(trtcEngineImpl), TrtcEngineImpl.i(TrtcEngineImpl.this).getEngineConfigFlags(), TrtcEngineImpl.j(TrtcEngineImpl.this).g()));
                    if (!z) {
                        TrtcEngineImpl.h(TrtcEngineImpl.this).a(trtcConfig, false);
                    }
                    TrtcEngineImpl.h(TrtcEngineImpl.this).a(trtcConfig.getServerName(), true);
                    TrtcEngineImpl.k(TrtcEngineImpl.this).sendEmptyMessage(3);
                }
            });
            this.d.set(true);
            com.taobao.trtc.utils.h.a("TrtcEngine", "trtc initialize done, elapsed:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            return true;
        }
        TrtcLog.a("TrtcEngine", "initializeInternal error, var error");
        return false;
    }

    @Override // com.taobao.trtc.api.e
    public void c() throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - unInitialize");
        com.taobao.trtc.utils.b.a("unInitialize()");
        d(false);
    }

    public synchronized void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (!this.d.get()) {
            TrtcLog.a("TrtcEngine", "no need uninitialize");
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "trtc unInitialize start");
            if (!z) {
                this.n.a(this.c.config.getServerName());
            } else {
                this.n.a(this.c.config.getServerName(), false);
            }
            f(false);
            if (this.o != null) {
                this.o.a();
                this.o = null;
            }
            this.u.set(false);
            B();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    try {
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TrtcEngineImpl.l(TrtcEngineImpl.this);
                        }
                    } catch (Exception e) {
                        com.taobao.trtc.utils.h.a("TrtcEngine", "trtc unInitialize exception: " + e.getMessage() + " ms");
                    } finally {
                        TrtcEngineImpl.m(TrtcEngineImpl.this).a(0);
                    }
                }
            });
            this.k.a(0, 3000);
            qvc.b();
            this.h = null;
            this.j = null;
            this.x = null;
            com.taobao.artc.utils.a.b();
            this.d.set(false);
            com.taobao.trtc.utils.h.a("TrtcEngine", "trtc unInitialize done, elapsed: " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - registeUser: " + str);
        com.taobao.trtc.accs.a.e(str);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - unRegisteUser: " + i().config.getUserId());
        com.taobao.trtc.accs.a.a();
    }

    @Override // com.taobao.trtc.api.e
    public synchronized ITrtcInputStream a(String str, TrtcStreamConfig trtcStreamConfig, ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("9d5a28e5", new Object[]{this, str, trtcStreamConfig, aVar});
        } else if (!f("createInputStream")) {
            return null;
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - createInputStream, id: " + str);
            return this.f.a(str, trtcStreamConfig, aVar);
        }
    }

    @Override // com.taobao.trtc.api.e
    public synchronized void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!f("releaseInputStream")) {
            TrtcLog.a("TrtcEngine", "trtc engine need initialize success first");
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - releaseInputStream, id: " + str);
            this.z.post(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrtcEngineImpl.j(TrtcEngineImpl.this).a(str);
                    }
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.e
    public synchronized ITrtcOutputStream b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcOutputStream) ipChange.ipc$dispatch("18c97051", new Object[]{this, str});
        }
        return h(str);
    }

    @Override // com.taobao.trtc.api.e
    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            i(str);
        }
    }

    public synchronized i h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("40142083", new Object[]{this, str});
        } else if (!f("createOutputStreamInternal")) {
            return null;
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "createOutputStream, id: " + str);
            return this.f.b(str);
        }
    }

    public synchronized void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else if (!f("releaseOutputStreamInternal")) {
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "releaseOutputStream, id: " + str);
            this.f.c(str);
        }
    }

    public void a(String str, TrtcDefines.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f07306", new Object[]{this, str, fVar});
        } else if (fVar == null || fVar.f23038a == null) {
            TrtcLog.a("TrtcEngine", "sendData, var error");
        } else {
            nativeSendData(str, fVar.f23038a, fVar.b);
        }
    }

    public void b(final ITrtcInputStream iTrtcInputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7276b00", new Object[]{this, iTrtcInputStream});
            return;
        }
        final String str = this.q != null ? "TrtcLiveStream" : "TrtcLocalStream";
        a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcEngineImpl.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TrtcInnerDefines.TrtcUpdateStreamParams trtcUpdateStreamParams = new TrtcInnerDefines.TrtcUpdateStreamParams(str, iTrtcInputStream);
                com.taobao.trtc.utils.h.a("TrtcEngine", "API - update local stream, " + trtcUpdateStreamParams.mediaConfig.toString());
                TrtcEngineImpl.a(TrtcEngineImpl.this, trtcUpdateStreamParams);
            }
        });
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - releaseMediaProcessor");
        if (this.y != null) {
            this.y.a();
            this.y = null;
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.w;
    }

    @Override // com.taobao.trtc.api.e
    public synchronized TrtcVideoDevice f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcVideoDevice) ipChange.ipc$dispatch("9a342e1e", new Object[]{this});
        }
        f("getVideoDevice");
        return this.f;
    }

    @Override // com.taobao.trtc.api.e
    public synchronized TrtcAudioDevice g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcAudioDevice) ipChange.ipc$dispatch("d10be564", new Object[]{this});
        }
        f("getAudioDevice");
        return this.g;
    }

    public synchronized boolean a(final TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d3097ad", new Object[]{this, trtcRemoteVideoFreezeParams})).booleanValue();
        } else if (!f("setRemoteVideoFreeze")) {
            return false;
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - set remote video freeze, params: " + trtcRemoteVideoFreezeParams.toString());
            a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$Fjy5hUIOrnYwhHWOGuUe1NF35As
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.this.b(trtcRemoteVideoFreezeParams);
                }
            });
            return true;
        }
    }

    public /* synthetic */ void b(TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7b4c88", new Object[]{this, trtcRemoteVideoFreezeParams});
        } else {
            nativeSetRemoteVideoFreeze(trtcRemoteVideoFreezeParams);
        }
    }

    public synchronized void a(final TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba20620", new Object[]{this, trtcLocalVideoFreezeInfo});
        } else if (!f("setLocalVideoFreeze")) {
        } else {
            if (!qvc.a("chatroomDisablePushVideo", false)) {
                TrtcLog.d("TrtcEngine", "chatroom can push video");
                return;
            }
            l lVar = this.f;
            if (trtcLocalVideoFreezeInfo.sendVideoType != TrtcDefines.TrtcSendVideoType.E_SEND_VIDEO_TYPE_NO_SEND.ordinal()) {
                z = false;
            }
            lVar.a(z);
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - set local video freeze, freeze: " + trtcLocalVideoFreezeInfo.freeze + " ,sendVideoType: " + trtcLocalVideoFreezeInfo.sendVideoType);
            a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$zoHko4AjAzp_HmsnxbDQpowV8Kg
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.lambda$zoHko4AjAzp_HmsnxbDQpowV8Kg(TrtcEngineImpl.this, trtcLocalVideoFreezeInfo);
                }
            });
        }
    }

    public /* synthetic */ void b(TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf395a1", new Object[]{this, trtcLocalVideoFreezeInfo});
        } else {
            nativeSetLocalVideoFreeze(trtcLocalVideoFreezeInfo);
        }
    }

    public synchronized boolean a(final TrtcDefines.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1acd1fd2", new Object[]{this, hVar})).booleanValue();
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - start live, bizId:" + hVar.b + " extInfo: " + hVar.b + " customInfo: " + hVar.d.toString() + " url: " + hVar.f23040a);
        if (!f("startLive")) {
            return false;
        }
        this.h.b(true);
        if (hVar.e == null && hVar.g) {
            TrtcLog.a("TrtcEngine", "start live error: video enable but no video input set");
            return false;
        }
        this.h.b(true);
        if (this.g != null && hVar.f) {
            this.g.a(this.z);
        }
        if (hVar.g) {
            TrtcInputStreamImpl.a(hVar.e, true, TrtcDefines.TrtcFrameType.E_FRAME_PRI);
        }
        this.q = hVar;
        a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcEngineImpl.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TrtcLog.d("TrtcEngine", "nativeStartLive start");
                TrtcEngineImpl.a(TrtcEngineImpl.this, new TrtcInnerDefines.StartLiveParams(hVar));
                TrtcLog.d("TrtcEngine", "nativeStartLive done");
            }
        });
        return true;
    }

    public synchronized void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - stop live");
        if (f("stopLive") && this.q != null) {
            com.taobao.trtc.utils.h.a("TrtcEngine", "stop live");
            this.h.b(false);
            if (this.g != null && this.q.f) {
                this.g.b(this.z);
            }
            if (this.q != null) {
                TrtcInputStreamImpl.a(this.q.e, false);
            }
            this.q = null;
            this.u.set(false);
            if (this.o != null) {
                this.o.a();
                this.o = null;
            }
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrtcEngineImpl.n(TrtcEngineImpl.this);
                    }
                }
            });
        }
    }

    private boolean d(TrtcDefines.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20267e10", new Object[]{this, gVar})).booleanValue();
        }
        gVar.b = gVar.b == null ? "" : gVar.b;
        if (StringUtils.isEmpty(gVar.f23039a)) {
            TrtcLog.a("TrtcEngine", "checkParams error, channel id is empty");
            return false;
        } else if (!gVar.e || gVar.c != null) {
            return true;
        } else {
            TrtcLog.a("TrtcEngine", "checkParams error, no input stream but video enabled");
            return false;
        }
    }

    @Override // com.taobao.trtc.api.e
    public synchronized String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        String nativeCreateChannelId = nativeCreateChannelId(str);
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - Create channel id: " + nativeCreateChannelId);
        return nativeCreateChannelId;
    }

    public synchronized void c(TrtcDefines.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9088d2d", new Object[]{this, gVar});
        } else {
            a(gVar);
        }
    }

    public synchronized void a(final ArrayList<String> arrayList, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1df5042", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
        } else if (!f("muteRemoteAudio")) {
        } else {
            if (arrayList != null && !arrayList.isEmpty()) {
                a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$k_NmX6vdikiw0GQu4F4mMxn4j2g
                    {
                        TrtcEngineImpl.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TrtcEngineImpl.lambda$k_NmX6vdikiw0GQu4F4mMxn4j2g(TrtcEngineImpl.this, arrayList, z, z2);
                    }
                });
                return;
            }
            TrtcLog.a("TrtcEngine", "muteRemoteAudio error, remoteStreamIdList is null or remoteStreamIdList is empty.");
        }
    }

    public /* synthetic */ void b(ArrayList arrayList, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b057a1", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
        } else {
            nativeMuteRemoteAudio(arrayList, z, z2);
        }
    }

    @Override // com.taobao.trtc.api.e
    public synchronized void a(TrtcDefines.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1accab6f", new Object[]{this, gVar});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - join channel id: " + gVar.f23039a);
        if (!f("joinChannel")) {
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "joinChannel, id: " + gVar.f23039a + ", extInfo: " + gVar.b);
        if (!d(gVar)) {
            return;
        }
        if (gVar.d && this.g != null) {
            this.g.a(this.z);
        }
        if (gVar.e) {
            TrtcInputStreamImpl.a(gVar.c, true);
        }
        this.t = gVar;
        a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcEngineImpl.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TrtcEngineImpl trtcEngineImpl = TrtcEngineImpl.this;
                TrtcEngineImpl.a(trtcEngineImpl, new TrtcInnerDefines.TrtcJoinChannelParams(TrtcEngineImpl.o(trtcEngineImpl)));
            }
        });
    }

    public synchronized void b(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else if (!f("sendChannelBroadcastMsg")) {
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - sendChannelBroadcastMsg, id: " + str);
            if (str != null && str2 != null) {
                a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$DJu5wcw2T8JC3bttw3JAAMWDTHw
                    {
                        TrtcEngineImpl.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TrtcEngineImpl.lambda$DJu5wcw2T8JC3bttw3JAAMWDTHw(TrtcEngineImpl.this, str, str2, str3);
                    }
                });
                return;
            }
            TrtcLog.d("TrtcEngine", "channelId is empty or message is empty");
        }
    }

    public /* synthetic */ void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{this, str, str2, str3});
        } else {
            nativeSendChannelBroadcastMsg(str, str2, str3);
        }
    }

    @Override // com.taobao.trtc.api.e
    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str, str2, 0);
        }
    }

    @Override // com.taobao.trtc.api.e
    public void a(final String str, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
        } else if (!f("leaveChannel")) {
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - leaveChannel, id: " + str + ", code: " + i);
            TrtcDefines.g gVar = this.t;
            if (gVar == null) {
                TrtcLog.d("TrtcEngine", "no need process this leave channel, id: " + str);
                return;
            }
            if (gVar.e) {
                TrtcInputStreamImpl.a(this.t.c, false);
            }
            this.t = null;
            j().a();
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrtcEngineImpl.a(TrtcEngineImpl.this, str, i, str2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.e
    public void b(TrtcDefines.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ea9c4e", new Object[]{this, gVar});
        } else if (!f("updateChannel")) {
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - updateChannel, id: " + gVar.f23039a);
            if (this.t == null || !d(gVar)) {
                com.taobao.trtc.utils.h.b("TrtcEngine", "updateChannel check params error");
                return;
            }
            if (this.t.e && this.t.c != null && !gVar.e) {
                TrtcInputStreamImpl.a(this.t.c, false);
            } else if (!this.t.e && gVar.e) {
                TrtcInputStreamImpl.a(gVar.c, true);
            }
            this.t = gVar;
            b(gVar.c);
        }
    }

    @Override // com.taobao.trtc.api.e
    public void a(TrtcDefines.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acef14a", new Object[]{this, lVar});
        } else {
            a(TrtcInnerDefines.ChannelNotifyAction.E_INVITE, lVar);
        }
    }

    @Override // com.taobao.trtc.api.e
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcDefines.l lVar = new TrtcDefines.l();
        lVar.f23044a = str;
        lVar.b = str2;
        lVar.e = str3;
        lVar.c = true;
        lVar.d = false;
        a(TrtcInnerDefines.ChannelNotifyAction.E_CANCEL_INVITE, lVar);
    }

    public void a(String str, String str2, TrtcDefines.TrtcAnswerType trtcAnswerType, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95211a13", new Object[]{this, str, str2, trtcAnswerType, str3});
            return;
        }
        TrtcInnerDefines.ChannelNotifyAction channelNotifyAction = trtcAnswerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE ? TrtcInnerDefines.ChannelNotifyAction.E_AGREE : TrtcInnerDefines.ChannelNotifyAction.E_DISAGREE;
        TrtcDefines.l lVar = new TrtcDefines.l();
        lVar.f23044a = str;
        lVar.b = str2;
        lVar.e = str3;
        lVar.c = true;
        lVar.d = false;
        a(channelNotifyAction, lVar);
    }

    private void a(final TrtcInnerDefines.ChannelNotifyAction channelNotifyAction, final TrtcDefines.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c0f6e6", new Object[]{this, channelNotifyAction, lVar});
            return;
        }
        if (!f("notifyChannel, action: " + channelNotifyAction)) {
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - notifyChannel, action: " + channelNotifyAction + ", id: " + lVar.f23044a + ", remoteUserId:" + lVar.b + ", a: " + lVar.c + ", v: " + lVar.d);
        a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcEngineImpl.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TrtcEngineImpl.a(TrtcEngineImpl.this, lVar.f23044a, lVar.b, channelNotifyAction.ordinal(), lVar.c, lVar.d, lVar.e);
                }
            }
        });
    }

    public synchronized boolean a(final TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("981c4487", new Object[]{this, trtcMakeCallParams})).booleanValue();
        } else if (!f("makeCall")) {
            return false;
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - make call, params: " + b.a(trtcMakeCallParams));
            if (trtcMakeCallParams.inputStream == null && trtcMakeCallParams.videoTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                TrtcLog.a("TrtcEngine", "make call error, enable video but no input stream");
                return false;
            }
            if (this.g != null && trtcMakeCallParams.audioTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                this.g.a(this.z);
            }
            if (trtcMakeCallParams.videoTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                TrtcInputStreamImpl.a(trtcMakeCallParams.inputStream, true);
            }
            Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = trtcMakeCallParams.userInfos.iterator();
            while (it.hasNext()) {
                TrtcInnerDefines.TrtcCallUserInfo next = it.next();
                j().a(next.userId, TrtcDefines.TrtcUserRole.values()[next.role]);
            }
            this.r = trtcMakeCallParams;
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrtcEngineImpl.a(TrtcEngineImpl.this, trtcMakeCallParams);
                    }
                }
            });
            return true;
        }
    }

    public synchronized boolean a(final TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26186d77", new Object[]{this, trtcAnswerCallParams})).booleanValue();
        } else if (!f("answerCall")) {
            return false;
        } else {
            String str = trtcAnswerCallParams.remoteUserId;
            boolean z = trtcAnswerCallParams.answerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE.ordinal();
            com.taobao.trtc.utils.h.a("TrtcEngine", "API answer call, params: " + b.a(trtcAnswerCallParams));
            if (trtcAnswerCallParams.extension == null) {
                trtcAnswerCallParams.extension = "";
            }
            if (this.g != null && trtcAnswerCallParams.audioTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                this.g.a(this.z);
            }
            if (z) {
                if (trtcAnswerCallParams.inputStream == null && trtcAnswerCallParams.videoTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                    TrtcLog.a("TrtcEngine", "answer call error, enable video but no input stream");
                    j().a(str);
                    return false;
                }
                if (trtcAnswerCallParams.videoTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                    TrtcInputStreamImpl.a(trtcAnswerCallParams.inputStream, true);
                }
                j().a(str, TrtcInnerDefines.CallState.E_CALL_SETUP);
            } else {
                e(str);
                if (!this.u.get() && this.f != null) {
                    this.f.stopSubCapture();
                    f(false);
                }
            }
            this.s = trtcAnswerCallParams;
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrtcEngineImpl.a(TrtcEngineImpl.this, trtcAnswerCallParams);
                    }
                }
            });
            return true;
        }
    }

    public synchronized boolean a(final TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481b503b", new Object[]{this, trtcCancelCallParams})).booleanValue();
        } else if (!f("cancelCall")) {
            return false;
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - cancel call, params: " + b.a(trtcCancelCallParams));
            Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = trtcCancelCallParams.userInfos.iterator();
            while (it.hasNext()) {
                j().a(it.next().userId);
            }
            a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$KsXICK0J_g7LMpUw0slLsz14bPs
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.lambda$KsXICK0J_g7LMpUw0slLsz14bPs(TrtcEngineImpl.this, trtcCancelCallParams);
                }
            });
            return true;
        }
    }

    public /* synthetic */ void b(TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dac838", new Object[]{this, trtcCancelCallParams});
        } else {
            nativeCancelCall(trtcCancelCallParams);
        }
    }

    public synchronized boolean a(final TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc7732e8", new Object[]{this, trtcHangUpCallParams})).booleanValue();
        } else if (!f("hangUpCall")) {
            return false;
        } else {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - hangup call, params: " + b.a(trtcHangUpCallParams));
            Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = trtcHangUpCallParams.userInfos.iterator();
            while (it.hasNext()) {
                TrtcInnerDefines.TrtcCallUserInfo next = it.next();
                e(next.userId);
                if (!trtcHangUpCallParams.isMultiChatMode) {
                    this.u.set(false);
                    j().a(this.w);
                    f().stopSubCapture();
                }
                if (trtcHangUpCallParams.isMultiChatMode && next.userId == this.w) {
                    this.u.set(false);
                    f(false);
                    f().stopSubCapture();
                    j().a();
                }
            }
            a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcEngineImpl.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrtcEngineImpl.a(TrtcEngineImpl.this, trtcHangUpCallParams);
                    }
                }
            });
            return true;
        }
    }

    public synchronized ITrtcCallInterface.d r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.d) ipChange.ipc$dispatch("78343223", new Object[]{this});
        }
        return new b.d(this);
    }

    public synchronized ITrtcCallInterface.a s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.a) ipChange.ipc$dispatch("31abbf65", new Object[]{this});
        }
        return new b.a(this);
    }

    public synchronized ITrtcCallInterface.b t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.b) ipChange.ipc$dispatch("eb234d23", new Object[]{this});
        }
        return new b.C0991b(this);
    }

    public synchronized ITrtcCallInterface.c u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.c) ipChange.ipc$dispatch("a49adae1", new Object[]{this});
        }
        return new b.c(this);
    }

    public synchronized void a(ITrtcObserver.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1deb4331", new Object[]{this, dVar});
        } else if (!f("setCustomMessageObserver")) {
        } else {
            TrtcLog.d("TrtcEngine", "set custom msg observer: " + dVar);
            if (this.h != null) {
                this.h.a(dVar);
            }
        }
    }

    public synchronized void a(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (str != null && str2 != null && f("sendCustomMessage")) {
            com.taobao.trtc.utils.h.a("TrtcEngine", "API - sendCustomMessage, remote id:" + str + ", len:" + str2.length());
            a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$fq6GK1hwiNnYmnTL02cQj4hMV1Q
                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.lambda$fq6GK1hwiNnYmnTL02cQj4hMV1Q(TrtcEngineImpl.this, str, str2, str3, str4);
                }
            });
        }
    }

    public /* synthetic */ void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{this, str, str2, str3, str4});
        } else {
            nativeSendCustomMessage(str, str2, str3, str4);
        }
    }

    public void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            b(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$baE-EpO8zsM70EM8oZHVQRi4k2w
                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.m1547lambda$baEEpO8zsM70EM8oZHVQRi4k2w(TrtcEngineImpl.this, map);
                }
            });
        }
    }

    public /* synthetic */ void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            nativeCustomUt(JSON.toJSONString(map), true, true);
        }
    }

    public void j(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            b(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$_hymOHg-XxW1nydguYPepVXbxos
                {
                    TrtcEngineImpl.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.m1546lambda$_hymOHgXxW1nydguYPepVXbxos(TrtcEngineImpl.this, str);
                }
            });
        }
    }

    public /* synthetic */ void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            nativeCustomUt(str, false, false);
        }
    }

    public com.taobao.trtc.api.d v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.trtc.api.d) ipChange.ipc$dispatch("e6e7acee", new Object[]{this}) : new m(this);
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            com.taobao.artc.utils.a.a(runnable, 0L);
        }
    }

    private void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else {
            com.taobao.artc.utils.a.a(runnable);
        }
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcEngine", "engine sync unInitialize run");
        nativeUnInitialize();
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcEngine", "releaseResourceOnMain");
        TrtcPhoneStats trtcPhoneStats = this.i;
        if (trtcPhoneStats != null) {
            trtcPhoneStats.b();
            this.i = null;
        }
        this.g.a(false);
        this.g.b();
        this.f.c();
        TrtcLog.d("TrtcEngine", "releaseResourceOnMain done");
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcEngine", "releaseResource");
        this.b.b();
        e();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            try {
                A();
                return;
            } catch (Exception e) {
                com.taobao.trtc.utils.h.a("TrtcEngine", "release source on main error: " + e.getMessage());
                return;
            }
        }
        this.z.sendEmptyMessage(0);
    }

    private void d(TrtcConfig trtcConfig) {
        TrtcLog.d("TrtcEngine", "updateInnerConfig");
        TrtcInnerConfig trtcInnerConfig = this.c;
        trtcInnerConfig.config = trtcConfig;
        trtcInnerConfig.isEnvOnline = trtcConfig.getEnvironment() == 0;
        this.e = trtcConfig.getWorkMode();
        if (this.e == TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_UNKOWN) {
            this.e = TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_LIVE;
            trtcConfig.setWorkMode(this.e);
            TrtcLog.a("TrtcEngine", "engine initialize, set to default work mode: " + this.e);
        }
        if (StringUtils.isEmpty(trtcConfig.getDeviceId())) {
            trtcConfig.setDeviceId(UTDevice.getUtdid(h.f23132a));
            TrtcLog.d("TrtcEngine", "Get deviceId: " + trtcConfig.getDeviceId());
        }
        if (StringUtils.isEmpty(trtcConfig.getRegId())) {
            try {
                trtcConfig.setRegId((String) ACCSClient.class.getMethod("getRegId", Context.class).invoke(null, h.f23132a));
            } catch (Throwable unused) {
            }
        }
        this.c.networkType = this.b.a(h.f23132a);
        this.c.osVersion = Build.VERSION.RELEASE;
        this.c.model = Build.MODEL;
        TelephonyManager telephonyManager = (TelephonyManager) h.f23132a.getSystemService("phone");
        if (telephonyManager != null && !StringUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            this.c.carriers = telephonyManager.getNetworkOperatorName();
        }
        String a2 = SystemProperties.a("ro.board.platform");
        if (a2 != null) {
            this.c.board = a2;
        }
        c(trtcConfig);
        kgj e = this.b.e();
        if (e != null) {
            this.c.chipset = StringUtils.isEmpty(e.f30053a) ? "" : e.f30053a;
            com.taobao.trtc.utils.h.a("TrtcEngine", "\"Brand\":\"" + Build.BRAND + "\",\"Model\":\"" + Build.MODEL + "\",\"UserId\":\"" + this.c.config.getUserId() + "\",\"DeviceInfo\":" + JSON.toJSONString(e));
        }
        if (!StringUtils.isEmpty(trtcConfig.getRegId())) {
            com.taobao.trtc.utils.h.a("TrtcEngine", "accs regId: " + trtcConfig.getRegId());
        }
        this.c.orangeConfigs = qvc.c();
        if (this.x == null && !trtcConfig.isChatroom()) {
            this.x = new com.taobao.trtc.video.e();
            this.x.a();
            e.a b = this.x.b(j3.m);
            if (b != null) {
                TrtcInnerConfig trtcInnerConfig2 = this.c;
                trtcInnerConfig2.hwH264DecodeEnable = true;
                trtcInnerConfig2.hwH264DecoderName = b.f23218a;
                if (!b.b.isEmpty()) {
                    this.c.hwH264DecodeLowLatencyConfigStr = JSON.toJSONString(b.b);
                }
                TrtcLog.d("TrtcEngine", "hw_decoder: " + this.c.hwH264DecoderName + ", config: " + this.c.hwH264DecodeLowLatencyConfigStr + ", CPU : " + com.taobao.trtc.video.e.b());
            }
            e.a b2 = this.x.b("video/hevc");
            if (b2 == null) {
                return;
            }
            TrtcInnerConfig trtcInnerConfig3 = this.c;
            trtcInnerConfig3.hwH265DecodeEnable = true;
            trtcInnerConfig3.hwH265DecoderName = b2.f23218a;
            if (!b2.b.isEmpty()) {
                this.c.hwH265DecodeLowLatencyConfigStr = JSON.toJSONString(b2.b);
            }
            TrtcLog.d("TrtcEngine", "hw_decoder: " + this.c.hwH265DecoderName + ", config: " + this.c.hwH265DecodeLowLatencyConfigStr + ", CPU : " + com.taobao.trtc.video.e.b());
            return;
        }
        TrtcLog.d("TrtcEngine", "not use hw decoder, isChatroom: " + trtcConfig.isChatroom());
    }

    public void a(TrtcDefines.TrtcWorkMode trtcWorkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30789af9", new Object[]{this, trtcWorkMode});
        } else {
            this.e = trtcWorkMode;
        }
    }

    public String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.c.config != null ? this.c.config.getUserId() : "";
    }

    public synchronized boolean a(final TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1359e954", new Object[]{this, trtcVideoLayoutParams})).booleanValue();
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - setVideoLayout: " + m.a(trtcVideoLayoutParams));
        if (this.f != null && this.p == TrtcDefines.TrtcMixMode.MIX_LOCAL) {
            TrtcLog.d("TrtcEngine", "local mix, set layout to video process");
            this.f.a(trtcVideoLayoutParams);
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$TrtcEngineImpl$PHr1lXDhLwvCaJVy25VslWNEipM
            @Override // java.lang.Runnable
            public final void run() {
                TrtcEngineImpl.lambda$PHr1lXDhLwvCaJVy25VslWNEipM(TrtcEngineImpl.this, trtcVideoLayoutParams);
            }
        });
        return true;
    }

    public /* synthetic */ void b(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89716f", new Object[]{this, trtcVideoLayoutParams});
            return;
        }
        TrtcLog.d("TrtcEngine", "native send video layout");
        nativeSetVideoLayout(trtcVideoLayoutParams);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - enableSpeakerphone: " + z);
        a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.enableSpeakerphone(z);
    }

    public synchronized void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public synchronized boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEngine", "API - enableBeauty: " + z);
        l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.enableBeauty(z);
    }

    public com.taobao.trtc.utils.f y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.trtc.utils.f) ipChange.ipc$dispatch("3c329038", new Object[]{this}) : this.b;
    }

    public void a(com.taobao.trtc.video.b bVar, com.taobao.trtc.video.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a5cd07", new Object[]{this, bVar, cVar});
            return;
        }
        l lVar = this.f;
        if (lVar != null) {
            lVar.a(bVar, cVar);
        } else {
            TrtcLog.a("TrtcEngine", "create external stream error");
        }
    }
}

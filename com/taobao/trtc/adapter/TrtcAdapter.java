package com.taobao.trtc.adapter;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcConfig;
import com.taobao.artc.api.ArtcEngine;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.artc.api.ArtcException;
import com.taobao.artc.api.ArtcExternalAudioProcess;
import com.taobao.artc.api.ArtcVideoLayout;
import com.taobao.artc.api.IArtcExternalVideoCapturer;
import com.taobao.artc.api.IArtcExternalVideoRender;
import com.taobao.artc.api.IAudioRecordEventHandler;
import com.taobao.artc.internal.ArtcParams;
import com.taobao.common.inspector.DeviceInspector;
import com.taobao.trtc.api.ITrtcCallInterface;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.api.d;
import com.taobao.trtc.api.e;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.impl.k;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.h;
import com.taobao.trtc.video.c;
import com.taobao.trtc.video.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoCapturer;
import tb.kan;
import tb.kge;
import tb.qvc;

/* loaded from: classes9.dex */
public class TrtcAdapter extends ArtcEngine implements ITrtcInputStream.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context f;
    private final DeviceInspector h;
    private final AtomicBoolean i;
    private a j;
    private final b m;

    /* renamed from: a */
    private TrtcEngineImpl f23005a = null;
    private ArtcConfig c = null;
    private TrtcConfig d = null;
    private String e = "";
    private ReentrantLock g = new ReentrantLock();
    private VideoCapturer k = null;
    private c l = null;
    private int n = 720;
    private int o = 1280;
    private int p = 20;
    private boolean q = false;
    private final byte[] r = new byte[1024];
    private boolean b = false;

    static {
        kge.a(-1744278573);
        kge.a(1091717481);
    }

    public static /* synthetic */ Object ipc$super(TrtcAdapter trtcAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$AAFOfYaaAw7lzcmeCMwQabPbWMU(TrtcAdapter trtcAdapter, TrtcAudioDevice.b bVar) {
        trtcAdapter.b(bVar);
    }

    public static /* synthetic */ void lambda$mIIJW8WnUR_cvogZK8lo2q3yfDA(TrtcAdapter trtcAdapter, TrtcAudioDevice.b bVar) {
        trtcAdapter.c(bVar);
    }

    /* renamed from: lambda$zUoULDgMYBL85HvlWSJ9-mpQMf8 */
    public static /* synthetic */ void m1540lambda$zUoULDgMYBL85HvlWSJ9mpQMf8(TrtcAdapter trtcAdapter, TrtcAudioDevice.b bVar) {
        trtcAdapter.a(bVar);
    }

    private native String nativeGetSdkVersion();

    public static /* synthetic */ b a(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("36a96644", new Object[]{trtcAdapter}) : trtcAdapter.m;
    }

    public static /* synthetic */ boolean a(TrtcAdapter trtcAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b793072", new Object[]{trtcAdapter, new Boolean(z)})).booleanValue();
        }
        trtcAdapter.b = z;
        return z;
    }

    public static /* synthetic */ a b(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d3176284", new Object[]{trtcAdapter}) : trtcAdapter.j;
    }

    public static /* synthetic */ boolean c(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5ded168", new Object[]{trtcAdapter})).booleanValue() : trtcAdapter.e();
    }

    public static /* synthetic */ boolean d(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad440687", new Object[]{trtcAdapter})).booleanValue() : trtcAdapter.c();
    }

    public static /* synthetic */ TrtcEngineImpl e(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcEngineImpl) ipChange.ipc$dispatch("8557a364", new Object[]{trtcAdapter}) : trtcAdapter.f23005a;
    }

    public static /* synthetic */ boolean f(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc0e70c5", new Object[]{trtcAdapter})).booleanValue() : trtcAdapter.b;
    }

    public TrtcAdapter(Context context, DeviceInspector deviceInspector) throws ArtcException {
        TrtcLog.d("TrtcAdapter", "CTOR");
        this.f = context.getApplicationContext();
        this.h = deviceInspector;
        this.i = new AtomicBoolean(false);
        this.j = new a(this);
        this.m = new b(this.j);
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            com.taobao.artc.utils.a.a(runnable, 0L);
        }
    }

    private VideoCapturer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoCapturer) ipChange.ipc$dispatch("64280ded", new Object[]{this});
        }
        if (this.k == null) {
            this.k = g.a();
        }
        return this.k;
    }

    private c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9f14f83a", new Object[]{this});
        }
        if (this.l == null) {
            this.l = new c();
            this.l.a();
        }
        return this.l;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e.equals("grtn") && this.f23005a != null;
    }

    private synchronized boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.j == null) {
            this.j = new a(this);
        }
        return !this.j.c();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAdapter", "process cached grtn api");
        this.f23005a = (TrtcEngineImpl) e.a(this.f);
        String str = "";
        try {
            str = this.f.getPackageManager().getPackageInfo(this.f.getPackageName(), 0).versionName;
            TrtcLog.d("TrtcAdapter", "get appVersion: " + str);
        } catch (PackageManager.NameNotFoundException e) {
            TrtcLog.d("TrtcAdapter", "get appVersion error, e: " + e);
            e.printStackTrace();
        }
        TrtcConfig a2 = new TrtcConfig.a().a(this.c.useExternalVideoCapturer().booleanValue(), this.c.useExternalVideoRenderer().booleanValue()).a(this.c.getServiceName()).b(this.c.appkey()).c(this.c.getLocalUserId()).d(kan.a(this.f)).a(this.c.isPreferBlueTooth()).b(false).a((ITrtcObserver.e) this.m).a((ITrtcObserver.b) this.m).a((ITrtcObserver.c) this.m).a(this.c.environment()).e(this.c.getAccsCfgTag()).f(this.c.getEnableSpeechDetect()).h(this.c.getIsChatroom()).f(str).a();
        if (!this.f23005a.a(a2)) {
            this.m.a(TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_INITIALIZE, 2000, "trtc engine initialize error");
            return;
        }
        this.f23005a.f().setEventObserver(this.m);
        TrtcAudioDevice g = this.f23005a.g();
        g.setAudioEventObserver(this.m);
        g.setAEDEnable(false);
        g.setAudioObserver(new TrtcAudioDevice.a() { // from class: com.taobao.trtc.adapter.-$$Lambda$TrtcAdapter$mIIJW8WnUR_cvogZK8lo2q3yfDA
            @Override // com.taobao.trtc.api.TrtcAudioDevice.a
            public final void onAudioFrame(TrtcAudioDevice.b bVar) {
                TrtcAdapter.lambda$mIIJW8WnUR_cvogZK8lo2q3yfDA(TrtcAdapter.this, bVar);
            }
        });
        g.setAudioProcessObserver(new TrtcAudioDevice.a() { // from class: com.taobao.trtc.adapter.-$$Lambda$TrtcAdapter$AAFOfYaaAw7lzcmeCMwQabPbWMU
            @Override // com.taobao.trtc.api.TrtcAudioDevice.a
            public final void onAudioFrame(TrtcAudioDevice.b bVar) {
                TrtcAdapter.lambda$AAFOfYaaAw7lzcmeCMwQabPbWMU(TrtcAdapter.this, bVar);
            }
        });
        g.setAudioPlayoutObserver(new TrtcAudioDevice.a() { // from class: com.taobao.trtc.adapter.-$$Lambda$TrtcAdapter$zUoULDgMYBL85HvlWSJ9-mpQMf8
            @Override // com.taobao.trtc.api.TrtcAudioDevice.a
            public final void onAudioFrame(TrtcAudioDevice.b bVar) {
                TrtcAdapter.m1540lambda$zUoULDgMYBL85HvlWSJ9mpQMf8(TrtcAdapter.this, bVar);
            }
        });
        if (a2.isUseExternalVideoCapture() || a2.isUseExternalVideoRender()) {
            TrtcEngineImpl trtcEngineImpl = this.f23005a;
            c cVar = null;
            com.taobao.trtc.video.b bVar = a2.isUseExternalVideoCapture() ? (com.taobao.trtc.video.b) a() : null;
            if (a2.isUseExternalVideoRender()) {
                cVar = b();
            }
            trtcEngineImpl.a(bVar, cVar);
        }
        this.f23005a.a(this.m);
        a aVar = this.j;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f23005a);
    }

    public /* synthetic */ void c(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f62d81e", new Object[]{this, bVar});
            return;
        }
        ArtcExternalAudioProcess.AudioFrame audioFrame = new ArtcExternalAudioProcess.AudioFrame();
        bVar.g.get(this.r, 0, bVar.f);
        bVar.g.rewind();
        audioFrame.audio_data = this.r;
        audioFrame.audio_data_len = bVar.f;
        audioFrame.audio_level = bVar.d;
        audioFrame.channels = bVar.b;
        audioFrame.is_speech = bVar.e;
        audioFrame.sample_per_channel = bVar.c;
        audioFrame.sample_rate = bVar.f23031a;
        ArtcConfig artcConfig = this.c;
        if (artcConfig != null && artcConfig.externalAudioProcess() != null) {
            this.c.externalAudioProcess().onTrtcAudioFrame(audioFrame, ArtcExternalAudioProcess.ArtcExtProcessAudioFrameType.E_OBSERVER);
        }
        bVar.g.put(audioFrame.audio_data);
        bVar.g.rewind();
    }

    public /* synthetic */ void b(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac766ebf", new Object[]{this, bVar});
            return;
        }
        ArtcExternalAudioProcess.AudioFrame audioFrame = new ArtcExternalAudioProcess.AudioFrame();
        bVar.g.get(this.r, 0, bVar.f);
        bVar.g.rewind();
        audioFrame.audio_data = this.r;
        audioFrame.audio_data_len = bVar.f;
        audioFrame.audio_level = bVar.d;
        audioFrame.channels = bVar.b;
        audioFrame.is_speech = bVar.e;
        audioFrame.sample_per_channel = bVar.c;
        audioFrame.sample_rate = bVar.f23031a;
        ArtcConfig artcConfig = this.c;
        if (artcConfig != null && artcConfig.externalAudioProcess() != null) {
            this.c.externalAudioProcess().onTrtcAudioFrame(audioFrame, ArtcExternalAudioProcess.ArtcExtProcessAudioFrameType.E_PROCESSOR);
        }
        bVar.g.put(audioFrame.audio_data);
        bVar.g.rewind();
    }

    public /* synthetic */ void a(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98a0560", new Object[]{this, bVar});
            return;
        }
        ArtcExternalAudioProcess.AudioFrame audioFrame = new ArtcExternalAudioProcess.AudioFrame();
        bVar.g.get(this.r, 0, bVar.f);
        bVar.g.rewind();
        audioFrame.audio_data = this.r;
        audioFrame.audio_data_len = bVar.f;
        audioFrame.audio_level = bVar.d;
        audioFrame.channels = bVar.b;
        audioFrame.is_speech = bVar.e;
        audioFrame.sample_per_channel = bVar.c;
        audioFrame.sample_rate = bVar.f23031a;
        ArtcConfig artcConfig = this.c;
        if (artcConfig != null && artcConfig.externalAudioProcess() != null) {
            this.c.externalAudioProcess().onTrtcAudioFrame(audioFrame, ArtcExternalAudioProcess.ArtcExtProcessAudioFrameType.E_PLAYER);
        }
        bVar.g.put(audioFrame.audio_data);
        bVar.g.rewind();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void initialize(ArtcConfig artcConfig) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c65e73", new Object[]{this, artcConfig});
        } else {
            initialize2(artcConfig, "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void initialize2(ArtcConfig artcConfig, String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98378b0f", new Object[]{this, artcConfig, str});
            return;
        }
        try {
            this.g.lock();
            a(artcConfig, str);
        } finally {
            this.g.unlock();
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void registerAccsObserver(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224cf698", new Object[]{this, arrayList});
            return;
        }
        TrtcLog.d("TrtcAdapter", "registerAccsObserver, accsApiList: " + arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        k.a(this.f, arrayList);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void initConfig(ArtcConfig artcConfig) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38f1255", new Object[]{this, artcConfig});
            return;
        }
        TrtcLog.d("TrtcAdapter", "initConfig");
        this.c = artcConfig;
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unInitialize() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f349e310", new Object[]{this});
        } else {
            unInitialize2("");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unInitialize2(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f29c41a", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "UnInitialize2");
        try {
            this.g.lock();
            a(str);
        } finally {
            this.g.unlock();
        }
    }

    private void a(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb8bf8e", new Object[]{this, artcConfig, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "Initialize");
        if (this.i.get()) {
            TrtcLog.a("TrtcAdapter", "already initialized");
            return;
        }
        this.i.set(true);
        this.c = artcConfig;
        if (this.j == null) {
            this.j = new a(this);
        }
        b bVar = this.m;
        if (bVar != null) {
            bVar.a(this.j);
        }
        com.taobao.trtc.utils.c cVar = new com.taobao.trtc.utils.c();
        cVar.d = artcConfig.appkey();
        cVar.c = UTDevice.getUtdid(this.f);
        cVar.e = artcConfig.sdkVersion;
        cVar.b = artcConfig.getLocalUserId();
        cVar.f = artcConfig.getServiceName();
        h.a(cVar);
        if (artcConfig.protocal().equals(TrtcSignalChannel.f23181a)) {
            TrtcEngineImpl.a(this.f, artcConfig.isCheckAccsConnection(), artcConfig.getLocalUserId(), artcConfig.appkey(), artcConfig.environment(), artcConfig.getAccsCfgTag());
        }
        this.e = "grtn";
        f();
        this.i.set(true);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.i.get()) {
            TrtcLog.a("TrtcAdapter", "no need unInitialize");
        } else {
            if (this.c.protocal.equals(TrtcSignalChannel.f23181a)) {
                k.a();
            }
            VideoCapturer videoCapturer = this.k;
            if (videoCapturer != null) {
                videoCapturer.dispose();
                this.k = null;
            }
            c cVar = this.l;
            if (cVar != null) {
                cVar.b();
                this.l = null;
            }
            a aVar = this.j;
            if (aVar != null) {
                aVar.a();
                this.j = null;
            }
            if (c()) {
                this.f23005a.q();
                this.f23005a.c();
            }
            this.i.set(false);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void registerHandler(final ArtcEngineEventHandler artcEngineEventHandler) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9c771a", new Object[]{this, artcEngineEventHandler});
            return;
        }
        TrtcLog.d("TrtcAdapter", "registerHandler: " + artcEngineEventHandler);
        b bVar = this.m;
        if (bVar != null) {
            bVar.a(artcEngineEventHandler);
        }
        if (this.j == null) {
            this.j = new a(this);
        }
        this.j.f23027a = artcEngineEventHandler;
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TrtcAdapter.a(TrtcAdapter.this).a(artcEngineEventHandler);
                TrtcAdapter.b(TrtcAdapter.this).f23027a = artcEngineEventHandler;
                TrtcLog.d("TrtcAdapter", "cachedInfoHandler.artcEngineEventHandler: " + artcEngineEventHandler);
                if (!TrtcAdapter.c(TrtcAdapter.this)) {
                    return;
                }
                TrtcAdapter.b(TrtcAdapter.this).a("registerHandler");
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unRegisterHandler() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf744d5", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAdapter", "unRegisterHandler");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TrtcAdapter.a(TrtcAdapter.this).a((ArtcEngineEventHandler) null);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoProfile(AConstants.ArtcVideoProfile artcVideoProfile, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc4fc5d", new Object[]{this, artcVideoProfile, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setVideoProfile, profile: " + artcVideoProfile + ", landscape: " + z);
        a(artcVideoProfile, z);
        a aVar = this.j;
        aVar.b = artcVideoProfile;
        aVar.c = z;
        aVar.y = this.n;
        aVar.z = this.o;
        aVar.A = this.p;
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TrtcAdapter.c(TrtcAdapter.this)) {
                } else {
                    TrtcAdapter.b(TrtcAdapter.this).a("setVideoProfile");
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoMirror(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30b57d5", new Object[]{this, new Boolean(z)});
        } else if (this.f23005a == null) {
        } else {
            a aVar = this.j;
            aVar.e = z;
            aVar.d = z;
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setLocalView(SurfaceViewRenderer surfaceViewRenderer) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415f16a6", new Object[]{this, surfaceViewRenderer});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setLocalView: " + surfaceViewRenderer);
        if (e()) {
            a aVar = this.j;
            aVar.f = surfaceViewRenderer;
            aVar.a("setLocalView");
        } else if (!c()) {
        } else {
            this.f23005a.f().setLocalView(surfaceViewRenderer);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setRemoteView(SurfaceViewRenderer surfaceViewRenderer) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6efac5", new Object[]{this, surfaceViewRenderer});
        } else {
            setRemoteView(surfaceViewRenderer, "old");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setRemoteView(SurfaceViewRenderer surfaceViewRenderer, String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d546dd4f", new Object[]{this, surfaceViewRenderer, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setRemoteView: " + surfaceViewRenderer + ", id:" + str);
        if (e()) {
            a aVar = this.j;
            aVar.g = surfaceViewRenderer;
            aVar.h = str;
            aVar.a("setRemoteView");
        } else if (!c()) {
        } else {
            this.f23005a.f().setRemoteVideoView(surfaceViewRenderer, str);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void enableTorch(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "enableTorch");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (TrtcAdapter.d(TrtcAdapter.this) && TrtcAdapter.e(TrtcAdapter.this) != null) {
                    TrtcAdapter.e(TrtcAdapter.this).f().enableTorch(z);
                }
                TrtcLog.d("TrtcAdapter", "enableTorch done");
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void startPreview() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
        } else {
            startPreview2("");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setLocalVideoFreeze(final TrtcDefines.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526537d", new Object[]{this, qVar});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setlocalVideoFreeze freeze: " + qVar.f23049a + " ,send type: " + qVar.b);
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TrtcAdapter.c(TrtcAdapter.this)) {
                    TrtcAdapter trtcAdapter = TrtcAdapter.this;
                    if (!qvc.a("enablePic", false) || !qVar.f23049a) {
                        z = false;
                    }
                    TrtcAdapter.a(trtcAdapter, z);
                    TrtcAdapter.b(TrtcAdapter.this).L = new TrtcInnerDefines.TrtcLocalVideoFreezeInfo(TrtcAdapter.f(TrtcAdapter.this), qVar.b.ordinal());
                    TrtcAdapter.b(TrtcAdapter.this).a("setlocalVideoFreeze");
                } else {
                    if (TrtcAdapter.d(TrtcAdapter.this)) {
                        TrtcAdapter trtcAdapter2 = TrtcAdapter.this;
                        if (!qvc.a("enablePic", false) || !qVar.f23049a) {
                            z = false;
                        }
                        TrtcAdapter.a(trtcAdapter2, z);
                        TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo = new TrtcInnerDefines.TrtcLocalVideoFreezeInfo(TrtcAdapter.f(TrtcAdapter.this), qVar.b.ordinal());
                        if (TrtcAdapter.e(TrtcAdapter.this) != null) {
                            TrtcAdapter.e(TrtcAdapter.this).a(trtcLocalVideoFreezeInfo);
                        }
                    }
                    TrtcLog.d("TrtcAdapter", "setlocalVideoFreeze done");
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void startPreview2(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4d7d7d", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "startPreview2");
        if (e()) {
            a aVar = this.j;
            aVar.j = str;
            aVar.a("startPreview2");
            return;
        }
        if (c()) {
            this.j.B = this.f23005a.f().startCapture(new TrtcStreamConfig.a().a(this.j.z, this.j.y, this.j.A).a(true).b(true).a());
        }
        TrtcLog.d("TrtcAdapter", "startPreview2 done");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setTransportProfile(final AConstants.ArtcMediaType artcMediaType, final AConstants.ArtcTransportProfile artcTransportProfile) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3f73bd", new Object[]{this, artcMediaType, artcTransportProfile});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setTransportProfile");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TrtcAdapter.c(TrtcAdapter.this)) {
                } else {
                    TrtcAdapter.b(TrtcAdapter.this).k = artcMediaType;
                    TrtcAdapter.b(TrtcAdapter.this).l = artcTransportProfile;
                    TrtcAdapter.b(TrtcAdapter.this).a("setTransportProfile");
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setChannelProfile(AConstants.ArtcChannelProfile artcChannelProfile, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a337600d", new Object[]{this, artcChannelProfile, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setChannelProfile");
        setChannelProfile(artcChannelProfile, z, true);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setChannelProfile(final AConstants.ArtcChannelProfile artcChannelProfile, final boolean z, final boolean z2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b55467", new Object[]{this, artcChannelProfile, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setChannelProfile, profile: " + artcChannelProfile + ", audio: " + z2 + ", video:" + z2);
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TrtcAdapter.b(TrtcAdapter.this).m = artcChannelProfile;
                TrtcAdapter.b(TrtcAdapter.this).n = z;
                TrtcAdapter.b(TrtcAdapter.this).o = z2;
                if (!TrtcAdapter.c(TrtcAdapter.this)) {
                    return;
                }
                TrtcAdapter.b(TrtcAdapter.this).a("setChannelProfile");
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setUserId(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setUserId");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TrtcAdapter.b(TrtcAdapter.this).p = str;
                if (!TrtcAdapter.c(TrtcAdapter.this)) {
                    return;
                }
                TrtcAdapter.b(TrtcAdapter.this).a("setUserId");
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public String getUserId() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        TrtcLog.d("TrtcAdapter", "getUserId");
        return c() ? this.f23005a.w() : "";
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoLayout(ArtcVideoLayout artcVideoLayout) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a606e43", new Object[]{this, artcVideoLayout});
        } else {
            setVideoLayout(artcVideoLayout, false);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoLayout(final ArtcVideoLayout artcVideoLayout, final boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ae0cf1", new Object[]{this, artcVideoLayout, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setVideoLayout");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TrtcAdapter.c(TrtcAdapter.this)) {
                    TrtcAdapter.b(TrtcAdapter.this).q = artcVideoLayout;
                    TrtcAdapter.b(TrtcAdapter.this).r = z;
                    TrtcAdapter.b(TrtcAdapter.this).a("setVideoLayout");
                } else if (TrtcAdapter.d(TrtcAdapter.this)) {
                    d v = TrtcAdapter.e(TrtcAdapter.this).v();
                    v.a(artcVideoLayout.bg_width, artcVideoLayout.bg_height);
                    v.a((artcVideoLayout.bg_color >> 16) & 255, (artcVideoLayout.bg_color >> 8) & 255, artcVideoLayout.bg_color & 255);
                    v.b(artcVideoLayout.sub_width, artcVideoLayout.sub_height);
                    for (int i = 0; i < artcVideoLayout.desc.size(); i++) {
                        v.a(artcVideoLayout.desc.get(i).x, artcVideoLayout.desc.get(i).y, artcVideoLayout.desc.get(i).z, artcVideoLayout.desc.get(i).width, artcVideoLayout.desc.get(i).height, artcVideoLayout.desc.get(i).uid);
                    }
                    if (artcVideoLayout.extension != null) {
                        v.a(artcVideoLayout.extension);
                    }
                    v.a(TrtcDefines.TrtcBackgroundImageType.values()[artcVideoLayout.bg_from_type], artcVideoLayout.background_imge_url);
                    v.a(artcVideoLayout.bg_type);
                    v.a();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setBroadcast(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8609dbd0", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setBroadcast");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TrtcAdapter.c(TrtcAdapter.this)) {
                } else {
                    TrtcAdapter.b(TrtcAdapter.this).s = str;
                    TrtcAdapter.b(TrtcAdapter.this).a("setBroadcast");
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void createChannel(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810a83b8", new Object[]{this, str});
        } else {
            createChannel2(str, "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void createChannel2(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90967c6", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("TrtcAdapter", "createChannel2, bizId:" + str + ", opt: " + str2);
        a aVar = this.j;
        aVar.t = str;
        aVar.u = str2;
        if (e()) {
            this.j.a("createChannel2");
        } else if (c()) {
            TrtcLog.d("TrtcAdapter", "createChannel2, artcEngineEventHandler: " + this.j.f23027a);
            if (this.j.f23027a != null) {
                this.j.f23027a.onCreateChannelSuccess(this.j.b());
            } else {
                TrtcLog.d("TrtcAdapter", "createChannel2, artcEngineEventHandler is null");
            }
        }
        TrtcLog.d("TrtcAdapter", "createChannel2 done ");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void joinChannel2(final String str, final String str2, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3be4be", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.d("TrtcAdapter", "joinChannel2");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TrtcAdapter.d(TrtcAdapter.this)) {
                } else {
                    a b = TrtcAdapter.b(TrtcAdapter.this);
                    String str4 = str3;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = str5;
                    }
                    b.G = str4;
                    a b2 = TrtcAdapter.b(TrtcAdapter.this);
                    String str6 = str2;
                    if (str6 == null) {
                        str6 = str5;
                    }
                    b2.H = str6;
                    if (TrtcAdapter.e(TrtcAdapter.this).n()) {
                        TrtcLog.a("TrtcAdapter", "in call, don't joinchannel");
                        return;
                    }
                    if (TrtcAdapter.b(TrtcAdapter.this).B == null && TrtcAdapter.b(TrtcAdapter.this).n) {
                        TrtcAdapter.b(TrtcAdapter.this).B = TrtcAdapter.e(TrtcAdapter.this).f().startCapture(new TrtcStreamConfig.a().a(TrtcAdapter.b(TrtcAdapter.this).z, TrtcAdapter.b(TrtcAdapter.this).y, TrtcAdapter.b(TrtcAdapter.this).A).a(true).b(true).a());
                    }
                    TrtcAdapter.b(TrtcAdapter.this).G = str3;
                    TrtcDefines.g gVar = new TrtcDefines.g();
                    gVar.f23039a = str;
                    if (TrtcAdapter.b(TrtcAdapter.this).u != null) {
                        str5 = TrtcAdapter.b(TrtcAdapter.this).u;
                    }
                    gVar.b = str5;
                    gVar.d = TrtcAdapter.b(TrtcAdapter.this).o;
                    gVar.e = TrtcAdapter.b(TrtcAdapter.this).n;
                    gVar.c = TrtcAdapter.b(TrtcAdapter.this).B;
                    TrtcAdapter.e(TrtcAdapter.this).a(gVar);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void startLive(String str, final String str2, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7361e13", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.d("TrtcAdapter", "startLive");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TrtcAdapter.d(TrtcAdapter.this)) {
                } else {
                    a b = TrtcAdapter.b(TrtcAdapter.this);
                    String str4 = str3;
                    if (str4 == null) {
                        str4 = "";
                    }
                    b.G = str4;
                    a b2 = TrtcAdapter.b(TrtcAdapter.this);
                    String str5 = str2;
                    if (str5 == null) {
                        str5 = "";
                    }
                    b2.H = str5;
                    if (TrtcAdapter.e(TrtcAdapter.this).n()) {
                        TrtcLog.a("TrtcAdapter", "in call, don't joinchannel");
                        return;
                    }
                    if (TrtcAdapter.b(TrtcAdapter.this).B == null && TrtcAdapter.b(TrtcAdapter.this).n) {
                        TrtcAdapter.b(TrtcAdapter.this).B = TrtcAdapter.e(TrtcAdapter.this).f().startCapture(new TrtcStreamConfig.a().a(TrtcAdapter.b(TrtcAdapter.this).z, TrtcAdapter.b(TrtcAdapter.this).y, TrtcAdapter.b(TrtcAdapter.this).A).a(true).b(true).a());
                    }
                    TrtcAdapter.b(TrtcAdapter.this).G = str3;
                    TrtcDefines.h hVar = new TrtcDefines.h();
                    hVar.d = new HashMap();
                    hVar.b = TrtcAdapter.b(TrtcAdapter.this).t;
                    hVar.f23040a = TrtcAdapter.b(TrtcAdapter.this).s;
                    hVar.c = TrtcAdapter.b(TrtcAdapter.this).u != null ? TrtcAdapter.b(TrtcAdapter.this).u : TrtcAdapter.b(TrtcAdapter.this).H;
                    hVar.e = TrtcAdapter.b(TrtcAdapter.this).B;
                    if (!TrtcAdapter.e(TrtcAdapter.this).a(hVar)) {
                        TrtcLog.a("TrtcAdapter", "start live error");
                    } else {
                        hVar.e.setStatsObserver(TrtcAdapter.this);
                    }
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void stopLive() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f2995", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAdapter", "leaveChannel2");
        if (!c()) {
            return;
        }
        if (this.f23005a.j().b(this.f23005a.p())) {
            this.f23005a.u().a(this.j.i, TrtcDefines.TrtcUserRole.values()[this.j.E], "", "").a();
        }
        this.f23005a.q();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void joinChannel(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afe9e4a", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "joinChannel");
        joinChannel2(str, "", "");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void leaveChannel() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4d98d3", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAdapter", "leaveChannel");
        if (!c()) {
            return;
        }
        leaveChannel2("", "");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void leaveChannel2(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645a9381", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("TrtcAdapter", "leaveChannel2");
        if (!c()) {
            return;
        }
        if (this.f23005a.n()) {
            this.f23005a.u().a(this.j.i, TrtcDefines.TrtcUserRole.values()[this.j.E], "", str2).a();
        }
        this.f23005a.a(this.j.F, str2);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void notifyChannel(String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4899c6df", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "notifyChannel");
        TrtcDefines.l lVar = new TrtcDefines.l();
        lVar.f23044a = str;
        lVar.b = str2;
        lVar.e = str3;
        lVar.c = z;
        lVar.d = z2;
        this.f23005a.a(lVar);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void cancelNotifyChannel(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcad445", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.d("TrtcAdapter", "cancelNotifyChannel");
        this.f23005a.a(str, str2, str3);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void answerNotifyChannel(String str, String str2, TrtcDefines.TrtcAnswerType trtcAnswerType, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791e764e", new Object[]{this, str, str2, trtcAnswerType, str3});
            return;
        }
        TrtcLog.d("TrtcAdapter", "answerNotifyChannel");
        this.f23005a.a(str, str2, trtcAnswerType, str3);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void stopPreview() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        } else {
            stopPreview2("");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void stopPreview2(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199ea91d", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "stopPreview2");
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TrtcAdapter.d(TrtcAdapter.this)) {
                } else {
                    TrtcAdapter.e(TrtcAdapter.this).f().stopCapture();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void switchCamera() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46484f80", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAdapter", "switchCamera");
        switchCamera(null);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void switchCamera(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3068994a", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "switchCamera");
        if (!c()) {
            return;
        }
        this.f23005a.f().switchCamera();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteLocalAudioStream(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc39eee9", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "muteLocalAudioStream");
        if (!c() || this.f23005a.g() == null) {
            return;
        }
        this.f23005a.g().muteLocal(z);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteRemoteAudioStream(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e845efd6", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "muteRemoteAudioStream, muted: " + z);
        if (!c()) {
            return;
        }
        this.f23005a.g().muteRemote("", z);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteRemoteAudioStream(boolean z, String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17b1020", new Object[]{this, new Boolean(z), str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "muteRemoteAudioStream, muted:" + z + ", id: " + str);
        if (!c()) {
            return;
        }
        this.f23005a.g().muteRemote(str, z);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteLocalVideoStream(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdc0d24", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "muteLocalVideoStream");
        if (!c()) {
            return;
        }
        this.f23005a.f().muteLocalVideo(z);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setEnableSpeakerphone(final boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343421b9", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setEnableSpeakerphone, enable:" + z);
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TrtcAdapter.c(TrtcAdapter.this)) {
                    if (!TrtcAdapter.d(TrtcAdapter.this)) {
                        return;
                    }
                    TrtcAdapter.e(TrtcAdapter.this).g().enableSpeakerphone(z);
                } else {
                    synchronized (TrtcAdapter.b(TrtcAdapter.this)) {
                        TrtcAdapter.b(TrtcAdapter.this).v = z;
                        TrtcAdapter.b(TrtcAdapter.this).a("setEnableSpeakerphone");
                    }
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void registUser(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9d2832", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcAdapter", "registUser, userId: " + str);
        this.j.p = str;
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TrtcAdapter.c(TrtcAdapter.this)) {
                    TrtcAdapter.b(TrtcAdapter.this).p = str;
                    TrtcAdapter.b(TrtcAdapter.this).a("registUser");
                } else if (!TrtcAdapter.d(TrtcAdapter.this)) {
                } else {
                    TrtcAdapter.e(TrtcAdapter.this).g(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unregistUser() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c945741", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAdapter", "unregistUser");
        if (this.c.protocal().equals(TrtcSignalChannel.f23181a)) {
            com.taobao.trtc.accs.a.a();
        }
        if (!c()) {
            return;
        }
        this.f23005a.o();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void invite(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97ff424", new Object[]{this, str, str2});
        } else {
            invite2(str, str2, "", "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void call(String str, String str2, int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6dbbaa", new Object[]{this, str, str2, new Integer(i)});
        } else {
            call2(str, str2, i, 2, "", "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void call2(String str, String str2, int i, int i2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ca99e3", new Object[]{this, str, str2, new Integer(i), new Integer(i2), str3, str4});
        } else {
            call2(str, str2, i, i2, str3, str4, 360, 640);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void call2(String str, String str2, int i, int i2, String str3, String str4, int i3, int i4) throws ArtcException {
        ITrtcInputStream iTrtcInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9a0d83", new Object[]{this, str, str2, new Integer(i), new Integer(i2), str3, str4, new Integer(i3), new Integer(i4)});
            return;
        }
        a aVar = this.j;
        aVar.E = i2;
        aVar.i = str2;
        if (aVar.m == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
            this.f23005a.f().setSubCaptureParams(i3, i4, 20);
            iTrtcInputStream = this.f23005a.f().startSubCapture();
            this.j.C = iTrtcInputStream;
        } else {
            iTrtcInputStream = this.j.B;
        }
        this.f23005a.r().a(str2, TrtcDefines.TrtcUserRole.values()[this.j.E], "", str4).a(str4).a(iTrtcInputStream).a();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void joinCall(final String str, final boolean z, final String str2, final int i, final int i2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812d556f", new Object[]{this, str, new Boolean(z), str2, new Integer(i), new Integer(i2), str3});
            return;
        }
        TrtcLog.d("TrtcAdapter", "joinCall, channelId: " + str + " ,isMutliChatMode: " + z + " ,extension: " + str2 + " ,width: " + i + " ,height: " + i2);
        if (!c()) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ITrtcInputStream iTrtcInputStream;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TrtcAdapter.e(TrtcAdapter.this) == null) {
                } else {
                    TrtcAdapter.e(TrtcAdapter.this).f(z);
                    TrtcDefines.g gVar = new TrtcDefines.g();
                    if (TrtcAdapter.b(TrtcAdapter.this).m == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
                        if (TrtcAdapter.b(TrtcAdapter.this).C == null) {
                            TrtcAdapter.e(TrtcAdapter.this).f().setSubCaptureParams(qvc.a("multiCallWidth", i), qvc.a("multiCallHeight", i2), qvc.a("multiCallFps", 20));
                            iTrtcInputStream = TrtcAdapter.e(TrtcAdapter.this).f().startSubCapture();
                            TrtcAdapter.b(TrtcAdapter.this).C = iTrtcInputStream;
                        } else {
                            iTrtcInputStream = TrtcAdapter.b(TrtcAdapter.this).C;
                        }
                        gVar.c = iTrtcInputStream;
                    }
                    gVar.f23039a = str;
                    gVar.h = z;
                    gVar.b = str2;
                    gVar.i = str3;
                    TrtcAdapter.e(TrtcAdapter.this).c(gVar);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void callMutli(final ArrayList<String> arrayList, final int i, final String str, final boolean z, int i2, int i3, final int i4, final String str2, final String str3) {
        ITrtcInputStream iTrtcInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283d2f98", new Object[]{this, arrayList, new Integer(i), str, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), str2, str3});
            return;
        }
        TrtcLog.d("TrtcAdapter", "callMutli, userIdList: " + arrayList.toString());
        if (!c()) {
            return;
        }
        this.f23005a.f(z);
        if (this.j.m == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
            if (this.j.C == null) {
                this.f23005a.f().setSubCaptureParams(qvc.a("multiCallWidth", i2), qvc.a("multiCallHeight", i3), qvc.a("multiCallFps", 20));
                this.j.C = this.f23005a.f().startSubCapture();
            }
            iTrtcInputStream = this.j.C;
        } else {
            iTrtcInputStream = this.j.B;
        }
        final ITrtcInputStream iTrtcInputStream2 = iTrtcInputStream;
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ITrtcCallInterface.d r = TrtcAdapter.e(TrtcAdapter.this).r();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r.a((String) it.next(), TrtcDefines.TrtcUserRole.values()[i], str3, "");
                }
                r.a(str);
                r.a(iTrtcInputStream2).a(z).a(i4).b(str2).a();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.artc.api.ArtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void answerMutli(final java.lang.String r12, int r13, final java.lang.String r14, final boolean r15, int r16, int r17, final java.lang.String r18) {
        /*
            r11 = this;
            r8 = r11
            r0 = r13
            r6 = r15
            r1 = r16
            r2 = r17
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.trtc.adapter.TrtcAdapter.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            r5 = 2
            r7 = 1
            if (r4 == 0) goto L43
            r4 = 8
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r9 = 0
            r4[r9] = r8
            r4[r7] = r12
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r13)
            r4[r5] = r7
            r0 = 3
            r4[r0] = r14
            r0 = 4
            java.lang.Boolean r5 = new java.lang.Boolean
            r5.<init>(r15)
            r4[r0] = r5
            r0 = 5
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            r4[r0] = r5
            r0 = 6
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            r4[r0] = r1
            r0 = 7
            r4[r0] = r18
            java.lang.String r0 = "720de08d"
            r3.ipc$dispatch(r0, r4)
            return
        L43:
            java.lang.String r3 = "TrtcAdapter"
            java.lang.String r4 = "answerMutli"
            com.taobao.trtc.utils.TrtcLog.d(r3, r4)
            boolean r3 = r11.c()
            if (r3 == 0) goto Lc2
            com.taobao.trtc.impl.TrtcEngineImpl r3 = r8.f23005a
            r3.f(r15)
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r3 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE
            if (r0 != r7) goto L5d
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r0 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE
        L5b:
            r9 = r0
            goto L63
        L5d:
            if (r0 != r5) goto L62
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r0 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT
            goto L5b
        L62:
            r9 = r3
        L63:
            com.taobao.trtc.adapter.a r0 = r8.j
            com.taobao.artc.api.AConstants$ArtcChannelProfile r0 = r0.m
            com.taobao.artc.api.AConstants$ArtcChannelProfile r3 = com.taobao.artc.api.AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST
            if (r0 != r3) goto La4
            com.taobao.trtc.adapter.a r0 = r8.j
            com.taobao.trtc.api.ITrtcInputStream r0 = r0.C
            if (r0 != 0) goto L9f
            com.taobao.trtc.impl.TrtcEngineImpl r0 = r8.f23005a
            com.taobao.trtc.api.TrtcVideoDevice r0 = r0.f()
            java.lang.String r3 = "multiCallWidth"
            int r1 = tb.qvc.a(r3, r1)
            java.lang.String r3 = "multiCallHeight"
            int r2 = tb.qvc.a(r3, r2)
            r3 = 20
            java.lang.String r4 = "multiCallFps"
            int r3 = tb.qvc.a(r4, r3)
            r0.setSubCaptureParams(r1, r2, r3)
            com.taobao.trtc.adapter.a r0 = r8.j
            com.taobao.trtc.impl.TrtcEngineImpl r1 = r8.f23005a
            com.taobao.trtc.api.TrtcVideoDevice r1 = r1.f()
            com.taobao.trtc.api.ITrtcInputStream r1 = r1.startSubCapture()
            r0.C = r1
        L9f:
            com.taobao.trtc.adapter.a r0 = r8.j
            com.taobao.trtc.api.ITrtcInputStream r0 = r0.C
            goto La8
        La4:
            com.taobao.trtc.adapter.a r0 = r8.j
            com.taobao.trtc.api.ITrtcInputStream r0 = r0.B
        La8:
            r5 = r0
            com.taobao.trtc.adapter.TrtcAdapter$5 r10 = new com.taobao.trtc.adapter.TrtcAdapter$5
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r9
            r6 = r15
            r7 = r18
            r0.<init>()
            r11.a(r10)
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r0 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT
            if (r9 != r0) goto Lc2
            com.taobao.trtc.adapter.a r0 = r8.j
            r1 = 0
            r0.C = r1
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.adapter.TrtcAdapter.answerMutli(java.lang.String, int, java.lang.String, boolean, int, int, java.lang.String):void");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void kickMutli(final ArrayList<String> arrayList, final String str, final boolean z, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f36c54", new Object[]{this, arrayList, str, new Boolean(z), str2});
            return;
        }
        TrtcLog.d("TrtcAdapter", "kickMutli");
        if (!c()) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ITrtcCallInterface.c u = TrtcAdapter.e(TrtcAdapter.this).u();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    u.a(str3, TrtcDefines.TrtcUserRole.values()[TrtcAdapter.e(TrtcAdapter.this).j().c(str3)], "", str);
                    if (str3 == TrtcAdapter.this.getUserId()) {
                        TrtcAdapter.b(TrtcAdapter.this).C = null;
                    }
                }
                u.c(str);
                u.a(z);
                u.b(str2);
                u.a();
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteRemoteAudio(ArrayList<String> arrayList, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47bfb8c", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "muteRemoteAudio, remoteStreamIdList: " + arrayList.toString() + " ,mute: " + z + " ,remoteNotify: " + z2);
        if (!c()) {
            return;
        }
        this.f23005a.a(arrayList, z, z2);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void customUTPerf(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99112a5", new Object[]{this, map});
            return;
        }
        TrtcEngineImpl trtcEngineImpl = this.f23005a;
        if (trtcEngineImpl == null) {
            return;
        }
        trtcEngineImpl.a(map);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void customUTTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52630226", new Object[]{this, str});
            return;
        }
        TrtcEngineImpl trtcEngineImpl = this.f23005a;
        if (trtcEngineImpl == null) {
            return;
        }
        trtcEngineImpl.j(str);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void answer(String str, String str2, String str3, int i, int i2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73b4503", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "answer");
        answer2(str, str2, str3, i, i2, false, "", "");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void answer2(String str, String str2, String str3, int i, int i2, boolean z, String str4, String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866a5d0f", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), new Boolean(z), str4, str5});
        } else {
            answer2(str, str2, str3, i, i2, z, str4, str5, 360, 640);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    @Override // com.taobao.artc.api.ArtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void answer2(java.lang.String r11, java.lang.String r12, final java.lang.String r13, int r14, int r15, boolean r16, java.lang.String r17, final java.lang.String r18, int r19, int r20) throws com.taobao.artc.api.ArtcException {
        /*
            r10 = this;
            r6 = r10
            r2 = r13
            r0 = r15
            r1 = r19
            r3 = r20
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.trtc.adapter.TrtcAdapter.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            r7 = 1
            r8 = 2
            if (r5 == 0) goto L57
            r5 = 11
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r9 = 0
            r5[r9] = r6
            r5[r7] = r11
            r5[r8] = r12
            r7 = 3
            r5[r7] = r2
            r2 = 4
            java.lang.Integer r7 = new java.lang.Integer
            r8 = r14
            r7.<init>(r14)
            r5[r2] = r7
            r2 = 5
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r15)
            r5[r2] = r7
            r0 = 6
            java.lang.Boolean r2 = new java.lang.Boolean
            r7 = r16
            r2.<init>(r7)
            r5[r0] = r2
            r0 = 7
            r5[r0] = r17
            r0 = 8
            r5[r0] = r18
            r0 = 9
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r5[r0] = r2
            r0 = 10
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r3)
            r5[r0] = r1
            java.lang.String r0 = "9555b5af"
            r4.ipc$dispatch(r0, r5)
            return
        L57:
            java.lang.String r4 = "TrtcAdapter"
            java.lang.String r5 = "answer2"
            com.taobao.trtc.utils.TrtcLog.d(r4, r5)
            boolean r4 = r10.c()
            if (r4 == 0) goto La7
            com.taobao.trtc.adapter.a r4 = r6.j
            r4.i = r2
            r4.E = r8
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r4 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE
            if (r0 != r7) goto L72
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r0 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE
        L70:
            r4 = r0
            goto L77
        L72:
            if (r0 != r8) goto L77
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r0 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT
            goto L70
        L77:
            com.taobao.trtc.adapter.a r0 = r6.j
            com.taobao.artc.api.AConstants$ArtcChannelProfile r0 = r0.m
            com.taobao.artc.api.AConstants$ArtcChannelProfile r5 = com.taobao.artc.api.AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST
            if (r0 != r5) goto L95
            com.taobao.trtc.impl.TrtcEngineImpl r0 = r6.f23005a
            com.taobao.trtc.api.TrtcVideoDevice r0 = r0.f()
            r5 = 20
            r0.setSubCaptureParams(r1, r3, r5)
            com.taobao.trtc.impl.TrtcEngineImpl r0 = r6.f23005a
            com.taobao.trtc.api.TrtcVideoDevice r0 = r0.f()
            com.taobao.trtc.api.ITrtcInputStream r0 = r0.startSubCapture()
            goto L99
        L95:
            com.taobao.trtc.adapter.a r0 = r6.j
            com.taobao.trtc.api.ITrtcInputStream r0 = r0.B
        L99:
            r5 = r0
            com.taobao.trtc.adapter.TrtcAdapter$8 r7 = new com.taobao.trtc.adapter.TrtcAdapter$8
            r0 = r7
            r1 = r10
            r2 = r13
            r3 = r18
            r0.<init>()
            r10.a(r7)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.adapter.TrtcAdapter.answer2(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, java.lang.String, int, int):void");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void kick(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4433e61", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("TrtcAdapter", "kick");
        kick2(str, str2, "", "");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void kick2(String str, final String str2, String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce1d25b", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TrtcLog.d("TrtcAdapter", "kick2");
        if (!c()) {
            return;
        }
        this.j.C = null;
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TrtcAdapter.e(TrtcAdapter.this).u().a(str2, TrtcDefines.TrtcUserRole.values()[TrtcAdapter.b(TrtcAdapter.this).E], "", str4).a();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void cancelCall(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7803a13", new Object[]{this, str, str2});
        } else {
            cancelCall2(str, str2, "", "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void cancelCall2(String str, final String str2, String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a269de9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TrtcLog.d("TrtcAdapter", "cancelCall2");
        if (!c()) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TrtcAdapter.e(TrtcAdapter.this).t().a(str2, TrtcDefines.TrtcUserRole.values()[TrtcAdapter.b(TrtcAdapter.this).E], "", str4).a();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public boolean isFrontFacingCamera() {
        TrtcEngineImpl trtcEngineImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08a01e9", new Object[]{this})).booleanValue();
        }
        TrtcLog.d("TrtcAdapter", "isFrontFacingCamera");
        if (c() && (trtcEngineImpl = this.f23005a) != null) {
            return trtcEngineImpl.f().isFrontFacing();
        }
        return false;
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendChannelBroadcastMsg(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e35e60", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.d("TrtcAdapter", "sendChannelBroadcastMsg, channelId: " + str + " ,message: " + str2 + " ,extInfo: " + str3);
        TrtcEngineImpl trtcEngineImpl = this.f23005a;
        if (trtcEngineImpl == null) {
            return;
        }
        trtcEngineImpl.b(str, str2, str3);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setRemoteVideoFreeze(ArrayList<TrtcDefines.p> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d636039", new Object[]{this, arrayList});
        } else if (arrayList.isEmpty()) {
            TrtcLog.a("TrtcAdapter", "setRemoteVideoFreeze, remoteVideoFreezeList is empty.");
        } else {
            TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams = new TrtcInnerDefines.TrtcRemoteVideoFreezeParams();
            trtcRemoteVideoFreezeParams.userInfos = new ArrayList<>();
            Iterator<TrtcDefines.p> it = arrayList.iterator();
            while (it.hasNext()) {
                TrtcDefines.p next = it.next();
                trtcRemoteVideoFreezeParams.userInfos.add(new TrtcInnerDefines.TrtcRemoteVideoFreezeInfo(next.f23048a, next.b));
            }
            TrtcEngineImpl trtcEngineImpl = this.f23005a;
            if (trtcEngineImpl == null) {
                return;
            }
            trtcEngineImpl.a(trtcRemoteVideoFreezeParams);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setAudioEventHandler(IAudioRecordEventHandler iAudioRecordEventHandler) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2539c55b", new Object[]{this, iAudioRecordEventHandler});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setAudioEventHandler");
        if (!c()) {
            return;
        }
        this.m.a(iAudioRecordEventHandler);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public IArtcExternalVideoCapturer getExternalVideoCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IArtcExternalVideoCapturer) ipChange.ipc$dispatch("af5d6eae", new Object[]{this});
        }
        ArtcConfig artcConfig = this.c;
        if (artcConfig == null || !artcConfig.useExternalVideoCapturer().booleanValue()) {
            return null;
        }
        return (IArtcExternalVideoCapturer) a();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public IArtcExternalVideoRender getExternalVideoRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IArtcExternalVideoRender) ipChange.ipc$dispatch("5958d8c0", new Object[]{this});
        }
        TrtcLog.d("TrtcAdapter", "getExternalVideoRender");
        if (this.c.useExternalVideoRenderer().booleanValue()) {
            return b();
        }
        return null;
    }

    private void a(AConstants.ArtcVideoProfile artcVideoProfile, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574823ce", new Object[]{this, artcVideoProfile, new Boolean(z)});
            return;
        }
        if (artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_15FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_180P_10FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P_20FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_244P_20FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_270P_12FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_20FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P2_20FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_25FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_15FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_20FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_480P_15FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_20FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_25FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_20FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_30FPS && artcVideoProfile != AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P2_20FPS) {
            z2 = false;
        }
        com.taobao.artc.utils.c.a("trtc video profile's value is not valid.", z2);
        if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_180P_10FPS) {
            this.n = 320;
            this.o = ArtcParams.SD180pVideoParams.HEIGHT;
            this.p = 10;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P_20FPS) {
            this.n = 320;
            this.o = 240;
            this.p = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_244P_20FPS) {
            this.n = ArtcParams.SD244pVideoParams.WIDTH;
            this.o = 400;
            this.p = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_270P_12FPS) {
            this.n = 480;
            this.o = 480;
            this.p = 12;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_15FPS) {
            this.n = 640;
            this.o = 360;
            this.p = 15;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_20FPS) {
            this.n = 640;
            this.o = 360;
            this.p = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P2_20FPS) {
            this.o = 288;
            this.n = this.o;
            this.p = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_25FPS) {
            this.n = 640;
            this.o = 360;
            this.p = 25;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_15FPS) {
            this.n = 640;
            this.o = ArtcParams.SD368pVideoParams.HEIGHT;
            this.p = 15;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_20FPS) {
            this.n = 640;
            this.o = ArtcParams.SD368pVideoParams.HEIGHT;
            this.p = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_480P_15FPS) {
            this.n = 640;
            this.o = 480;
            this.p = 15;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_20FPS) {
            this.n = 1280;
            this.o = 720;
            this.p = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_25FPS) {
            this.n = 1280;
            this.o = 720;
            this.p = 25;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_20FPS) {
            this.n = 1920;
            this.o = 1080;
            this.p = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_30FPS) {
            this.n = 1920;
            this.o = 1080;
            this.p = 30;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P2_20FPS) {
            this.o = 240;
            this.n = this.o;
            this.p = 20;
        } else {
            TrtcLog.c("TrtcAdapter", "setVideoProfile, currently unsupported profile: " + artcVideoProfile.ordinal());
        }
        if (z) {
            int i = this.n;
            this.n = this.o;
            this.o = i;
        }
        this.q = z;
        TrtcLog.d("TrtcAdapter", "setVideoProfile: " + artcVideoProfile + " landscape:" + z + ", size: " + this.n + "x" + this.o);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendMessage(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b42f67a", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("TrtcAdapter", "sendMessage: " + str2);
        if (this.f23005a == null || this.j.D == null) {
            return;
        }
        TrtcDefines.f fVar = new TrtcDefines.f();
        fVar.f23038a = str2.getBytes();
        this.j.D.sendDataFrame(fVar);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendMessage(String str, String str2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ddf68e", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TrtcLog.d("TrtcAdapter", "sendMessage, remoteUserId: " + str + " ,deviceId: " + str3 + " ,appkey: " + str4 + " ,msg: " + str2);
        if (!c()) {
            return;
        }
        this.f23005a.a(str, str2, str3, str4);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendCustomSei(String str, String str2, boolean z) throws ArtcException {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323a595b", new Object[]{this, str, str2, new Boolean(z)});
        } else if (str == null || str2 == null) {
        } else {
            TrtcLog.d("TrtcAdapter", "sendCustomSei, stream id:" + str + ", withKeyframe:" + z);
            if (!c() || (aVar = this.j) == null) {
                return;
            }
            if (str.equals(aVar.p) && this.j.B != null) {
                this.j.B.inputSei(str2, z);
            } else if (this.j.C == null) {
            } else {
                this.j.C.inputSei(str2, z);
            }
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoMirror(final boolean z, final boolean z2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e60559f", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.d("TrtcAdapter", "setVideoMirror, push: " + z + ", preview: " + z2);
        a(new Runnable() { // from class: com.taobao.trtc.adapter.TrtcAdapter.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcAdapter.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TrtcAdapter.c(TrtcAdapter.this)) {
                    TrtcAdapter.b(TrtcAdapter.this).d = z;
                    TrtcAdapter.b(TrtcAdapter.this).e = z2;
                    TrtcAdapter.b(TrtcAdapter.this).a("setVideoMirror");
                } else if (!TrtcAdapter.d(TrtcAdapter.this)) {
                } else {
                    TrtcAdapter.e(TrtcAdapter.this).f().setVideoMirror(z, z2);
                }
            }
        });
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream.b
    public void a(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acd942d", new Object[]{this, iVar});
        } else if (this.j.f23027a == null) {
        } else {
            this.j.f23027a.onTrtcLocalStats(iVar);
        }
    }
}

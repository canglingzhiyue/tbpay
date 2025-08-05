package com.taobao.trtc.impl;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.audio.TrtcAudioManager;
import com.taobao.trtc.utils.TrtcLog;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.audio.WebRtcExtProcessAudioFrame;
import org.webrtc.voiceengine.WebRtcAudioManager;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class a implements TrtcAudioDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TrtcEngineImpl f23098a;
    private TrtcAudioDevice.a c;
    private TrtcAudioDevice.a d;
    private TrtcAudioDevice.a e;
    private f f;
    private TrtcAudioManager i;
    private final Object b = new Object();
    private int g = 48000;
    private boolean h = false;
    private final AtomicBoolean j = new AtomicBoolean(false);

    static {
        kge.a(-262365345);
        kge.a(-34085477);
    }

    public static /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5d13ae7c", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ f b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("14723768", new Object[]{aVar}) : aVar.f;
    }

    public a(TrtcEngineImpl trtcEngineImpl, f fVar) {
        this.f23098a = trtcEngineImpl;
        this.f = fVar;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.j.get()) {
        } else {
            TrtcLog.d("TrtcAudioDevice", "init");
            WebRtcAudioUtils.setWebRtcBasedAcousticEchoCanceler(true);
            b(false);
            WebRtcAudioRecord.setErrorCallback(new WebRtcAudioRecord.WebRtcAudioRecordErrorCallback() { // from class: com.taobao.trtc.impl.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback
                public void onWebRtcAudioRecordInitError(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d42f4ee", new Object[]{this, str});
                        return;
                    }
                    synchronized (a.a(a.this)) {
                        if (a.b(a.this) != null) {
                            a.b(a.this).j(str);
                        }
                    }
                }

                @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback
                public void onWebRtcAudioRecordStartError(WebRtcAudioRecord.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("59e57c83", new Object[]{this, audioRecordStartErrorCode, str});
                        return;
                    }
                    synchronized (a.a(a.this)) {
                        if (a.b(a.this) != null) {
                            a.b(a.this).i(str);
                        }
                    }
                }

                @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback
                public void onWebRtcAudioRecordError(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("971ea69e", new Object[]{this, str});
                        return;
                    }
                    synchronized (a.a(a.this)) {
                        if (a.b(a.this) != null) {
                            a.b(a.this).k(str);
                        }
                    }
                }
            });
            this.i = TrtcAudioManager.a(h.f23132a, (Runnable) null);
            if (this.f23098a.i().config.isPreferHandset()) {
                TrtcLog.d("TrtcAudioDevice", "preferHandset");
                this.i.d();
            }
            this.j.set(true);
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAudioDevice", "deInit");
        WebRtcAudioRecord.setErrorCallback(null);
        b((Handler) null);
        synchronized (this.b) {
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.f23098a = null;
    }

    public synchronized void a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e49798", new Object[]{this, handler});
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            if (this.i == null) {
                this.i = TrtcAudioManager.a(h.f23132a, (Runnable) null);
            }
            if (this.i != null && this.f23098a != null && this.f23098a != null && this.f23098a.i() != null) {
                this.i.a(this.f23098a.i().config.isUseBlueTooth(), new TrtcAudioManager.a() { // from class: com.taobao.trtc.impl.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.trtc.audio.TrtcAudioManager.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        TrtcLog.d("TrtcAudioDevice", "audio blue tooth connected");
                        if (a.b(a.this) == null) {
                            return;
                        }
                        a.b(a.this).d();
                    }

                    @Override // com.taobao.trtc.audio.TrtcAudioManager.a
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                            return;
                        }
                        TrtcLog.d("TrtcAudioDevice", "audio blue tooth disconnected");
                        if (a.b(a.this) == null) {
                            return;
                        }
                        a.b(a.this).e();
                    }

                    @Override // com.taobao.trtc.audio.TrtcAudioManager.a
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                            return;
                        }
                        TrtcLog.d("TrtcAudioDevice", "audio route changed to: " + TrtcDefines.TrtcAudioRouteDevice.values()[i]);
                        if (a.b(a.this) == null) {
                            return;
                        }
                        a.b(a.this).b(i);
                    }

                    @Override // com.taobao.trtc.audio.TrtcAudioManager.a
                    public void a(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("audio focus changed to: ");
                        sb.append(z ? "gained" : "loss");
                        TrtcLog.d("TrtcAudioDevice", sb.toString());
                        if (a.b(a.this) == null) {
                            return;
                        }
                        a.b(a.this).c(z);
                    }
                });
            }
        } else if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public synchronized void b(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca14e499", new Object[]{this, handler});
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (this.i != null) {
                this.i.a();
                this.i = null;
                this.f = null;
            }
        } else if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }

    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.i != null) {
            this.i.a(z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioObserver(TrtcAudioDevice.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f225d238", new Object[]{this, aVar});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - AudioDataObserver: " + aVar);
        this.c = aVar;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioProcessObserver(TrtcAudioDevice.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a65831", new Object[]{this, aVar});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - setAudioProcessObserver: " + aVar);
        this.d = aVar;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioPlayoutObserver(TrtcAudioDevice.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd5dd26", new Object[]{this, aVar});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - setAudioPlayoutObserver: " + aVar);
        this.e = aVar;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioEventObserver(ITrtcObserver.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11046979", new Object[]{this, aVar});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - setAudioEventObserver: " + aVar);
        this.f.a(aVar);
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public TrtcDefines.TrtcAudioRouteDevice getCurrentDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcAudioRouteDevice) ipChange.ipc$dispatch("64d253d2", new Object[]{this});
        }
        TrtcAudioManager trtcAudioManager = this.i;
        if (trtcAudioManager != null) {
            TrtcAudioManager.AudioDevice b = trtcAudioManager.b();
            if (b == TrtcAudioManager.AudioDevice.SPEAKER_PHONE) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_SPEAKER;
            }
            if (b == TrtcAudioManager.AudioDevice.EARPIECE) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_EARPIECE;
            }
            if (b == TrtcAudioManager.AudioDevice.WIRED_HEADSET) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_WIRED_HEADSET;
            }
            if (b == TrtcAudioManager.AudioDevice.BLUETOOTH_HEADSET) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_BLUETOOTH_HEADSET;
            }
        }
        return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_NONE;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void enableSpeakerphone(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e03d47b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - enableSpeakerphone:" + z);
        TrtcAudioManager trtcAudioManager = this.i;
        if (trtcAudioManager == null) {
            return;
        }
        trtcAudioManager.b(z);
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void muteLocal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bbed9b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - muteLocal:" + z);
        TrtcEngineImpl trtcEngineImpl = this.f23098a;
        if (trtcEngineImpl == null) {
            return;
        }
        trtcEngineImpl.a(z);
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void muteRemote(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5e03c4", new Object[]{this, str, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - muteRemote:" + str + ", enable:" + z);
        TrtcEngineImpl trtcEngineImpl = this.f23098a;
        if (trtcEngineImpl == null) {
            return;
        }
        trtcEngineImpl.a(str, z);
    }

    public void a(WebRtcExtProcessAudioFrame webRtcExtProcessAudioFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628b8597", new Object[]{this, webRtcExtProcessAudioFrame});
            return;
        }
        TrtcAudioDevice.b bVar = new TrtcAudioDevice.b();
        bVar.f23031a = webRtcExtProcessAudioFrame.getSampleRate();
        bVar.b = webRtcExtProcessAudioFrame.getChannels();
        bVar.c = webRtcExtProcessAudioFrame.getSamplePerChannel();
        bVar.d = webRtcExtProcessAudioFrame.getAudioLevel();
        bVar.e = webRtcExtProcessAudioFrame.isSpeech();
        bVar.f = (bVar.c * bVar.b) << 1;
        bVar.g = webRtcExtProcessAudioFrame.getAudioData();
        bVar.h = webRtcExtProcessAudioFrame.getAudioDb();
        synchronized (this.b) {
            if (webRtcExtProcessAudioFrame.getType() == 0 && this.c != null) {
                this.c.onAudioFrame(bVar);
            } else if (webRtcExtProcessAudioFrame.getType() == 1 && this.d != null) {
                this.d.onAudioFrame(bVar);
            } else if (webRtcExtProcessAudioFrame.getType() == 2 && this.e != null) {
                this.e.onAudioFrame(bVar);
            }
        }
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAEDEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8283ac", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcAudioDevice", "API - setAEDEnable, enable:" + z);
        this.h = z;
        TrtcEngineImpl trtcEngineImpl = this.f23098a;
        if (trtcEngineImpl == null || !trtcEngineImpl.f("setAEDEnable")) {
            return;
        }
        this.f23098a.k();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.g;
    }

    public synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return this.e != null;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.h;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            WebRtcAudioManager.setStereoOutput(z);
        }
    }
}

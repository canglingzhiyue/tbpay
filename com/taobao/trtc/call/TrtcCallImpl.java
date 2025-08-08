package com.taobao.trtc.call;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcDataStream;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcOutputStream;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.api.b;
import com.taobao.trtc.api.e;
import com.taobao.trtc.call.ITrtcCallEngine;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.g;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcCallImpl extends b implements NetworkStatusHelper.INetworkStatusChangeListener, ITrtcCallEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final e f23070a;
    private ITrtcCallEngine.b b;
    private final ITrtcCallEngine.d c;
    private String e;
    private String f;
    private ITrtcInputStream g;
    private boolean h;
    private String d = "";
    private final Handler j = new Handler(Looper.getMainLooper());
    private final ConcurrentHashMap<String, a> i = new ConcurrentHashMap<>();

    /* loaded from: classes9.dex */
    public enum CallStatus {
        E_CALL_STATUS_IDLE,
        E_CALL_STATUS_TALKING,
        E_CALL_STATUS_CALLING
    }

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a */
        public String f23072a;
        public g c;
        public ITrtcOutputStream e;
        public ITrtcDataStream.a f;
        public CallStatus b = CallStatus.E_CALL_STATUS_IDLE;
        public boolean d = false;

        static {
            kge.a(-1189802953);
        }
    }

    static {
        kge.a(-532179923);
        kge.a(-1892363500);
        kge.a(-971120945);
    }

    public static /* synthetic */ Object ipc$super(TrtcCallImpl trtcCallImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$M7bvqGe0VrdVfChUwv-MG5nfTH8 */
    public static /* synthetic */ void m1542lambda$M7bvqGe0VrdVfChUwvMG5nfTH8(TrtcCallImpl trtcCallImpl, String str, boolean z) {
        trtcCallImpl.b(str, z);
    }

    public static /* synthetic */ void lambda$fZ8sK45u4Xhj2BatmfO6Z57evv4(TrtcCallImpl trtcCallImpl, TrtcAudioDevice.b bVar) {
        trtcCallImpl.a(bVar);
    }

    public static /* synthetic */ void lambda$rvtseOdNdx5gIuCpLYIkfK0du7E(TrtcCallImpl trtcCallImpl, boolean z) {
        trtcCallImpl.f(z);
    }

    /* renamed from: lambda$x4BYyAhq-P93969stNXpnfsBJHc */
    public static /* synthetic */ void m1543lambda$x4BYyAhqP93969stNXpnfsBJHc(TrtcCallImpl trtcCallImpl, boolean z) {
        trtcCallImpl.e(z);
    }

    @Override // com.taobao.trtc.api.b
    public void a(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ecc652", new Object[]{this, trtcErrorEvent, new Integer(i), str});
        }
    }

    public static /* synthetic */ ITrtcCallEngine.b a(TrtcCallImpl trtcCallImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcCallEngine.b) ipChange.ipc$dispatch("d70c48a7", new Object[]{trtcCallImpl}) : trtcCallImpl.b;
    }

    public TrtcCallImpl(Context context, ITrtcCallEngine.d dVar) {
        this.c = dVar;
        this.b = dVar.c;
        TrtcConfig a2 = new TrtcConfig.a().a(dVar.b).c(dVar.d).b(dVar.f23068a).a(this).b(dVar.e).g(true).a();
        this.f23070a = e.a(context);
        this.f23070a.a(a2);
        NetworkStatusHelper.startListener(context);
        NetworkStatusHelper.addStatusChangeListener(this);
        onNetworkStatusChanged(NetworkStatusHelper.getStatus());
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
        } else if (this.b == null) {
        } else {
            if (!networkStatus.isWifi()) {
                i = networkStatus.isMobile() ? 2 : 0;
            }
            this.b.b(i);
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        NetworkStatusHelper.removeStatusChangeListener(this);
        if (!StringUtils.isEmpty(this.d)) {
            this.f23070a.a(this.d, "Dispose");
        }
        b("Dispose");
        this.f23070a.b();
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean a(final ITrtcCallEngine.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5cae068", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null || this.f23070a == null || StringUtils.isEmpty(cVar.f23067a) || cVar.c > 1 || cVar.c < 0) {
            TrtcLog.a("CallEngine", "params invalid");
            return false;
        } else if (!StringUtils.isEmpty(this.d) || this.i.get(cVar.f23067a) != null) {
            TrtcLog.a("CallEngine", "already joined or call node exist, remote id: " + cVar.f23067a);
            return false;
        } else {
            if (StringUtils.isEmpty(cVar.b)) {
                cVar.b = this.f23070a.d("trtc-channel-call");
                TrtcLog.d("CallEngine", "create channel: " + cVar.b);
            }
            this.f = cVar.h;
            this.e = cVar.f23067a;
            a aVar = new a();
            aVar.f23072a = cVar.f23067a;
            aVar.b = CallStatus.E_CALL_STATUS_CALLING;
            this.i.put(cVar.f23067a, aVar);
            try {
                this.d = cVar.b;
                TrtcDefines.g gVar = new TrtcDefines.g();
                gVar.f23039a = cVar.b;
                gVar.d = true;
                gVar.e = false;
                gVar.f = true;
                this.f23070a.a(gVar);
                if (cVar.g > 0) {
                    aVar.c = new g(false, cVar.g, new g.a() { // from class: com.taobao.trtc.call.-$$Lambda$TrtcCallImpl$Dd5u8-rjsAqrzly3p3BWMBUyq1Q
                        @Override // com.taobao.trtc.utils.g.a
                        public final void onTimeOut() {
                            TrtcCallImpl.this.b(cVar);
                        }
                    });
                    aVar.c.a();
                }
            } catch (Throwable th) {
                TrtcLog.d("CallEngine", "exception when makecall, " + th.getMessage());
                b(aVar);
            }
            return true;
        }
    }

    public /* synthetic */ void b(ITrtcCallEngine.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406ba2e5", new Object[]{this, cVar});
            return;
        }
        TrtcLog.d("CallEngine", "call timeout, remoteId: " + cVar.f23067a);
        c(cVar.f23067a);
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(-103);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (!StringUtils.isEmpty(this.d)) {
            this.f23070a.a(this.d, str, i);
        }
        b("HangUpAll");
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        this.j.post(new Runnable() { // from class: com.taobao.trtc.call.-$$Lambda$TrtcCallImpl$rvtseOdNdx5gIuCpLYIkfK0du7E
            {
                TrtcCallImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TrtcCallImpl.lambda$rvtseOdNdx5gIuCpLYIkfK0du7E(TrtcCallImpl.this, z);
            }
        });
        return true;
    }

    public /* synthetic */ void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        e eVar = this.f23070a;
        if (eVar == null || eVar.g() == null) {
            return;
        }
        this.f23070a.g().muteLocal(z);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean a(final boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        this.j.post(new Runnable() { // from class: com.taobao.trtc.call.-$$Lambda$TrtcCallImpl$M7bvqGe0VrdVfChUwv-MG5nfTH8
            {
                TrtcCallImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TrtcCallImpl.m1542lambda$M7bvqGe0VrdVfChUwvMG5nfTH8(TrtcCallImpl.this, str, z);
            }
        });
        return true;
    }

    public /* synthetic */ void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        e eVar = this.f23070a;
        if (eVar == null || eVar.g() == null) {
            return;
        }
        this.f23070a.g().muteRemote(str, z);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean c(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        this.j.post(new Runnable() { // from class: com.taobao.trtc.call.-$$Lambda$TrtcCallImpl$x4BYyAhq-P93969stNXpnfsBJHc
            {
                TrtcCallImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TrtcCallImpl.m1543lambda$x4BYyAhqP93969stNXpnfsBJHc(TrtcCallImpl.this, z);
            }
        });
        return true;
    }

    public /* synthetic */ void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        e eVar = this.f23070a;
        if (eVar == null || eVar.g() == null) {
            return;
        }
        this.f23070a.g().enableSpeakerphone(z);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean a(ITrtcCallEngine.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5cbc926", new Object[]{this, eVar})).booleanValue();
        }
        TrtcLog.d("CallEngine", "startAndSendScrren");
        ITrtcInputStream iTrtcInputStream = this.g;
        if (iTrtcInputStream == null) {
            TrtcLog.a("CallEngine", "no inputstream");
            return false;
        }
        TrtcStreamConfig streamConfig = iTrtcInputStream.streamConfig();
        streamConfig.setVideoEnable(true);
        if (this.f23070a.f().startScreenCapture(new TrtcStreamConfig.a().a(streamConfig.isAudioEnable()).c(streamConfig.isDataEnable()).b(streamConfig.isVideoEnable()).a(eVar.f23069a, eVar.b, eVar.c).a(), eVar.d) == null) {
            TrtcLog.a("CallEngine", "startScreenCapture error");
            return false;
        }
        this.h = true;
        TrtcDefines.g gVar = new TrtcDefines.g();
        gVar.d = streamConfig.isAudioEnable();
        gVar.f = streamConfig.isDataEnable();
        gVar.e = streamConfig.isVideoEnable();
        gVar.f23039a = this.d;
        gVar.c = this.g;
        this.f23070a.b(gVar);
        return true;
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.h || this.g == null) {
            return false;
        }
        TrtcLog.d("CallEngine", "stopSendSceen");
        TrtcStreamConfig streamConfig = this.g.streamConfig();
        streamConfig.setVideoEnable(false);
        TrtcDefines.g gVar = new TrtcDefines.g();
        gVar.d = streamConfig.isAudioEnable();
        gVar.f = streamConfig.isDataEnable();
        gVar.e = streamConfig.isVideoEnable();
        gVar.c = this.g;
        gVar.f23039a = this.d;
        this.f23070a.b(gVar);
        this.f23070a.f().stopScreenCapture();
        this.h = false;
        return true;
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!this.h) {
            return false;
        }
        TrtcLog.d("CallEngine", "pauseSendScreen, enable: " + z);
        this.f23070a.f().pauseScreenCapture(z);
        return true;
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7926cad3", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        TrtcDefines.f fVar = new TrtcDefines.f();
        fVar.f23038a = str.getBytes();
        fVar.b = i;
        this.g.sendDataFrame(fVar);
        return true;
    }

    @Override // com.taobao.trtc.api.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        if (z) {
            this.f23070a.g().setAudioObserver(new TrtcAudioDevice.a() { // from class: com.taobao.trtc.call.-$$Lambda$TrtcCallImpl$fZ8sK45u4Xhj2BatmfO6Z57evv4
                @Override // com.taobao.trtc.api.TrtcAudioDevice.a
                public final void onAudioFrame(TrtcAudioDevice.b bVar2) {
                    TrtcCallImpl.lambda$fZ8sK45u4Xhj2BatmfO6Z57evv4(TrtcCallImpl.this, bVar2);
                }
            });
            this.b.a();
            return;
        }
        bVar.a(-101);
    }

    public /* synthetic */ void a(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98a0560", new Object[]{this, bVar});
            return;
        }
        ITrtcCallEngine.b bVar2 = this.b;
        if (bVar2 == null) {
            return;
        }
        bVar2.a(bVar);
    }

    @Override // com.taobao.trtc.api.b
    public void a(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acbc2b1", new Object[]{this, eVar});
        } else if (eVar.b != 0) {
            b("JoinError");
            this.b.a(-102);
        } else if (StringUtils.isEmpty(this.e)) {
            TrtcLog.a("CallEngine", "join success, but no remote to notify");
            this.b.a(-104);
        } else {
            a a2 = a(this.e);
            if (a2 != null) {
                a2.d = true;
            }
            TrtcDefines.l lVar = new TrtcDefines.l();
            lVar.f23044a = eVar.f23037a;
            lVar.b = this.e;
            lVar.c = true;
            if (!StringUtils.isEmpty(this.f)) {
                lVar.e = this.f;
            }
            this.f = null;
            this.e = null;
            TrtcLog.d("CallEngine", "joinsuccess, start notify channel to " + lVar.b);
            this.f23070a.a(lVar);
        }
    }

    @Override // com.taobao.trtc.api.b
    public void a(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8803561e", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(trtcMediaConnectionState);
    }

    @Override // com.taobao.trtc.api.b
    public void a(TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acb4e52", new Object[]{this, dVar});
            return;
        }
        TrtcLog.d("CallEngine", "onNotifyEvent, action: " + dVar.f23036a + ", remoteId: " + dVar.b);
        a a2 = a(dVar.b);
        if (a2 == null || a2.b == CallStatus.E_CALL_STATUS_TALKING) {
            return;
        }
        a2.c.b();
        a2.d = false;
        ITrtcCallEngine.a aVar = new ITrtcCallEngine.a();
        aVar.b = dVar.c;
        aVar.f23066a = dVar.b;
        aVar.e = dVar.f;
        aVar.c = dVar.e ? 1 : 0;
        if (dVar.f23036a == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_AGREE) {
            aVar.d = true;
            a2.b = CallStatus.E_CALL_STATUS_TALKING;
            c(a2);
        } else if (dVar.f23036a == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_DIS_AGREE) {
            aVar.d = false;
            c(dVar.b);
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(aVar);
    }

    @Override // com.taobao.trtc.api.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("CallEngine", "onRemoteJoinedChannel, id: " + str + ", extension: " + str2);
        if (a(str) != null) {
            TrtcDefines.d dVar = new TrtcDefines.d();
            dVar.f23036a = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_AGREE;
            dVar.b = str;
            dVar.c = this.d;
            dVar.f = str2;
            dVar.d = true;
            dVar.e = false;
            a(dVar);
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(str, str2);
    }

    @Override // com.taobao.trtc.api.b
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("CallEngine", "remote leave, " + str);
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            bVar.b(str, str2);
        }
        c(str);
    }

    @Override // com.taobao.trtc.api.b
    public void a(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777bd59", new Object[]{this, new Integer(i), bundle});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null || bundle == null) {
            return;
        }
        try {
            if (i == 405) {
                bVar.a(TrtcDefines.TrtcAudioRouteDevice.values()[bundle.getInt(TrtcConstants.TRTC_PARAMS_AUDIO_ROUTE)]);
            } else if (i != 406) {
            } else {
                bVar.a(TrtcDefines.TrtcAudioFocusState.values()[bundle.getInt(TrtcConstants.TRTC_PARAMS_AUDIO_FOCUS)]);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.trtc.api.b
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(true, str);
    }

    @Override // com.taobao.trtc.api.b
    public void a(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17a39c", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(trtcNetWorkQuality);
    }

    @Override // com.taobao.trtc.api.b
    public void b(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba80a5a", new Object[]{this, new Integer(i), bundle});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.c(i);
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("275e4bf9", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.i.get(str);
        }
        TrtcLog.a("CallEngine", "can not find call node by id: " + str);
        return null;
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5f2def", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (aVar.c != null) {
                aVar.c.b();
            }
            if (this.f23070a == null) {
                return;
            }
            if (aVar.d) {
                this.f23070a.a(this.d, aVar.f23072a, (String) null);
            }
            if (aVar.e == null) {
                return;
            }
            this.f23070a.c(aVar.f23072a);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TrtcLog.d("CallEngine", "clear call list for: " + str);
        for (a aVar : this.i.values()) {
            a(aVar);
        }
        this.i.clear();
        if (this.h) {
            this.h = false;
            this.f23070a.f().stopScreenCapture();
        }
        if (this.g != null) {
            this.f23070a.a(this.c.d);
            this.g = null;
        }
        this.f = null;
        this.e = null;
        this.d = "";
    }

    private void c(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (concurrentHashMap = this.i) == null || !concurrentHashMap.containsKey(str)) {
        } else {
            a(this.i.get(str));
            this.i.remove(str);
            TrtcLog.d("CallEngine", "remove call node by id: " + str + ", remain size: " + this.i.size());
        }
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c4630e", new Object[]{this, aVar});
        } else {
            c(aVar.f23072a);
        }
    }

    private void c(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a29982d", new Object[]{this, aVar});
            return;
        }
        TrtcLog.d("CallEngine", "createInputAndOutputForData " + aVar.f23072a);
        if (this.f23070a == null) {
            return;
        }
        if (this.g == null) {
            this.g = this.f23070a.a(this.c.d, new TrtcStreamConfig.a().a(true).b(false).c(true).a(), (ITrtcInputStream.a) null);
        }
        if (aVar.e != null) {
            return;
        }
        aVar.e = this.f23070a.b(aVar.f23072a);
        if (aVar.e == null) {
            return;
        }
        aVar.f = new ITrtcDataStream.a() { // from class: com.taobao.trtc.call.TrtcCallImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TrtcCallImpl.this = this;
            }

            @Override // com.taobao.trtc.api.ITrtcDataStream.a
            public void a(TrtcDefines.f fVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1acc3710", new Object[]{this, fVar});
                } else if (TrtcCallImpl.a(TrtcCallImpl.this) == null) {
                } else {
                    try {
                        TrtcCallImpl.a(TrtcCallImpl.this).a(aVar.f23072a, fVar);
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        aVar.e.setDataStreamObserver(aVar.f);
    }
}

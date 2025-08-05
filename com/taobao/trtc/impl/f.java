package com.taobao.trtc.impl;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.b;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class f extends com.taobao.trtc.api.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final ITrtcObserver.e f23126a;
    private final ITrtcObserver.c b;
    private final ITrtcObserver.b c;
    private ITrtcObserver.a d;
    private ITrtcObserver.f e;
    private final Object f = new Object();
    private final com.taobao.trtc.api.b g;

    static {
        kge.a(617385665);
    }

    public static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{new Integer(i)});
        }
        if (i == 200) {
            return "TRTC_EVENT_START_LIVE_SUCCESS";
        }
        if (i == 201) {
            return "TRTC_EVENT_LINK_LIVE_NEED_MIX";
        }
        switch (i) {
            case 100:
                return "TRTC_EVENT_ENGINE_INITIALIZE";
            case 101:
                return "TRTC_EVENT_NETWORK_QUALITY";
            case 102:
                return "TRTC_EVENT_NETWORK_STATS";
            case 103:
                return "TRTC_EVENT_MEDIA_CONNECTION_CHANGE";
            case 104:
                return "TRTC_EVENT_ERROR";
            case 105:
                return "TRTC_EVENT_PHONE_STATE";
            case 106:
                return "TRTC_EVENT_FIRST_REMOTE_VIDEO_FRAME";
            case 107:
                return "TRTC_EVENT_FIRST_REMOTE_AUDIO_FRAME";
            case 108:
                return "TRTC_EVENT_LOCAL_STREAM_UPDATED";
            case 109:
                return "TRTC_EVENT_REMOTE_STREAM_UPDATED";
            default:
                switch (i) {
                    case 300:
                        return "TRTC_EVENT_CAMERA_OPEN_ERROR";
                    case 301:
                        return "TRTC_EVENT_CAMERA_DISCONNECT";
                    case 302:
                        return "TRTC_EVENT_CAMERA_FREEZE";
                    case 303:
                        return "TRTC_EVENT_CAMERA_OPENING";
                    case 304:
                        return "TRTC_EVENT_CAMERA_FIRST_FRAME";
                    case 305:
                        return "TRTC_EVENT_CAMERA_CLOSED";
                    case 306:
                        return "TRTC_EVENT_CAMERA_SWITCH_DONE";
                    case 307:
                        return "TRTC_EVENT_CAMERA_SWITCH_ERROR";
                    default:
                        switch (i) {
                            case 400:
                                return "TRTC_EVENT_AUDIO_RECORD_INIT_ERROR";
                            case 401:
                                return "TRTC_EVENT_AUDIO_RECORD_START_ERROR";
                            case 402:
                                return "TRTC_EVENT_AUDIO_RECORD_READ_ERROR";
                            case 403:
                                return "TRTC_EVENT_AUDIO_BLUETOOTH_CONNECTED";
                            case 404:
                                return "TRTC_EVENT_AUDIO_BLUETOOTH_DISCONNECTED";
                            case 405:
                                return "TRTC_EVENT_AUDIO_ROUTE_CHANGED";
                            default:
                                switch (i) {
                                    case 500:
                                        return "TRTC_EVENT_MAKE_CALL_RSP";
                                    case 501:
                                        return "TRTC_EVENT_NEW_CALL";
                                    case 502:
                                        return "TRTC_EVENT_REMOTE_ANSWER";
                                    case 503:
                                        return "TRTC_EVENT_ANSWER_RSP";
                                    case 504:
                                        return "TRTC_EVENT_REMOTE_HANGUP";
                                    case 505:
                                        return "TRTC_EVENT_CALL_TIMEOUT";
                                    case 506:
                                        return "TRTC_EVENT_REMOTE_CANCEL";
                                    default:
                                        switch (i) {
                                            case 600:
                                                return "TRTC_EVENT_JOIN_CHANNEL_RSP";
                                            case 601:
                                                return "TRTC_EVENT_REMOTE_JOINED_CHANNEL";
                                            case 602:
                                                return "TRTC_EVENT_REMOTE_LEFT_CHANNEL";
                                            case 603:
                                                return "TRTC_EVENT_REMOTE_NOTIFY_CHANNEL";
                                            default:
                                                return "UNKNOW";
                                        }
                                }
                        }
                }
        }
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$1FALuB2pDEsnww0ghCBF5QLeRnc(f fVar, String str, String str2) {
        fVar.g(str, str2);
    }

    public static /* synthetic */ void lambda$2Dsqs8o7eXIBXfqkm5C1eRXclMg(f fVar, String str) {
        fVar.o(str);
    }

    public static /* synthetic */ void lambda$2Yl_9xtdXd2LTqCz8CZLSzpvHQY(f fVar) {
        fVar.i();
    }

    public static /* synthetic */ void lambda$4uOzPIHTrF7j7c7bp1LfhmZovJc(f fVar, String str) {
        fVar.l(str);
    }

    /* renamed from: lambda$5Nyc-Kd9BHYipu1dRbFKUgKTbGM */
    public static /* synthetic */ void m1548lambda$5NycKd9BHYipu1dRbFKUgKTbGM(f fVar, TrtcDefines.TrtcAnswerType trtcAnswerType, TrtcDefines.b bVar) {
        fVar.a(trtcAnswerType, bVar);
    }

    public static /* synthetic */ void lambda$61ovXXITDFsQOn5MLTMNGZfzRJw(f fVar, String str) {
        fVar.r(str);
    }

    /* renamed from: lambda$A8C-tQ05L3BHF93wLr8pD_4ogaE */
    public static /* synthetic */ void m1549lambda$A8CtQ05L3BHF93wLr8pD_4ogaE(f fVar) {
        fVar.g();
    }

    /* renamed from: lambda$B_-et6RZ7NgVrv5360_T9AEYRzU */
    public static /* synthetic */ void m1550lambda$B_et6RZ7NgVrv5360_T9AEYRzU(f fVar, String str, String str2) {
        fVar.h(str, str2);
    }

    public static /* synthetic */ void lambda$BukLrFnhAKXXkb7z86miVaVRZNE(f fVar, TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str) {
        fVar.b(cVar, trtcAnswerType, str);
    }

    public static /* synthetic */ void lambda$CAZzVPxUIRo7ix_cGjXBMe335L0(f fVar) {
        fVar.k();
    }

    /* renamed from: lambda$Dr-00rK5ueor1302QctbsMVsv5Q */
    public static /* synthetic */ void m1551lambda$Dr00rK5ueor1302QctbsMVsv5Q(f fVar, TrtcDefines.b bVar) {
        fVar.b(bVar);
    }

    public static /* synthetic */ void lambda$FH_7u1O0jWK9qnUCxnJPHdxYSZg(f fVar) {
        fVar.j();
    }

    public static /* synthetic */ void lambda$FdjfRhkmIxAz0sFyONOamXf5G_g(f fVar, String str, boolean z) {
        fVar.b(str, z);
    }

    /* renamed from: lambda$FzaiybxQa8Nx-I62aTXicqvmMIw */
    public static /* synthetic */ void m1552lambda$FzaiybxQa8NxI62aTXicqvmMIw(f fVar, b.C0989b c0989b) {
        fVar.b(c0989b);
    }

    /* renamed from: lambda$GD8FEc2rJYkLIxfIvfy-FRVM9bQ */
    public static /* synthetic */ void m1553lambda$GD8FEc2rJYkLIxfIvfyFRVM9bQ(f fVar, ArrayList arrayList) {
        fVar.d(arrayList);
    }

    /* renamed from: lambda$LYVJJ8DHM20wx859XKM6-U4i04A */
    public static /* synthetic */ void m1554lambda$LYVJJ8DHM20wx859XKM6U4i04A(f fVar, TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        fVar.b(trtcNetWorkQuality);
    }

    public static /* synthetic */ void lambda$M83rMYDy5mXhxi8SAlRjtwC69Tk(f fVar, boolean z) {
        fVar.d(z);
    }

    /* renamed from: lambda$OizRWzlVstbN9VKvkf4Qp6-RLCo */
    public static /* synthetic */ void m1555lambda$OizRWzlVstbN9VKvkf4Qp6RLCo(f fVar, String str) {
        fVar.q(str);
    }

    /* renamed from: lambda$RBerFVWyRtS-eAOiUc0JX5o_NAI */
    public static /* synthetic */ void m1556lambda$RBerFVWyRtSeAOiUc0JX5o_NAI(f fVar, TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        fVar.b(trtcMediaConnectionState);
    }

    public static /* synthetic */ void lambda$SdUaQm8RcWMCvkV0zI7nxujFTN8(f fVar, ArrayList arrayList) {
        fVar.c(arrayList);
    }

    /* renamed from: lambda$Tz7x7VfolFL-4gl-MsirOKfJFhQ */
    public static /* synthetic */ void m1557lambda$Tz7x7VfolFL4glMsirOKfJFhQ(f fVar, boolean z) {
        fVar.e(z);
    }

    public static /* synthetic */ void lambda$UQQ25hqcpMSQRwERGr87iRF7y_M(f fVar, b.a aVar) {
        fVar.b(aVar);
    }

    public static /* synthetic */ void lambda$ZzMZiyu5s5JngCVoU6Av2TV46eU(f fVar, int i) {
        fVar.d(i);
    }

    public static /* synthetic */ void lambda$a8hBdsr9qAsd6dKHk7E__kOi8WE(f fVar, String str, int i, int i2, int i3) {
        fVar.b(str, i, i2, i3);
    }

    public static /* synthetic */ void lambda$dKwJ2rGJCj5MKU0VtFXNuoy20Ic(f fVar, String str) {
        fVar.n(str);
    }

    public static /* synthetic */ void lambda$djAPbcIqQYv4vRWsitLST6OwjxQ(f fVar, TrtcDefines.e eVar) {
        fVar.b(eVar);
    }

    public static /* synthetic */ void lambda$fViCHI9ar4lPLXkD6XGYX5JHCdU(f fVar, String str) {
        fVar.m(str);
    }

    public static /* synthetic */ void lambda$kItPZZV8ix7FAWNi4ap_CCm333s(f fVar) {
        fVar.f();
    }

    public static /* synthetic */ void lambda$k_X43g5YYYpf2ARePnOotMmfKrI(f fVar, String str, String str2) {
        fVar.f(str, str2);
    }

    /* renamed from: lambda$l7HTEtASVA-towcUtPRv0Dspfg4 */
    public static /* synthetic */ void m1558lambda$l7HTEtASVAtowcUtPRv0Dspfg4(f fVar, ArrayList arrayList, String str) {
        fVar.b(arrayList, str);
    }

    public static /* synthetic */ void lambda$mgYNTXQkXGUZjz6Sd5kWAxwrLj0(f fVar, TrtcDefines.k kVar) {
        fVar.b(kVar);
    }

    public static /* synthetic */ void lambda$oPmTtS9ArqKu3cRvS8Jdn2vHvRo(f fVar, TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        fVar.b(trtcErrorEvent, i, str);
    }

    public static /* synthetic */ void lambda$p3OmHGPSfqu1i3OO45L6_fm_Jp8(f fVar, int i) {
        fVar.e(i);
    }

    public static /* synthetic */ void lambda$t0eBQK7I7mY7ZWxTFC940ae0Uy8(f fVar, String str) {
        fVar.p(str);
    }

    public static /* synthetic */ void lambda$wQMcIp0x6K5fb5sZqEPRryjC5u0(f fVar, TrtcDefines.d dVar) {
        fVar.b(dVar);
    }

    /* renamed from: lambda$x8ruMCdwkin-YvgI1D2KYbVo_Mg */
    public static /* synthetic */ void m1559lambda$x8ruMCdwkinYvgI1D2KYbVo_Mg(f fVar, String str, String str2) {
        fVar.i(str, str2);
    }

    /* renamed from: lambda$yZx-lFzvXiDLGt_o6n0Vh7tylic */
    public static /* synthetic */ void m1560lambda$yZxlFzvXiDLGt_o6n0Vh7tylic(f fVar, boolean z) {
        fVar.f(z);
    }

    /* renamed from: lambda$zaBkN6LNMi4UNyQAM-Ih81mRF08 */
    public static /* synthetic */ void m1561lambda$zaBkN6LNMi4UNyQAMIh81mRF08(f fVar, String str) {
        fVar.s(str);
    }

    public f(ITrtcObserver.e eVar, ITrtcObserver.c cVar, ITrtcObserver.b bVar, com.taobao.trtc.api.b bVar2) {
        this.f23126a = eVar;
        this.c = bVar;
        this.b = cVar;
        this.g = bVar2;
    }

    public void a(ITrtcObserver.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de9e614", new Object[]{this, aVar});
            return;
        }
        synchronized (this.f) {
            this.d = aVar;
        }
    }

    public void a(ITrtcObserver.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dec2bef", new Object[]{this, fVar});
            return;
        }
        synchronized (this.f) {
            this.e = fVar;
        }
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        TrtcLog.d("EventProxy", "onPhoneState, stat: " + i);
        Bundle bundle = new Bundle();
        if (i != 113) {
            i2 = 0;
        }
        bundle.putInt(TrtcConstants.TRTC_PARAMS_PHONE_STATE, i2);
        b(105, bundle, (Map<String, Object>) null);
        if (this.g == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(TrtcConstants.TRTC_PARAMS_PHONE_NUMBER, str);
        this.g.b(i, bundle2);
    }

    private void b(int i, Bundle bundle, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279c91eb", new Object[]{this, new Integer(i), bundle, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NotifyEvent >>>> ");
        sb.append(c(i));
        sb.append(" ### ");
        sb.append(bundle != null ? bundle.toString() : "");
        TrtcLog.d("EventProxy", sb.toString());
        com.taobao.trtc.api.b bVar = this.g;
        if (bVar == null) {
            return;
        }
        bVar.a(i, bundle, map);
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            com.taobao.artc.utils.a.a(runnable);
        }
    }

    @Override // com.taobao.trtc.api.b
    public void b(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar != null) {
            eVar.a(z);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$yZx-lFzvXiDLGt_o6n0Vh7tylic
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1560lambda$yZxlFzvXiDLGt_o6n0Vh7tylic(f.this, z);
            }
        });
    }

    public /* synthetic */ void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", z);
        b(100, bundle, (Map<String, Object>) null);
        this.g.b(z);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar != null) {
            eVar.a(i);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$p3OmHGPSfqu1i3OO45L6_fm_Jp8
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$p3OmHGPSfqu1i3OO45L6_fm_Jp8(f.this, i);
            }
        });
    }

    public /* synthetic */ void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ELAPSED, i);
        b(200, bundle, (Map<String, Object>) null);
        this.g.a(i);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17a39c", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar != null) {
            eVar.a(trtcNetWorkQuality);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$LYVJJ8DHM20wx859XKM6-U4i04A
            @Override // java.lang.Runnable
            public final void run() {
                f.m1554lambda$LYVJJ8DHM20wx859XKM6U4i04A(f.this, trtcNetWorkQuality);
            }
        });
    }

    public /* synthetic */ void b(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfabac9d", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("quality", trtcNetWorkQuality.ordinal());
        b(101, bundle, (Map<String, Object>) null);
        this.g.a(trtcNetWorkQuality);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ace7ceb", new Object[]{this, kVar});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar != null) {
            eVar.a(kVar);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$mgYNTXQkXGUZjz6Sd5kWAxwrLj0
            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$mgYNTXQkXGUZjz6Sd5kWAxwrLj0(f.this, kVar);
            }
        });
    }

    public /* synthetic */ void b(TrtcDefines.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ec6dca", new Object[]{this, kVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(TrtcConstants.TRTC_PARAMS_TOTAL_TX_BYTES, kVar.f23043a);
        bundle.putLong(TrtcConstants.TRTC_PARAMS_TOTAL_RX_BYTES, kVar.b);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_TOTAL_TX_KBPS, kVar.c);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_TOTAL_RX_KBPS, kVar.d);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AVAILABLE_BANDWIDTH, kVar.e);
        b(102, bundle, (Map<String, Object>) null);
        this.g.a(kVar);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8803561e", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar != null) {
            eVar.a(trtcMediaConnectionState);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$RBerFVWyRtS-eAOiUc0JX5o_NAI
            @Override // java.lang.Runnable
            public final void run() {
                f.m1556lambda$RBerFVWyRtSeAOiUc0JX5o_NAI(f.this, trtcMediaConnectionState);
            }
        });
    }

    public /* synthetic */ void b(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b92da5f", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("state", trtcMediaConnectionState.ordinal());
        b(103, bundle, (Map<String, Object>) null);
        this.g.a(trtcMediaConnectionState);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar != null) {
            eVar.a(str, z);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$FdjfRhkmIxAz0sFyONOamXf5G_g
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$FdjfRhkmIxAz0sFyONOamXf5G_g(f.this, str, z);
            }
        });
    }

    public /* synthetic */ void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("streamId", str);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_NEED_MIX, z);
        b(201, bundle, (Map<String, Object>) null);
        this.g.a(str, z);
    }

    @Override // com.taobao.trtc.api.b
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar == null) {
            return;
        }
        eVar.a(str);
    }

    @Override // com.taobao.trtc.api.b
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.TrtcErrorEvent trtcErrorEvent, final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ecc652", new Object[]{this, trtcErrorEvent, new Integer(i), str});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar != null) {
            eVar.a(trtcErrorEvent, i, str);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$oPmTtS9ArqKu3cRvS8Jdn2vHvRo
            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$oPmTtS9ArqKu3cRvS8Jdn2vHvRo(f.this, trtcErrorEvent, i, str);
            }
        });
    }

    public /* synthetic */ void b(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb377b31", new Object[]{this, trtcErrorEvent, new Integer(i), str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ERROR_EVENT, trtcErrorEvent.ordinal());
        bundle.putInt("errorCode", i);
        bundle.putString("errorMsg", str);
        b(104, bundle, (Map<String, Object>) null);
        this.g.a(trtcErrorEvent, i, str);
    }

    public void a(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0e582f", new Object[]{this, str, new Integer(i), str2, str3, str4});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar == null) {
            return;
        }
        eVar.a(str, i, str2, str3, str4);
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar == null) {
            return;
        }
        eVar.a(str, str2, str3, str4);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f2e93e", new Object[]{this, aVar});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.a(aVar.d, aVar.e);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$UQQ25hqcpMSQRwERGr87iRF7y_M
            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$UQQ25hqcpMSQRwERGr87iRF7y_M(f.this, aVar);
            }
        });
    }

    public /* synthetic */ void b(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229f94dd", new Object[]{this, aVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("audioEnable", aVar.f23054a);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE, aVar.b);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_DATA_ENABLE, aVar.c);
        b(108, bundle, (Map<String, Object>) null);
        this.g.a(aVar);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final b.C0989b c0989b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f35d9d", new Object[]{this, c0989b});
        } else if (this.g == null) {
        } else {
            a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$FzaiybxQa8Nx-I62aTXicqvmMIw
                @Override // java.lang.Runnable
                public final void run() {
                    f.m1552lambda$FzaiybxQa8NxI62aTXicqvmMIw(f.this, c0989b);
                }
            });
        }
    }

    public /* synthetic */ void b(b.C0989b c0989b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a0093c", new Object[]{this, c0989b});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("audioEnable", c0989b.b);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE, c0989b.c);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_DATA_ENABLE, c0989b.d);
        bundle.putString("streamId", c0989b.f23055a);
        b(109, bundle, (Map<String, Object>) null);
        this.g.a(c0989b);
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$zaBkN6LNMi4UNyQAM-Ih81mRF08
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1561lambda$zaBkN6LNMi4UNyQAMIh81mRF08(f.this, str);
            }
        });
    }

    public /* synthetic */ void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2312c4", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        b(300, bundle, (Map<String, Object>) null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.f) {
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$CAZzVPxUIRo7ix_cGjXBMe335L0
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$CAZzVPxUIRo7ix_cGjXBMe335L0(f.this);
            }
        });
    }

    public /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            b(301, (Bundle) null, (Map<String, Object>) null);
        }
    }

    public void e(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            if (this.e != null) {
                this.e.e(str, str2);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$61ovXXITDFsQOn5MLTMNGZfzRJw
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$61ovXXITDFsQOn5MLTMNGZfzRJw(f.this, str);
            }
        });
    }

    public /* synthetic */ void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f17983", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        b(302, bundle, (Map<String, Object>) null);
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$OizRWzlVstbN9VKvkf4Qp6-RLCo
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1555lambda$OizRWzlVstbN9VKvkf4Qp6RLCo(f.this, str);
            }
        });
    }

    public /* synthetic */ void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfe042", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TrtcConstants.TRTC_PARAMS_CAMERA_NAME, str);
        b(303, bundle, (Map<String, Object>) null);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        synchronized (this.f) {
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$FH_7u1O0jWK9qnUCxnJPHdxYSZg
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$FH_7u1O0jWK9qnUCxnJPHdxYSZg(f.this);
            }
        });
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            b(304, (Bundle) null, (Map<String, Object>) null);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this.f) {
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$2Yl_9xtdXd2LTqCz8CZLSzpvHQY
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$2Yl_9xtdXd2LTqCz8CZLSzpvHQY(f.this);
            }
        });
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            b(305, (Bundle) null, (Map<String, Object>) null);
        }
    }

    public void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this.f) {
            if (this.e != null) {
                this.e.b(z);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$Tz7x7VfolFL-4gl-MsirOKfJFhQ
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1557lambda$Tz7x7VfolFL4glMsirOKfJFhQ(f.this, z);
            }
        });
    }

    public /* synthetic */ void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_CAMERA_IS_FRONT, z);
        b(306, bundle, (Map<String, Object>) null);
    }

    public void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$t0eBQK7I7mY7ZWxTFC940ae0Uy8
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$t0eBQK7I7mY7ZWxTFC940ae0Uy8(f.this, str);
            }
        });
    }

    public /* synthetic */ void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        b(307, bundle, (Map<String, Object>) null);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            if (this.e != null) {
                this.e.h(str);
            }
        }
    }

    public void i(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            if (this.d != null) {
                this.d.e(str);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$2Dsqs8o7eXIBXfqkm5C1eRXclMg
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$2Dsqs8o7eXIBXfqkm5C1eRXclMg(f.this, str);
            }
        });
    }

    public /* synthetic */ void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cadc0", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        b(401, bundle, (Map<String, Object>) null);
        this.g.a(401, bundle);
    }

    public void j(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            if (this.d != null) {
                this.d.f(str);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$dKwJ2rGJCj5MKU0VtFXNuoy20Ic
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$dKwJ2rGJCj5MKU0VtFXNuoy20Ic(f.this, str);
            }
        });
    }

    public /* synthetic */ void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        b(400, bundle, (Map<String, Object>) null);
        this.g.a(400, bundle);
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar == null) {
            return;
        }
        eVar.c(z);
    }

    public void e(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e714cabe", new Object[]{this, arrayList});
            return;
        }
        ITrtcObserver.e eVar = this.f23126a;
        if (eVar == null) {
            return;
        }
        eVar.c(arrayList);
    }

    public void k(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            if (this.d != null) {
                this.d.g(str);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$fViCHI9ar4lPLXkD6XGYX5JHCdU
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$fViCHI9ar4lPLXkD6XGYX5JHCdU(f.this, str);
            }
        });
    }

    public /* synthetic */ void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        b(402, bundle, (Map<String, Object>) null);
        this.g.a(402, (Bundle) null);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            if (this.d != null) {
                this.d.b();
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$A8C-tQ05L3BHF93wLr8pD_4ogaE
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1549lambda$A8CtQ05L3BHF93wLr8pD_4ogaE(f.this);
            }
        });
    }

    public /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        b(403, (Bundle) null, (Map<String, Object>) null);
        this.g.a(403, (Bundle) null);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            if (this.d != null) {
                this.d.c();
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$kItPZZV8ix7FAWNi4ap_CCm333s
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$kItPZZV8ix7FAWNi4ap_CCm333s(f.this);
            }
        });
    }

    public /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        b(404, (Bundle) null, (Map<String, Object>) null);
        this.g.a(404, (Bundle) null);
    }

    public void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.f) {
            if (this.d != null) {
                this.d.b(i);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$ZzMZiyu5s5JngCVoU6Av2TV46eU
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$ZzMZiyu5s5JngCVoU6Av2TV46eU(f.this, i);
            }
        });
    }

    public /* synthetic */ void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_ROUTE, i);
        b(405, bundle, (Map<String, Object>) null);
        this.g.a(405, bundle);
    }

    public void c(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.g == null) {
        } else {
            a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$M83rMYDy5mXhxi8SAlRjtwC69Tk
                {
                    f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    f.lambda$M83rMYDy5mXhxi8SAlRjtwC69Tk(f.this, z);
                }
            });
        }
    }

    public /* synthetic */ void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_FOCUS, z ? 1 : 0);
        this.g.a(406, bundle);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final ArrayList<TrtcDefines.c> arrayList, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56be5b8c", new Object[]{this, arrayList, str});
            return;
        }
        synchronized (this.f) {
            if (this.c != null) {
                this.c.a(arrayList, str);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$l7HTEtASVA-towcUtPRv0Dspfg4
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1558lambda$l7HTEtASVAtowcUtPRv0Dspfg4(f.this, arrayList, str);
            }
        });
    }

    public /* synthetic */ void b(ArrayList arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19aac4eb", new Object[]{this, arrayList, str});
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TrtcDefines.c cVar = (TrtcDefines.c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("userId", cVar.f23035a);
            bundle.putInt("errorCode", cVar.b);
            bundle.putString("errorMsg", cVar.c);
            b(500, bundle, (Map<String, Object>) null);
        }
        this.g.a(arrayList, str);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aca6594", new Object[]{this, bVar});
            return;
        }
        synchronized (this.f) {
            if (this.c != null) {
                this.c.a(bVar);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$Dr-00rK5ueor1302QctbsMVsv5Q
            @Override // java.lang.Runnable
            public final void run() {
                f.m1551lambda$Dr00rK5ueor1302QctbsMVsv5Q(f.this, bVar);
            }
        });
    }

    public /* synthetic */ void b(TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e85673", new Object[]{this, bVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", bVar.f23034a);
        bundle.putInt("role", bVar.b.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_TRANS, bVar.c.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_VIDEO_TRANS, bVar.d.ordinal());
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, bVar.e);
        b(501, bundle, (Map<String, Object>) null);
        this.g.a(bVar);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.b bVar, final TrtcDefines.TrtcAnswerType trtcAnswerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bee8a1", new Object[]{this, bVar, trtcAnswerType});
            return;
        }
        synchronized (this.f) {
            if (this.c != null) {
                this.c.a(bVar, trtcAnswerType);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$5Nyc-Kd9BHYipu1dRbFKUgKTbGM
            @Override // java.lang.Runnable
            public final void run() {
                f.m1548lambda$5NycKd9BHYipu1dRbFKUgKTbGM(f.this, trtcAnswerType, bVar);
            }
        });
    }

    public /* synthetic */ void a(TrtcDefines.TrtcAnswerType trtcAnswerType, TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45685767", new Object[]{this, trtcAnswerType, bVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ANSWER_TYPE, trtcAnswerType.ordinal());
        bundle.putString("userId", bVar.f23034a);
        bundle.putInt("role", bVar.b.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_TRANS, bVar.c.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_VIDEO_TRANS, bVar.d.ordinal());
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, bVar.e);
        b(502, bundle, (Map<String, Object>) null);
        this.g.a(bVar, trtcAnswerType);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.c cVar, final TrtcDefines.TrtcAnswerType trtcAnswerType, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da1ecca", new Object[]{this, cVar, trtcAnswerType, str});
            return;
        }
        synchronized (this.f) {
            if (this.c != null) {
                this.c.a(cVar, trtcAnswerType, str);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$BukLrFnhAKXXkb7z86miVaVRZNE
            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$BukLrFnhAKXXkb7z86miVaVRZNE(f.this, cVar, trtcAnswerType, str);
            }
        });
    }

    public /* synthetic */ void b(TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0ea9e9", new Object[]{this, cVar, trtcAnswerType, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", cVar.f23035a);
        bundle.putInt("errorCode", cVar.b);
        bundle.putString("errorMsg", cVar.c);
        b(503, bundle, (Map<String, Object>) null);
        this.g.a(cVar, trtcAnswerType, str);
    }

    @Override // com.taobao.trtc.api.b
    public void c(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            if (this.c != null) {
                this.c.a(str, str2);
            } else {
                TrtcLog.d("EventProxy", "onRemoteCancel, callEventObserver is null.");
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$x8ruMCdwkin-YvgI1D2KYbVo_Mg
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1559lambda$x8ruMCdwkinYvgI1D2KYbVo_Mg(f.this, str, str2);
            }
        });
    }

    public /* synthetic */ void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        b(506, bundle, (Map<String, Object>) null);
        this.g.c(str, str2);
    }

    @Override // com.taobao.trtc.api.b
    public void d(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            if (this.c != null) {
                this.c.b(str, str2);
            } else {
                TrtcLog.d("EventProxy", "onRemoteHangup, callEventObserver is null.");
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$B_-et6RZ7NgVrv5360_T9AEYRzU
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1550lambda$B_et6RZ7NgVrv5360_T9AEYRzU(f.this, str, str2);
            }
        });
    }

    public /* synthetic */ void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b198ba83", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        b(504, bundle, (Map<String, Object>) null);
        this.g.d(str, str2);
    }

    @Override // com.taobao.trtc.api.b
    public void f(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            if (this.c != null) {
                this.c.b(str);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$4uOzPIHTrF7j7c7bp1LfhmZovJc
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$4uOzPIHTrF7j7c7bp1LfhmZovJc(f.this, str);
            }
        });
    }

    public /* synthetic */ void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        b(505, bundle, (Map<String, Object>) null);
        this.g.f(str);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final String str, final int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fb0d31", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.a(str, i, i2, i3);
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$a8hBdsr9qAsd6dKHk7E__kOi8WE
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$a8hBdsr9qAsd6dKHk7E__kOi8WE(f.this, str, i, i2, i3);
            }
        });
    }

    public /* synthetic */ void b(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d46050", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putInt("width", i);
        bundle.putInt("height", i2);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ELAPSED, i3);
        b(106, bundle, (Map<String, Object>) null);
        this.g.a(str, i, i2, i3);
    }

    @Override // com.taobao.trtc.api.b
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.a(str, i);
        }
        if (this.g == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ELAPSED, i);
        b(107, bundle, (Map<String, Object>) null);
        this.g.a(str, i);
    }

    @Override // com.taobao.trtc.api.b
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.c(str);
    }

    @Override // com.taobao.trtc.api.b
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.d(str);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acbc2b1", new Object[]{this, eVar});
            return;
        }
        synchronized (this.f) {
            if (this.b != null) {
                this.b.a(eVar);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$djAPbcIqQYv4vRWsitLST6OwjxQ
            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$djAPbcIqQYv4vRWsitLST6OwjxQ(f.this, eVar);
            }
        });
    }

    public /* synthetic */ void b(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e9b390", new Object[]{this, eVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("channelId", eVar.f23037a);
        bundle.putInt("errorCode", eVar.b);
        bundle.putString("errorMsg", eVar.c);
        b(600, bundle, (Map<String, Object>) null);
        this.g.a(eVar);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            if (this.b != null) {
                this.b.c(str, str2);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$1FALuB2pDEsnww0ghCBF5QLeRnc
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$1FALuB2pDEsnww0ghCBF5QLeRnc(f.this, str, str2);
            }
        });
    }

    public /* synthetic */ void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f88f82", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        b(601, bundle, (Map<String, Object>) null);
        this.g.a(str, str2);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        synchronized (this.f) {
            if (this.b != null) {
                this.b.a(arrayList);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$GD8FEc2rJYkLIxfIvfy-FRVM9bQ
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.m1553lambda$GD8FEc2rJYkLIxfIvfyFRVM9bQ(f.this, arrayList);
            }
        });
    }

    public /* synthetic */ void d(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53b779f", new Object[]{this, arrayList});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TrtcConstants.TRTC_PARAMS_PEER_LIST, arrayList.toString());
        b(601, bundle, (Map<String, Object>) null);
        this.g.a(arrayList);
    }

    @Override // com.taobao.trtc.api.b
    public void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            if (this.b != null) {
                this.b.d(str, str2);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$k_X43g5YYYpf2ARePnOotMmfKrI
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$k_X43g5YYYpf2ARePnOotMmfKrI(f.this, str, str2);
            }
        });
    }

    public /* synthetic */ void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        b(602, bundle, (Map<String, Object>) null);
        this.g.b(str, str2);
    }

    @Override // com.taobao.trtc.api.b
    public void b(final ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188d161", new Object[]{this, arrayList});
            return;
        }
        synchronized (this.f) {
            if (this.b != null) {
                this.b.b(arrayList);
            }
        }
        if (this.g == null) {
            return;
        }
        a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$SdUaQm8RcWMCvkV0zI7nxujFTN8
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$SdUaQm8RcWMCvkV0zI7nxujFTN8(f.this, arrayList);
            }
        });
    }

    public /* synthetic */ void c(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3622480", new Object[]{this, arrayList});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TrtcConstants.TRTC_PARAMS_PEER_LIST, arrayList.toString());
        b(602, bundle, (Map<String, Object>) null);
        this.g.b(arrayList);
    }

    @Override // com.taobao.trtc.api.b
    public void a(boolean z, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584761be", new Object[]{this, new Boolean(z), arrayList});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(z, arrayList);
    }

    public void a(boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1883b7", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(z, i, i2, i3);
    }

    @Override // com.taobao.trtc.api.b
    public void a(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83919388", new Object[]{this, trtcChannelAction, str, str2, str3});
            return;
        }
        synchronized (this.f) {
            if (this.b != null) {
                this.b.a(trtcChannelAction, str, str2, str3);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("action", trtcChannelAction.ordinal());
        bundle.putString("userId", str);
        bundle.putString("channelId", str2);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str3);
        b(603, bundle, (Map<String, Object>) null);
        this.g.a(trtcChannelAction, str, str2, str3);
    }

    @Override // com.taobao.trtc.api.b
    public void a(final TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acb4e52", new Object[]{this, dVar});
        } else {
            a(new Runnable() { // from class: com.taobao.trtc.impl.-$$Lambda$f$wQMcIp0x6K5fb5sZqEPRryjC5u0
                @Override // java.lang.Runnable
                public final void run() {
                    f.lambda$wQMcIp0x6K5fb5sZqEPRryjC5u0(f.this, dVar);
                }
            });
        }
    }

    public /* synthetic */ void b(TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e93f31", new Object[]{this, dVar});
            return;
        }
        com.taobao.trtc.api.b bVar = this.g;
        if (bVar != null) {
            bVar.a(dVar);
        }
        a(dVar.f23036a, dVar.b, dVar.c, dVar.f);
    }
}

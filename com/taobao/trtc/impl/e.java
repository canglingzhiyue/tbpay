package com.taobao.trtc.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.b;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.impl.TrtcStreamProcessorImpl;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TrtcEngineImpl f23111a;
    private final f b;
    private ITrtcObserver.d c;
    private long e;
    private long d = 0;
    private boolean g = false;
    private TrtcDefines.TrtcMediaConnectionState f = TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_NOT_USE;

    static {
        kge.a(1668051613);
    }

    public e(TrtcEngineImpl trtcEngineImpl, f fVar) {
        this.e = 0L;
        this.f23111a = trtcEngineImpl;
        this.e = System.currentTimeMillis();
        this.b = fVar;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEvent", "trtc native engine init success: " + z + ", elapsed: " + (System.currentTimeMillis() - this.e) + " ms");
        this.b.b(z);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            this.d = currentTimeMillis;
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcEvent", "live duration ms: " + (currentTimeMillis - this.d));
    }

    public void a(ITrtcObserver.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1deb4331", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f fVar = this.b;
        if (fVar == null) {
            return;
        }
        fVar.h();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.d > 0) {
            i = (int) (System.currentTimeMillis() - this.d);
        }
        com.taobao.trtc.utils.h.a("TrtcEvent", "live start success| elapsed: " + i + " ms");
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(i);
            this.b.a(TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_CONNECTED);
            this.b.a(TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_GOOD);
        }
        this.f23111a.b(true);
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            try {
                int parseInt = Integer.parseInt(map.get("state"));
                if (parseInt < 0 || parseInt > TrtcDefines.TrtcMediaConnectionState.values().length - 1) {
                    TrtcLog.a("TrtcEvent", "media connection state invalid : " + parseInt);
                    return;
                }
                this.f = TrtcDefines.TrtcMediaConnectionState.values()[parseInt];
                com.taobao.trtc.utils.h.a("TrtcEvent", "meida connection state: " + this.f);
                f fVar = this.b;
                if (fVar != null) {
                    fVar.a(this.f);
                }
                if (this.f == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_TIMEOUT || this.f == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
                    this.b.a(TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_BAD);
                }
                if (this.f == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
                    this.f23111a.b(false);
                } else if (this.f != TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_CONNECTED) {
                } else {
                    this.f23111a.b(true);
                }
            } catch (Exception e) {
                TrtcLog.a("TrtcEvent", "parse media connectoin state error: " + e.getMessage());
            }
        }
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get(com.taobao.trtc.utils.h.MTP);
            if (str.equals(com.taobao.trtc.utils.h.MTP_PERF) && this.f23111a.y() != null) {
                this.f23111a.y().a(h.f23132a, map);
            }
            com.taobao.trtc.utils.h.a(str, map);
        }
    }

    private TrtcDefines.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.a) ipChange.ipc$dispatch("8ee5f27f", new Object[]{this, str});
        }
        TrtcDefines.a aVar = new TrtcDefines.a();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.e.1
            }, new Feature[0]);
            if (!map.isEmpty()) {
                aVar.b = Integer.parseInt((String) map.get("lostRate"));
                aVar.d = Integer.parseInt((String) map.get("rtt"));
                aVar.e = Integer.parseInt((String) map.get("volumeStats"));
                aVar.c = Integer.parseInt((String) map.get("reTransRate"));
            }
        }
        return aVar;
    }

    private TrtcDefines.a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.a) ipChange.ipc$dispatch("b479fb80", new Object[]{this, str});
        }
        TrtcDefines.a aVar = new TrtcDefines.a();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.e.6
            }, new Feature[0]);
            if (!map.isEmpty()) {
                aVar.f23033a = (String) map.get("remoteStreamId");
                aVar.b = Integer.parseInt((String) map.get("lostRate"));
                aVar.d = Integer.parseInt((String) map.get("rtt"));
                aVar.e = Integer.parseInt((String) map.get("volumeStats"));
            }
        }
        return aVar;
    }

    private TrtcDefines.j c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.j) ipChange.ipc$dispatch("da0e0598", new Object[]{this, str});
        }
        TrtcDefines.j jVar = new TrtcDefines.j();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.e.7
            }, new Feature[0]);
            if (!str.isEmpty()) {
                jVar.f23042a = (String) map.get("codec");
                jVar.b = (String) map.get("preset");
                jVar.c = Integer.parseInt((String) map.get("sendBps"));
                jVar.d = Integer.parseInt((String) map.get("sendFps"));
                jVar.e = Integer.parseInt((String) map.get("inputFps"));
                jVar.f = Double.parseDouble((String) map.get("psnr"));
                jVar.g = Double.parseDouble((String) map.get("ssim"));
                jVar.h = Integer.parseInt((String) map.get("qp"));
                jVar.i = Integer.parseInt((String) map.get("rtt"));
                jVar.j = Integer.parseInt((String) map.get("lostRate"));
                jVar.k = Integer.parseInt((String) map.get("reTransRate"));
                jVar.l = Integer.parseInt((String) map.get("dropFrameByCapture"));
                jVar.o = Integer.parseInt((String) map.get("dropFrameByEncoder"));
                jVar.m = Integer.parseInt((String) map.get("dropFrameByEncoderQueue"));
                jVar.n = Integer.parseInt((String) map.get("dropFrameByRateLimiter"));
            }
        }
        return jVar;
    }

    private TrtcDefines.o d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.o) ipChange.ipc$dispatch("ffa20f34", new Object[]{this, str});
        }
        TrtcDefines.o oVar = new TrtcDefines.o();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.e.8
            }, new Feature[0]);
            if (!map.isEmpty()) {
                oVar.f23047a = (String) map.get("remoteStreamId");
                oVar.b = Integer.parseInt((String) map.get("delay"));
                oVar.c = Integer.parseInt((String) map.get("rtt"));
                oVar.d = Integer.parseInt((String) map.get("width"));
                oVar.e = Integer.parseInt((String) map.get("height"));
                oVar.h = Integer.parseInt((String) map.get("lostRate"));
                oVar.g = Integer.parseInt((String) map.get("recvFps"));
                oVar.f = Integer.parseInt((String) map.get("recvBitrate"));
                oVar.i = Integer.parseInt((String) map.get("ntpDelay"));
            }
        }
        return oVar;
    }

    private void c(Map<String, String> map) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (map != null) {
            if (this.f == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_TIMEOUT || this.f == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
                this.b.a(TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_BAD);
                return;
            }
            if (!map.get("networkStats").isEmpty()) {
                Map map2 = (Map) JSON.parseObject(map.get("networkStats"), new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.e.9
                }, new Feature[0]);
                int parseInt = Integer.parseInt((String) map2.get("networkQuality"));
                if (parseInt >= 0 && parseInt <= TrtcDefines.TrtcNetWorkQuality.values().length - 1 && (fVar = this.b) != null) {
                    fVar.a(TrtcDefines.TrtcNetWorkQuality.values()[parseInt]);
                }
                if (this.b != null) {
                    TrtcDefines.k kVar = new TrtcDefines.k();
                    kVar.f23043a = Long.parseLong((String) map2.get("txByte"));
                    kVar.b = Long.parseLong((String) map2.get("rxByte"));
                    kVar.c = Integer.parseInt((String) map2.get("txKBps"));
                    kVar.d = Integer.parseInt((String) map2.get("rxKBps"));
                    kVar.e = Integer.parseInt((String) map2.get("availableSendBps"));
                    this.b.a(kVar);
                }
            }
            if (map.get("sessionList").isEmpty()) {
                return;
            }
            ArrayList arrayList = (ArrayList) JSON.parseObject(map.get("sessionList"), new TypeReference<ArrayList<Map<String, String>>>() { // from class: com.taobao.trtc.impl.e.10
            }, new Feature[0]);
            for (int i = 0; i < arrayList.size(); i++) {
                TrtcDefines.i iVar = new TrtcDefines.i();
                iVar.f23041a = (String) ((Map) arrayList.get(i)).get("localStreamId");
                iVar.b = Integer.parseInt((String) ((Map) arrayList.get(i)).get("duration"));
                iVar.d = this.f23111a.y().d();
                iVar.c = this.f23111a.y().c();
                iVar.e = a((String) ((Map) arrayList.get(i)).get("localAudioStats"));
                iVar.f = c((String) ((Map) arrayList.get(i)).get("localVideoStats"));
                TrtcDefines.n nVar = new TrtcDefines.n();
                nVar.b = iVar.b;
                nVar.c = b((String) ((Map) arrayList.get(i)).get("remoteAudioStats"));
                nVar.d = d((String) ((Map) arrayList.get(i)).get("remoteVideoStats"));
                nVar.f23046a = nVar.c.f23033a;
                TrtcEngineImpl trtcEngineImpl = this.f23111a;
                if (trtcEngineImpl != null) {
                    trtcEngineImpl.a(iVar, nVar);
                }
            }
        }
    }

    private void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else if (map == null) {
        } else {
            int parseInt = Integer.parseInt(map.get("event"));
            int parseInt2 = Integer.parseInt(map.get("code"));
            String str = map.get("msg");
            if (parseInt < 0 || parseInt > TrtcDefines.TrtcErrorEvent.values().length - 1) {
                return;
            }
            TrtcDefines.TrtcErrorEvent trtcErrorEvent = TrtcDefines.TrtcErrorEvent.values()[parseInt];
            this.b.a(trtcErrorEvent, parseInt2, str);
            com.taobao.trtc.utils.h.a("TrtcEvent", "onError| event: " + trtcErrorEvent + " code:" + parseInt2 + " msg: " + str);
        }
    }

    private void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
        } else if (map == null) {
        } else {
            TrtcStreamProcessorImpl.a aVar = new TrtcStreamProcessorImpl.a();
            aVar.d = Integer.parseInt((String) Objects.requireNonNull(map.get("code")));
            aVar.e = map.get("msg");
            aVar.f23096a = map.get("inputId");
            aVar.b = map.get("remoteId");
            aVar.c = TrtcStreamProcessorImpl.ProcessType.E_NONE;
            int parseInt = Integer.parseInt((String) Objects.requireNonNull(map.get("ctrlType")));
            if (parseInt >= 0 && parseInt < TrtcStreamProcessorImpl.ProcessType.values().length) {
                aVar.c = TrtcStreamProcessorImpl.ProcessType.values()[parseInt];
            }
            if (this.f23111a.m() == null) {
                return;
            }
            this.f23111a.m().a(aVar);
        }
    }

    private void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b41f8", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("userId");
            String str2 = map.get("customMsg");
            ITrtcObserver.d dVar = this.c;
            if (dVar != null) {
                dVar.f(str, str2);
            } else {
                TrtcLog.a("TrtcEvent", "no observer for custom message");
            }
        }
    }

    private void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80d1857", new Object[]{this, map});
        } else if (map == null) {
        } else {
            boolean parseBoolean = Boolean.parseBoolean(map.get("isLocal"));
            boolean parseBoolean2 = Boolean.parseBoolean(map.get("audioEnable"));
            boolean parseBoolean3 = Boolean.parseBoolean(map.get(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE));
            boolean parseBoolean4 = Boolean.parseBoolean(map.get(TrtcConstants.TRTC_PARAMS_DATA_ENABLE));
            int parseInt = Integer.parseInt((String) Objects.requireNonNull(map.get("code")));
            String str = map.get("msg");
            if (parseInt != 0) {
                TrtcLog.a("TrtcEvent", "StreamUpdate, errorCode: " + parseInt + ", msg: " + str + ", ignore it");
            } else if (parseBoolean) {
                b.a aVar = new b.a();
                aVar.f23054a = parseBoolean2;
                aVar.b = parseBoolean3;
                aVar.c = parseBoolean4;
                this.b.a(aVar);
            } else {
                b.C0989b c0989b = new b.C0989b();
                c0989b.b = parseBoolean2;
                c0989b.c = parseBoolean3;
                c0989b.d = parseBoolean4;
                c0989b.f23055a = map.get("remoteUserId");
                this.b.a(c0989b);
            }
        }
    }

    private void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaeeeb6", new Object[]{this, map});
        } else if (map == null) {
        } else {
            TrtcDefines.b bVar = new TrtcDefines.b();
            int parseInt = Integer.parseInt(map.get("audioDirection"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.c = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt];
            }
            int parseInt2 = Integer.parseInt(map.get("videoDirection"));
            if (parseInt2 >= 0 && parseInt2 < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.d = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt2];
            }
            Map map2 = (Map) JSON.parseObject(map.get(com.taobao.android.weex_framework.util.a.ATOM_caller), new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.e.11
            }, new Feature[0]);
            bVar.f23034a = (String) map2.get("userId");
            bVar.e = (String) map2.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            int parseInt3 = Integer.parseInt((String) map2.get("role"));
            if (parseInt3 >= 0 && parseInt3 < TrtcDefines.TrtcUserRole.values().length) {
                bVar.b = TrtcDefines.TrtcUserRole.values()[parseInt3];
            }
            bVar.f = Boolean.parseBoolean(map.get("isMultiChatMode"));
            com.taobao.trtc.utils.h.a("TrtcEvent", "New call: " + bVar.f23034a + ", role: " + bVar.b + ", media trans profile: " + bVar.c + "-" + bVar.d + ", isMutliChatMode: " + bVar.f);
            this.f23111a.j().a(bVar.f23034a, bVar.b);
            this.b.a(bVar);
        }
    }

    private void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9750c515", new Object[]{this, map});
        } else if (map != null) {
            ArrayList<TrtcDefines.c> arrayList = new ArrayList<>();
            int parseInt = Integer.parseInt((String) Objects.requireNonNull(map.get("code")));
            this.f23111a.f(Boolean.parseBoolean(map.get("isMultiChatMode")));
            String str = map.get("msg");
            if (((String) Objects.requireNonNull(map.get("callStatusList"))).length() > 0) {
                ArrayList arrayList2 = (ArrayList) JSON.parseObject(map.get("callStatusList"), new TypeReference<ArrayList<Map<String, String>>>() { // from class: com.taobao.trtc.impl.e.12
                }, new Feature[0]);
                for (int i = 0; i < arrayList2.size(); i++) {
                    TrtcDefines.c cVar = new TrtcDefines.c();
                    cVar.b = Integer.parseInt((String) Objects.requireNonNull((String) ((Map) arrayList2.get(i)).get("code")));
                    cVar.c = (String) ((Map) arrayList2.get(i)).get("msg");
                    cVar.f23035a = (String) ((Map) arrayList2.get(i)).get("userId");
                    arrayList.add(cVar);
                    if (cVar.b != 0) {
                        this.f23111a.j().a(cVar.f23035a);
                    } else {
                        this.f23111a.j().a(cVar.f23035a, TrtcInnerDefines.CallState.E_CALL_ING);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                TrtcDefines.c cVar2 = new TrtcDefines.c();
                cVar2.c = str;
                cVar2.b = parseInt;
                cVar2.f23035a = "null";
                arrayList.add(cVar2);
            } else if (parseInt != 0) {
                arrayList.get(0).c = str;
                arrayList.get(0).b = parseInt;
            }
            com.taobao.trtc.utils.h.a("TrtcEvent", "Call rsp: " + arrayList.toString());
            this.b.a(arrayList, map.get(TrtcConstants.TRTC_PARAMS_EXTENSION));
        }
    }

    private void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef29b74", new Object[]{this, map});
        } else if (map == null) {
        } else {
            TrtcDefines.b bVar = new TrtcDefines.b();
            TrtcDefines.TrtcAnswerType trtcAnswerType = TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE;
            int parseInt = Integer.parseInt(map.get("audioDirection"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.c = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt];
            }
            int parseInt2 = Integer.parseInt(map.get("videoDirection"));
            if (parseInt2 >= 0 && parseInt2 < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.d = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt2];
            }
            int parseInt3 = Integer.parseInt(map.get("peerRole"));
            if (parseInt3 >= 0 && parseInt3 < TrtcDefines.TrtcUserRole.values().length) {
                bVar.b = TrtcDefines.TrtcUserRole.values()[parseInt3];
            }
            int parseInt4 = Integer.parseInt(map.get(TrtcConstants.TRTC_PARAMS_ANSWER_TYPE));
            if (parseInt4 >= 0 && parseInt4 < TrtcDefines.TrtcAnswerType.values().length) {
                trtcAnswerType = TrtcDefines.TrtcAnswerType.values()[parseInt4];
            }
            bVar.f23034a = map.get("remoteUserId");
            bVar.e = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            bVar.f = Boolean.parseBoolean(map.get("isMultiChatMode"));
            bVar.g = map.get("channelId");
            com.taobao.trtc.utils.h.a("TrtcEvent", "Remote answer call: " + bVar.f23034a + ", role: " + bVar.b + ", answer type: " + trtcAnswerType + ", media trans profile: " + bVar.c + "-" + bVar.d + ", isMutliChatMode: " + bVar.f);
            if (this.f23111a != null && trtcAnswerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE) {
                this.f23111a.b(bVar.f23034a, true);
                this.f23111a.b(true);
            } else {
                this.f23111a.j().a(bVar.f23034a);
            }
            this.b.a(bVar, trtcAnswerType);
        }
    }

    private void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669471d3", new Object[]{this, map});
        } else if (map == null) {
        } else {
            TrtcDefines.c cVar = new TrtcDefines.c();
            TrtcDefines.TrtcAnswerType trtcAnswerType = TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE;
            cVar.b = Integer.parseInt((String) Objects.requireNonNull(map.get("code")));
            cVar.c = map.get("msg");
            cVar.f23035a = map.get("remoteUserId");
            cVar.d = map.get("channelId");
            this.f23111a.f(Boolean.parseBoolean(map.get("isMultiChatMode")));
            int parseInt = Integer.parseInt(map.get(TrtcConstants.TRTC_PARAMS_ANSWER_TYPE));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcAnswerType.values().length) {
                trtcAnswerType = TrtcDefines.TrtcAnswerType.values()[parseInt];
            }
            com.taobao.trtc.utils.h.a("TrtcEvent", "Answer rsp, id: " + cVar.f23035a + ", code: " + cVar.b + ", msg: " + cVar.c);
            if (trtcAnswerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE) {
                this.f23111a.b(cVar.f23035a, false);
                this.f23111a.b(true);
            } else {
                this.f23111a.j().a(cVar.f23035a);
            }
            this.b.a(cVar, trtcAnswerType, map.get(TrtcConstants.TRTC_PARAMS_EXTENSION));
        }
    }

    private void l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e364832", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("userId");
            String str2 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            boolean parseBoolean = Boolean.parseBoolean(map.get("isMultiChatMode"));
            this.f23111a.j().a(str);
            com.taobao.trtc.utils.h.a("TrtcEvent", "Remote cancel call, " + str);
            if (parseBoolean) {
                this.f23111a.f(true);
                this.b.d(str, str2);
                return;
            }
            this.b.c(str, str2);
        }
    }

    private void m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d81e91", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("userId");
            String str2 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            TrtcDefines.TrtcUserRole trtcUserRole = TrtcDefines.TrtcUserRole.E_ROLE_NONE;
            int parseInt = Integer.parseInt(map.get("role"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcUserRole.values().length) {
                trtcUserRole = TrtcDefines.TrtcUserRole.values()[parseInt];
            }
            Boolean.parseBoolean(map.get("isMultiChatMode"));
            com.taobao.trtc.utils.h.a("TrtcEvent", "Remote hangup call, " + str + ", role: " + trtcUserRole);
            this.b.d(str, str2);
            this.f23111a.j().a();
            this.f23111a.f().stopSubCapture();
        }
    }

    private void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d79f4f0", new Object[]{this, map});
        } else if (map == null) {
        } else {
            TrtcDefines.e eVar = new TrtcDefines.e();
            eVar.f23037a = map.get("channelId");
            eVar.b = Integer.parseInt((String) Objects.requireNonNull(map.get("code")));
            eVar.c = map.get("msg");
            eVar.d = map.get("localStreamId");
            eVar.e = Boolean.parseBoolean(map.get("isMultiChatMode"));
            com.taobao.trtc.utils.h.a("TrtcEvent", "join channel rsp, id: " + eVar.f23037a + ", code: " + eVar.b + ", msg: " + eVar.c);
            this.b.a(eVar);
            if (eVar.b != 0 && eVar.b != 200) {
                return;
            }
            this.f23111a.b(true);
        }
    }

    private void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bcb4f", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("channelId");
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.b.e(str);
        }
    }

    private void p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbda1ae", new Object[]{this, map});
        } else if (map != null) {
            ArrayList<TrtcDefines.m> arrayList = new ArrayList<>();
            if (((String) Objects.requireNonNull(map.get("callStatusList"))).length() > 0) {
                ArrayList arrayList2 = (ArrayList) JSON.parseObject(map.get("callStatusList"), new TypeReference<ArrayList<Map<String, String>>>() { // from class: com.taobao.trtc.impl.e.13
                }, new Feature[0]);
                for (int i = 0; i < arrayList2.size(); i++) {
                    TrtcDefines.m mVar = new TrtcDefines.m();
                    mVar.f23045a = (String) ((Map) arrayList2.get(i)).get("userId");
                    mVar.c = (String) ((Map) arrayList2.get(i)).get(TrtcConstants.TRTC_PARAMS_EXTENSION);
                    int parseInt = Integer.parseInt((String) ((Map) arrayList2.get(i)).get("role"));
                    mVar.b = TrtcDefines.TrtcUserRole.values()[parseInt];
                    TrtcEngineImpl trtcEngineImpl = this.f23111a;
                    if (trtcEngineImpl != null) {
                        trtcEngineImpl.j().a(mVar.f23045a, TrtcDefines.TrtcUserRole.values()[parseInt]);
                        this.f23111a.j().a(mVar.f23045a, TrtcInnerDefines.CallState.E_CALL_SETUP);
                    }
                    com.taobao.trtc.utils.h.a("TrtcEvent", "Remote joined channel| userId: " + mVar.f23045a);
                    TrtcLog.d("TrtcEvent", "processPeerJoinChannel userId: " + mVar.f23045a + " ,extension: " + mVar.c + " ,role: " + mVar.b);
                    arrayList.add(mVar);
                }
            }
            if (this.f23111a.x()) {
                this.b.a(arrayList);
            } else if (arrayList.size() > 0) {
                Iterator<TrtcDefines.m> it = arrayList.iterator();
                while (it.hasNext()) {
                    TrtcDefines.m next = it.next();
                    this.b.a(next.f23045a, next.c);
                }
            }
        }
    }

    private void q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d45f780d", new Object[]{this, map});
        } else if (map != null) {
            ArrayList<TrtcDefines.m> arrayList = new ArrayList<>();
            if (((String) Objects.requireNonNull(map.get("callStatusList"))).length() > 0) {
                ArrayList arrayList2 = (ArrayList) JSON.parseObject(map.get("callStatusList"), new TypeReference<ArrayList<Map<String, String>>>() { // from class: com.taobao.trtc.impl.e.2
                }, new Feature[0]);
                for (int i = 0; i < arrayList2.size(); i++) {
                    TrtcDefines.m mVar = new TrtcDefines.m();
                    mVar.f23045a = (String) ((Map) arrayList2.get(i)).get("userId");
                    mVar.c = (String) ((Map) arrayList2.get(i)).get(TrtcConstants.TRTC_PARAMS_EXTENSION);
                    TrtcDefines.TrtcUserRole trtcUserRole = TrtcDefines.TrtcUserRole.E_ROLE_NONE;
                    int parseInt = Integer.parseInt((String) ((Map) arrayList2.get(i)).get("role"));
                    if (parseInt >= 0 && parseInt < TrtcDefines.TrtcUserRole.values().length) {
                        trtcUserRole = TrtcDefines.TrtcUserRole.values()[parseInt];
                    }
                    mVar.b = trtcUserRole;
                    com.taobao.trtc.utils.h.a("TrtcEvent", "Remote left channel| userId: " + mVar.f23045a);
                    if (!this.f23111a.x()) {
                        if (this.f23111a != null && trtcUserRole == TrtcDefines.TrtcUserRole.E_ROLE_ANCHOR) {
                            this.f23111a.u().a(mVar.f23045a).a();
                        }
                    } else {
                        this.f23111a.j().a(mVar.f23045a);
                    }
                    TrtcLog.d("TrtcEvent", "processPeerLeftChannel userId: " + mVar.f23045a + " ,extension: " + mVar.c + " ,role: " + mVar.b);
                    arrayList.add(mVar);
                }
            }
            if (this.f23111a.x()) {
                this.b.b(arrayList);
            } else if (arrayList.size() > 0) {
                Iterator<TrtcDefines.m> it = arrayList.iterator();
                while (it.hasNext()) {
                    TrtcDefines.m next = it.next();
                    this.b.b(next.f23045a, next.c);
                }
            }
        }
    }

    private void r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc014e6c", new Object[]{this, map});
        } else if (map == null) {
        } else {
            Integer.parseInt((String) Objects.requireNonNull(map.get("code")));
            map.get("msg");
            TrtcDefines.TrtcChannelAction trtcChannelAction = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_UNKNOWN;
            int parseInt = Integer.parseInt(map.get("action"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcChannelAction.values().length) {
                trtcChannelAction = TrtcDefines.TrtcChannelAction.values()[parseInt];
            }
            TrtcLog.d("TrtcEvent", "notify channel rsp, action: " + trtcChannelAction + ", channelId:" + map.get("channelId"));
        }
    }

    private void s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a324cb", new Object[]{this, map});
        } else if (map == null) {
        } else {
            TrtcDefines.TrtcChannelAction trtcChannelAction = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_UNKNOWN;
            int parseInt = Integer.parseInt(map.get("action"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcChannelAction.values().length) {
                trtcChannelAction = TrtcDefines.TrtcChannelAction.values()[parseInt];
            }
            TrtcDefines.d dVar = new TrtcDefines.d();
            dVar.f23036a = trtcChannelAction;
            dVar.c = map.get("channelId");
            dVar.b = map.get("remoteUserId");
            dVar.f = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            dVar.d = "1".equals(map.get("audioEnable"));
            dVar.e = "1".equals(map.get(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE));
            TrtcLog.d("TrtcEvent", "notify channel, action: " + trtcChannelAction + ", a: " + dVar.d + ", v: " + dVar.e + ", channelId:" + dVar.c + ". ext:" + dVar.f);
            this.b.a(dVar);
        }
    }

    private void t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b44fb2a", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("remoteUserId");
            com.taobao.trtc.utils.h.a("TrtcEvent", "Call timeout| userId: " + str);
            TrtcEngineImpl trtcEngineImpl = this.f23111a;
            if (trtcEngineImpl != null) {
                trtcEngineImpl.j().a(str);
            }
            this.b.f(str);
        }
    }

    private void u(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e6d189", new Object[]{this, map});
        } else if (map == null) {
        } else {
            TrtcDefines.TrtcMixMode trtcMixMode = TrtcDefines.TrtcMixMode.MIX_LOCAL;
            int parseInt = Integer.parseInt((String) Objects.requireNonNull(map.get("mixType")));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcMixMode.values().length) {
                trtcMixMode = TrtcDefines.TrtcMixMode.values()[parseInt];
            }
            com.taobao.trtc.utils.h.a("TrtcEvent", "Link config update, mix mode: " + trtcMixMode);
            this.f23111a.a(trtcMixMode);
        }
    }

    private void v(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a88a7e8", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("userId");
            String str2 = map.get("type");
            boolean parseBoolean = Boolean.parseBoolean(map.get("timeout"));
            int parseInt = Integer.parseInt((String) Objects.requireNonNull(map.get("costTime")));
            if (!"video".equals(str2)) {
                if (parseBoolean) {
                    com.taobao.trtc.utils.h.b("TrtcEvent", "UserId: " + str + " " + str2 + " first frame timeout");
                    this.b.h(str);
                    return;
                }
                com.taobao.trtc.utils.h.a("TrtcEvent", "first remote audio frame, user id: " + str + ", elapsed: " + parseInt + "ms");
                this.b.a(str, parseInt);
            } else if (parseBoolean) {
                com.taobao.trtc.utils.h.b("TrtcEvent", "UserId: " + str + " " + str2 + " first frame timeout");
                this.b.g(str);
            } else {
                int parseInt2 = Integer.parseInt((String) Objects.requireNonNull(map.get("width")));
                int parseInt3 = Integer.parseInt((String) Objects.requireNonNull(map.get("height")));
                com.taobao.trtc.utils.h.a("TrtcEvent", "first remote video frame, user id: " + str + ", " + parseInt2 + "x" + parseInt3 + ", elapsed: " + parseInt + "ms");
                this.b.a(str, parseInt2, parseInt3, parseInt);
            }
        }
    }

    private void w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422a7e47", new Object[]{this, map});
        } else if (map == null) {
        } else {
            com.taobao.trtc.utils.d.a(map.get("host"), map.get(com.network.diagnosis.c.IP), Boolean.parseBoolean(map.get("status")));
        }
    }

    private void x(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cc54a6", new Object[]{this, map});
        } else if (map == null || !Boolean.parseBoolean(map.get("status"))) {
        } else {
            com.taobao.trtc.utils.d.a();
        }
    }

    private void y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116e2b05", new Object[]{this, map});
        } else if (map == null) {
        } else {
            boolean parseBoolean = map.containsKey("mute") ? Boolean.parseBoolean(map.get("mute")) : false;
            if (!map.containsKey("remoteStreamIds") || map.get("remoteStreamIds").length() <= 0) {
                return;
            }
            ArrayList<String> arrayList = (ArrayList) JSON.parseObject(map.get("remoteStreamIds"), new TypeReference<ArrayList<String>>() { // from class: com.taobao.trtc.impl.e.3
            }, new Feature[0]);
            if (arrayList.isEmpty()) {
                return;
            }
            this.b.a(parseBoolean, arrayList);
        }
    }

    private void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9100164", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.b.a(Boolean.parseBoolean(map.get("isAdd")), Integer.parseInt((String) Objects.requireNonNull(map.get("width"))), Integer.parseInt((String) Objects.requireNonNull(map.get("height"))), Integer.parseInt((String) Objects.requireNonNull(map.get(SPManager.FPS_KEY))));
        }
    }

    private void A(Map<String, String> map) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6607463d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            if (map.containsKey("localSpeakingStatus") && this.b != null) {
                boolean parseBoolean = Boolean.parseBoolean(map.get("localSpeakingStatus"));
                this.b.g(parseBoolean);
                if (parseBoolean) {
                    this.g = true;
                }
            }
            if (!map.containsKey("remoteSpeakingList") || map.get("remoteSpeakingList").length() <= 0) {
                return;
            }
            ArrayList<String> arrayList = (ArrayList) JSON.parseObject(map.get("remoteSpeakingList"), new TypeReference<ArrayList<String>>() { // from class: com.taobao.trtc.impl.e.4
            }, new Feature[0]);
            if (!arrayList.isEmpty() && (fVar = this.b) != null) {
                fVar.e(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (this.g) {
                arrayList2.add(this.f23111a.p());
            }
            this.g = false;
        }
    }

    private void B(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da91c9c", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("channelId");
            int parseInt = Integer.parseInt((String) Objects.requireNonNull(map.get("resultCode")));
            String str2 = map.get("resultMessage");
            String str3 = map.get("message");
            String str4 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            TrtcLog.d("TrtcEvent", "processChannelMsgBroadcastRsp, channelId: " + str + " ,resultCode: " + parseInt + " ,resultMessage: " + str2 + " ,message: " + str3 + " ,extension: " + str4);
            f fVar = this.b;
            if (fVar == null) {
                return;
            }
            fVar.a(str, parseInt, str2, str3, str4);
        }
    }

    private void C(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("354af2fb", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("channelId");
            String str2 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            String str3 = map.get("message");
            String str4 = map.get("promoterUserId");
            TrtcLog.d("TrtcEvent", "processChannelMsgBroadcastNotify, channelId: " + str + " ,extension: " + str2 + " ,message: " + str3 + " ,promoterUserId: " + str4);
            f fVar = this.b;
            if (fVar == null) {
                return;
            }
            fVar.a(str, str2, str3, str4);
        }
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (i < 0 || i > TrtcInnerDefines.EventType.values().length - 1) {
            TrtcLog.a("TrtcEvent", "invalid event type: " + i);
        } else {
            TrtcInnerDefines.EventType eventType = TrtcInnerDefines.EventType.values()[i];
            if (eventType != TrtcInnerDefines.EventType.ON_TRTC_STATISTICS_UT && eventType != TrtcInnerDefines.EventType.ON_TRTC_STATS) {
                com.taobao.trtc.utils.h.a("TrtcEvent", "native event: " + eventType + ", msg: " + str);
            }
            Map<String, String> map = null;
            if (str.length() > 0) {
                try {
                    map = (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.e.5
                    }, new Feature[0]);
                } catch (Exception e) {
                    TrtcLog.a("TrtcEvent", "event parse error: " + e.getMessage());
                    return;
                }
            }
            try {
                switch (eventType) {
                    case ON_TRTC_LIVE_SUCCESS:
                        b();
                        return;
                    case ON_TRTC_MEDIA_CONNECTION_STATE:
                        a(map);
                        return;
                    case ON_TRTC_CALL_NOTIFY:
                        h(map);
                        return;
                    case ON_TRTC_CALL_RSP:
                        i(map);
                        return;
                    case ON_TRTC_ANSWER_NOTIFY:
                        j(map);
                        return;
                    case ON_TRTC_ANSWER_RSP:
                        k(map);
                        return;
                    case ON_TRTC_CANCEL_CALL_NOTIFY:
                        l(map);
                        return;
                    case ON_TRTC_HANGUP_NOTIFY:
                        m(map);
                        return;
                    case ON_TRTC_JOIN_CHANNEL_RSP:
                        n(map);
                        return;
                    case ON_TRTC_PEER_JOINED_CHANNEL:
                        p(map);
                        return;
                    case ON_TRTC_PEER_LEFT_CHANNEL:
                        q(map);
                        return;
                    case ON_TRTC_NOTIFY_CHANNEL_RSP:
                        r(map);
                        return;
                    case ON_TRTC_CHANNEL_MSG_BROADCAST_RSP:
                        B(map);
                        return;
                    case ON_TRTC_CHANNEL_MSG_BROADCAST_NOTIFY:
                        C(map);
                        return;
                    case ON_TRTC_NOTIFY_CHANNEL:
                        s(map);
                        return;
                    case ON_TRTC_CALL_TIMEOUT:
                        t(map);
                        return;
                    case ON_TRTC_LINK_CONFIG_UPDATE:
                        u(map);
                        return;
                    case ON_TRTC_FIRST_MEDIA_FRAME:
                        v(map);
                        return;
                    case ON_TRTC_STATISTICS_UT:
                        b(map);
                        return;
                    case ON_TRTC_STATS:
                        c(map);
                        return;
                    case ON_TRTC_ERROR:
                        d(map);
                        return;
                    case ON_TRTC_STREAM_PROCESS_RESULT:
                        e(map);
                        return;
                    case ON_TRTC_CUSTOM_MESSAGE:
                        f(map);
                        return;
                    case ON_TRTC_STREAM_UPDATED:
                        g(map);
                        return;
                    case ON_TRTC_UPDATE_HTTPDNS_AMDC:
                        w(map);
                        return;
                    case ON_TRTC_CANCEL_GET_HTTPDNS:
                        x(map);
                        return;
                    case ON_TRTC_MUTE_REMOTE_AUDIO_STREAMS:
                        y(map);
                        return;
                    case ON_TRTC_LOCAL_STREAM_STATUS_UPDATE:
                        z(map);
                        return;
                    case ON_TRTC_DEGRADE_TO_TCP:
                        a();
                        return;
                    case ON_TRTC_LIVE_CHANNEL_ID_SUCCESS:
                        o(map);
                        return;
                    case ON_TRTC_SPEECH_DETECT:
                        A(map);
                        return;
                    default:
                        TrtcLog.d("TrtcEvent", "unknown event type: " + eventType);
                        return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                TrtcLog.a("TrtcEvent", str);
                com.taobao.trtc.utils.h.b("TrtcEvent", "exception on native event process:" + eventType + ", msg: " + e2.getMessage());
            }
        }
    }
}

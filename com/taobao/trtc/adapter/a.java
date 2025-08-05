package com.taobao.trtc.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.artc.api.ArtcVideoLayout;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcOutputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SurfaceViewRenderer;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ITrtcInputStream B;
    public ITrtcOutputStream D;
    private TrtcAdapter I;
    public TrtcInnerDefines.TrtcLocalVideoFreezeInfo L;
    public AConstants.ArtcVideoProfile b;
    public String h;
    public String i;
    public AConstants.ArtcMediaType k;
    public AConstants.ArtcTransportProfile l;
    public AConstants.ArtcChannelProfile m;
    public ArtcVideoLayout q;
    public String t;
    public String u;
    public boolean v;
    public boolean w;
    public TrtcEngineImpl x;
    private final ArrayList<String> J = new ArrayList<>();
    private final AtomicBoolean K = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public ArtcEngineEventHandler f23027a = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public SurfaceViewRenderer f = null;
    public SurfaceViewRenderer g = null;
    public String j = "";
    public boolean n = true;
    public boolean o = true;
    public String p = "";
    public boolean r = false;
    public String s = "";
    public int y = 720;
    public int z = 1280;
    public int A = 20;
    public ITrtcInputStream C = null;
    public int E = 1;
    public String F = "";
    public String G = "";
    public String H = "";

    static {
        kge.a(-3216853);
    }

    public a(TrtcAdapter trtcAdapter) {
        this.I = trtcAdapter;
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.J.add(str);
        TrtcLog.d("CachedInfoHandler", "add api: " + str);
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.J.clear();
        this.K.set(false);
        TrtcLog.d("CachedInfoHandler", "Clear");
    }

    public synchronized String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (this.F.isEmpty()) {
            this.F = this.x.d(this.t == null ? "123456" : this.t);
        }
        return this.F;
    }

    public synchronized void a(final TrtcEngineImpl trtcEngineImpl) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("699c7b2a", new Object[]{this, trtcEngineImpl});
            return;
        }
        this.x = trtcEngineImpl;
        Iterator<String> it = this.J.iterator();
        while (it.hasNext()) {
            String next = it.next();
            TrtcLog.d("CachedInfoHandler", "process cached api: " + next);
            switch (next.hashCode()) {
                case -2064288062:
                    if (next.equals("setTransportProfile")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1939772245:
                    if (next.equals("createChannel2")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1870406559:
                    if (next.equals("registUser")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1586811453:
                    if (next.equals("setVideoLayout")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1550999976:
                    if (next.equals("setVideoMirror")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146668052:
                    if (next.equals("startPreview2")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -79488385:
                    if (next.equals("setBroadcast")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 334238318:
                    if (next.equals("setLocalView")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 542896873:
                    if (next.equals("setlocalVideoFreeze")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 546804519:
                    if (next.equals("registerHandler")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1517754893:
                    if (next.equals("setRemoteView")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1728001524:
                    if (next.equals("setEnableSpeakerphone")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1937162280:
                    if (next.equals("setChannelProfile")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2080680496:
                    if (next.equals("setVideoProfile")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2106766303:
                    if (next.equals("enableBeauty")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.f23027a.onSignalChannelAvailable();
                    break;
                case 1:
                    trtcEngineImpl.a(a(this.m));
                    break;
                case 6:
                    trtcEngineImpl.f().setVideoMirror(this.d, this.e);
                    break;
                case 7:
                    trtcEngineImpl.f().setLocalView(this.f);
                    break;
                case '\t':
                    com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.adapter.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            a.this.B = trtcEngineImpl.f().startCapture(new TrtcStreamConfig.a().a(a.this.z, a.this.y, a.this.A).c(true).a());
                        }
                    }, 0L);
                    break;
                case '\n':
                    if (this.f23027a == null) {
                        break;
                    } else {
                        this.f23027a.onCreateChannelSuccess(b());
                        break;
                    }
                case '\f':
                    trtcEngineImpl.e(this.v);
                    break;
                case '\r':
                    trtcEngineImpl.g(this.w);
                    break;
                case 14:
                    trtcEngineImpl.a(this.L);
                    break;
            }
        }
        TrtcLog.d("CachedInfoHandler", "all cached grtn api process done!");
        this.K.set(true);
    }

    private TrtcDefines.TrtcWorkMode a(AConstants.ArtcChannelProfile artcChannelProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcWorkMode) ipChange.ipc$dispatch("edcd9e19", new Object[]{this, artcChannelProfile});
        }
        TrtcDefines.TrtcWorkMode trtcWorkMode = TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_UNKOWN;
        if (artcChannelProfile == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
            return TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_LIVE;
        }
        if (artcChannelProfile == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_COMMUNICATION) {
            return TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_CHAT;
        }
        return artcChannelProfile == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_CONFERENCE ? TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_MEETING : trtcWorkMode;
    }

    public synchronized boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return this.K.get();
    }
}

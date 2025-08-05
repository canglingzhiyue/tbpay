package com.taobao.avplayer;

import android.app.Activity;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.u;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.dde;
import tb.ddg;
import tb.kcl;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes6.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f16613a;
    private u b;
    private bl c;
    private int d;

    /* loaded from: classes6.dex */
    public static class b {
        public int E;
        public int F;
        public com.taobao.avplayer.common.p J;
        public com.taobao.avplayer.common.v K;
        public as L;
        public ap M;
        public com.taobao.avplayer.common.d N;
        public com.taobao.avplayer.common.ad O;
        public com.taobao.avplayer.common.af P;
        public ar Q;
        public ddg S;
        public JSONObject U;
        public String W;
        public String X;
        public String Y;
        public HashMap<String, String> ag;
        public boolean ah;
        public boolean ai;
        public HashMap<String, String> aj;
        public Activity b;
        public long c;
        public String e;
        public String f;
        public HashMap<String, String> g;
        public String h;
        public DWAspectRatio i;
        public Surface j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public HashMap<String, String> r;
        public boolean s;
        public boolean w;
        public boolean x;
        public boolean y;
        public boolean z;

        /* renamed from: a  reason: collision with root package name */
        public int f16615a = 2;
        public boolean d = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        public boolean T = false;
        public boolean ak = true;
        public boolean t = true;
        public boolean u = true;
        public boolean v = false;
        public boolean A = false;
        public boolean B = true;
        public boolean C = false;
        public boolean D = false;
        public DWVideoScreenType G = DWVideoScreenType.NORMAL;
        public DWInstanceType H = DWInstanceType.VIDEO;
        public int V = 0;
        public int Z = 3;
        public int aa = 0;
        public int ab = 0;
        public boolean ac = true;
        public boolean ad = true;
        public boolean ae = true;
        public boolean af = false;

        static {
            kge.a(1589247887);
        }
    }

    static {
        kge.a(-2122022840);
        f16613a = "DWInstancePlus";
    }

    public s(b bVar) {
        this.d = 2;
        if (bVar.f16615a == 0 || bVar.f16615a == 1) {
            u.a aVar = new u.a(bVar.b);
            aVar.i("dwplus");
            aVar.d(bVar.f16615a);
            aVar.a(bVar.W);
            aVar.b(bVar.h);
            aVar.c(bVar.X);
            aVar.d(String.valueOf(bVar.c));
            aVar.e(bVar.Y);
            aVar.f(bVar.f);
            aVar.a(bVar.af);
            aVar.a(bVar.Z);
            aVar.b(bVar.aa);
            aVar.c(bVar.ab);
            aVar.b(bVar.ac);
            aVar.c(bVar.ad);
            aVar.d(bVar.ae);
            aVar.h(bVar.e);
            aVar.e(bVar.d);
            aVar.a(bVar.i);
            aVar.c(bVar.r);
            aVar.a(bVar.g);
            aVar.d(bVar.aj);
            aVar.b(bVar.ag);
            aVar.g(bVar.k);
            aVar.f(bVar.ah);
            aVar.g(bVar.u);
            aVar.h(bVar.t);
            aVar.e(String.valueOf(bVar.c));
            aVar.a(new ak());
            aVar.a(new ai());
            aVar.a(new c());
            aVar.i(bVar.T);
            aVar.j(bVar.ak);
            aVar.a(bVar.j);
            this.b = aVar.b();
            if (bVar.ai) {
                HashMap hashMap = new HashMap();
                hashMap.put(MediaConstant.CMD_DISABLE_SURFACE_VIEW, "1");
                this.b.a((Map<String, String>) hashMap);
            }
        } else if (bVar.f16615a == 2) {
            bl.a aVar2 = new bl.a(bVar.b);
            aVar2.l("dwplus");
            aVar2.a(bVar.e);
            aVar2.a(bVar.s);
            aVar2.a(bVar.H);
            aVar2.b(bVar.h);
            aVar2.c(bVar.y);
            aVar2.d(bVar.l);
            aVar2.a(bVar.c);
            aVar2.c(bVar.E);
            aVar2.d(bVar.F);
            aVar2.e(bVar.n);
            aVar2.a(bVar.J);
            aVar2.a(bVar.K);
            aVar2.a(bVar.Q);
            aVar2.a(bVar.L);
            aVar2.f(bVar.f);
            aVar2.g(bVar.m);
            aVar2.a(bVar.r);
            aVar2.b(bVar.g);
            aVar2.d(bVar.aj);
            aVar2.a(bVar.M);
            aVar2.a(bVar.N);
            aVar2.a(bVar.O);
            aVar2.d(bVar.d);
            aVar2.e(bVar.t);
            aVar2.f(bVar.u);
            aVar2.g(bVar.v);
            aVar2.a(bVar.G);
            aVar2.h(bVar.A);
            aVar2.h(bVar.o);
            aVar2.i(bVar.p);
            aVar2.j(bVar.q);
            aVar2.a(bVar.P);
            aVar2.i(bVar.w);
            aVar2.j(bVar.x);
            aVar2.a(bVar.S);
            aVar2.k(bVar.k);
            aVar2.l(bVar.z);
            aVar2.a(bVar.i);
            aVar2.m(bVar.B);
            aVar2.n(bVar.C);
            aVar2.k(bVar.D);
            aVar2.a(bVar.U);
            aVar2.b(bVar.V);
            aVar2.a((Map<String, String>) bVar.ag);
            aVar2.o(bVar.ah);
            aVar2.a(bVar.j);
            aVar2.r(bVar.ai);
            aVar2.s(bVar.T);
            aVar2.t(bVar.ak);
            this.c = aVar2.c();
        }
        this.d = bVar.f16615a;
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWInstancePlus);
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.c(hashMap);
        } else if (i != 0 && i != 1) {
        } else {
            this.b.a(hashMap);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.b(str);
        } else if (i != 0 && i != 1) {
        } else {
            this.b.a(str);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.c();
        } else if (i != 0 && i != 1) {
        } else {
            this.b.f();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.f();
        } else if (i != 0 && i != 1) {
        } else {
            this.b.h();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.g();
        } else if (i != 0 && i != 1) {
        } else {
            this.b.j();
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (this.d != 2) {
        } else {
            this.c.f(z);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.e(z);
        } else if (i != 0 && i != 1) {
        } else {
            this.b.c(z);
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.d != 2) {
        } else {
            this.c.a(f);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d != 2) {
        } else {
            this.c.a();
        }
    }

    public void a(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        u uVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d69515", new Object[]{this, mediaLiveWarmupConfig});
        } else if (this.d != 0 || (uVar = this.b) == null) {
        } else {
            uVar.a(new MediaLiveWarmupConfig());
        }
    }

    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this});
        }
        int i = this.d;
        if (i == 2) {
            return this.c.l();
        }
        if (i != 0 && i != 1) {
            return null;
        }
        return (ViewGroup) this.b.e();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.m();
        } else if (i != 0 && i != 1) {
        } else {
            this.b.k();
        }
    }

    public void a(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086ecaf", new Object[]{this, dWInstanceType});
        } else if (this.d != 2) {
        } else {
            this.c.a(dWInstanceType);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.d != 2) {
        } else {
            this.c.a(j);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.b(z);
        } else if (i != 0 && i != 1) {
        } else {
            this.b.b(z);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.d != 2) {
        } else {
            this.c.a(i, i2);
        }
    }

    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.a(hashMap);
        } else if (i != 0 && i != 1) {
        } else {
            this.b.b(hashMap);
        }
    }

    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
        } else if (this.d != 2) {
        } else {
            this.c.b(hashMap);
        }
    }

    public void a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{this, imageView});
        } else if (this.d != 2) {
        } else {
            this.c.a(imageView);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (this.d != 2) {
        } else {
            this.c.e(i);
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.d != 2) {
        } else {
            this.c.a(i, z);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.d != 2) {
        } else {
            this.c.e();
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (this.d != 2) {
            return false;
        }
        return this.c.h();
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        int i = this.d;
        if (i == 2) {
            return this.c.i();
        }
        if (i != 0 && i != 1) {
            return 0;
        }
        return this.b.d();
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        if (this.d != 2) {
            return 0;
        }
        return this.c.j();
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue();
        }
        if (this.d != 2) {
            return 0L;
        }
        return this.c.q();
    }

    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
        } else if (this.d != 2) {
        } else {
            this.c.a(axVar);
        }
    }

    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
        } else if (this.d != 2) {
        } else {
            this.c.a(baVar);
        }
    }

    public void a(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dwplus_setPicViewClickListener);
        if (this.d != 2) {
            return;
        }
        this.c.a(zVar);
    }

    public void b(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e6a6fc", new Object[]{this, zVar});
        } else if (this.d != 2) {
        } else {
            this.c.b(zVar);
        }
    }

    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dwplus_setVideoLifecycleListener);
        if (this.d != 2) {
            return;
        }
        this.c.a(avVar);
    }

    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
            return;
        }
        int i = this.d;
        if (i == 2) {
            this.c.a(awVar);
        } else if (i != 0 && i != 1) {
        } else {
            this.b.a(awVar);
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.d != 2) {
        } else {
            this.c.a(z);
        }
    }

    public Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this});
        }
        int i = this.d;
        if (i == 2) {
            return this.c.n();
        }
        if (i != 0 && i != 1) {
            return null;
        }
        return this.b.g();
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(z);
    }

    public void a(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1a14b3", new Object[]{this, mediaLiveInfo, str});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(mediaLiveInfo, str);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        int i = this.d;
        if (i == 0 || i == 1) {
            return this.b.a();
        }
        if (i != 2) {
            return false;
        }
        return this.c.k();
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        int i = this.d;
        if (i == 0 || i == 1) {
            return this.b.b();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.r();
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        int i = this.d;
        if (i == 0 || i == 1) {
            return this.b.c();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.s();
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.i();
    }

    public void a(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec6e9f3", new Object[]{this, onCompletionListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(onCompletionListener);
    }

    public void b(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34e652", new Object[]{this, onCompletionListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.b(onCompletionListener);
    }

    public void a(TaoLiveVideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31fd35c", new Object[]{this, bVar});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(bVar);
    }

    public void b(TaoLiveVideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9573dd", new Object[]{this, bVar});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.b(bVar);
    }

    public void a(TaoLiveVideoView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31f5efd", new Object[]{this, aVar});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(aVar);
    }

    public void b(TaoLiveVideoView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d94ff7e", new Object[]{this, aVar});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.b(aVar);
    }

    public void a(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb49db2", new Object[]{this, onPreparedListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(onPreparedListener);
    }

    public void b(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e425d1", new Object[]{this, onPreparedListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.b(onPreparedListener);
    }

    public void a(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c355221", new Object[]{this, onInfoListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(onInfoListener);
    }

    public void b(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1073c1c0", new Object[]{this, onInfoListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.b(onInfoListener);
    }

    public void a(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22b3fb1", new Object[]{this, onErrorListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.a(onErrorListener);
    }

    public void b(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bac3f2", new Object[]{this, onErrorListener});
            return;
        }
        int i = this.d;
        if (i != 0 && i != 1) {
            return;
        }
        this.b.b(onErrorListener);
    }

    public void d(HashMap<String, String> hashMap) {
        u uVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597068e8", new Object[]{this, hashMap});
            return;
        }
        int i = this.d;
        if (i == 2) {
            bl blVar = this.c;
            if (blVar == null) {
                return;
            }
            blVar.e(hashMap);
        } else if ((i != 0 && i != 1) || (uVar = this.b) == null) {
        } else {
            uVar.c(hashMap);
        }
    }

    public void a(dde ddeVar) {
        bl blVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        int i = this.d;
        if (i == 0 || i == 1) {
            u uVar = this.b;
            if (uVar == null) {
                return;
            }
            uVar.a(ddeVar);
        } else if (i != 2 || (blVar = this.c) == null) {
        } else {
            blVar.a(ddeVar);
        }
    }

    public void a(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a46591", new Object[]{this, str, new Boolean(z), hashMap});
            return;
        }
        bl blVar = this.c;
        if (blVar == null) {
            return;
        }
        blVar.a(str, z, hashMap);
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        bl blVar = this.c;
        if (blVar != null && blVar.f16536a != null) {
            return this.c.f16536a.getPlayToken();
        }
        return null;
    }

    public void a(az azVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17384838", new Object[]{this, azVar});
            return;
        }
        bl blVar = this.c;
        if (blVar == null) {
            return;
        }
        blVar.a(azVar);
    }

    public void a(bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b76d1", new Object[]{this, bbVar});
            return;
        }
        bl blVar = this.c;
        if (blVar == null) {
            return;
        }
        blVar.a(bbVar);
    }

    public void a(Map<String, String> map) {
        bl blVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        int i = this.d;
        if (i == 0 || i == 1) {
            u uVar = this.b;
            if (uVar == null) {
                return;
            }
            uVar.a(map);
        } else if (i != 2 || (blVar = this.c) == null) {
        } else {
            blVar.a(map);
        }
    }

    public void s() {
        bl blVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.d != 2 || (blVar = this.c) == null) {
        } else {
            blVar.u();
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        bl blVar = this.c;
        if (blVar != null) {
            blVar.b(f);
            return;
        }
        u uVar = this.b;
        if (uVar == null) {
            return;
        }
        uVar.a(f);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        bl blVar = this.c;
        if (blVar == null) {
            return;
        }
        blVar.c(z);
    }

    public void a(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cd50c8", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        bl blVar = this.c;
        if (blVar == null) {
            return;
        }
        blVar.a(f, f2, i, i2);
    }

    public com.taobao.mediaplay.k h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mediaplay.k) ipChange.ipc$dispatch("967f78b5", new Object[]{this});
        }
        u uVar = this.b;
        if (uVar == null) {
            return null;
        }
        return uVar.m();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        u uVar = this.b;
        if (uVar == null) {
            return false;
        }
        return uVar.n();
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f16614a = new b();

        static {
            kge.a(-1259696353);
        }

        public a(Activity activity) {
            this.f16614a.b = activity;
            if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H26X_DEFAULT_HARDWARE, "true"))) {
                b bVar = this.f16614a;
                bVar.ab = 1;
                bVar.aa = 1;
            }
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5738ae22", new Object[]{this, new Integer(i)});
            }
            this.f16614a.f16615a = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("692d1b9", new Object[]{this, str});
            }
            this.f16614a.e = str;
            return this;
        }

        public a a(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c3bfc6d2", new Object[]{this, hashMap});
            }
            this.f16614a.g = hashMap;
            return this;
        }

        public a c(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("37550a90", new Object[]{this, hashMap});
            }
            this.f16614a.aj = hashMap;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("259acaf3", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.d = z;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWInstancePlus Builder, sbt=" + this.f16614a.f + ", setMute=" + this.f16614a.d);
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7c0cf7fa", new Object[]{this, str});
            }
            this.f16614a.f = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f1871e3b", new Object[]{this, str});
            }
            this.f16614a.h = str;
            return this;
        }

        public a a(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d802b966", new Object[]{this, dWAspectRatio});
            }
            this.f16614a.i = dWAspectRatio;
            return this;
        }

        public a a(Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9083f3bb", new Object[]{this, surface});
            }
            this.f16614a.j = surface;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26477692", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.s = z;
            return this;
        }

        public a a(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f290b36", new Object[]{this, dWInstanceType});
            }
            this.f16614a.H = dWInstanceType;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6701447c", new Object[]{this, str});
            }
            this.f16614a.l = str;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26f42231", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.y = z;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57e559c1", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a();
            }
            this.f16614a.E = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("58920560", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a(600.0f);
            }
            this.f16614a.F = i;
            return this;
        }

        public a b(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd8a68b1", new Object[]{this, hashMap});
            }
            this.f16614a.r = hashMap;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("27a0cdd0", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.u = z;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc7b6abd", new Object[]{this, str});
            }
            this.f16614a.o = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("51f590fe", new Object[]{this, str});
            }
            this.f16614a.k = str;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("284d796f", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.D = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("28fa250e", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.C = z;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bff6fdd", new Object[]{this, jSONObject});
            }
            this.f16614a.U = jSONObject;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("593eb0ff", new Object[]{this, new Integer(i)});
            }
            this.f16614a.V = i;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c76fb73f", new Object[]{this, str});
            }
            this.f16614a.W = str;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29a6d0ad", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.ac = z;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a537c4c", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.ah = z;
            return this;
        }

        public a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b0027eb", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.ai = z;
            return this;
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2bacd38a", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.T = z;
            return this;
        }

        public a k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2c597f29", new Object[]{this, new Boolean(z)});
            }
            this.f16614a.ak = z;
            return this;
        }

        public s a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("ca9b9d4c", new Object[]{this}) : new s(this.f16614a);
        }
    }
}

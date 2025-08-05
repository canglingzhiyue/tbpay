package com.taobao.avplayer;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.HashMap;
import java.util.Map;
import tb.dde;
import tb.kcf;
import tb.kcj;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes6.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String b;

    /* renamed from: a  reason: collision with root package name */
    public DWContext f16617a;
    private com.taobao.mediaplay.k c;
    private com.taobao.mediaplay.player.e d;
    private String e;
    private String f;
    private long g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;

    /* loaded from: classes6.dex */
    public static class b {
        public com.taobao.avplayer.common.af A;
        public ap B;
        public HashMap<String, String> C;
        public HashMap<String, String> D;

        /* renamed from: a  reason: collision with root package name */
        public Activity f16619a;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String q;
        public DWAspectRatio s;
        public HashMap<String, String> t;
        public HashMap<String, String> u;
        public String v;
        public boolean w;
        public boolean x;
        public boolean y;
        public as z;
        public int b = 0;
        public boolean j = false;
        public int k = 3;
        public int l = 0;
        public int m = 0;
        public boolean n = true;
        public boolean o = true;
        public boolean p = true;
        public boolean r = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        public boolean E = false;
        public boolean F = true;
        public Surface G = null;

        static {
            kge.a(-1794037553);
        }
    }

    public static /* synthetic */ long a(u uVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1835b32e", new Object[]{uVar, new Long(j)})).longValue();
        }
        uVar.h = j;
        return j;
    }

    public static /* synthetic */ void a(u uVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d251d0b9", new Object[]{uVar, map, new Boolean(z)});
        } else {
            uVar.a(map, z);
        }
    }

    static {
        kge.a(1007172122);
        b = "DWLiveInstance";
    }

    public u(b bVar) {
        this.c = new com.taobao.mediaplay.k(bVar.f16619a, false, bVar.c);
        this.c.l(bVar.v);
        this.c.a(bVar.b);
        this.c.c(bVar.h);
        this.c.m(bVar.i);
        this.c.e(bVar.d);
        this.c.f(bVar.e);
        this.c.a(bVar.j);
        this.c.b(bVar.k);
        this.c.c(bVar.l);
        this.c.d(bVar.m);
        this.c.d(bVar.n);
        this.c.e(bVar.r);
        this.c.i(bVar.q);
        this.c.j(bVar.f);
        this.c.k(bVar.g);
        this.c.f(bVar.o);
        this.c.g(bVar.p);
        this.c.a(bVar.t);
        if (bVar.s != null) {
            this.c.a(MediaAspectRatio.values()[bVar.s.ordinal()]);
        }
        this.c.a((Map<String, String>) bVar.u);
        this.c.l(bVar.w);
        if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "useRtcliveByDefault", "true"))) {
            this.c.b(true);
            this.c.c(true);
            this.c.m(true);
        }
        this.c.p(bVar.E);
        this.c.a(bVar.G);
        this.f16617a = new DWContext(bVar.f16619a, true);
        this.f16617a.setNeedFirstPlayUT(bVar.x);
        this.f16617a.mute(bVar.r);
        this.f16617a.mUTAdapter = bVar.z;
        this.f16617a.addUtParams(bVar.C);
        this.f16617a.addPlayExpUtParams(bVar.t);
        this.f16617a.addControlParams(bVar.D);
        this.f16617a.setUserInfoAdapter(bVar.A);
        this.f16617a.mConfigAdapter = bVar.B;
        this.e = kcj.b(bVar.g, this.f16617a.getUserInfoAdapter().b());
        this.f = kcj.b(bVar.g, this.f16617a.getUserInfoAdapter().b());
        this.f16617a.mVideoId = bVar.d;
        this.f16617a.setNeedFirstPlayUT(bVar.x);
        this.f16617a.setPlayScenes(bVar.i);
        this.f16617a.mUseShortAudioFocus = bVar.E;
        this.f16617a.mReleaseShortFocusWhenPause = bVar.F;
        this.d = new c(null);
        this.c.a(this.d);
        this.j = com.taobao.taobaoavsdk.util.b.a(this.f16617a.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_ENABLE_DWLIVE_COMMIT_UT, "false"));
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.c(str);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.d(z);
    }

    public void a(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1a14b3", new Object[]{this, mediaLiveInfo, str});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(mediaLiveInfo, str);
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(hashMap);
        DWContext dWContext = this.f16617a;
        if (dWContext == null) {
            return;
        }
        dWContext.addPlayExpUtParams(hashMap);
    }

    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        DWContext dWContext = this.f16617a;
        if (dWContext == null) {
            return;
        }
        dWContext.addUtParams(hashMap);
    }

    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
            return;
        }
        DWContext dWContext = this.f16617a;
        if (dWContext == null || hashMap == null) {
            return;
        }
        dWContext.addUtParams(hashMap);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        DWContext dWContext = this.f16617a;
        if (dWContext == null) {
            return;
        }
        dWContext.setNeedCloseUT(z);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (f < 0.0f || f > 1.0f) {
        } else {
            com.taobao.mediaplay.k kVar = this.c;
            if (kVar != null) {
                kVar.b(f);
            }
            DWContext dWContext = this.f16617a;
            if (dWContext == null) {
                return;
            }
            dWContext.setVolume(f);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return false;
        }
        return kVar.d();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return 0;
        }
        return kVar.m();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return 0;
        }
        return kVar.o();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return 0;
        }
        return kVar.n();
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42261fae", new Object[]{this});
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return null;
        }
        return kVar.q();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.f();
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return null;
        }
        return kVar.r();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.g();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.e(z);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.p();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.l();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.c == null) {
        } else {
            l();
            this.c.s();
        }
    }

    public void a(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec6e9f3", new Object[]{this, onCompletionListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(onCompletionListener);
    }

    public void b(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34e652", new Object[]{this, onCompletionListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.b(onCompletionListener);
    }

    public void a(TaoLiveVideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31fd35c", new Object[]{this, bVar});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(bVar);
    }

    public void b(TaoLiveVideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9573dd", new Object[]{this, bVar});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.b(bVar);
    }

    public void a(TaoLiveVideoView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31f5efd", new Object[]{this, aVar});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(aVar);
    }

    public void b(TaoLiveVideoView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d94ff7e", new Object[]{this, aVar});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.b(aVar);
    }

    public void a(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb49db2", new Object[]{this, onPreparedListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(onPreparedListener);
    }

    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
            return;
        }
        com.taobao.mediaplay.player.e eVar = this.d;
        if (eVar != null) {
            ((c) eVar).a(awVar);
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(this.d);
    }

    public void b(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e425d1", new Object[]{this, onPreparedListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.b(onPreparedListener);
    }

    public void a(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c355221", new Object[]{this, onInfoListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(onInfoListener);
    }

    public void b(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1073c1c0", new Object[]{this, onInfoListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.b(onInfoListener);
    }

    public void a(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22b3fb1", new Object[]{this, onErrorListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(onErrorListener);
    }

    public void b(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bac3f2", new Object[]{this, onErrorListener});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.b(onErrorListener);
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.a(ddeVar);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.mediaplay.k kVar = this.c;
        if (kVar == null) {
            return;
        }
        kVar.b(map);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f16618a = new b();
        public String b;

        static {
            kge.a(1355306737);
        }

        public a(Activity activity) {
            b bVar = this.f16618a;
            bVar.f16619a = activity;
            bVar.v = "dwlive";
            if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H26X_DEFAULT_HARDWARE, "true"))) {
                b bVar2 = this.f16618a;
                bVar2.m = 1;
                bVar2.l = 1;
            }
        }

        public a a(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d803a224", new Object[]{this, dWAspectRatio});
            }
            this.f16618a.s = dWAspectRatio;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("693ba77", new Object[]{this, str});
            }
            this.f16618a.c = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7c0de0b8", new Object[]{this, str});
            }
            this.f16618a.d = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f18806f9", new Object[]{this, str});
            }
            this.f16618a.e = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("67022d3a", new Object[]{this, str});
            }
            this.f16618a.f = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc7c537b", new Object[]{this, str});
            }
            this.f16618a.g = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("51f679bc", new Object[]{this, str});
            }
            this.f16618a.h = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c7709ffd", new Object[]{this, str});
            }
            this.f16618a.i = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("259bb3b1", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.j = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("573996e0", new Object[]{this, new Integer(i)});
            }
            this.f16618a.k = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57e6427f", new Object[]{this, new Integer(i)});
            }
            this.f16618a.l = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5892ee1e", new Object[]{this, new Integer(i)});
            }
            this.f16618a.m = i;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26485f50", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.n = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26f50aef", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.o = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("27a1b68e", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.p = z;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3ceac63e", new Object[]{this, str});
            }
            this.f16618a.q = str;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("284e622d", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.r = z;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("593f99bd", new Object[]{this, new Integer(i)});
            }
            this.f16618a.b = i;
            return this;
        }

        public a a(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c3c0af90", new Object[]{this, hashMap});
            }
            this.f16618a.t = hashMap;
            return this;
        }

        public a d(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7120952d", new Object[]{this, hashMap});
            }
            this.f16618a.D = hashMap;
            return this;
        }

        public a b(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd8b516f", new Object[]{this, hashMap});
            }
            this.f16618a.u = hashMap;
            return this;
        }

        public void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (TextUtils.isEmpty(this.b)) {
            } else {
                b bVar = this.f16618a;
                bVar.v = this.b + "." + this.f16618a.v;
                this.b = "";
            }
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("28fb0dcc", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.w = z;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29a7b96b", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.x = z;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a54650a", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.y = z;
            return this;
        }

        public a a(as asVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d65c50e4", new Object[]{this, asVar});
            }
            this.f16618a.z = asVar;
            return this;
        }

        public a c(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3755f34e", new Object[]{this, hashMap});
            }
            this.f16618a.C = hashMap;
            return this;
        }

        public a a(com.taobao.avplayer.common.af afVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2254e13b", new Object[]{this, afVar});
            }
            this.f16618a.A = afVar;
            return this;
        }

        public a a(ap apVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3e93ac7", new Object[]{this, apVar});
            }
            this.f16618a.B = apVar;
            return this;
        }

        public a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b0110a9", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.E = z;
            return this;
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2badbc48", new Object[]{this, new Boolean(z)});
            }
            this.f16618a.F = z;
            return this;
        }

        public a a(Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9084dc79", new Object[]{this, surface});
            }
            this.f16618a.G = surface;
            return this;
        }

        public u b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u) ipChange.ipc$dispatch("3ecae4b", new Object[]{this});
            }
            a();
            return new u(this.f16618a);
        }
    }

    /* loaded from: classes6.dex */
    public class c implements com.taobao.mediaplay.player.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private aw b;

        static {
            kge.a(-372845284);
            kge.a(-613305621);
        }

        public c(aw awVar) {
            this.b = awVar;
        }

        public void a(aw awVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
            } else {
                this.b = awVar;
            }
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
                return;
            }
            aw awVar = this.b;
            if (awVar != null) {
                awVar.onVideoStart();
            }
            u.a(u.this, System.currentTimeMillis());
            u.a(u.this, null, true);
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoPause(z);
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoPlay();
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoSeekTo(i);
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoPrepared(iMediaPlayer);
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoError(iMediaPlayer, i, i2);
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoInfo(iMediaPlayer, j, j2, j3, obj);
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoComplete();
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoClose();
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            } else if (this.b == null) {
            } else {
                if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
                    this.b.onVideoScreenChanged(DWVideoScreenType.NORMAL);
                } else if (mediaPlayScreenType == MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
                    this.b.onVideoScreenChanged(DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                } else if (mediaPlayScreenType != MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) {
                } else {
                    this.b.onVideoScreenChanged(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                }
            }
        }

        @Override // com.taobao.mediaplay.player.e
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            aw awVar = this.b;
            if (awVar == null) {
                return;
            }
            awVar.onVideoProgressChanged(i, i2, i3);
        }
    }

    private void a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
        } else if (!this.j) {
        } else {
            if (!this.f16617a.needFirstPlayUT() && this.k && true != z) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.f16617a.isMute() && !this.l) {
                hashMap.put("wifiAuto", "true");
            } else {
                hashMap.put("wifiAuto", "false");
            }
            hashMap.put("mute", Boolean.toString(this.f16617a.isMute()));
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.f16617a.mUTAdapter != null) {
                if (!this.f16617a.statInRemoveList("videoFirstPlay")) {
                    this.f16617a.mUTAdapter.a("DWLive", "Button", "videoFirstPlay", this.f16617a.getUTParams(), hashMap);
                }
                hashMap.putAll(this.f16617a.getUTParams());
                Uri data = this.f16617a.getActivity().getIntent().getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("spm");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        hashMap.put("spm-url", queryParameter);
                    }
                }
                hashMap.put("play_sid", this.e);
                hashMap.put("barrage", "false");
                hashMap.put("item", String.valueOf(this.f16617a.getShowGoodsList()));
                hashMap.put("instance_playid", this.f);
                hashMap.put("likes", "false");
                hashMap.put("is_live", "1");
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWLiveInstance commit 12002 at commitFirstPlayUT");
                this.f16617a.mUTAdapter.a("DWLive", "Button", 12002, (String) hashMap.get(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID), "", "", hashMap);
            }
            this.k = true;
            this.l = true;
        }
    }

    private void a(boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z), map});
        } else if (!this.j || this.f16617a.mUTAdapter == null || "TBAudio".equals(this.f16617a.mVideoSource)) {
        } else {
            Uri data = this.f16617a.getActivity().getIntent().getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter)) {
                    map.put("spm-url", queryParameter);
                }
            }
            map.put("full", "0");
            map.put("play_sid", this.e);
            map.put("play_type", z ? "end" : "pause");
            map.put("instance_playid", this.f);
            this.g = System.currentTimeMillis() - this.h > 0 ? System.currentTimeMillis() - this.h : 0L;
            map.put("duration_time", String.valueOf(this.g));
            map.put("play_token", this.f16617a.getPlayToken());
            long j = this.g;
            if (j < 0 || j > 3600000) {
                com.taobao.taobaoavsdk.util.c.b("DWLiveInstance", "get duration_time error, mDurationTime =" + String.valueOf(this.g) + ", mBeginTime = " + String.valueOf(this.h));
            }
            map.put("is_live", "1");
            map.putAll(this.f16617a.getUTParams());
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWLive 12003 commit at commitPlayEndInfo");
            this.f16617a.mUTAdapter.a("DWLive", "Button", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, map.get(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID), com.ut.mini.l.getInstance().getCurrentPageName(), map.get("playTime"), map);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.j || !this.f16617a.needCloseUT() || this.i) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWLive commitCloseUT return by !mIsDWLiveCommit=");
            sb.append(!this.j);
            sb.append(", !mDWContext.needCloseUT()=");
            sb.append(true ^ this.f16617a.needCloseUT());
            sb.append(",mVideoDestroyed=");
            sb.append(this.i);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else {
            if (this.f16617a.mUTAdapter != null) {
                HashMap hashMap = new HashMap();
                if (!this.f16617a.statInRemoveList("videoClose")) {
                    this.f16617a.mUTAdapter.a("DWLive", "Button", "videoClose", this.f16617a.getUTParams(), hashMap);
                }
                a(true, (Map<String, String>) hashMap);
                this.f16617a.setNeedCloseUT(true);
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWLive commitCloseUT failed with mDWContext.mUTAdapter == null");
            }
            this.i = true;
        }
    }

    public com.taobao.mediaplay.k m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mediaplay.k) ipChange.ipc$dispatch("4a949d90", new Object[]{this}) : this.c;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        l();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWLive commitCloseUT and set mMediaPlayViewProxy = null");
        this.c = null;
        return true;
    }

    public void a(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d69515", new Object[]{this, mediaLiveWarmupConfig});
        } else if (mediaLiveWarmupConfig != null) {
            this.c.a(mediaLiveWarmupConfig);
        } else {
            this.c.a(new MediaLiveWarmupConfig());
        }
    }
}

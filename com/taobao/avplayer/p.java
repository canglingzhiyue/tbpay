package com.taobao.avplayer;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ado;
import tb.dde;
import tb.kcf;
import tb.kge;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* loaded from: classes6.dex */
public class p implements at, aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16549a;
    private com.taobao.avplayer.player.a b;
    private boolean c;
    private float g;
    private Runnable h;
    private a j;
    private AtomicInteger k;
    private Runnable q;
    private boolean e = true;
    private boolean f = true;
    private int i = 0;
    private float l = 0.2f;
    private float m = 1.0f;
    private int n = 2000;
    private int o = 500;
    private boolean p = false;
    private Handler d = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(306039955);
        kge.a(-1335059451);
        kge.a(-123403623);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.at
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        }
    }

    public static /* synthetic */ int a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a9416e2", new Object[]{pVar})).intValue();
        }
        int i = pVar.i;
        pVar.i = i + 1;
        return i;
    }

    public static /* synthetic */ float b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b651e3e", new Object[]{pVar})).floatValue() : pVar.g;
    }

    public static /* synthetic */ int c(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c3625a0", new Object[]{pVar})).intValue() : pVar.i;
    }

    public static /* synthetic */ com.taobao.avplayer.player.a d(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.player.a) ipChange.ipc$dispatch("9b253c20", new Object[]{pVar}) : pVar.b;
    }

    public static /* synthetic */ Runnable e(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("5dba8b49", new Object[]{pVar}) : pVar.h;
    }

    public static /* synthetic */ Handler f(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("eda5babc", new Object[]{pVar}) : pVar.d;
    }

    public static /* synthetic */ AtomicInteger g(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("771142d3", new Object[]{pVar}) : pVar.k;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (this.c || this.g == 0.0f || !this.f || !this.e) {
        } else {
            this.e = false;
            this.i = 0;
            if (this.h == null) {
                this.h = new Runnable() { // from class: com.taobao.avplayer.p.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        p.a(p.this);
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dwHPInstance volumeFadeIn setVolume = " + (p.b(p.this) * ((p.c(p.this) * 0.2f) + 0.2f)));
                        p.d(p.this).a(p.b(p.this) * ((((float) p.c(p.this)) * 0.2f) + 0.2f));
                        if (p.c(p.this) >= 4) {
                            return;
                        }
                        p.f(p.this).postDelayed(p.e(p.this), 500L);
                    }
                };
            }
            this.d.postDelayed(this.h, 500L);
        }
    }

    public void a(final float f, float f2, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cd50c8", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        if (f2 > 0.0f) {
            this.c = false;
        }
        this.k = new AtomicInteger(0);
        final int i3 = i / i2;
        final float f3 = (f2 - f) / i3;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "endVol = " + f2 + "， beginVol=" + f + "shouldChangeCount = " + i3 + ", eachChangeVolume=" + f3);
        this.q = new Runnable() { // from class: com.taobao.avplayer.p.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int incrementAndGet = p.g(p.this).incrementAndGet();
                float f4 = f + (f3 * incrementAndGet);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dwHPInstance VolumeFadeIn New set Volume = " + f4);
                p.d(p.this).a(f4);
                if (incrementAndGet >= i3) {
                    return;
                }
                p.f(p.this).postDelayed(this, i2);
            }
        };
        this.d.removeCallbacksAndMessages(null);
        this.d.postDelayed(this.q, (long) i2);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else if (this.p && this.f16549a.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.f16549a.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_ENABLE_NEW_VOLUME_FADE_IN, "true"))) {
            a(this.l, this.m, this.n, this.o);
        } else {
            B();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else if (this.p && this.f16549a.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.f16549a.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_ENABLE_NEW_VOLUME_FADE_IN, "true"))) {
            a(this.l, this.m, this.n, this.o);
        } else {
            B();
        }
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.F();
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2);
    }

    public p(DWContext dWContext, boolean z) {
        this.f16549a = dWContext;
        if (!this.f16549a.needAD() && !StringUtils.isEmpty(this.f16549a.getVideoToken())) {
            DWContext dWContext2 = this.f16549a;
            this.b = new com.taobao.avplayer.player.c(dWContext2, true, dWContext2.getVideoToken());
        } else {
            this.b = new com.taobao.avplayer.player.c(this.f16549a, true);
        }
        this.b.a(z);
        this.b.a((aw) this);
    }

    public void a(com.taobao.mediaplay.player.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bba46d5", new Object[]{this, hVar});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(hVar);
    }

    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.b.i();
    }

    public com.taobao.avplayer.player.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.player.a) ipChange.ipc$dispatch("9a91ac0", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.avplayer.at
    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(f, f2, f3);
    }

    @Override // com.taobao.avplayer.at
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    @Override // com.taobao.avplayer.at
    public List<com.taobao.taobaoavsdk.f> a(List<com.taobao.taobaoavsdk.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.a(list);
    }

    @Override // com.taobao.avplayer.at
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if ((this.b.f() == 1 || this.b.f() == 2) && StringUtils.isEmpty(this.f16549a.getVideoToken())) {
        } else {
            if (!StringUtils.isEmpty(this.f16549a.getVideoToken()) && this.b.f() == 1) {
                return;
            }
            f();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.b.f() == 5 || this.b.f() == 8 || !StringUtils.isEmpty(this.f16549a.getVideoToken())) {
            this.b.p();
        } else if (this.b.f() == 4 || (this.b.g() && this.b.h() == 4)) {
            if (this.b.g()) {
                this.b.f(0);
            } else {
                this.b.c(0);
            }
            j();
        } else {
            this.b.p();
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.a aVar = this.b;
        return aVar != null && aVar.z();
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.a aVar = this.b;
        return aVar != null && aVar.A();
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.a aVar = this.b;
        return aVar != null && aVar.y();
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str)) {
            DWContext dWContext = this.f16549a;
            if (dWContext == null) {
                return;
            }
            com.taobao.taobaoavsdk.util.c.c(dWContext.mTlogAdapter, "setVideoSource## sorry  VideoSource is Empty  ");
        } else if (this.f16549a.mPlayContext.mLocalVideo) {
            this.b.a(str);
        } else {
            if (str.startsWith(ado.URL_SEPARATOR)) {
                if (this.f16549a.mConfigAdapter != null && !this.f16549a.mConfigAdapter.b()) {
                    str = "http:" + str;
                } else {
                    str = com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
                }
            }
            if (z) {
                try {
                    str = a(str);
                } catch (Throwable th) {
                    DWContext dWContext2 = this.f16549a;
                    if (dWContext2 != null) {
                        com.taobao.taobaoavsdk.util.c.c(dWContext2.mTlogAdapter, " URL illegal " + th.getMessage());
                    }
                }
            }
            this.b.a(this.f16549a.getUTParams());
            this.b.a(str);
        }
    }

    public String a(String str) throws Exception {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!"TBVideo".equals(this.f16549a.getVideoSource())) {
            return str;
        }
        URI uri = new URI(str);
        StringBuilder sb = new StringBuilder(50);
        sb.append("SOS");
        sb.append("=");
        sb.append("Android");
        String a2 = com.taobao.taobaoavsdk.util.f.a(this.f16549a.mNetworkUtilsAdapter, this.f16549a.getActivity());
        if (!StringUtils.isEmpty(a2)) {
            sb.append("&");
            sb.append("SNet");
            sb.append("=");
            sb.append(a2);
        }
        if (!StringUtils.isEmpty(this.f16549a.mFrom)) {
            sb.append("&");
            sb.append("SBizCode");
            sb.append("=");
            sb.append(this.f16549a.mFrom);
        }
        String a3 = this.f16549a.mConfigParamsAdapter.a(this.f16549a.getActivity());
        if (this.f16549a.mConfigParamsAdapter != null && !StringUtils.isEmpty(a3)) {
            sb.append("&");
            sb.append("SRid");
            sb.append("=");
            sb.append(System.currentTimeMillis());
            sb.append(a3);
        }
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null) {
            str2 = sb.toString();
        } else {
            str2 = rawQuery + "&" + ((Object) sb);
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean a2 = com.taobao.taobaoavsdk.util.b.a(this.f16549a.mConfigAdapter.getConfig("DWInteractive", "enableMuteFix", "true"));
        if (a2 && z == this.c) {
            return;
        }
        if (!a2) {
            this.d.removeCallbacks(this.h);
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar != null && (aVar instanceof com.taobao.avplayer.player.c)) {
            ((com.taobao.avplayer.player.c) aVar).f(z);
        }
        if (z) {
            if (a2) {
                this.d.removeCallbacks(this.h);
                this.d.removeCallbacks(this.q);
            }
            this.e = true;
            this.b.a(0.0f);
            this.c = z;
            return;
        }
        this.g = com.taobao.avplayer.player.a.n;
        this.c = z;
        if (this.e && this.f) {
            this.b.a(this.g * 0.2f);
            if (this.b.f() != 1) {
                return;
            }
            if (this.p && this.f16549a.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.f16549a.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_ENABLE_NEW_VOLUME_FADE_IN, "true"))) {
                a(this.l, this.m, this.n, this.o);
                return;
            } else {
                B();
                return;
            }
        }
        this.b.a(this.g);
    }

    @Override // com.taobao.avplayer.at
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.b.j();
    }

    @Override // com.taobao.avplayer.at
    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.b.k();
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        this.d.removeCallbacks(this.h);
        this.g = f;
        if (this.e && f != 0.0f) {
            this.b.a(f * 0.2f);
        } else {
            this.b.a(f);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.b.b(f);
        }
    }

    @Override // com.taobao.avplayer.at
    public float r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbe9", new Object[]{this})).floatValue() : this.b.a();
    }

    @Override // com.taobao.avplayer.at
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.b.q();
        }
    }

    @Override // com.taobao.avplayer.at
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.b.b(false);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null || !(aVar instanceof com.taobao.avplayer.player.c)) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).g(z);
    }

    @Override // com.taobao.avplayer.at
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null || !(aVar instanceof com.taobao.avplayer.player.c)) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).e(z);
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            this.b.u();
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.b.v();
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.c(i);
        }
    }

    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            this.b.a(i, z, z2);
        }
    }

    public void a(bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173beb30", new Object[]{this, bcVar});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null || !(aVar instanceof com.taobao.avplayer.player.c)) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).a(bcVar);
    }

    @Override // com.taobao.avplayer.at
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b.d(i);
        }
    }

    @Override // com.taobao.avplayer.at
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.b.r();
        }
    }

    @Override // com.taobao.avplayer.at
    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.b.t();
    }

    @Override // com.taobao.avplayer.at
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.b.l();
    }

    @Override // com.taobao.avplayer.at
    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.b.m();
    }

    @Override // com.taobao.avplayer.at
    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.b.getCurrentPosition();
    }

    @Override // com.taobao.avplayer.at
    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.b.f();
    }

    @Override // com.taobao.avplayer.at
    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
        }
        if (this.b.g()) {
            return this.b.h();
        }
        return this.b.f();
    }

    @Override // com.taobao.avplayer.at
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (this.b.f() != 3 && ((!StringUtils.isEmpty(this.f16549a.mPlayContext.getVideoUrl()) || !StringUtils.isEmpty(this.f16549a.getVideoToken())) && (!this.b.g() || this.b.h() != 3))) {
        } else {
            a aVar = this.j;
            if (aVar != null) {
                aVar.a();
            }
            this.b.p();
            if (!this.c) {
                return;
            }
            this.b.a(0.0f);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bf0f52", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    @Override // com.taobao.avplayer.at
    public void b(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086cf9c", new Object[]{this, awVar});
        } else {
            this.b.a(awVar);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
        } else {
            this.b.a(baVar);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
        } else {
            this.b.a(axVar);
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        this.b.x();
        Handler handler = this.d;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).a(ddeVar);
    }

    public void a(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a40a2", new Object[]{this, innerStartFuncListener});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).a(innerStartFuncListener);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).b(map);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}

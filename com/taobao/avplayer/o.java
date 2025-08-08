package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dde;
import tb.ddg;
import tb.kcf;
import tb.kcj;
import tb.kck;
import tb.kcl;
import tb.kge;
import tb.oyx;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.InnerStartFuncListenerImpl;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes6.dex */
public class o implements aw, ax, com.taobao.mediaplay.player.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private a H;
    private InnerStartFuncListener J;
    private boolean K;
    private boolean L;
    private boolean M;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16542a;
    public boolean b;
    private DWContext d;
    private FrameLayout e;
    private boolean f;
    private boolean g;
    private boolean h;
    private ImageView i;
    private p j;
    private com.taobao.mediaplay.g k;
    private DWLifecycleType l;
    private com.taobao.avplayer.common.z m;
    private ArrayList<com.taobao.avplayer.common.q> n;
    private com.taobao.avplayer.common.u o;
    private int p;
    private boolean q;
    private boolean r;
    private String s;
    private String t;
    private int u;
    private boolean v;
    private long w;
    private long x;
    private int y;
    private boolean z;
    private long A = 0;
    private String F = null;
    private boolean N = true;
    private int G = 10;
    private boolean I = false;
    public int c = 0;

    static {
        kge.a(-281494622);
        kge.a(-123403623);
        kge.a(857599862);
        kge.a(-1602626051);
    }

    @Override // com.taobao.mediaplay.player.h
    public boolean dU_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404b4f99", new Object[]{this})).booleanValue();
        }
        return false;
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

    public static /* synthetic */ long a(o oVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17e12628", new Object[]{oVar, new Long(j)})).longValue();
        }
        oVar.x = j;
        return j;
    }

    public static /* synthetic */ DWContext a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("918dd56b", new Object[]{oVar}) : oVar.d;
    }

    public static /* synthetic */ void a(o oVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb4cfa4", new Object[]{oVar, str, str2});
        } else {
            oVar.a(str, str2);
        }
    }

    public static /* synthetic */ boolean a(o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17e16248", new Object[]{oVar, new Boolean(z)})).booleanValue();
        }
        oVar.v = z;
        return z;
    }

    public static /* synthetic */ boolean b(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b64a9f3", new Object[]{oVar})).booleanValue() : oVar.C;
    }

    public static /* synthetic */ boolean b(o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("413146c9", new Object[]{oVar, new Boolean(z)})).booleanValue();
        }
        oVar.C = z;
        return z;
    }

    public static /* synthetic */ a c(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b5c9d159", new Object[]{oVar}) : oVar.H;
    }

    public static /* synthetic */ boolean c(o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a812b4a", new Object[]{oVar, new Boolean(z)})).booleanValue();
        }
        oVar.B = z;
        return z;
    }

    public static /* synthetic */ com.taobao.mediaplay.g d(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mediaplay.g) ipChange.ipc$dispatch("6ec3fabb", new Object[]{oVar}) : oVar.k;
    }

    public static /* synthetic */ boolean d(o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93d10fcb", new Object[]{oVar, new Boolean(z)})).booleanValue();
        }
        oVar.D = z;
        return z;
    }

    public static /* synthetic */ DWLifecycleType e(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWLifecycleType) ipChange.ipc$dispatch("129ffc32", new Object[]{oVar}) : oVar.l;
    }

    public static /* synthetic */ boolean e(o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd20f44c", new Object[]{oVar, new Boolean(z)})).booleanValue();
        }
        oVar.z = z;
        return z;
    }

    public static /* synthetic */ com.taobao.avplayer.common.z f(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.z) ipChange.ipc$dispatch("7f7b31de", new Object[]{oVar}) : oVar.m;
    }

    public static /* synthetic */ boolean g(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df79cece", new Object[]{oVar})).booleanValue() : oVar.D;
    }

    public static /* synthetic */ void h(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04ad629", new Object[]{oVar});
        } else {
            oVar.p();
        }
    }

    public static /* synthetic */ p i(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("33e3760f", new Object[]{oVar}) : oVar.j;
    }

    public static /* synthetic */ void j(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ece4e7", new Object[]{oVar});
        } else {
            oVar.v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(com.taobao.avplayer.DWContext r9) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.o.<init>(com.taobao.avplayer.DWContext):void");
    }

    private boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!com.taobao.taobaoavsdk.util.b.a(i, OrangeConfig.getInstance().getConfig("DWInteractive", "vvcRetryErrorLists", "[13001]"))) {
            return false;
        }
        String videoUrl = this.d.mPlayContext.getVideoUrl();
        if (StringUtils.isEmpty(videoUrl)) {
            return false;
        }
        this.k.q();
        this.k.a(this.H);
        String videoUrl2 = this.d.mPlayContext.getVideoUrl();
        if (StringUtils.isEmpty(videoUrl2) || videoUrl2.equals(videoUrl)) {
            return false;
        }
        this.d.mPlayContext.unselectS266OfPlay();
        this.d.mPlayContext.setDegradeCode(i, this.d.mPlayContext.mSelectedUrlName);
        a(false);
        return true;
    }

    @Override // com.taobao.mediaplay.player.h
    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", onMediaRetry what：" + i);
        String videoDefinition = this.d.mPlayContext.getVideoDefinition();
        if (!StringUtils.isEmpty(videoDefinition) && videoDefinition.contains("266")) {
            return b(i, i2);
        }
        if ((i != -5 && i != -110) || !this.N) {
            return false;
        }
        this.N = false;
        return c(i, i2);
    }

    private boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5ddc94e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableRetryWhenErrorCode", "true"))) {
            return false;
        }
        String videoUrl = this.d.mPlayContext.getVideoUrl();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", onMediaRetryForTimeOut oldUrl：" + videoUrl);
        if (StringUtils.isEmpty(videoUrl)) {
            return false;
        }
        a(false);
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.C = true;
        this.k.a(this.H);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        p pVar = this.j;
        if (pVar == null) {
            return null;
        }
        return pVar.a();
    }

    public void a(com.taobao.avplayer.common.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410ba160", new Object[]{this, uVar});
        } else {
            this.o = uVar;
        }
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        this.p++;
        u();
        this.f = false;
        this.K = false;
        if (this.d.mPauseInBackground && (pVar = this.j) != null && pVar.e().s()) {
            return;
        }
        this.s = kcj.b(this.d.getUserInfoAdapter().a(), this.d.getUserInfoAdapter().b());
        this.r = false;
        a((Map<String, String>) null, true);
        s();
        this.x = System.currentTimeMillis();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d.addPlayExpUtParams(this.k.e());
        this.j.a(this.d.mPlayContext.getVideoUrl(), z);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            ((com.taobao.avplayer.player.c) this.j.e()).a((com.taobao.avplayer.common.ae) new c());
        }
    }

    public void b(boolean z) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z && (dWContext = this.d) != null && dWContext.getVideo() != null) {
            this.d.getVideo().a(this);
        }
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.c(z);
    }

    /* loaded from: classes6.dex */
    public class c implements com.taobao.avplayer.common.ae {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(542322431);
            kge.a(18351072);
        }

        private c() {
        }

        @Override // com.taobao.avplayer.common.ae
        public void a(com.taobao.avplayer.player.c cVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4f22b7c", new Object[]{this, cVar});
            } else if (o.e(o.this) == DWLifecycleType.MID) {
            } else {
                if (cVar.f() == 1 && (o.this.f16542a || Build.VERSION.SDK_INT < 17)) {
                    o.this.a(DWLifecycleType.MID);
                } else if (StringUtils.isEmpty(o.a(o.this).getVideoToken()) || cVar.f() != 1) {
                    z = false;
                } else {
                    o.this.a(DWLifecycleType.MID);
                }
                if (!z || cVar == null) {
                    return;
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " updated and notify 12100");
                cVar.a(null, 12100L, 0L, 0L, null);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(957482420);
            kge.a(-1201612728);
        }

        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (o.f(o.this) == null) {
            } else {
                o.f(o.this).hook();
            }
        }
    }

    public void a(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
            return;
        }
        this.m = zVar;
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setOnClickListener(new b());
    }

    public void a(com.taobao.avplayer.common.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4109cfe4", new Object[]{this, qVar});
        } else if (this.n.contains(qVar)) {
        } else {
            this.n.add(qVar);
        }
    }

    public final void a(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159ff38e", new Object[]{this, dWLifecycleType});
            return;
        }
        this.l = dWLifecycleType;
        b(dWLifecycleType);
        if (this.l == DWLifecycleType.MID) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", setLifecycleType " + dWLifecycleType + ", true");
            d(true);
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", setLifecycleType " + dWLifecycleType + ", false");
        d(false);
    }

    private void b(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0528ad", new Object[]{this, dWLifecycleType});
            return;
        }
        Iterator<com.taobao.avplayer.common.q> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.e;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j.a(i);
        }
    }

    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            this.j.a(i, z, z2);
        }
    }

    public void a(bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173beb30", new Object[]{this, bcVar});
        } else {
            this.j.a(bcVar);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j.b(z);
        com.taobao.avplayer.common.u uVar = this.o;
        if (uVar != null) {
            uVar.onMutedChange(z);
        }
        d(!z);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        com.taobao.avplayer.player.a e = this.j.e();
        if (e == null || e.f() == 6 || e.f() == 3 || e.f() == 0) {
            return;
        }
        e.c(f);
    }

    public boolean d() {
        com.taobao.avplayer.player.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        p pVar = this.j;
        if (pVar != null && (cVar = (com.taobao.avplayer.player.c) pVar.e()) != null) {
            return cVar.isPlaying();
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.J == null) {
            this.J = new InnerStartFuncListenerImpl();
            this.j.a(this.J);
        }
        if ((StringUtils.isEmpty(this.d.mPlayContext.getVideoUrl()) && !this.C && !this.z) || this.h) {
            this.h = false;
            this.C = true;
            this.k.a(this.H);
        }
        this.j.i();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.d.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.b(this.d.mFrom, this.d.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_PRE_DOWNLOAD_BIZCODE_BLACKLIST, ""))) {
            ddg ddgVar = this.d.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "--->preDownload failed, bizcode " + this.d.mFrom + " in blacklist");
        } else {
            this.D = true;
            this.E = i;
            if (this.h) {
                this.h = false;
                this.C = true;
                this.k.a(this.H);
            }
            if (this.C) {
                return;
            }
            p();
            this.D = false;
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.d.mPlayContext.getVideoUrl() == null || StringUtils.isEmpty(this.d.mPlayContext.getVideoUrl())) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                int i = 1048576;
                if (this.E > 1048576) {
                    i = this.E;
                }
                jSONObject.put("bytes", String.valueOf(i));
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                if (this.d.mPlayContext.isH265()) {
                    jSONObject2.put("encodeType", "h265");
                } else {
                    jSONObject2.put("encodeType", "h264");
                }
                String videoUrl = this.d.mPlayContext.getVideoUrl();
                String a2 = a(videoUrl);
                StringBuilder sb = new StringBuilder(100);
                if (!StringUtils.isEmpty(a2)) {
                    sb.append("cdnIp=" + a2);
                }
                if (!StringUtils.isEmpty(this.d.getPlayToken())) {
                    if (!StringUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("playTokenId=" + this.d.getPlayToken());
                }
                if (this.d.mConfigAdapter != null && this.d.mConfigAdapter.e() && this.d.mPlayContext.getVideoLength() > 0 && this.d.mPlayContext.getVideoLength() < 262144000 && this.d.mPlayContext.getVideoLength() != Integer.MAX_VALUE && this.d.mPlayContext.getVideoLength() > 0) {
                    if (!StringUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("videoLength=" + this.d.mPlayContext.getVideoLength());
                }
                jSONObject2.put("url", com.taobao.taobaoavsdk.util.b.a(videoUrl, sb));
                if (this.d.mPlayContext.getCacheKey() != null && !StringUtils.isEmpty(this.d.mPlayContext.getCacheKey())) {
                    jSONObject2.put("cacheKey", this.d.mPlayContext.getCacheKey());
                }
                jSONArray.put(jSONObject2);
                jSONObject.put("videoInfoList", jSONArray);
                oyx.a(this.d.getActivity(), jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            if (!str.startsWith("http:") || this.d.mConfigAdapter == null || !com.taobao.taobaoavsdk.util.b.a(this.d.mConfigAdapter.getConfig("DWInteractive", "videoClipCDNIpEnable3", "true"))) {
                return null;
            }
            if (!com.taobao.taobaoavsdk.util.b.a(this.d.mConfigAdapter.getConfig("DWInteractive", "disableTotalHttpDnsIPV6", "false"))) {
                z = com.taobao.taobaoavsdk.util.b.a(this.d.mConfigAdapter.getConfig("DWInteractive", "VideoEnableIPV6", "true"));
            }
            return com.taobao.taobaoavsdk.util.f.c(str, z);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.j.j();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String str = "";
        if (this.d.mConfigAdapter != null) {
            str = this.d.mConfigAdapter.getConfig(str, "disablePreloadBizCodeList", str);
        }
        if (com.taobao.taobaoavsdk.util.b.b(this.d.mFrom, str)) {
            return;
        }
        if (this.h) {
            this.h = false;
            this.C = true;
            this.k.a(this.H);
        }
        this.j.y();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        String str = "";
        if (this.d.mConfigAdapter != null) {
            str = this.d.mConfigAdapter.getConfig(str, "disablePreloadBizCodeList", str);
        }
        if (com.taobao.taobaoavsdk.util.b.b(this.d.mFrom, str)) {
            return;
        }
        if (this.h) {
            this.h = false;
            this.C = true;
            this.k.a(this.H);
        }
        this.j.z();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.j.m();
        this.k.s();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.j.k();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        t();
        p pVar = this.j;
        if (pVar != null) {
            pVar.A();
        }
        ArrayList<com.taobao.avplayer.common.q> arrayList = this.n;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.k.s();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.s = kcj.b(this.d.getUserInfoAdapter().a(), this.d.getUserInfoAdapter().b());
        this.r = false;
        a((Map<String, String>) null, true);
        s();
        this.x = System.currentTimeMillis();
        q();
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.j.e(z);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.d.mDWAlarmAdapter == null) {
        } else {
            DWStabilityData dWStabilityData = new DWStabilityData();
            StringBuffer stringBuffer = new StringBuffer(100);
            if (this.d.getVideo() != null) {
                stringBuffer.append("bizCode=");
                stringBuffer.append(this.d.mFrom);
                stringBuffer.append(",videoId=");
                stringBuffer.append(this.d.mVideoId);
                stringBuffer.append(",useCache=");
                p pVar = this.j;
                stringBuffer.append(pVar != null ? pVar.l() : false);
                stringBuffer.append(",hitCache=");
                p pVar2 = this.j;
                stringBuffer.append(pVar2 != null ? pVar2.w() : false);
                stringBuffer.append(",completeHitCache=");
                p pVar3 = this.j;
                if (pVar3 != null) {
                    z = pVar3.x();
                }
                stringBuffer.append(z);
                stringBuffer.append(",url=");
                stringBuffer.append(this.d.mPlayContext.getVideoUrl());
                stringBuffer.append(",videoSource=");
                stringBuffer.append(this.d.getVideoSource());
                stringBuffer.append(",playerType=");
                stringBuffer.append(r());
                stringBuffer.append(",usePlayManger=");
                stringBuffer.append(this.B);
                stringBuffer.append(",videoDefinition=");
                stringBuffer.append(this.d.mPlayContext.getVideoDefinition());
                stringBuffer.append(",videoUrlPickDuration=");
                stringBuffer.append(this.A);
                stringBuffer.append(",useTBNet=");
                stringBuffer.append(String.valueOf(this.d.mPlayContext.isUseTBNet()));
                stringBuffer.append(",useHardwareHevc=");
                stringBuffer.append(String.valueOf(this.d.mPlayContext.isHardwareHevc()));
                stringBuffer.append(",useHardwareAvc=");
                stringBuffer.append(String.valueOf(this.d.mPlayContext.isHardwareAvc()));
                stringBuffer.append(",playToken=");
                stringBuffer.append(String.valueOf(this.d.getPlayToken()));
            }
            dWStabilityData.args = stringBuffer.toString();
            this.d.mDWAlarmAdapter.a(this.d.getActivity(), "DWVideo", "videoPlay", true, dWStabilityData);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        DWContext dWContext = this.d;
        if (dWContext == null || dWContext.mUTAdapter == null || "TBAudio".equals(this.d.mVideoSource)) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.d.getVideo() != null) {
            hashMap.put("playTime", String.valueOf(this.w));
        }
        b(false, (Map<String, String>) hashMap);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            this.x = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else {
            this.x = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        a("videoPlay", String.valueOf(i), String.valueOf(i2));
        this.l = DWLifecycleType.AFTER;
        a(this.l);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.v) {
        } else {
            this.v = true;
            if (this.d.mDWAlarmAdapter == null) {
                return;
            }
            DWStabilityData dWStabilityData = new DWStabilityData();
            dWStabilityData.code = str2;
            dWStabilityData.msg = str3;
            StringBuffer stringBuffer = new StringBuffer(100);
            DWContext dWContext = this.d;
            if (dWContext != null && dWContext.getVideo() != null) {
                stringBuffer.append("bizCode=");
                stringBuffer.append(this.d.mFrom);
                stringBuffer.append(",videoId=");
                stringBuffer.append(this.d.mVideoId);
                stringBuffer.append(",useCache=");
                p pVar = this.j;
                stringBuffer.append(pVar != null ? pVar.l() : false);
                stringBuffer.append(",hitCache=");
                p pVar2 = this.j;
                stringBuffer.append(pVar2 != null ? pVar2.w() : false);
                stringBuffer.append(",completeHitCache=");
                p pVar3 = this.j;
                if (pVar3 != null) {
                    z = pVar3.x();
                }
                stringBuffer.append(z);
                stringBuffer.append(",url=");
                stringBuffer.append(StringUtils.isEmpty(this.d.mPlayContext.getVideoUrl()) ? "" : this.d.mPlayContext.getVideoUrl());
                stringBuffer.append(",videoSource=");
                stringBuffer.append(this.d.getVideoSource());
                stringBuffer.append(",playerType=");
                stringBuffer.append(r());
                stringBuffer.append(",usePlayManger=");
                stringBuffer.append(this.B);
                stringBuffer.append(",videoDefinition=");
                stringBuffer.append(this.d.mPlayContext.getVideoDefinition());
                stringBuffer.append(",videoUrlPickDuration=");
                stringBuffer.append(this.A);
                stringBuffer.append(",useTBNet=");
                stringBuffer.append(String.valueOf(this.d.mPlayContext.isUseTBNet()));
                stringBuffer.append(",useHardwareHevc=");
                stringBuffer.append(String.valueOf(this.d.mPlayContext.isHardwareHevc()));
                stringBuffer.append(",useHardwareAvc=");
                stringBuffer.append(String.valueOf(this.d.mPlayContext.isHardwareAvc()));
                stringBuffer.append(",playToken=");
                stringBuffer.append(String.valueOf(this.d.getPlayToken()));
            }
            dWStabilityData.args = stringBuffer.toString();
            com.taobao.avplayer.common.ad adVar = this.d.mDWAlarmAdapter;
            Activity activity = this.d.getActivity();
            if (StringUtils.isEmpty(str)) {
                str = "videoPlay";
            }
            adVar.a(activity, "DWVideo", str, false, dWStabilityData);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else if (3 != j || !(obj2 instanceof Map)) {
        } else {
            this.f16542a = true;
            try {
                b((Map) obj2);
            } catch (Exception unused) {
            }
        }
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this});
        }
        p pVar = this.j;
        if (pVar == null) {
            return null;
        }
        return pVar.b();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.p++;
        u();
        this.f = false;
        this.K = false;
        a(DWLifecycleType.MID_END);
        this.l = DWLifecycleType.AFTER;
        a(this.l);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        this.f = false;
        this.K = false;
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.x != 0) {
            this.w += System.currentTimeMillis() - this.x;
            this.y = (int) (this.y + (System.currentTimeMillis() - this.x));
        }
        this.x = System.currentTimeMillis();
    }

    private void a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
        } else if (this.d.getActivity() == null) {
        } else {
            if (!this.d.needFirstPlayUT() && this.K && true != z) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.d.isMute() && !this.L) {
                hashMap.put("wifiAuto", "true");
            } else {
                hashMap.put("wifiAuto", "false");
            }
            hashMap.put("mute", Boolean.toString(this.d.isMute()));
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.d.mUTAdapter != null && !"TBAudio".equals(this.d.mVideoSource)) {
                if (!this.d.statInRemoveList("videoFirstPlay")) {
                    this.d.mUTAdapter.a("DWVideo", "Button", "videoFirstPlay", this.d.getUTParams(), hashMap);
                }
                hashMap.putAll(this.d.getUTParams());
                Uri data = this.d.getActivity().getIntent().getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("spm");
                    if (!StringUtils.isEmpty(queryParameter)) {
                        hashMap.put("spm-url", queryParameter);
                    }
                }
                hashMap.put("play_sid", this.s);
                hashMap.put("barrage", "false");
                hashMap.put("item", String.valueOf(this.d.getShowGoodsList()));
                hashMap.put("instance_playid", this.t);
                hashMap.put("likes", "false");
                hashMap.put("is_live", "0");
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWHPVideoController commit 12002 at commitFirstPlayUT");
                this.d.mUTAdapter.a(null, null, 12002, (String) hashMap.get(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID), "", "", hashMap);
            }
            this.K = true;
            this.L = true;
        }
    }

    private void b(Map<String, Long> map) {
        DWContext dWContext;
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.b || (dWContext = this.d) == null || dWContext.mDWAlarmAdapter == null || map == null || map.get("RENDER_END_TIME") == null || map.get("RENDER_START_TIME") == null) {
        } else {
            long longValue = map.get("RENDER_END_TIME").longValue() - map.get("RENDER_START_TIME").longValue();
            if (longValue >= 10000 || longValue == 0 || i < 0) {
                DWStabilityData dWStabilityData = new DWStabilityData();
                dWStabilityData.args = String.valueOf(longValue);
                this.d.mDWAlarmAdapter.a(this.d.getActivity(), "DWVideo", "VideoOutInTime", false, dWStabilityData);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", r());
            hashMap.put("videoUrl", this.d.mPlayContext.getVideoUrl());
            p pVar = this.j;
            hashMap.put(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, String.valueOf(pVar != null ? pVar.l() : false));
            p pVar2 = this.j;
            hashMap.put("hitCache", String.valueOf(pVar2 != null ? pVar2.w() : false));
            p pVar3 = this.j;
            if (pVar3 != null) {
                z = pVar3.x();
            }
            hashMap.put("completeHitCache", String.valueOf(z));
            hashMap.put("usePlayManger", String.valueOf(this.B));
            hashMap.put("videoDefinition", this.d.mPlayContext.getVideoDefinition());
            hashMap.put("useTBNet", String.valueOf(this.d.mPlayContext.isUseTBNet()));
            hashMap.put("useHardwareHevc", String.valueOf(this.d.mPlayContext.isHardwareHevc()));
            hashMap.put("useHardwareAvc", String.valueOf(this.d.mPlayContext.isHardwareAvc()));
            hashMap.put("playToken", String.valueOf(this.d.getPlayToken()));
            hashMap.putAll(this.d.getUTParams());
            HashMap hashMap2 = new HashMap();
            hashMap2.put("first_frame_start", Double.valueOf(map.get("RENDER_START_TIME").longValue()));
            hashMap2.put("first_frame_end", Double.valueOf(map.get("RENDER_END_TIME").longValue()));
            hashMap2.put(TaoLiveVideoView.MornitorFirstFrameRender, Double.valueOf(longValue));
            this.d.mDWAlarmAdapter.a("DWVideo", TaoLiveVideoView.MornitorFirstFrameRender, hashMap, hashMap2);
            if (kck.a()) {
                ddg ddgVar = this.d.mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.a(ddgVar, "--->commitMediaPlayerRender:" + hashMap2.toString() + " dimensionValues:" + hashMap.toString());
            }
            this.b = true;
        }
    }

    private String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        DWContext dWContext = this.d;
        if (dWContext == null) {
            return "";
        }
        int playerType = dWContext.mPlayContext.getPlayerType();
        return playerType != 1 ? playerType != 3 ? "mediaPlayer" : "taobaoPlayer" : "ijkPlayer";
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (!this.d.needFirstPlayUT() || this.f) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.d.isMute() && !this.M) {
                hashMap.put("wifiAuto", "true");
            } else {
                hashMap.put("wifiAuto", "false");
            }
            hashMap.put("mute", Boolean.toString(this.d.isMute()));
            if (this.d.mUTAdapter != null && !"TBAudio".equals(this.d.mVideoSource) && !this.d.statInRemoveList("videoRealPlay")) {
                this.d.mUTAdapter.a("DWVideo", "Button", "videoRealPlay", this.d.getUTParams(), hashMap);
            }
            this.f = true;
            this.M = true;
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (!this.d.needCloseUT() || this.g) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWHPVideoController commitCloseUT 12003 return by !mDWContext.needCloseUT()=");
            sb.append(!this.d.needCloseUT());
            sb.append(",mVideoDestroyed=");
            sb.append(this.g);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else {
            if (this.d.mUTAdapter != null && !"TBAudio".equals(this.d.mVideoSource)) {
                HashMap hashMap = new HashMap();
                if (this.d.getVideo() != null) {
                    hashMap.put("closeTime", String.valueOf(this.d.getVideo().o()));
                    hashMap.put("playTime", String.valueOf(this.w));
                }
                if (!this.d.statInRemoveList("videoClose")) {
                    this.d.mUTAdapter.a("DWVideo", "Button", "videoClose", this.d.getUTParams(), hashMap);
                }
                b(true, (Map<String, String>) hashMap);
                this.d.setNeedCloseUT(true);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DWHPVideoController commitCloseUT 12003 failed with mDWContext.mUTAdapter=");
                if (this.d.mUTAdapter != null) {
                    z = true;
                }
                sb2.append(z);
                sb2.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
                sb2.append(!"TBAudio".equals(this.d.mVideoSource));
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb2.toString());
            }
            this.g = true;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DWHPVideoController commitEndForMultiplexing 12003 return by !mDWContext.needCloseUT()=");
        sb.append(!this.d.needCloseUT());
        sb.append(",mVideoDestroyed=");
        sb.append(this.g);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        if (!this.d.needCloseUT() || this.g) {
            return;
        }
        if (this.d.mUTAdapter != null && !"TBAudio".equals(this.d.mVideoSource)) {
            HashMap hashMap = new HashMap();
            if (this.d.getVideo() != null) {
                hashMap.put("closeTime", String.valueOf(this.d.getVideo().o()));
                hashMap.put("playTime", String.valueOf(this.w));
                hashMap.put("commitByActive", "1");
            }
            if (!this.d.statInRemoveList("videoClose")) {
                this.d.mUTAdapter.a("DWVideo", "Button", "videoClose", this.d.getUTParams(), hashMap);
            }
            a(true, (Map<String, String>) hashMap);
            this.d.setNeedCloseUT(true);
            this.u++;
            this.q = false;
            this.u = 0;
            this.y = 0;
            this.w = 0L;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DWHPVideoController commitEndForMultiplexing 12003 failed with mDWContext.mUTAdapter=");
        if (this.d.mUTAdapter != null) {
            z = true;
        }
        sb2.append(z);
        sb2.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
        sb2.append(!"TBAudio".equals(this.d.mVideoSource));
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb2.toString());
    }

    private void a(boolean z, Map<String, String> map) {
        Map<String, String> playExpUTParams;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z), map});
        } else if (this.d.getActivity() == null) {
        } else {
            if (this.d.mUTAdapter != null && !"TBAudio".equals(this.d.mVideoSource)) {
                Uri data = this.d.getActivity().getIntent().getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("spm");
                    if (!StringUtils.isEmpty(queryParameter)) {
                        map.put("spm-url", queryParameter);
                    }
                }
                int n = this.j.n();
                map.put("video_duration", String.valueOf(n));
                if (n < 0 || n > 3600000) {
                    com.taobao.taobaoavsdk.util.c.b("DWHighPerformanceInstance", "get video_duration error, video_duration =" + String.valueOf(n));
                }
                map.put("complete", this.q ? "1" : "0");
                map.put("full", "0");
                map.put("play_sid", this.s);
                map.put("play_type", z ? "end" : "pause");
                map.put("switchScene", "default");
                map.put("play_times", String.valueOf(this.u));
                map.put("instance_playid", this.t);
                map.put("duration_time", String.valueOf(this.y));
                map.put("play_token", this.d.getPlayToken());
                map.put("is_live", "0");
                int i = this.y;
                if (i < 0 || i > 3600000) {
                    com.taobao.taobaoavsdk.util.c.b("DWHighPerformanceInstance", "get duration_time error, mDurationTime =" + String.valueOf(this.y) + ", mLatestTime = " + String.valueOf(this.x));
                }
                map.putAll(this.d.getUTParams());
                if (z && (playExpUTParams = this.d.getPlayExpUTParams()) != null) {
                    int b2 = com.taobao.taobaoavsdk.util.b.b(playExpUTParams.get("pctime"));
                    if (b2 > 0) {
                        map.put("pctime", "" + b2);
                    }
                    int b3 = com.taobao.taobaoavsdk.util.b.b(playExpUTParams.get("pcerror"));
                    map.put("pcerror", "" + b3);
                    map.put("resourcePassThroughData", playExpUTParams.get("resourcePassThroughData"));
                    map.put("videoPassThroughData", playExpUTParams.get("videoPassThroughData"));
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWHPVideoController 12003 commit at commitPlayEndInfo");
                this.d.mUTAdapter.a(null, null, IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, map.get(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID), com.ut.mini.l.getInstance().getCurrentPageName(), map.get("playTime"), map);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DWHPVideoController commitPlayEndInfo 12003 failed with mDWContext.mUTAdapter=");
            if (this.d.mUTAdapter != null) {
                z2 = true;
            }
            sb.append(z2);
            sb.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
            sb.append(!"TBAudio".equals(this.d.mVideoSource));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        }
    }

    private void b(boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a12381a", new Object[]{this, new Boolean(z), map});
        } else if (!this.f || (this.r && z)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWHPVideoController commitVideoComplete2 12003 return by !mVideoStarted=");
            sb.append(!this.f);
            sb.append(",(mHasCommitVideoComplete && end)=");
            if (this.r && z) {
                z2 = true;
            }
            sb.append(z2);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else {
            if (!this.r && z) {
                this.r = true;
            }
            if (z) {
                this.u++;
            }
            a(z, map);
            if (!z) {
                return;
            }
            this.y = 0;
        }
    }

    private void u() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (this.d.mUTAdapter == null || "TBAudio".equals(this.d.mVideoSource)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWHPVideoController commitCompleteUT 12003 return by (mDWContext.mUTAdapter == null)=");
            if (this.d.mUTAdapter == null) {
                z = true;
            }
            sb.append(z);
            sb.append(",(DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource))=");
            sb.append("TBAudio".equals(this.d.mVideoSource));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else {
            HashMap hashMap = new HashMap();
            if (this.d.getVideo() != null) {
                hashMap.put("completeTime", String.valueOf(this.d.getVideo().n()));
                hashMap.put("playTime", String.valueOf(this.w));
            }
            if (!this.d.statInRemoveList("videoComplete")) {
                this.d.mUTAdapter.a("DWVideo", "Button", "videoComplete", this.d.getUTParams(), hashMap);
            }
            this.q = true;
            b(true, (Map<String, String>) hashMap);
            this.q = false;
        }
    }

    /* loaded from: classes6.dex */
    public class a implements com.taobao.mediaplay.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(64684335);
            kge.a(763125200);
        }

        public a() {
        }

        @Override // com.taobao.mediaplay.c
        public void a(boolean z, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                return;
            }
            o.c(o.this, z);
            o.b(o.this, false);
            if (o.g(o.this)) {
                o.h(o.this);
                o.d(o.this, false);
            }
            if (StringUtils.isEmpty(o.a(o.this).mPlayContext.getVideoUrl()) && StringUtils.isEmpty(o.a(o.this).getVideoToken())) {
                com.taobao.taobaoavsdk.util.c.c(o.a(o.this).mTlogAdapter, " DWVideoUrlPickCallBack.onPick## can not startVideo ,  url empty");
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.avplayer.o.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        Toast makeText;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                        } catch (Exception e) {
                            ddg ddgVar = o.a(o.this).mTlogAdapter;
                            com.taobao.taobaoavsdk.util.c.c(ddgVar, " DWVideoUrlPickCallBack.onPick## can not startVideo , url empty and exception" + e.getMessage());
                            return;
                        }
                        if (!StringUtils.isEmpty(str)) {
                            String str2 = str;
                            char c = 65535;
                            switch (str2.hashCode()) {
                                case 1507424:
                                    if (str2.equals("1001")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 1507426:
                                    if (str2.equals("1003")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1507427:
                                    if (str2.equals("1004")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 1508389:
                                    if (str2.equals(kcf.VIDEO_NO_COPYRIGHT_CODE)) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 1509346:
                                    if (str2.equals(kcf.VIDEO_SOP_CHECK_CODE)) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 1596798:
                                    if (str2.equals("4002")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                            }
                            if (c != 0 && c != 1 && c != 2 && c != 3) {
                                if (c == 4) {
                                    o.e(o.this, true);
                                    if (kck.a() && o.a(o.this) != null) {
                                        makeText = Toast.makeText(o.a(o.this).getActivity(), "检测到暂无相关播放场景请求参数，请联系@香瓜进行申请", 1);
                                        makeText.show();
                                    }
                                } else if (c == 5) {
                                    o.e(o.this, true);
                                    if (kck.a() && o.a(o.this) != null) {
                                        makeText = Toast.makeText(o.a(o.this).getActivity(), "当前播控信息验签失败，码流被修改，请联系@良谨进行处理", 1);
                                        makeText.show();
                                    }
                                }
                                ddg ddgVar2 = o.a(o.this).mTlogAdapter;
                                com.taobao.taobaoavsdk.util.c.c(ddgVar2, " DWVideoUrlPickCallBack.onPick## can not startVideo , url empty and exception" + e.getMessage());
                                return;
                            }
                            o.e(o.this, true);
                        }
                        o.this.a("videoPlayMtopError", String.valueOf(20002), StringUtils.isEmpty(str) ? String.valueOf(1) : str);
                        o.a(o.this, "-1", StringUtils.isEmpty(str) ? "" : str);
                        if (o.i(o.this) != null) {
                            o.i(o.this).a(2000, com.taobao.taobaoavsdk.util.b.b(str));
                        }
                        o.a(o.this, false);
                    }
                });
                return;
            }
            try {
                o.this.a(false);
                o.j(o.this);
            } catch (Exception e) {
                ddg ddgVar = o.a(o.this).mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.c(ddgVar, " DWVideoUrlPickCallBack.onPick## setVideoSource error exception:" + e.getMessage());
            }
            o.a(o.this, String.valueOf(0), "");
        }
    }

    private void d(boolean z) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.i == null || (dWContext = this.d) == null) {
        } else {
            if (z && !dWContext.isFloating() && !this.d.isMute() && this.l == DWLifecycleType.MID && (this.d.screenType() != DWVideoScreenType.NORMAL ? this.d.getDWConfigObject().a().m() : this.d.getDWConfigObject().a().l())) {
                if (this.i.getVisibility() != 0) {
                    this.i.setVisibility(0);
                }
                DWContext dWContext2 = this.d;
                if (dWContext2 != null && dWContext2.mDWImageAdapter != null) {
                    this.d.mDWImageAdapter.a(this.d.getDWConfigObject().a().a(), this.i);
                }
                a(this.d, (FrameLayout.LayoutParams) this.i.getLayoutParams());
                this.i.requestLayout();
                return;
            }
            if (this.i.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
            DWContext dWContext3 = this.d;
            if (dWContext3 == null || dWContext3.mDWImageAdapter == null) {
                return;
            }
            this.d.mDWImageAdapter.a((String) null, this.i);
        }
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        DWContext dWContext = this.d;
        if (dWContext == null || dWContext.getActivity() == null || this.e == null || this.d.getDWConfigObject() == null || this.d.getDWConfigObject().a() == null || StringUtils.isEmpty(this.d.getDWConfigObject().a().a()) || this.d.getDWConfigObject().a().b() <= 0 || this.d.getDWConfigObject().a().c() <= 0) {
            return;
        }
        if ((!this.d.getDWConfigObject().a().l() && !this.d.getDWConfigObject().a().m()) || this.d.getDWConfigObject().a().d() <= 0 || this.d.getDWConfigObject().a().e() <= 0) {
            return;
        }
        this.i = new ImageView(this.d.getActivity());
        this.e.addView(this.i, 1, new FrameLayout.LayoutParams(kcl.a(this.d.getActivity(), this.d.getDWConfigObject().a().b()), kcl.a(this.d.getActivity(), this.d.getDWConfigObject().a().c())));
        d(true);
    }

    private void a(DWContext dWContext, FrameLayout.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4419f6", new Object[]{this, dWContext, layoutParams});
        } else if (dWContext == null || layoutParams == null || dWContext.getActivity() == null) {
        } else {
            if (dWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                i = kcl.a(dWContext);
                i2 = kcl.b(dWContext);
            } else if (dWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                i = kcl.b((Context) dWContext.getActivity());
                i2 = kcl.b(dWContext.getActivity());
            } else {
                i = dWContext.mWidth;
                i2 = dWContext.mHeight;
            }
            float g = dWContext.getVideo().g() / dWContext.getVideo().h();
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            if (g > f3) {
                i4 = (int) (f / g);
                i3 = i;
            } else {
                i3 = (int) (f2 * g);
                i4 = i2;
            }
            int b2 = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().b() : dWContext.getDWConfigObject().a().d();
            int c2 = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().c() : dWContext.getDWConfigObject().a().e();
            layoutParams.width = kcl.a(dWContext.getActivity(), b2);
            layoutParams.height = kcl.a(dWContext.getActivity(), c2);
            float h = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().h() : dWContext.getDWConfigObject().a().i();
            float j = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().j() : dWContext.getDWConfigObject().a().k();
            String f4 = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().f() : dWContext.getDWConfigObject().a().g();
            if (h < 0.0f || j < 0.0f || j > 1.0f || h > 1.0f || StringUtils.isEmpty(f4)) {
                layoutParams.rightMargin = dWContext.screenType() == DWVideoScreenType.NORMAL ? kcl.a(dWContext.getActivity(), 10.0f) : kcl.a(dWContext.getActivity(), 15.0f);
                layoutParams.topMargin = dWContext.screenType() == DWVideoScreenType.NORMAL ? kcl.a(dWContext.getActivity(), 10.0f) : kcl.a(dWContext.getActivity(), 15.0f);
                layoutParams.gravity = 53;
            } else if (f4.equalsIgnoreCase("RB")) {
                layoutParams.leftMargin = (int) (i3 * h);
                layoutParams.topMargin = (int) (i4 * j);
                layoutParams.gravity = 51;
            } else if (f4.equalsIgnoreCase("RT")) {
                layoutParams.leftMargin = (int) (i3 * h);
                layoutParams.bottomMargin = (int) (i4 * (1.0f - j));
                layoutParams.gravity = 83;
            } else if (f4.equalsIgnoreCase("LB")) {
                layoutParams.rightMargin = (int) (i3 * (1.0f - h));
                layoutParams.topMargin = (int) (i4 * j);
                layoutParams.gravity = 53;
            } else if (f4.equalsIgnoreCase("LT")) {
                layoutParams.rightMargin = (int) (i3 * (1.0f - h));
                layoutParams.bottomMargin = (int) (i4 * (1.0f - j));
                layoutParams.gravity = 85;
            }
            if (g < f3) {
                int i5 = (i - i3) / 2;
                if ((layoutParams.gravity & 3) == 3) {
                    layoutParams.leftMargin += i5;
                    return;
                } else if ((layoutParams.gravity & 5) != 5) {
                    return;
                } else {
                    layoutParams.rightMargin += i5;
                    return;
                }
            }
            int i6 = (i4 - i2) / 2;
            if ((layoutParams.gravity & 48) == 48) {
                layoutParams.topMargin -= i6;
            } else if ((layoutParams.gravity & 80) != 80) {
            } else {
                layoutParams.bottomMargin -= i6;
            }
        }
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.a(ddeVar);
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.x == 0) {
        } else {
            this.w += System.currentTimeMillis() - this.x;
            this.y = (int) (this.y + (System.currentTimeMillis() - this.x));
            this.x = System.currentTimeMillis();
        }
    }

    public void a(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881e4e63", new Object[]{this, str, new Boolean(z), map});
        } else if (this.d.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.d.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_DISABLE_SWITCH_SCENE, "false"))) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWHPVideoController switchPlayerScene 12003 return by ORANGE_DISABLE_SWITCH_SCENE");
        } else {
            if (str != null) {
                this.F = str;
            } else {
                this.F = "default";
            }
            DWContext dWContext = this.d;
            dWContext.mSwitchScene = this.F;
            dWContext.mSwitchSceneTime = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("switchScene", this.F);
            a(hashMap);
            w();
            HashMap hashMap2 = new HashMap();
            if (this.d.getVideo() != null) {
                hashMap2.put("completeTime", String.valueOf(this.d.getVideo().n()));
                hashMap2.put("playTime", String.valueOf(this.w));
            }
            this.q = true;
            this.u++;
            a(true, (Map<String, String>) hashMap2);
            this.w = 0L;
            this.u = 0;
            this.q = false;
            this.s = kcj.b(this.d.getUserInfoAdapter().a(), this.d.getUserInfoAdapter().b());
            this.t = kcj.b(this.d.getUserInfoAdapter().a(), this.d.getUserInfoAdapter().b());
            a((Map<String, String>) null, z);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        DWContext dWContext = this.d;
        if (dWContext == null) {
            return;
        }
        if (dWContext.mConfigAdapter != null) {
            this.G = com.taobao.taobaoavsdk.util.b.b(this.d.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_PLAYER_CONTROL_SAMPLE_RATE, "10"));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(0));
        hashMap.put("error_code", str);
        hashMap.put("from", this.d.mFrom);
        hashMap.put(MusLiveVideo.ATTR_PLAY_SCENES, this.d.mPlayScenes);
        hashMap.put("play_scenario", String.valueOf(2));
        hashMap.put("errorMsg", str2);
        Map<String, String> playExpUTParams = this.d.getPlayExpUTParams();
        if (playExpUTParams != null) {
            hashMap.put("pctime", String.valueOf(com.taobao.taobaoavsdk.util.b.b(playExpUTParams.get("pctime"))));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if ((str == "0" && ((int) currentTimeMillis) % 10 >= this.G) || this.d.mUTAdapter == null) {
            return;
        }
        this.d.mUTAdapter.a("DWVideo", null, 19997, "pcservice", "", "", hashMap);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.j.a(map);
        }
    }

    public long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue() : this.w;
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.b(f);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.d(z);
    }

    public void a(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cd50c8", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.a(f, f2, i, i2);
    }

    public void a(bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b76d1", new Object[]{this, bbVar});
            return;
        }
        p pVar = this.j;
        if (pVar == null || pVar.e() == null) {
            return;
        }
        this.j.e().a(bbVar);
    }
}

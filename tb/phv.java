package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.c;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import java.util.Map;
import tb.phx;

/* loaded from: classes8.dex */
public class phv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f32655a;
    public ViewGroup b;
    public pkr c;
    public Context d;
    public TBLiveDataModel e;
    public boolean f;
    public long g;
    public boolean h;
    private BaseFrame i;
    private f j;
    private boolean k;
    private AliUrlImageView l;
    private long m;
    private phz o;
    private pia p;
    private com.taobao.alilive.aliliveframework.frame.a q;
    private phx.a r;
    private e s;
    public String t;

    static {
        kge.a(1389456108);
    }

    public static /* synthetic */ BaseFrame a(phv phvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("ae996e14", new Object[]{phvVar}) : phvVar.i;
    }

    public static /* synthetic */ BaseFrame a(phv phvVar, BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("7ba4f66a", new Object[]{phvVar, baseFrame});
        }
        phvVar.i = baseFrame;
        return baseFrame;
    }

    public static /* synthetic */ void a(phv phvVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83371ef3", new Object[]{phvVar, videoInfo});
        } else {
            phvVar.c(videoInfo);
        }
    }

    public static /* synthetic */ void b(phv phvVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893aea52", new Object[]{phvVar, videoInfo});
        } else {
            phvVar.d(videoInfo);
        }
    }

    public phv(a aVar) {
        this.t = null;
        this.f32655a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.j = a.g(aVar);
        this.k = a.h(aVar);
        this.l = a.i(aVar);
        this.q = a.j(aVar);
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.q;
        if (aVar2 != null) {
            this.t = aVar2.G();
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e27dec", new Object[]{this, eVar});
        } else {
            this.s = eVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        phz phzVar = this.o;
        if (phzVar != null) {
            phzVar.g = z;
        }
        pia piaVar = this.p;
        if (piaVar == null) {
            return;
        }
        piaVar.g = z;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.e = tBLiveDataModel;
        if (!aa.aN()) {
            return;
        }
        phz phzVar = this.o;
        if (phzVar != null) {
            phzVar.a(tBLiveDataModel);
        }
        pia piaVar = this.p;
        if (piaVar == null) {
            return;
        }
        piaVar.a(tBLiveDataModel);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.r == null) {
            this.r = new phx.a() { // from class: tb.phv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.phx.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        phv.this.a(str);
                    }
                }

                @Override // tb.phx.a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else {
                        phv.this.h = z;
                    }
                }

                @Override // tb.phx.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        phv.this.d();
                    }
                }

                @Override // tb.phx.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        phv.this.c();
                    }
                }

                @Override // tb.phx.a
                public void a(BaseFrame baseFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d2b08e2", new Object[]{this, baseFrame});
                    } else {
                        phv.a(phv.this, baseFrame);
                    }
                }

                @Override // tb.phx.a
                public BaseFrame c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (BaseFrame) ipChange2.ipc$dispatch("ca5f5ce4", new Object[]{this}) : phv.a(phv.this);
                }
            };
        }
        if (this.o == null) {
            this.o = new phz(this.f32655a, this.b, this.c.m(), this.d, this.e, this.f, this.q, this.r);
        }
        if (this.p == null && (this.f || aa.cH())) {
            this.p = new pia(this.f32655a, this.b, this.c.m(), this.d, this.e, this.f, this.q, this.r);
        }
        if ((this.d instanceof Activity) && aa.cV()) {
            com.taobao.android.autosize.f.a((Activity) this.d);
        } else if (aa.cV() || y.b(this.d)) {
        } else {
            ((Activity) this.d).setRequestedOrientation(1);
        }
    }

    public void a(VideoInfo videoInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f9d83", new Object[]{this, videoInfo, str, str2, str3});
            return;
        }
        b(videoInfo);
        pkr pkrVar = this.c;
        if (pkrVar != null) {
            pkrVar.a(videoInfo, str, str2, str3);
        }
        if (videoInfo.status == 0) {
            m.b("showLive info.status LIVE_STATUS_LIVE " + this.c);
        } else if (videoInfo.status == 3) {
            com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
            if ((aVar instanceof g) && ((g) aVar).u() != null) {
                ((g) this.q).u().h();
            }
            m.b("showLive info.status LIVE_STATUS_PAUSE " + this.c);
            com.taobao.taolive.room.utils.a.a(this.d, this.q);
        }
        f(videoInfo);
    }

    public void e(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23c62e1", new Object[]{this, videoInfo});
        } else if (ad.a(this.q, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            ddw.a().a("com.taobao.taolive.room.live.end.without.replay", null);
        } else {
            b(videoInfo);
            pkr pkrVar = this.c;
            if (pkrVar != null) {
                pkrVar.i();
            }
            f(videoInfo);
        }
    }

    private void f(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d014fd40", new Object[]{this, videoInfo});
            return;
        }
        m.b("showLive info.status " + videoInfo.status);
        if (g()) {
            return;
        }
        if (videoInfo.landScape && !videoInfo.fullScreen && f()) {
            if (this.p == null && aa.dh()) {
                this.p = new pia(this.f32655a, this.b, this.c.m(), this.d, this.e, this.f, this.q, this.r);
            }
            pia piaVar = this.p;
            if (piaVar == null) {
                return;
            }
            piaVar.a(this.r).g().f().c();
            return;
        }
        this.o.a().c();
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.k || u.bb() == 1 || u.bb() == 4;
    }

    public void a(VideoInfo videoInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ab1ff9", new Object[]{this, videoInfo, str, str2});
            return;
        }
        a(ag.CALC_REPLAY_ENTER, videoInfo);
        pkr pkrVar = this.c;
        if (pkrVar != null) {
            pkrVar.a(videoInfo, str, str2);
        }
        if (this.k) {
            return;
        }
        if (videoInfo.landScape && videoInfo.publishCommentsUseMtop && videoInfo.fetchCommentsUseMtop) {
            pia piaVar = this.p;
            if (piaVar != null) {
                piaVar.a(this.r).h().f().c();
            }
            pkr pkrVar2 = this.c;
            if (pkrVar2 == null) {
                return;
            }
            pkrVar2.p();
            return;
        }
        this.o.b().c();
        pkr pkrVar3 = this.c;
        if (pkrVar3 == null) {
            return;
        }
        pkrVar3.a(this.o.e(), videoInfo, str2);
    }

    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
            return;
        }
        a(ag.CALC_PRELIVE_ENTER, videoInfo);
        if (videoInfo == null || videoInfo.broadCaster == null || TextUtils.isEmpty(videoInfo.broadCaster.accountId)) {
            return;
        }
        String b = c.b(videoInfo.broadCaster.accountId);
        if (!TextUtils.isEmpty(videoInfo.broadCaster.accountInfoNewUrl)) {
            b = videoInfo.broadCaster.accountInfoNewUrl;
        }
        ai.c(this.q);
        s.a(this.d, b);
        this.q.e().a("com.taobao.taolive.room.killself", null, this.t);
    }

    public void a(String str) {
        AliUrlImageView aliUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (aliUrlImageView = this.l) == null) {
        } else {
            aliUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.l.setImageUrl(str);
            this.l.setVisibility(0);
        }
    }

    private void a(String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6465f45b", new Object[]{this, str, videoInfo});
        } else if (videoInfo == null) {
        } else {
            this.m = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            int i = videoInfo.roomType;
            if (poy.b(videoInfo, this.q)) {
                i = 13;
            }
            String str2 = "1";
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountType", k.a(videoInfo.broadCaster.type) + "");
                hashMap.put("account_id", videoInfo.broadCaster.accountId);
                hashMap.put(ag.KEY_IS_FANS, videoInfo.broadCaster.follow ? str2 : "0");
            }
            ibt ibtVar = null;
            com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
            if (aVar instanceof com.taobao.taolive.sdk.core.e) {
                ibtVar = ((com.taobao.taolive.sdk.core.e) aVar).y().aJ_().a();
            }
            hashMap.put("feedId", videoInfo.liveId);
            hashMap.put("feed_id", videoInfo.liveId);
            hashMap.put(ag.KEY_FEED_TYPE, videoInfo.type + "");
            if (ibtVar != null) {
                hashMap.put("from", ibtVar.b());
                hashMap.put("livesource", ibtVar.N());
                hashMap.put("trackInfo", ibtVar.c());
            }
            hashMap.put("entrySource", poz.q(n.b(this.q)));
            hashMap.put("roomtype2=", i + "");
            if (!videoInfo.landScape) {
                str2 = "0";
            }
            hashMap.put("landscape", str2);
            hashMap.put("deviceLevel", com.taobao.taolive.room.utils.k.a() + "");
            hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, poy.N(this.q));
            ai.a(this.q, str, (Map<String, String>) hashMap);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VideoInfo a2 = k.a(this.e);
        ibt ibtVar = null;
        com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            ibtVar = ((com.taobao.taolive.sdk.core.e) aVar).y().aJ_().a();
        }
        if (a2 == null || a2.broadCaster == null || !"1".equals(a2.roomStatus)) {
            return;
        }
        int i = a2.roomType;
        if (poy.b(a2, this.q)) {
            i = 13;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.q;
        ai.a(aVar2, ag.CALC_STAY_TIME, "duration=" + ((System.currentTimeMillis() - this.g) / 1000));
        String b = ibtVar != null ? ibtVar.b() : "";
        com.taobao.alilive.aliliveframework.frame.a aVar3 = this.q;
        ai.a(aVar3, "TaoLiveLeave", "from=" + b, "livesource=" + poz.p(n.b(this.q)), "entrySource=" + poz.q(n.b(this.q)), "duration=" + (System.currentTimeMillis() - this.m), "deviceLevel=" + com.taobao.taolive.room.utils.k.a(), "roomtype2=" + i, "feed_id=" + a2.liveId, "feedtype=" + a2.type);
    }

    public void c() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ddw.a().a(xkw.EVENT_GIFT_ROOM_SCREEN_ORIENTATION_CHANGED, "portrait", this.t);
        com.taobao.taolive.room.ui.fanslevel.a.a().e();
        final VideoInfo a2 = k.a(this.e);
        if (a2 == null) {
            return;
        }
        poy.a(false, this.q);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
        if (aVar != null) {
            aVar.b = false;
        }
        if (y.a()) {
            a(false);
        }
        if (aa.bR()) {
            this.j.postDelayed(new Runnable() { // from class: tb.phv.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ddw.a().a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH);
                    ddw.a().a("com.taobao.taolive.room.enable_updown_switch");
                }
            }, 300L);
        }
        pkr pkrVar = this.c;
        if (pkrVar != null) {
            pkrVar.n();
        }
        if (a2.landScape && !this.h) {
            if (aa.bH()) {
                c(false);
            }
            if (aa.bH() && (viewGroup = this.b) != null) {
                viewGroup.post(new Runnable() { // from class: tb.phv.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            phv.a(phv.this, a2);
                        }
                    }
                });
            } else {
                c(a2);
            }
        } else if (y.b(this.d)) {
            d(a2);
        }
        j.n(this.q);
        j.m(this.q);
    }

    public void d() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ddw.a().a(xkw.EVENT_GIFT_ROOM_SCREEN_ORIENTATION_CHANGED, "landscape", this.t);
        com.taobao.taolive.room.ui.fanslevel.a.a().e();
        final VideoInfo a2 = k.a(this.e);
        if (a2 != null) {
            poy.a(true, this.q);
            com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
            if (aVar != null) {
                aVar.b = true;
            }
            if (aa.bR()) {
                ddw.a().a(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH);
                if (y.a() && (y.b(this.d) || y.c(this.d))) {
                    ddw.a().a("com.taobao.taolive.room.enable_updown_switch");
                } else {
                    ddw.a().a("com.taobao.taolive.room.disable_updown_switch");
                }
            }
            if (y.a()) {
                a(true);
            }
            if ((a2.landScape && this.h) || y.e(this.d)) {
                if (aa.bH() && (!aa.cV() || (a2.landScape && this.h))) {
                    c(true);
                }
                if (aa.bH() && (viewGroup = this.b) != null) {
                    viewGroup.post(new Runnable() { // from class: tb.phv.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                phv.b(phv.this, a2);
                            }
                        }
                    });
                } else {
                    d(a2);
                }
                ai.a(this.q, ag.CROSS_SCREEN, new String[0]);
                if (!y.e(this.d)) {
                    ddw.a().a("com.taobao.taolive.room.need_back");
                }
            }
            j.n(this.q);
            j.m(this.q);
        }
        pkr pkrVar = this.c;
        if (pkrVar != null) {
            pkrVar.o();
        }
        pkr pkrVar2 = this.c;
        if (pkrVar2 == null) {
            return;
        }
        pkrVar2.o();
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        poy.a(z, this.q);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
        if (aVar != null) {
            aVar.b = z;
        }
        if (z) {
            if (((Activity) this.d).getRequestedOrientation() != 1) {
                return;
            }
            ((Activity) this.d).setRequestedOrientation(0);
        } else if (((Activity) this.d).getRequestedOrientation() != 0) {
        } else {
            ((Activity) this.d).setRequestedOrientation(1);
        }
    }

    public BaseFrame e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("15876ee6", new Object[]{this}) : this.i;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private BaseFrame f32660a;
        private ViewGroup b;
        private pkr c;
        private Context d;
        private TBLiveDataModel e;
        private boolean f;
        private f g;
        private boolean h;
        private AliUrlImageView i;
        private com.taobao.alilive.aliliveframework.frame.a j;

        static {
            kge.a(59020739);
        }

        public static /* synthetic */ BaseFrame a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("96ec2c37", new Object[]{aVar}) : aVar.f32660a;
        }

        public static /* synthetic */ ViewGroup b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8b92e3d7", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ pkr c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (pkr) ipChange.ipc$dispatch("ed3027f0", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Context d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("eca9bbf8", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ TBLiveDataModel e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("1dfedcee", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e05b3186", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ f g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ce2acc2b", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("94120608", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ AliUrlImageView i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("3b7eee7", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("97fc303b", new Object[]{aVar}) : aVar.j;
        }

        public a a(AliUrlImageView aliUrlImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6c2d1ca1", new Object[]{this, aliUrlImageView});
            }
            this.i = aliUrlImageView;
            return this;
        }

        public a a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b3e4dc9", new Object[]{this, baseFrame});
            }
            this.f32660a = baseFrame;
            return this;
        }

        public a a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae6e3a4", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public a a(pkr pkrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("59e263ea", new Object[]{this, pkrVar});
            }
            this.c = pkrVar;
            return this;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("21e8000b", new Object[]{this, context});
            }
            this.d = context;
            return this;
        }

        public a a(TBLiveDataModel tBLiveDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c74ae8aa", new Object[]{this, tBLiveDataModel});
            }
            this.e = tBLiveDataModel;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("67e1be7f", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6daaa4cb", new Object[]{this, fVar});
            }
            this.g = fVar;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c1bd28c0", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a a(com.taobao.alilive.aliliveframework.frame.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2712bbae", new Object[]{this, aVar});
            }
            this.j = aVar;
            return this;
        }

        public phv a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (phv) ipChange.ipc$dispatch("f092360", new Object[]{this}) : new phv(this);
        }
    }

    private void b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b293c4", new Object[]{this, videoInfo});
            return;
        }
        a(ag.CALC_ENTER, videoInfo);
        f fVar = this.j;
        if (fVar == null) {
            return;
        }
        fVar.sendEmptyMessageDelayed(0, 10000L);
        this.g = System.currentTimeMillis();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
        if (!(aVar instanceof com.taobao.taolive.sdk.core.e)) {
            return;
        }
        ((com.taobao.taolive.sdk.core.e) aVar).D = System.currentTimeMillis();
    }

    private void c(VideoInfo videoInfo) {
        pia piaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468b2e23", new Object[]{this, videoInfo});
            return;
        }
        if ("1".equals(videoInfo.roomStatus)) {
            pia piaVar2 = this.p;
            if (piaVar2 != null) {
                piaVar2.a(this.r).g().f().c();
            }
            com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
            j.a(aVar, aVar.j(), this.e);
        } else if ("2".equals(videoInfo.roomStatus) && (piaVar = this.p) != null) {
            piaVar.a(this.r).h().f().c();
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        e eVar = this.s;
        if (eVar == null || eVar.h() == null) {
            return;
        }
        this.s.f();
    }

    private void d(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7463c882", new Object[]{this, videoInfo});
            return;
        }
        if ("1".equals(videoInfo.roomStatus)) {
            this.o.a().c();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.q;
            j.a(aVar, aVar.j(), this.e);
        } else if ("2".equals(videoInfo.roomStatus)) {
            this.o.b().c();
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        e eVar = this.s;
        if (eVar == null || eVar.h() == null) {
            return;
        }
        this.s.f();
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : !y.a() || !this.f;
    }
}

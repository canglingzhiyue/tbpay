package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.mediaplay.k;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.jam;

/* loaded from: classes5.dex */
public final class sic extends psy implements hnh, jam.a, snz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_NAME = "直播卡";
    private a.b A;
    private final jam B;
    private String C;
    private tdg D;
    private boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final shu f33598a;
    private final jqy b;
    private final sid c;
    private final sih d;
    private final kzl y;
    private final sif z;

    static {
        kge.a(-780508322);
        kge.a(854340662);
        kge.a(-1950082098);
        kge.a(-1848471929);
    }

    public static /* synthetic */ Object ipc$super(sic sicVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1961121033:
                super.onAppear((psw) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1412171593:
                super.aq();
                return null;
            case -1355309186:
                super.onCreateView((psw) objArr[0], (snp) objArr[1]);
                return null;
            case -1294174408:
                super.onDisActive((psw) objArr[0]);
                return null;
            case -1118037008:
                super.onPauseMedia((psw) objArr[0]);
                return null;
            case -893732120:
                super.onActive((psw) objArr[0]);
                return null;
            case -424976904:
                super.onTabSelected();
                return null;
            case -152376096:
                super.cI_();
                return null;
            case -111711657:
                super.onRecycle((psw) objArr[0]);
                return null;
            case 363259313:
                super.onTabUnSelected();
                return null;
            case 504096288:
                super.onBindData((psw) objArr[0], (a) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 707300870:
                super.onStopMedia((psw) objArr[0]);
                return null;
            case 727149820:
                super.onRecyclePlayer((psw) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1342065796:
                super.onStartMedia((psw) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1933403975:
                super.onDisAppear((psw) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.psx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : CARD_NAME;
    }

    @Override // tb.psx
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 2;
    }

    public sic(FluidContext fluidContext) {
        super(fluidContext);
        this.f33598a = new shu(this);
        this.b = new jqy(this);
        this.c = new sid(this);
        this.d = new sih(this);
        this.y = new kzl(fluidContext, this);
        this.z = new sif(this);
        this.B = new jam(this);
        this.D = new tdg(this);
        this.v.a(this);
        this.B.a(this);
    }

    @Override // tb.hnh
    public boolean hook(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ed3d4a", new Object[]{this, pswVar})).booleanValue();
        }
        b.c(((ITrackService) this.e.getService(ITrackService.class)).getActiveCardCommonTrack());
        sme.a(this, this.A.f());
        return false;
    }

    @Override // tb.jam.a
    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54de0d56", new Object[]{this, kVar});
        } else {
            this.b.a(kVar);
        }
    }

    @Override // tb.psx
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : R.layout.fluid_sdk_ly_livevideo_card;
    }

    public jqy cf_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqy) ipChange.ipc$dispatch("609cd071", new Object[]{this}) : this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        a.b bVar = this.A;
        return bVar != null ? bVar.g() : "";
    }

    @Override // tb.psw
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : e();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.C = str;
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.C;
    }

    @Override // tb.psw, tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // tb.psw, tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!H() || !L()) {
            return;
        }
        o();
    }

    @Override // tb.psw, tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        spz.c("LiveVideoCard", "onPause");
        aa();
        this.b.e();
        this.c.a(this);
    }

    @Override // tb.psw, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        super.cI_();
        aa();
        onRecyclePlayer(this, true);
        this.x = false;
    }

    @Override // tb.psw, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        } else {
            super.onCreateView(pswVar, snpVar);
        }
    }

    @Override // tb.psy, tb.psw
    public void aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd3f8b7", new Object[]{this});
            return;
        }
        super.aq();
        S();
    }

    @Override // tb.psw, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            return;
        }
        super.onDisAppear(pswVar);
        aa();
        this.c.a(this);
    }

    @Override // tb.psw, tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            return;
        }
        super.onRecycle(pswVar);
        aa();
        onRecyclePlayer(this, true);
        this.x = false;
    }

    @Override // tb.psw, tb.sne
    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
            return;
        }
        super.onTabSelected();
        if (!H()) {
            return;
        }
        o();
    }

    @Override // tb.psw, tb.sne
    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
            return;
        }
        super.onTabUnSelected();
        aa();
        this.c.a(this);
    }

    public sid g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sid) ipChange.ipc$dispatch("3d34624a", new Object[]{this}) : this.c;
    }

    public a.b h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("24dd62ed", new Object[]{this}) : this.A;
    }

    public kzl k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kzl) ipChange.ipc$dispatch("5bf79597", new Object[]{this}) : this.y;
    }

    public sih l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sih) ipChange.ipc$dispatch("63ac9da1", new Object[]{this}) : this.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.E;
    }

    @Override // tb.psy, tb.psw, tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        super.onBindData(pswVar, aVar, i);
        a.c a2 = aVar.a();
        d.a(this.e, this);
        this.A = a2.D();
        onDataUpdate(this);
        onShowCover(this);
        this.D.a();
    }

    @Override // tb.psw, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        super.onAppear(pswVar);
        this.y.a(System.currentTimeMillis());
        spz.c("tbVideoSdkLiveCard", "doAppear 时间=" + this.y.a());
        onShowCover(this);
    }

    @Override // tb.psw, tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        super.onActive(pswVar);
        X();
        S();
        c(false);
        m();
        W();
    }

    @Override // tb.psw, tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        super.onDisActive(pswVar);
        aa();
        this.y.a(false);
        U();
        if (n()) {
            this.c.a(this);
        }
        this.B.b();
    }

    @Override // tb.psy, tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.onStartMedia(pswVar, z, z2);
        snv a2 = this.c.a();
        if (a2 == null || soi.d(this.e)) {
            return;
        }
        boolean d = g().d();
        boolean e = g().e();
        spz.c("LiveVideoCard", "onStartMedia,直播预热需要移动提前创建的view到cell上，前提条件是：1. 直播预热开启 2. 直播预热成功，mCanUseLivWarmup:" + d + ",mIsLiveWarmUpSuccess:" + e);
        if (d && e) {
            Z();
        } else if (d) {
            spz.c("LiveVideoCard", "onStartMedia,使用了预热功能，但是没有收到预测成功的回调，强制调用startMedia");
            Z();
            Y();
            W();
            return;
        }
        if (sie.a(a2)) {
            return;
        }
        Y();
    }

    private void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
        } else if (this.c.a() == null) {
        } else {
            if (this.c.a().e() == 2) {
                this.c.a().b();
            } else {
                this.c.a().a();
            }
            this.c.a().b(ljm.b(true));
        }
    }

    @Override // tb.psy, tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
            return;
        }
        super.onStopMedia(pswVar);
        if (this.c.a() == null) {
            return;
        }
        this.c.a().c();
    }

    @Override // tb.psy, tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
            return;
        }
        super.onPauseMedia(pswVar);
        if (this.c.a() == null) {
            return;
        }
        this.c.a().c();
        sme.b(this, "pause");
    }

    @Override // tb.psy, tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        super.onRecyclePlayer(pswVar, z);
        this.c.a(this);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.c.a() == null) {
        } else {
            f.b(this.e, this.c.a());
        }
    }

    @Override // tb.psy
    public void a(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c4f948", new Object[]{this, bool, bool2});
        } else {
            this.b.a(bool, bool2);
        }
    }

    @Override // tb.psy
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.c.a() == null || !(map instanceof HashMap)) {
        } else {
            this.c.a().a((HashMap) map);
        }
    }

    @Override // tb.psy
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.c.a() == null) {
        } else {
            this.c.a().b(f);
        }
    }

    public ViewGroup q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9981ae9d", new Object[]{this});
        }
        if (g() != null && g().a() != null) {
            return g().a().f();
        }
        return null;
    }

    private void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        ViewGroup q = q();
        if (q != null) {
            if (!oec.a(q.getTag(R.id.fluid_sdk_live_view_to_decorView), false)) {
                spz.c("LiveVideoCard", "[直播预热]removePreLoadVideoViewToCell,videoView未移动到decorView上，无需重新移动");
                return;
            }
            if (q.getParent() instanceof ViewGroup) {
                ((ViewGroup) q.getParent()).removeView(q);
            }
            spz.c("LiveVideoCard", "removePreLoadVideoViewToCell");
            cf_().a(q, cf_().b());
        }
        this.E = false;
    }

    public jam i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jam) ipChange.ipc$dispatch("4c9378c0", new Object[]{this}) : this.B;
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDisactiveDestroyLive", true);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        spz.c("LiveVideoCard", "requestMediaAndStartPlayer");
        this.b.e();
        S();
        c(false);
        m();
    }

    private void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        W();
        X();
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        a(false);
        g().a(false);
        g().b(false);
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        tdg tdgVar = this.D;
        if (tdgVar == null) {
            return;
        }
        tdgVar.b();
    }
}

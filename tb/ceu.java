package tb;

import android.content.Context;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.cew;

/* loaded from: classes.dex */
public class ceu implements cet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26259a = false;
    private UTABMethod b = UTABMethod.Pull;
    private Set<String> c = K();
    private final Object d = new Object();
    private int e = 120000;

    static {
        kge.a(1670817779);
        kge.a(1856938803);
    }

    private Set<String> K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f3730bc1", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("http://m.taobao.com/channel/act/other/taobao_android");
        hashSet.add("http://m.taobao.com/index.htm");
        hashSet.add("taobao://message/root");
        hashSet.add("http://h5.m.taobao.com/we/index.htm");
        hashSet.add("http://h5.m.taobao.com/awp/base/newcart.htm");
        hashSet.add("http://h5.m.taobao.com/awp/mtb/mtb.htm");
        return hashSet;
    }

    @Override // tb.cet
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            cey.a().b(context);
        }
    }

    @Override // tb.cet
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            cey.a().a(context);
        }
    }

    @Override // tb.cet
    public UTABMethod a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTABMethod) ipChange.ipc$dispatch("d8873ecf", new Object[]{this}) : this.b;
    }

    @Override // tb.cet
    public void a(UTABMethod uTABMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d3a209", new Object[]{this, uTABMethod});
        } else {
            this.b = uTABMethod;
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.f26259a;
    }

    @Override // tb.cet
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f26259a = z;
        }
    }

    @Override // tb.cet
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (J()) {
            return false;
        }
        try {
            return cey.a().f();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isSdkEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().i()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isTrackAutoEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().j()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isTrackAppEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().K()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isTrack1022Enable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().h()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isDataTriggerEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().k()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isStabilityMonitorEnabled", th);
            return false;
        }
    }

    @Override // tb.cet
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().l()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isEvoActivateClientEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().m()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isEvoActivateServerEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().g()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isNavEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        synchronized (this.d) {
            if (this.c.contains(str)) {
                return true;
            }
            try {
                return cey.a().a(str);
            } catch (Throwable th) {
                b.a("ConfigServiceImpl.isNavIgnored", th);
                return false;
            }
        }
    }

    @Override // tb.cet
    public boolean a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed6d4ab", new Object[]{this, l})).booleanValue();
        }
        if (l == null) {
            return false;
        }
        try {
            return cey.a().a(l);
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isTrack1022ExperimentDisabled", th);
            return false;
        }
    }

    @Override // tb.cet
    public boolean b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6fca2c", new Object[]{this, l})).booleanValue();
        }
        if (l == null) {
            return false;
        }
        try {
            return cey.a().b(l);
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isTrack1022GroupDisabled", th);
            return false;
        }
    }

    @Override // tb.cet
    public boolean c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7808bfad", new Object[]{this, l})).booleanValue();
        }
        if (l == null) {
            return false;
        }
        try {
            return cey.a().c(l);
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isTrack1022ExperimentEnabled", th);
            return false;
        }
    }

    @Override // tb.cet
    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        try {
            return cey.a().c();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.getTrack1022IntervalTime", th);
            return cew.a.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
    }

    @Override // tb.cet
    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        try {
            return cey.a().d();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.getRequestExperimentDataIntervalTime", th);
            return cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
        }
    }

    @Override // tb.cet
    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue();
        }
        try {
            return cey.a().e();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.getDownloadExperimentDataDelayTime", th);
            return 60000L;
        }
    }

    @Override // tb.cet
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().n()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isUtPageLifecycleListenerEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        try {
            return cey.a().o();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.getActivatePageTrackHistorySize", th);
            return 10;
        }
    }

    @Override // tb.cet
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        try {
            if (c()) {
                if (cey.a().p()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isNavV2Enabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().q();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isRollbackLastFix", th);
            return false;
        }
    }

    @Override // tb.cet
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().r();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isPreloadLaunchExperiment", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().s();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isRetainExperimentEnabled", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().t();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isClearRetainBeforeRefresh", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().u();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isUrlParseErrorToDp2", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().v();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isClodWorkEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().w();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isAccsWhitelistEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().x();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isAccsBetaEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().y();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isSwitchVariationEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().z();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isLazyLoadEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            return cey.a().b(String.valueOf(j));
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isUnDecodeUrlParamExp", th);
            return false;
        }
    }

    @Override // tb.cet
    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().A();
        } catch (Throwable th) {
            h.c("ConfigServiceImpl", th.getMessage(), th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().B();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isSupportVariationConfig", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().C();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isDropOnInsertFail", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().D();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isParamRegexMatchEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().E();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isAccsGreyEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().F();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isUrlPrefixTrackEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().G();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isPreDecisionEnable", th);
            return false;
        }
    }

    @Override // tb.cet
    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().H();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isDbHitCountEnable", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().I();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isParseDbConfigWhenUsing", th);
            return true;
        }
    }

    @Override // tb.cet
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().J();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isParseDbConfigWhenUsing", th);
            return false;
        }
    }

    @Override // tb.cet
    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        try {
            return cey.a().L();
        } catch (Throwable th) {
            b.a("ConfigServiceImpl.isMtopIndexEnable", th);
            return true;
        }
    }
}
